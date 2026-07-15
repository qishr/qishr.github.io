Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.processor.AbstractSerializer](../../../cascara.common/lang/processor/AbstractSerializer.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlSerializer](YamlSerializer.md), [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../ast/YamlNode.md), [io.github.qishr.cascara.lang.yaml.ast.YamlScalarNode](../ast/YamlScalarNode.md), [io.github.qishr.cascara.lang.yaml.ast.YamlSequenceNode](../ast/YamlSequenceNode.md), [io.github.qishr.cascara.lang.yaml.ast.YamlMapNode](../ast/YamlMapNode.md), [io.github.qishr.cascara.lang.yaml.ast.YamlMapEntryNode](../ast/YamlMapEntryNode.md), [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../ast/YamlNode.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlSerializer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlSerializer__<br/>extends [AbstractSerializer](../../../cascara.common/lang/processor/AbstractSerializer.md)<[YamlSerializer](YamlSerializer.md), [YamlNode](../ast/YamlNode.md), [YamlScalarNode](../ast/YamlScalarNode.md), [YamlSequenceNode](../ast/YamlSequenceNode.md), [YamlMapNode](../ast/YamlMapNode.md), [YamlMapEntryNode](../ast/YamlMapEntryNode.md), [YamlNode](../ast/YamlNode.md)>
</span>

Standard implementation for YAML serialization.


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| YamlSerializer() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                    | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [YamlSerializer](YamlSerializer.md)                                                          | [self](#self)()                                                                                                                                                                                                                           |             |
| public [ContentType](../../../cascara.common/util/ContentType.md)                                   | [getContentType](#getcontenttype)()                                                                                                                                                                                                       |             |
| public [YamlSerializer](YamlSerializer.md)                                                          | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                                                                                                          |             |
| public [YamlSerializer](YamlSerializer.md)                                                          | [setOptions](#setoptions)([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)                                                                                                                             |             |
| public [YamlSerializer](YamlSerializer.md)                                                          | [setParser](#setparser)([AstParser](../../../cascara.common/lang/processor/AstParser.md)<[YamlNode](../ast/YamlNode.md), ?> parser)                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toText](#totext)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                               |             |
| public C                                                                                            | [fromText](#fromtext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)           |             |
| public C                                                                                            | [fromStream](#fromstream)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType) |             |
| public [YamlNode](../ast/YamlNode.md)                                                               | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)                                                                                                                 |             |
| public C                                                                                            | [fromAst](#fromast)([YamlNode](../ast/YamlNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)                                                                        |             |
| protected [YamlNode](../ast/YamlNode.md)                                                            | [serializeKey](#serializekey)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)                                                                                                           |             |


### Methods inherited from [AbstractSerializer](../../../cascara.common/lang/processor/AbstractSerializer.md)

serializeObject, serializeList, getAllMethods, serialize, serializeMap, getTypeDescriptor, getAllFields, getServiceProperties, registerTypeDescriptor, deserialize


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __self__()</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#self)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../cascara.common/util/ContentType.md) __getContentType__()</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __setOptions__([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#setoptions)


---

### setParser

<span style="font-family: monospace; font-size: 80%;">public [YamlSerializer](YamlSerializer.md) __setParser__([AstParser](../../../cascara.common/lang/processor/AstParser.md)<[YamlNode](../ast/YamlNode.md), ?> parser)</span>




---

### toText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toText__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### fromText

<span style="font-family: monospace; font-size: 80%;">public C __fromText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### fromStream

<span style="font-family: monospace; font-size: 80%;">public C __fromStream__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### toAst

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __toAst__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance)</span>




---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public C __fromAst__([YamlNode](../ast/YamlNode.md) astNode, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> jvmType)</span>




---

### serializeKey

<span style="font-family: monospace; font-size: 80%;">protected [YamlNode](../ast/YamlNode.md) __serializeKey__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) key)</span>



**Overrides:**

[AbstractSerializer](../cascara.common/lang/processor/AbstractSerializer.md#serializekey)


---

