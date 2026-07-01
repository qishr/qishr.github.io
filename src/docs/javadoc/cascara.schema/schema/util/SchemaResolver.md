Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchemaResolver
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaResolver<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaResolver__</span>


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| SchemaResolver() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                            | Method                                                                                                                                                                                                                                                                                | Description                                        |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------|
| public [Schema](../Schema.md)                                                                                                                                                                                | [getSchema](#getschema)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                                                    | Returns the `Schema` indicated by the given `URI`. |
| public [SchemaNode](../structure/SchemaNode.md)                                                                                                                                                              | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo)                                                                                                            |                                                    |
| public [Schema](../Schema.md)                                                                                                                                                                                | [getSchemaForClass](#getschemaforclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                          |                                                    |
| public [Schema](../Schema.md)                                                                                                                                                                                | [getSchemaForClass](#getschemaforclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TypeAnalyzer](TypeAnalyzer.md)> typeAnalyzers) |                                                    |
| public void                                                                                                                                                                                                  | [registerSchema](#registerschema)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Schema](../Schema.md) compiled)                                                                                                                         |                                                    |
| public void                                                                                                                                                                                                  | [registerSchemaNode](#registerschemanode)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [SchemaNode](../structure/SchemaNode.md) node)                                                                                                   |                                                    |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html), [Schema](../Schema.md)> | [getCachedSchemas](#getcachedschemas)()                                                                                                                                                                                                                                               |                                                    |
| public [SchemaNode](../structure/SchemaNode.md)                                                                                                                                                              | [resolve](#resolve)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo, [DynamicScope](DynamicScope.md) scope)                                                                     |                                                    |
| public [DynamicScope](DynamicScope.md)                                                                                                                                                                       | [getCurrentScope](#getcurrentscope)()                                                                                                                                                                                                                                                 |                                                    |



## Method Details

### getSchema

<span style="font-family: monospace; font-size: 80%;">public [Schema](../Schema.md) __getSchema__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>

Returns the `Schema` indicated by the given `URI`.If the `Schema` is cached, it will be retrieved from the cache,
otherwise it will be compiled and returned.

**Throws:**

[SchemaException](../SchemaException.md)


---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../structure/SchemaNode.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo)</span>



**Throws:**

[SchemaException](../SchemaException.md)


---

### getSchemaForClass

<span style="font-family: monospace; font-size: 80%;">public [Schema](../Schema.md) __getSchemaForClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### getSchemaForClass

<span style="font-family: monospace; font-size: 80%;">public [Schema](../Schema.md) __getSchemaForClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TypeAnalyzer](TypeAnalyzer.md)> typeAnalyzers)</span>




---

### registerSchema

<span style="font-family: monospace; font-size: 80%;">public void __registerSchema__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Schema](../Schema.md) compiled)</span>




---

### registerSchemaNode

<span style="font-family: monospace; font-size: 80%;">public void __registerSchemaNode__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [SchemaNode](../structure/SchemaNode.md) node)</span>




---

### getCachedSchemas

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html), [Schema](../Schema.md)> __getCachedSchemas__()</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [SchemaNode](../structure/SchemaNode.md) __resolve__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) ref, [SchemaNode](../structure/SchemaNode.md) relativeTo, [DynamicScope](DynamicScope.md) scope)</span>



**Throws:**

[SchemaException](../SchemaException.md)


---

### getCurrentScope

<span style="font-family: monospace; font-size: 80%;">public [DynamicScope](DynamicScope.md) __getCurrentScope__()</span>




---

