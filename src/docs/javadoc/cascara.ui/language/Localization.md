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

| Modifier and Type                                                                                                                                                                                                                                                  | Method                                                                                                                                                                                                                                                                                                                                                       | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ObservableLocalizer](ObservableLocalizer.md)                                                                                                                                                                                                        | [getLocalizer](#getlocalizer)()                                                                                                                                                                                                                                                                                                                              |             |
| public static void                                                                                                                                                                                                                                                 | [setLocalizer](#setlocalizer)([ObservableLocalizer](ObservableLocalizer.md) customLocalizer)                                                                                                                                                                                                                                                                 |             |
| public static void                                                                                                                                                                                                                                                 | [setActiveLanguage](#setactivelanguage)([Option](../option/Option.md) option)                                                                                                                                                                                                                                                                                |             |
| public static [ReadOnlyObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> | [localeProperty](#localeproperty)()                                                                                                                                                                                                                                                                                                                          |             |
| public static [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                                                                                                                                                         | [getLocale](#getlocale)()                                                                                                                                                                                                                                                                                                                                    |             |
| public static [OptionProvider](../option/OptionProvider.md)                                                                                                                                                                                                        | [getLanguageOptionProvider](#getlanguageoptionprovider)()                                                                                                                                                                                                                                                                                                    |             |
| public static boolean                                                                                                                                                                                                                                              | [registerTranslations](#registertranslations)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) translations)                                                                                                                                                                                             |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                  |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [format](#format)([DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                                           |             |
| public static [PropertyLocalizationBinding](binding/PropertyLocalizationBinding.md)                                                                                                                                                                                | [bind](#bind)([Property](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/Property.html)<?> target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)   |             |
| public static [LocalizationBinding](binding/LocalizationBinding.md)                                                                                                                                                                                                | [bind](#bind)([Labeled](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Labeled.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)     |             |
| public static void                                                                                                                                                                                                                                                 | [bind](#bind)([TextField](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/TextField.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public static void                                                                                                                                                                                                                                                 | [bind](#bind)([Tab](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Tab.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)             |             |
| public static void                                                                                                                                                                                                                                                 | [bind](#bind)([MenuItem](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuItem.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)   |             |
| public static void                                                                                                                                                                                                                                                 | [bind](#bind)([Stage](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/stage/Stage.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                 |             |
| public static [FieldLabelLocalizationBinding](binding/FieldLabelLocalizationBinding.md)                                                                                                                                                                            | [bind](#bind)([FieldLabel](../form/FieldLabel.md) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                             |             |
| public static void                                                                                                                                                                                                                                                 | [bindDirection](#binddirection)([Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) target)                                                                                                                                                                                                        |             |
| public static void                                                                                                                                                                                                                                                 | [bindDirection](#binddirection)([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) target)                                                                                                                                                                                                      |             |
| public static void                                                                                                                                                                                                                                                 | [bindLocale](#bindlocale)([DatePicker](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/DatePicker.html) picker)                                                                                                                                                                                          |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [getTitle](#gettitle)([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)                                                                                                                                                                                                                                                              |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [getDescription](#getdescription)([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)                                                                                                                                                                                                                                                  |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [getTitleKey](#gettitlekey)([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)                                                                                                                                                                                                                                                        |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                         | [getDescriptionKey](#getdescriptionkey)([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)                                                                                                                                                                                                                                            |             |



## Method Details

### getLocalizer

<span style="font-family: monospace; font-size: 80%;">public static [ObservableLocalizer](ObservableLocalizer.md) __getLocalizer__()</span>




---

### setLocalizer

<span style="font-family: monospace; font-size: 80%;">public static void __setLocalizer__([ObservableLocalizer](ObservableLocalizer.md) customLocalizer)</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public static void __setActiveLanguage__([Option](../option/Option.md) option)</span>




---

### localeProperty

<span style="font-family: monospace; font-size: 80%;">public static [ReadOnlyObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ReadOnlyObjectProperty.html)<[Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)> __localeProperty__()</span>




---

### getLocale

<span style="font-family: monospace; font-size: 80%;">public static [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getLocale__()</span>




---

### getLanguageOptionProvider

<span style="font-family: monospace; font-size: 80%;">public static [OptionProvider](../option/OptionProvider.md) __getLanguageOptionProvider__()</span>




---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public static boolean __registerTranslations__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) translations)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) diagnosticCode, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static [PropertyLocalizationBinding](binding/PropertyLocalizationBinding.md) __bind__([Property](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/Property.html)<?> target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static [LocalizationBinding](binding/LocalizationBinding.md) __bind__([Labeled](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Labeled.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([TextField](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/TextField.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([Tab](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Tab.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([MenuItem](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/MenuItem.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([Stage](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/stage/Stage.html) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static [FieldLabelLocalizationBinding](binding/FieldLabelLocalizationBinding.md) __bind__([FieldLabel](../form/FieldLabel.md) target, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### bindDirection

<span style="font-family: monospace; font-size: 80%;">public static void __bindDirection__([Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) target)</span>




---

### bindDirection

<span style="font-family: monospace; font-size: 80%;">public static void __bindDirection__([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) target)</span>




---

### bindLocale

<span style="font-family: monospace; font-size: 80%;">public static void __bindLocale__([DatePicker](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/DatePicker.html) picker)</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)</span>




---

### getDescription

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescription__([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)</span>




---

### getTitleKey

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitleKey__([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)</span>




---

### getDescriptionKey

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescriptionKey__([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema)</span>




---

