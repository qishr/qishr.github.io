Package [io.github.qishr.cascara.ui.control](index.md)

# Class ResourceTabPane
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.VBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/VBox.html)<br/>
                                                io.github.qishr.cascara.ui.control.ResourceTabPane<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ResourceTabPane__<br/>extends [VBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/VBox.html)
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

| Modifier and Type                                                                                                                                                            | Method                                                     | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------|-------------|
| public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[ResourceTab](ResourceTab.md)> | [selectedTabProperty](#selectedtabproperty)()              |             |
| public [ResourceTab](ResourceTab.md)                                                                                                                                         | [getSelectedTab](#getselectedtab)()                        |             |
| public void                                                                                                                                                                  | [setUri](#seturi)([ResourceTab](ResourceTab.md) v)         |             |
| public void                                                                                                                                                                  | [selectTab](#selecttab)([ResourceTab](ResourceTab.md) tab) |             |
| public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[ResourceTab](ResourceTab.md)>    | [getTabs](#gettabs)()                                      |             |
| public [ResourceTab](ResourceTab.md)                                                                                                                                         | [createTab](#createtab)(boolean isTransient)               |             |
| public void                                                                                                                                                                  | [removeTab](#removetab)([ResourceTab](ResourceTab.md) tab) |             |



## Field Details

### selectedTab

<span style="font-family: monospace; font-size: 80%;">protected final ObjectProperty<ResourceTab> __selectedTab__</span>




---


## Method Details

### selectedTabProperty

<span style="font-family: monospace; font-size: 80%;">public [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[ResourceTab](ResourceTab.md)> __selectedTabProperty__()</span>




---

### getSelectedTab

<span style="font-family: monospace; font-size: 80%;">public [ResourceTab](ResourceTab.md) __getSelectedTab__()</span>




---

### setUri

<span style="font-family: monospace; font-size: 80%;">public void __setUri__([ResourceTab](ResourceTab.md) v)</span>




---

### selectTab

<span style="font-family: monospace; font-size: 80%;">public void __selectTab__([ResourceTab](ResourceTab.md) tab)</span>




---

### getTabs

<span style="font-family: monospace; font-size: 80%;">public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[ResourceTab](ResourceTab.md)> __getTabs__()</span>




---

### createTab

<span style="font-family: monospace; font-size: 80%;">public [ResourceTab](ResourceTab.md) __createTab__(boolean isTransient)</span>




---

### removeTab

<span style="font-family: monospace; font-size: 80%;">public void __removeTab__([ResourceTab](ResourceTab.md) tab)</span>




---

