Package [io.github.qishr.cascara.common.util](index.md)

# Class GroupMatch
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ParseResult.GroupMatch<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.ParseResult](CommandLine.ParseResult.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __GroupMatch__</span>

A group's multiplicity specifies how many matches of a group may
 appear on the command line.This class models a single "match".
 For example, this group: `(-a -b) (-a -b)` requires two matches of its arguments to fully match.


## Method Summary

| Modifier and Type                                                                                                                                                                                                       | Method                                                                           | Description                                                                                   |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| public boolean                                                                                                                                                                                                          | [isEmpty](#isempty)()                                                            | Returns `true` if this match has no matched arguments and no matched subgroups.               |
| public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)                                                                                                                                                                | [group](#group)()                                                                | Returns the `ArgGroupSpec` of the container `GroupMatchContainer` of this match.              |
| public [GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md)                                                                                                                                            | [container](#container)()                                                        | Returns the container `GroupMatchContainer` of this match.                                    |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md), [GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md)> | [matchedSubgroups](#matchedsubgroups)()                                          | Returns matches for the subgroups, if any.                                                    |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                           | [matchedValues](#matchedvalues)([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec) | Returns the values matched for the specified argument, converted to the type of the argument. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                     | [toString](#tostring)()                                                          |                                                                                               |



## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>

Returns `true` if this match has no matched arguments and no matched subgroups.


---

### group

<span style="font-family: monospace; font-size: 80%;">public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) __group__()</span>

Returns the `ArgGroupSpec` of the container `GroupMatchContainer` of this match.


---

### container

<span style="font-family: monospace; font-size: 80%;">public [GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md) __container__()</span>

Returns the container `GroupMatchContainer` of this match.


---

### matchedSubgroups

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md), [GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md)> __matchedSubgroups__()</span>

Returns matches for the subgroups, if any.


---

### matchedValues

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __matchedValues__([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec)</span>

Returns the values matched for the specified argument, converted to the type of the argument.


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

