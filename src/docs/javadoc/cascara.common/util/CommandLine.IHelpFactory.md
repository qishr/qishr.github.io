Package [io.github.qishr.cascara.common.util](index.md)

# Interface IHelpFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IHelpFactory<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IHelpFactory__</span>

Creates the [Help](CommandLine.Help.md) instance used to render the usage help message.


## Method Summary

| Modifier and Type                           | Method                                                                                                                                     | Description                                                             |
|---------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| public abstract [Help](CommandLine.Help.md) | [create](#create)([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme) | Returns a `Help` instance to assist in rendering the usage help message |



## Method Details

### create

<span style="font-family: monospace; font-size: 80%;">public abstract [Help](CommandLine.Help.md) __create__([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)</span>

Returns a `Help` instance to assist in rendering the usage help message

**Parameters:**

`commandSpec` - the command to create usage help for

`colorScheme` - the color scheme to use when rendering usage help

**Returns:**

a `Help` instance


---

