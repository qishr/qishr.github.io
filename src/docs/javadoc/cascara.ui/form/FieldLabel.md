Package [io.github.qishr.cascara.ui.form](index.md)

# Class FieldLabel
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.VBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/VBox.html)<br/>
                                                io.github.qishr.cascara.ui.form.FieldLabel<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __FieldLabel__<br/>extends [VBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/VBox.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| FieldLabel([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                              |             |
| FieldLabel([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) translationKey, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |



## Method Summary

| Modifier and Type                                                                                                                                         | Method                                                                                                                   | Description           |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|-----------------------|
| public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) | [queryProperty](#queryproperty)()                                                                                        |                       |
| public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html)             | [textProperty](#textproperty)()                                                                                          |                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                       | [getQuery](#getquery)()                                                                                                  |                       |
| public void                                                                                                                                               | [setQuery](#setquery)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                       | [getText](#gettext)()                                                                                                    |                       |
| public void                                                                                                                                               | [setText](#settext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)   |                       |
| public void                                                                                                                                               | [setHeading](#setheading)(boolean isHeading)                                                                             | For larger label text |
| public void                                                                                                                                               | [formatText](#formattext)()                                                                                              |                       |



## Method Details

### queryProperty

<span style="font-family: monospace; font-size: 80%;">public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) __queryProperty__()</span>




---

### textProperty

<span style="font-family: monospace; font-size: 80%;">public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html) __textProperty__()</span>




---

### getQuery

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getQuery__()</span>




---

### setQuery

<span style="font-family: monospace; font-size: 80%;">public void __setQuery__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### getText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getText__()</span>




---

### setText

<span style="font-family: monospace; font-size: 80%;">public void __setText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### setHeading

<span style="font-family: monospace; font-size: 80%;">public void __setHeading__(boolean isHeading)</span>

For larger label text


---

### formatText

<span style="font-family: monospace; font-size: 80%;">public void __formatText__()</span>




---

