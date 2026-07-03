Package [io.github.qishr.cascara.ui.render](index.md)

# Class AbstractScalarRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.render.AbstractRenderer](AbstractRenderer.md)<br/>
                io.github.qishr.cascara.ui.render.AbstractScalarRenderer<br/>
<br/>
Direct Known Subtypes:<br/>
    [DiagnosticRenderer](control/DiagnosticRenderer.md), [TimeRenderer](control/TimeRenderer.md), [ColorChooserRenderer](control/ColorChooserRenderer.md), [DateChooserRenderer](control/DateChooserRenderer.md), [SingleLineCellRenderer](control/SingleLineCellRenderer.md), [FileChooserRenderer](control/FileChooserRenderer.md), [TagRenderer](control/TagRenderer.md), [OptionChooserRenderer](control/OptionChooserRenderer.md), [UriRenderer](control/UriRenderer.md), [StandardNumberRenderer](standard/StandardNumberRenderer.md), [StandardBooleanEditorRenderer](standard/StandardBooleanEditorRenderer.md), [StandardNumberEditorRenderer](standard/StandardNumberEditorRenderer.md), [StandardStringRenderer](standard/StandardStringRenderer.md), [StandardIntegerRenderer](standard/StandardIntegerRenderer.md), [StandardStringEditorRenderer](standard/StandardStringEditorRenderer.md), [StandardBooleanRenderer](standard/StandardBooleanRenderer.md), [StandardIntegerEditorRenderer](standard/StandardIntegerEditorRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractScalarRenderer__<br/>extends [AbstractRenderer](AbstractRenderer.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractScalarRenderer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [SchemaType](../../cascara.schema/schema/SchemaType.md) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format) |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [extractString](#extractstring)([ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop)                                                 |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [extractString](#extractstring)([ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop, [FieldMetadata](../form/FieldMetadata.md) meta) |             |


### Methods inherited from [AbstractRenderer](AbstractRenderer.md)

getSchemaType, getSchemaFormat, getContentType, getServiceProperties


## Method Details

### extractString

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __extractString__([ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop)</span>




---

### extractString

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __extractString__([ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<?> prop, [FieldMetadata](../form/FieldMetadata.md) meta)</span>




---

