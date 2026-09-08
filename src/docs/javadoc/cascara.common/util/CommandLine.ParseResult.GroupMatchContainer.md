Package [io.github.qishr.cascara.common.util](index.md)

# Class GroupMatchContainer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ParseResult.GroupMatchContainer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.ParseResult](CommandLine.ParseResult.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __GroupMatchContainer__</span>

Provides information about an [ArgGroup](CommandLine.ArgGroup.md) that was matched on the command line.


 The `ParseResult` may have more than one `GroupMatchContainer` for an `ArgGroupSpec`, when the
 group was matched more often than its maximum multiplicity.
 This is not necessarily a problem: the parser will add a match to the parent matched group
 until the maximum multiplicity of the parent group is exceeded, in which case parser will add a match to the parent's parent group, etc.
 


 Ultimately, as long as the ParseResult#getGroupMatches() method does not return more than one match, the maximum number of elements is not exceeded.
 


## Method Summary

| Modifier and Type                                                                                                                                    | Method                  | Description                                                                                                                     |
|------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------|---------------------------------------------------------------------------------------------------------------------------------|
| public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)                                                                                             | [group](#group)()       | Returns the `ArgGroupSpec` whose matches are captured in this `GroupMatchContainer`.                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GroupMatch](CommandLine.ParseResult.GroupMatch.md)> | [matches](#matches)()   | Returns the list of `GroupMatch` instances: `ArgGroupSpec`s with a multiplicity greater than one may be matched multiple times. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                  | [toString](#tostring)() |                                                                                                                                 |



## Method Details

### group

<span style="font-family: monospace; font-size: 80%;">public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) __group__()</span>

Returns the `ArgGroupSpec` whose matches are captured in this `GroupMatchContainer`.


---

### matches

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GroupMatch](CommandLine.ParseResult.GroupMatch.md)> __matches__()</span>

Returns the list of `GroupMatch` instances: `ArgGroupSpec`s with a multiplicity greater than one may be matched multiple times.


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

