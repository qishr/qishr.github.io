Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainMapEntryNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.plain.PlainNode](PlainNode.md)<br/>
                io.github.qishr.cascara.common.lang.plain.PlainMapEntryNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [MapEntryAstNode](../ast/MapEntryAstNode.md)<[PlainNode](PlainNode.md), [PlainNode](PlainNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __PlainMapEntryNode__<br/>extends [PlainNode](PlainNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| PlainMapEntryNode([PlainNode](PlainNode.md) key, [PlainNode](PlainNode.md) value)                                                                                                                                       |             |
| PlainMapEntryNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [PlainNode](PlainNode.md) value)                                                                    |             |
| PlainMapEntryNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |



## Method Summary

| Modifier and Type                                                                                                                           | Method                                                 | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|-------------|
| public [PlainNode](PlainNode.md)                                                                                                            | [getKey](#getkey)()                                    |             |
| public [PlainNode](PlainNode.md)                                                                                                            | [getValue](#getvalue)()                                |             |
| public [PlainMapEntryNode](PlainMapEntryNode.md)                                                                                            | [setRaw](#setraw)([PlainNode](PlainNode.md) value)     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](PlainNode.md)>                  | [getChildren](#getchildren)()                          |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> | [getComments](#getcomments)()                          |             |
| public [PlainNode](PlainNode.md)                                                                                                            | [setValue](#setvalue)([PlainNode](PlainNode.md) value) |             |


### Methods inherited from [PlainNode](PlainNode.md)

getEndColumn, getEndLine, getStartColumn, getToken, getStartLine


## Method Details

### getKey

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](PlainNode.md) __getKey__()</span>



**Specified By:**

[MapEntryAstNode](../ast/MapEntryAstNode.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](PlainNode.md) __getValue__()</span>



**Specified By:**

[MapEntryAstNode](../ast/MapEntryAstNode.md)


---

### setRaw

<span style="font-family: monospace; font-size: 80%;">public [PlainMapEntryNode](PlainMapEntryNode.md) __setRaw__([PlainNode](PlainNode.md) value)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PlainNode](PlainNode.md)> __getChildren__()</span>



**Specified By:**

[MapEntryAstNode](../ast/MapEntryAstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../ast/CommentAstNode.md)> __getComments__()</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [PlainNode](PlainNode.md) __setValue__([PlainNode](PlainNode.md) value)</span>




---

