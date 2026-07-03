Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface MapAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.MapAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](AstNode.md)

All Known Implementing Classes:<br/>
    [ReferenceMapNode](../reference/ReferenceMapNode.md), [JsonMapNode](../../../cascara.lang.json/json/ast/JsonMapNode.md), [YamlMapNode](../../../cascara.lang.yaml/yaml/ast/YamlMapNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __MapAstNode__</span>


## Method Summary

| Modifier and Type                                                                                           | Method                                                                                                                                                                                                                                                       | Description |
|-------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract int                                                                                         | [size](#size)()                                                                                                                                                                                                                                              |             |
| public abstract boolean                                                                                     | [isEmpty](#isempty)()                                                                                                                                                                                                                                        |             |
| public abstract boolean                                                                                     | [containsKey](#containskey)(T key)                                                                                                                                                                                                                           |             |
| public abstract T                                                                                           | [get](#get)(T key)                                                                                                                                                                                                                                           |             |
| public abstract E                                                                                           | [getEntry](#getentry)(T key)                                                                                                                                                                                                                                 |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<E> | [getEntries](#getentries)()                                                                                                                                                                                                                                  |             |
| public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<E>   | [entrySet](#entryset)()                                                                                                                                                                                                                                      |             |
| public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<T>   | [keySet](#keyset)()                                                                                                                                                                                                                                          |             |
| public abstract [MapAstNode](MapAstNode.md)<T, E>                                                           | [put](#put)(T key, T value)                                                                                                                                                                                                                                  |             |
| public abstract [MapAstNode](MapAstNode.md)<T, E>                                                           | [remove](#remove)(T key)                                                                                                                                                                                                                                     |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> | [values](#values)()                                                                                                                                                                                                                                          |             |
| public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<E>  | [getChildren](#getchildren)()                                                                                                                                                                                                                                |             |
| public abstract boolean                                                                                     | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                |             |
| public abstract [MapAstNode](MapAstNode.md)<T, E>                                                           | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, T value)                                                                                                                                       |             |
| public abstract [MapAstNode](MapAstNode.md)<T, E>                                                           | [put](#put)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                                            |             |
| public abstract [MapAstNode](MapAstNode.md)<T, E>                                                           | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                          |             |
| public abstract T                                                                                           | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                                |             |
| public abstract [MapAstNode](MapAstNode.md)<T, E>                                                           | [getMap](#getmap)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                          |             |
| public abstract [SequenceAstNode](SequenceAstNode.md)<T>                                                    | [getSequence](#getsequence)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                |             |
| public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                    |             |
| public default int                                                                                          | [getInteger](#getinteger)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, int defaultValue)                                                                                                                |             |
| public default double                                                                                       | [getDouble](#getdouble)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, double defaultValue)                                                                                                               |             |
| public default boolean                                                                                      | [getBoolean](#getboolean)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, boolean defaultValue)                                                                                                            |             |
| public default int                                                                                          | [getInteger](#getinteger)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                  |             |
| public default double                                                                                       | [getDouble](#getdouble)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                    |             |
| public default boolean                                                                                      | [getBoolean](#getboolean)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                                  |             |
| public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)                         |             |
| public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getAttributeOrDefault](#getattributeordefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue) |             |



## Method Details

### size

<span style="font-family: monospace; font-size: 80%;">public abstract int __size__()</span>




---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isEmpty__()</span>




---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __containsKey__(T key)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public abstract T __get__(T key)</span>




---

### getEntry

<span style="font-family: monospace; font-size: 80%;">public abstract E __getEntry__(T key)</span>




---

### getEntries

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<E> __getEntries__()</span>




---

### entrySet

<span style="font-family: monospace; font-size: 80%;">public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<E> __entrySet__()</span>




---

### keySet

<span style="font-family: monospace; font-size: 80%;">public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<T> __keySet__()</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public abstract [MapAstNode](MapAstNode.md)<T, E> __put__(T key, T value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract [MapAstNode](MapAstNode.md)<T, E> __remove__(T key)</span>




---

### values

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __values__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<E> __getChildren__()</span>



**Specified By:**

[AstNode](AstNode.md)


---

### containsKey

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __containsKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public abstract [MapAstNode](MapAstNode.md)<T, E> __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, T value)</span>




---

### put

<span style="font-family: monospace; font-size: 80%;">public abstract [MapAstNode](MapAstNode.md)<T, E> __put__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract [MapAstNode](MapAstNode.md)<T, E> __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public abstract T __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getMap

<span style="font-family: monospace; font-size: 80%;">public abstract [MapAstNode](MapAstNode.md)<T, E> __getMap__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getSequence

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](SequenceAstNode.md)<T> __getSequence__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Returns:**

Returns the string value of the map entry, or null if it doesn't exist.


---

### getInteger

<span style="font-family: monospace; font-size: 80%;">public default int __getInteger__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, int defaultValue)</span>




---

### getDouble

<span style="font-family: monospace; font-size: 80%;">public default double __getDouble__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, double defaultValue)</span>




---

### getBoolean

<span style="font-family: monospace; font-size: 80%;">public default boolean __getBoolean__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, boolean defaultValue)</span>




---

### getInteger

<span style="font-family: monospace; font-size: 80%;">public default int __getInteger__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getDouble

<span style="font-family: monospace; font-size: 80%;">public default double __getDouble__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getBoolean

<span style="font-family: monospace; font-size: 80%;">public default boolean __getBoolean__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)</span>




---

### getAttributeOrDefault

<span style="font-family: monospace; font-size: 80%;">public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAttributeOrDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)</span>




---

