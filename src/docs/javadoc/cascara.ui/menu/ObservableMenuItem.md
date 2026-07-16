Package [io.github.qishr.cascara.ui.menu](index.md)

# Class ObservableMenuItem
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.data.ObservableObject](../data/ObservableObject.md)<br/>
                [io.github.qishr.cascara.ui.data.ObservableTreeNode](../data/ObservableTreeNode.md)<[io.github.qishr.cascara.ui.menu.ObservableMenuItem](ObservableMenuItem.md), [java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)><br/>
                        io.github.qishr.cascara.ui.menu.ObservableMenuItem<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ObservableMenuItem__<br/>extends [ObservableTreeNode](../data/ObservableTreeNode.md)<[ObservableMenuItem](ObservableMenuItem.md), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>
</span>


## Field Summary

| Modifier and Type                      | Field                   | Description |
|----------------------------------------|-------------------------|-------------|
| public static final ObservableMenuItem | [SEPARATOR](#separator) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                            | Method                                                                                                                                                                                                                                                                                                                                                                  | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[KeyCombination](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/KeyCombination.html)> | [acceleratorProperty](#acceleratorproperty)()                                                                                                                                                                                                                                                                                                                           |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)>                                        | [onChooseProperty](#onchooseproperty)()                                                                                                                                                                                                                                                                                                                                 |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)>                                        | [onShowingProperty](#onshowingproperty)()                                                                                                                                                                                                                                                                                                                               |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                            | [textProperty](#textproperty)()                                                                                                                                                                                                                                                                                                                                         |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)>                                          | [enabledProperty](#enabledproperty)()                                                                                                                                                                                                                                                                                                                                   |             |
| protected [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                        | [self](#self)()                                                                                                                                                                                                                                                                                                                                                         |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [addMenu](#addmenu)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                                                               |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [addMenuItem](#addmenuitem)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                                                       |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [addMenuItem](#addmenuitem)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [MenuItem](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuItem.html) fxItem) |             |
| public void                                                                                                                                                                                                                                                                                  | [addSeparator](#addseparator)()                                                                                                                                                                                                                                                                                                                                         |             |
| public [MenuBar](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuBar.html)                                                                                                                                                           | [getMenuBar](#getmenubar)()                                                                                                                                                                                                                                                                                                                                             |             |
| public [MenuItem](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuItem.html)                                                                                                                                                         | [getMenuItem](#getmenuitem)()                                                                                                                                                                                                                                                                                                                                           |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [getDestination](#getdestination)()                                                                                                                                                                                                                                                                                                                                     |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [setDestination](#setdestination)([ObservableMenuItem](ObservableMenuItem.md) menu)                                                                                                                                                                                                                                                                                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                          | [getText](#gettext)()                                                                                                                                                                                                                                                                                                                                                   |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [setText](#settext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                                                                                                                                                                  |             |
| public boolean                                                                                                                                                                                                                                                                               | [isEnabled](#isenabled)()                                                                                                                                                                                                                                                                                                                                               |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [setEnabled](#setenabled)(boolean v)                                                                                                                                                                                                                                                                                                                                    |             |
| public final [KeyCombination](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/KeyCombination.html)                                                                                                                                         | [getAccelerator](#getaccelerator)()                                                                                                                                                                                                                                                                                                                                     |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [setAccelerator](#setaccelerator)([KeyCombination](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/KeyCombination.html) v)                                                                                                                                                                                            |             |
| public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)                                                                                                                                                                                | [getOnShowing](#getonshowing)()                                                                                                                                                                                                                                                                                                                                         |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [setOnShowing](#setonshowing)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)                                                                                                                                                                                                                                 |             |
| public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)                                                                                                                                                                                | [getOnChoose](#getonchoose)()                                                                                                                                                                                                                                                                                                                                           |             |
| public [ObservableMenuItem](ObservableMenuItem.md)                                                                                                                                                                                                                                           | [setOnChoose](#setonchoose)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)                                                                                                                                                                                                                                   |             |
| public void                                                                                                                                                                                                                                                                                  | [choose](#choose)()                                                                                                                                                                                                                                                                                                                                                     |             |
| public boolean                                                                                                                                                                                                                                                                               | [isSeparator](#isseparator)()                                                                                                                                                                                                                                                                                                                                           |             |
| public void                                                                                                                                                                                                                                                                                  | [remove](#remove)()                                                                                                                                                                                                                                                                                                                                                     |             |
| protected void                                                                                                                                                                                                                                                                               | [onChildAdded](#onchildadded)([ObservableMenuItem](ObservableMenuItem.md) child)                                                                                                                                                                                                                                                                                        |             |
| protected void                                                                                                                                                                                                                                                                               | [onChildRemoved](#onchildremoved)([ObservableMenuItem](ObservableMenuItem.md) child)                                                                                                                                                                                                                                                                                    |             |


### Methods inherited from [ObservableObject](../data/ObservableObject.md)

displayStringProperty, getInteger, getObjectProperty, getObservables, getPropertyNames, getUserData, setObjectSchema, removeListener, getUri, putUserData, getObservableList, set, getPath, getContentType, getObservablesMap, getPropertyMetadata, getValues, getObjectSchema, getLong, addListener, getString, createObservableProperty, objectSchemaProperty, getObservable, get, getValuesMap, getBoolean

### Methods inherited from [ObservableTreeNode](../data/ObservableTreeNode.md)

schemaProperty, getTreePathInsertParent, getNodeName, typeProperty, schemaTypeProperty, getChildMap, getSchema, setPayload, parentProperty, getTreePath, getDataContext, payloadProperty, nodeNameProperty, getChildren, setNodeName, getParent, getChild, canHaveChildren, [onChildRemoved](#onchildremoved), getPayload, isBranch, getSchemaType, onValueChanged, setParent, getByPath, [onChildAdded](#onchildadded), setSchema


## Field Details

### SEPARATOR

<span style="font-family: monospace; font-size: 80%;">public static final ObservableMenuItem __SEPARATOR__</span>




---


## Method Details

### acceleratorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[KeyCombination](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/KeyCombination.html)> __acceleratorProperty__()</span>




---

### onChooseProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)> __onChooseProperty__()</span>




---

### onShowingProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)> __onShowingProperty__()</span>




---

### textProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __textProperty__()</span>




---

### enabledProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> __enabledProperty__()</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [ObservableMenuItem](ObservableMenuItem.md) __self__()</span>



**Overrides:**

[ObservableTreeNode](../cascara.ui/data/ObservableTreeNode.md#self)


---

### addMenu

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __addMenu__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### addMenuItem

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __addMenuItem__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### addMenuItem

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __addMenuItem__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [MenuItem](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuItem.html) fxItem)</span>




---

### addSeparator

<span style="font-family: monospace; font-size: 80%;">public void __addSeparator__()</span>




---

### getMenuBar

<span style="font-family: monospace; font-size: 80%;">public [MenuBar](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuBar.html) __getMenuBar__()</span>




---

### getMenuItem

<span style="font-family: monospace; font-size: 80%;">public [MenuItem](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuItem.html) __getMenuItem__()</span>




---

### getDestination

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __getDestination__()</span>




---

### setDestination

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __setDestination__([ObservableMenuItem](ObservableMenuItem.md) menu)</span>




---

### getText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getText__()</span>




---

### setText

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __setText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### isEnabled

<span style="font-family: monospace; font-size: 80%;">public boolean __isEnabled__()</span>




---

### setEnabled

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __setEnabled__(boolean v)</span>




---

### getAccelerator

<span style="font-family: monospace; font-size: 80%;">public final [KeyCombination](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/KeyCombination.html) __getAccelerator__()</span>




---

### setAccelerator

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __setAccelerator__([KeyCombination](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/KeyCombination.html) v)</span>




---

### getOnShowing

<span style="font-family: monospace; font-size: 80%;">public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) __getOnShowing__()</span>




---

### setOnShowing

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __setOnShowing__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

### getOnChoose

<span style="font-family: monospace; font-size: 80%;">public final [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) __getOnChoose__()</span>




---

### setOnChoose

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __setOnChoose__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




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

<span style="font-family: monospace; font-size: 80%;">protected void __onChildAdded__([ObservableMenuItem](ObservableMenuItem.md) child)</span>




---

### onChildRemoved

<span style="font-family: monospace; font-size: 80%;">protected void __onChildRemoved__([ObservableMenuItem](ObservableMenuItem.md) child)</span>




---

