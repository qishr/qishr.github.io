Package [io.github.qishr.cascara.ui.api](index.md)

# Class UiException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](../../cascara.common/diagnostic/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.ui.api.UiException<br/>
<br/>
Direct Known Subtypes:<br/>
    [UiDataException](../data/UiDataException.md), [UiSchemaException](../schema/UiSchemaException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __UiException__<br/>extends [LocalizableRuntimeException](../../cascara.common/diagnostic/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                  | Description                                  |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| UiException([DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | Constructor for errors without an exception. |
| UiException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Constructor for errors with an exception.    |


### Methods inherited from [LocalizableRuntimeException](../../cascara.common/diagnostic/LocalizableRuntimeException.md)

getCode, getLocalizedMessage, setLocalizer, getDetails

