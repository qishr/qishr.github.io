Package [io.github.qishr.cascara.ui.control](index.md)

# Class FilePicker
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.HBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/HBox.html)<br/>
                                                io.github.qishr.cascara.ui.control.FilePicker<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __FilePicker__<br/>extends [HBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/HBox.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                          | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| FilePicker([Property](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/Property.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] extensions, [FieldMetadata](../form/FieldMetadata.md) meta) |             |
| FilePicker([Property](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/Property.html)<?> node, boolean mustBeAbsolute, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] extensions)                                                                                                                    |             |



## Method Summary

| Modifier and Type                                                                                                                             | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html) | [textProperty](#textproperty)()                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                           | [getText](#gettext)()                                                                                                  |             |
| public void                                                                                                                                   | [setText](#settext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |
| public void                                                                                                                                   | [setBaseUri](#setbaseuri)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)   |             |



## Method Details

### textProperty

<span style="font-family: monospace; font-size: 80%;">public [StringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/StringProperty.html) __textProperty__()</span>




---

### getText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getText__()</span>




---

### setText

<span style="font-family: monospace; font-size: 80%;">public void __setText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### setBaseUri

<span style="font-family: monospace; font-size: 80%;">public void __setBaseUri__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>




---

