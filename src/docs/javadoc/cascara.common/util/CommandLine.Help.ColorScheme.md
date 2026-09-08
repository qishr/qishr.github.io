Package [io.github.qishr.cascara.common.util](index.md)

# Class ColorScheme
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.ColorScheme<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __ColorScheme__</span>

All usage help message are generated with a color scheme that assigns certain styles and colors to common
 parts of a usage message: the command name, options, positional parameters and option parameters.Users may customize these styles by creating Help with a custom color scheme.
 

Note that these options and styles may not be rendered if ANSI escape codes are not
 enabled.
 

From 4.0, instances of this class are immutable.


## Nested Class Summary

| Modifier and Type | Class                                                                                                               | Description                                      |
|-------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Help.ColorScheme.Builder](CommandLine.Help.ColorScheme.Builder.md) | Builder class to create `ColorScheme` instances. |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                      | Method                                                                                                                                                                                                                                                              | Description                                                                                                                                                                                                                                                                                                                      |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [commandText](#commandtext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) command)                                                                                                                                   | Returns a Text with all command styles applied to the specified command string.                                                                                                                                                                                                                                                  |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [optionText](#optiontext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) option)                                                                                                                                      | Returns a Text with all option styles applied to the specified option string.                                                                                                                                                                                                                                                    |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [parameterText](#parametertext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)                                                                                                                             | Returns a Text with all parameter styles applied to the specified parameter string.                                                                                                                                                                                                                                              |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [optionParamText](#optionparamtext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionParam)                                                                                                                       | Returns a Text with all optionParam styles applied to the specified optionParam string.                                                                                                                                                                                                                                          |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [errorText](#errortext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) error)                                                                                                                                         | Returns a Text with all error styles applied to the specified error string.                                                                                                                                                                                                                                                      |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [stackTraceText](#stacktracetext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stackTrace)                                                                                                                          | Returns a Text with all stackTrace styles applied to all lines in the specified stackTrace string.                                                                                                                                                                                                                               |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [stackTraceText](#stacktracetext)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)                                                                                                                             | Returns a Text with all stackTrace styles applied to all lines in the stack trace of the specified Throwable.                                                                                                                                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                    | [richStackTraceString](#richstacktracestring)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)                                                                                                                 | Returns a String with the [errorStyles.errorStyles](#errorstyles) applied to the stack trace lines showing the  throwable class name and error message (including "Caused by:..." lines), and the [stackTraceStyles.stackTraceStyles](#stacktracestyles)  applied to the remaining stack trace of lines the specified Throwable. |
| public [Ansi](CommandLine.Help.Ansi.md)                                                                                                                                                                                                | [ansi](#ansi)()                                                                                                                                                                                                                                                     | Returns the `Ansi` setting of this color scheme.                                                                                                                                                                                                                                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [commandStyles](#commandstyles)()                                                                                                                                                                                                                                   | Returns the registered styles for commands in this color scheme.                                                                                                                                                                                                                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [optionStyles](#optionstyles)()                                                                                                                                                                                                                                     | Returns the registered styles for options in this color scheme.                                                                                                                                                                                                                                                                  |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [parameterStyles](#parameterstyles)()                                                                                                                                                                                                                               | Returns the registered styles for positional parameters in this color scheme.                                                                                                                                                                                                                                                    |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [optionParamStyles](#optionparamstyles)()                                                                                                                                                                                                                           | Returns the registered styles for option parameters in this color scheme.                                                                                                                                                                                                                                                        |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [errorStyles](#errorstyles)()                                                                                                                                                                                                                                       | Returns the registered styles for errors in this color scheme.                                                                                                                                                                                                                                                                   |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [stackTraceStyles](#stacktracestyles)()                                                                                                                                                                                                                             | Returns the registered styles for stack traces in this color scheme.                                                                                                                                                                                                                                                             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IStyle](CommandLine.Help.Ansi.IStyle.md)> | [customMarkupMap](#custommarkupmap)()                                                                                                                                                                                                                               | Returns the custom mapping from markup names (the names of the [Style](../data/TextualTable.Style.md) enum constants, like bold, italic, fg_blue, bg_green, etc) to [IStyle](CommandLine.Help.Ansi.IStyle.md) objects in this color scheme.                                                                                      |
| public [IStyle](CommandLine.Help.Ansi.IStyle.md)[]                                                                                                                                                                                     | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commaSeparatedCodes)                                                                                                                                   | Converts the specified markup styles to an array of [IStyle](CommandLine.Help.Ansi.IStyle.md) objects.                                                                                                                                                                                                                           |
| public [IStyle](CommandLine.Help.Ansi.IStyle.md)                                                                                                                                                                                       | [resetStyle](#resetstyle)()                                                                                                                                                                                                                                         | Returns the style that "resets" the style state to neutral.                                                                                                                                                                                                                                                                      |
| public boolean                                                                                                                                                                                                                         | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)                                                                                                                                                 |                                                                                                                                                                                                                                                                                                                                  |
| public int                                                                                                                                                                                                                             | [hashCode](#hashcode)()                                                                                                                                                                                                                                             |                                                                                                                                                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                    | [toString](#tostring)()                                                                                                                                                                                                                                             |                                                                                                                                                                                                                                                                                                                                  |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [apply](#apply)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) plainText, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> styles) | Returns a new Text object where all the specified styles are applied to the full length of the specified plain text.                                                                                                                                                                                                             |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                                           | [text](#text)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)                                                                                                                                        | Returns a new Text object for this ColorScheme, encapsulating the specified string which may contain markup like `@|bg(red),white,underline some text|@`.                                                                                                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                    | [string](#string)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)                                                                                                                                    | Returns a String where any markup like `@|bg(red),white,underline some text|@` is [ColorScheme.parse](#parse) to the styles defined in this ColorScheme (if its Ansi mode is ON), or to the plain text without the markup (if this ColorScheme's Ansi mode is OFF).                                                              |



## Method Details

### commandText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __commandText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) command)</span>

Returns a Text with all command styles applied to the specified command string.

**Parameters:**

`command` - the command string to apply the registered command styles to

**Returns:**

a Text with all command styles applied to the specified command string


---

### optionText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __optionText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) option)</span>

Returns a Text with all option styles applied to the specified option string.

**Parameters:**

`option` - the option string to apply the registered option styles to

**Returns:**

a Text with all option styles applied to the specified option string


---

### parameterText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __parameterText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>

Returns a Text with all parameter styles applied to the specified parameter string.

**Parameters:**

`parameter` - the parameter string to apply the registered parameter styles to

**Returns:**

a Text with all parameter styles applied to the specified parameter string


---

### optionParamText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __optionParamText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionParam)</span>

Returns a Text with all optionParam styles applied to the specified optionParam string.

**Parameters:**

`optionParam` - the option parameter string to apply the registered option parameter styles to

**Returns:**

a Text with all option parameter styles applied to the specified option parameter string


---

### errorText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __errorText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) error)</span>

Returns a Text with all error styles applied to the specified error string.

**Parameters:**

`error` - the error string to apply the registered error styles to

**Returns:**

a Text with all error styles applied to the specified error string

**Since:**

4.3


---

### stackTraceText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __stackTraceText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stackTrace)</span>

Returns a Text with all stackTrace styles applied to all lines in the specified stackTrace string.

**Parameters:**

`stackTrace` - the stack trace string to apply the registered stack trace styles to

**Returns:**

a Text with all stack trace styles applied to the specified stack trace string

**Since:**

4.3


---

### stackTraceText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __stackTraceText__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>

Returns a Text with all stackTrace styles applied to all lines in the stack trace of the specified Throwable.

**Parameters:**

`t` - the Throwable whose stack trace string to apply the registered stack trace styles to

**Returns:**

a Text with all stack trace styles applied to the stack trace of the specified Throwable

**Since:**

4.5


---

### richStackTraceString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __richStackTraceString__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>

Returns a String with the [errorStyles.errorStyles](#errorstyles) applied to the stack trace lines showing the
 throwable class name and error message (including "Caused by:..." lines), and the [stackTraceStyles.stackTraceStyles](#stacktracestyles)
 applied to the remaining stack trace of lines the specified Throwable.

**Parameters:**

`t` - the Throwable whose stack trace string to apply the error and stack trace styles to

**Returns:**

a String with error and stack trace styles applied to the stack trace of the specified Throwable

**Since:**

4.5


---

### ansi

<span style="font-family: monospace; font-size: 80%;">public [Ansi](CommandLine.Help.Ansi.md) __ansi__()</span>

Returns the `Ansi` setting of this color scheme.


---

### commandStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __commandStyles__()</span>

Returns the registered styles for commands in this color scheme.

**Since:**

4.0


---

### optionStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __optionStyles__()</span>

Returns the registered styles for options in this color scheme.

**Since:**

4.0


---

### parameterStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __parameterStyles__()</span>

Returns the registered styles for positional parameters in this color scheme.

**Since:**

4.0


---

### optionParamStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __optionParamStyles__()</span>

Returns the registered styles for option parameters in this color scheme.

**Since:**

4.0


---

### errorStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __errorStyles__()</span>

Returns the registered styles for errors in this color scheme.

**Since:**

4.3


---

### stackTraceStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __stackTraceStyles__()</span>

Returns the registered styles for stack traces in this color scheme.

**Since:**

4.3


---

### customMarkupMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IStyle](CommandLine.Help.Ansi.IStyle.md)> __customMarkupMap__()</span>

Returns the custom mapping from markup names (the names of the [Style](../data/TextualTable.Style.md) enum constants, like bold, italic, fg_blue, bg_green, etc) to [IStyle](CommandLine.Help.Ansi.IStyle.md) objects in this color scheme.By default this returns an empty map, unless a custom map was configured.

**Since:**

4.2


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [IStyle](CommandLine.Help.Ansi.IStyle.md)[] __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commaSeparatedCodes)</span>

Converts the specified markup styles to an array of [IStyle](CommandLine.Help.Ansi.IStyle.md) objects.If no [customMarkupMap.customMarkupMap](#custommarkupmap) is specified, this method delegates to [Style.parse](#parse),
 otherwise it returns the styles found in the custom mapping for the specified markup styles.

**Parameters:**

`commaSeparatedCodes` - a string with a comma-separated list of markup styles (for example, `"bold,underline,bg_red"`

**Since:**

4.2


---

### resetStyle

<span style="font-family: monospace; font-size: 80%;">public [IStyle](CommandLine.Help.Ansi.IStyle.md) __resetStyle__()</span>

Returns the style that "resets" the style state to neutral.

**Returns:**

Style#reset if no [customMarkupMap.customMarkupMap](#custommarkupmap) is defined, otherwise either the style registered with the "reset" name or an empty `IStyle` if no such style is registered.

**Since:**

4.2


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### apply

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __apply__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) plainText, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> styles)</span>

Returns a new Text object where all the specified styles are applied to the full length of the
specified plain text.

**Parameters:**

`plainText` - the string to apply all styles to. Must not contain markup!

`styles` - the styles to apply to the full plain text

**Returns:**

a new Text object

**Since:**

4.2


---

### text

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __text__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)</span>

Returns a new Text object for this ColorScheme, encapsulating the specified string
which may contain markup like `@|bg(red),white,underline some text|@`.


Calling `toString()` on the returned Text will [ColorScheme.parse](#parse)
the markup to the styles defined in this ColorScheme
(if its Ansi mode is ON), or to the plain text without the markup (if this ColorScheme's Ansi mode is OFF).



Equivalent to `this.ansi().new Text(stringWithMarkup, this)`.

**Since:**

4.2

**See Also:**


[text](#text)



---

### string

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __string__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) stringWithMarkup)</span>

Returns a String where any markup like
`@|bg(red),white,underline some text|@` is [ColorScheme.parse](#parse) to the styles defined in this ColorScheme
(if its Ansi mode is ON), or to the plain text without the markup (if this ColorScheme's Ansi mode is OFF).


Equivalent to `this.ansi().new Text(stringWithMarkup, this).toString()`.

**Since:**

4.2

**See Also:**


[string](#string)



---

