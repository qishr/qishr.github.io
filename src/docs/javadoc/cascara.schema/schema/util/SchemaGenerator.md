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

| Modifier and Type                                                                     | Method                                                                                                                                                                                                                                                                                                                                                                                                                    | Description |
|---------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                           | [registerTypeAnalyzer](#registertypeanalyzer)([TypeAnalyzer](TypeAnalyzer.md) ta)                                                                                                                                                                                                                                                                                                                                         |             |
| public void                                                                           | [registerTypeDescriptor](#registertypedescriptor)([TypeDescriptor](../../../cascara.common/lang/type/TypeDescriptor.md)<?> typeDescriptor)                                                                                                                                                                                                                                                                                |             |
| public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) | [generate](#generate)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template)                                                                                                                                                                                                                                                                                              |             |
| public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) | [generate](#generate)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                                                                                                |             |
| public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) | [generate](#generate)([ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) parentDoc, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                      |             |
| public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) | [generate](#generate)([MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                        |             |
| public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) | [generate](#generate)([MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template) |             |



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

<span style="font-family: monospace; font-size: 80%;">public void __registerTypeAnalyzer__([TypeAnalyzer](TypeAnalyzer.md) ta)</span>




---

### registerTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public void __registerTypeDescriptor__([TypeDescriptor](../../../cascara.common/lang/type/TypeDescriptor.md)<?> typeDescriptor)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) __generate__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) __generate__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) __generate__([ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) parentDoc, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) __generate__([MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### generate

<span style="font-family: monospace; font-size: 80%;">public [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) __generate__([MapAstNode](../../../cascara.common/lang/ast/MapAstNode.md)<?, ?, ?> parentDoc, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragment, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) template)</span>




---

