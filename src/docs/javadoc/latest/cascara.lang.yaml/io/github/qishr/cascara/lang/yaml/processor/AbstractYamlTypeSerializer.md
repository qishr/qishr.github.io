Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class AbstractYamlTypeSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.type.AbstractTypeDescriptor](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<T><br/>
                io.github.qishr.cascara.lang.yaml.processor.AbstractYamlTypeSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeSerializer.md)<T>


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractYamlTypeSerializer__<br/>extends [AbstractTypeDescriptor](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)<T>
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| AbstractYamlTypeSerializer([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> javaType)                                                                                                                          |             |
| AbstractYamlTypeSerializer([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> javaType, [PrimitiveType](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/PrimitiveType.md) schemaType) |             |



## Method Summary

| Modifier and Type                                                                         | Method                                                                                                                                                                                                                                                                                                                                                                         | Description                                                               |
|-------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) | [serialize](#serialize)(T jvmInstance)                                                                                                                                                                                                                                                                                                                                         | Transforms a concrete Java object into its structural AST representation. |
| public T                                                                                  | [deserialize](#deserialize)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node)                                                                                                                                                                                                                                                           | Deserializes an AST node into a strongly-typed Java object.               |
| public final T                                                                            | [deserialize](#deserialize)([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx) | This explicitly overrides the top-level multi-format interface contract   |


### Methods inherited from [AbstractTypeDescriptor](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __serialize__(T jvmInstance)</span>

Transforms a concrete Java object into its structural AST representation.

**Parameters:**

`jvmInstance` - The live runtime object instance to serialize.

**Returns:**

The matching structural AstNode graph.

**Throws:**

[SerializerException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public T __deserialize__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) node)</span>

Deserializes an AST node into a strongly-typed Java object.

**Parameters:**

`node` - The structural AST node being parsed (e.g., YamlScalarNode, YamlMap).

**Returns:**

The fully constructed Java object instance.

**Throws:**

[SerializerException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public final T __deserialize__([AstNode](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>

This explicitly overrides the top-level multi-format interface contract

**Throws:**

[SerializerException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)

**Specified By:**

[TypeSerializer](../../../../../../../../cascara.common/io/github/qishr/cascara/common/type/TypeSerializer.md)


---

