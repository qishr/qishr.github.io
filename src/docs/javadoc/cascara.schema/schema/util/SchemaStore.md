Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchemaStore
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaStore<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaStore__</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| SchemaStore() |             |



## Method Summary

| Modifier and Type                                                               | Method                                                                                          | Description |
|---------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|-------------|
| public static [SchemaStore](SchemaStore.md)                                     | [instance](#instance)()                                                                         |             |
| public [ResourceContent](../../../cascara.common.io/content/ResourceContent.md) | [get](#get)([CascaraSchemaUri](CascaraSchemaUri.md) schemaUri)                                  |             |
| public void                                                                     | [put](#put)([CascaraSchemaUri](CascaraSchemaUri.md) schemaUri, [Schema](../Schema.md) compiled) |             |



## Method Details

### instance

<span style="font-family: monospace; font-size: 80%;">public static [SchemaStore](SchemaStore.md) __instance__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public [ResourceContent](../../../cascara.common.io/content/ResourceContent.md) __get__([CascaraSchemaUri](CascaraSchemaUri.md) schemaUri)</span>



**Throws:**

[SchemaException](../exception/SchemaException.md)


---

### put

<span style="font-family: monospace; font-size: 80%;">public void __put__([CascaraSchemaUri](CascaraSchemaUri.md) schemaUri, [Schema](../Schema.md) compiled)</span>




---

