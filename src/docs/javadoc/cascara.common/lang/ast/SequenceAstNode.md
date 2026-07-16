Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface SequenceAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.SequenceAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](AstNode.md), [Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<T>

All Known Implementing Classes:<br/>
    [ReferenceSequenceNode](../reference/ReferenceSequenceNode.md), [JsonSequenceNode](../../../cascara.lang.json/ast/JsonSequenceNode.md), [YamlSequenceNode](../../../cascara.lang.yaml/ast/YamlSequenceNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SequenceAstNode__</span>


## Method Summary

| Modifier and Type                                                                                                   | Method                        | Description |
|---------------------------------------------------------------------------------------------------------------------|-------------------------------|-------------|
| public abstract int                                                                                                 | [size](#size)()               |             |
| public abstract boolean                                                                                             | [isEmpty](#isempty)()         |             |
| public abstract [SequenceAstNode](SequenceAstNode.md)<T>                                                            | [clear](#clear)()             |             |
| public abstract [SequenceAstNode](SequenceAstNode.md)<T>                                                            | [add](#add)(T node)           |             |
| public abstract [SequenceAstNode](SequenceAstNode.md)<T>                                                            | [remove](#remove)(T node)     |             |
| public abstract [SequenceAstNode](SequenceAstNode.md)<T>                                                            | [remove](#remove)(int index)  |             |
| public abstract T                                                                                                   | [get](#get)(int index)        |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T>         | [getElements](#getelements)() |             |
| public abstract [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<T> | [iterator](#iterator)()       |             |



## Method Details

### size

<span style="font-family: monospace; font-size: 80%;">public abstract int __size__()</span>




---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isEmpty__()</span>




---

### clear

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](SequenceAstNode.md)<T> __clear__()</span>




---

### add

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](SequenceAstNode.md)<T> __add__(T node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](SequenceAstNode.md)<T> __remove__(T node)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract [SequenceAstNode](SequenceAstNode.md)<T> __remove__(int index)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public abstract T __get__(int index)</span>




---

### getElements

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __getElements__()</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public abstract [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<T> __iterator__()</span>



**Specified By:**

[Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)


---

