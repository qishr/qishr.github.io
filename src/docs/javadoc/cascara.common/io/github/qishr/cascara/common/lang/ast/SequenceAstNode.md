Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface SequenceAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.SequenceAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md), [Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<T>

All Known Implementing Classes:<br/>
    [PlainSequenceNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainSequenceNode.md), [JsonArray](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/ast/JsonArray.md), [YamlSequence](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SequenceAstNode__</span>


## Method Summary

| Modifier and Type                                                                                                     | Method                        | Description |
|-----------------------------------------------------------------------------------------------------------------------|-------------------------------|-------------|
| public abstract int                                                                                                   | [size](#size)()               |             |
| public abstract boolean                                                                                               | [isEmpty](#isempty)()         |             |
| public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> | [clear](#clear)()             |             |
| public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> | [add](#add)(T node)           |             |
| public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> | [remove](#remove)(T node)     |             |
| public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> | [remove](#remove)(int index)  |             |
| public abstract T                                                                                                     | [get](#get)(int index)        |             |
| public abstract T                                                                                                     | [getFirst](#getfirst)()       |             |
| public abstract T                                                                                                     | [getLast](#getlast)()         |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T>           | [getElements](#getelements)() |             |
| public abstract [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<T>   | [iterator](#iterator)()       |             |



## Method Details

### size

<span style="font-family: monospace; font-size: 80%;">public abstract int __size__()</span>




---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isEmpty__()</span>




---

### clear

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> __clear__()</span>




---

### add

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> __add__(T node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> __remove__(T node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/SequenceAstNode.md)<T> __remove__(int index)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public abstract T __get__(int index)</span>




---

### getFirst

<span style="font-family: monospace; font-size: 80%;">public abstract T __getFirst__()</span>




---

### getLast

<span style="font-family: monospace; font-size: 80%;">public abstract T __getLast__()</span>




---

### getElements

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __getElements__()</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public abstract [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<T> __iterator__()</span>



**Specified By:**

[Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)


---

