# Config

`Config` provides a declarative, annotation-driven way to define and resolve application configuration from multiple sources without repeatedly writing environment variable, system property, or properties file handling code.

A class extending `Config` defines a collection of related settings, known as a **configuration**.

```java
@ConfigNamespace("cascara.report")
public class ReporterConfig extends Config {

    @ConfigProperty
    private Level level = Level.INFO;

    @ConfigProperty
    private boolean allowApiOverride = true;
}
```

## Why Config Exists

Traditionally, applications often contain repeated code such as:

```java
String value = System.getProperty("foo");

if (value == null) {
    value = System.getenv("FOO");
}

if (value == null) {
    value = properties.getProperty("foo");
}
```

This logic is duplicated across multiple subsystems, leading to:

- Boilerplate code
- Inconsistent behaviour
- Hard-coded property names
- Complex precedence rules
- Repeated type conversion logic

`Config` centralizes this behaviour once and makes it available everywhere.

---

# Configuration Sources

Each setting can be resolved from multiple sources.

Typical sources include:

1. API overrides
2. System properties (`-D`)
3. Environment variables
4. Configuration files (`.properties`)
5. Default field values

For example:

```java
@ConfigNamespace("cascara.lang")
public class LanguageConfig extends Config {

    @ConfigProperty
    private String locale = "en-GB";
}
```

May be configured through:

```bash
-Dcascara.lang.locale=fr-FR
```

Or:

```bash
CASCARA_LANG_LOCALE=fr-FR
```

Or:

```properties
locale=fr-FR
```

Or:

```properties
cascara.lang.locale=fr-FR
```

Depending on which configuration source is being used.

---

# Configuration Namespaces

A namespace groups related settings together.

```java
@ConfigNamespace("cascara.sec")
public class SecurityConfig extends Config {
}
```

The namespace automatically maps configuration keys to settings.

For example:

```java
@ConfigProperty
private String jarVerifier;
```

Can be loaded from:

```properties
jar-verifier=com.example.Verifier
```

inside:

```text
security.properties
```

or:

```properties
cascara.sec.jar-verifier=com.example.Verifier
```

inside:

```text
cascara.properties
```

No additional code is required.

---

# Configuration Properties

Each configurable value is declared using `@ConfigProperty`.

```java
@ConfigProperty
private boolean verify = true;
```

The field provides:

- The setting name
- The setting type
- The default value
- Configuration metadata

No manual parsing is required.

---

# Type Conversion

Values are automatically converted to the field type.

```java
@ConfigProperty
private boolean verify;

@ConfigProperty
private int maxRetries;

@ConfigProperty
private Level level;
```

Supported types include:

- Primitive types
- Boxed primitive types
- Strings
- Enums
- Collections
- Maps
- Additional framework-supported types

Configuration consumers interact only with strongly typed values.

---

# Map Properties

Map properties support extensible key/value configuration patterns.

```java
@ConfigProperty(name = "provider")
private Map<String,String> preferredProviders;
```

Configuration:

```properties
provider.com.example.Service=FastProvider
provider.com.example.OtherService=SafeProvider
```

Usage:

```java
String provider =
    preferredProviders.get(
        "com.example.Service"
    );
```

This allows arbitrary configuration entries without requiring a dedicated field for every possible key.

Common uses include:

- Reporter class-level settings
- Service provider preferences
- Namespace overrides
- Plugin registration

---

# Limiting Configuration Sources

Individual properties may restrict which sources are allowed.

```java
@ConfigProperty(
    exclude = {
        Source.ENVIRONMENT_VARIABLE
    }
)
private String dottedName;
```

This prevents unsupported or undesirable sources from overriding the value.

For example, dotted names often cannot be represented accurately as environment variables.

---

# Defaults

Every configuration property can define a default value.

```java
@ConfigProperty
private Level level = Level.INFO;
```

If no source provides a value, the default is used automatically.

Defaults remain visible within the codebase and require no additional configuration.

---

# Benefits for Developers

## Less Boilerplate

Developers define settings once.

```java
@ConfigProperty
private boolean verify;
```

No manual lookup code is required.

## Strong Typing

Configuration values are converted directly to the required type.

```java
Level level = config.getLevel();
```

No string parsing is required at every call site.

## Centralized Behaviour

Source resolution, conversion, defaults, and precedence are implemented once instead of repeatedly throughout the project.

## Discoverability

Configuration classes clearly document available settings.

```java
public class ReporterConfig extends Config
```

acts as a self-documenting representation of reporter settings.

## Consistency

Every Cascara subsystem resolves configuration using the same mechanism.

---

# Benefits for Users

## Multiple Configuration Methods

Users can configure applications using whichever mechanism best suits their environment:

- Configuration files
- Environment variables
- System properties
- API configuration

## Predictable Behaviour

All configuration is resolved consistently across the framework.

## Minimal Configuration Files

Dedicated configuration files can omit namespace prefixes.

```properties
level=debug
```

instead of:

```properties
cascara.report.level=debug
```

when using `report.properties`.

## Extensibility

Map-backed settings allow application-specific configuration without modifying Cascara itself.

---

# Example

```java
@ConfigNamespace("cascara.spl")
public class SPLConfig extends Config {

    @ConfigProperty
    private boolean verify;

    @ConfigProperty(name = "policy.require-signed")
    private boolean requireSigned;

    @ConfigProperty(name = "provider")
    private Map<String,String> preferredProviders;
}
```

Configuration:

```properties
verify=true
policy.require-signed=true

provider.com.example.PaymentService=FastPayments
provider.com.example.LoggingService=RemoteLogger
```

Usage:

```java
SPLConfig config = SPLConfig.get();

if (config.isVerifyEnabled()) {
    ...
}
```

No manual parsing, conversion, or source handling is required.

---

# Design Goals

`Config` is designed to:

- Reduce configuration boilerplate.
- Centralize configuration resolution logic.
- Provide strong typing.
- Support multiple configuration sources.
- Support extensible map-based settings.
- Remain easy to understand and debug.
- Make configuration declarations concise and self-documenting.
