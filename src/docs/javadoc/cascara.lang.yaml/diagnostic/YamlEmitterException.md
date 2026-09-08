Package [io.github.qishr.cascara.lang.yaml.diagnostic](index.md)

# Class YamlEmitterException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.LocatableException](../cascara.common/LocatableException.md)<br/>
                                                io.github.qishr.cascara.lang.yaml.diagnostic.YamlEmitterException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlEmitterException__<br/>extends [LocatableException](../cascara.common/LocatableException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                             | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlEmitterException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../cascara.common/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |
| YamlEmitterException([DiagnosticCode](../cascara.common/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |


### Methods inherited from [LocatableException](../cascara.common/LocatableException.md)

getRawMessage, getUri, getLine, setUri, getLocalizedMessage, getMessage, getColumn

### Methods inherited from [LocalizableRuntimeException](../cascara.common/LocalizableRuntimeException.md)

getCode, getDetails

