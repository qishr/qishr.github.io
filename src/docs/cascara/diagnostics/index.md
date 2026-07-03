# Diagnostics

Cascara uses a unified diagnostic system throughout its architecture — from the tokenizer and parser, through schema validation, to the service provider layer. Rather than a mix of unchecked exceptions, `System.err` calls, and logging frameworks, every component reports problems through the same `Reporter` interface, giving you consistent control over how errors and warnings surface in your application.

### Diagnostic Codes

Every problem Cascara can report has a [`DiagnosticCode`](/javadoc/cascara.common/diagnostic/code/DiagnosticCode) — a stable, typed identifier that carries both a machine-readable code string and a human-readable message template. Codes are organised by subsystem:

- `LangDiagnosticCode` — parser and tokenizer problems
- `ServiceDiagnosticCode` — service provider layer problems
- `FileDiagnosticCode`, `HttpDiagnosticCode`, `DnsDiagnosticCode`, `InetDiagnosticCode` — I/O problems
- `GenericDiagnosticCode` — general-purpose codes

Because codes are typed rather than free-form strings, they can be used for localization, filtering, and documentation lookup without string matching. You can define your own codes for custom modules by implementing `DiagnosticCode`.

### Diagnostic

A `Diagnostic` is the unit of information produced when something noteworthy happens. It captures:

- The severity level (`ERROR`, `WARN`, `INFO`, `DEBUG`, `TRACE`)
- A formatted message, resolved from the `DiagnosticCode` and any detail arguments
- Source location, when available — URI, line, column, and character offsets
- The subsystem that produced it
- The thread name and timestamp at the moment it was created
- An optional underlying `Throwable` cause

Source location information is particularly useful for parser diagnostics, where a problem can be pinpointed to an exact position in the input.

### Reporter

`Reporter` is the interface through which all diagnostics flow. Components that can produce diagnostics accept a `Reporter` in their constructor or via a factory — if none is provided, a `NoOpReporter` is used, which silently discards everything.

Cascara provides four implementations out of the box:

**`NoOpReporter`** silently discards all diagnostics. Useful as a default when you don't care about internal events, or as a placeholder during testing.

**`StandardReporter`** writes formatted diagnostics to `System.out` / `System.err`, with source location included when available. Suitable for command-line tools and simple applications.

**`GlobalReporter`** is a singleton reporter with per-class instances that all delegate to a single global configuration. Useful when you want consistent diagnostic output across a large application without threading a `Reporter` instance through every call site:

```java
GlobalReporter.globalInstance().setLevel(Diagnostic.Level.DEBUG);
Reporter reporter = GlobalReporter.forClass(MyClass.class);
```

**`SilentCollectingReporter`** suppresses all console output but routes diagnostics to a callback, and signals to components using it that they should collect problems rather than throw exceptions. This is the right choice when you want non-throwing validation or want to aggregate diagnostics for display in a UI:

```java
SilentCollectingReporter reporter = new SilentCollectingReporter();
reporter.setDiagnosticCollector(diagnostic -> {
    System.err.println(diagnostic.getMessage());
});
```

### Localizable Exceptions

When a component has no reporter and encounters a fatal problem, it throws a `LocalizableException` (checked) or `LocalizableRuntimeException` (unchecked). Both carry a `DiagnosticCode` rather than a raw string, so their messages can be localized. Error messages are formatted in English by default — to provide localized messages, implement [`DiagnosticLocalizer`](/javadoc/cascara.common/diagnostic/DiagnosticLocalizer) and install it via `LocalizableException.setLocalizer()` and `LocalizableRuntimeException.setLocalizer()`.

`LocatableException` extends `LocalizableRuntimeException` for parser errors that can be pinpointed to a specific line and column in the source input.

`LocalizableIOException` extends `LocalizableException` for I/O errors, keeping them as checked exceptions where the compiler can enforce handling.

### Controlling Reporter Behaviour

All reporters built on `AbstractReporter` share a common set of controls:

```java
reporter
    .setLevel(Diagnostic.Level.WARN)        // suppress DEBUG and TRACE
    .setDiagnosticCollector(d -> { ... })   // receive every diagnostic at or above level
    .setProblemCollector(d -> { ... })      // receive only ERROR, WARN, and INFO
    .setPrintStackTrace(true)               // print stack traces for ERROR diagnostics
    .setDisableSystemOutput(true);          // suppress console output entirely
```

The distinction between `setDiagnosticCollector` and `setProblemCollector` is worth noting: the diagnostic collector fires for everything at or above the configured level (including `DEBUG` and `TRACE` if the level is set low enough), while the problem collector fires only for `ERROR`, `WARN`, and `INFO` regardless of the level setting — useful when you want to capture actionable problems separately from verbose trace output.
