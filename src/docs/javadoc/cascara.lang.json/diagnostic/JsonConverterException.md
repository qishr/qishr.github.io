Package [io.github.qishr.cascara.lang.json.diagnostic](index.md)

# Class JsonConverterException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.lang.json.diagnostic.JsonConverterException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JsonConverterException__<br/>extends [LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| JsonConverterException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../cascara.common/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |
| JsonConverterException([DiagnosticCode](../cascara.common/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |


### Methods inherited from [LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)

getCode, getLocalizedMessage, getDetails

