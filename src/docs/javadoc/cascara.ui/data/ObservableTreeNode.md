Package [io.github.qishr.cascara.ui.data](index.md)

# Class ObservableTreeNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.data.ObservableObject](ObservableObject.md)<br/>
                io.github.qishr.cascara.ui.data.ObservableTreeNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [ObservableTreeData](../api/data/ObservableTreeData.md)<T, V>

Direct Known Subtypes:<br/>
    [ObservableMenuItem](../menu/ObservableMenuItem.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ObservableTreeNode__<br/>extends [ObservableObject](ObservableObject.md)
</span>


## Constructor Summary

| Constructor                                                                                                                         | Description |
|-------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ObservableTreeNode(T parent, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) nodeName) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                 | Method                                                                                                                                                       | Description                                             |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------|
| protected abstract T                                                                                                                                                                                                                              | [self](#self)()                                                                                                                                              |                                                         |
| public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaType](../../cascara.schema/schema/SchemaType.md)>                                            | [schemaTypeProperty](#schematypeproperty)()                                                                                                                  |                                                         |
| public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaType](../../cascara.schema/schema/SchemaType.md)>                                            | [typeProperty](#typeproperty)()                                                                                                                              |                                                         |
| public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)>                                  | [schemaProperty](#schemaproperty)()                                                                                                                          |                                                         |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [nodeNameProperty](#nodenameproperty)()                                                                                                                      |                                                         |
| public final [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<T>                                                                                | [parentProperty](#parentproperty)()                                                                                                                          |                                                         |
| public [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<V>                                                                                      | [payloadProperty](#payloadproperty)()                                                                                                                        |                                                         |
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getNodeName](#getnodename)()                                                                                                                                |                                                         |
| public final void                                                                                                                                                                                                                                 | [setNodeName](#setnodename)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)                                  |                                                         |
| public [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)                                                                                                                                                                          | [getSchema](#getschema)()                                                                                                                                    |                                                         |
| public void                                                                                                                                                                                                                                       | [setSchema](#setschema)([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)                                                            |                                                         |
| public final [SchemaType](../../cascara.schema/schema/SchemaType.md)                                                                                                                                                                              | [getSchemaType](#getschematype)()                                                                                                                            |                                                         |
| protected void                                                                                                                                                                                                                                    | [onChildAdded](#onchildadded)(T node)                                                                                                                        | Called when a child is added to this node.              |
| protected void                                                                                                                                                                                                                                    | [onChildRemoved](#onchildremoved)(T node)                                                                                                                    | Called when a child is removed from this node.          |
| protected void                                                                                                                                                                                                                                    | [onValueChanged](#onvaluechanged)(V value)                                                                                                                   | Called when the value held by this node changes.        |
| public T                                                                                                                                                                                                                                          | [getParent](#getparent)()                                                                                                                                    |                                                         |
| public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<T>                                                                                                     | [getChildren](#getchildren)()                                                                                                                                |                                                         |
| public final void                                                                                                                                                                                                                                 | [setParent](#setparent)(T v)                                                                                                                                 |                                                         |
| public T                                                                                                                                                                                                                                          | [getChild](#getchild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                     |                                                         |
| public boolean                                                                                                                                                                                                                                    | [isBranch](#isbranch)()                                                                                                                                      |                                                         |
| protected boolean                                                                                                                                                                                                                                 | [canHaveChildren](#canhavechildren)()                                                                                                                        | Override this only in classes that load data on demand. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                               | [getTreePathInsertParent](#gettreepathinsertparent)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parentName) |                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                               | [getTreePath](#gettreepath)()                                                                                                                                |                                                         |
| public T                                                                                                                                                                                                                                          | [getByPath](#getbypath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)                                   |                                                         |
| public V                                                                                                                                                                                                                                          | [getPayload](#getpayload)()                                                                                                                                  |                                                         |
| public void                                                                                                                                                                                                                                       | [setPayload](#setpayload)(V v)                                                                                                                               |                                                         |
| public java.util.Map                                                                                                                                                                                                                              | [getChildMap](#getchildmap)()                                                                                                                                |                                                         |
| public java.util.Map                                                                                                                                                                                                                              | [getDataContext](#getdatacontext)()                                                                                                                          |                                                         |


### Methods inherited from [ObservableObject](ObservableObject.md)

displayStringProperty, getInteger, getObservablesMap, getPropertyMetadata, getValues, getObjectProperty, getObjectSchema, getObservables, getPropertyNames, getLong, getUserData, setObjectSchema, removeListener, getUri, addListener, putUserData, getString, createObservableProperty, getObservableList, set, getPath, objectSchemaProperty, getContentType, getObservable, get, getValuesMap, getBoolean


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected abstract T __self__()</span>




---

### schemaTypeProperty

<span style="font-family: monospace; font-size: 80%;">public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaType](../../cascara.schema/schema/SchemaType.md)> __schemaTypeProperty__()</span>




---

### typeProperty

<span style="font-family: monospace; font-size: 80%;">public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaType](../../cascara.schema/schema/SchemaType.md)> __typeProperty__()</span>




---

### schemaProperty

<span style="font-family: monospace; font-size: 80%;">public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md)> __schemaProperty__()</span>




---

### nodeNameProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __nodeNameProperty__()</span>




---

### parentProperty

<span style="font-family: monospace; font-size: 80%;">public final [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<T> __parentProperty__()</span>




---

### payloadProperty

<span style="font-family: monospace; font-size: 80%;">public [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<V> __payloadProperty__()</span>




---

### getNodeName

<span style="font-family: monospace; font-size: 80%;">public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getNodeName__()</span>



**Specified By:**

[ObservableTreeData](../api/data/ObservableTreeData.md)


---

### setNodeName

<span style="font-family: monospace; font-size: 80%;">public final void __setNodeName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)</span>




---

### getSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) __getSchema__()</span>




---

### setSchema

<span style="font-family: monospace; font-size: 80%;">public void __setSchema__([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)</span>




---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public final [SchemaType](../../cascara.schema/schema/SchemaType.md) __getSchemaType__()</span>




---

### onChildAdded

<span style="font-family: monospace; font-size: 80%;">protected void __onChildAdded__(T node)</span>

Called when a child is added to this node.


---

### onChildRemoved

<span style="font-family: monospace; font-size: 80%;">protected void __onChildRemoved__(T node)</span>

Called when a child is removed from this node.


---

### onValueChanged

<span style="font-family: monospace; font-size: 80%;">protected void __onValueChanged__(V value)</span>

Called when the value held by this node changes.


---

### getParent

<span style="font-family: monospace; font-size: 80%;">public T __getParent__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<T> __getChildren__()</span>




---

### setParent

<span style="font-family: monospace; font-size: 80%;">public final void __setParent__(T v)</span>




---

### getChild

<span style="font-family: monospace; font-size: 80%;">public T __getChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### isBranch

<span style="font-family: monospace; font-size: 80%;">public boolean __isBranch__()</span>



**Specified By:**

[ObservableTreeData](../api/data/ObservableTreeData.md)


---

### canHaveChildren

<span style="font-family: monospace; font-size: 80%;">protected boolean __canHaveChildren__()</span>

Override this only in classes that load data on demand.


---

### getTreePathInsertParent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTreePathInsertParent__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parentName)</span>




---

### getTreePath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTreePath__()</span>



**Specified By:**

[ObservableTreeData](../api/data/ObservableTreeData.md)


---

### getByPath

<span style="font-family: monospace; font-size: 80%;">public T __getByPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>




---

### getPayload

<span style="font-family: monospace; font-size: 80%;">public V __getPayload__()</span>




---

### setPayload

<span style="font-family: monospace; font-size: 80%;">public void __setPayload__(V v)</span>




---

### getChildMap

<span style="font-family: monospace; font-size: 80%;">public java.util.Map __getChildMap__()</span>




---

### getDataContext

<span style="font-family: monospace; font-size: 80%;">public java.util.Map __getDataContext__()</span>



**Specified By:**

[ObservableTreeData](../api/data/ObservableTreeData.md)

**Overrides:**

[ObservableObject](../cascara.ui/data/ObservableObject.md#getdatacontext)


---

