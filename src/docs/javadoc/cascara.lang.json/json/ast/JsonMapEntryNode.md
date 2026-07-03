Package [io.github.qishr.cascara.lang.json.ast](index.md)

# Class JsonMapEntryNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.ast.JsonNode](JsonNode.md)<br/>
                io.github.qishr.cascara.lang.json.ast.JsonMapEntryNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)<[JsonNode](JsonNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonMapEntryNode__<br/>extends [JsonNode](JsonNode.md)
</span>

Represents the structural pairing of a key and a value in a JSON object.


## Constructor Summary

| Constructor                                                                                        | Description                                             |
|----------------------------------------------------------------------------------------------------|---------------------------------------------------------|
| JsonMapEntryNode(int line, int column, [JsonNode](JsonNode.md) key, [JsonNode](JsonNode.md) value) |                                                         |
| JsonMapEntryNode([JsonNode](JsonNode.md) key, [JsonNode](JsonNode.md) value)                       | Convenience constructor for programmatic node creation. |



## Method Summary

| Modifier and Type                                                                                                        | Method                                               | Description |
|--------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------|-------------|
| public [JsonNode](JsonNode.md)                                                                                           | [getKey](#getkey)()                                  |             |
| public [JsonNode](JsonNode.md)                                                                                           | [getValue](#getvalue)()                              |             |
| public [JsonMapEntryNode](JsonMapEntryNode.md)                                                                           | [setRaw](#setraw)([JsonNode](JsonNode.md) value)     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> | [getChildren](#getchildren)()                        |             |
| public [JsonMapEntryNode](JsonMapEntryNode.md)                                                                           | [setValue](#setvalue)([JsonNode](JsonNode.md) value) |             |


### Methods inherited from [JsonNode](JsonNode.md)

getEndColumn, getEndLine, getComments, getStartColumn, getToken, setToken, equals, addComment, getStartLine, hashCode


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](JsonNode.md) __getKey__()</span>



**Specified By:**

[MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](JsonNode.md) __getValue__()</span>



**Specified By:**

[MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [JsonMapEntryNode](JsonMapEntryNode.md) __setRaw__([JsonNode](JsonNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonNode](JsonNode.md)> __getChildren__()</span>



**Specified By:**

[MapEntryAstNode](../../../cascara.common/lang/ast/MapEntryAstNode.md)

**Overrides:**

[JsonNode](../cascara.lang.json/json/ast/JsonNode.md#getchildren)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [JsonMapEntryNode](JsonMapEntryNode.md) __setValue__([JsonNode](JsonNode.md) value)</span>




---

