Package [io.github.qishr.cascara.common.content.type](index.md)

# Class ContentTypeException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../../../cascara.common/diagnostic/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.common.content.type.ContentTypeException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ContentTypeException__<br/>extends [LocalizableRuntimeException](../../../cascara.common/diagnostic/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                              | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ContentTypeException([DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| ContentTypeException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                 | Method                              | Description |
|-------------------------------------------------------------------|-------------------------------------|-------------|
| public [ContentType](../../../cascara.common/util/ContentType.md) | [getContentType](#getcontenttype)() |             |


### Methods inherited from [LocalizableRuntimeException](../../../cascara.common/diagnostic/LocalizableRuntimeException.md)

getCode, getLocalizedMessage, setLocalizer, getDetails


## Method Details

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../cascara.common/util/ContentType.md) __getContentType__()</span>




---

