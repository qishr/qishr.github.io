Package [io.github.qishr.cascara.common.i18n.exception](index.md)

# Class LocalizableRuntimeException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                io.github.qishr.cascara.common.i18n.exception.LocalizableRuntimeException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)

Direct Known Subtypes:<br/>
    [ColorException](../../../../../../../io/github/qishr/cascara/common/color/ColorException.md), [UnexpectedNullReturnException](../../../../../../../io/github/qishr/cascara/common/exception/UnexpectedNullReturnException.md), [UnexpectedNullValueException](../../../../../../../io/github/qishr/cascara/common/exception/UnexpectedNullValueException.md), [UnimplementedMethodException](../../../../../../../io/github/qishr/cascara/common/exception/UnimplementedMethodException.md), [ConfigException](../../../../../../../io/github/qishr/cascara/common/exception/ConfigException.md), [LocatableException](../../../../../../../io/github/qishr/cascara/common/exception/LocatableException.md), [ExecutionException](../../../../../../../io/github/qishr/cascara/common/exec/ExecutionException.md), [IpcException](../../../../../../../io/github/qishr/cascara/common/exec/ipc/IpcException.md), [ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md), [TrackingException](../../../../../../../io/github/qishr/cascara/common/trackable/TrackingException.md), [ContentTypeException](../../../../../../../../cascara.common.io/io/github/qishr/cascara/common/content/type/ContentTypeException.md), [JsonConverterException](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/diagnostic/JsonConverterException.md), [YamlConverterException](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/diagnostic/YamlConverterException.md), [UiException](../../../../../../../../cascara.ui/io/github/qishr/cascara/ui/api/UiException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableRuntimeException__<br/>extends [RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableRuntimeException([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| LocalizableRuntimeException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                                              | Method                                                                                                                  | Description                                                                                               |
|------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| public static [LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md) | [of](#of)([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) exception) |                                                                                                           |
| public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)                                    | [getLocalizableMessage](#getlocalizablemessage)()                                                                       |                                                                                                           |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                          | [getDetails](#getdetails)()                                                                                             |                                                                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                            | [getLocalizedMessage](#getlocalizedmessage)()                                                                           | Returns a localized, formatted error message.                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                            | [getMessage](#getmessage)()                                                                                             | Returns a formatted error message, only localized if `cascara.lang.localize-exceptions` is set to` true`. |



## Method Details

### of

<span style="font-family: monospace; font-size: 80%;">public static [LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md) __of__([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) exception)</span>




---

### getLocalizableMessage

<span style="font-family: monospace; font-size: 80%;">public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) __getLocalizableMessage__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>

Returns a localized, formatted error message.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)

**Overrides:**

[RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html#getlocalizedmessage)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>

Returns a formatted error message, only localized if `cascara.lang.localize-exceptions` is set to` true`.

**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableException.md)

**Overrides:**

[RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html#getmessage)


---

