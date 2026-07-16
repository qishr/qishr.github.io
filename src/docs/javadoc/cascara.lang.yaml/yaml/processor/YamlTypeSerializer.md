Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlTypeSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.type.AbstractTypeDescriptor](../../../cascara.common/lang/type/AbstractTypeDescriptor.md)<T><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlTypeSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeSerializer](../../../cascara.common/lang/type/TypeSerializer.md)<T>


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __YamlTypeSerializer__<br/>extends [AbstractTypeDescriptor](../../../cascara.common/lang/type/AbstractTypeDescriptor.md)<T>
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                         | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlTypeSerializer([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> javaType)                                                                                                          |             |
| YamlTypeSerializer([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> javaType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaType) |             |



## Method Summary

| Modifier and Type                     | Method                                                                                   | Description                                                               |
|---------------------------------------|------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| public [YamlNode](../ast/YamlNode.md) | [serialize](#serialize)(T jvmInstance)                                                   | Transforms a concrete Java object into its structural AST representation. |
| public T                              | [deserialize](#deserialize)([YamlNode](../ast/YamlNode.md) node)                         | Deserializes an AST node into a strongly-typed Java object.               |
| public final T                        | [deserialize](#deserialize)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node) | This explicitly overrides the top-level multi-format interface contract   |


### Methods inherited from [AbstractTypeDescriptor](../../../cascara.common/lang/type/AbstractTypeDescriptor.md)

getSchemaType, populateSchema, getServiceProperties, getJvmType


## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __serialize__(T jvmInstance)</span>

Transforms a concrete Java object into its structural AST representation.

**Parameters:**

`jvmInstance` - The live runtime object instance to serialize.

**Returns:**

The matching structural AstNode graph.

**Throws:**

[SerializerException](../../../cascara.common/lang/exception/SerializerException.md)

**Specified By:**

[TypeSerializer](../../../cascara.common/lang/type/TypeSerializer.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public T __deserialize__([YamlNode](../ast/YamlNode.md) node)</span>

Deserializes an AST node into a strongly-typed Java object.

**Parameters:**

`node` - The structural AST node being parsed (e.g., YamlScalarNode, YamlMapNode).

**Returns:**

The fully constructed Java object instance.

**Throws:**

[SerializerException](../../../cascara.common/lang/exception/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public final T __deserialize__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node)</span>

This explicitly overrides the top-level multi-format interface contract

**Throws:**

[SerializerException](../../../cascara.common/lang/exception/SerializerException.md)

**Specified By:**

[TypeSerializer](../../../cascara.common/lang/type/TypeSerializer.md)


---

