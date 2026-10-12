Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Interface DiagnosticMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.message.DiagnosticMessage<br/>
<br/>
All Known Implementing Classes:<br/>
    [ColorMessage](../../../../../../../io/github/qishr/cascara/common/color/ColorMessage.md), [HttpMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/HttpMessage.md), [DnsMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DnsMessage.md), [GenericMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/GenericMessage.md), [InetMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/InetMessage.md), [FileMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/FileMessage.md), [ExecutionMessage](../../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md), [LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md), [ServiceMessage](../../../../../../../io/github/qishr/cascara/common/service/ServiceMessage.md), [TrackingMessage](../../../../../../../io/github/qishr/cascara/common/trackable/TrackingMessage.md), [ContentTypeMessage](../../../../../../../../cascara.common.io/io/github/qishr/cascara/common/content/type/ContentTypeMessage.md), [SchemaDiagnosticMessage](../../../../../../../../cascara.schema/io/github/qishr/cascara/schema/diagnostic/SchemaDiagnosticMessage.md), [JsonDiagnosticMessage](../../../../../../../../cascara.lang.json/io/github/qishr/cascara/lang/json/diagnostic/JsonDiagnosticMessage.md), [YamlDiagnosticMessage](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/diagnostic/YamlDiagnosticMessage.md), [UiDiagnosticMessage](../../../../../../../../cascara.ui/io/github/qishr/cascara/ui/api/UiDiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __DiagnosticMessage__</span>


## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                              | Description |
|--------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                   | [name](#name)()                                                                                                                     |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                   | [getCode](#getcode)()                                                                                                               |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                   | [getFormat](#getformat)()                                                                                                           |             |
| public static [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) | [forException](#forexception)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |             |



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

<span style="font-family: monospace; font-size: 80%;">public static [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) __forException__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

