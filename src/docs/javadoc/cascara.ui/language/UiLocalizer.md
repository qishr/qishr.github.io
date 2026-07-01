Package [io.github.qishr.cascara.ui.language](index.md)

# Class UiLocalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.language.UiLocalizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [ObservableLocalizer](ObservableLocalizer.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __UiLocalizer__</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| UiLocalizer() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                           | Method                                                                                                                                                                                                                                                                                                                                                   | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [OptionProvider](../option/OptionProvider.md)                                                                                                                                                                                                        | [getLanguageOptionProvider](#getlanguageoptionprovider)()                                                                                                                                                                                                                                                                                                |             |
| public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[Option](../option/Option.md)>                                                                                   | [getLanguageOptions](#getlanguageoptions)()                                                                                                                                                                                                                                                                                                              |             |
| public boolean                                                                                                                                                                                                                                              | [hasLanguage](#haslanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                                    |             |
| public [ReadOnlyObjectWrapper](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html)<[LanguageOption](LanguageOption.md)>                                                            | [activeLanguageOptionProperty](#activelanguageoptionproperty)()                                                                                                                                                                                                                                                                                          |             |
| public [NodeOrientation](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/NodeOrientation.html)                                                                                                               | [getDirection](#getdirection)()                                                                                                                                                                                                                                                                                                                          |             |
| public boolean                                                                                                                                                                                                                                              | [isRTL](#isrtl)()                                                                                                                                                                                                                                                                                                                                        |             |
| public [LanguageOption](LanguageOption.md)                                                                                                                                                                                                                  | [getActiveLanguageOption](#getactivelanguageoption)()                                                                                                                                                                                                                                                                                                    |             |
| public [LanguageOption](LanguageOption.md)                                                                                                                                                                                                                  | [getAutoLanguageOption](#getautolanguageoption)()                                                                                                                                                                                                                                                                                                        |             |
| public void                                                                                                                                                                                                                                                 | [setActiveLanguage](#setactivelanguage)([Option](../option/Option.md) option)                                                                                                                                                                                                                                                                            |             |
| public void                                                                                                                                                                                                                                                 | [setActiveLanguage](#setactivelanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                        |             |
| public [ReadOnlyObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> | [activeLocaleProperty](#activelocaleproperty)()                                                                                                                                                                                                                                                                                                          |             |
| public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                                                                                                                                                         | [getActiveLocale](#getactivelocale)()                                                                                                                                                                                                                                                                                                                    |             |
| public void                                                                                                                                                                                                                                                 | [setActiveLocale](#setactivelocale)([Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) locale)                                                                                                                                                                                                                 |             |
| public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                                                                                                                                                         | [getSystemLocale](#getsystemlocale)()                                                                                                                                                                                                                                                                                                                    |             |
| public boolean                                                                                                                                                                                                                                              | [registerTranslations](#registertranslations)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) yamlStream)                                                                                                                                                                                           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [formatWithDefault](#formatwithdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [format](#format)([DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                          |             |



## Method Details

### getLanguageOptionProvider

<span style="font-family: monospace; font-size: 80%;">public [OptionProvider](../option/OptionProvider.md) __getLanguageOptionProvider__()</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### getLanguageOptions

<span style="font-family: monospace; font-size: 80%;">public [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[Option](../option/Option.md)> __getLanguageOptions__()</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### hasLanguage

<span style="font-family: monospace; font-size: 80%;">public boolean __hasLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>




---

### activeLanguageOptionProperty

<span style="font-family: monospace; font-size: 80%;">public [ReadOnlyObjectWrapper](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html)<[LanguageOption](LanguageOption.md)> __activeLanguageOptionProperty__()</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### getDirection

<span style="font-family: monospace; font-size: 80%;">public [NodeOrientation](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/NodeOrientation.html) __getDirection__()</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### isRTL

<span style="font-family: monospace; font-size: 80%;">public boolean __isRTL__()</span>




---

### getActiveLanguageOption

<span style="font-family: monospace; font-size: 80%;">public [LanguageOption](LanguageOption.md) __getActiveLanguageOption__()</span>




---

### getAutoLanguageOption

<span style="font-family: monospace; font-size: 80%;">public [LanguageOption](LanguageOption.md) __getAutoLanguageOption__()</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public void __setActiveLanguage__([Option](../option/Option.md) option)</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public void __setActiveLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### activeLocaleProperty

<span style="font-family: monospace; font-size: 80%;">public [ReadOnlyObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> __activeLocaleProperty__()</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### getActiveLocale

<span style="font-family: monospace; font-size: 80%;">public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getActiveLocale__()</span>




---

### setActiveLocale

<span style="font-family: monospace; font-size: 80%;">public void __setActiveLocale__([Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) locale)</span>




---

### getSystemLocale

<span style="font-family: monospace; font-size: 80%;">public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getSystemLocale__()</span>




---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public boolean __registerTranslations__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) yamlStream)</span>




---

### formatWithDefault

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatWithDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>



**Specified By:**

[ObservableLocalizer](ObservableLocalizer.md)


---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

