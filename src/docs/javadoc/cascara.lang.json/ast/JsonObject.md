Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonObject
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonObject<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [JsonNode](JsonNode.md), [JsonProperty](JsonProperty.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonObject__<br/>extends [JsonNode](JsonNode.md)
</span>


## Constructor Summary

| Constructor                                                                     | Description |
|---------------------------------------------------------------------------------|-------------|
| JsonObject()                                                                    |             |
| JsonObject(int line, int column)                                                |             |
| JsonObject([JsonOptions](../util/JsonOptions.md) options)                       |             |
| JsonObject(int line, int column, [JsonOptions](../util/JsonOptions.md) options) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                           | Method                                                                                                                                                                                                            | Description               |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](JsonProperty.md)>                                                            | [getChildren](#getchildren)()                                                                                                                                                                                     |                           |
| public [JsonProperty](JsonProperty.md)                                                                                                                                                      | [getEntry](#getentry)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                           |                           |
| public [JsonProperty](JsonProperty.md)                                                                                                                                                      | [getEntry](#getentry)(int i)                                                                                                                                                                                      |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](JsonProperty.md)>                                                            | [getEntries](#getentries)()                                                                                                                                                                                       |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [keySet](#keyset)()                                                                                                                                                                                               |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonProperty](JsonProperty.md)>                                                              | [entrySet](#entryset)()                                                                                                                                                                                           |                           |
| public [JsonObject](JsonObject.md)                                                                                                                                                          | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [JsonNode](JsonNode.md)                                                                                                                                                              | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                     |                           |
| public [JsonObject](JsonObject.md)                                                                                                                                                          | [getMap](#getmap)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [JsonArray](JsonArray.md)                                                                                                                                                            | [getSequence](#getsequence)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |                           |
| public [JsonScalar](JsonScalar.md)                                                                                                                                                          | [getScalar](#getscalar)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                         |                           |
| public [JsonObject](JsonObject.md)                                                                                                                                                          | [getObject](#getobject)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                         |                           |
| public [JsonArray](JsonArray.md)                                                                                                                                                            | [getArray](#getarray)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                           |                           |
| public [JsonObject](JsonObject.md)                                                                                                                                                          | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](JsonNode.md) value)                                                                      |                           |
| public [JsonObject](JsonObject.md)                                                                                                                                                          | [put](#put)([JsonProperty](JsonProperty.md) entry)                                                                                                                                                                |                           |
| public boolean                                                                                                                                                                              | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)>                                                                    | [values](#values)()                                                                                                                                                                                               |                           |
| public [JsonObject](JsonObject.md)                                                                                                                                                          | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                           |
| public int                                                                                                                                                                                  | [size](#size)()                                                                                                                                                                                                   |                           |
| public boolean                                                                                                                                                                              | [isEmpty](#isempty)()                                                                                                                                                                                             |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonProperty](JsonProperty.md)>                                                    | [iterator](#iterator)()                                                                                                                                                                                           | Returns Iterator instance |
| public boolean                                                                                                                                                                              | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                                                                 |                           |
| public int                                                                                                                                                                                  | [hashCode](#hashcode)()                                                                                                                                                                                           |                           |


### Methods inherited from [JsonNode](JsonNode.md)

getEndColumn, getEndLine, getComments, getStartColumn, getToken, setToken, addComment, getStartLine


## Method Details

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](JsonProperty.md)> __getChildren__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)

**Overrides:**

[JsonNode](../cascara.lang.json/ast/JsonNode.md#getchildren)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [JsonProperty](JsonProperty.md) __getEntry__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [JsonProperty](JsonProperty.md) __getEntry__(int i)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](JsonProperty.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __keySet__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonProperty](JsonProperty.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](JsonObject.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](JsonNode.md) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](JsonObject.md) __getMap__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](JsonArray.md) __getSequence__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [JsonScalar](JsonScalar.md) __getScalar__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../cascara.common/lang/ast/MapAstNode.md)


---

### getObject

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](JsonObject.md) __getObject__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getArray

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](JsonArray.md) __getArray__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](JsonObject.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](JsonNode.md) value)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](JsonObject.md) __put__([JsonProperty](JsonProperty.md) entry)</span>




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

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](JsonObject.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



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

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonProperty](JsonProperty.md)> __iterator__()</span>

Returns Iterator instance


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

