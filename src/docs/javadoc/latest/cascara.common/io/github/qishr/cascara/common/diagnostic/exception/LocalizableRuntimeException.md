Package [io.github.qishr.cascara.common.diagnostic.exception](index.md)

# Class LocalizableRuntimeException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)

Direct Known Subtypes:<br/>
    [ColorException](../../../../../../../io/github/qishr/cascara/common/color/ColorException.md), [UnexpectedNullParameterException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/UnexpectedNullParameterException.md), [UnexpectedNullReturnException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/UnexpectedNullReturnException.md), [UnimplementedMethodException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/UnimplementedMethodException.md), [LocatableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocatableException.md), [ExecutionException](../../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md), [ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md), [TrackingException](../../../../../../../io/github/qishr/cascara/common/trackable/TrackingException.md), [ContentTypeException](../../../../../../../../cascara.common.io/io/github/qishr/cascara/common/content/type/ContentTypeException.md), [JsonConverterException](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/diagnostic/JsonConverterException.md), [YamlConverterException](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/diagnostic/YamlConverterException.md), [UiException](../../../../../../../../cascara.ui/io/github/qishr/cascara/ui/api/UiException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableRuntimeException__<br/>extends [RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                          | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableRuntimeException([DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| LocalizableRuntimeException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                       | Method                                          | Description |
|-------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) | [getDiagnosticMessage](#getdiagnosticmessage)() |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                   | [getDetails](#getdetails)()                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                     | [getLocalizedMessage](#getlocalizedmessage)()   |             |



## Method Details

### getDiagnosticMessage

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) __getDiagnosticMessage__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)

**Overrides:**

[RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html#getlocalizedmessage)


---

