Package [io.github.qishr.cascara.lang.yaml.diagnostic](index.md)

# Class YamlConverterException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.lang.yaml.diagnostic.YamlConverterException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlConverterException__<br/>extends [LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlConverterException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../cascara.common/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |
| YamlConverterException([DiagnosticCode](../cascara.common/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |


### Methods inherited from [LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)

getCode, getLocalizedMessage, getDetails

