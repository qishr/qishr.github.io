Package [io.github.qishr.cascara.schema.structure](index.md)

# Class ArraySchemaNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.structure.AbstractSchemaNode](AbstractSchemaNode.md)<br/>
                io.github.qishr.cascara.schema.structure.ArraySchemaNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ArraySchemaNode__<br/>extends [AbstractSchemaNode](AbstractSchemaNode.md)
</span>


## Constructor Summary

| Constructor                                             | Description |
|---------------------------------------------------------|-------------|
| ArraySchemaNode([SchemaNode](SchemaNode.md) metaSchema) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                        | Method                                                                                                                                                                                                                                                     | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                       | [getItemSchema](#getitemschema)()                                                                                                                                                                                                                          |             |
| public void                                                                                                                                                                                                              | [setItemTemplate](#setitemtemplate)([SchemaNode](SchemaNode.md) items)                                                                                                                                                                                     |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> | [getProperties](#getproperties)()                                                                                                                                                                                                                          |             |
| public boolean                                                                                                                                                                                                           | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |             |


### Methods inherited from [AbstractSchemaNode](AbstractSchemaNode.md)

setType, getTitle, getDescription, getExtension, getFormatOption, setExtension, addAllOf, getDescriptionKey, addDefinition, getOriginAst, getRef, getStartLine, getAllOf, getEndColumn, isRef, getOriginUri, setDefaultValue, getType, isReadOnly, getPropertySchema, getRules, setRef, getContentMediaType, getExtensions, setOriginUri, getStartColumn, getDynamicAnchor, addRule, getFormat, setDescriptionKey, getTitleKey, getProperty, setDynamicAnchor, getEndLine, getComments, setFormat, setTitle, getDefinition, getMetaSchema, setTitleKey, setFormatOption, setDescription, getDefaultValue, getChildren, setOriginAst, setReadOnly, getDefinitions, setContentMediaType


## Method Details

### getItemSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getItemSchema__()</span>




---

### setItemTemplate

<span style="font-family: monospace; font-size: 80%;">public void __setItemTemplate__([SchemaNode](SchemaNode.md) items)</span>




---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getProperties__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getproperties)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#validate)


---

