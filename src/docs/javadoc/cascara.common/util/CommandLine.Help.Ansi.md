Package [io.github.qishr.cascara.common.util](index.md)

# Enum Ansi
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.util.CommandLine.Help.Ansi](CommandLine.Help.Ansi.md)><br/>
                io.github.qishr.cascara.common.util.CommandLine.Help.Ansi<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final enum __Ansi__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[Ansi](CommandLine.Help.Ansi.md)>
</span>

Provides methods and inner classes to support using ANSI escape codes in usage help messages.


## Nested Class Summary

| Modifier and Type | Class                                                                                           | Description                                    |
|-------------------|-------------------------------------------------------------------------------------------------|------------------------------------------------|
| public            | [io.github.qishr.cascara.common.util.CommandLine.Help.Ansi.Text](CommandLine.Help.Ansi.Text.md) | Encapsulates rich text with styles and colors. |



##Enum Constants

| Enum Constant | Description |
|---------------|-------------|
| [AUTO](#auto) |             |
| [ON](#on)     |             |
| [OFF](#off)   |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                              | Description                                                                                                                                                             |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [Ansi](CommandLine.Help.Ansi.md)[]                                                    | [values](#values)()                                                                                                                                                                                                                                                 |                                                                                                                                                                         |
| public static [Ansi](CommandLine.Help.Ansi.md)                                                      | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                              |                                                                                                                                                                         |
| public boolean                                                                                      | [enabled](#enabled)()                                                                                                                                                                                                                                               | Returns `true` if ANSI escape codes should be emitted, `false` otherwise.                                                                                               |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [text](#text)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)                                                                                                                                        | Returns a new Text object for this Ansi mode, encapsulating the specified string which may contain markup like `@|bg(red),white,underline some text|@`.                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [string](#string)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)                                                                                                                                    | Returns a String where any markup like `@|bg(red),white,underline some text|@` is converted to ANSI escape codes if this Ansi is ON, or suppressed if this Ansi is OFF. |
| public static [Ansi](CommandLine.Help.Ansi.md)                                                      | [valueOf](#valueof)(boolean enabled)                                                                                                                                                                                                                                | Returns Ansi.ON if the specified `enabled` flag is true, Ansi.OFF otherwise.                                                                                            |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [apply](#apply)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) plainText, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> styles) |                                                                                                                                                                         |



## Enum Constant Details

### AUTO

public static final  AUTO




---

### ON

public static final  ON




---

### OFF

public static final  OFF




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [Ansi](CommandLine.Help.Ansi.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [Ansi](CommandLine.Help.Ansi.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### enabled

<span style="font-family: monospace; font-size: 80%;">public boolean __enabled__()</span>

Returns `true` if ANSI escape codes should be emitted, `false` otherwise.

**Returns:**

ON: `true`, OFF: `false`, AUTO: if system property `"picocli.ansi"` has value
      `"tty"` (case-insensitive), then return `true` if either `System.console() != null`
      or picocli guesses the application is running in a pseudo-terminal pty on a Linux emulator in Windows.
      If system property `"picocli.ansi"` has value `"true"` (case-sensitive) then return `true`.
      Otherwise use picocli's Heuristics for Enabling ANSI
      to determine whether the platform supports ANSI escape codes.


---

### text

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __text__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)</span>

Returns a new Text object for this Ansi mode, encapsulating the specified string
which may contain markup like `@|bg(red),white,underline some text|@`.


Calling `toString()` on the returned Text will either include ANSI escape codes
(if this Ansi mode is ON), or suppress ANSI escape codes (if this Ansi mode is OFF).



Equivalent to `this.new Text(stringWithMarkup)`.

**Since:**

3.4

**See Also:**


[text](#text)



---

### string

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __string__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)</span>

Returns a String where any markup like
`@|bg(red),white,underline some text|@` is converted to ANSI escape codes
if this Ansi is ON, or suppressed if this Ansi is OFF.


Equivalent to `this.new Text(stringWithMarkup).toString()`.

**Since:**

3.4

**See Also:**


[string](#string)



---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [Ansi](CommandLine.Help.Ansi.md) __valueOf__(boolean enabled)</span>

Returns Ansi.ON if the specified `enabled` flag is true, Ansi.OFF otherwise.

**Since:**

3.4


---

### apply

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __apply__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) plainText, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> styles)</span>





!!! note "Deprecation"
    use [ColorScheme.apply](#apply) instead


---

