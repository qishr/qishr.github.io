Package [io.github.qishr.cascara.ui.form](index.md)

# Class FieldMetadata
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.form.FieldMetadata<br/>
<br/>
Direct Known Subtypes:<br/>
    [ColumnMetadata](../data/ColumnMetadata.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __FieldMetadata__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                   | Description |
|-------------------|-----------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.ui.form.FieldMetadata.ColumnMeta](FieldMetadata.ColumnMeta.md) |             |



## Field Summary

| Modifier and Type | Field                   | Description |
|-------------------|-------------------------|-------------|
| protected boolean | [allowEdit](#allowedit) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| FieldMetadata([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fieldName, [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) fieldSchema, [RendererFactory](../render/RendererFactory.md) rendererFactory) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                                                                                                                | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                   | [setRenderers](#setrenderers)([Renderers](../render/Renderers.md) renderers)                                                                                                                                          |             |
| public [Renderers](../render/Renderers.md)                                                                                                                                                    | [getRenderers](#getrenderers)()                                                                                                                                                                                       |             |
| public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html)                                                 | [nameProperty](#nameproperty)()                                                                                                                                                                                       |             |
| public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html)                                                 | [titleProperty](#titleproperty)()                                                                                                                                                                                     |             |
| public void                                                                                                                                                                                   | [setDataContext](#setdatacontext)(java.util.Map context)                                                                                                                                                              |             |
| public void                                                                                                                                                                                   | [setColumnMetaList](#setcolumnmetalist)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ColumnMeta](FieldMetadata.ColumnMeta.md)> v)                            |             |
| public void                                                                                                                                                                                   | [setAddRowHandler](#setaddrowhandler)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) addRow)                                                                        |             |
| public void                                                                                                                                                                                   | [setRemoveRowHandler](#setremoverowhandler)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[TableData](../../cascara.common/data/TableData.md)> removeRow) |             |
| public void                                                                                                                                                                                   | [setOnChange](#setonchange)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onChange)                                                                                |             |
| public [FieldMetadata](FieldMetadata.md)                                                                                                                                                      | [setAllowEdit](#setallowedit)(boolean v)                                                                                                                                                                              |             |
| public void                                                                                                                                                                                   | [setTitle](#settitle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)                                                                                                 |             |
| public void                                                                                                                                                                                   | [setOptionProvider](#setoptionprovider)([OptionProvider](../option/OptionProvider.md) v)                                                                                                                              |             |
| public boolean                                                                                                                                                                                | [allowEdit](#allowedit)()                                                                                                                                                                                             |             |
| public boolean                                                                                                                                                                                | [allowDelete](#allowdelete)()                                                                                                                                                                                         |             |
| public boolean                                                                                                                                                                                | [allowAdd](#allowadd)()                                                                                                                                                                                               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getName](#getname)()                                                                                                                                                                                                 |             |
| public [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)                                                                                                                      | [getSchema](#getschema)()                                                                                                                                                                                             |             |
| public [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)                                                                                                                      | [getItemsSchema](#getitemsschema)()                                                                                                                                                                                   |             |
| public [SchemaType](../../cascara.schema/schema/SchemaType.md)                                                                                                                                | [getSchemaType](#getschematype)()                                                                                                                                                                                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getFormat](#getformat)()                                                                                                                                                                                             |             |
| public [OptionProvider](../option/OptionProvider.md)                                                                                                                                          | [getOptionProvider](#getoptionprovider)()                                                                                                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getProviderParameter](#getproviderparameter)()                                                                                                                                                                       |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getEnumValues](#getenumvalues)()                                                                                                                                                                                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getContentType](#getcontenttype)()                                                                                                                                                                                   |             |
| public java.util.Map                                                                                                                                                                          | [getDataContext](#getdatacontext)()                                                                                                                                                                                   |             |
| public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ColumnMeta](FieldMetadata.ColumnMeta.md)>                                        | [getColumnMetaList](#getcolumnmetalist)()                                                                                                                                                                             |             |
| public [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)                                                                                       | [getAddRowHandler](#getaddrowhandler)()                                                                                                                                                                               |             |
| public [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[TableData](../../cascara.common/data/TableData.md)>                         | [getRemoveRowHandler](#getremoverowhandler)()                                                                                                                                                                         |             |
| public [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)                                                                                       | [getOnChange](#getonchange)()                                                                                                                                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getTitle](#gettitle)()                                                                                                                                                                                               |             |
| public [RendererFactory](../render/RendererFactory.md)                                                                                                                                        | [getRendererFactory](#getrendererfactory)()                                                                                                                                                                           |             |
| public boolean                                                                                                                                                                                | [isHidden](#ishidden)()                                                                                                                                                                                               |             |
| public boolean                                                                                                                                                                                | [hasOptionProvider](#hasoptionprovider)()                                                                                                                                                                             |             |
| public boolean                                                                                                                                                                                | [hasProviderParameter](#hasproviderparameter)()                                                                                                                                                                       |             |
| public boolean                                                                                                                                                                                | [hasDisplayToggle](#hasdisplaytoggle)()                                                                                                                                                                               |             |
| public boolean                                                                                                                                                                                | [isArrayField](#isarrayfield)()                                                                                                                                                                                       |             |
| public boolean                                                                                                                                                                                | [isObjectField](#isobjectfield)()                                                                                                                                                                                     |             |
| public boolean                                                                                                                                                                                | [hasMediaType](#hasmediatype)()                                                                                                                                                                                       |             |
| public boolean                                                                                                                                                                                | [isStringField](#isstringfield)()                                                                                                                                                                                     |             |
| public boolean                                                                                                                                                                                | [isBooleanField](#isbooleanfield)()                                                                                                                                                                                   |             |
| public boolean                                                                                                                                                                                | [isEnumField](#isenumfield)()                                                                                                                                                                                         |             |



## Field Details

### allowEdit

<span style="font-family: monospace; font-size: 80%;">protected boolean __allowEdit__</span>




---


## Method Details

### setRenderers

<span style="font-family: monospace; font-size: 80%;">public void __setRenderers__([Renderers](../render/Renderers.md) renderers)</span>




---

### getRenderers

<span style="font-family: monospace; font-size: 80%;">public [Renderers](../render/Renderers.md) __getRenderers__()</span>




---

### nameProperty

<span style="font-family: monospace; font-size: 80%;">public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html) __nameProperty__()</span>




---

### titleProperty

<span style="font-family: monospace; font-size: 80%;">public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html) __titleProperty__()</span>




---

### setDataContext

<span style="font-family: monospace; font-size: 80%;">public void __setDataContext__(java.util.Map context)</span>




---

### setColumnMetaList

<span style="font-family: monospace; font-size: 80%;">public void __setColumnMetaList__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ColumnMeta](FieldMetadata.ColumnMeta.md)> v)</span>




---

### setAddRowHandler

<span style="font-family: monospace; font-size: 80%;">public void __setAddRowHandler__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) addRow)</span>




---

### setRemoveRowHandler

<span style="font-family: monospace; font-size: 80%;">public void __setRemoveRowHandler__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[TableData](../../cascara.common/data/TableData.md)> removeRow)</span>




---

### setOnChange

<span style="font-family: monospace; font-size: 80%;">public void __setOnChange__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onChange)</span>




---

### setAllowEdit

<span style="font-family: monospace; font-size: 80%;">public [FieldMetadata](FieldMetadata.md) __setAllowEdit__(boolean v)</span>




---

### setTitle

<span style="font-family: monospace; font-size: 80%;">public void __setTitle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)</span>




---

### setOptionProvider

<span style="font-family: monospace; font-size: 80%;">public void __setOptionProvider__([OptionProvider](../option/OptionProvider.md) v)</span>




---

### allowEdit

<span style="font-family: monospace; font-size: 80%;">public boolean __allowEdit__()</span>




---

### allowDelete

<span style="font-family: monospace; font-size: 80%;">public boolean __allowDelete__()</span>




---

### allowAdd

<span style="font-family: monospace; font-size: 80%;">public boolean __allowAdd__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) __getSchema__()</span>




---

### getItemsSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) __getItemsSchema__()</span>




---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public [SchemaType](../../cascara.schema/schema/SchemaType.md) __getSchemaType__()</span>




---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>




---

### getOptionProvider

<span style="font-family: monospace; font-size: 80%;">public [OptionProvider](../option/OptionProvider.md) __getOptionProvider__()</span>




---

### getProviderParameter

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getProviderParameter__()</span>




---

### getEnumValues

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getEnumValues__()</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>




---

### getDataContext

<span style="font-family: monospace; font-size: 80%;">public java.util.Map __getDataContext__()</span>




---

### getColumnMetaList

<span style="font-family: monospace; font-size: 80%;">public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ColumnMeta](FieldMetadata.ColumnMeta.md)> __getColumnMetaList__()</span>




---

### getAddRowHandler

<span style="font-family: monospace; font-size: 80%;">public [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) __getAddRowHandler__()</span>




---

### getRemoveRowHandler

<span style="font-family: monospace; font-size: 80%;">public [Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[TableData](../../cascara.common/data/TableData.md)> __getRemoveRowHandler__()</span>




---

### getOnChange

<span style="font-family: monospace; font-size: 80%;">public [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) __getOnChange__()</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__()</span>




---

### getRendererFactory

<span style="font-family: monospace; font-size: 80%;">public [RendererFactory](../render/RendererFactory.md) __getRendererFactory__()</span>




---

### isHidden

<span style="font-family: monospace; font-size: 80%;">public boolean __isHidden__()</span>




---

### hasOptionProvider

<span style="font-family: monospace; font-size: 80%;">public boolean __hasOptionProvider__()</span>




---

### hasProviderParameter

<span style="font-family: monospace; font-size: 80%;">public boolean __hasProviderParameter__()</span>




---

### hasDisplayToggle

<span style="font-family: monospace; font-size: 80%;">public boolean __hasDisplayToggle__()</span>




---

### isArrayField

<span style="font-family: monospace; font-size: 80%;">public boolean __isArrayField__()</span>




---

### isObjectField

<span style="font-family: monospace; font-size: 80%;">public boolean __isObjectField__()</span>




---

### hasMediaType

<span style="font-family: monospace; font-size: 80%;">public boolean __hasMediaType__()</span>




---

### isStringField

<span style="font-family: monospace; font-size: 80%;">public boolean __isStringField__()</span>




---

### isBooleanField

<span style="font-family: monospace; font-size: 80%;">public boolean __isBooleanField__()</span>




---

### isEnumField

<span style="font-family: monospace; font-size: 80%;">public boolean __isEnumField__()</span>




---

