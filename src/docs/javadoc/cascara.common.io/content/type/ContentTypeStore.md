Package [io.github.qishr.cascara.common.content.type](index.md)

# Class ContentTypeStore
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.content.type.ContentTypeStore<br/>
<br/>
All Implemented Interfaces:<br/>
    [ContentTypeResolver](../../../cascara.common/util/ContentTypeResolver.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ContentTypeStore__</span>


## Method Summary

| Modifier and Type                                                                                                                                           | Method                                                                                                                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Properties](../../../cascara.common/util/Properties.md)                                                                                             | [getServiceProperties](#getserviceproperties)()                                                                                                                                                                            |             |
| public static [ContentTypeStore](ContentTypeStore.md)                                                                                                       | [instance](#instance)()                                                                                                                                                                                                    |             |
| public void                                                                                                                                                 | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                                                                                           |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> | [getAll](#getall)()                                                                                                                                                                                                        |             |
| public void                                                                                                                                                 | [addAll](#addall)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ContentType](../../../cascara.common/util/ContentType.md)> contentTypes)                             |             |
| public void                                                                                                                                                 | [add](#add)([ContentType](../../../cascara.common/util/ContentType.md) contentType)                                                                                                                                        |             |
| public [ContentType](../../../cascara.common/util/ContentType.md)                                                                                           | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type)                                                                                                     |             |
| public void                                                                                                                                                 | [reconcile](#reconcile)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[MergedContentType](MergedContentType.md)> types, [ContentTypeRegistry](ContentTypeRegistry.md) registry) |             |
| public void                                                                                                                                                 | [debugOutputTypes](#debugoutputtypes)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> types)                          |             |



## Method Details

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../cascara.common/util/Properties.md) __getServiceProperties__()</span>




---

### instance

<span style="font-family: monospace; font-size: 80%;">public static [ContentTypeStore](ContentTypeStore.md) __instance__()</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public void __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### getAll

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> __getAll__()</span>



**Throws:**

[ContentTypeException](ContentTypeException.md)


---

### addAll

<span style="font-family: monospace; font-size: 80%;">public void __addAll__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ContentType](../../../cascara.common/util/ContentType.md)> contentTypes)</span>




---

### add

<span style="font-family: monospace; font-size: 80%;">public void __add__([ContentType](../../../cascara.common/util/ContentType.md) contentType)</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../cascara.common/util/ContentType.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type)</span>



**Specified By:**

[ContentTypeResolver](../../../cascara.common/util/ContentTypeResolver.md)


---

### reconcile

<span style="font-family: monospace; font-size: 80%;">public void __reconcile__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[MergedContentType](MergedContentType.md)> types, [ContentTypeRegistry](ContentTypeRegistry.md) registry)</span>




---

### debugOutputTypes

<span style="font-family: monospace; font-size: 80%;">public void __debugOutputTypes__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> types)</span>




---

