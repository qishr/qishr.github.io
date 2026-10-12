Package [io.github.qishr.cascara.ui.control](index.md)

# Class ResourceTabPane
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.VBox](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/VBox.html)<br/>
                                                io.github.qishr.cascara.ui.control.ResourceTabPane<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ResourceTabPane__<br/>extends [VBox](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/VBox.html)
</span>


## Field Summary

| Modifier and Type                           | Field                       | Description |
|---------------------------------------------|-----------------------------|-------------|
| protected final ObjectProperty<ResourceTab> | [selectedTab](#selectedtab) |             |



## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| ResourceTabPane() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                | Method                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|-------------|
| public [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md)> | [selectedTabProperty](#selectedtabproperty)()                                                                   |             |
| public [ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md)                                                                                                        | [getSelectedTab](#getselectedtab)()                                                                             |             |
| public void                                                                                                                                                                                      | [setUri](#seturi)([ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) v)         |             |
| public void                                                                                                                                                                                      | [selectTab](#selecttab)([ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) tab) |             |
| public [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)<[ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md)>    | [getTabs](#gettabs)()                                                                                           |             |
| public [ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md)                                                                                                        | [createTab](#createtab)(boolean isTransient)                                                                    |             |
| public void                                                                                                                                                                                      | [removeTab](#removetab)([ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) tab) |             |



## Field Details

### selectedTab

<span style="font-family: monospace; font-size: 80%;">protected final ObjectProperty<ResourceTab> __selectedTab__</span>




---


## Method Details

### selectedTabProperty

<span style="font-family: monospace; font-size: 80%;">public [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md)> __selectedTabProperty__()</span>




---

### getSelectedTab

<span style="font-family: monospace; font-size: 80%;">public [ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) __getSelectedTab__()</span>




---

### setUri

<span style="font-family: monospace; font-size: 80%;">public void __setUri__([ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) v)</span>




---

### selectTab

<span style="font-family: monospace; font-size: 80%;">public void __selectTab__([ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) tab)</span>




---

### getTabs

<span style="font-family: monospace; font-size: 80%;">public [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)<[ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md)> __getTabs__()</span>




---

### createTab

<span style="font-family: monospace; font-size: 80%;">public [ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) __createTab__(boolean isTransient)</span>




---

### removeTab

<span style="font-family: monospace; font-size: 80%;">public void __removeTab__([ResourceTab](../../../../../../io/github/qishr/cascara/ui/control/ResourceTab.md) tab)</span>




---

