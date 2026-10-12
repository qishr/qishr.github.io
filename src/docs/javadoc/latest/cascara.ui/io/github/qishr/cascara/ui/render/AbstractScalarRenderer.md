Package [io.github.qishr.cascara.ui.render](index.md)

# Class AbstractScalarRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.render.AbstractRenderer](../../../../../../io/github/qishr/cascara/ui/render/AbstractRenderer.md)<br/>
                io.github.qishr.cascara.ui.render.AbstractScalarRenderer<br/>
<br/>
Direct Known Subtypes:<br/>
    [DiagnosticRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/DiagnosticRenderer.md), [TimeRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/TimeRenderer.md), [ColorChooserRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/ColorChooserRenderer.md), [DateChooserRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/DateChooserRenderer.md), [SingleLineCellRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/SingleLineCellRenderer.md), [FileChooserRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/FileChooserRenderer.md), [TagRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/TagRenderer.md), [OptionChooserRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/OptionChooserRenderer.md), [UriRenderer](../../../../../../io/github/qishr/cascara/ui/render/control/UriRenderer.md), [StandardNumberRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardNumberRenderer.md), [StandardBooleanEditorRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardBooleanEditorRenderer.md), [StandardNumberEditorRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardNumberEditorRenderer.md), [StandardStringRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardStringRenderer.md), [StandardIntegerRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardIntegerRenderer.md), [StandardStringEditorRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardStringEditorRenderer.md), [StandardBooleanRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardBooleanRenderer.md), [StandardIntegerEditorRenderer](../../../../../../io/github/qishr/cascara/ui/render/standard/StandardIntegerEditorRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractScalarRenderer__<br/>extends [AbstractRenderer](../../../../../../io/github/qishr/cascara/ui/render/AbstractRenderer.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                      | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractScalarRenderer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [PrimitiveType](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/PrimitiveType.md) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format) |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                                                                                                                                   | Description |
|--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [extractString](#extractstring)([ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop)                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [extractString](#extractstring)([ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop, [FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta) |             |


### Methods inherited from [AbstractRenderer](../../../../../../io/github/qishr/cascara/ui/render/AbstractRenderer.md)

getSchemaType, getSchemaFormat, getContentType, getServiceProperties


## Method Details

### extractString

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __extractString__([ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop)</span>




---

### extractString

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __extractString__([ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop, [FieldMetadata](../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta)</span>




---

