Package [io.github.qishr.cascara.ui.render.control](index.md)

# Class TagRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.render.AbstractRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractRenderer.md)<br/>
                [io.github.qishr.cascara.ui.render.AbstractScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractScalarRenderer.md)<br/>
                        io.github.qishr.cascara.ui.render.control.TagRenderer<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __TagRenderer__<br/>extends [AbstractScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractScalarRenderer.md)
</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| TagRenderer() |             |



## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                                                                                                                                                                                                                    | Description |
|------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)                        | [render](#render)([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) cell, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../../../../../../../io/github/qishr/cascara/ui/api/data/DataProvider.md) dataProvider, [FieldMetadata](../../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta) |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContrastColor](#getcontrastcolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorStr)                                                                                                                                                                                                                                                                              |             |


### Methods inherited from [AbstractRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractRenderer.md)

getSchemaType, getSchemaFormat, getContentType, getServiceProperties

### Methods inherited from [AbstractScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractScalarRenderer.md)

extractString, extractString


## Method Details

### render

<span style="font-family: monospace; font-size: 80%;">public [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html) __render__([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) cell, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../../../../../../../io/github/qishr/cascara/ui/api/data/DataProvider.md) dataProvider, [FieldMetadata](../../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta)</span>



**Specified By:**

[ScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md)


---

### getContrastColor

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContrastColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorStr)</span>




---

