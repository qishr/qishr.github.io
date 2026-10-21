Package [io.github.qishr.cascara.common.lang.generic](index.md)

# Class GenericAstMapEntry
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.generic.GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)<br/>
                io.github.qishr.cascara.common.lang.generic.GenericAstMapEntry<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md), [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __GenericAstMapEntry__<br/>extends [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                              | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| GenericAstMapEntry([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) key, [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)                     |             |
| GenericAstMapEntry([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)           |             |
| GenericAstMapEntry([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                 | Method                                                                                                          | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|-------------|
| public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)                                                                                                         | [getKey](#getkey)()                                                                                             |             |
| public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)                                                                                                         | [getValue](#getvalue)()                                                                                         |             |
| public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)                                                                               | [setRaw](#setraw)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>               | [getChildren](#getchildren)()                                                                                   |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> | [getComments](#getcomments)()                                                                                   |             |
| public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md)                                                                               | [setValue](#setvalue)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value) |             |


### Methods inherited from [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) __getKey__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) __getValue__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md) __setRaw__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)> __getChildren__()</span>



**Specified By:**

[MapEntryAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/MapEntryAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/CommentAstNode.md)> __getComments__()</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [GenericAstMapEntry](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstMapEntry.md) __setValue__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) value)</span>




---

