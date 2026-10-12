Package [io.github.qishr.cascara.ui.language](index.md)

# Class Localization
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.language.Localization<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Localization__</span>


## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| Localization() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                 | Method                                                                                                                                                                                                                                                                                                                      | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md)                                                                                                                 | [getLocalizer](#getlocalizer)()                                                                                                                                                                                                                                                                                             |             |
| public static void                                                                                                                                                                                                                | [setLocalizer](#setlocalizer)([ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md) customLocalizer)                                                                                                                                                                          |             |
| public static void                                                                                                                                                                                                                | [setActiveLanguage](#setactivelanguage)([Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) option)                                                                                                                                                                                                     |             |
| public static [ReadOnlyObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> | [localeProperty](#localeproperty)()                                                                                                                                                                                                                                                                                         |             |
| public static [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                                                                                                                        | [getLocale](#getlocale)()                                                                                                                                                                                                                                                                                                   |             |
| public static [OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md)                                                                                                                             | [getLanguageOptionProvider](#getlanguageoptionprovider)()                                                                                                                                                                                                                                                                   |             |
| public static boolean                                                                                                                                                                                                             | [registerTranslations](#registertranslations)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) translations)                                                                                                                                                            |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                        | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                 |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                        | [format](#format)([DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                   |             |
| public static [PropertyLocalizationBinding](../../../../../../io/github/qishr/cascara/ui/language/binding/PropertyLocalizationBinding.md)                                                                                         | [bind](#bind)([Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?> target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)   |             |
| public static [LocalizationBinding](../../../../../../io/github/qishr/cascara/ui/language/binding/LocalizationBinding.md)                                                                                                         | [bind](#bind)([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)     |             |
| public static void                                                                                                                                                                                                                | [bind](#bind)([TextField](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/TextField.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public static void                                                                                                                                                                                                                | [bind](#bind)([Tab](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Tab.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)             |             |
| public static void                                                                                                                                                                                                                | [bind](#bind)([MenuItem](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuItem.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)   |             |
| public static void                                                                                                                                                                                                                | [bind](#bind)([Stage](https://openjfx.io/javadoc/25/javafx.graphics/javafx/stage/Stage.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                 |             |
| public static [FieldLabelLocalizationBinding](../../../../../../io/github/qishr/cascara/ui/language/binding/FieldLabelLocalizationBinding.md)                                                                                     | [bind](#bind)([FieldLabel](../../../../../../io/github/qishr/cascara/ui/form/FieldLabel.md) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                  |             |
| public static void                                                                                                                                                                                                                | [bindDirection](#binddirection)([Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html) target)                                                                                                                                                                                                        |             |
| public static void                                                                                                                                                                                                                | [bindDirection](#binddirection)([Scene](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Scene.html) target)                                                                                                                                                                                                      |             |
| public static void                                                                                                                                                                                                                | [bindLocale](#bindlocale)([DatePicker](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/DatePicker.html) picker)                                                                                                                                                                                          |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                        | [getTitle](#gettitle)([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)                                                                                                                                                                                      |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                        | [getDescription](#getdescription)([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)                                                                                                                                                                          |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                        | [getTitleKey](#gettitlekey)([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)                                                                                                                                                                                |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                        | [getDescriptionKey](#getdescriptionkey)([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)                                                                                                                                                                    |             |



## Method Details

### getLocalizer

<span style="font-family: monospace; font-size: 80%;">public static [ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md) __getLocalizer__()</span>




---

### setLocalizer

<span style="font-family: monospace; font-size: 80%;">public static void __setLocalizer__([ObservableLocalizer](../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md) customLocalizer)</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public static void __setActiveLanguage__([Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) option)</span>




---

### localeProperty

<span style="font-family: monospace; font-size: 80%;">public static [ReadOnlyObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> __localeProperty__()</span>




---

### getLocale

<span style="font-family: monospace; font-size: 80%;">public static [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getLocale__()</span>




---

### getLanguageOptionProvider

<span style="font-family: monospace; font-size: 80%;">public static [OptionProvider](../../../../../../io/github/qishr/cascara/ui/option/OptionProvider.md) __getLanguageOptionProvider__()</span>




---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public static boolean __registerTranslations__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) translations)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([DiagnosticMessage](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static [PropertyLocalizationBinding](../../../../../../io/github/qishr/cascara/ui/language/binding/PropertyLocalizationBinding.md) __bind__([Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?> target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static [LocalizationBinding](../../../../../../io/github/qishr/cascara/ui/language/binding/LocalizationBinding.md) __bind__([Labeled](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Labeled.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([TextField](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/TextField.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([Tab](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Tab.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([MenuItem](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuItem.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([Stage](https://openjfx.io/javadoc/25/javafx.graphics/javafx/stage/Stage.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static [FieldLabelLocalizationBinding](../../../../../../io/github/qishr/cascara/ui/language/binding/FieldLabelLocalizationBinding.md) __bind__([FieldLabel](../../../../../../io/github/qishr/cascara/ui/form/FieldLabel.md) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bindDirection

<span style="font-family: monospace; font-size: 80%;">public static void __bindDirection__([Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html) target)</span>




---

### bindDirection

<span style="font-family: monospace; font-size: 80%;">public static void __bindDirection__([Scene](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Scene.html) target)</span>




---

### bindLocale

<span style="font-family: monospace; font-size: 80%;">public static void __bindLocale__([DatePicker](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/DatePicker.html) picker)</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)</span>




---

### getDescription

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescription__([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)</span>




---

### getTitleKey

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitleKey__([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)</span>




---

### getDescriptionKey

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescriptionKey__([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)</span>




---

