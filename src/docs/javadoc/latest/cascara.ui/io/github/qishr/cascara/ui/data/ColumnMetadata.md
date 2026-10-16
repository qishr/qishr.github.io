Package [io.github.qishr.cascara.ui.data](index.md)

# Class ColumnMetadata
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.form.FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md)<br/>
                io.github.qishr.cascara.ui.data.ColumnMetadata<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColumnMetadata__<br/>extends [FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title, [SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema, [RendererFactory](../../../../../../io/github/qishr/cascara/ui/render/RendererFactory.md) rendererFactory, [Callback](https://openjfx.io/javadoc/25/javafx.base/javafx/util/Callback.html)<[TableColumn](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/TableColumn.html)<[ObservableObject](../../../../../../io/github/qishr/cascara/ui/data/ObservableObject.md), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>, [TableCell](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/TableCell.html)<[ObservableObject](../../../../../../io/github/qishr/cascara/ui/data/ObservableObject.md), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>> cellFactory) |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title, [SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema, [RendererFactory](../../../../../../io/github/qishr/cascara/ui/render/RendererFactory.md) rendererFactory)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title, [Renderer](../../../../../../io/github/qishr/cascara/ui/api/render/Renderer.md) renderer)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                    | Method                                                                                                                                                                                                                                           | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [bindTitle](#bindtitle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                        |             |
| public [TypeDescriptor](../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeDescriptor.md)<?>                                                                                                | [getTypeDescriptor](#gettypedescriptor)()                                                                                                                                                                                                        |             |
| public [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[ObservableValue](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/value/ObservableValue.html)<?>> | [getComparator](#getcomparator)()                                                                                                                                                                                                                |             |
| public double                                                                                                                                                                                                        | [getMinWidth](#getminwidth)()                                                                                                                                                                                                                    |             |
| public double                                                                                                                                                                                                        | [getPrefWidth](#getprefwidth)()                                                                                                                                                                                                                  |             |
| public double                                                                                                                                                                                                        | [getMaxWidth](#getmaxwidth)()                                                                                                                                                                                                                    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                  | [getCellStyle](#getcellstyle)()                                                                                                                                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                  | [getHeaderStyle](#getheaderstyle)()                                                                                                                                                                                                              |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setTypeDescriptor](#settypedescriptor)([TypeDescriptor](../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeDescriptor.md)<?> v)                                                                                        |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setComparator](#setcomparator)([Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[ObservableValue](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/value/ObservableValue.html)<?>> v) |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setMinWidth](#setminwidth)(double value)                                                                                                                                                                                                        |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setPrefWidth](#setprefwidth)(double value)                                                                                                                                                                                                      |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setMaxWidth](#setmaxwidth)(double value)                                                                                                                                                                                                        |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setCellStyle](#setcellstyle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                                                                                                                |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setHeaderStyle](#setheaderstyle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                                                                                                            |             |
| public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md)                                                                                                                         | [setAllowEdit](#setallowedit)(boolean v)                                                                                                                                                                                                         |             |


### Methods inherited from [FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md)

titleProperty, isHidden, allowAdd, getTitle, setColumnMetaList, setOnChange, hasDisplayToggle, isBooleanField, getProviderParameter, getRemoveRowHandler, setRemoveRowHandler, getItemsSchema, hasMediaType, getAddRowHandler, getName, isStringField, isArrayField, getOptionProvider, setDataContext, getSchema, setAddRowHandler, getOnChange, setOptionProvider, hasOptionProvider, allowDelete, getSchemaType, setRenderers, isObjectField, nameProperty, allowEdit, getFormat, hasProviderParameter, getRendererFactory, getEnumValues, getDataContext, setTitle, isEnumField, getContentType, getColumnMetaList, getRenderers


## Method Details

### bindTitle

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __bindTitle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public [TypeDescriptor](../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeDescriptor.md)<?> __getTypeDescriptor__()</span>




---

### getComparator

<span style="font-family: monospace; font-size: 80%;">public [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[ObservableValue](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/value/ObservableValue.html)<?>> __getComparator__()</span>




---

### getMinWidth

<span style="font-family: monospace; font-size: 80%;">public double __getMinWidth__()</span>




---

### getPrefWidth

<span style="font-family: monospace; font-size: 80%;">public double __getPrefWidth__()</span>




---

### getMaxWidth

<span style="font-family: monospace; font-size: 80%;">public double __getMaxWidth__()</span>




---

### getCellStyle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCellStyle__()</span>




---

### getHeaderStyle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getHeaderStyle__()</span>




---

### setTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setTypeDescriptor__([TypeDescriptor](../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeDescriptor.md)<?> v)</span>




---

### setComparator

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setComparator__([Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[ObservableValue](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/value/ObservableValue.html)<?>> v)</span>




---

### setMinWidth

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setMinWidth__(double value)</span>




---

### setPrefWidth

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setPrefWidth__(double value)</span>




---

### setMaxWidth

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setMaxWidth__(double value)</span>




---

### setCellStyle

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setCellStyle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### setHeaderStyle

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setHeaderStyle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### setAllowEdit

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](../../../../../../io/github/qishr/cascara/ui/data/ColumnMetadata.md) __setAllowEdit__(boolean v)</span>




---

