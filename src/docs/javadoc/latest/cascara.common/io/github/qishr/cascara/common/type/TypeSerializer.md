Package [io.github.qishr.cascara.common.type](index.md)

# Interface TypeSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.type.TypeSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeDescriptor](../../../../../../io/github/qishr/cascara/common/type/TypeDescriptor.md)<T>

All Known Implementing Classes:<br/>
    [StackTraceElementSerializer](../../../../../../io/github/qishr/cascara/common/type/lang/StackTraceElementSerializer.md), [ThrowableSerializer](../../../../../../io/github/qishr/cascara/common/type/lang/ThrowableSerializer.md), [ServicesCatalogSerializer](../../../../../../io/github/qishr/cascara/common/type/lang/ServicesCatalogSerializer.md), [ProcessHandleInfoSerializer](../../../../../../io/github/qishr/cascara/common/type/lang/ProcessHandleInfoSerializer.md), [ConfigurationSerializer](../../../../../../io/github/qishr/cascara/common/type/lang/ConfigurationSerializer.md), [EnumSetSerializer](../../../../../../io/github/qishr/cascara/common/type/util/EnumSetSerializer.md), [EnumMapSerializer](../../../../../../io/github/qishr/cascara/common/type/util/EnumMapSerializer.md), [AbstractYamlTypeSerializer](../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/processor/AbstractYamlTypeSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TypeSerializer__</span>


## Method Summary

| Modifier and Type                                                                               | Method                                                                                                                                                                                                                                                                                                                                  | Description                                                                                                                                                                 |
|-------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [AstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) | [serialize](#serialize)(T jvmInstance, [Context](../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)                                                                                                                                                                                            | Transforms a concrete Java object into its structural AST representation.                                                                                                   |
| public abstract T                                                                               | [deserialize](#deserialize)([AstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx) | Deserializes an AST node into a strongly-typed Java object.                                                                                                                 |
| public default boolean                                                                          | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)                                                                                                          | Type serializers don't need to validate, but they do everything else a type descriptor does, so we provide a default validate method here so implementations don't need to. |



## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public abstract [AstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) __serialize__(T jvmInstance, [Context](../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>

Transforms a concrete Java object into its structural AST representation.

**Parameters:**

`jvmInstance` - The live runtime object instance to serialize.

**Returns:**

The matching structural AstNode graph.

**Throws:**

[SerializerException](../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public abstract T __deserialize__([AstNode](../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) astNode, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType, [Context](../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Context.md) ctx)</span>

Deserializes an AST node into a strongly-typed Java object.

**Parameters:**

`astNode` - The structural AST node being parsed (e.g., YamlScalarNode, YamlMapNode).

`targetType` - Type information about the target type (useful when it's parameterized)

**Returns:**

The fully constructed Java object instance.

**Throws:**

[SerializerException](../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public default boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) collector)</span>

Type serializers don't need to validate, but they do
everything else a type descriptor does, so we provide a
default validate method here so implementations don't need to.

**Specified By:**

[TypeDescriptor](../../../../../../io/github/qishr/cascara/common/type/TypeDescriptor.md)


---

