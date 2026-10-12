Package [io.github.qishr.cascara.ui.menu](index.md)

# Class ObservableMenuItem
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.data.ObservableObject](../../../../../../io/github/qishr/cascara/ui/data/ObservableObject.md)<br/>
                [io.github.qishr.cascara.ui.data.ObservableTreeNode](../../../../../../io/github/qishr/cascara/ui/data/ObservableTreeNode.md)<[io.github.qishr.cascara.ui.menu.ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md), [java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)><br/>
                        io.github.qishr.cascara.ui.menu.ObservableMenuItem<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ObservableMenuItem__<br/>extends [ObservableTreeNode](../../../../../../io/github/qishr/cascara/ui/data/ObservableTreeNode.md)<[ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>
</span>


## Field Summary

| Modifier and Type                      | Field                   | Description |
|----------------------------------------|-------------------------|-------------|
| public static final ObservableMenuItem | [SEPARATOR](#separator) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                          | Method                                                                                                                                                                                                                                                                                                                                 | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[KeyCombination](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/input/KeyCombination.html)> | [acceleratorProperty](#acceleratorproperty)()                                                                                                                                                                                                                                                                                          |             |
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)>       | [onChooseProperty](#onchooseproperty)()                                                                                                                                                                                                                                                                                                |             |
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)>       | [onShowingProperty](#onshowingproperty)()                                                                                                                                                                                                                                                                                              |             |
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>           | [textProperty](#textproperty)()                                                                                                                                                                                                                                                                                                        |             |
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)>         | [enabledProperty](#enabledproperty)()                                                                                                                                                                                                                                                                                                  |             |
| protected [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                    | [self](#self)()                                                                                                                                                                                                                                                                                                                        |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [addMenu](#addmenu)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                              |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [addMenuItem](#addmenuitem)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                      |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [addMenuItem](#addmenuitem)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [MenuItem](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuItem.html) fxItem) |             |
| public void                                                                                                                                                                                                                | [addSeparator](#addseparator)()                                                                                                                                                                                                                                                                                                        |             |
| public [MenuBar](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuBar.html)                                                                                                                          | [getMenuBar](#getmenubar)()                                                                                                                                                                                                                                                                                                            |             |
| public [MenuItem](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuItem.html)                                                                                                                        | [getMenuItem](#getmenuitem)()                                                                                                                                                                                                                                                                                                          |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [getDestination](#getdestination)()                                                                                                                                                                                                                                                                                                    |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [setDestination](#setdestination)([ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) menu)                                                                                                                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                        | [getText](#gettext)()                                                                                                                                                                                                                                                                                                                  |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [setText](#settext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                                                                                                                                 |             |
| public boolean                                                                                                                                                                                                             | [isEnabled](#isenabled)()                                                                                                                                                                                                                                                                                                              |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [setEnabled](#setenabled)(boolean v)                                                                                                                                                                                                                                                                                                   |             |
| public final [KeyCombination](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/input/KeyCombination.html)                                                                                                        | [getAccelerator](#getaccelerator)()                                                                                                                                                                                                                                                                                                    |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [setAccelerator](#setaccelerator)([KeyCombination](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/input/KeyCombination.html) v)                                                                                                                                                                                            |             |
| public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)                                                                                                              | [getOnShowing](#getonshowing)()                                                                                                                                                                                                                                                                                                        |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [setOnShowing](#setonshowing)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)                                                                                                                                                                                                |             |
| public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)                                                                                                              | [getOnChoose](#getonchoose)()                                                                                                                                                                                                                                                                                                          |             |
| public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md)                                                                                                                       | [setOnChoose](#setonchoose)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)                                                                                                                                                                                                  |             |
| public void                                                                                                                                                                                                                | [choose](#choose)()                                                                                                                                                                                                                                                                                                                    |             |
| public boolean                                                                                                                                                                                                             | [isSeparator](#isseparator)()                                                                                                                                                                                                                                                                                                          |             |
| public void                                                                                                                                                                                                                | [remove](#remove)()                                                                                                                                                                                                                                                                                                                    |             |
| protected void                                                                                                                                                                                                             | [onChildAdded](#onchildadded)([ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) child)                                                                                                                                                                                                     |             |
| protected void                                                                                                                                                                                                             | [onChildRemoved](#onchildremoved)([ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) child)                                                                                                                                                                                                 |             |


### Methods inherited from [ObservableTreeNode](../../../../../../io/github/qishr/cascara/ui/data/ObservableTreeNode.md)

schemaProperty, getTreePathInsertParent, getNodeName, typeProperty, schemaTypeProperty, getChildMap, getSchema, setPayload, parentProperty, getTreePath, getDataContext, payloadProperty, nodeNameProperty, getChildren, setNodeName, getParent, getChild, canHaveChildren, onChildRemoved, getPayload, isBranch, getSchemaType, onValueChanged, setParent, getByPath, onChildAdded, setSchema

### Methods inherited from [ObservableObject](../../../../../../io/github/qishr/cascara/ui/data/ObservableObject.md)

displayStringProperty, getInteger, getObjectProperty, getObservables, getPropertyNames, getUserData, setObjectSchema, getValue, removeListener, getUri, putUserData, getObservableList, set, getPath, getContentType, getObservablesMap, getPropertyMetadata, getValues, getObjectSchema, getLong, addListener, getString, createObservableProperty, objectSchemaProperty, getObservable, getValuesMap, getBoolean


## Field Details

### SEPARATOR

<span style="font-family: monospace; font-size: 80%;">public static final ObservableMenuItem __SEPARATOR__</span>




---


## Method Details

### acceleratorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[KeyCombination](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/input/KeyCombination.html)> __acceleratorProperty__()</span>




---

### onChooseProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)> __onChooseProperty__()</span>




---

### onShowingProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)> __onShowingProperty__()</span>




---

### textProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __textProperty__()</span>




---

### enabledProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> __enabledProperty__()</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __self__()</span>



**Overrides:**

[ObservableTreeNode](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/data/ObservableTreeNode.md#self)


---

### addMenu

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __addMenu__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### addMenuItem

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __addMenuItem__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### addMenuItem

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __addMenuItem__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [MenuItem](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuItem.html) fxItem)</span>




---

### addSeparator

<span style="font-family: monospace; font-size: 80%;">public void __addSeparator__()</span>




---

### getMenuBar

<span style="font-family: monospace; font-size: 80%;">public [MenuBar](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuBar.html) __getMenuBar__()</span>




---

### getMenuItem

<span style="font-family: monospace; font-size: 80%;">public [MenuItem](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuItem.html) __getMenuItem__()</span>




---

### getDestination

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __getDestination__()</span>




---

### setDestination

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __setDestination__([ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) menu)</span>




---

### getText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getText__()</span>




---

### setText

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __setText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### isEnabled

<span style="font-family: monospace; font-size: 80%;">public boolean __isEnabled__()</span>




---

### setEnabled

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __setEnabled__(boolean v)</span>




---

### getAccelerator

<span style="font-family: monospace; font-size: 80%;">public final [KeyCombination](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/input/KeyCombination.html) __getAccelerator__()</span>




---

### setAccelerator

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __setAccelerator__([KeyCombination](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/input/KeyCombination.html) v)</span>




---

### getOnShowing

<span style="font-family: monospace; font-size: 80%;">public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) __getOnShowing__()</span>




---

### setOnShowing

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __setOnShowing__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

### getOnChoose

<span style="font-family: monospace; font-size: 80%;">public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) __getOnChoose__()</span>




---

### setOnChoose

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) __setOnChoose__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

### choose

<span style="font-family: monospace; font-size: 80%;">public void __choose__()</span>




---

### isSeparator

<span style="font-family: monospace; font-size: 80%;">public boolean __isSeparator__()</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__()</span>




---

### onChildAdded

<span style="font-family: monospace; font-size: 80%;">protected void __onChildAdded__([ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) child)</span>




---

### onChildRemoved

<span style="font-family: monospace; font-size: 80%;">protected void __onChildRemoved__([ObservableMenuItem](../../../../../../io/github/qishr/cascara/ui/menu/ObservableMenuItem.md) child)</span>




---

