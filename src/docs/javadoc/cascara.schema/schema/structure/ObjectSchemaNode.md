Package [io.github.qishr.cascara.schema.structure](index.md)

# Class ObjectSchemaNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.structure.AbstractSchemaNode](AbstractSchemaNode.md)<br/>
                io.github.qishr.cascara.schema.structure.ObjectSchemaNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ObjectSchemaNode__<br/>extends [AbstractSchemaNode](AbstractSchemaNode.md)
</span>


## Constructor Summary

| Constructor                                              | Description |
|----------------------------------------------------------|-------------|
| ObjectSchemaNode([SchemaNode](SchemaNode.md) metaSchema) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                        | Method                                                                                                                                                                                                                                                     | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                                              | [addProperty](#addproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [SchemaNode](SchemaNode.md) node)                                                                                           |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> | [getProperties](#getproperties)()                                                                                                                                                                                                                          |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                       | [getItemSchema](#getitemschema)()                                                                                                                                                                                                                          |             |
| public boolean                                                                                                                                                                                                           | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                       | [getPropertySchema](#getpropertyschema)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                  |             |
| public void                                                                                                                                                                                                              | [setAdditionalPropertiesSchema](#setadditionalpropertiesschema)([SchemaNode](SchemaNode.md) schema)                                                                                                                                                        |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                       | [getAdditionalPropertiesSchema](#getadditionalpropertiesschema)()                                                                                                                                                                                          |             |
| public void                                                                                                                                                                                                              | [setUnevaluatedPropertiesSchema](#setunevaluatedpropertiesschema)([SchemaNode](SchemaNode.md) schema)                                                                                                                                                      |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                       | [getUnevaluatedPropertiesSchema](#getunevaluatedpropertiesschema)()                                                                                                                                                                                        |             |
| public void                                                                                                                                                                                                              | [setUnevaluatedPropertiesAllowed](#setunevaluatedpropertiesallowed)(boolean allowed)                                                                                                                                                                       |             |
| public boolean                                                                                                                                                                                                           | [areUnevaluatedPropertiesAllowed](#areunevaluatedpropertiesallowed)()                                                                                                                                                                                      |             |
| public void                                                                                                                                                                                                              | [setAdditionalPropertiesAllowed](#setadditionalpropertiesallowed)(boolean b)                                                                                                                                                                               |             |
| public boolean                                                                                                                                                                                                           | [areAdditionalPropertiesAllowed](#areadditionalpropertiesallowed)()                                                                                                                                                                                        |             |


### Methods inherited from [AbstractSchemaNode](AbstractSchemaNode.md)

setType, getTitle, getDescription, getExtension, getFormatOption, setExtension, addAllOf, getDescriptionKey, addDefinition, getOriginAst, getRef, getStartLine, getAllOf, getEndColumn, isRef, getOriginUri, setDefaultValue, getType, isReadOnly, getRules, setRef, getContentMediaType, getExtensions, setOriginUri, getStartColumn, getDynamicAnchor, addRule, getFormat, setDescriptionKey, getTitleKey, getProperty, setDynamicAnchor, getEndLine, getComments, setFormat, setTitle, getDefinition, getMetaSchema, setTitleKey, setFormatOption, setDescription, getDefaultValue, getChildren, setOriginAst, setReadOnly, getDefinitions, setContentMediaType


## Method Details

### addProperty

<span style="font-family: monospace; font-size: 80%;">public void __addProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [SchemaNode](SchemaNode.md) node)</span>




---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getProperties__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getproperties)


---

### getItemSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getItemSchema__()</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#validate)


---

### getPropertySchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getPropertySchema__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getpropertyschema)


---

### setAdditionalPropertiesSchema

<span style="font-family: monospace; font-size: 80%;">public void __setAdditionalPropertiesSchema__([SchemaNode](SchemaNode.md) schema)</span>




---

### getAdditionalPropertiesSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getAdditionalPropertiesSchema__()</span>




---

### setUnevaluatedPropertiesSchema

<span style="font-family: monospace; font-size: 80%;">public void __setUnevaluatedPropertiesSchema__([SchemaNode](SchemaNode.md) schema)</span>




---

### getUnevaluatedPropertiesSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getUnevaluatedPropertiesSchema__()</span>




---

### setUnevaluatedPropertiesAllowed

<span style="font-family: monospace; font-size: 80%;">public void __setUnevaluatedPropertiesAllowed__(boolean allowed)</span>




---

### areUnevaluatedPropertiesAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __areUnevaluatedPropertiesAllowed__()</span>




---

### setAdditionalPropertiesAllowed

<span style="font-family: monospace; font-size: 80%;">public void __setAdditionalPropertiesAllowed__(boolean b)</span>




---

### areAdditionalPropertiesAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __areAdditionalPropertiesAllowed__()</span>




---

