Package [io.github.qishr.cascara.ui.api.render](index.md)

# Interface ScalarRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.render.ScalarRenderer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Renderer](Renderer.md)

All Known Implementing Classes:<br/>
    [StructuredDocumentRenderer](StructuredDocumentRenderer.md), [DiagnosticRenderer](../../render/control/DiagnosticRenderer.md), [TimeRenderer](../../render/control/TimeRenderer.md), [SingleLineCellRenderer](../../render/control/SingleLineCellRenderer.md), [TagRenderer](../../render/control/TagRenderer.md), [UriRenderer](../../render/control/UriRenderer.md), [StandardNumberRenderer](../../render/standard/StandardNumberRenderer.md), [StandardStringRenderer](../../render/standard/StandardStringRenderer.md), [StandardIntegerRenderer](../../render/standard/StandardIntegerRenderer.md), [StandardBooleanRenderer](../../render/standard/StandardBooleanRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ScalarRenderer__</span>


## Method Summary

| Modifier and Type                                                                                                             | Method                                                                                                                                                                                                                                                                                                                                                          | Description |
|-------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) | [render](#render)([Labeled](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Labeled.html) view, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../data/DataProvider.md) dataProvider, [FieldMetadata](../../form/FieldMetadata.md) meta) |             |



## Method Details

### render

<span style="font-family: monospace; font-size: 80%;">public abstract [Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) __render__([Labeled](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Labeled.html) view, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../data/DataProvider.md) dataProvider, [FieldMetadata](../../form/FieldMetadata.md) meta)</span>




---

