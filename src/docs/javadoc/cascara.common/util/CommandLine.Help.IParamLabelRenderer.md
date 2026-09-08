Package [io.github.qishr.cascara.common.util](index.md)

# Interface IParamLabelRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.IParamLabelRenderer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IParamLabelRenderer__</span>

When customizing online usage help for an option parameter or a positional parameter, a custom
 `IParamLabelRenderer` can be used to render the parameter name or label to a String.


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                                                                            | Description                                                                                                                                                       |
|--------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [Text](CommandLine.Help.Ansi.Text.md)                                                        | [renderParameterLabel](#renderparameterlabel)([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec, [Ansi](CommandLine.Help.Ansi.md) ansi, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> styles) | Returns a text rendering of the option parameter or positional parameter; returns an empty string  `""` if the option is a boolean and does not take a parameter. |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [separator](#separator)()                                                                                                                                                                                                                                                         | Returns the separator between option name and param label.                                                                                                        |



## Method Details

### renderParameterLabel

<span style="font-family: monospace; font-size: 80%;">public abstract [Text](CommandLine.Help.Ansi.Text.md) __renderParameterLabel__([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec, [Ansi](CommandLine.Help.Ansi.md) ansi, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IStyle](CommandLine.Help.Ansi.IStyle.md)> styles)</span>

Returns a text rendering of the option parameter or positional parameter; returns an empty string
 `""` if the option is a boolean and does not take a parameter.

**Parameters:**

`argSpec` - the named or positional parameter with a parameter label

`ansi` - determines whether ANSI escape codes should be emitted or not

`styles` - the styles to apply to the parameter label

**Returns:**

a text rendering of the Option parameter or positional parameter

**Since:**

3.0


---

### separator

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __separator__()</span>

Returns the separator between option name and param label.

**Returns:**

the separator between option name and param label


---

