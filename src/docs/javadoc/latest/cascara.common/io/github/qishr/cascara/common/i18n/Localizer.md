Package [io.github.qishr.cascara.common.i18n](index.md)

# Class Localizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.i18n.Localizer<br/>
<br/>
Direct Known Subtypes:<br/>
    [NoOpLocalizer](../../../../../../io/github/qishr/cascara/common/i18n/NoOpLocalizer.md), [MessageLocalizer](../../../../../../io/github/qishr/cascara/common/i18n/MessageLocalizer.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __Localizer__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                   | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [AUTOMATIC](#automatic) |             |



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| Localizer() |             |



## Method Summary

| Modifier and Type                                                                                                             | Method                                                                                                                                                                                                                                                                                                                                                   | Description |
|-------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [Localizer](../../../../../../io/github/qishr/cascara/common/i18n/Localizer.md)                                 | [get](#get)()                                                                                                                                                                                                                                                                                                                                            |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [formatWithDefault](#formatwithdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                 |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [format](#format)([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                     |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [formatException](#formatexception)([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                   |             |
| public abstract boolean                                                                                                       | [hasLanguage](#haslanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                                    |             |
| public abstract [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                  | [getSystemLocale](#getsystemlocale)()                                                                                                                                                                                                                                                                                                                    |             |
| public abstract [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                  | [getActiveLocale](#getactivelocale)()                                                                                                                                                                                                                                                                                                                    |             |
| public abstract void                                                                                                          | [setActiveLocale](#setactivelocale)([Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) locale)                                                                                                                                                                                                                 |             |
| public abstract void                                                                                                          | [setActiveLanguage](#setactivelanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                        |             |
| public abstract [TrackableProperty](../../../../../../io/github/qishr/cascara/common/trackable/property/TrackableProperty.md) | [activeLocaleProperty](#activelocaleproperty)()                                                                                                                                                                                                                                                                                                          |             |
| public abstract boolean                                                                                                       | [isRTL](#isrtl)()                                                                                                                                                                                                                                                                                                                                        |             |
| public abstract boolean                                                                                                       | [registerTranslations](#registertranslations)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)                                                                                              |             |
| public abstract boolean                                                                                                       | [registerTranslations](#registertranslations)([LocalizedMessages](../../../../../../io/github/qishr/cascara/common/i18n/LocalizedMessages.md) translation)                                                                                                                                                                                               |             |
| protected void                                                                                                                | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) e)                                                                                                                                                                                                                                    |             |
| protected void                                                                                                                | [error](#error)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)                                                                                                                                                                                                                                    |             |



## Field Details

### AUTOMATIC

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __AUTOMATIC__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">public static [Localizer](../../../../../../io/github/qishr/cascara/common/i18n/Localizer.md) __get__()</span>




---

### formatWithDefault

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatWithDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### formatException

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatException__([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### hasLanguage

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hasLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>




---

### getSystemLocale

<span style="font-family: monospace; font-size: 80%;">public abstract [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getSystemLocale__()</span>




---

### getActiveLocale

<span style="font-family: monospace; font-size: 80%;">public abstract [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getActiveLocale__()</span>




---

### setActiveLocale

<span style="font-family: monospace; font-size: 80%;">public abstract void __setActiveLocale__([Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) locale)</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public abstract void __setActiveLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>




---

### activeLocaleProperty

<span style="font-family: monospace; font-size: 80%;">public abstract [TrackableProperty](../../../../../../io/github/qishr/cascara/common/trackable/property/TrackableProperty.md) __activeLocaleProperty__()</span>




---

### isRTL

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isRTL__()</span>




---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __registerTranslations__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)</span>




---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __registerTranslations__([LocalizedMessages](../../../../../../io/github/qishr/cascara/common/i18n/LocalizedMessages.md) translation)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) e)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message)</span>




---

