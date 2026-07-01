Package [io.github.qishr.cascara.ui.api.render](index.md)

# Interface Renderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.render.Renderer<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../../cascara.common/service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [ScalarRenderer](ScalarRenderer.md), [ScalarEditorRenderer](ScalarEditorRenderer.md), [ArrayEditorRenderer](ArrayEditorRenderer.md), [AbstractRenderer](../../render/AbstractRenderer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Renderer__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                | Description |
|--------------------------------------------------------------------------------------------------------------|---------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaType](#getschematype)()     |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaFormat](#getschemaformat)() |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentType](#getcontenttype)()   |             |



## Method Details

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaType__()</span>




---

### getSchemaFormat

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaFormat__()</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>




---

