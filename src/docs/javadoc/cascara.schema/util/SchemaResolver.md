Package [io.github.qishr.cascara.schema.util](index.md)

# Interface SchemaResolver
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaResolver<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../cascara.common/service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [SchemaResolverImpl](SchemaResolverImpl.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SchemaResolver__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                  | Method                                                                                                                                                                                                                                                                                | Description                                        |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------|
| public abstract [Schema](Schema.md)                                                                                                                                                                                | [getSchema](#getschema)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                                                    | Returns the `Schema` indicated by the given `URI`. |
| public abstract [SchemaNode](../structure/SchemaNode.md)                                                                                                                                                           | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo)                                                                                                            |                                                    |
| public abstract [Schema](Schema.md)                                                                                                                                                                                | [getSchemaForClass](#getschemaforclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                          |                                                    |
| public abstract [Schema](Schema.md)                                                                                                                                                                                | [getSchemaForClass](#getschemaforclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TypeAnalyzer](TypeAnalyzer.md)> typeAnalyzers) |                                                    |
| public abstract [SchemaNode](../structure/SchemaNode.md)                                                                                                                                                           | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo, [DynamicScope](DynamicScope.md) scope)                                                                     |                                                    |
| public abstract [DynamicScope](DynamicScope.md)                                                                                                                                                                    | [getCurrentScope](#getcurrentscope)()                                                                                                                                                                                                                                                 |                                                    |
| public abstract void                                                                                                                                                                                               | [registerSchema](#registerschema)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Schema](Schema.md) compiled)                                                                                                                            |                                                    |
| public abstract void                                                                                                                                                                                               | [registerSchemaNode](#registerschemanode)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [SchemaNode](../structure/SchemaNode.md) node)                                                                                                   |                                                    |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html), [Schema](Schema.md)> | [getCachedSchemas](#getcachedschemas)()                                                                                                                                                                                                                                               |                                                    |



## Method Details

### getSchema

<span style="font-family: monospace; font-size: 80%;">public abstract [Schema](Schema.md) __getSchema__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>

Returns the `Schema` indicated by the given `URI`.If the `Schema` is cached, it will be retrieved from the cache,
otherwise it will be compiled and returned.

**Throws:**

[SchemaException](../diagnostic/SchemaException.md)


---

### resolve

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](../structure/SchemaNode.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo)</span>



**Throws:**

[SchemaException](../diagnostic/SchemaException.md)


---

### getSchemaForClass

<span style="font-family: monospace; font-size: 80%;">public abstract [Schema](Schema.md) __getSchemaForClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### getSchemaForClass

<span style="font-family: monospace; font-size: 80%;">public abstract [Schema](Schema.md) __getSchemaForClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TypeAnalyzer](TypeAnalyzer.md)> typeAnalyzers)</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public abstract [SchemaNode](../structure/SchemaNode.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo, [DynamicScope](DynamicScope.md) scope)</span>



**Throws:**

[SchemaException](../diagnostic/SchemaException.md)


---

### getCurrentScope

<span style="font-family: monospace; font-size: 80%;">public abstract [DynamicScope](DynamicScope.md) __getCurrentScope__()</span>




---

### registerSchema

<span style="font-family: monospace; font-size: 80%;">public abstract void __registerSchema__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Schema](Schema.md) compiled)</span>




---

### registerSchemaNode

<span style="font-family: monospace; font-size: 80%;">public abstract void __registerSchemaNode__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [SchemaNode](../structure/SchemaNode.md) node)</span>




---

### getCachedSchemas

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html), [Schema](Schema.md)> __getCachedSchemas__()</span>




---

