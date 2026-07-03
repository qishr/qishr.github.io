Package [io.github.qishr.cascara.ui.form](index.md)

# Class ObjectFieldFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.form.AbstractFieldFactory](AbstractFieldFactory.md)<br/>
                io.github.qishr.cascara.ui.form.ObjectFieldFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ObjectFieldFactory__<br/>extends [AbstractFieldFactory](AbstractFieldFactory.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                              | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ObjectFieldFactory([ObservableObject](../data/ObservableObject.md) object)                                                                                                                                                                               |             |
| ObjectFieldFactory([ObservableObject](../data/ObservableObject.md) object, [ServiceProviderLayer](../../cascara.common/service/ServiceProviderLayer.md) moduleLayer)                                                                                     |             |
| ObjectFieldFactory([ObservableTableData](../api/data/ObservableTableData.md) object, [Schema](../../cascara.schema/schema/Schema.md) schema)                                                                                                             |             |
| ObjectFieldFactory([ObservableTableData](../api/data/ObservableTableData.md) object, [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)                                                                                           |             |
| ObjectFieldFactory([ObservableTableData](../api/data/ObservableTableData.md) object, [Schema](../../cascara.schema/schema/Schema.md) schema, [ServiceProviderLayer](../../cascara.common/service/ServiceProviderLayer.md) moduleLayer)                   |             |
| ObjectFieldFactory([ObservableTableData](../api/data/ObservableTableData.md) object, [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema, [ServiceProviderLayer](../../cascara.common/service/ServiceProviderLayer.md) moduleLayer) |             |



## Method Summary

| Modifier and Type        | Method                                                                                                                                            | Description |
|--------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void              | [setObject](#setobject)([ObservableTableData](../api/data/ObservableTableData.md) object)                                                         |             |
| public [Field](Field.md) | [createLabeledField](#createlabeledfield)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fieldName) |             |
| public [Field](Field.md) | [createField](#createfield)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fieldName)               |             |


### Methods inherited from [AbstractFieldFactory](AbstractFieldFactory.md)

createControl, notifyDocumentChanged, getUri, setOnChangeFieldValue, setDataProvider, setOnRefreshForm, setUri


## Method Details

### setObject

<span style="font-family: monospace; font-size: 80%;">public void __setObject__([ObservableTableData](../api/data/ObservableTableData.md) object)</span>




---

### createLabeledField

<span style="font-family: monospace; font-size: 80%;">public [Field](Field.md) __createLabeledField__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fieldName)</span>



**Throws:**

[UiDataException](../data/UiDataException.md)


---

### createField

<span style="font-family: monospace; font-size: 80%;">public [Field](Field.md) __createField__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fieldName)</span>



**Throws:**

[UiDataException](../data/UiDataException.md)


---

