Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.processor.AbstractSerializer](../../../cascara.common/lang/processor/AbstractSerializer.md)<[io.github.qishr.cascara.lang.json.processor.JsonSerializer](JsonSerializer.md), [io.github.qishr.cascara.lang.json.ast.JsonNode](../ast/JsonNode.md), [io.github.qishr.cascara.lang.json.ast.JsonScalarNode](../ast/JsonScalarNode.md), [io.github.qishr.cascara.lang.json.ast.JsonSequenceNode](../ast/JsonSequenceNode.md), [io.github.qishr.cascara.lang.json.ast.JsonMapNode](../ast/JsonMapNode.md), [io.github.qishr.cascara.lang.json.ast.JsonMapEntryNode](../ast/JsonMapEntryNode.md), [java.lang.String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonSerializer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JsonSerializer__<br/>extends [AbstractSerializer](../../../cascara.common/lang/processor/AbstractSerializer.md)<[JsonSerializer](JsonSerializer.md), [JsonNode](../ast/JsonNode.md), [JsonScalarNode](../ast/JsonScalarNode.md), [JsonSequenceNode](../ast/JsonSequenceNode.md), [JsonMapNode](../ast/JsonMapNode.md), [JsonMapEntryNode](../ast/JsonMapEntryNode.md), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>
</span>

Standard implementation for JSON serialization.


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| JsonSerializer() |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                                                                                                                                    | Description |
|--------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [JsonSerializer](JsonSerializer.md)                                                          | [self](#self)()                                                                                                                                                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                           |             |
| public [ContentType](../../../cascara.common/util/ContentType.md)                                      | [getContentType](#getcontenttype)()                                                                                                                                                                                                       |             |
| public [JsonSerializer](JsonSerializer.md)                                                             | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                                                                                                          |             |
| public [JsonSerializer](JsonSerializer.md)                                                             | [setOptions](#setoptions)([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)                                                                                                                             |             |
| public [JsonSerializer](JsonSerializer.md)                                                             | [setParser](#setparser)([AstParser](../../../cascara.common/lang/processor/AstParser.md)<[JsonNode](../ast/JsonNode.md), ?> parser)                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)    | [toText](#totext)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                               |             |
| public [JsonNode](../ast/JsonNode.md)                                                                  | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                 |             |
| public void                                                                                            | [toWriter](#towriter)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)        |             |
| public C                                                                                               | [fromText](#fromtext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)           |             |
| public C                                                                                               | [fromText](#fromtext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                                  |             |
| public C                                                                                               | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)       |             |
| public C                                                                                               | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                              |             |
| public C                                                                                               | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType) |             |
| public C                                                                                               | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                        |             |
| public C                                                                                               | [fromAst](#fromast)([JsonNode](../ast/JsonNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                        |             |
| public C                                                                                               | [fromAst](#fromast)([JsonNode](../ast/JsonNode.md) astNode, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                                                                                               |             |


### Methods inherited from [AbstractSerializer](../../../cascara.common/lang/processor/AbstractSerializer.md)

serializeObject, serializeList, getAllMethods, error, serialize, serializeMap, getTypeDescriptor, deserialize, getAllFields, getServiceProperties, registerTypeDescriptor, deserialize


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonSerializer](JsonSerializer.md) __self__()</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#self)


---

### serializeKey

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __serializeKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#serializekey)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../cascara.common/util/ContentType.md) __getContentType__()</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [JsonSerializer](JsonSerializer.md) __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [JsonSerializer](JsonSerializer.md) __setOptions__([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#setoptions)


---

### setParser

<span style="font-family: monospace; font-size: 80%;">public [JsonSerializer](JsonSerializer.md) __setParser__([AstParser](../../../cascara.common/lang/processor/AstParser.md)<[JsonNode](../ast/JsonNode.md), ?> parser)</span>




---

### toText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toText__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### toAst

<span style="font-family: monospace; font-size: 80%;">public [JsonNode](../ast/JsonNode.md) __toAst__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### toWriter

<span style="font-family: monospace; font-size: 80%;">public void __toWriter__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### fromText

<span style="font-family: monospace; font-size: 80%;">public C __fromText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromText

<span style="font-family: monospace; font-size: 80%;">public C __fromText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([JsonNode](../ast/JsonNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([JsonNode](../ast/JsonNode.md) astNode, [TypeReference](../../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

