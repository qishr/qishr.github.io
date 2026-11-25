Package [io.github.qishr.cascara.common.i18n](index.md)

# Class MessageFormatter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.i18n.MessageFormatter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __MessageFormatter__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| MessageFormatter([Function](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Function.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> lookup, boolean localizeExceptions) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                                                                                   | Description                                                                              |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [formatWithDefault](#formatwithdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)                                                                                                                                 | Formats the code with dynamic arguments using the environment's current language bundle. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [formatException](#formatexception)([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                   | Formats the code with dynamic arguments using the environment's current language bundle. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [format](#format)([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                                     | Formats the code with dynamic arguments using the environment's current language bundle. |



## Method Details

### formatWithDefault

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatWithDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultText, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>

Formats the code with dynamic arguments using the environment's current language bundle.


---

### formatException

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __formatException__([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Formats the code with dynamic arguments using the environment's current language bundle.


---

### format

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Formats the code with dynamic arguments using the environment's current language bundle.


---

