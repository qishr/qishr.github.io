Package [io.github.qishr.cascara.ui.form](index.md)

# Class AbstractFormComponent
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.VBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/VBox.html)<br/>
                                                io.github.qishr.cascara.ui.form.AbstractFormComponent<br/>
<br/>
Direct Known Subtypes:<br/>
    [Section](Section.md), [Field](Field.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractFormComponent__<br/>extends [VBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/VBox.html)
</span>


## Field Summary

| Modifier and Type                    | Field                       | Description |
|--------------------------------------|-----------------------------|-------------|
| protected FieldLabel                 | [description](#description) |             |
| protected InvalidationListener       | [listener](#listener)       |             |
| protected final SimpleStringProperty | [query](#query)             |             |
| protected FieldLabel                 | [title](#title)             |             |



## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| AbstractFormComponent() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                     | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|-------------|
| public void                                                                                         | [setTitle](#settitle)([FieldLabel](FieldLabel.md) title)                   |             |
| public void                                                                                         | [setDescription](#setdescription)([FieldLabel](FieldLabel.md) description) |             |
| protected void                                                                                      | [internalChange](#internalchange)()                                        |             |
| protected abstract void                                                                             | [onTextChanged](#ontextchanged)()                                          |             |
| protected abstract void                                                                             | [performLayout](#performlayout)()                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getQuery](#getquery)()                                                    |             |
| protected void                                                                                      | [updateSearchHighlight](#updatesearchhighlight)()                          |             |



## Field Details

### description

<span style="font-family: monospace; font-size: 80%;">protected FieldLabel __description__</span>




---

### listener

<span style="font-family: monospace; font-size: 80%;">protected InvalidationListener __listener__</span>




---

### query

<span style="font-family: monospace; font-size: 80%;">protected final SimpleStringProperty __query__</span>




---

### title

<span style="font-family: monospace; font-size: 80%;">protected FieldLabel __title__</span>




---


## Method Details

### setTitle

<span style="font-family: monospace; font-size: 80%;">public void __setTitle__([FieldLabel](FieldLabel.md) title)</span>




---

### setDescription

<span style="font-family: monospace; font-size: 80%;">public void __setDescription__([FieldLabel](FieldLabel.md) description)</span>




---

### internalChange

<span style="font-family: monospace; font-size: 80%;">protected void __internalChange__()</span>




---

### onTextChanged

<span style="font-family: monospace; font-size: 80%;">protected abstract void __onTextChanged__()</span>




---

### performLayout

<span style="font-family: monospace; font-size: 80%;">protected abstract void __performLayout__()</span>




---

### getQuery

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getQuery__()</span>




---

### updateSearchHighlight

<span style="font-family: monospace; font-size: 80%;">protected void __updateSearchHighlight__()</span>




---

