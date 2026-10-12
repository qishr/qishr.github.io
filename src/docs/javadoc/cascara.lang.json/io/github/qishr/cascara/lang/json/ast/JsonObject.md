Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonObject
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonObject<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md), [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonObject__<br/>extends [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                         | Description |
|-------------------------------------------------------------------------------------------------------------------------------------|-------------|
| JsonObject()                                                                                                                        |             |
| JsonObject(int line, int column)                                                                                                    |             |
| JsonObject([JsonOptions](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonOptions.md) options)                       |             |
| JsonObject(int line, int column, [JsonOptions](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonOptions.md) options) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                   | Method                                                                                                                                                                                                            | Description               |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)>         | [getChildren](#getchildren)()                                                                                                                                                                                     |                           |
| public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)                                                                                                   | [getEntry](#getentry)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                           |                           |
| public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)                                                                                                   | [getEntry](#getentry)(int i)                                                                                                                                                                                      |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)>         | [getEntries](#getentries)()                                                                                                                                                                                       |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>         | [keySet](#keyset)()                                                                                                                                                                                               |                           |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)>           | [entrySet](#entryset)()                                                                                                                                                                                           |                           |
| public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md)                                                                                                       | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                               |                           |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                                           | [get](#get)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                     |                           |
| public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md)                                                                                                       | [getMap](#getmap)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                               |                           |
| public [JsonArray](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonArray.md)                                                                                                         | [getSequence](#getsequence)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [JsonScalar](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonScalar.md)                                                                                                       | [getScalar](#getscalar)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                         |                           |
| public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md)                                                                                                       | [getObject](#getobject)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                         |                           |
| public [JsonArray](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonArray.md)                                                                                                         | [getArray](#getarray)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                           |                           |
| public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md)                                                                                                       | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value)           |                           |
| public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md)                                                                                                       | [put](#put)([JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md) entry)                                                                                                     |                           |
| public boolean                                                                                                                                                                                      | [containsKey](#containskey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                     |                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)>                 | [values](#values)()                                                                                                                                                                                               |                           |
| public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md)                                                                                                       | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                           |
| public int                                                                                                                                                                                          | [size](#size)()                                                                                                                                                                                                   |                           |
| public boolean                                                                                                                                                                                      | [isEmpty](#isempty)()                                                                                                                                                                                             |                           |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)> | [iterator](#iterator)()                                                                                                                                                                                           | Returns Iterator instance |
| public boolean                                                                                                                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                                                                 |                           |
| public int                                                                                                                                                                                          | [hashCode](#hashcode)()                                                                                                                                                                                           |                           |


### Methods inherited from [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)

getEndColumn, getEndLine, getComments, getStartColumn, getToken, setToken, addComment, getStartLine


## Method Details

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)> __getChildren__()</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)

**Overrides:**

[JsonNode](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/ast/JsonNode.md#getchildren)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md) __getEntry__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntry

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md) __getEntry__(int i)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)> __getEntries__()</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### keySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __keySet__()</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)> __entrySet__()</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md) __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __get__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getMap

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md) __getMap__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonArray.md) __getSequence__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getScalar

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [JsonScalar](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonScalar.md) __getScalar__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### getObject

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md) __getObject__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getArray

<span style="font-family: monospace; font-size: 80%;">public [JsonArray](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonArray.md) __getArray__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md) __put__([JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md) entry)</span>




---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### values

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)> __values__()</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md) __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[MapAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)> __iterator__()</span>

Returns Iterator instance


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[JsonNode](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/ast/JsonNode.md#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[JsonNode](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/ast/JsonNode.md#hashcode)


---

