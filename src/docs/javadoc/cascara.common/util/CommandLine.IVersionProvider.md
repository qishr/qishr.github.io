Package [io.github.qishr.cascara.common.util](index.md)

# Interface IVersionProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IVersionProvider<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IVersionProvider__</span>

Provides version information for a command.Commands may configure a provider with the
Command#versionProvider() annotation attribute.


## Method Summary

| Modifier and Type                                                                                              | Method                      | Description                                |
|----------------------------------------------------------------------------------------------------------------|-----------------------------|--------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] | [getVersion](#getversion)() | Returns version information for a command. |



## Method Details

### getVersion

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __getVersion__()</span>

Returns version information for a command.

**Returns:**

version information (each string in the array is displayed on a separate line)

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

