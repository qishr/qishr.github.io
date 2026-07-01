Package [io.github.qishr.cascara.ui.form](index.md)

# Class Section
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.VBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/VBox.html)<br/>
                                                [io.github.qishr.cascara.ui.form.AbstractFormComponent](AbstractFormComponent.md)<br/>
                                                        io.github.qishr.cascara.ui.form.Section<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Section__<br/>extends [AbstractFormComponent](AbstractFormComponent.md)
</span>


## Constructor Summary

| Constructor                                           | Description |
|-------------------------------------------------------|-------------|
| Section()                                             |             |
| Section([FieldLabel](FieldLabel.md) title)            |             |
| Section([FieldLabel](FieldLabel.md) title, int depth) |             |



## Method Summary

| Modifier and Type                                                                                                    | Method                                                                                                                                                              | Description |
|----------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [FieldLabel](FieldLabel.md)                                                                                   | [getTitle](#gettitle)()                                                                                                                                             |             |
| protected void                                                                                                       | [onTextChanged](#ontextchanged)()                                                                                                                                   |             |
| protected void                                                                                                       | [performLayout](#performlayout)()                                                                                                                                   |             |
| public [Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) | [getCollapsibleContent](#getcollapsiblecontent)()                                                                                                                   |             |
| public void                                                                                                          | [addCollapsibleContent](#addcollapsiblecontent)([Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) node) |             |


### Methods inherited from [AbstractFormComponent](AbstractFormComponent.md)

setDescription, internalChange, updateSearchHighlight, getQuery, setTitle


## Method Details

### getTitle

<span style="font-family: monospace; font-size: 80%;">public [FieldLabel](FieldLabel.md) __getTitle__()</span>




---

### onTextChanged

<span style="font-family: monospace; font-size: 80%;">protected void __onTextChanged__()</span>



**Overrides:**

[AbstractFormComponent](../cascara.ui/form/AbstractFormComponent.md#ontextchanged)


---

### performLayout

<span style="font-family: monospace; font-size: 80%;">protected void __performLayout__()</span>



**Overrides:**

[AbstractFormComponent](../cascara.ui/form/AbstractFormComponent.md#performlayout)


---

### getCollapsibleContent

<span style="font-family: monospace; font-size: 80%;">public [Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) __getCollapsibleContent__()</span>




---

### addCollapsibleContent

<span style="font-family: monospace; font-size: 80%;">public void __addCollapsibleContent__([Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) node)</span>




---

