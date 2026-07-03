Package [io.github.qishr.cascara.common.lang.semantic](index.md)

# Interface SemanticNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.semantic.SemanticNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __SemanticNode__</span>


## Method Summary

| Modifier and Type                                                                                                                                   | Method                              | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                        | [getId](#getid)()                   |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                        | [getDisplayName](#getdisplayname)() |             |
| public abstract [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                        | [getSourcePath](#getsourcepath)()   |             |
| public abstract int                                                                                                                                 | [getStartLine](#getstartline)()     |             |
| public abstract int                                                                                                                                 | [getStartColumn](#getstartcolumn)() |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [SemanticNode](SemanticNode.md)> | [getChildren](#getchildren)()       |             |



## Method Details

### getId

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getId__()</span>




---

### getDisplayName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDisplayName__()</span>




---

### getSourcePath

<span style="font-family: monospace; font-size: 80%;">public abstract [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getSourcePath__()</span>




---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartLine__()</span>




---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartColumn__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [SemanticNode](SemanticNode.md)> __getChildren__()</span>




---

