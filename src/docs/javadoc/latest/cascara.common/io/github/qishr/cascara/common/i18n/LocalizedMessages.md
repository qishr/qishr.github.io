Package [io.github.qishr.cascara.common.i18n](index.md)

# Class LocalizedMessages
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.i18n.LocalizedMessages<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizedMessages__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                   | Description |
|-------------------|-----------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.i18n.LocalizedMessages.Meta](LocalizedMessages.Meta.md) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                     | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizedMessages()                                                                                                                                                                                                             |             |
| LocalizedMessages([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title) |             |



## Method Summary

| Modifier and Type                                                                                             | Method                                                                                                                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                   | [add](#add)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)                 | [getTranslations](#gettranslations)()                                                                                                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)           | [getLanguageTag](#getlanguagetag)()                                                                                                                                                                               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)           | [getTitle](#gettitle)()                                                                                                                                                                                           |             |
| public static [LocalizedMessages](../../../../../../io/github/qishr/cascara/common/i18n/LocalizedMessages.md) | [fromProperties](#fromproperties)([Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) properties)                                                                               |             |



## Method Details

### add

<span style="font-family: monospace; font-size: 80%;">public void __add__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### getTranslations

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getTranslations__()</span>




---

### getLanguageTag

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLanguageTag__()</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__()</span>




---

### fromProperties

<span style="font-family: monospace; font-size: 80%;">public static [LocalizedMessages](../../../../../../io/github/qishr/cascara/common/i18n/LocalizedMessages.md) __fromProperties__([Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) properties)</span>




---

