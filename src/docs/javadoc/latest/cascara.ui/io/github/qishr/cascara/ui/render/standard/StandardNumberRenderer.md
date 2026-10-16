Package [io.github.qishr.cascara.ui.render.standard](index.md)

# Class StandardNumberRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.render.AbstractRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractRenderer.md)<br/>
                [io.github.qishr.cascara.ui.render.AbstractScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractScalarRenderer.md)<br/>
                        io.github.qishr.cascara.ui.render.standard.StandardNumberRenderer<br/>
<br/>
All Implemented Interfaces:<br/>
    [ScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __StandardNumberRenderer__<br/>extends [AbstractScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractScalarRenderer.md)
</span>


## Constructor Summary

| Constructor              | Description |
|--------------------------|-------------|
| StandardNumberRenderer() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                                                                                                                                                    | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentType](#getcontenttype)()                                                                                                                                                                                                                                                                                                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaType](#getschematype)()                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaFormat](#getschemaformat)()                                                                                                                                                                                                                                                                                                                                                                                     |             |
| public [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)                 | [render](#render)([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) view, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../../../../../../../io/github/qishr/cascara/ui/api/data/DataProvider.md) dataProvider, [FieldMetadata](../../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta) |             |


### Methods inherited from [AbstractScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractScalarRenderer.md)

extractString, extractString

### Methods inherited from [AbstractRenderer](../../../../../../../io/github/qishr/cascara/ui/render/AbstractRenderer.md)

getServiceProperties


## Method Details

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>



**Overrides:**

[AbstractRenderer](../../../../../../../../cascara.ui/io/github/qishr/cascara/ui/render/AbstractRenderer.md#getcontenttype)


---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaType__()</span>



**Overrides:**

[AbstractRenderer](../../../../../../../../cascara.ui/io/github/qishr/cascara/ui/render/AbstractRenderer.md#getschematype)


---

### getSchemaFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaFormat__()</span>



**Overrides:**

[AbstractRenderer](../../../../../../../../cascara.ui/io/github/qishr/cascara/ui/render/AbstractRenderer.md#getschemaformat)


---

### render

<span style="font-family: monospace; font-size: 80%;">public [Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html) __render__([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) view, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) data, [DataProvider](../../../../../../../io/github/qishr/cascara/ui/api/data/DataProvider.md) dataProvider, [FieldMetadata](../../../../../../../io/github/qishr/cascara/ui/form/FieldMetadata.md) meta)</span>



**Specified By:**

[ScalarRenderer](../../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md)


---

