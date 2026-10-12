Package [io.github.qishr.cascara.ui.api.data](index.md)

# Interface ObservableTreeData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.data.ObservableTreeData<br/>
<br/>
All Implemented Interfaces:<br/>
    [ObservableTableData](../../../../../../../io/github/qishr/cascara/ui/api/data/ObservableTableData.md), [TreeData](../../../../../../../../cascara.common/io/github/qishr/cascara/common/data/TreeData.md)<T, V>

All Known Implementing Classes:<br/>
    [ObservableTreeNode](../../../../../../../io/github/qishr/cascara/ui/data/ObservableTreeNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ObservableTreeData__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                  | Method                              | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getNodeName](#getnodename)()       |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getTreePath](#gettreepath)()       |             |
| public abstract boolean                                                                                                                                                                                                                                                                            | [isBranch](#isbranch)()             |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> | [getDataContext](#getdatacontext)() |             |



## Method Details

### getNodeName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getNodeName__()</span>



**Specified By:**

[TreeData](../../../../../../../../cascara.common/io/github/qishr/cascara/common/data/TreeData.md)


---

### getTreePath

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTreePath__()</span>




---

### isBranch

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isBranch__()</span>




---

### getDataContext

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> __getDataContext__()</span>




---

