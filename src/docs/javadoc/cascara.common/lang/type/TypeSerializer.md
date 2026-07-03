Package [io.github.qishr.cascara.common.lang.type](index.md)

# Interface TypeSerializer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.type.TypeSerializer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TypeDescriptor](TypeDescriptor.md)<T>


----

<span style="font-family: monospace; font-size: 80%;">public interface __TypeSerializer__</span>


## Method Summary

| Modifier and Type                            | Method                                                                                                                                                                       | Description                                                                                                                                                                 |
|----------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [AstNode](../ast/AstNode.md) | [serialize](#serialize)(T jvmInstance)                                                                                                                                       | Transforms a concrete Java object into its structural AST representation.                                                                                                   |
| public abstract T                            | [deserialize](#deserialize)([AstNode](../ast/AstNode.md) astNode)                                                                                                            | Deserializes an AST node into a strongly-typed Java object.                                                                                                                 |
| public default boolean                       | [validate](#validate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector) | Type serializers don't need to validate, but they do everything else a type descriptor does, so we provide a default validate method here so implementations don't need to. |



## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">public abstract [AstNode](../ast/AstNode.md) __serialize__(T jvmInstance)</span>

Transforms a concrete Java object into its structural AST representation.

**Parameters:**

`jvmInstance` - The live runtime object instance to serialize.

**Returns:**

The matching structural AstNode graph.

**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### deserialize

<span style="font-family: monospace; font-size: 80%;">public abstract T __deserialize__([AstNode](../ast/AstNode.md) astNode)</span>

Deserializes an AST node into a strongly-typed Java object.

**Parameters:**

`astNode` - The structural AST node being parsed (e.g., YamlScalarNode, YamlMapNode).

**Returns:**

The fully constructed Java object instance.

**Throws:**

[SerializerException](../exception/SerializerException.md)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public default boolean __validate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Reporter](../../diagnostic/Reporter.md) collector)</span>

Type serializers don't need to validate, but they do
everything else a type descriptor does, so we provide a
default validate method here so implementations don't need to.

**Specified By:**

[TypeDescriptor](TypeDescriptor.md)


---

