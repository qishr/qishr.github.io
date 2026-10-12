Package [io.github.qishr.cascara.ui.api.render](index.md)

# Interface ScalarRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.render.ScalarRenderer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Renderer](../../../../../../../io/github/qishr/cascara/ui/api/render/Renderer.md)

All Known Implementing Classes:<br/>
    [StructuredDocumentRenderer](../../../../../../../io/github/qishr/cascara/ui/api/render/StructuredDocumentRenderer.md), [DiagnosticRenderer](../../../../../../../io/github/qishr/cascara/ui/render/control/DiagnosticRenderer.md), [TimeRenderer](../../../../../../../io/github/qishr/cascara/ui/render/control/TimeRenderer.md), [SingleLineCellRenderer](../../../../../../../io/github/qishr/cascara/ui/render/control/SingleLineCellRenderer.md), [TagRenderer](../../../../../../../io/github/qishr/cascara/ui/render/control/TagRenderer.md), [UriRenderer](../../../../../../../io/github/qishr/cascara/ui/render/control/UriRenderer.md), [StandardNumberRenderer](../../../../../../../io/github/qishr/cascara/ui/render/standard/StandardNumberRenderer.md), [StandardStringRenderer](../../../../../../../io/github/qishr/cascara/ui/render/standard/StandardStringRenderer.md), [StandardIntegerRenderer](../../../../../../../io/github/qishr/cascara/ui/render/standard/StandardIntegerRenderer.md), [StandardBooleanRenderer](../../../../../../../io/github/qishr/cascara/ui/render/standard/StandardBooleanRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ScalarRenderer__</span>


## Method Summary

| Modifier and Type                                                                            | Method                                                                                                                                                                                                                                                                                                                                                                                                                    | Description |
|----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html) | [render](#render)([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) view, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../../../../../../../io/github/qishr/cascara/ui/api/data/DataProvider.md) dataProvider, [FieldMetadata](../../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta) |             |



## Method Details

### render

<span style="font-family: monospace; font-size: 80%;">public abstract [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html) __render__([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) view, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../../../../../../../io/github/qishr/cascara/ui/api/data/DataProvider.md) dataProvider, [FieldMetadata](../../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta)</span>




---

