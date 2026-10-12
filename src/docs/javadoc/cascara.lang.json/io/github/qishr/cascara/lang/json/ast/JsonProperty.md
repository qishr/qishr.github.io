Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonProperty
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonProperty<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonProperty__<br/>extends [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)
</span>

Represents the structural pairing of a key and a value in a JSON object.


## Constructor Summary

| Constructor                                                                                                                                                                                                                    | Description                                             |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------|
| JsonProperty(int line, int column, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value) |                                                         |
| JsonProperty([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value)                       | Convenience constructor for programmatic node creation. |



## Method Summary

| Modifier and Type                                                                                                                                                                   | Method                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                 | [getKey](#getkey)()                                                                                               |             |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                                                                                           | [getValue](#getvalue)()                                                                                           |             |
| public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)                                                                                   | [setRaw](#setraw)([JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value)       |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)> | [getChildren](#getchildren)()                                                                                     |             |
| public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md)                                                                                   | [setValue](#setvalue)([JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value)   |             |
| public boolean                                                                                                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |             |
| public int                                                                                                                                                                          | [hashCode](#hashcode)()                                                                                           |             |


### Methods inherited from [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)

getEndColumn, getEndLine, getComments, getStartColumn, getToken, setToken, addComment, getStartLine


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getKey__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __getValue__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md) __setRaw__([JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)> __getChildren__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)

**Overrides:**

[JsonNode](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/ast/JsonNode.md#getchildren)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md) __setValue__([JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) value)</span>




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

