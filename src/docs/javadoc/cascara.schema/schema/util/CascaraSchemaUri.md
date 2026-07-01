Package [io.github.qishr.cascara.schema.util](index.md)

# Class CascaraSchemaUri
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.CascaraSchemaUri<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CascaraSchemaUri__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                     | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SCHEMA_SERVICE_URI](#schema_service_uri) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                              | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| CascaraSchemaUri([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaName, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version) |             |
| CascaraSchemaUri([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) moduleName, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaName)                                                                                                       |             |
| CascaraSchemaUri([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaName)                                                                                                                                                                                                                |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|-------------|
| public static [CascaraSchemaUri](CascaraSchemaUri.md)                                               | [of](#of)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz) |             |
| public static [CascaraSchemaUri](CascaraSchemaUri.md)                                               | [of](#of)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)           |             |
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)        | [toUri](#touri)()                                                                                              |             |
| public [Lifecycle](CascaraSchemaUri.Lifecycle.md)                                                   | [getLifecycle](#getlifecycle)()                                                                                |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getModuleName](#getmodulename)()                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSchemaName](#getschemaname)()                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getVersion](#getversion)()                                                                                    |             |



## Field Details

### SCHEMA_SERVICE_URI

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SCHEMA_SERVICE_URI__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### of

<span style="font-family: monospace; font-size: 80%;">public static [CascaraSchemaUri](CascaraSchemaUri.md) __of__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### of

<span style="font-family: monospace; font-size: 80%;">public static [CascaraSchemaUri](CascaraSchemaUri.md) __of__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[SchemaException](../SchemaException.md)


---

### toUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __toUri__()</span>




---

### getLifecycle

<span style="font-family: monospace; font-size: 80%;">public [Lifecycle](CascaraSchemaUri.Lifecycle.md) __getLifecycle__()</span>




---

### getModuleName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModuleName__()</span>




---

### getSchemaName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaName__()</span>




---

### getVersion

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getVersion__()</span>




---

