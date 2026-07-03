Package [io.github.qishr.cascara.ui.render](index.md)

# Class AbstractRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.render.AbstractRenderer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Renderer](../api/render/Renderer.md)

Direct Known Subtypes:<br/>
    [AbstractArrayRenderer](AbstractArrayRenderer.md), [AbstractScalarRenderer](AbstractScalarRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractRenderer__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractRenderer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [SchemaType](../../cascara.schema/schema/SchemaType.md) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                          | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public [Properties](../../cascara.common/util/Properties.md)                                        | [getServiceProperties](#getserviceproperties)() |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentType](#getcontenttype)()             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaType](#getschematype)()               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaFormat](#getschemaformat)()           |             |



## Method Details

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../cascara.common/util/Properties.md) __getServiceProperties__()</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>



**Specified By:**

[Renderer](../api/render/Renderer.md)


---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaType__()</span>



**Specified By:**

[Renderer](../api/render/Renderer.md)


---

### getSchemaFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaFormat__()</span>



**Specified By:**

[Renderer](../api/render/Renderer.md)


---

