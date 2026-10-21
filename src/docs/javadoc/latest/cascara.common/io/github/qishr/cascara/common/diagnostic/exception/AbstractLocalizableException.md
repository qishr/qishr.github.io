Package [io.github.qishr.cascara.common.diagnostic.exception](index.md)

# Class AbstractLocalizableException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        io.github.qishr.cascara.common.diagnostic.exception.AbstractLocalizableException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)

Direct Known Subtypes:<br/>
    [JsonPointerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/JsonPointerException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __AbstractLocalizableException__<br/>extends [Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                              | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractLocalizableException([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| AbstractLocalizableException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                          | Method                                                                                                                                                      | Description                                                              |
|----------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| public static [DiagnosticLocalizer](../../../../../../../io/github/qishr/cascara/common/diagnostic/DiagnosticLocalizer.md) | [getLocalizer](#getlocalizer)()                                                                                                                             |                                                                          |
| public static void                                                                                                         | [setLocalizer](#setlocalizer)([DiagnosticLocalizer](../../../../../../../io/github/qishr/cascara/common/diagnostic/DiagnosticLocalizer.md) customLocalizer) |                                                                          |
| public [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)    | [getDiagnosticMessage](#getdiagnosticmessage)()                                                                                                             | Returns a diagnostic error code for the error message.                   |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                      | [getDetails](#getdetails)()                                                                                                                                 | Returns the details, if any, to be used in formatting the error message. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                        | [getLocalizedMessage](#getlocalizedmessage)()                                                                                                               | Returns a localized, formatted error message.                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                        | [getMessage](#getmessage)()                                                                                                                                 | Returns a localized, formatted error message.                            |



## Method Details

### getLocalizer

<span style="font-family: monospace; font-size: 80%;">public static [DiagnosticLocalizer](../../../../../../../io/github/qishr/cascara/common/diagnostic/DiagnosticLocalizer.md) __getLocalizer__()</span>




---

### setLocalizer

<span style="font-family: monospace; font-size: 80%;">public static void __setLocalizer__([DiagnosticLocalizer](../../../../../../../io/github/qishr/cascara/common/diagnostic/DiagnosticLocalizer.md) customLocalizer)</span>




---

### getDiagnosticMessage

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) __getDiagnosticMessage__()</span>

Returns a diagnostic error code for the error message.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>

Returns the details, if any, to be used in formatting the error message.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>

Returns a localized, formatted error message.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)

**Overrides:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html#getlocalizedmessage)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>

Returns a localized, formatted error message.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)

**Overrides:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html#getmessage)


---

