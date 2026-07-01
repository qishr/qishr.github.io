Package [io.github.qishr.cascara.ui.control](index.md)

# Class ResourceTab
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.control.Tab](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Tab.html)<br/>
                io.github.qishr.cascara.ui.control.ResourceTab<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ResourceTab__<br/>extends [Tab](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Tab.html)
</span>

A draggable tab that can optionally be detached from its tab pane and shown
in a separate window.This can be added to any normal TabPane, however a
TabPane with draggable tabs must *only* have DraggableTabs, normal tabs and
DrragableTabs mixed will cause issues!





## Constructor Summary

| Constructor                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ResourceTab([TabPane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/TabPane.html) tabPane) |             |



## Method Summary

| Modifier and Type                                                                                                                                         | Method                                                                                                                                                                                                                                                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [activeProperty](#activeproperty)()                                                                                                                                                                                                                                                                                                                            |             |
| public boolean                                                                                                                                            | [isActive](#isactive)()                                                                                                                                                                                                                                                                                                                                        |             |
| public void                                                                                                                                               | [setActive](#setactive)(boolean t)                                                                                                                                                                                                                                                                                                                             |             |
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [modifiedProperty](#modifiedproperty)()                                                                                                                                                                                                                                                                                                                        |             |
| public boolean                                                                                                                                            | [isModified](#ismodified)()                                                                                                                                                                                                                                                                                                                                    |             |
| public void                                                                                                                                               | [setModified](#setmodified)(boolean t)                                                                                                                                                                                                                                                                                                                         |             |
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [pinnedProperty](#pinnedproperty)()                                                                                                                                                                                                                                                                                                                            |             |
| public boolean                                                                                                                                            | [isPinned](#ispinned)()                                                                                                                                                                                                                                                                                                                                        |             |
| public void                                                                                                                                               | [setPinned](#setpinned)(boolean pinned)                                                                                                                                                                                                                                                                                                                        |             |
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [transientProperty](#transientproperty)()                                                                                                                                                                                                                                                                                                                      |             |
| public boolean                                                                                                                                            | [isTransient](#istransient)()                                                                                                                                                                                                                                                                                                                                  |             |
| public void                                                                                                                                               | [setTransient](#settransient)(boolean t)                                                                                                                                                                                                                                                                                                                       |             |
| public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) | [titleProperty](#titleproperty)()                                                                                                                                                                                                                                                                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                       | [getTitle](#gettitle)()                                                                                                                                                                                                                                                                                                                                        |             |
| public void                                                                                                                                               | [setTitle](#settitle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                                                                                                                                                       |             |
| public int                                                                                                                                                | [getIndex](#getindex)()                                                                                                                                                                                                                                                                                                                                        |             |
| public void                                                                                                                                               | [setDetachable](#setdetachable)(boolean detachable)                                                                                                                                                                                                                                                                                                            |             |
| public void                                                                                                                                               | [setOnContextMenuRequested](#setoncontextmenurequested)([EventHandler](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/event/EventHandler.html)<? super [ContextMenuEvent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/ContextMenuEvent.html)> onContextMenuRequested) |             |



## Method Details

### activeProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __activeProperty__()</span>




---

### isActive

<span style="font-family: monospace; font-size: 80%;">public boolean __isActive__()</span>




---

### setActive

<span style="font-family: monospace; font-size: 80%;">public void __setActive__(boolean t)</span>




---

### modifiedProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __modifiedProperty__()</span>




---

### isModified

<span style="font-family: monospace; font-size: 80%;">public boolean __isModified__()</span>




---

### setModified

<span style="font-family: monospace; font-size: 80%;">public void __setModified__(boolean t)</span>




---

### pinnedProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __pinnedProperty__()</span>




---

### isPinned

<span style="font-family: monospace; font-size: 80%;">public boolean __isPinned__()</span>




---

### setPinned

<span style="font-family: monospace; font-size: 80%;">public void __setPinned__(boolean pinned)</span>




---

### transientProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __transientProperty__()</span>




---

### isTransient

<span style="font-family: monospace; font-size: 80%;">public boolean __isTransient__()</span>




---

### setTransient

<span style="font-family: monospace; font-size: 80%;">public void __setTransient__(boolean t)</span>




---

### titleProperty

<span style="font-family: monospace; font-size: 80%;">public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) __titleProperty__()</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__()</span>




---

### setTitle

<span style="font-family: monospace; font-size: 80%;">public void __setTitle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### getIndex

<span style="font-family: monospace; font-size: 80%;">public int __getIndex__()</span>




---

### setDetachable

<span style="font-family: monospace; font-size: 80%;">public void __setDetachable__(boolean detachable)</span>




---

### setOnContextMenuRequested

<span style="font-family: monospace; font-size: 80%;">public void __setOnContextMenuRequested__([EventHandler](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/event/EventHandler.html)<? super [ContextMenuEvent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/input/ContextMenuEvent.html)> onContextMenuRequested)</span>




---

