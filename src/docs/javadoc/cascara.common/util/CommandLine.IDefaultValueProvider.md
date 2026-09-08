Package [io.github.qishr.cascara.common.util](index.md)

# Interface IDefaultValueProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IDefaultValueProvider<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [PropertiesDefaultProvider](CommandLine.PropertiesDefaultProvider.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IDefaultValueProvider__</span>

Provides default value for a command.Commands may configure a provider with the
Command#defaultValueProvider() annotation attribute.


## Method Summary

| Modifier and Type                                                                                            | Method                                                                         | Description                                                                |
|--------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [defaultValue](#defaultvalue)([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec) | Returns the default value for an option or positional parameter or `null`. |



## Method Details

### defaultValue

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __defaultValue__([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec)</span>

Returns the default value for an option or positional parameter or `null`.The returned value is converted to the type of the option/positional parameter
 via the same type converter used when populating this option/positional
 parameter from a command line argument.

**Parameters:**

`argSpec` - the option or positional parameter, never `null`

**Returns:**

the default value for the option or positional parameter, or `null` if
       this provider has no default value for the specified option or positional parameter

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

