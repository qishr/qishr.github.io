Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.processor.AbstractSerializer](../../cascara.common/lang/processor/AbstractSerializer.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlSerializer](YamlSerializer.md), [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../ast/YamlNode.md), [io.github.qishr.cascara.lang.yaml.ast.YamlScalar](../ast/YamlScalar.md), [io.github.qishr.cascara.lang.yaml.ast.YamlSequence](../ast/YamlSequence.md), [io.github.qishr.cascara.lang.yaml.ast.YamlMap](../ast/YamlMap.md), [io.github.qishr.cascara.lang.yaml.ast.YamlMapEntry](../ast/YamlMapEntry.md), [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../ast/YamlNode.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlSerializer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlSerializer__<br/>extends [AbstractSerializer](../../cascara.common/lang/processor/AbstractSerializer.md)<[YamlSerializer](YamlSerializer.md), [YamlNode](../ast/YamlNode.md), [YamlScalar](../ast/YamlScalar.md), [YamlSequence](../ast/YamlSequence.md), [YamlMap](../ast/YamlMap.md), [YamlMapEntry](../ast/YamlMapEntry.md), [YamlNode](../ast/YamlNode.md)>
</span>

Standard implementation for YAML serialization.


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| YamlSerializer() |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                                                                                                                                                                                              | Description |
|--------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlSerializer](YamlSerializer.md)                                                             | [self](#self)()                                                                                                                                                                                                                                                                                     |             |
| public [ContentType](../../cascara.common/util/ContentType.md)                                         | [getContentType](#getcontenttype)()                                                                                                                                                                                                                                                                 |             |
| public [YamlSerializer](YamlSerializer.md)                                                             | [setReporter](#setreporter)([Reporter](../../cascara.common/diagnostic/Reporter.md) reporter)                                                                                                                                                                                                       |             |
| public [YamlSerializer](YamlSerializer.md)                                                             | [setOptions](#setoptions)([LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options)                                                                                                                                                                                          |             |
| public [YamlSerializer](YamlSerializer.md)                                                             | [setParser](#setparser)([AstParser](../../cascara.common/lang/processor/AstParser.md)<[YamlNode](../ast/YamlNode.md), ?, ?> parser)                                                                                                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)    | [toString](#tostring)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                     |             |
| public void                                                                                            | [toWriter](#towriter)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)                                                                  |             |
| public [YamlNode](../ast/YamlNode.md)                                                                  | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                                                                           |             |
| public C                                                                                               | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                 |             |
| public C                                                                                               | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                                                                                           |             |
| public C                                                                                               | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                 |             |
| public C                                                                                               | [fromReader](#fromreader)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                                                                                           |             |
| public C                                                                                               | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                           |             |
| public C                                                                                               | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                                                                                     |             |
| public C                                                                                               | [fromAst](#fromast)([YamlNode](../ast/YamlNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                                                                                  |             |
| public C                                                                                               | [fromAst](#fromast)([YamlNode](../ast/YamlNode.md) astNode, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)                                                                                                                                                            |             |
| protected [YamlNode](../ast/YamlNode.md)                                                               | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                                                                                     |             |
| protected void                                                                                         | [setupSerializer](#setupserializer)()                                                                                                                                                                                                                                                               |             |
| protected void                                                                                         | [error](#error)([YamlNode](../ast/YamlNode.md) node, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                         |             |
| protected void                                                                                         | [warn](#warn)([YamlToken](../token/YamlToken.md) token, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                      |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [debugNode](#debugnode)([YamlNode](../ast/YamlNode.md) node)                                                                                                                                                                                                                                        |             |
| protected void                                                                                         | [debugStringBuilder](#debugstringbuilder)()                                                                                                                                                                                                                                                         |             |
| protected void                                                                                         | [report](#report)([Level](../../cascara.common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |


### Methods inherited from [AbstractSerializer](../../cascara.common/lang/processor/AbstractSerializer.md)

serializeObject, [warn](#warn), trace, getAllMethods, [error](#error), serialize, serializeMap, getTypeDescriptor, debug, serializeList, warnInaccessible, deserialize, getAllFields, getServiceProperties, deserialize, registerTypeDescriptor, warnInaccessible


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __self__()</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#self)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../cascara.common/util/ContentType.md) __getContentType__()</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __setReporter__([Reporter](../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __setOptions__([LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#setoptions)


---

### setParser

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __setParser__([AstParser](../../cascara.common/lang/processor/AstParser.md)<[YamlNode](../ast/YamlNode.md), ?, ?> parser)</span>




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

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __toAst__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public C __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromReader

<span style="font-family: monospace; font-size: 80%;">public C __fromReader__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([YamlNode](../ast/YamlNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([YamlNode](../ast/YamlNode.md) astNode, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<C> typeRef)</span>




---

### serializeKey

<span style="font-family: monospace; font-size: 80%;">protected [YamlNode](../ast/YamlNode.md) __serializeKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#serializekey)


---

### setupSerializer

<span style="font-family: monospace; font-size: 80%;">protected void __setupSerializer__()</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([YamlNode](../ast/YamlNode.md) node, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### warn

<span style="font-family: monospace; font-size: 80%;">protected void __warn__([YamlToken](../token/YamlToken.md) token, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### debugNode

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __debugNode__([YamlNode](../ast/YamlNode.md) node)</span>




---

### debugStringBuilder

<span style="font-family: monospace; font-size: 80%;">protected void __debugStringBuilder__()</span>




---

### report

<span style="font-family: monospace; font-size: 80%;">protected void __report__([Level](../../cascara.common/diagnostic/Diagnostic.Level.md) level, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

