Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class LocalizableIOException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.io.IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)<br/>
                                io.github.qishr.cascara.common.diagnostic.LocalizableIOException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](LocalizableException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableIOException__<br/>extends [IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableIOException([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| LocalizableIOException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                        | Description                                                              |
|-------------------------------------------------------------------------------------------------------|-----------------------------------------------|--------------------------------------------------------------------------|
| public [DiagnosticCode](code/DiagnosticCode.md)                                                       | [getCode](#getcode)()                         | Returns a diagnostic error code for the error message.                   |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] | [getDetails](#getdetails)()                   | Returns the details, if any, to be used in formatting the error message. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getLocalizedMessage](#getlocalizedmessage)() | Returns a localized, formatted error message.                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getMessage](#getmessage)()                   | Returns a localized, formatted error message.                            |



## Method Details

### getCode

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticCode](code/DiagnosticCode.md) __getCode__()</span>

Returns a diagnostic error code for the error message.

**Specified By:**

[LocalizableException](LocalizableException.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>

Returns the details, if any, to be used in formatting the error message.

**Specified By:**

[LocalizableException](LocalizableException.md)


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>

Returns a localized, formatted error message.

**Specified By:**

[LocalizableException](LocalizableException.md)

**Overrides:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html#getlocalizedmessage)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>

Returns a localized, formatted error message.

**Specified By:**

[LocalizableException](LocalizableException.md)

**Overrides:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html#getmessage)


---

