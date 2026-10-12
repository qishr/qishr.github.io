Package [io.github.qishr.cascara.common.util](index.md)

# Interface IOptionRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.IOptionRenderer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IOptionRenderer__</span>

When customizing online help for [OptionSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.OptionSpec.md) details, a custom `IOptionRenderer` can be
 used to create textual representation of an Option in a tabular format: one or more rows, each containing
 one or more columns.The [Layout](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Layout.md) is responsible for placing these text values in the
 [TextTable](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.TextTable.md).


## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                                                                                                                                                  | Description                                                                        |
|-----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| public abstract [Text](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.Text.md)[][] | [render](#render)([OptionSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.OptionSpec.md) option, [IParamLabelRenderer](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.IParamLabelRenderer.md) parameterLabelRenderer, [ColorScheme](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.ColorScheme.md) scheme) | Returns a text representation of the specified option and its parameter(s) if any. |



## Method Details

### render

<span style="font-family: monospace; font-size: 80%;">public abstract [Text](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.Text.md)[][] __render__([OptionSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.OptionSpec.md) option, [IParamLabelRenderer](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.IParamLabelRenderer.md) parameterLabelRenderer, [ColorScheme](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.ColorScheme.md) scheme)</span>

Returns a text representation of the specified option and its parameter(s) if any.

**Parameters:**

`option` - the command line option to show online usage help for

`parameterLabelRenderer` - responsible for rendering option parameters to text

`scheme` - color scheme for applying ansi color styles to options and option parameters

**Returns:**

a 2-dimensional array of text values: one or more rows, each containing one or more columns

**Since:**

3.0


---

