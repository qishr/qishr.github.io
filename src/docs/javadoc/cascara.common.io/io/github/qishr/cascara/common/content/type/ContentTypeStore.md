Package [io.github.qishr.cascara.common.content.type](index.md)

# Class ContentTypeStore
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.content.type.ContentTypeStore<br/>
<br/>
All Implemented Interfaces:<br/>
    [ContentTypeResolver](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentTypeResolver.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ContentTypeStore__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                         | Method                                                                                                                                                                                                                                                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                               | [setReporter](#setreporter)([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)                                                                                                                                                                                                        |             |
| public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)                                                                                           | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type)                                                                                                                                                                                                                                       |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> | [getAll](#getall)()                                                                                                                                                                                                                                                                                                                                          |             |
| public void                                                                                                                                                                                               | [addAll](#addall)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> contentTypes)                                                                                                                 |             |
| public void                                                                                                                                                                                               | [add](#add)([ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) contentType)                                                                                                                                                                                                                            |             |
| public void                                                                                                                                                                                               | [reconcile](#reconcile)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[MergedContentType](../../../../../../../io/github/qishr/cascara/common/content/type/MergedContentType.md)> types, [ContentTypeRegistry](../../../../../../../io/github/qishr/cascara/common/content/type/ContentTypeRegistry.md) registry) |             |
| public void                                                                                                                                                                                               | [debugOutputTypes](#debugoutputtypes)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> types)                                                                                                              |             |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public void __setReporter__([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type)</span>



**Specified By:**

[ContentTypeResolver](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentTypeResolver.md)


---

### getAll

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> __getAll__()</span>



**Specified By:**

[ContentTypeResolver](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentTypeResolver.md)


---

### addAll

<span style="font-family: monospace; font-size: 80%;">public void __addAll__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> contentTypes)</span>



**Specified By:**

[ContentTypeResolver](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentTypeResolver.md)


---

### add

<span style="font-family: monospace; font-size: 80%;">public void __add__([ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) contentType)</span>



**Specified By:**

[ContentTypeResolver](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentTypeResolver.md)


---

### reconcile

<span style="font-family: monospace; font-size: 80%;">public void __reconcile__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[MergedContentType](../../../../../../../io/github/qishr/cascara/common/content/type/MergedContentType.md)> types, [ContentTypeRegistry](../../../../../../../io/github/qishr/cascara/common/content/type/ContentTypeRegistry.md) registry)</span>




---

### debugOutputTypes

<span style="font-family: monospace; font-size: 80%;">public void __debugOutputTypes__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> types)</span>




---

