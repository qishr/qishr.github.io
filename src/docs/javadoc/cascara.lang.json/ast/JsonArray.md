Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonArray
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonArray<br/>
<br/>
All Implemented Interfaces:<br/>
    [SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)<[JsonNode](JsonNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonArray__<br/>extends [JsonNode](JsonNode.md)
</span>


## Constructor Summary

| Constructor                     | Description |
|---------------------------------|-------------|
| JsonArray()                     |             |
| JsonArray(int line, int column) |             |



## Method Summary

| Modifier and Type                                                                                                                | Method                                                                                                            | Description               |
|----------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|---------------------------|
| public [JsonArray](JsonArray.md)                                                                                                 | [add](#add)([JsonNode](JsonNode.md) item)                                                                         |                           |
| public [JsonArray](JsonArray.md)                                                                                                 | [remove](#remove)(int index)                                                                                      |                           |
| public [JsonArray](JsonArray.md)                                                                                                 | [clear](#clear)()                                                                                                 |                           |
| public int                                                                                                                       | [size](#size)()                                                                                                   |                           |
| public [JsonNode](JsonNode.md)                                                                                                   | [get](#get)(int index)                                                                                            |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)>         | [getElements](#getelements)()                                                                                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)>         | [getChildren](#getchildren)()                                                                                     |                           |
| public [JsonNode](JsonNode.md)                                                                                                   | [getFirst](#getfirst)()                                                                                           |                           |
| public [JsonNode](JsonNode.md)                                                                                                   | [getLast](#getlast)()                                                                                             |                           |
| public [JsonArray](JsonArray.md)                                                                                                 | [remove](#remove)([JsonNode](JsonNode.md) node)                                                                   |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonNode](JsonNode.md)> | [iterator](#iterator)()                                                                                           | Returns Iterator instance |
| public boolean                                                                                                                   | [isEmpty](#isempty)()                                                                                             |                           |
| public boolean                                                                                                                   | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |                           |
| public int                                                                                                                       | [hashCode](#hashcode)()                                                                                           |                           |


### Methods inherited from [JsonNode](JsonNode.md)

getEndColumn, getEndLine, getComments, getStartColumn, getToken, setToken, addComment, getStartLine


## Method Details

### add

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](JsonArray.md) __add__([JsonNode](JsonNode.md) item)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](JsonArray.md) __remove__(int index)</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### clear

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](JsonArray.md) __clear__()</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](JsonNode.md) __get__(int index)</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### getElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> __getElements__()</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> __getChildren__()</span>



**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#getchildren)


---

### getFirst

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](JsonNode.md) __getFirst__()</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### getLast

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](JsonNode.md) __getLast__()</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](JsonArray.md) __remove__([JsonNode](JsonNode.md) node)</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonNode](JsonNode.md)> __iterator__()</span>

Returns Iterator instance

**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[SequenceAstNode](../../cascara.common/lang/ast/SequenceAstNode.md)


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#hashcode)


---

