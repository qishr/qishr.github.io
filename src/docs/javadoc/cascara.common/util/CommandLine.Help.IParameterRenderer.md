Package [io.github.qishr.cascara.common.util](index.md)

# Interface IParameterRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.IParameterRenderer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IParameterRenderer__</span>

When customizing online help for [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) details, a custom `IParameterRenderer`
 can be used to create textual representation of a Parameters field in a tabular format: one or more rows,
 each containing one or more columns.The [Layout](CommandLine.Help.Layout.md) is responsible for placing these text
 values in the [TextTable](CommandLine.Help.TextTable.md).


## Method Summary

| Modifier and Type                                         | Method                                                                                                                                                                                                                                 | Description                                                          |
|-----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| public abstract [Text](CommandLine.Help.Ansi.Text.md)[][] | [render](#render)([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) param, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) parameterLabelRenderer, [ColorScheme](CommandLine.Help.ColorScheme.md) scheme) | Returns a text representation of the specified positional parameter. |



## Method Details

### render

<span style="font-family: monospace; font-size: 80%;">public abstract [Text](CommandLine.Help.Ansi.Text.md)[][] __render__([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) param, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) parameterLabelRenderer, [ColorScheme](CommandLine.Help.ColorScheme.md) scheme)</span>

Returns a text representation of the specified positional parameter.

**Parameters:**

`param` - the positional parameter to show online usage help for

`parameterLabelRenderer` - responsible for rendering parameter labels to text

`scheme` - color scheme for applying ansi color styles to positional parameters

**Returns:**

a 2-dimensional array of text values: one or more rows, each containing one or more columns

**Since:**

3.0


---

