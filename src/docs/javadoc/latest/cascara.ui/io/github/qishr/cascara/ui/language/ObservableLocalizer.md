Package [io.github.qishr.cascara.ui.language](index.md)

# Interface ObservableLocalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.language.ObservableLocalizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Localizer](../../../../../../io/github/qishr/cascara/ui/language/Localizer.md), [DiagnosticLocalizer](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/DiagnosticLocalizer.md)

All Known Implementing Classes:<br/>
    [UiLocalizer](../../../../../../io/github/qishr/cascara/ui/language/UiLocalizer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ObservableLocalizer__</span>


## Method Summary

| Modifier and Type                                                                                                                     | Method                                                                                                                                                                                                                                                                                                                                                   | Description |
|---------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)                    | [getLanguageConfig](#getlanguageconfig)()                                                                                                                                                                                                                                                                                                                |             |
| public abstract [ReadOnlyObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html) | [activeLocaleProperty](#activelocaleproperty)()                                                                                                                                                                                                                                                                                                          |             |
| public abstract [ReadOnlyObjectWrapper](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html)   | [activeLanguageOptionProperty](#activelanguageoptionproperty)()                                                                                                                                                                                                                                                                                          |             |
| public abstract [OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md)                               | [getLanguageOptionProvider](#getlanguageoptionprovider)()                                                                                                                                                                                                                                                                                                |             |
| public abstract void                                                                                                                  | [setActiveLanguage](#setactivelanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                        |             |
| public abstract [NodeOrientation](https://openjfx.io/javadoc/25/javafx.graphics/javafx/geometry/NodeOrientation.html)                 | [getDirection](#getdirection)()                                                                                                                                                                                                                                                                                                                          |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                          | [formatWithDefault](#formatwithdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public abstract void                                                                                                                  | [setActiveLanguage](#setactivelanguage)([Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) language)                                                                                                                                                                                                                                |             |



## Method Details

### getLanguageConfig

<span style="font-family: monospace; font-size: 80%;">public abstract [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html) __getLanguageConfig__()</span>




---

### activeLocaleProperty

<span style="font-family: monospace; font-size: 80%;">public abstract [ReadOnlyObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html) __activeLocaleProperty__()</span>




---

### activeLanguageOptionProperty

<span style="font-family: monospace; font-size: 80%;">public abstract [ReadOnlyObjectWrapper](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectWrapper.html) __activeLanguageOptionProperty__()</span>




---

### getLanguageOptionProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md) __getLanguageOptionProvider__()</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public abstract void __setActiveLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>




---

### getDirection

<span style="font-family: monospace; font-size: 80%;">public abstract [NodeOrientation](https://openjfx.io/javadoc/25/javafx.graphics/javafx/geometry/NodeOrientation.html) __getDirection__()</span>




---

### formatWithDefault

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatWithDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public abstract void __setActiveLanguage__([Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) language)</span>




---

