Package [io.github.qishr.cascara.schema.structure](index.md)

# Class ScalarSchemaNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.structure.AbstractSchemaNode](AbstractSchemaNode.md)<br/>
                io.github.qishr.cascara.schema.structure.ScalarSchemaNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ScalarSchemaNode__<br/>extends [AbstractSchemaNode](AbstractSchemaNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                        | Description |
|------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ScalarSchemaNode([PrimitiveType](../../../cascara.common/lang/type/PrimitiveType.md) type, [SchemaNode](SchemaNode.md) metaSchema) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                        | Method                                              | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------|-------------|
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> | [getProperties](#getproperties)()                   |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                       | [getItemSchema](#getitemschema)()                   |             |
| public boolean                                                                                                                                                                                                           | [isPrimaryKey](#isprimarykey)()                     |             |
| public void                                                                                                                                                                                                              | [setPrimaryKey](#setprimarykey)(boolean primaryKey) |             |


### Methods inherited from [AbstractSchemaNode](AbstractSchemaNode.md)

setType, getDescription, getDescriptionKey, getOriginAst, getRef, getEndColumn, isRef, getPropertySchema, getRules, validate, setRef, getExtensions, setOriginUri, getFormat, setDynamicAnchor, getEndLine, getComments, getDefinition, getMetaSchema, setFormatOption, setDescription, getChildren, setOriginAst, setReadOnly, getDefinitions, getTitle, getExtension, getFormatOption, setExtension, addAllOf, addDefinition, getStartLine, getAllOf, getOriginUri, setDefaultValue, getType, isReadOnly, getContentMediaType, getStartColumn, getDynamicAnchor, addRule, setDescriptionKey, getTitleKey, getProperty, setFormat, setTitle, setTitleKey, getDefaultValue, setContentMediaType


## Method Details

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getProperties__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getproperties)


---

### getItemSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getItemSchema__()</span>




---

### isPrimaryKey

<span style="font-family: monospace; font-size: 80%;">public boolean __isPrimaryKey__()</span>




---

### setPrimaryKey

<span style="font-family: monospace; font-size: 80%;">public void __setPrimaryKey__(boolean primaryKey)</span>




---

