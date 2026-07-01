Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface MapEntryAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.MapEntryAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](AstNode.md)

All Known Implementing Classes:<br/>
    [ReferenceMapEntryNode](../reference/ReferenceMapEntryNode.md), [JsonMapEntryNode](../../../cascara.lang.json/json/ast/JsonMapEntryNode.md), [YamlMapEntryNode](../../../cascara.lang.yaml/yaml/ast/YamlMapEntryNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __MapEntryAstNode__</span>

Represents the structural pairing of a key and a value in a Map.K The type of the key (usually String/ScalarAstNode)
V The type of the value node


## Method Summary

| Modifier and Type                                                                                          | Method                        | Description                                                                                   |
|------------------------------------------------------------------------------------------------------------|-------------------------------|-----------------------------------------------------------------------------------------------|
| public abstract T                                                                                          | [getKey](#getkey)()           | Returns the key corresponding to this entry.                                                  |
| public abstract T                                                                                          | [getValue](#getvalue)()       | Returns the value corresponding to this entry.                                                |
| public abstract [MapEntryAstNode](MapEntryAstNode.md)<T>                                                   | [setRaw](#setraw)(T value)    | Replaces the value corresponding to this entry with the specified value (optional operation). |
| public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> | [getChildren](#getchildren)() |                                                                                               |



## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public abstract T __getKey__()</span>

Returns the key corresponding to this entry.


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public abstract T __getValue__()</span>

Returns the value corresponding to this entry.


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public abstract [MapEntryAstNode](MapEntryAstNode.md)<T> __setRaw__(T value)</span>

Replaces the value corresponding to this entry with the specified value (optional operation).


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __getChildren__()</span>



**Specified By:**

[AstNode](AstNode.md)


---

