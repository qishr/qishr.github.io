Package [io.github.qishr.cascara.common.i18n](index.md)

# Class MessageLocalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.i18n.Localizer](../../../../../../io/github/qishr/cascara/common/i18n/Localizer.md)<br/>
                io.github.qishr.cascara.common.i18n.MessageLocalizer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __MessageLocalizer__<br/>extends [Localizer](../../../../../../io/github/qishr/cascara/common/i18n/Localizer.md)
</span>


## Method Summary

| Modifier and Type                                                                                                    | Method                                                                                                                                                                                                                                                                                                                                                   | Description                                                                              |
|----------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [formatWithDefault](#formatwithdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                 | Formats the code with dynamic arguments using the environment's current language bundle. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [format](#format)([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                     | Formats the code with dynamic arguments using the environment's current language bundle. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [formatException](#formatexception)([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                   |                                                                                          |
| public boolean                                                                                                       | [hasLanguage](#haslanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                                    |                                                                                          |
| public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                  | [getSystemLocale](#getsystemlocale)()                                                                                                                                                                                                                                                                                                                    |                                                                                          |
| public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html)                  | [getActiveLocale](#getactivelocale)()                                                                                                                                                                                                                                                                                                                    |                                                                                          |
| public void                                                                                                          | [setActiveLocale](#setactivelocale)([Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) locale)                                                                                                                                                                                                                 |                                                                                          |
| public void                                                                                                          | [setActiveLanguage](#setactivelanguage)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)                                                                                                                                                                                                        |                                                                                          |
| public [TrackableProperty](../../../../../../io/github/qishr/cascara/common/trackable/property/TrackableProperty.md) | [activeLocaleProperty](#activelocaleproperty)()                                                                                                                                                                                                                                                                                                          |                                                                                          |
| public boolean                                                                                                       | [isRTL](#isrtl)()                                                                                                                                                                                                                                                                                                                                        |                                                                                          |
| public boolean                                                                                                       | [registerTranslations](#registertranslations)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)                                                                                              |                                                                                          |
| public boolean                                                                                                       | [registerTranslations](#registertranslations)([LocalizedMessages](../../../../../../io/github/qishr/cascara/common/i18n/LocalizedMessages.md) translation)                                                                                                                                                                                               |                                                                                          |


### Methods inherited from [Localizer](../../../../../../io/github/qishr/cascara/common/i18n/Localizer.md)

error, get, error


## Method Details

### formatWithDefault

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatWithDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>

Formats the code with dynamic arguments using the environment's current language bundle.


---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Formats the code with dynamic arguments using the environment's current language bundle.


---

### formatException

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatException__([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### hasLanguage

<span style="font-family: monospace; font-size: 80%;">public boolean __hasLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>




---

### getSystemLocale

<span style="font-family: monospace; font-size: 80%;">public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getSystemLocale__()</span>




---

### getActiveLocale

<span style="font-family: monospace; font-size: 80%;">public [Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) __getActiveLocale__()</span>




---

### setActiveLocale

<span style="font-family: monospace; font-size: 80%;">public void __setActiveLocale__([Locale](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Locale.html) locale)</span>




---

### setActiveLanguage

<span style="font-family: monospace; font-size: 80%;">public void __setActiveLanguage__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) languageTag)</span>



**Parameters:**

`languageTag` - IETF BCP 47 language tag string


---

### activeLocaleProperty

<span style="font-family: monospace; font-size: 80%;">public [TrackableProperty](../../../../../../io/github/qishr/cascara/common/trackable/property/TrackableProperty.md) __activeLocaleProperty__()</span>




---

### isRTL

<span style="font-family: monospace; font-size: 80%;">public boolean __isRTL__()</span>




---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public boolean __registerTranslations__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)</span>




---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public boolean __registerTranslations__([LocalizedMessages](../../../../../../io/github/qishr/cascara/common/i18n/LocalizedMessages.md) translation)</span>




---

