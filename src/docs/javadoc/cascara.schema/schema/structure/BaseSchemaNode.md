Package [io.github.qishr.cascara.schema.structure](index.md)

# Class BaseSchemaNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.structure.BaseSchemaNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [SchemaNode](SchemaNode.md)

Direct Known Subtypes:<br/>
    [ArraySchemaNode](ArraySchemaNode.md), [ObjectSchemaNode](ObjectSchemaNode.md), [ScalarSchemaNode](ScalarSchemaNode.md), [LazySchemaNode](LazySchemaNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __BaseSchemaNode__</span>


## Field Summary

| Modifier and Type                       | Field                       | Description |
|-----------------------------------------|-----------------------------|-------------|
| protected final Map<String, SchemaNode> | [definitions](#definitions) |             |
| protected URI                           | [originUri](#originuri)     |             |
| protected String                        | [ref](#ref)                 |             |



## Constructor Summary

| Constructor                                                                                 | Description |
|---------------------------------------------------------------------------------------------|-------------|
| BaseSchemaNode([SchemaType](../SchemaType.md) type, [SchemaNode](SchemaNode.md) metaSchema) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                                                                                                                        | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                                                                                                               | [setDynamicAnchor](#setdynamicanchor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) anchor)                                                                                                    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getDynamicAnchor](#getdynamicanchor)()                                                                                                                                                                                                       |             |
| public void                                                                                                                                                                                                                                                                               | [addAllOf](#addallof)([SchemaNode](SchemaNode.md) node)                                                                                                                                                                                       |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[SchemaNode](SchemaNode.md)>                                                                                                                                                              | [getAllOf](#getallof)()                                                                                                                                                                                                                       |             |
| public void                                                                                                                                                                                                                                                                               | [setFormat](#setformat)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)                                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getFormat](#getformat)()                                                                                                                                                                                                                     |             |
| public void                                                                                                                                                                                                                                                                               | [setFormatOption](#setformatoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getFormatOption](#getformatoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                         |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)>                                                         | [getProperties](#getproperties)()                                                                                                                                                                                                             |             |
| public void                                                                                                                                                                                                                                                                               | [addRule](#addrule)([ValidationRule](../rule/ValidationRule.md) rule)                                                                                                                                                                         |             |
| public void                                                                                                                                                                                                                                                                               | [addDefinition](#adddefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [SchemaNode](SchemaNode.md) node)                                                                           |             |
| public void                                                                                                                                                                                                                                                                               | [setType](#settype)([SchemaType](../SchemaType.md) type)                                                                                                                                                                                      |             |
| public void                                                                                                                                                                                                                                                                               | [setOriginUri](#setoriginuri)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) originUri)                                                                                                                |             |
| public void                                                                                                                                                                                                                                                                               | [setTitle](#settitle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title)                                                                                                                     |             |
| public void                                                                                                                                                                                                                                                                               | [setDescription](#setdescription)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) description)                                                                                                   |             |
| public void                                                                                                                                                                                                                                                                               | [setTitleKey](#settitlekey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) titleKey)                                                                                                            |             |
| public void                                                                                                                                                                                                                                                                               | [setDescriptionKey](#setdescriptionkey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) descriptionKey)                                                                                          |             |
| public void                                                                                                                                                                                                                                                                               | [setRef](#setref)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref)                                                                                                                           |             |
| public void                                                                                                                                                                                                                                                                               | [setDefaultValue](#setdefaultvalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) defaultValue)                                                                                                |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getContentMediaType](#getcontentmediatype)()                                                                                                                                                                                                 |             |
| public void                                                                                                                                                                                                                                                                               | [setContentMediaType](#setcontentmediatype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentMediaType)                                                                                    |             |
| public [AstNode](../../../cascara.common/lang/ast/AstNode.md)                                                                                                                                                                                                                             | [getOriginAst](#getoriginast)()                                                                                                                                                                                                               |             |
| public void                                                                                                                                                                                                                                                                               | [setOriginAst](#setoriginast)([AstNode](../../../cascara.common/lang/ast/AstNode.md) originAst)                                                                                                                                               |             |
| public boolean                                                                                                                                                                                                                                                                            | [isReadOnly](#isreadonly)()                                                                                                                                                                                                                   |             |
| public void                                                                                                                                                                                                                                                                               | [setReadOnly](#setreadonly)(boolean readOnly)                                                                                                                                                                                                 |             |
| public void                                                                                                                                                                                                                                                                               | [setExtension](#setextension)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)           |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getExtension](#getextension)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                               |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getExtensions](#getextensions)()                                                                                                                                                                                                             |             |
| public [SchemaType](../SchemaType.md)                                                                                                                                                                                                                                                     | [getType](#gettype)()                                                                                                                                                                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getTitle](#gettitle)()                                                                                                                                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getTitleKey](#gettitlekey)()                                                                                                                                                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getDescription](#getdescription)()                                                                                                                                                                                                           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getDescriptionKey](#getdescriptionkey)()                                                                                                                                                                                                     |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getDefaultValue](#getdefaultvalue)()                                                                                                                                                                                                         |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)>                                                                  | [getDefinitions](#getdefinitions)()                                                                                                                                                                                                           |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ValidationRule](../rule/ValidationRule.md)>                                                                                                                                              | [getRules](#getrules)()                                                                                                                                                                                                                       |             |
| public boolean                                                                                                                                                                                                                                                                            | [isRef](#isref)()                                                                                                                                                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getRef](#getref)()                                                                                                                                                                                                                           |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getProperty](#getproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getDefinition](#getdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                            |             |
| public void                                                                                                                                                                                                                                                                               | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result) |             |
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                                                                                                                                                              | [getOriginUri](#getoriginuri)()                                                                                                                                                                                                               |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../../../cascara.common/lang/ast/AstNode.md)>                                                                                                                         | [getChildren](#getchildren)()                                                                                                                                                                                                                 |             |
| public int                                                                                                                                                                                                                                                                                | [getStartLine](#getstartline)()                                                                                                                                                                                                               |             |
| public int                                                                                                                                                                                                                                                                                | [getStartColumn](#getstartcolumn)()                                                                                                                                                                                                           |             |
| public int                                                                                                                                                                                                                                                                                | [getEndLine](#getendline)()                                                                                                                                                                                                                   |             |
| public int                                                                                                                                                                                                                                                                                | [getEndColumn](#getendcolumn)()                                                                                                                                                                                                               |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)>                                                                                                                     | [getComments](#getcomments)()                                                                                                                                                                                                                 |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getPropertySchema](#getpropertyschema)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                     |             |
| public [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getMetaSchema](#getmetaschema)()                                                                                                                                                                                                             |             |



## Field Details

### definitions

<span style="font-family: monospace; font-size: 80%;">protected final Map<String, SchemaNode> __definitions__</span>




---

### originUri

<span style="font-family: monospace; font-size: 80%;">protected URI __originUri__</span>




---

### ref

<span style="font-family: monospace; font-size: 80%;">protected String __ref__</span>




---


## Method Details

### setDynamicAnchor

<span style="font-family: monospace; font-size: 80%;">public void __setDynamicAnchor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) anchor)</span>




---

### getDynamicAnchor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDynamicAnchor__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### addAllOf

<span style="font-family: monospace; font-size: 80%;">public void __addAllOf__([SchemaNode](SchemaNode.md) node)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getAllOf

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[SchemaNode](SchemaNode.md)> __getAllOf__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### setFormat

<span style="font-family: monospace; font-size: 80%;">public void __setFormat__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format)</span>




---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### setFormatOption

<span style="font-family: monospace; font-size: 80%;">public void __setFormatOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### getFormatOption

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormatOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getProperties__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### addRule

<span style="font-family: monospace; font-size: 80%;">public void __addRule__([ValidationRule](../rule/ValidationRule.md) rule)</span>




---

### addDefinition

<span style="font-family: monospace; font-size: 80%;">public void __addDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [SchemaNode](SchemaNode.md) node)</span>




---

### setType

<span style="font-family: monospace; font-size: 80%;">public void __setType__([SchemaType](../SchemaType.md) type)</span>




---

### setOriginUri

<span style="font-family: monospace; font-size: 80%;">public void __setOriginUri__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) originUri)</span>




---

### setTitle

<span style="font-family: monospace; font-size: 80%;">public void __setTitle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title)</span>




---

### setDescription

<span style="font-family: monospace; font-size: 80%;">public void __setDescription__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) description)</span>




---

### setTitleKey

<span style="font-family: monospace; font-size: 80%;">public void __setTitleKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) titleKey)</span>




---

### setDescriptionKey

<span style="font-family: monospace; font-size: 80%;">public void __setDescriptionKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) descriptionKey)</span>




---

### setRef

<span style="font-family: monospace; font-size: 80%;">public void __setRef__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref)</span>




---

### setDefaultValue

<span style="font-family: monospace; font-size: 80%;">public void __setDefaultValue__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) defaultValue)</span>




---

### getContentMediaType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentMediaType__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### setContentMediaType

<span style="font-family: monospace; font-size: 80%;">public void __setContentMediaType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentMediaType)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getOriginAst

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../../../cascara.common/lang/ast/AstNode.md) __getOriginAst__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### setOriginAst

<span style="font-family: monospace; font-size: 80%;">public void __setOriginAst__([AstNode](../../../cascara.common/lang/ast/AstNode.md) originAst)</span>




---

### isReadOnly

<span style="font-family: monospace; font-size: 80%;">public boolean __isReadOnly__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### setReadOnly

<span style="font-family: monospace; font-size: 80%;">public void __setReadOnly__(boolean readOnly)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### setExtension

<span style="font-family: monospace; font-size: 80%;">public void __setExtension__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getExtension

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Nullable<br/>
public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getExtension__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getExtensions

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getExtensions__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getType

<span style="font-family: monospace; font-size: 80%;">public [SchemaType](../SchemaType.md) __getType__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getTitleKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitleKey__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getDescription

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescription__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getDescriptionKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescriptionKey__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getDefaultValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getDefaultValue__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getDefinitions

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getDefinitions__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getRules

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ValidationRule](../rule/ValidationRule.md)> __getRules__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### isRef

<span style="font-family: monospace; font-size: 80%;">public boolean __isRef__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getRef

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRef__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getProperty

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getDefinition

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### validate

<span style="font-family: monospace; font-size: 80%;">public void __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getOriginUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getOriginUri__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [AstNode](../../../cascara.common/lang/ast/AstNode.md)> __getChildren__()</span>




---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>




---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>




---

### getEndLine

<span style="font-family: monospace; font-size: 80%;">public int __getEndLine__()</span>




---

### getEndColumn

<span style="font-family: monospace; font-size: 80%;">public int __getEndColumn__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../../cascara.common/lang/ast/CommentAstNode.md)> __getComments__()</span>




---

### getPropertySchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getPropertySchema__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

### getMetaSchema

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](SchemaNode.md) __getMetaSchema__()</span>



**Specified By:**

[SchemaNode](SchemaNode.md)


---

