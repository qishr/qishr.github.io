Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchematicObject
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.trackable.AbstractTrackable](../../../cascara.common/trackable/AbstractTrackable.md)<br/>
                [io.github.qishr.cascara.common.trackable.TrackableObject](../../../cascara.common/trackable/TrackableObject.md)<br/>
                        io.github.qishr.cascara.schema.util.SchematicObject<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SchematicObject__<br/>extends [TrackableObject](../../../cascara.common/trackable/TrackableObject.md)
</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| SchematicObject() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                               | Method                                                                                                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public final [SchemaNode](../structure/SchemaNode.md)                                                                                                                                           | [getObjectSchema](#getobjectschema)()                                                                                                                                                                             |             |
| public final void                                                                                                                                                                               | [setObjectSchema](#setobjectschema)([SchemaNode](../structure/SchemaNode.md) schema)                                                                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                             | [getContentType](#getcontenttype)()                                                                                                                                                                               |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>     | [getPropertyNames](#getpropertynames)()                                                                                                                                                                           |             |
| public void                                                                                                                                                                                     | [createObservableProperty](#createobservableproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [SchemaNode](../structure/SchemaNode.md) propertySchema)  |             |
| public void                                                                                                                                                                                     | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) |             |
| public final [TrackableProperty](../../../cascara.common/trackable/property/TrackableProperty.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [displayStringProperty](#displaystringproperty)()                                                                                                                                                                 |             |
| public final [TrackableProperty](../../../cascara.common/trackable/property/TrackableProperty.md)<[SchemaNode](../structure/SchemaNode.md)>                                                     | [objectSchemaProperty](#objectschemaproperty)()                                                                                                                                                                   |             |


### Methods inherited from [AbstractTrackable](../../../cascara.common/trackable/AbstractTrackable.md)

addTracker, invalidate, removeTracker

### Methods inherited from [TrackableObject](../../../cascara.common/trackable/TrackableObject.md)

setAdditionalPropertiesAllowed, getTrackableArray, getUri, putUserData, getString, getTrackable, getTrackables, getInteger, getPath, getValues, getObjectProperty, getDataContext, getLong, getTrackablesMap, get, getUserData, additionalPropertiesAllowed, getValuesMap, getBoolean


## Method Details

### getObjectSchema

<span style="font-family: monospace; font-size: 80%;">public final [SchemaNode](../structure/SchemaNode.md) __getObjectSchema__()</span>




---

### setObjectSchema

<span style="font-family: monospace; font-size: 80%;">public final void __setObjectSchema__([SchemaNode](../structure/SchemaNode.md) schema)</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>




---

### getPropertyNames

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getPropertyNames__()</span>




---

### createObservableProperty

<span style="font-family: monospace; font-size: 80%;">public void __createObservableProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [SchemaNode](../structure/SchemaNode.md) propertySchema)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public void __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>



**Overrides:**

[TrackableObject](../cascara.common/trackable/TrackableObject.md#set)


---

### displayStringProperty

<span style="font-family: monospace; font-size: 80%;">public final [TrackableProperty](../../../cascara.common/trackable/property/TrackableProperty.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __displayStringProperty__()</span>




---

### objectSchemaProperty

<span style="font-family: monospace; font-size: 80%;">public final [TrackableProperty](../../../cascara.common/trackable/property/TrackableProperty.md)<[SchemaNode](../structure/SchemaNode.md)> __objectSchemaProperty__()</span>




---

