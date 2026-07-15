Package [io.github.qishr.cascara.schema.structure](index.md)

# Interface SchemaNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.structure.SchemaNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../../../cascara.common/lang/ast/AstNode.md)

All Known Implementing Classes:<br/>
    [AbstractSchemaNode](AbstractSchemaNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SchemaNode__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                  | Method                                                                                                                                                                                                                                                     | Description                                                 |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| public abstract [PrimitiveType](../../../cascara.common/lang/type/PrimitiveType.md)                                                                                                                                                                                                                | [getType](#gettype)()                                                                                                                                                                                                                                      |                                                             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getTitle](#gettitle)()                                                                                                                                                                                                                                    | The human-readable title                                    |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getTitleKey](#gettitlekey)()                                                                                                                                                                                                                              |                                                             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getDescription](#getdescription)()                                                                                                                                                                                                                        | The human-readable description                              |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getDescriptionKey](#getdescriptionkey)()                                                                                                                                                                                                                  |                                                             |
| public abstract [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getProperty](#getproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                              |                                                             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)>                                                                  | [getProperties](#getproperties)()                                                                                                                                                                                                                          |                                                             |
| public abstract [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getItemSchema](#getitemschema)()                                                                                                                                                                                                                          |                                                             |
| public abstract boolean                                                                                                                                                                                                                                                                            | [isRef](#isref)()                                                                                                                                                                                                                                          |                                                             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getRef](#getref)()                                                                                                                                                                                                                                        |                                                             |
| public abstract [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getDefinition](#getdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                         |                                                             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)>                                                                  | [getDefinitions](#getdefinitions)()                                                                                                                                                                                                                        |                                                             |
| public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                                                                                                                                                              | [getOriginUri](#getoriginuri)()                                                                                                                                                                                                                            |                                                             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getDynamicAnchor](#getdynamicanchor)()                                                                                                                                                                                                                    |                                                             |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getDefaultValue](#getdefaultvalue)()                                                                                                                                                                                                                      |                                                             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ValidationRule](../rule/ValidationRule.md)>                                                                                                                                              | [getRules](#getrules)()                                                                                                                                                                                                                                    |                                                             |
| public abstract boolean                                                                                                                                                                                                                                                                            | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |                                                             |
| public abstract [AstNode](../../../cascara.common/lang/ast/AstNode.md)                                                                                                                                                                                                                             | [getOriginAst](#getoriginast)()                                                                                                                                                                                                                            |                                                             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getContentMediaType](#getcontentmediatype)()                                                                                                                                                                                                              |                                                             |
| public abstract void                                                                                                                                                                                                                                                                               | [setContentMediaType](#setcontentmediatype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentMediaType)                                                                                                 |                                                             |
| public abstract void                                                                                                                                                                                                                                                                               | [setExtension](#setextension)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                        |                                                             |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getExtension](#getextension)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                            |                                                             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getExtensions](#getextensions)()                                                                                                                                                                                                                          |                                                             |
| public abstract boolean                                                                                                                                                                                                                                                                            | [isReadOnly](#isreadonly)()                                                                                                                                                                                                                                |                                                             |
| public abstract void                                                                                                                                                                                                                                                                               | [setReadOnly](#setreadonly)(boolean readOnly)                                                                                                                                                                                                              |                                                             |
| public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                        | [getFormat](#getformat)()                                                                                                                                                                                                                                  |                                                             |
| public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                        | [getFormatOption](#getformatoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                      |                                                             |
| public default boolean                                                                                                                                                                                                                                                                             | [getBooleanOption](#getbooleanoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, boolean defaultValue)                                                                                              |                                                             |
| public abstract void                                                                                                                                                                                                                                                                               | [addAllOf](#addallof)([SchemaNode](SchemaNode.md) node)                                                                                                                                                                                                    |                                                             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[SchemaNode](SchemaNode.md)>                                                                                                                                                              | [getAllOf](#getallof)()                                                                                                                                                                                                                                    |                                                             |
| public abstract [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getPropertySchema](#getpropertyschema)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                  |                                                             |
| public default boolean                                                                                                                                                                                                                                                                             | [areAdditionalPropertiesAllowed](#areadditionalpropertiesallowed)()                                                                                                                                                                                        |                                                             |
| public default [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                         | [getAdditionalPropertiesSchema](#getadditionalpropertiesschema)()                                                                                                                                                                                          |                                                             |
| public abstract [SchemaNode](SchemaNode.md)                                                                                                                                                                                                                                                        | [getMetaSchema](#getmetaschema)()                                                                                                                                                                                                                          | Returns the schema that defines the structure of THIS node. |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public abstract [PrimitiveType](../../../cascara.common/lang/type/PrimitiveType.md) __getType__()</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__()</span>

The human-readable title


---

### getTitleKey

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitleKey__()</span>




---

### getDescription

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescription__()</span>

The human-readable description


---

### getDescriptionKey

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDescriptionKey__()</span>




---

### getProperty

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](SchemaNode.md) __getProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getProperties__()</span>




---

### getItemSchema

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](SchemaNode.md) __getItemSchema__()</span>




---

### isRef

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isRef__()</span>




---

### getRef

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRef__()</span>




---

### getDefinition

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](SchemaNode.md) __getDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getDefinitions

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [SchemaNode](SchemaNode.md)> __getDefinitions__()</span>




---

### getOriginUri

<span style="font-family: monospace; font-size: 80%;">public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getOriginUri__()</span>




---

### getDynamicAnchor

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDynamicAnchor__()</span>




---

### getDefaultValue

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getDefaultValue__()</span>




---

### getRules

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ValidationRule](../rule/ValidationRule.md)> __getRules__()</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### getOriginAst

<span style="font-family: monospace; font-size: 80%;">public abstract [AstNode](../../../cascara.common/lang/ast/AstNode.md) __getOriginAst__()</span>




---

### getContentMediaType

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentMediaType__()</span>




---

### setContentMediaType

<span style="font-family: monospace; font-size: 80%;">public abstract void __setContentMediaType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentMediaType)</span>




---

### setExtension

<span style="font-family: monospace; font-size: 80%;">public abstract void __setExtension__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### getExtension

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getExtension__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getExtensions

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getExtensions__()</span>




---

### isReadOnly

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isReadOnly__()</span>




---

### setReadOnly

<span style="font-family: monospace; font-size: 80%;">public abstract void __setReadOnly__(boolean readOnly)</span>




---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>




---

### getFormatOption

<span style="font-family: monospace; font-size: 80%;">public default [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormatOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getBooleanOption

<span style="font-family: monospace; font-size: 80%;">public default boolean __getBooleanOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, boolean defaultValue)</span>




---

### addAllOf

<span style="font-family: monospace; font-size: 80%;">public abstract void __addAllOf__([SchemaNode](SchemaNode.md) node)</span>




---

### getAllOf

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[SchemaNode](SchemaNode.md)> __getAllOf__()</span>




---

### getPropertySchema

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](SchemaNode.md) __getPropertySchema__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### areAdditionalPropertiesAllowed

<span style="font-family: monospace; font-size: 80%;">public default boolean __areAdditionalPropertiesAllowed__()</span>




---

### getAdditionalPropertiesSchema

<span style="font-family: monospace; font-size: 80%;">public default [SchemaNode](SchemaNode.md) __getAdditionalPropertiesSchema__()</span>




---

### getMetaSchema

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](SchemaNode.md) __getMetaSchema__()</span>

Returns the schema that defines the structure of THIS node.For a standard property, this returns the JSON Schema Meta-Schema.
For a CEMA property, this might return the CEMA Meta-Schema.


---

