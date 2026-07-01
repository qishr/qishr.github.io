Package [io.github.qishr.cascara.ui.data](index.md)

# Class ColumnMetadata
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.form.FieldMetadata](../form/FieldMetadata.md)<br/>
                io.github.qishr.cascara.ui.data.ColumnMetadata<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColumnMetadata__<br/>extends [FieldMetadata](../form/FieldMetadata.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title, [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema, [RendererFactory](../render/RendererFactory.md) rendererFactory, javafx.util.Callback<javafx.scene.control.TableColumn<[ObservableObject](ObservableObject.md), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> cellFactory) |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title, [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema, [RendererFactory](../render/RendererFactory.md) rendererFactory)                                                                                                                                                                                                           |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title, [Renderer](../api/render/Renderer.md) renderer)                                                                                                                                                                                                                                                                                                      |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title)                                                                                                                                                                                                                                                                                                                                                      |             |
| ColumnMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                                                                                                                          |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [bindTitle](#bindtitle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)             |             |
| public [TypeDescriptor](../../cascara.common/lang/type/TypeDescriptor.md)<?>                        | [getTypeDescriptor](#gettypedescriptor)()                                                                                             |             |
| public java.util.Comparator<javafx.beans.value.ObservableValue<?>                                   | [getComparator](#getcomparator)()                                                                                                     |             |
| public double                                                                                       | [getMinWidth](#getminwidth)()                                                                                                         |             |
| public double                                                                                       | [getPrefWidth](#getprefwidth)()                                                                                                       |             |
| public double                                                                                       | [getMaxWidth](#getmaxwidth)()                                                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCellStyle](#getcellstyle)()                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getHeaderStyle](#getheaderstyle)()                                                                                                   |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setTypeDescriptor](#settypedescriptor)([TypeDescriptor](../../cascara.common/lang/type/TypeDescriptor.md)<?> v)                      |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setComparator](#setcomparator)(java.util.Comparator<javafx.beans.value.ObservableValue<?> v)                                         |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setMinWidth](#setminwidth)(double value)                                                                                             |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setPrefWidth](#setprefwidth)(double value)                                                                                           |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setMaxWidth](#setmaxwidth)(double value)                                                                                             |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setCellStyle](#setcellstyle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)     |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setHeaderStyle](#setheaderstyle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |
| public [ColumnMetadata](ColumnMetadata.md)                                                          | [setAllowEdit](#setallowedit)(boolean v)                                                                                              |             |


### Methods inherited from [FieldMetadata](../form/FieldMetadata.md)

titleProperty, isHidden, allowAdd, getTitle, setColumnMetaList, setOnChange, hasDisplayToggle, isBooleanField, getProviderParameter, getRemoveRowHandler, setRemoveRowHandler, getItemsSchema, hasMediaType, getAddRowHandler, getName, isStringField, isArrayField, getOptionProvider, setDataContext, getSchema, setAddRowHandler, getOnChange, setOptionProvider, hasOptionProvider, allowDelete, getSchemaType, setRenderers, isObjectField, nameProperty, allowEdit, getFormat, hasProviderParameter, getRendererFactory, getEnumValues, getDataContext, setTitle, isEnumField, getContentType, getColumnMetaList, getRenderers


## Method Details

### bindTitle

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __bindTitle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public [TypeDescriptor](../../cascara.common/lang/type/TypeDescriptor.md)<?> __getTypeDescriptor__()</span>




---

### getComparator

<span style="font-family: monospace; font-size: 80%;">public java.util.Comparator<javafx.beans.value.ObservableValue<?> __getComparator__()</span>




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

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setTypeDescriptor__([TypeDescriptor](../../cascara.common/lang/type/TypeDescriptor.md)<?> v)</span>




---

### setComparator

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setComparator__(java.util.Comparator<javafx.beans.value.ObservableValue<?> v)</span>




---

### setMinWidth

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setMinWidth__(double value)</span>




---

### setPrefWidth

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setPrefWidth__(double value)</span>




---

### setMaxWidth

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setMaxWidth__(double value)</span>




---

### setCellStyle

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setCellStyle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### setHeaderStyle

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setHeaderStyle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### setAllowEdit

<span style="font-family: monospace; font-size: 80%;">public [ColumnMetadata](ColumnMetadata.md) __setAllowEdit__(boolean v)</span>




---

