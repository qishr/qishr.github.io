Package [io.github.qishr.cascara.ui.control](index.md)

# Class CascaraTable
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.StackPane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/StackPane.html)<br/>
                                                io.github.qishr.cascara.ui.control.CascaraTable<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CascaraTable__<br/>extends [StackPane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/StackPane.html)
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                  | Description |
|-------------------|--------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.ui.control.CascaraTable.BottomArea](CascaraTable.BottomArea.md)               |             |
| public            | [io.github.qishr.cascara.ui.control.CascaraTable.DragDropConstants](CascaraTable.DragDropConstants.md) |             |



## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| CascaraTable() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                         | Method                                                                                                                                                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                               | [setAllowEdit](#setallowedit)(boolean v)                                                                                                                                                                                                             |             |
| public [DoubleProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/DoubleProperty.html)                                                             | [fixedCellSizeProperty](#fixedcellsizeproperty)()                                                                                                                                                                                                    |             |
| public [Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html)                                                                                                       | [getFixedCellSize](#getfixedcellsize)()                                                                                                                                                                                                              |             |
| public void                                                                                                                                                                                               | [setFixedCellSize](#setfixedcellsize)([Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html) v)                                                                                                                |             |
| public void                                                                                                                                                                                               | [setColumnMetadata](#setcolumnmetadata)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ColumnMetadata](../data/ColumnMetadata.md)> metadata)                                                    |             |
| public void                                                                                                                                                                                               | [setDataSource](#setdatasource)([ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<? extends [ObservableTableData](../api/data/ObservableTableData.md)> dataSource) |             |
| public boolean                                                                                                                                                                                            | [canReorder](#canreorder)()                                                                                                                                                                                                                          |             |
| public void                                                                                                                                                                                               | [setAllowReorder](#setallowreorder)(boolean b)                                                                                                                                                                                                       |             |
| public void                                                                                                                                                                                               | [setOnRemoveRowClicked](#setonremoverowclicked)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[ObservableTableData](../api/data/ObservableTableData.md)> handler)                        |             |
| public void                                                                                                                                                                                               | [setOnAddRowClicked](#setonaddrowclicked)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)                                                                                                  |             |
| public void                                                                                                                                                                                               | [setSortColumnIndex](#setsortcolumnindex)(int n)                                                                                                                                                                                                     |             |
| public void                                                                                                                                                                                               | [setOnRowClicked](#setonrowclicked)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[ObservableTableData](../api/data/ObservableTableData.md)> handler)                                    |             |
| public void                                                                                                                                                                                               | [setOnRowDoubleClicked](#setonrowdoubleclicked)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[ObservableTableData](../api/data/ObservableTableData.md)> handler)                        |             |
| public void                                                                                                                                                                                               | [setOnContextMenuRequested](#setoncontextmenurequested)([ContextMenuHandler](CascaraTable.ContextMenuHandler.md) handler)                                                                                                                            |             |
| public void                                                                                                                                                                                               | [setShowHeaders](#setshowheaders)(boolean show)                                                                                                                                                                                                      |             |
| public void                                                                                                                                                                                               | [setAutoScroll](#setautoscroll)(boolean autoScroll)                                                                                                                                                                                                  |             |
| public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[ObservableTableData](../api/data/ObservableTableData.md)>  | [selectedRowProperty](#selectedrowproperty)()                                                                                                                                                                                                        |             |
| public [TableData](../../cascara.common/data/TableData.md)                                                                                                                                                | [getSelectedRow](#getselectedrow)()                                                                                                                                                                                                                  |             |
| public void                                                                                                                                                                                               | [setSelectedRow](#setselectedrow)([ObservableTableData](../api/data/ObservableTableData.md) data)                                                                                                                                                    |             |
| public [ObservableTableData](../api/data/ObservableTableData.md)                                                                                                                                          | [getRow](#getrow)(int n)                                                                                                                                                                                                                             |             |
| public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<? extends [TableData](../../cascara.common/data/TableData.md)> | [getItems](#getitems)()                                                                                                                                                                                                                              |             |
| public void                                                                                                                                                                                               | [initializeScroll](#initializescroll)()                                                                                                                                                                                                              |             |
| public void                                                                                                                                                                                               | [setOnDraggedAndDropped](#setondraggedanddropped)([MoveFromHandler](CascaraTable.MoveFromHandler.md)<[ObservableObject](../data/ObservableObject.md)> handler)                                                                                       |             |
| public [CustomizableArea](../api/CustomizableArea.md)                                                                                                                                                     | [getBottomArea](#getbottomarea)()                                                                                                                                                                                                                    |             |



## Method Details

### setAllowEdit

<span style="font-family: monospace; font-size: 80%;">public void __setAllowEdit__(boolean v)</span>




---

### fixedCellSizeProperty

<span style="font-family: monospace; font-size: 80%;">public [DoubleProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/DoubleProperty.html) __fixedCellSizeProperty__()</span>




---

### getFixedCellSize

<span style="font-family: monospace; font-size: 80%;">public [Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html) __getFixedCellSize__()</span>




---

### setFixedCellSize

<span style="font-family: monospace; font-size: 80%;">public void __setFixedCellSize__([Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html) v)</span>




---

### setColumnMetadata

<span style="font-family: monospace; font-size: 80%;">public void __setColumnMetadata__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ColumnMetadata](../data/ColumnMetadata.md)> metadata)</span>




---

### setDataSource

<span style="font-family: monospace; font-size: 80%;">public void __setDataSource__([ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<? extends [ObservableTableData](../api/data/ObservableTableData.md)> dataSource)</span>




---

### canReorder

<span style="font-family: monospace; font-size: 80%;">public boolean __canReorder__()</span>




---

### setAllowReorder

<span style="font-family: monospace; font-size: 80%;">public void __setAllowReorder__(boolean b)</span>




---

### setOnRemoveRowClicked

<span style="font-family: monospace; font-size: 80%;">public void __setOnRemoveRowClicked__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[ObservableTableData](../api/data/ObservableTableData.md)> handler)</span>




---

### setOnAddRowClicked

<span style="font-family: monospace; font-size: 80%;">public void __setOnAddRowClicked__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

### setSortColumnIndex

<span style="font-family: monospace; font-size: 80%;">public void __setSortColumnIndex__(int n)</span>




---

### setOnRowClicked

<span style="font-family: monospace; font-size: 80%;">public void __setOnRowClicked__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[ObservableTableData](../api/data/ObservableTableData.md)> handler)</span>




---

### setOnRowDoubleClicked

<span style="font-family: monospace; font-size: 80%;">public void __setOnRowDoubleClicked__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[ObservableTableData](../api/data/ObservableTableData.md)> handler)</span>




---

### setOnContextMenuRequested

<span style="font-family: monospace; font-size: 80%;">public void __setOnContextMenuRequested__([ContextMenuHandler](CascaraTable.ContextMenuHandler.md) handler)</span>




---

### setShowHeaders

<span style="font-family: monospace; font-size: 80%;">public void __setShowHeaders__(boolean show)</span>




---

### setAutoScroll

<span style="font-family: monospace; font-size: 80%;">public void __setAutoScroll__(boolean autoScroll)</span>




---

### selectedRowProperty

<span style="font-family: monospace; font-size: 80%;">public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[ObservableTableData](../api/data/ObservableTableData.md)> __selectedRowProperty__()</span>




---

### getSelectedRow

<span style="font-family: monospace; font-size: 80%;">public [TableData](../../cascara.common/data/TableData.md) __getSelectedRow__()</span>




---

### setSelectedRow

<span style="font-family: monospace; font-size: 80%;">public void __setSelectedRow__([ObservableTableData](../api/data/ObservableTableData.md) data)</span>




---

### getRow

<span style="font-family: monospace; font-size: 80%;">public [ObservableTableData](../api/data/ObservableTableData.md) __getRow__(int n)</span>




---

### getItems

<span style="font-family: monospace; font-size: 80%;">public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<? extends [TableData](../../cascara.common/data/TableData.md)> __getItems__()</span>




---

### initializeScroll

<span style="font-family: monospace; font-size: 80%;">public void __initializeScroll__()</span>




---

### setOnDraggedAndDropped

<span style="font-family: monospace; font-size: 80%;">public void __setOnDraggedAndDropped__([MoveFromHandler](CascaraTable.MoveFromHandler.md)<[ObservableObject](../data/ObservableObject.md)> handler)</span>




---

### getBottomArea

<span style="font-family: monospace; font-size: 80%;">public [CustomizableArea](../api/CustomizableArea.md) __getBottomArea__()</span>




---

