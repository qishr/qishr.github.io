Package [io.github.qishr.cascara.schema.structure](index.md)

# Class ArraySchemaNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.structure.AbstractSchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/AbstractSchemaNode.md)<br/>
                io.github.qishr.cascara.schema.structure.ArraySchemaNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ArraySchemaNode__<br/>extends [AbstractSchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/AbstractSchemaNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                        | Description |
|--------------------------------------------------------------------------------------------------------------------|-------------|
| ArraySchemaNode([SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) metaSchema) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                   | Method                                                                                                                                                                                                                                                                                                                                                  | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md)                                                                                                                                                                                       | [getItemSchema](#getitemschema)()                                                                                                                                                                                                                                                                                                                       |             |
| public void                                                                                                                                                                                                                                                                         | [setItemTemplate](#setitemtemplate)([SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) items)                                                                                                                                                                                                                       |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md)> | [getProperties](#getproperties)()                                                                                                                                                                                                                                                                                                                       |             |
| public boolean                                                                                                                                                                                                                                                                      | [validate](#validate)([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter) |             |


### Methods inherited from [AbstractSchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/AbstractSchemaNode.md)

getDescription, getDescriptionKey, getOriginAst, getRef, getEndColumn, isRef, getPropertySchema, getRules, setRef, getExtensions, toString, setOriginUri, getFormat, setDynamicAnchor, getEndLine, getComments, getDefinition, getMetaSchema, setFormatOption, setDescription, getChildren, setOriginAst, setReadOnly, getDefinitions, getTitle, getExtension, getFormatOption, setExtension, addAllOf, addDefinition, getStartLine, getAllOf, getOriginUri, setDefaultValue, getType, isReadOnly, getContentMediaType, getStartColumn, getDynamicAnchor, addRule, setDescriptionKey, getTitleKey, getProperty, setFormat, setType, setTitle, setTitleKey, getDefaultValue, setContentMediaType


## Method Details

### getItemSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) __getItemSchema__()</span>




---

### setItemTemplate

<span style="font-family: monospace; font-size: 80%;">public void __setItemTemplate__([SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) items)</span>




---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md)> __getProperties__()</span>



**Overrides:**

[AbstractSchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/AbstractSchemaNode.md#getproperties)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>



**Overrides:**

[AbstractSchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/AbstractSchemaNode.md#validate)


---

