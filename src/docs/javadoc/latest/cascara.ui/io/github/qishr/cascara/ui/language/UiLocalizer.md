Package [io.github.qishr.cascara.ui.language](index.md)

# Class UiLocalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.language.UiLocalizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __UiLocalizer__</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| UiLocalizer() |             |



## Method Summary

| Modifier and Type                                                                                                            | Method                                                                                                                                                                                                                                                                                                                                                   | Description                                                                              |
|------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| public [OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md)                               | [getLanguageOptionProvider](#getlanguageoptionprovider)()                                                                                                                                                                                                                                                                                                |                                                                                          |
| public [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)                    | [getLanguageOptions](#getlanguageoptions)()                                                                                                                                                                                                                                                                                                              |                                                                                          |
| public boolean                                                                                                               | [hasLanguage](#haslanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                                    |                                                                                          |
| public [ReadOnlyObjectWrapper](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html)   | [activeLanguageOptionProperty](#activelanguageoptionproperty)()                                                                                                                                                                                                                                                                                          |                                                                                          |
| public [NodeOrientation](https://openjfx.io/javadoc/25/javafx.graphics/javafx/geometry/NodeOrientation.html)                 | [getDirection](#getdirection)()                                                                                                                                                                                                                                                                                                                          |                                                                                          |
| public [LanguageOption](../../../../../../io/github/qishr/cascara/ui/language/LanguageOption.md)                             | [getActiveLanguageOption](#getactivelanguageoption)()                                                                                                                                                                                                                                                                                                    |                                                                                          |
| public [LanguageOption](../../../../../../io/github/qishr/cascara/ui/language/LanguageOption.md)                             | [getAutoLanguageOption](#getautolanguageoption)()                                                                                                                                                                                                                                                                                                        |                                                                                          |
| public void                                                                                                                  | [setActiveLanguage](#setactivelanguage)([Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) option)                                                                                                                                                                                                                                  |                                                                                          |
| public void                                                                                                                  | [setActiveLanguage](#setactivelanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                        |                                                                                          |
| public [ReadOnlyObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html) | [activeLocaleProperty](#activelocaleproperty)()                                                                                                                                                                                                                                                                                                          |                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                          | [formatWithDefault](#formatwithdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                          | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                 | Formats the code with dynamic arguments using the environment's current language bundle. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                          | [format](#format)([LocalizableMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/i18n/LocalizableMessage.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                               |                                                                                          |
| public boolean                                                                                                               | [registerTranslations](#registertranslations)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) yamlStream)                                                                                                                                                                                           |                                                                                          |



## Method Details

### getLanguageOptionProvider

<span style="font-family: monospace; font-size: 80%;">public [OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md) __getLanguageOptionProvider__()</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### getLanguageOptions

<span style="font-family: monospace; font-size: 80%;">public [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html) __getLanguageOptions__()</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### hasLanguage

<span style="font-family: monospace; font-size: 80%;">public boolean __hasLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>




---

### activeLanguageOptionProperty

<span style="font-family: monospace; font-size: 80%;">public [ReadOnlyObjectWrapper](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html) __activeLanguageOptionProperty__()</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### getDirection

<span style="font-family: monospace; font-size: 80%;">public [NodeOrientation](https://openjfx.io/javadoc/25/javafx.graphics/javafx/geometry/NodeOrientation.html) __getDirection__()</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### getActiveLanguageOption

<span style="font-family: monospace; font-size: 80%;">public [LanguageOption](../../../../../../io/github/qishr/cascara/ui/language/LanguageOption.md) __getActiveLanguageOption__()</span>




---

### getAutoLanguageOption

<span style="font-family: monospace; font-size: 80%;">public [LanguageOption](../../../../../../io/github/qishr/cascara/ui/language/LanguageOption.md) __getAutoLanguageOption__()</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public void __setActiveLanguage__([Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) option)</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public void __setActiveLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### activeLocaleProperty

<span style="font-family: monospace; font-size: 80%;">public [ReadOnlyObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html) __activeLocaleProperty__()</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### formatWithDefault

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatWithDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>

Formats the code with dynamic arguments using the environment's current language bundle.

**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([LocalizableMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/i18n/LocalizableMessage.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public boolean __registerTranslations__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) yamlStream)</span>



**Specified By:**

[ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)


---

