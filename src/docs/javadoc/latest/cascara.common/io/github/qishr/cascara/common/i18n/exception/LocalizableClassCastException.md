Package [io.github.qishr.cascara.common.i18n.exception](index.md)

# Class LocalizableClassCastException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [java.lang.ClassCastException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/ClassCastException.html)<br/>
                                        io.github.qishr.cascara.common.i18n.exception.LocalizableClassCastException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableClassCastException__<br/>extends [ClassCastException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/ClassCastException.html)
</span>


## Constructor Summary

| Constructor                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableClassCastException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause) |             |



## Method Summary

| Modifier and Type                                                                                           | Method                                            | Description                                                                                               |
|-------------------------------------------------------------------------------------------------------------|---------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) | [getLocalizableMessage](#getlocalizablemessage)() | Returns a localizable message for the error.                                                              |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]       | [getDetails](#getdetails)()                       | Returns the details, if any, to be used in formatting the error message.                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getLocalizedMessage](#getlocalizedmessage)()     | Returns a localized, formatted error message.                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)         | [getMessage](#getmessage)()                       | Returns a formatted error message, only localized if `cascara.lang.localize-exceptions` is set to` true`. |



## Method Details

### getLocalizableMessage

<span style="font-family: monospace; font-size: 80%;">public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) __getLocalizableMessage__()</span>

Returns a localizable message for the error.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>

Returns the details, if any, to be used in formatting the error message.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>

Returns a localized, formatted error message.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)

**Overrides:**

[ClassCastException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/ClassCastException.html#getlocalizedmessage)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>

Returns a formatted error message, only localized if `cascara.lang.localize-exceptions` is set to` true`.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)

**Overrides:**

[ClassCastException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/ClassCastException.html#getmessage)


---

