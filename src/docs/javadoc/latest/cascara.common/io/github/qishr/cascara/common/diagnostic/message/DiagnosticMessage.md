Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Class DiagnosticMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.i18n.DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md)<br/>
                io.github.qishr.cascara.common.diagnostic.message.DiagnosticMessage<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __DiagnosticMessage__<br/>extends [DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                       | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| DiagnosticMessage([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| DiagnosticMessage([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                                  | Description |
|--------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)                      | [getCause](#getcause)()                                                                                                                 |             |
| public static [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) | [forException](#forexception)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause) |             |


### Methods inherited from [DetailedMessage](../../../../../../../io/github/qishr/cascara/common/i18n/DetailedMessage.md)

getFormat, name, getCode, getMessage, getDetails


## Method Details

### getCause

<span style="font-family: monospace; font-size: 80%;">public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) __getCause__()</span>




---

### forException

<span style="font-family: monospace; font-size: 80%;">public static [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) __forException__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause)</span>




---

