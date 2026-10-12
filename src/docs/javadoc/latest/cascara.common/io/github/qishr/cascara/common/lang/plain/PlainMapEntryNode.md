Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainMapEntryNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.plain.PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)<br/>
                io.github.qishr.cascara.common.lang.plain.PlainMapEntryNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md), [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __PlainMapEntryNode__<br/>extends [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| PlainMapEntryNode([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) key, [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)         |             |
| PlainMapEntryNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)     |             |
| PlainMapEntryNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                 | Method                                                                                                                | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)                                                                                                   | [getKey](#getkey)()                                                                                                   |             |
| public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)                                                                                                   | [getValue](#getvalue)()                                                                                               |             |
| public [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md)                                                                                   | [setRaw](#setraw)([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)>         | [getChildren](#getchildren)()                                                                                         |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> | [getComments](#getcomments)()                                                                                         |             |
| public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)                                                                                                   | [setValue](#setvalue)([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value) |             |


### Methods inherited from [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) __getKey__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) __getValue__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [PlainMapEntryNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainMapEntryNode.md) __setRaw__([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)> __getChildren__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> __getComments__()</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) __setValue__([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) value)</span>




---

