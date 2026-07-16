Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class LocalizableRuntimeException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](LocalizableException.md)

Direct Known Subtypes:<br/>
    [LocatableException](LocatableException.md), [ServiceException](../service/ServiceException.md), [ContentTypeException](../../cascara.common.io/content/type/ContentTypeException.md), [UiException](../../cascara.ui/api/UiException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableRuntimeException__<br/>extends [RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                  | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableRuntimeException([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| LocalizableRuntimeException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                        | Description |
|-------------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| public [DiagnosticCode](code/DiagnosticCode.md)                                                       | [getCode](#getcode)()                         |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] | [getDetails](#getdetails)()                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getLocalizedMessage](#getlocalizedmessage)() |             |



## Method Details

### getCode

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticCode](code/DiagnosticCode.md) __getCode__()</span>



**Specified By:**

[LocalizableException](LocalizableException.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>



**Specified By:**

[LocalizableException](LocalizableException.md)


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>



**Specified By:**

[LocalizableException](LocalizableException.md)

**Overrides:**

[RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html#getlocalizedmessage)


---

