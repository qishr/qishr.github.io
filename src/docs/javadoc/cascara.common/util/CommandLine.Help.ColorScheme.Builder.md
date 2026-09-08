Package [io.github.qishr.cascara.common.util](index.md)

# Class Builder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.ColorScheme.Builder<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help.ColorScheme](CommandLine.Help.ColorScheme.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Builder__</span>

Builder class to create `ColorScheme` instances.


## Constructor Summary

| Constructor                                                      | Description                                                                                   |
|------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| Builder()                                                        | Constructs an empty color scheme builder with Ansi.AUTO.                                      |
| Builder([Ansi](CommandLine.Help.Ansi.md) ansi)                   | Constructs an empty color scheme builder with the specified Ansi value.                       |
| Builder([ColorScheme](CommandLine.Help.ColorScheme.md) existing) | Constructs a color scheme builder with all attributes copied from the specified color scheme. |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                      | Method                                                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                 |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [Ansi](CommandLine.Help.Ansi.md)                                                                                                                                                                                                | [ansi](#ansi)()                                                                                                                                                                                                                                                               | Returns the `Ansi` setting of this color scheme builder.                                                                                                                                                                                    |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [ansi](#ansi)([Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                          | Set the `Ansi` setting of this color scheme builder.                                                                                                                                                                                        |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [commandStyles](#commandstyles)()                                                                                                                                                                                                                                             | Returns the registered styles for commands in this color scheme builder.                                                                                                                                                                    |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [optionStyles](#optionstyles)()                                                                                                                                                                                                                                               | Returns the registered styles for options in this color scheme builder.                                                                                                                                                                     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [parameterStyles](#parameterstyles)()                                                                                                                                                                                                                                         | Returns the registered styles for positional parameters in this color scheme builder.                                                                                                                                                       |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [optionParamStyles](#optionparamstyles)()                                                                                                                                                                                                                                     | Returns the registered styles for option parameters in this color scheme builder.                                                                                                                                                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [errorStyles](#errorstyles)()                                                                                                                                                                                                                                                 | Returns the registered styles for errors in this color scheme builder.                                                                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)>                                                                                             | [stackTraceStyles](#stacktracestyles)()                                                                                                                                                                                                                                       | Returns the registered styles for stack traces in this color scheme builder.                                                                                                                                                                |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IStyle](CommandLine.Help.Ansi.IStyle.md)> | [customMarkupMap](#custommarkupmap)()                                                                                                                                                                                                                                         | Returns the custom mapping from markup names (the names of the [Style](../data/TextualTable.Style.md) enum constants, like bold, italic, fg_blue, bg_green, etc) to [IStyle](CommandLine.Help.Ansi.IStyle.md) objects in this color scheme. |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [customMarkupMap](#custommarkupmap)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IStyle](CommandLine.Help.Ansi.IStyle.md)> newValue) | Sets the custom mapping from markup names (the names of the [Style](../data/TextualTable.Style.md) enum constants, like bold, italic, fg_blue, bg_green, etc) to [IStyle](CommandLine.Help.Ansi.IStyle.md) objects in this color scheme.    |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [commands](#commands)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                                                                                                                                                     | Adds the specified styles to the registered styles for commands in this color scheme builder and returns this builder.                                                                                                                      |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [options](#options)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                                                                                                                                                       | Adds the specified styles to the registered styles for options in this color scheme and returns this color scheme.                                                                                                                          |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [parameters](#parameters)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                                                                                                                                                 | Adds the specified styles to the registered styles for positional parameters in this color scheme builder and returns this builder.                                                                                                         |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [optionParams](#optionparams)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                                                                                                                                             | Adds the specified styles to the registered styles for option parameters in this color scheme builder and returns this builder.                                                                                                             |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [errors](#errors)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                                                                                                                                                         | Adds the specified styles to the registered styles for errors in this color scheme builder and returns this builder.                                                                                                                        |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [stackTraces](#stacktraces)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                                                                                                                                               | Adds the specified styles to the registered styles for stack traces in this color scheme builder and returns this builder.                                                                                                                  |
| public [Builder](CommandLine.Help.ColorScheme.Builder.md)                                                                                                                                                                              | [applySystemProperties](#applysystemproperties)()                                                                                                                                                                                                                             | Replaces colors and styles in this scheme builder with ones specified in system properties, and returns this builder.                                                                                                                       |
| public [ColorScheme](CommandLine.Help.ColorScheme.md)                                                                                                                                                                                  | [build](#build)()                                                                                                                                                                                                                                                             | Creates and returns a new `ColorScheme` with the values configured on this builder.                                                                                                                                                         |



## Method Details

### ansi

<span style="font-family: monospace; font-size: 80%;">public [Ansi](CommandLine.Help.Ansi.md) __ansi__()</span>

Returns the `Ansi` setting of this color scheme builder.


---

### ansi

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __ansi__([Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Set the `Ansi` setting of this color scheme builder.


---

### commandStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __commandStyles__()</span>

Returns the registered styles for commands in this color scheme builder.


---

### optionStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __optionStyles__()</span>

Returns the registered styles for options in this color scheme builder.


---

### parameterStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __parameterStyles__()</span>

Returns the registered styles for positional parameters in this color scheme builder.


---

### optionParamStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __optionParamStyles__()</span>

Returns the registered styles for option parameters in this color scheme builder.


---

### errorStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __errorStyles__()</span>

Returns the registered styles for errors in this color scheme builder.

**Since:**

4.3


---

### stackTraceStyles

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> __stackTraceStyles__()</span>

Returns the registered styles for stack traces in this color scheme builder.

**Since:**

4.3


---

### customMarkupMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IStyle](CommandLine.Help.Ansi.IStyle.md)> __customMarkupMap__()</span>

Returns the custom mapping from markup names (the names of the [Style](../data/TextualTable.Style.md) enum constants, like bold, italic, fg_blue, bg_green, etc) to [IStyle](CommandLine.Help.Ansi.IStyle.md) objects in this color scheme.By default this returns `null`, unless a custom map was configured.

**Since:**

4.2


---

### customMarkupMap

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __customMarkupMap__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IStyle](CommandLine.Help.Ansi.IStyle.md)> newValue)</span>

Sets the custom mapping from markup names (the names of the [Style](../data/TextualTable.Style.md) enum constants, like bold, italic, fg_blue, bg_green, etc) to [IStyle](CommandLine.Help.Ansi.IStyle.md) objects in this color scheme.

**Returns:**

this color scheme builder to enable method chaining for a more fluent API

**Since:**

4.2


---

### commands

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __commands__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Adds the specified styles to the registered styles for commands in this color scheme builder and returns this builder.

**Parameters:**

`styles` - the styles to add to the registered styles for commands in this color scheme builder

**Returns:**

this color scheme builder to enable method chaining for a more fluent API


---

### options

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __options__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Adds the specified styles to the registered styles for options in this color scheme and returns this color scheme.

**Parameters:**

`styles` - the styles to add to registered the styles for options in this color scheme builder

**Returns:**

this color scheme builder to enable method chaining for a more fluent API


---

### parameters

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __parameters__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Adds the specified styles to the registered styles for positional parameters in this color scheme builder and returns this builder.

**Parameters:**

`styles` - the styles to add to registered the styles for parameters in this color scheme builder

**Returns:**

this color scheme builder to enable method chaining for a more fluent API


---

### optionParams

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __optionParams__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Adds the specified styles to the registered styles for option parameters in this color scheme builder and returns this builder.

**Parameters:**

`styles` - the styles to add to the registered styles for option parameters in this color scheme builder

**Returns:**

this color scheme builder to enable method chaining for a more fluent API


---

### errors

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __errors__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Adds the specified styles to the registered styles for errors in this color scheme builder and returns this builder.

**Parameters:**

`styles` - the styles to add to the registered styles for errors in this color scheme builder

**Returns:**

this color scheme builder to enable method chaining for a more fluent API

**Since:**

4.3


---

### stackTraces

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __stackTraces__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Adds the specified styles to the registered styles for stack traces in this color scheme builder and returns this builder.

**Parameters:**

`styles` - the styles to add to the registered styles for stack traces in this color scheme builder

**Returns:**

this color scheme builder to enable method chaining for a more fluent API

**Since:**

4.3


---

### applySystemProperties

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Help.ColorScheme.Builder.md) __applySystemProperties__()</span>

Replaces colors and styles in this scheme builder with ones specified in system properties, and returns this builder.Supported property names:
     `picocli.color.commands`
     `picocli.color.options`
     `picocli.color.parameters`
     `picocli.color.optionParams`
     `picocli.color.errors`
     `picocli.color.stackTraces`
 

Property values can be anything that Help.Ansi.Style#parse(String) can handle.

**Returns:**

this ColorScheme builder


---

### build

<span style="font-family: monospace; font-size: 80%;">public [ColorScheme](CommandLine.Help.ColorScheme.md) __build__()</span>

Creates and returns a new `ColorScheme` with the values configured on this builder.


---

