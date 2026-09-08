Package [io.github.qishr.cascara.common.util](index.md)

# Class Layout
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.Layout<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Layout__</span>

Use a Layout to format usage help text for options and parameters in tabular format.

Delegates to the renderers to create [Text](CommandLine.Help.Ansi.Text.md) values for the annotated fields, and uses a
 [TextTable](CommandLine.Help.TextTable.md) to display these values in tabular format. Layout is responsible for deciding which values
 to display where in the table. By default, Layout shows one option or parameter per table row.
 

Customize by overriding the [layout](#layout) method.


## Field Summary

| Modifier and Type            | Field                                   | Description |
|------------------------------|-----------------------------------------|-------------|
| protected final ColorScheme  | [colorScheme](#colorscheme)             |             |
| protected IOptionRenderer    | [optionRenderer](#optionrenderer)       |             |
| protected IParameterRenderer | [parameterRenderer](#parameterrenderer) |             |
| protected final TextTable    | [table](#table)                         |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                     | Description                                                                                                                                        |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| Layout([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, int tableWidth)                                                                                                                                                                                              | Constructs a Layout with the specified color scheme, a new default TextTable, the  default option renderer, and the  default parameter renderer.   |
| Layout([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [TextTable](CommandLine.Help.TextTable.md) textTable)                                                                                                                                                        | Constructs a Layout with the specified color scheme, the specified TextTable, the  default option renderer, and the  default parameter renderer.   |
| Layout([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [TextTable](CommandLine.Help.TextTable.md) textTable, [IOptionRenderer](CommandLine.Help.IOptionRenderer.md) optionRenderer, [IParameterRenderer](CommandLine.Help.IParameterRenderer.md) parameterRenderer) | Constructs a Layout with the specified color scheme, the specified TextTable, the  specified option renderer and the specified parameter renderer. |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                                                                                                    |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public void                                                                                         | [layout](#layout)([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec, [Text](CommandLine.Help.Ansi.Text.md)[][] cellValues)                                                                                                                                                                                       | Copies the specified text values into the correct cells in the [TextTable](CommandLine.Help.TextTable.md).                                                                                                                                                                                                     |
| public void                                                                                         | [addOptions](#addoptions)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)                                                  | Calls [addOption.addOption](#addoption) for all non-hidden Options in the list.                                                                                                                                                                                                                                |
| public void                                                                                         | [addAllOptions](#addalloptions)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)                                            | Calls [addOption.addOption](#addoption) for all Options in the specified list.                                                                                                                                                                                                                                 |
| public void                                                                                         | [addOption](#addoption)([OptionSpec](CommandLine.Model.OptionSpec.md) option, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)                                                                                                                                               | Delegates to the [optionRenderer.optionRenderer](#optionrenderer) of this layout to obtain text values for the specified [OptionSpec](CommandLine.Model.OptionSpec.md), and then calls the [layout.layout](#layout) method to write these text values into the correct cells in the TextTable.                 |
| public void                                                                                         | [addPositionalParameters](#addpositionalparameters)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> params, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)       | Calls [addPositionalParameter.addPositionalParameter](#addpositionalparameter) for all non-hidden Parameters in the list.                                                                                                                                                                                      |
| public void                                                                                         | [addAllPositionalParameters](#addallpositionalparameters)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> params, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer) | Calls [addPositionalParameter.addPositionalParameter](#addpositionalparameter) for all positional parameters in the specified list.                                                                                                                                                                            |
| public void                                                                                         | [addPositionalParameter](#addpositionalparameter)([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) param, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)                                                                                                    | Delegates to the [parameterRenderer.parameterRenderer](#parameterrenderer) of this layout to obtain text values for the specified [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md), and then calls [layout.layout](#layout) to write these text values into the correct cells in the TextTable. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                                                                                                                                                                                                        | Returns the section of the usage help message accumulated in the TextTable owned by this layout.                                                                                                                                                                                                               |
| public [ColorScheme](CommandLine.Help.ColorScheme.md)                                               | [colorScheme](#colorscheme)()                                                                                                                                                                                                                                                                                  | Returns the ColorScheme used to create Text objects in this layout.                                                                                                                                                                                                                                            |
| public [TextTable](CommandLine.Help.TextTable.md)                                                   | [textTable](#texttable)()                                                                                                                                                                                                                                                                                      | Returns the TextTable used in this layout.                                                                                                                                                                                                                                                                     |
| public [IOptionRenderer](CommandLine.Help.IOptionRenderer.md)                                       | [optionRenderer](#optionrenderer)()                                                                                                                                                                                                                                                                            | Returns the IOptionRenderer used to render options to Text before adding this text to the TextTable in this layout.                                                                                                                                                                                            |
| public [IParameterRenderer](CommandLine.Help.IParameterRenderer.md)                                 | [parameterRenderer](#parameterrenderer)()                                                                                                                                                                                                                                                                      | Returns the IParameterRenderer used to render positional params to Text before adding this text to the TextTable in this layout.                                                                                                                                                                               |



## Field Details

### colorScheme

<span style="font-family: monospace; font-size: 80%;">protected final ColorScheme __colorScheme__</span>




---

### optionRenderer

<span style="font-family: monospace; font-size: 80%;">protected IOptionRenderer __optionRenderer__</span>




---

### parameterRenderer

<span style="font-family: monospace; font-size: 80%;">protected IParameterRenderer __parameterRenderer__</span>




---

### table

<span style="font-family: monospace; font-size: 80%;">protected final TextTable __table__</span>




---


## Method Details

### layout

<span style="font-family: monospace; font-size: 80%;">public void __layout__([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec, [Text](CommandLine.Help.Ansi.Text.md)[][] cellValues)</span>

Copies the specified text values into the correct cells in the [TextTable](CommandLine.Help.TextTable.md).This implementation
delegates to TextTable#addRowValues(CommandLine.Help.Ansi.Text...) for each row of values.


Subclasses may override.

**Parameters:**

`argSpec` - the Option or Parameters

`cellValues` - the text values representing the Option/Parameters, to be displayed in tabular form

**Since:**

3.0


---

### addOptions

<span style="font-family: monospace; font-size: 80%;">public void __addOptions__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Calls [addOption.addOption](#addoption) for all non-hidden Options in the list.

**Parameters:**

`options` - options to add usage descriptions for

`paramLabelRenderer` - object that knows how to render option parameters

**Since:**

3.0


---

### addAllOptions

<span style="font-family: monospace; font-size: 80%;">public void __addAllOptions__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Calls [addOption.addOption](#addoption) for all Options in the specified list.

**Parameters:**

`options` - options to add usage descriptions for;
                it is the responsibility of the caller to exclude options that should not be shown

`paramLabelRenderer` - object that knows how to render option parameters

**Since:**

4.4


---

### addOption

<span style="font-family: monospace; font-size: 80%;">public void __addOption__([OptionSpec](CommandLine.Model.OptionSpec.md) option, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Delegates to the [optionRenderer.optionRenderer](#optionrenderer) of this layout to obtain
text values for the specified [OptionSpec](CommandLine.Model.OptionSpec.md), and then calls the [layout.layout](#layout)
method to write these text values into the correct cells in the TextTable.

**Parameters:**

`option` - the option argument

`paramLabelRenderer` - knows how to render option parameters

**Since:**

3.0


---

### addPositionalParameters

<span style="font-family: monospace; font-size: 80%;">public void __addPositionalParameters__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> params, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Calls [addPositionalParameter.addPositionalParameter](#addpositionalparameter) for all non-hidden Parameters in the list.

**Parameters:**

`params` - positional parameters to add usage descriptions for

`paramLabelRenderer` - knows how to render option parameters

**Since:**

3.0


---

### addAllPositionalParameters

<span style="font-family: monospace; font-size: 80%;">public void __addAllPositionalParameters__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> params, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Calls [addPositionalParameter.addPositionalParameter](#addpositionalparameter) for all positional parameters in the specified list.

**Parameters:**

`params` - positional parameters to add usage descriptions for;
               it is the responsibility of the caller to exclude positional parameters that should not be shown

`paramLabelRenderer` - knows how to render option parameters

**Since:**

4.4


---

### addPositionalParameter

<span style="font-family: monospace; font-size: 80%;">public void __addPositionalParameter__([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) param, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Delegates to the [parameterRenderer.parameterRenderer](#parameterrenderer) of this layout
to obtain text values for the specified [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md), and then calls
[layout.layout](#layout) to write these text values into the correct cells in the TextTable.

**Parameters:**

`param` - the positional parameter

`paramLabelRenderer` - knows how to render option parameters

**Since:**

3.0


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns the section of the usage help message accumulated in the TextTable owned by this layout.

**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### colorScheme

<span style="font-family: monospace; font-size: 80%;">public [ColorScheme](CommandLine.Help.ColorScheme.md) __colorScheme__()</span>

Returns the ColorScheme used to create Text objects in this layout.

**Since:**

4.6


---

### textTable

<span style="font-family: monospace; font-size: 80%;">public [TextTable](CommandLine.Help.TextTable.md) __textTable__()</span>

Returns the TextTable used in this layout.

**Since:**

4.6


---

### optionRenderer

<span style="font-family: monospace; font-size: 80%;">public [IOptionRenderer](CommandLine.Help.IOptionRenderer.md) __optionRenderer__()</span>

Returns the IOptionRenderer used to render options to Text before adding this text to the TextTable in this layout.

**Since:**

4.6


---

### parameterRenderer

<span style="font-family: monospace; font-size: 80%;">public [IParameterRenderer](CommandLine.Help.IParameterRenderer.md) __parameterRenderer__()</span>

Returns the IParameterRenderer used to render positional params to Text before adding this text to the TextTable in this layout.

**Since:**

4.6


---

