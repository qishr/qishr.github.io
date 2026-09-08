Package [io.github.qishr.cascara.common.util](index.md)

# Interface ISetter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ISetter<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)

All Known Implementing Classes:<br/>
    [IScope](CommandLine.Model.IScope.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __ISetter__</span>

Customizable setter for modifying the value of an option or positional parameter.When an option or positional parameter is matched on the command line, its setter is invoked to capture the value.
 For example, an option can be bound to a field or a method, and when the option is matched on the command line, the
 field's value is set or the method is invoked with the option parameter value.


## Method Summary

| Modifier and Type | Method               | Description                                               |
|-------------------|----------------------|-----------------------------------------------------------|
| public abstract T | [set](#set)(T value) | Sets the new value of the option or positional parameter. |



## Method Details

### set

<span style="font-family: monospace; font-size: 80%;">public abstract T __set__(T value)</span>

Sets the new value of the option or positional parameter.

**Parameters:**

`value` - the new value of the option or positional parameter

**Returns:**

the previous value of the binding (if supported by this binding)

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

