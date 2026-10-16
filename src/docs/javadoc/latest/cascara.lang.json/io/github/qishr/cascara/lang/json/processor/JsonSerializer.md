Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.processor.AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md)<[io.github.qishr.cascara.lang.json.processor.JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md), [io.github.qishr.cascara.lang.json.ast.JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md), [io.github.qishr.cascara.lang.json.ast.JsonScalar](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonScalar.md), [io.github.qishr.cascara.lang.json.ast.JsonArray](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonArray.md), [io.github.qishr.cascara.lang.json.ast.JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md), [io.github.qishr.cascara.lang.json.ast.JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md), [java.lang.String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonSerializer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JsonSerializer__<br/>extends [AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md)<[JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md), [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md), [JsonScalar](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonScalar.md), [JsonArray](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonArray.md), [JsonObject](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonObject.md), [JsonProperty](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonProperty.md), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>
</span>

Standard implementation for JSON serialization.


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| JsonSerializer() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                                                                                                      | Description |
|-----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md)  | [self](#self)()                                                                                                                                                                                                                                             |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)          | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                             |             |
| public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) | [getContentType](#getcontenttype)()                                                                                                                                                                                                                         |             |
| public [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md)     | [setReporter](#setreporter)([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)                                                                                                       |             |
| public [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md)     | [setOptions](#setoptions)([LanguageOptions](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)                                                                                                 |             |
| public [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md)     | [setParser](#setparser)([AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md), ?, ?> parser)                    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [toString](#tostring)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                             |             |
| public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md)                       | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                   |             |
| public void                                                                                                     | [toWriter](#towriter)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)                          |             |
| public C                                                                                                        | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                         |             |
| public C                                                                                                        | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)       |             |
| public C                                                                                                        | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                         |             |
| public C                                                                                                        | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)       |             |
| public C                                                                                                        | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                   |             |
| public C                                                                                                        | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef) |             |
| public C                                                                                                        | [fromAst](#fromast)([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                    |             |
| public C                                                                                                        | [fromAst](#fromast)([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)  |             |
| protected void                                                                                                  | [setupSerializer](#setupserializer)()                                                                                                                                                                                                                       |             |


### Methods inherited from [AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md)

warn, trace, error, serialize, debug, registerTypeDescriptor, deserialize, warnInaccessible, setProviderFactoryEnabled, setHeuristicMatchEnabled, getServiceProperties, report, deserialize, warnInaccessible


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md) __self__()</span>



**Overrides:**

[AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md#self)


---

### serializeKey

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __serializeKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Overrides:**

[AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md#serializekey)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md) __getContentType__()</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md) __setReporter__([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md) __setOptions__([LanguageOptions](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>



**Overrides:**

[AbstractSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AbstractSerializer.md#setoptions)


---

### setParser

<span style="font-family: monospace; font-size: 80%;">public [JsonSerializer](../../../../../../../io/github/qishr/cascara/lang/json/processor/JsonSerializer.md) __setParser__([AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)<[JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md), ?, ?> parser)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### toAst

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../../../../../../../io/github/qishr/cascara/lang/json/ast/JsonNode.md) __toAst__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### toWriter

<span style="font-family: monospace; font-size: 80%;">public void __toWriter__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### fromString

<span style="font-family: monospace; font-size: 80%;">public C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [TypeReference](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeReference.md)<C> typeRef)</span>




---

### setupSerializer

<span style="font-family: monospace; font-size: 80%;">protected void __setupSerializer__()</span>




---

