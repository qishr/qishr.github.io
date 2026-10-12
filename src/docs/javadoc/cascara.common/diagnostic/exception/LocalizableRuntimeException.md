Package [io.github.qishr.cascara.common.diagnostic.exception](index.md)

# Class LocalizableRuntimeException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](LocalizableException.md)

Direct Known Subtypes:<br/>
    [ColorException](../../color/ColorException.md), [UnexpectedNullParameterException](UnexpectedNullParameterException.md), [UnexpectedNullReturnException](UnexpectedNullReturnException.md), [UnimplementedMethodException](UnimplementedMethodException.md), [LocatableException](LocatableException.md), [ExecutionException](../../exec/ExecutionException.md), [ServiceException](../../service/ServiceException.md), [TrackingException](../../trackable/TrackingException.md), [ContentTypeException](../../../cascara.common.io/content/type/ContentTypeException.md), [JsonConverterException](../../cascara.lang.json/JsonConverterException.md), [YamlConverterException](../../cascara.lang.yaml/YamlConverterException.md), [UiException](../../../cascara.ui/api/UiException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableRuntimeException__<br/>extends [RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                              | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableRuntimeException([DiagnosticMessage](../message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| LocalizableRuntimeException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                          | Description |
|-------------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public [DiagnosticMessage](../message/DiagnosticMessage.md)                                           | [getDiagnosticMessage](#getdiagnosticmessage)() |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] | [getDetails](#getdetails)()                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getLocalizedMessage](#getlocalizedmessage)()   |             |



## Method Details

### getDiagnosticMessage

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticMessage](../message/DiagnosticMessage.md) __getDiagnosticMessage__()</span>



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

