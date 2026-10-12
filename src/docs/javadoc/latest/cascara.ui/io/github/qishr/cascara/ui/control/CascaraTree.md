Package [io.github.qishr.cascara.ui.control](index.md)

# Class CascaraTree
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.StackPane](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/StackPane.html)<br/>
                                                io.github.qishr.cascara.ui.control.CascaraTree<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CascaraTree__<br/>extends [StackPane](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/StackPane.html)
</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| CascaraTree() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                      | Description |
|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                     | [setAllowEdit](#setallowedit)(boolean v)                                                                                                                                                                                                    |             |
| public void                                                                                                     | [setAutoExpand](#setautoexpand)(boolean expand)                                                                                                                                                                                             |             |
| public void                                                                                                     | [setDisplayDisclosureToggles](#setdisplaydisclosuretoggles)(boolean v)                                                                                                                                                                      |             |
| public void                                                                                                     | [setLazy](#setlazy)(boolean lazy)                                                                                                                                                                                                           |             |
| public void                                                                                                     | [setColumnMetadata](#setcolumnmetadata)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)> metadata) |             |
| public void                                                                                                     | [setDataSource](#setdatasource)([ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)<T> dataSource)                                                                                           |             |
| public void                                                                                                     | [setSortColumnIndex](#setsortcolumnindex)(int n)                                                                                                                                                                                            |             |
| public void                                                                                                     | [setOnRowClicked](#setonrowclicked)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<T> handler)                                                                                   |             |
| public void                                                                                                     | [setOnRowDoubleClicked](#setonrowdoubleclicked)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<T> handler)                                                                       |             |
| public void                                                                                                     | [setOnContextMenuRequested](#setoncontextmenurequested)([ContextMenuHandler](../../../../../../io/github/qishr/cascara/ui/control/CascaraTree.ContextMenuHandler.md)<T> handler)                                                            |             |
| public void                                                                                                     | [setShowHeaders](#setshowheaders)(boolean show)                                                                                                                                                                                             |             |
| public [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<T> | [selectedRowProperty](#selectedrowproperty)()                                                                                                                                                                                               |             |
| public T                                                                                                        | [getSelectedRow](#getselectedrow)()                                                                                                                                                                                                         |             |
| public void                                                                                                     | [setSelection](#setselection)(T data)                                                                                                                                                                                                       |             |
| public T                                                                                                        | [findTreeItem](#findtreeitem)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)                                                                                                            |             |
| public void                                                                                                     | [selectAndScrollTo](#selectandscrollto)(T data)                                                                                                                                                                                             |             |
| public void                                                                                                     | [collapseOthers](#collapseothers)(T targetData)                                                                                                                                                                                             |             |



## Method Details

### setAllowEdit

<span style="font-family: monospace; font-size: 80%;">public void __setAllowEdit__(boolean v)</span>




---

### setAutoExpand

<span style="font-family: monospace; font-size: 80%;">public void __setAutoExpand__(boolean expand)</span>




---

### setDisplayDisclosureToggles

<span style="font-family: monospace; font-size: 80%;">public void __setDisplayDisclosureToggles__(boolean v)</span>




---

### setLazy

<span style="font-family: monospace; font-size: 80%;">public void __setLazy__(boolean lazy)</span>




---

### setColumnMetadata

<span style="font-family: monospace; font-size: 80%;">public void __setColumnMetadata__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)> metadata)</span>




---

### setDataSource

<span style="font-family: monospace; font-size: 80%;">public void __setDataSource__([ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)<T> dataSource)</span>




---

### setSortColumnIndex

<span style="font-family: monospace; font-size: 80%;">public void __setSortColumnIndex__(int n)</span>




---

### setOnRowClicked

<span style="font-family: monospace; font-size: 80%;">public void __setOnRowClicked__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<T> handler)</span>




---

### setOnRowDoubleClicked

<span style="font-family: monospace; font-size: 80%;">public void __setOnRowDoubleClicked__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<T> handler)</span>




---

### setOnContextMenuRequested

<span style="font-family: monospace; font-size: 80%;">public void __setOnContextMenuRequested__([ContextMenuHandler](../../../../../../io/github/qishr/cascara/ui/control/CascaraTree.ContextMenuHandler.md)<T> handler)</span>




---

### setShowHeaders

<span style="font-family: monospace; font-size: 80%;">public void __setShowHeaders__(boolean show)</span>




---

### selectedRowProperty

<span style="font-family: monospace; font-size: 80%;">public [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<T> __selectedRowProperty__()</span>




---

### getSelectedRow

<span style="font-family: monospace; font-size: 80%;">public T __getSelectedRow__()</span>




---

### setSelection

<span style="font-family: monospace; font-size: 80%;">public void __setSelection__(T data)</span>




---

### findTreeItem

<span style="font-family: monospace; font-size: 80%;">public T __findTreeItem__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>




---

### selectAndScrollTo

<span style="font-family: monospace; font-size: 80%;">public void __selectAndScrollTo__(T data)</span>




---

### collapseOthers

<span style="font-family: monospace; font-size: 80%;">public void __collapseOthers__(T targetData)</span>




---

