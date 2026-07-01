Package [io.github.qishr.cascara.ui.data](index.md)

# Class ObservableObject
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.data.ObservableObject<br/>
<br/>
All Implemented Interfaces:<br/>
    [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html), [ObservableTableData](../api/data/ObservableTableData.md)

Direct Known Subtypes:<br/>
    [ObservableProperty](ObservableProperty.md), [ObservableTreeNode](ObservableTreeNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ObservableObject__</span>

Properties shared between object and tree


## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| ObservableObject() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                                        | Method                                                                                                                                                                                                                                    | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public final [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)                                                                                                                                                                                                                                           | [getObjectSchema](#getobjectschema)()                                                                                                                                                                                                     |             |
| public final void                                                                                                                                                                                                                                                                                                        | [setObjectSchema](#setobjectschema)([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)                                                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                                                      | [getContentType](#getcontenttype)()                                                                                                                                                                                                       |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                                                              | [getPropertyNames](#getpropertynames)()                                                                                                                                                                                                   |             |
| public final [PropertyMetadata](PropertyMetadata.md)                                                                                                                                                                                                                                                                     | [getPropertyMetadata](#getpropertymetadata)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                            |             |
| public void                                                                                                                                                                                                                                                                                                              | [createObservableProperty](#createobservableproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) propertySchema) |             |
| public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                          | [getValuesMap](#getvaluesmap)()                                                                                                                                                                                                           |             |
| public final [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                                              | [getValues](#getvalues)()                                                                                                                                                                                                                 |             |
| public final [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)[]                                                                                                                                                                                     | [getObservables](#getobservables)()                                                                                                                                                                                                       |             |
| public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)> | [getObservablesMap](#getobservablesmap)()                                                                                                                                                                                                 |             |
| public final [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)                                                                                                                                                                                       | [getObservable](#getobservable)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                         |             |
| public final [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<?>                                                                                                                                                                      | [getObservableList](#getobservablelist)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                 |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)                                                                                                                                                                      | [getObjectProperty](#getobjectproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                 |             |
| public java.util.Map                                                                                                                                                                                                                                                                                                     | [getDataContext](#getdatacontext)()                                                                                                                                                                                                       |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                                                      | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                             |             |
| public final [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)                                                                                                                                                                                                              | [getBoolean](#getboolean)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                               |             |
| public final [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html)                                                                                                                                                                                                              | [getInteger](#getinteger)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                               |             |
| public final [Long](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Long.html)                                                                                                                                                                                                                    | [getLong](#getlong)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                     |             |
| public final [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                                                                                                                | [getPath](#getpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                     |             |
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                                                | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                 |             |
| public final [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                                                                                                                                                                                       | [getUri](#geturi)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                       |             |
| public void                                                                                                                                                                                                                                                                                                              | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                         |             |
| public void                                                                                                                                                                                                                                                                                                              | [putUserData](#putuserdata)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)         |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                                                      | [getUserData](#getuserdata)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                             |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                        | [displayStringProperty](#displaystringproperty)()                                                                                                                                                                                         |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)>                                                                                                   | [objectSchemaProperty](#objectschemaproperty)()                                                                                                                                                                                           |             |
| public void                                                                                                                                                                                                                                                                                                              | [addListener](#addlistener)([InvalidationListener](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/InvalidationListener.html) listener)                                                           |             |
| public void                                                                                                                                                                                                                                                                                                              | [removeListener](#removelistener)([InvalidationListener](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/InvalidationListener.html) listener)                                                     |             |



## Method Details

### getObjectSchema

<span style="font-family: monospace; font-size: 80%;">public final [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) __getObjectSchema__()</span>




---

### setObjectSchema

<span style="font-family: monospace; font-size: 80%;">public final void __setObjectSchema__([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>




---

### getPropertyNames

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getPropertyNames__()</span>




---

### getPropertyMetadata

<span style="font-family: monospace; font-size: 80%;">public final [PropertyMetadata](PropertyMetadata.md) __getPropertyMetadata__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### createObservableProperty

<span style="font-family: monospace; font-size: 80%;">public void __createObservableProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) propertySchema)</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public final [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>




---

### getObservables

<span style="font-family: monospace; font-size: 80%;">public final [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)[] __getObservables__()</span>




---

### getObservablesMap

<span style="font-family: monospace; font-size: 80%;">public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)> __getObservablesMap__()</span>




---

### getObservable

<span style="font-family: monospace; font-size: 80%;">public final [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html) __getObservable__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getObservableList

<span style="font-family: monospace; font-size: 80%;">public final [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<?> __getObservableList__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getObjectProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html) __getObjectProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getDataContext

<span style="font-family: monospace; font-size: 80%;">public java.util.Map __getDataContext__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getBoolean

<span style="font-family: monospace; font-size: 80%;">public final [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) __getBoolean__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getInteger

<span style="font-family: monospace; font-size: 80%;">public final [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __getInteger__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getLong

<span style="font-family: monospace; font-size: 80%;">public final [Long](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Long.html) __getLong__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getPath

<span style="font-family: monospace; font-size: 80%;">public final [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getUri

<span style="font-family: monospace; font-size: 80%;">public final [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getUri__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public void __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### putUserData

<span style="font-family: monospace; font-size: 80%;">public void __putUserData__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### getUserData

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getUserData__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### displayStringProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __displayStringProperty__()</span>




---

### objectSchemaProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)> __objectSchemaProperty__()</span>




---

### addListener

<span style="font-family: monospace; font-size: 80%;">public void __addListener__([InvalidationListener](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/InvalidationListener.html) listener)</span>




---

### removeListener

<span style="font-family: monospace; font-size: 80%;">public void __removeListener__([InvalidationListener](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/InvalidationListener.html) listener)</span>




---

