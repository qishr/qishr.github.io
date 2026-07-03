Package [io.github.qishr.cascara.ui.language](index.md)

# Interface ObservableLocalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.language.ObservableLocalizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Localizer](Localizer.md), [DiagnosticLocalizer](../../cascara.common/diagnostic/DiagnosticLocalizer.md)

All Known Implementing Classes:<br/>
    [UiLocalizer](UiLocalizer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ObservableLocalizer__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                    | Method                                                                                                                                                                                                                                                                                                                                                   | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[Option](../option/Option.md)>                                                                                   | [getLanguageOptions](#getlanguageoptions)()                                                                                                                                                                                                                                                                                                              |             |
| public abstract [ReadOnlyObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> | [activeLocaleProperty](#activelocaleproperty)()                                                                                                                                                                                                                                                                                                          |             |
| public abstract [ReadOnlyObjectWrapper](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html)<[LanguageOption](LanguageOption.md)>                                                            | [activeLanguageOptionProperty](#activelanguageoptionproperty)()                                                                                                                                                                                                                                                                                          |             |
| public abstract [OptionProvider](../option/OptionProvider.md)                                                                                                                                                                                                        | [getLanguageOptionProvider](#getlanguageoptionprovider)()                                                                                                                                                                                                                                                                                                |             |
| public abstract void                                                                                                                                                                                                                                                 | [setActiveLanguage](#setactivelanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                        |             |
| public abstract [NodeOrientation](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/NodeOrientation.html)                                                                                                               | [getDirection](#getdirection)()                                                                                                                                                                                                                                                                                                                          |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [formatWithDefault](#formatwithdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public abstract void                                                                                                                                                                                                                                                 | [setActiveLanguage](#setactivelanguage)([Option](../option/Option.md) language)                                                                                                                                                                                                                                                                          |             |



## Method Details

### getLanguageOptions

<span style="font-family: monospace; font-size: 80%;">public abstract [ObservableList](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/collections/ObservableList.html)<[Option](../option/Option.md)> __getLanguageOptions__()</span>




---

### activeLocaleProperty

<span style="font-family: monospace; font-size: 80%;">public abstract [ReadOnlyObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> __activeLocaleProperty__()</span>




---

### activeLanguageOptionProperty

<span style="font-family: monospace; font-size: 80%;">public abstract [ReadOnlyObjectWrapper](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html)<[LanguageOption](LanguageOption.md)> __activeLanguageOptionProperty__()</span>




---

### getLanguageOptionProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [OptionProvider](../option/OptionProvider.md) __getLanguageOptionProvider__()</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public abstract void __setActiveLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>




---

### getDirection

<span style="font-family: monospace; font-size: 80%;">public abstract [NodeOrientation](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/NodeOrientation.html) __getDirection__()</span>




---

### formatWithDefault

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatWithDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public abstract void __setActiveLanguage__([Option](../option/Option.md) language)</span>




---

