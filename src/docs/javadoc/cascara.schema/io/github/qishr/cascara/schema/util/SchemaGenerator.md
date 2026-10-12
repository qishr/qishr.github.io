Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchemaGenerator
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaGenerator<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __SchemaGenerator__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                               | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [DESCRIPTION_KEY](#description_key) |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ENUM_KEY](#enum_key)               |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [TITLE_KEY](#title_key)             |             |



## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| SchemaGenerator() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                            | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Description                     |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------|
| public void                                                                                                                                                                                  | [registerTypeAnalyzer](#registertypeanalyzer)([TypeAnalyzer](../../../../../../io/github/qishr/cascara/schema/util/TypeAnalyzer.md) ta)                                                                                                                                                                                                                                                                                                                              |                                 |
| public void                                                                                                                                                                                  | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> typeDescriptor)                                                                                                                                                                                                                                                                                |                                 |
| public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                         | [generate](#generate)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template)                                                                                                                                                                                                                                                                                                                                         |                                 |
| public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                         | [generate](#generate)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                                                                                                                                           | Generates a schema for a class. |
| public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                         | [generate](#generate)([PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) parentDoc, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                  |                                 |
| public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                         | [generate](#generate)([MapAstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                        |                                 |
| public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md)                                                                         | [generate](#generate)([MapAstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template) |                                 |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>> | [getReferencedClasses](#getreferencedclasses)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                                                                                                                   |                                 |



## Field Details

### DESCRIPTION_KEY

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __DESCRIPTION_KEY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### ENUM_KEY

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ENUM_KEY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### TITLE_KEY

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __TITLE_KEY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### registerTypeAnalyzer

<span style="font-family: monospace; font-size: 80%;">public void __registerTypeAnalyzer__([TypeAnalyzer](../../../../../../io/github/qishr/cascara/schema/util/TypeAnalyzer.md) ta)</span>




---

### registerTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public void __registerTypeDescriptor__([TypeDescriptor](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> typeDescriptor)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __generate__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __generate__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>

Generates a schema for a class.If the class is annotated with @SchemaDefinition, the name and description
specified there is used in the generated schema.
Fields must be annotated with @SchemaProperty to be included in the
generated schema.


---

### generate

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __generate__([PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) parentDoc, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __generate__([MapAstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [PlainMapNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/plain/PlainMapNode.md) __generate__([MapAstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template)</span>




---

### getReferencedClasses

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>> __getReferencedClasses__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

