Package [io.github.qishr.cascara.ui.control](index.md)

# Class EditableLabel
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.HBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/HBox.html)<br/>
                                                io.github.qishr.cascara.ui.control.EditableLabel<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __EditableLabel__<br/>extends [HBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/HBox.html)
</span>


## Constructor Summary

| Constructor                                                                                                      | Description |
|------------------------------------------------------------------------------------------------------------------|-------------|
| EditableLabel([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |
| EditableLabel()                                                                                                  |             |



## Method Summary

| Modifier and Type                                                                                                                             | Method                                                                                                                    | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                   | [setOnChange](#setonchange)([OnChangeHandler](EditableLabel.OnChangeHandler.md) onChange)                                 |             |
| public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html) | [textProperty](#textproperty)()                                                                                           |             |
| public void                                                                                                                                   | [onChange](#onchange)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |
| public void                                                                                                                                   | [setText](#settext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                           | [getText](#gettext)()                                                                                                     |             |



## Method Details

### setOnChange

<span style="font-family: monospace; font-size: 80%;">public void __setOnChange__([OnChangeHandler](EditableLabel.OnChangeHandler.md) onChange)</span>




---

### textProperty

<span style="font-family: monospace; font-size: 80%;">public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html) __textProperty__()</span>




---

### onChange

<span style="font-family: monospace; font-size: 80%;">public void __onChange__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### setText

<span style="font-family: monospace; font-size: 80%;">public void __setText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### getText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getText__()</span>




---

