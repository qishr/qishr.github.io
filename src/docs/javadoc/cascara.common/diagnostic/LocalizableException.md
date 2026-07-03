Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class LocalizableException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        io.github.qishr.cascara.common.diagnostic.LocalizableException<br/>
<br/>
Direct Known Subtypes:<br/>
    [LocalizableIOException](LocalizableIOException.md), [JsonPointerException](../lang/exception/JsonPointerException.md), [ResourceException](../../cascara.common.io/io/ResourceException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableException__<br/>extends [Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                           | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableException([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| LocalizableException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                       | Description                                                              |
|-------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| public static void                                                                                    | [setLocalizer](#setlocalizer)([DiagnosticLocalizer](DiagnosticLocalizer.md) customLocalizer) |                                                                          |
| public [DiagnosticCode](code/DiagnosticCode.md)                                                       | [getCode](#getcode)()                                                                        | Returns a diagnostic error code for the error message.                   |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] | [getDetails](#getdetails)()                                                                  | Returns the details, if any, to be used in formatting the error message. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getLocalizedMessage](#getlocalizedmessage)()                                                | Returns a localized, formatted error message.                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getMessage](#getmessage)()                                                                  | Returns a localized, formatted error message.                            |



## Method Details

### setLocalizer

<span style="font-family: monospace; font-size: 80%;">public static void __setLocalizer__([DiagnosticLocalizer](DiagnosticLocalizer.md) customLocalizer)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticCode](code/DiagnosticCode.md) __getCode__()</span>

Returns a diagnostic error code for the error message.


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>

Returns the details, if any, to be used in formatting the error message.


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>

Returns a localized, formatted error message.

**Overrides:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html#getlocalizedmessage)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>

Returns a localized, formatted error message.

**Overrides:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html#getmessage)


---

