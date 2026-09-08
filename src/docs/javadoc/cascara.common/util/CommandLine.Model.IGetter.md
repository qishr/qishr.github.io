Package [io.github.qishr.cascara.common.util](index.md)

# Interface IGetter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.IGetter<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)

All Known Implementing Classes:<br/>
    [IScope](CommandLine.Model.IScope.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IGetter__</span>

Customizable getter for obtaining the current value of an option or positional parameter.When an option or positional parameter is matched on the command line, its getter or setter is invoked to capture the value.
 For example, an option can be bound to a field or a method, and when the option is matched on the command line, the
 field's value is set or the method is invoked with the option parameter value.


## Method Summary

| Modifier and Type | Method        | Description                               |
|-------------------|---------------|-------------------------------------------|
| public abstract T | [get](#get)() | Returns the current value of the binding. |



## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">public abstract T __get__()</span>

Returns the current value of the binding.For multi-value options and positional parameters,
 this method returns an array, collection or map to add values to.

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

