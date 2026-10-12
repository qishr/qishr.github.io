Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Interface DiagnosticMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.message.DiagnosticMessage<br/>
<br/>
All Known Implementing Classes:<br/>
    [ColorMessage](../../color/ColorMessage.md), [HttpMessage](HttpMessage.md), [DnsMessage](DnsMessage.md), [GenericMessage](GenericMessage.md), [InetMessage](InetMessage.md), [FileMessage](FileMessage.md), [ExecutionMessage](../../exec/ExecutionMessage.md), [LangMessage](../../lang/diagnostic/LangMessage.md), [ServiceMessage](../../service/ServiceMessage.md), [TrackingMessage](../../trackable/TrackingMessage.md), [ContentTypeMessage](../../../cascara.common.io/content/type/ContentTypeMessage.md), [SchemaDiagnosticMessage](../../cascara.schema/SchemaDiagnosticMessage.md), [JsonDiagnosticMessage](../../cascara.lang.json/JsonDiagnosticMessage.md), [YamlDiagnosticMessage](../../cascara.lang.yaml/YamlDiagnosticMessage.md), [UiDiagnosticMessage](../../../cascara.ui/api/UiDiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __DiagnosticMessage__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                              | Description |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [name](#name)()                                                                                                                     |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                               |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                                           |             |
| public static [DiagnosticMessage](DiagnosticMessage.md)                                                      | [forException](#forexception)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |             |



## Method Details

### name

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __name__()</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>




---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>




---

### forException

<span style="font-family: monospace; font-size: 80%;">public static [DiagnosticMessage](DiagnosticMessage.md) __forException__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

