Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchemaResolverImpl
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaResolverImpl<br/>
<br/>
All Implemented Interfaces:<br/>
    [SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaResolverImpl__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                               | Method                                                                                                                                                                                                                                                                                                                                      | Description                                        |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------|
| public [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md)                                                                                                                                                                                | [getSchema](#getschema)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                                                                                                          | Returns the `Schema` indicated by the given `URI`. |
| public [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md)                                                                                                                                                                   | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) relativeTo)                                                                                                                    |                                                    |
| public [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md)                                                                                                                                                                                | [getSchemaForClass](#getschemaforclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                |                                                    |
| public [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md)                                                                                                                                                                                | [getSchemaForClass](#getschemaforclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TypeAnalyzer](../../../../../../io/github/qishr/cascara/schema/util/TypeAnalyzer.md)> typeAnalyzers) |                                                    |
| public void                                                                                                                                                                                                                                                     | [registerSchema](#registerschema)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md) compiled)                                                                                                                            |                                                    |
| public void                                                                                                                                                                                                                                                     | [registerSchemaNode](#registerschemanode)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) node)                                                                                                           |                                                    |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html), [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md)> | [getCachedSchemas](#getcachedschemas)()                                                                                                                                                                                                                                                                                                     |                                                    |
| public [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md)                                                                                                                                                                   | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) relativeTo, [DynamicScope](../../../../../../io/github/qishr/cascara/schema/util/DynamicScope.md) scope)                       |                                                    |
| public [DynamicScope](../../../../../../io/github/qishr/cascara/schema/util/DynamicScope.md)                                                                                                                                                                    | [getCurrentScope](#getcurrentscope)()                                                                                                                                                                                                                                                                                                       |                                                    |



## Method Details

### getSchema

<span style="font-family: monospace; font-size: 80%;">public [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md) __getSchema__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>

Returns the `Schema` indicated by the given `URI`.If the `Schema` is cached, it will be retrieved from the cache,
otherwise it will be compiled and returned.

**Throws:**

[SchemaException](../../../../../../io/github/qishr/cascara/schema/diagnostic/SchemaException.md)

**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) relativeTo)</span>



**Throws:**

[SchemaException](../../../../../../io/github/qishr/cascara/schema/diagnostic/SchemaException.md)

**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### getSchemaForClass

<span style="font-family: monospace; font-size: 80%;">public [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md) __getSchemaForClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>



**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### getSchemaForClass

<span style="font-family: monospace; font-size: 80%;">public [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md) __getSchemaForClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TypeAnalyzer](../../../../../../io/github/qishr/cascara/schema/util/TypeAnalyzer.md)> typeAnalyzers)</span>



**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### registerSchema

<span style="font-family: monospace; font-size: 80%;">public void __registerSchema__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md) compiled)</span>



**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### registerSchemaNode

<span style="font-family: monospace; font-size: 80%;">public void __registerSchemaNode__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) node)</span>



**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### getCachedSchemas

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html), [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md)> __getCachedSchemas__()</span>



**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) relativeTo, [DynamicScope](../../../../../../io/github/qishr/cascara/schema/util/DynamicScope.md) scope)</span>



**Throws:**

[SchemaException](../../../../../../io/github/qishr/cascara/schema/diagnostic/SchemaException.md)

**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

### getCurrentScope

<span style="font-family: monospace; font-size: 80%;">public [DynamicScope](../../../../../../io/github/qishr/cascara/schema/util/DynamicScope.md) __getCurrentScope__()</span>



**Specified By:**

[SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md)


---

