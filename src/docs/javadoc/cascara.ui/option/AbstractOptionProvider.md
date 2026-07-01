Package [io.github.qishr.cascara.ui.option](index.md)

# Class AbstractOptionProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.option.AbstractOptionProvider<br/>
<br/>
All Implemented Interfaces:<br/>
    [OptionProvider](OptionProvider.md)

Direct Known Subtypes:<br/>
    [EnumOptionProvider](EnumOptionProvider.md), [LanguageOptionProvider](../language/LanguageOptionProvider.md), [VariationOptionProvider](../theme/VariationOptionProvider.md), [ThemeOptionProvider](../theme/ThemeOptionProvider.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractOptionProvider__</span>


## Field Summary

| Modifier and Type              | Field                   | Description |
|--------------------------------|-------------------------|-------------|
| protected final List<Runnable> | [listeners](#listeners) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                       | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractOptionProvider([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Properties](../../cascara.common/util/Properties.md)                                        | [getServiceProperties](#getserviceproperties)()                                                                                              |             |
| public void                                                                                         | [initialize](#initialize)()                                                                                                                  |             |
| public void                                                                                         | [addListener](#addlistener)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener)       |             |
| public void                                                                                         | [removeListener](#removelistener)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener) |             |
| public [ScalarRenderer](../api/render/ScalarRenderer.md)                                            | [getRenderer](#getrenderer)()                                                                                                                |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getName](#getname)()                                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContentType](#getcontenttype)()                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaType](#getschematype)()                                                                                                            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaFormat](#getschemaformat)()                                                                                                        |             |



## Field Details

### listeners

<span style="font-family: monospace; font-size: 80%;">protected final List<Runnable> __listeners__</span>




---


## Method Details

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../cascara.common/util/Properties.md) __getServiceProperties__()</span>




---

### initialize

<span style="font-family: monospace; font-size: 80%;">public void __initialize__()</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

### addListener

<span style="font-family: monospace; font-size: 80%;">public void __addListener__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener)</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

### removeListener

<span style="font-family: monospace; font-size: 80%;">public void __removeListener__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener)</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

### getRenderer

<span style="font-family: monospace; font-size: 80%;">public [ScalarRenderer](../api/render/ScalarRenderer.md) __getRenderer__()</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaType__()</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

### getSchemaFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaFormat__()</span>



**Specified By:**

[OptionProvider](OptionProvider.md)


---

