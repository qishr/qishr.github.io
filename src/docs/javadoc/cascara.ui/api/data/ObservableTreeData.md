Package [io.github.qishr.cascara.ui.api.data](index.md)

# Interface ObservableTreeData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.data.ObservableTreeData<br/>
<br/>
All Implemented Interfaces:<br/>
    [ObservableTableData](ObservableTableData.md), [TreeData](../../../cascara.common/data/TreeData.md)<T, V>

All Known Implementing Classes:<br/>
    [ObservableTreeNode](../../data/ObservableTreeNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ObservableTreeData__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                              | Description |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getNodeName](#getnodename)()       |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getTreePath](#gettreepath)()       |             |
| public abstract boolean                                                                                      | [isBranch](#isbranch)()             |             |
| public abstract java.util.Map                                                                                | [getDataContext](#getdatacontext)() |             |



## Method Details

### getNodeName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getNodeName__()</span>



**Specified By:**

[TreeData](../../../cascara.common/data/TreeData.md)


---

### getTreePath

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTreePath__()</span>




---

### isBranch

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isBranch__()</span>




---

### getDataContext

<span style="font-family: monospace; font-size: 80%;">public abstract java.util.Map __getDataContext__()</span>




---

