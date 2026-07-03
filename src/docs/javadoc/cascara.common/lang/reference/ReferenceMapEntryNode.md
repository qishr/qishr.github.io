Package [io.github.qishr.cascara.common.lang.reference](index.md)

# Class ReferenceMapEntryNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.reference.ReferenceNode](ReferenceNode.md)<br/>
                io.github.qishr.cascara.common.lang.reference.ReferenceMapEntryNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../ast/MapEntryAstNode.md)<[ReferenceNode](ReferenceNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __ReferenceMapEntryNode__<br/>extends [ReferenceNode](ReferenceNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ReferenceMapEntryNode([ReferenceNode](ReferenceNode.md) key, [ReferenceNode](ReferenceNode.md) value)                                                                                                                       |             |
| ReferenceMapEntryNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [ReferenceNode](ReferenceNode.md) value)                                                            |             |
| ReferenceMapEntryNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |



## Method Summary

| Modifier and Type                                                                                                                           | Method                                                     | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------|-------------|
| public [ReferenceNode](ReferenceNode.md)                                                                                                    | [getKey](#getkey)()                                        |             |
| public [ReferenceNode](ReferenceNode.md)                                                                                                    | [getValue](#getvalue)()                                    |             |
| public [ReferenceMapEntryNode](ReferenceMapEntryNode.md)                                                                                    | [setRaw](#setraw)([ReferenceNode](ReferenceNode.md) value) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceNode](ReferenceNode.md)>          | [getChildren](#getchildren)()                              |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> | [getComments](#getcomments)()                              |             |


### Methods inherited from [ReferenceNode](ReferenceNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [ReferenceNode](ReferenceNode.md) __getKey__()</span>



**Specified By:**

[MapEntryAstNode](../ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [ReferenceNode](ReferenceNode.md) __getValue__()</span>



**Specified By:**

[MapEntryAstNode](../ast/MapEntryAstNode.md)


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapEntryNode](ReferenceMapEntryNode.md) __setRaw__([ReferenceNode](ReferenceNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceNode](ReferenceNode.md)> __getChildren__()</span>



**Specified By:**

[MapEntryAstNode](../ast/MapEntryAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> __getComments__()</span>




---

