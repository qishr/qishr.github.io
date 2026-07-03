Package [io.github.qishr.cascara.ui.api.render](index.md)

# Interface ScalarEditorRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.render.ScalarEditorRenderer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Renderer](Renderer.md)

All Known Implementing Classes:<br/>
    [ColorChooserRenderer](../../render/control/ColorChooserRenderer.md), [DateChooserRenderer](../../render/control/DateChooserRenderer.md), [FileChooserRenderer](../../render/control/FileChooserRenderer.md), [OptionChooserRenderer](../../render/control/OptionChooserRenderer.md), [StandardBooleanEditorRenderer](../../render/standard/StandardBooleanEditorRenderer.md), [StandardNumberEditorRenderer](../../render/standard/StandardNumberEditorRenderer.md), [StandardStringEditorRenderer](../../render/standard/StandardStringEditorRenderer.md), [StandardIntegerEditorRenderer](../../render/standard/StandardIntegerEditorRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ScalarEditorRenderer__</span>


## Method Summary

| Modifier and Type                                                                                                             | Method                                                                                                                                                                                                                                                                                                                                                                                   | Description |
|-------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) | [render](#render)([Labeled](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Labeled.html) view, [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html) data, [DataProvider](../data/DataProvider.md) dataProvider, [FieldMetadata](../../form/FieldMetadata.md) meta) |             |



## Method Details

### render

<span style="font-family: monospace; font-size: 80%;">public abstract [Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) __render__([Labeled](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Labeled.html) view, [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html) data, [DataProvider](../data/DataProvider.md) dataProvider, [FieldMetadata](../../form/FieldMetadata.md) meta)</span>




---

