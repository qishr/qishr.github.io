Package [io.github.qishr.cascara.schema.structure](index.md)

# Class LazySchemaNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.structure.AbstractSchemaNode](AbstractSchemaNode.md)<br/>
                io.github.qishr.cascara.schema.structure.LazySchemaNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LazySchemaNode__<br/>extends [AbstractSchemaNode](AbstractSchemaNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LazySchemaNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaResolver](../util/SchemaResolver.md) resolver, [SchemaNode](SchemaNode.md) root, [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) originUri, [AstNode](../../../cascara.common/lang/ast/AstNode.md) originAst, [DynamicScope](../util/DynamicScope.md) scope, [SchemaNode](SchemaNode.md) metaSchema) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                                                                                                               | [setRoot](#setroot)([SchemaNode](SchemaNode.md) root)                                                                                                                                                                                                      |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getRoot](#getroot)()                                                                                                                                                                                                                                      |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [peekResolved](#peekresolved)()                                                                                                                                                                                                                            |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getResolved](#getresolved)()                                                                                                                                                                                                                              |             |
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                                                                                                                                                              | [getOriginUri](#getoriginuri)()                                                                                                                                                                                                                            |             |
| public boolean                                                                                                                                                                                                                                                                            | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |             |
| public [AstNode](../../../cascara.common/lang/ast/AstNode.md)                                                                                                                                                                                                                             | [getInitialAst](#getinitialast)()                                                                                                                                                                                                                          |             |
| public [AstNode](../../../cascara.common/lang/ast/AstNode.md)                                                                                                                                                                                                                             | [getOriginAst](#getoriginast)()                                                                                                                                                                                                                            |             |
| public [PrimitiveType](../../../cascara.common/lang/type/PrimitiveType.md)                                                                                                                                                                                                                | [getType](#gettype)()                                                                                                                                                                                                                                      |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getProperty](#getproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                              |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)>                                                                  | [getProperties](#getproperties)()                                                                                                                                                                                                                          |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getItemSchema](#getitemschema)()                                                                                                                                                                                                                          |             |
| public boolean                                                                                                                                                                                                                                                                            | [isRef](#isref)()                                                                                                                                                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getRef](#getref)()                                                                                                                                                                                                                                        |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ValidationRule](../rule/ValidationRule.md)>                                                                                                                                              | [getRules](#getrules)()                                                                                                                                                                                                                                    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getDescription](#getdescription)()                                                                                                                                                                                                                        |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)>                                                                  | [getDefinitions](#getdefinitions)()                                                                                                                                                                                                                        |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getDefaultValue](#getdefaultvalue)()                                                                                                                                                                                                                      |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getContentMediaType](#getcontentmediatype)()                                                                                                                                                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getFormat](#getformat)()                                                                                                                                                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getFormatOption](#getformatoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                      |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getExtension](#getextension)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                            |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getExtensions](#getextensions)()                                                                                                                                                                                                                          |             |


### Methods inherited from [AbstractSchemaNode](AbstractSchemaNode.md)

setType, getTitle, setExtension, addAllOf, getDescriptionKey, addDefinition, getStartLine, getAllOf, getEndColumn, setDefaultValue, isReadOnly, getPropertySchema, setRef, setOriginUri, getStartColumn, getDynamicAnchor, addRule, setDescriptionKey, getTitleKey, setDynamicAnchor, getEndLine, getComments, setFormat, setTitle, getDefinition, getMetaSchema, setTitleKey, setFormatOption, setDescription, getChildren, setOriginAst, setReadOnly, setContentMediaType


## Method Details

### setRoot

<span style="font-family: monospace; font-size: 80%;">public void __setRoot__([SchemaNode](SchemaNode.md) root)</span>




---

### getRoot

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getRoot__()</span>




---

### peekResolved

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __peekResolved__()</span>




---

### getResolved

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getResolved__()</span>



**Throws:**

[SchemaException](../exception/SchemaException.md)


---

### getOriginUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getOriginUri__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getoriginuri)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#validate)


---

### getInitialAst

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../../../cascara.common/lang/ast/AstNode.md) __getInitialAst__()</span>




---

### getOriginAst

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../../../cascara.common/lang/ast/AstNode.md) __getOriginAst__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getoriginast)


---

### getType

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](../../../cascara.common/lang/type/PrimitiveType.md) __getType__()</span>




---

### getProperty

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getproperty)


---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getProperties__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getproperties)


---

### getItemSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getItemSchema__()</span>




---

### isRef

<span style="font-family: monospace; font-size: 80%;">public boolean __isRef__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#isref)


---

### getRef

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRef__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getref)


---

### getRules

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ValidationRule](../rule/ValidationRule.md)> __getRules__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getrules)


---

### getDescription

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescription__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getdescription)


---

### getDefinitions

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getDefinitions__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getdefinitions)


---

### getDefaultValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getDefaultValue__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getdefaultvalue)


---

### getContentMediaType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentMediaType__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getcontentmediatype)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getformat)


---

### getFormatOption

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormatOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getformatoption)


---

### getExtension

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getExtension__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getextension)


---

### getExtensions

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getExtensions__()</span>



**Overrides:**

[AbstractSchemaNode](../cascara.schema/schema/structure/AbstractSchemaNode.md#getextensions)


---

