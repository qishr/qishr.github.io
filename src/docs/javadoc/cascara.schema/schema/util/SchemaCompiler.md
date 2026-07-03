Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchemaCompiler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaCompiler<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaCompiler__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                               | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [META_SCHEMA_URI](#meta_schema_uri) |             |



## Constructor Summary

| Constructor                                                                       | Description |
|-----------------------------------------------------------------------------------|-------------|
| SchemaCompiler([SchemaResolver](SchemaResolver.md) resolver, boolean resolveRefs) |             |
| SchemaCompiler([SchemaResolver](SchemaResolver.md) resolver)                      |             |
| SchemaCompiler()                                                                  |             |



## Method Summary

| Modifier and Type                          | Method                                                                                                                                                                            | Description |
|--------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [SchemaCompiler](SchemaCompiler.md) | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                                                  |             |
| public [SchemaCompiler](SchemaCompiler.md) | [setResolver](#setresolver)([SchemaResolver](SchemaResolver.md) resolver)                                                                                                         |             |
| public [Schema](../Schema.md)              | [compile](#compile)([AstNode](../../../cascara.common/lang/ast/AstNode.md) root)                                                                                                  |             |
| public [Schema](../Schema.md)              | [compile](#compile)([AstNode](../../../cascara.common/lang/ast/AstNode.md) root, [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) originUri) |             |



## Field Details

### META_SCHEMA_URI

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __META_SCHEMA_URI__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [SchemaCompiler](SchemaCompiler.md) __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### setResolver

<span style="font-family: monospace; font-size: 80%;">public [SchemaCompiler](SchemaCompiler.md) __setResolver__([SchemaResolver](SchemaResolver.md) resolver)</span>




---

### compile

<span style="font-family: monospace; font-size: 80%;">public [Schema](../Schema.md) __compile__([AstNode](../../../cascara.common/lang/ast/AstNode.md) root)</span>




---

### compile

<span style="font-family: monospace; font-size: 80%;">public [Schema](../Schema.md) __compile__([AstNode](../../../cascara.common/lang/ast/AstNode.md) root, [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) originUri)</span>




---

