Package [io.github.qishr.cascara.ui.render](index.md)

# Class RendererFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.service.AbstractServiceProviderFactory](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)<br/>
                io.github.qishr.cascara.ui.render.RendererFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __RendererFactory__<br/>extends [AbstractServiceProviderFactory](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)
</span>


## Constructor Summary

| Constructor                                                                                                     | Description |
|-----------------------------------------------------------------------------------------------------------------|-------------|
| RendererFactory()                                                                                               |             |
| RendererFactory([SPL](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/SPL.md) layer) |             |



## Method Summary

| Modifier and Type                                                                                              | Method                                                                                                                                                                                                                                                                                            | Description |
|----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ArrayEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ArrayEditorRenderer.md)   | [createArrayEditorRendererForContentType](#createarrayeditorrendererforcontenttype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)                                                                                                     |             |
| public [ArrayEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ArrayEditorRenderer.md)   | [createArrayEditorRendererForSchemaType](#createarrayeditorrendererforschematype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)   |             |
| public [ScalarRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md)             | [createScalarRendererForContentType](#createscalarrendererforcontenttype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)                                                                                                               |             |
| public [ScalarRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md)             | [createScalarRendererForSchemaType](#createscalarrendererforschematype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)             |             |
| public [ScalarEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarEditorRenderer.md) | [createScalarEditorRendererForContentType](#createscalareditorrendererforcontenttype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)                                                                                                   |             |
| public [ScalarEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarEditorRenderer.md) | [createScalarEditorRendererForSchemaType](#createscalareditorrendererforschematype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format) |             |


### Methods inherited from [AbstractServiceProviderFactory](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)

createServiceProvider, createServiceProvider


## Method Details

### createArrayEditorRendererForContentType

<span style="font-family: monospace; font-size: 80%;">public [ArrayEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ArrayEditorRenderer.md) __createArrayEditorRendererForContentType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/ServiceException.md)


---

### createArrayEditorRendererForSchemaType

<span style="font-family: monospace; font-size: 80%;">public [ArrayEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ArrayEditorRenderer.md) __createArrayEditorRendererForSchemaType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)</span>



**Throws:**

[ServiceException](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/ServiceException.md)


---

### createScalarRendererForContentType

<span style="font-family: monospace; font-size: 80%;">public [ScalarRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md) __createScalarRendererForContentType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/ServiceException.md)


---

### createScalarRendererForSchemaType

<span style="font-family: monospace; font-size: 80%;">public [ScalarRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarRenderer.md) __createScalarRendererForSchemaType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)</span>



**Throws:**

[ServiceException](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/ServiceException.md)


---

### createScalarEditorRendererForContentType

<span style="font-family: monospace; font-size: 80%;">public [ScalarEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarEditorRenderer.md) __createScalarEditorRendererForContentType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/ServiceException.md)


---

### createScalarEditorRendererForSchemaType

<span style="font-family: monospace; font-size: 80%;">public [ScalarEditorRenderer](../../../../../../io/github/qishr/cascara/ui/api/render/ScalarEditorRenderer.md) __createScalarEditorRendererForSchemaType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)</span>



**Throws:**

[ServiceException](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/ServiceException.md)


---

