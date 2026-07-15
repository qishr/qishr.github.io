Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonMapNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonMapNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [JsonNode](JsonNode.md), [JsonMapEntryNode](JsonMapEntryNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonMapNode__<br/>extends [JsonNode](JsonNode.md)
</span>


## Constructor Summary

| Constructor                                                                      | Description |
|----------------------------------------------------------------------------------|-------------|
| JsonMapNode()                                                                    |             |
| JsonMapNode(int line, int column)                                                |             |
| JsonMapNode([JsonOptions](../util/JsonOptions.md) options)                       |             |
| JsonMapNode(int line, int column, [JsonOptions](../util/JsonOptions.md) options) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                           | Method                                                                                                                                                                                                            | Description               |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonMapEntryNode](JsonMapEntryNode.md)>                                                    | [getChildren](#getchildren)()                                                                                                                                                                                     |                           |
| public [JsonMapEntryNode](JsonMapEntryNode.md)                                                                                                                                              | [getEntry](#getentry)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                           |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonMapEntryNode](JsonMapEntryNode.md)>                                                    | [getEntries](#getentries)()                                                                                                                                                                                       |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [keySet](#keyset)()                                                                                                                                                                                               |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonMapEntryNode](JsonMapEntryNode.md)>                                                      | [entrySet](#entryset)()                                                                                                                                                                                           |                           |
| public [JsonMapNode](JsonMapNode.md)                                                                                                                                                        | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [JsonNode](JsonNode.md)                                                                                                                                                              | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                     |                           |
| public [JsonMapNode](JsonMapNode.md)                                                                                                                                                        | [getMap](#getmap)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [JsonSequenceNode](JsonSequenceNode.md)                                                                                                                                              | [getSequence](#getsequence)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |                           |
| public [JsonMapNode](JsonMapNode.md)                                                                                                                                                        | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](JsonNode.md) value)                                                                      |                           |
| public [JsonMapNode](JsonMapNode.md)                                                                                                                                                        | [put](#put)([JsonMapEntryNode](JsonMapEntryNode.md) entry)                                                                                                                                                        |                           |
| public boolean                                                                                                                                                                              | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)>                                                                    | [values](#values)()                                                                                                                                                                                               |                           |
| public [JsonMapNode](JsonMapNode.md)                                                                                                                                                        | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                           |
| public int                                                                                                                                                                                  | [size](#size)()                                                                                                                                                                                                   |                           |
| public boolean                                                                                                                                                                              | [isEmpty](#isempty)()                                                                                                                                                                                             |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonMapEntryNode](JsonMapEntryNode.md)>                                            | [iterator](#iterator)()                                                                                                                                                                                           | Returns Iterator instance |


### Methods inherited from [JsonNode](JsonNode.md)

getEndColumn, getEndLine, getComments, getStartColumn, getToken, setToken, equals, addComment, getStartLine, hashCode


## Method Details

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonMapEntryNode](JsonMapEntryNode.md)> __getChildren__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)

**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#getchildren)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [JsonMapEntryNode](JsonMapEntryNode.md) __getEntry__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonMapEntryNode](JsonMapEntryNode.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __keySet__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonMapEntryNode](JsonMapEntryNode.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [JsonMapNode](JsonMapNode.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](JsonNode.md) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [JsonMapNode](JsonMapNode.md) __getMap__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [JsonSequenceNode](JsonSequenceNode.md) __getSequence__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonMapNode](JsonMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](JsonNode.md) value)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonMapNode](JsonMapNode.md) __put__([JsonMapEntryNode](JsonMapEntryNode.md) entry)</span>




---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonMapNode](JsonMapNode.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonMapEntryNode](JsonMapEntryNode.md)> __iterator__()</span>

Returns Iterator instance


---

