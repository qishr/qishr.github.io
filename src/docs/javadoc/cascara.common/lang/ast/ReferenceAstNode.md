Package [io.github.qishr.cascara.common.lang.ast](index.md)

# Interface ReferenceAstNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.ast.ReferenceAstNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](AstNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ReferenceAstNode__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                      | Description                                                       |
|--------------------------------------------------------------------------------------------------------------|---------------------------------------------|-------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getReferenceTarget](#getreferencetarget)() | The name of the anchor being referenced (e.g. "default_settings") |
| public abstract T                                                                                            | [resolve](#resolve)()                       | Returns the original node being pointed to.                       |



## Method Details

### getReferenceTarget

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getReferenceTarget__()</span>

The name of the anchor being referenced (e.g. "default_settings")


---

### resolve

<span style="font-family: monospace; font-size: 80%;">public abstract T __resolve__()</span>

Returns the original node being pointed to.


---

