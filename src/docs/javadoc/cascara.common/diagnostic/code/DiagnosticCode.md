Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Interface DiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.code.DiagnosticCode<br/>
<br/>
All Known Implementing Classes:<br/>
    [FileDiagnosticCode](FileDiagnosticCode.md), [HttpDiagnosticCode](HttpDiagnosticCode.md), [LangDiagnosticCode](LangDiagnosticCode.md), [GenericDiagnosticCode](GenericDiagnosticCode.md), [DnsDiagnosticCode](DnsDiagnosticCode.md), [InetDiagnosticCode](InetDiagnosticCode.md), [ServiceDiagnosticCode](ServiceDiagnosticCode.md), [ContentTypeDiagnosticCode](../../../cascara.common.io/content/type/ContentTypeDiagnosticCode.md), [SchemaDiagnosticCode](../../../cascara.schema/schema/SchemaDiagnosticCode.md), [YamlDiagnosticCode](../../../cascara.lang.yaml/yaml/exception/YamlDiagnosticCode.md), [UiDiagnosticCode](../../../cascara.ui/api/UiDiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __DiagnosticCode__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                      | Description |
|--------------------------------------------------------------------------------------------------------------|-----------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()       |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)() |             |



## Method Details

### getCode

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>




---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>




---

