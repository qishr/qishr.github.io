Package [io.github.qishr.cascara.ui.form](index.md)

# Class Field
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.VBox](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/VBox.html)<br/>
                                                [io.github.qishr.cascara.ui.form.AbstractFormComponent](../../../../../../io/github/qishr/cascara/ui/form/AbstractFormComponent.md)<br/>
                                                        io.github.qishr.cascara.ui.form.Field<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Field__<br/>extends [AbstractFormComponent](../../../../../../io/github/qishr/cascara/ui/form/AbstractFormComponent.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                              | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Field([Observable](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/Observable.html) observable, [ViewAndControl](../../../../../../io/github/qishr/cascara/ui/form/ViewAndControl.md) inputControl, [FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) metadata) |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                               | Description                                  |
|-----------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md)                                      | [setExpandControl](#setexpandcontrol)(boolean v)                                                                                                                                                                                                                     |                                              |
| public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md)                                      | [setLabelPosition](#setlabelposition)([LabelPosition](../../../../../../io/github/qishr/cascara/ui/form/LabelPosition.md) v)                                                                                                                                         |                                              |
| public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md)                                      | [setHorizontalSpacing](#sethorizontalspacing)(int v)                                                                                                                                                                                                                 |                                              |
| public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md)                                      | [setVerticalSpacing](#setverticalspacing)(int v)                                                                                                                                                                                                                     |                                              |
| public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md)                                      | [setOptionProvider](#setoptionprovider)([OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md) v)                                                                                                                                   |                                              |
| public [FieldLabel](../../../../../../io/github/qishr/cascara/ui/form/FieldLabel.md)                            | [getLabel](#getlabel)()                                                                                                                                                                                                                                              |                                              |
| public void                                                                                                     | [setLabel](#setlabel)([FieldLabel](../../../../../../io/github/qishr/cascara/ui/form/FieldLabel.md) label)                                                                                                                                                           |                                              |
| public [SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) | [getSchema](#getschema)()                                                                                                                                                                                                                                            |                                              |
| public void                                                                                                     | [setAddRowHandler](#setaddrowhandler)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) addRow)                                                                                                                       |                                              |
| public void                                                                                                     | [setRemoveRowHandler](#setremoverowhandler)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[TabularData](../../../../../../../cascara.common/io/github/qishr/cascara/common/data/TabularData.md)> addRow) |                                              |
| public [StringProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/StringProperty.html)    | [queryProperty](#queryproperty)()                                                                                                                                                                                                                                    |                                              |
| public [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)                             | [getInputControl](#getinputcontrol)()                                                                                                                                                                                                                                |                                              |
| public [FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md)                      | [getMetadata](#getmetadata)()                                                                                                                                                                                                                                        |                                              |
| public boolean                                                                                                  | [isArray](#isarray)()                                                                                                                                                                                                                                                |                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [getName](#getname)()                                                                                                                                                                                                                                                |                                              |
| public void                                                                                                     | [setOnValidate](#setonvalidate)([FieldValidator](../../../../../../io/github/qishr/cascara/ui/form/FieldValidator.md) callback)                                                                                                                                      | If onValidate is set, errorLabel is created. |
| protected void                                                                                                  | [onTextChanged](#ontextchanged)()                                                                                                                                                                                                                                    |                                              |
| protected void                                                                                                  | [performLayout](#performlayout)()                                                                                                                                                                                                                                    |                                              |


### Methods inherited from [AbstractFormComponent](../../../../../../io/github/qishr/cascara/ui/form/AbstractFormComponent.md)

setDescription, internalChange, updateSearchHighlight, getQuery, setTitle


## Method Details

### setExpandControl

<span style="font-family: monospace; font-size: 80%;">public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md) __setExpandControl__(boolean v)</span>




---

### setLabelPosition

<span style="font-family: monospace; font-size: 80%;">public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md) __setLabelPosition__([LabelPosition](../../../../../../io/github/qishr/cascara/ui/form/LabelPosition.md) v)</span>




---

### setHorizontalSpacing

<span style="font-family: monospace; font-size: 80%;">public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md) __setHorizontalSpacing__(int v)</span>




---

### setVerticalSpacing

<span style="font-family: monospace; font-size: 80%;">public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md) __setVerticalSpacing__(int v)</span>




---

### setOptionProvider

<span style="font-family: monospace; font-size: 80%;">public [Field](../../../../../../io/github/qishr/cascara/ui/form/Field.md) __setOptionProvider__([OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md) v)</span>




---

### getLabel

<span style="font-family: monospace; font-size: 80%;">public [FieldLabel](../../../../../../io/github/qishr/cascara/ui/form/FieldLabel.md) __getLabel__()</span>




---

### setLabel

<span style="font-family: monospace; font-size: 80%;">public void __setLabel__([FieldLabel](../../../../../../io/github/qishr/cascara/ui/form/FieldLabel.md) label)</span>




---

### getSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) __getSchema__()</span>




---

### setAddRowHandler

<span style="font-family: monospace; font-size: 80%;">public void __setAddRowHandler__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) addRow)</span>




---

### setRemoveRowHandler

<span style="font-family: monospace; font-size: 80%;">public void __setRemoveRowHandler__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[TabularData](../../../../../../../cascara.common/io/github/qishr/cascara/common/data/TabularData.md)> addRow)</span>




---

### queryProperty

<span style="font-family: monospace; font-size: 80%;">public [StringProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/StringProperty.html) __queryProperty__()</span>




---

### getInputControl

<span style="font-family: monospace; font-size: 80%;">public [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html) __getInputControl__()</span>




---

### getMetadata

<span style="font-family: monospace; font-size: 80%;">public [FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) __getMetadata__()</span>




---

### isArray

<span style="font-family: monospace; font-size: 80%;">public boolean __isArray__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### setOnValidate

<span style="font-family: monospace; font-size: 80%;">public void __setOnValidate__([FieldValidator](../../../../../../io/github/qishr/cascara/ui/form/FieldValidator.md) callback)</span>

If onValidate is set, errorLabel is created.If it's unset, errorLabel will be null.


---

### onTextChanged

<span style="font-family: monospace; font-size: 80%;">protected void __onTextChanged__()</span>



**Overrides:**

[AbstractFormComponent](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/form/AbstractFormComponent.md#ontextchanged)


---

### performLayout

<span style="font-family: monospace; font-size: 80%;">protected void __performLayout__()</span>



**Overrides:**

[AbstractFormComponent](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/form/AbstractFormComponent.md#performlayout)


---

