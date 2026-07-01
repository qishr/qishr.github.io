Package [io.github.qishr.cascara.common.content.type](index.md)

# Class MergedContentType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.content.type.MergedContentType<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __MergedContentType__</span>

A runtime\u2011merged content type produced by the ContentTypeNormalizer.This object represents a group of module\u2011declared ContentType instances
that were determined to be equivalent based on MIME type intersection
and suffix matching.

MergedContentType is *ephemeral*. It is created fresh each time the
normalizer runs and is reconciled against the persistent canonical
registry to determine stable canonical IDs.

This class is NOT persisted and should never be used as a long\u2011term
identifier for content types.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| MergedContentType([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalId, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalName, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mergedSuffixes, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mergedMimeTypes, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> originals) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                           | Method                                                                                                                                                                                                                              | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getCanonicalId](#getcanonicalid)()                                                                                                                                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getName](#getname)()                                                                                                                                                                                                               |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getSuffixes](#getsuffixes)()                                                                                                                                                                                                       |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getMimeTypes](#getmimetypes)()                                                                                                                                                                                                     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)>                                 | [getOriginalDeclarations](#getoriginaldeclarations)()                                                                                                                                                                               |             |
| public void                                                                                                                                                                                 | [setCanonicalId](#setcanonicalid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalId)                                                                                         |             |
| public void                                                                                                                                                                                 | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalName)                                                                                                     |             |
| public void                                                                                                                                                                                 | [setSuffixes](#setsuffixes)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mergedSuffixes)    |             |
| public void                                                                                                                                                                                 | [setMimeTypes](#setmimetypes)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mergedMimeTypes) |             |
| public void                                                                                                                                                                                 | [setOriginalDeclarations](#setoriginaldeclarations)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> originalDeclarations)      |             |



## Method Details

### getCanonicalId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCanonicalId__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getSuffixes

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getSuffixes__()</span>




---

### getMimeTypes

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getMimeTypes__()</span>




---

### getOriginalDeclarations

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> __getOriginalDeclarations__()</span>




---

### setCanonicalId

<span style="font-family: monospace; font-size: 80%;">public void __setCanonicalId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalId)</span>




---

### setName

<span style="font-family: monospace; font-size: 80%;">public void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalName)</span>




---

### setSuffixes

<span style="font-family: monospace; font-size: 80%;">public void __setSuffixes__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mergedSuffixes)</span>




---

### setMimeTypes

<span style="font-family: monospace; font-size: 80%;">public void __setMimeTypes__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mergedMimeTypes)</span>




---

### setOriginalDeclarations

<span style="font-family: monospace; font-size: 80%;">public void __setOriginalDeclarations__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../cascara.common/util/ContentType.md)> originalDeclarations)</span>




---

