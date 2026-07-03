Package [io.github.qishr.cascara.schema](index.md)

# Interface Schema
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.Schema<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __Schema__</span>


## Method Summary

| Modifier and Type                                                                                                                                           | Method                                                                                                                                            | Description                            |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------|
| public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[SchemaNode](structure/SchemaNode.md)> | [getProperties](#getproperties)()                                                                                                                 |                                        |
| public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[SchemaNode](structure/SchemaNode.md)> | [getDefinitions](#getdefinitions)()                                                                                                               |                                        |
| public abstract [SchemaNode](structure/SchemaNode.md)                                                                                                       | [getRoot](#getroot)()                                                                                                                             |                                        |
| public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                       | [getOriginUri](#getoriginuri)()                                                                                                                   |                                        |
| public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                       | [getId](#getid)()                                                                                                                                 |                                        |
| public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                       | [getSchemaUri](#getschemauri)()                                                                                                                   |                                        |
| public abstract [SchemaNode](structure/SchemaNode.md)                                                                                                       | [getDefinition](#getdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                |                                        |
| public abstract [SchemaNode](structure/SchemaNode.md)                                                                                                       | [getProperty](#getproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                    |                                        |
| public abstract void                                                                                                                                        | [validate](#validate)([AstNode](../../cascara.common/lang/ast/AstNode.md) root)                                                                   | Validates and AST against this schema. |
| public abstract boolean                                                                                                                                     | [validate](#validate)([AstNode](../../cascara.common/lang/ast/AstNode.md) root, [Reporter](../../cascara.common/diagnostic/Reporter.md) reporter) | Validates and AST against this schema. |
| public abstract [Schema](Schema.md)                                                                                                                         | [setResolver](#setresolver)([SchemaResolver](util/SchemaResolver.md) resolver)                                                                    |                                        |



## Method Details

### getProperties

<span style="font-family: monospace; font-size: 80%;">public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[SchemaNode](structure/SchemaNode.md)> __getProperties__()</span>




---

### getDefinitions

<span style="font-family: monospace; font-size: 80%;">public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[SchemaNode](structure/SchemaNode.md)> __getDefinitions__()</span>




---

### getRoot

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](structure/SchemaNode.md) __getRoot__()</span>




---

### getOriginUri

<span style="font-family: monospace; font-size: 80%;">public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getOriginUri__()</span>




---

### getId

<span style="font-family: monospace; font-size: 80%;">public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getId__()</span>




---

### getSchemaUri

<span style="font-family: monospace; font-size: 80%;">public abstract [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getSchemaUri__()</span>




---

### getDefinition

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](structure/SchemaNode.md) __getDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getProperty

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](structure/SchemaNode.md) __getProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public abstract void __validate__([AstNode](../../cascara.common/lang/ast/AstNode.md) root)</span>

Validates and AST against this schema.


---

### validate

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __validate__([AstNode](../../cascara.common/lang/ast/AstNode.md) root, [Reporter](../../cascara.common/diagnostic/Reporter.md) reporter)</span>

Validates and AST against this schema.

**Parameters:**

`reporter` - a reporter for collecting problem diagnostics.

**Returns:**

true on success, false on failure.


---

### setResolver

<span style="font-family: monospace; font-size: 80%;">public abstract [Schema](Schema.md) __setResolver__([SchemaResolver](util/SchemaResolver.md) resolver)</span>




---

