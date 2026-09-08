Package [io.github.qishr.cascara.common.util](index.md)

# Class Builder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ArgSpec.Builder<[io.github.qishr.cascara.common.util.CommandLine.Model.PositionalParamSpec.Builder](CommandLine.Model.PositionalParamSpec.Builder.md)><br/>
                io.github.qishr.cascara.common.util.CommandLine.Model.PositionalParamSpec.Builder<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model.PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Builder__<br/>extends Builder<[Builder](CommandLine.Model.PositionalParamSpec.Builder.md)>
</span>

Builder responsible for creating valid `PositionalParamSpec` objects.


## Method Summary

| Modifier and Type                                                      | Method                                                                                                              | Description                                                                                                                                       |
|------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|
| public [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) | [build](#build)()                                                                                                   | Returns a valid `PositionalParamSpec` instance.                                                                                                   |
| protected [Builder](CommandLine.Model.PositionalParamSpec.Builder.md)  | [self](#self)()                                                                                                     | Returns this builder.                                                                                                                             |
| public [Range](CommandLine.Range.md)                                   | [index](#index)()                                                                                                   | Returns an index or range specifying which of the command line arguments should be assigned to this positional parameter.                         |
| public [Builder](CommandLine.Model.PositionalParamSpec.Builder.md)     | [index](#index)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) range) | Sets the index or range specifying which of the command line arguments should be assigned to this positional parameter, and returns this builder. |
| public [Builder](CommandLine.Model.PositionalParamSpec.Builder.md)     | [index](#index)([Range](CommandLine.Range.md) index)                                                                | Sets the index or range specifying which of the command line arguments should be assigned to this positional parameter, and returns this builder. |



## Method Details

### build

<span style="font-family: monospace; font-size: 80%;">public [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) __build__()</span>

Returns a valid `PositionalParamSpec` instance.


---

### self

<span style="font-family: monospace; font-size: 80%;">protected [Builder](CommandLine.Model.PositionalParamSpec.Builder.md) __self__()</span>

Returns this builder.


---

### index

<span style="font-family: monospace; font-size: 80%;">public [Range](CommandLine.Range.md) __index__()</span>

Returns an index or range specifying which of the command line arguments should be assigned to this positional parameter.

**See Also:**


[index](#index)



---

### index

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.PositionalParamSpec.Builder.md) __index__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) range)</span>

Sets the index or range specifying which of the command line arguments should be assigned to this positional parameter, and returns this builder.


---

### index

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.PositionalParamSpec.Builder.md) __index__([Range](CommandLine.Range.md) index)</span>

Sets the index or range specifying which of the command line arguments should be assigned to this positional parameter, and returns this builder.


---

