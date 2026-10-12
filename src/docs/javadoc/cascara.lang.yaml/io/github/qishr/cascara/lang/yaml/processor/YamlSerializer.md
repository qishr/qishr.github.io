Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.processor.AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md), [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md), [io.github.qishr.cascara.lang.yaml.ast.YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md), [io.github.qishr.cascara.lang.yaml.ast.YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md), [io.github.qishr.cascara.lang.yaml.ast.YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md), [io.github.qishr.cascara.lang.yaml.ast.YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md), [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlSerializer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlSerializer__<br/>extends [AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md)<[YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md), [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md), [YamlScalar](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlScalar.md), [YamlSequence](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlSequence.md), [YamlMap](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMap.md), [YamlMapEntry](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlMapEntry.md), [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>
</span>

Standard implementation for YAML serialization.


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| YamlSerializer() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md)     | [self](#self)()                                                                                                                                                                                                                                                                                                                                              |             |
| public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) | [getContentType](#getcontenttype)()                                                                                                                                                                                                                                                                                                                          |             |
| public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md)     | [setReporter](#setreporter)([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)                                                                                                                                                                                                        |             |
| public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md)     | [setOptions](#setoptions)([LanguageOptions](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)                                                                                                                                                                                                  |             |
| public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md)     | [setParser](#setparser)([AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md), ?, ?> parser)                                                                                                                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [toString](#tostring)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                              |             |
| public void                                                                                                     | [toWriter](#towriter)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)                                                                                                                           |             |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                       | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                                                                                    |             |
| public C                                                                                                        | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                                                                          |             |
| public C                                                                                                        | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)                                                                                                   |             |
| public C                                                                                                        | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                                                                          |             |
| public C                                                                                                        | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)                                                                                                   |             |
| public C                                                                                                        | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                                                                    |             |
| public C                                                                                                        | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)                                                                                             |             |
| public C                                                                                                        | [fromAst](#fromast)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                                                                                       |             |
| public C                                                                                                        | [fromAst](#fromast)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) astNode, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)                                                                                                                |             |
| protected [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                    | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                                                                              |             |
| protected void                                                                                                  | [setupSerializer](#setupserializer)()                                                                                                                                                                                                                                                                                                                        |             |
| protected void                                                                                                  | [error](#error)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node, [DiagnosticMessage](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)    |             |
| protected void                                                                                                  | [warn](#warn)([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token, [DiagnosticMessage](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)          | [debugNode](#debugnode)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node)                                                                                                                                                                                                                                             |             |
| protected void                                                                                                  | [debugStringBuilder](#debugstringbuilder)()                                                                                                                                                                                                                                                                                                                  |             |
| protected void                                                                                                  | [report](#report)([Level](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)         |             |


### Methods inherited from [AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md)

serializeObject, warn, serializeArray, trace, error, serialize, serializeMap, getTypeDescriptor, getTypeDescriptor, debug, getAllSerializableFields, deserialize, setUseProviderFactory, serializeList, warnInaccessible, deserialize, getServiceProperties, registerTypeDescriptor, warnInaccessible


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md) __self__()</span>



**Overrides:**

[AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md#self)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) __getContentType__()</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md) __setReporter__([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md) __setOptions__([LanguageOptions](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>



**Overrides:**

[AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md#setoptions)


---

### setParser

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlSerializer.md) __setParser__([AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md), ?, ?> parser)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### toWriter

<span style="font-family: monospace; font-size: 80%;">public void __toWriter__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### toAst

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __toAst__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) astNode, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### serializeKey

<span style="font-family: monospace; font-size: 80%;">protected [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __serializeKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Overrides:**

[AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md#serializekey)


---

### setupSerializer

<span style="font-family: monospace; font-size: 80%;">protected void __setupSerializer__()</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node, [DiagnosticMessage](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### warn

<span style="font-family: monospace; font-size: 80%;">protected void __warn__([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token, [DiagnosticMessage](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### debugNode

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __debugNode__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node)</span>




---

### debugStringBuilder

<span style="font-family: monospace; font-size: 80%;">protected void __debugStringBuilder__()</span>




---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Level](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

