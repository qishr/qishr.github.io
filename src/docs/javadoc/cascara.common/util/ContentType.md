Package [io.github.qishr.cascara.common.util](index.md)

# Class ContentType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.ContentType<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ContentType__</span>

A stable, persisted canonical content type used throughout Cascara.This class represents the authoritative identity of a content type,
including its canonical ID, canonical name, and the full set of MIME
types and filename suffixes associated with it.

ContentType instances are loaded from and saved to the
canonical-content-types.yaml registry file. They provide stable,
user\u2011facing identifiers that remain consistent across application runs,
module changes, and plugin installations.

All editor selection, syntax highlighting, file associations, and
user preferences should reference ContentType.


## Field Summary

| Modifier and Type      | Field                       | Description |
|------------------------|-----------------------------|-------------|
| protected String       | [canonicalId](#canonicalid) |             |
| protected List<String> | [mimeTypes](#mimetypes)     |             |
| protected String       | [name](#name)               |             |
| protected List<String> | [suffixes](#suffixes)       |             |



## Constructor Summary

| Constructor                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------|-------------|
| ContentType()                                                                                                  |             |
| ContentType([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                                                                                                                          | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ContentType](ContentType.md)                                                                                                                                                          | [withType](#withtype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mimeType)                                                                                                    |             |
| public [ContentType](ContentType.md)                                                                                                                                                          | [withSuffix](#withsuffix)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) suffix)                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getCanonicalId](#getcanonicalid)()                                                                                                                                                                                             |             |
| public void                                                                                                                                                                                   | [setCanonicalId](#setcanonicalid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getName](#getname)()                                                                                                                                                                                                           |             |
| public void                                                                                                                                                                                   | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalName)                                                                                                 |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getMimeTypes](#getmimetypes)()                                                                                                                                                                                                 |             |
| public void                                                                                                                                                                                   | [setMimeTypes](#setmimetypes)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mimeTypes) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getSuffixes](#getsuffixes)()                                                                                                                                                                                                   |             |
| public void                                                                                                                                                                                   | [setSuffixes](#setsuffixes)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> suffixes)    |             |
| public boolean                                                                                                                                                                                | [isText](#istext)()                                                                                                                                                                                                             |             |
| public boolean                                                                                                                                                                                | [matches](#matches)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mimeType)                                                                                                      |             |
| public boolean                                                                                                                                                                                | [matches](#matches)([ContentType](ContentType.md) contentType)                                                                                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [toString](#tostring)()                                                                                                                                                                                                         |             |
| public int                                                                                                                                                                                    | [hashCode](#hashcode)()                                                                                                                                                                                                         |             |
| public boolean                                                                                                                                                                                | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                                                                               |             |



## Field Details

### canonicalId

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.DataField<br/>
protected String __canonicalId__</span>




---

### mimeTypes

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.DataField<br/>
protected List<String> __mimeTypes__</span>




---

### name

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.DataField<br/>
protected String __name__</span>




---

### suffixes

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.DataField<br/>
protected List<String> __suffixes__</span>




---


## Method Details

### withType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](ContentType.md) __withType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mimeType)</span>




---

### withSuffix

<span style="font-family: monospace; font-size: 80%;">public [ContentType](ContentType.md) __withSuffix__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) suffix)</span>




---

### getCanonicalId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCanonicalId__()</span>




---

### setCanonicalId

<span style="font-family: monospace; font-size: 80%;">public void __setCanonicalId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### setName

<span style="font-family: monospace; font-size: 80%;">public void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) canonicalName)</span>




---

### getMimeTypes

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getMimeTypes__()</span>




---

### setMimeTypes

<span style="font-family: monospace; font-size: 80%;">public void __setMimeTypes__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> mimeTypes)</span>




---

### getSuffixes

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getSuffixes__()</span>




---

### setSuffixes

<span style="font-family: monospace; font-size: 80%;">public void __setSuffixes__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> suffixes)</span>




---

### isText

<span style="font-family: monospace; font-size: 80%;">public boolean __isText__()</span>




---

### matches

<span style="font-family: monospace; font-size: 80%;">public boolean __matches__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mimeType)</span>




---

### matches

<span style="font-family: monospace; font-size: 80%;">public boolean __matches__([ContentType](ContentType.md) contentType)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

