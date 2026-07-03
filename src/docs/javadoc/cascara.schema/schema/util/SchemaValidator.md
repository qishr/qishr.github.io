Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchemaValidator
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaValidator<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaValidator__</span>


## Constructor Summary

| Constructor                                                                                                                        | Description                                                                                |
|------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| SchemaValidator()                                                                                                                  |                                                                                            |
| SchemaValidator([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                               |                                                                                            |
| SchemaValidator([SchemaResolver](SchemaResolver.md) resolver)                                                                      | Sets the SchemaResolver that will be used to obtain the schema of the AST being validated. |
| SchemaValidator([SchemaResolver](SchemaResolver.md) resolver, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) | Sets the SchemaResolver that will be used to obtain the schema of the AST being validated. |



## Method Summary

| Modifier and Type                            | Method                                                                                                                              | Description |
|----------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [SchemaValidator](SchemaValidator.md) | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                    |             |
| public boolean                               | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) root)                                                  |             |
| public boolean                               | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) root, [Schema](../Schema.md) schema)                   |             |
| public boolean                               | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) root, [SchemaNode](../structure/SchemaNode.md) schema) |             |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [SchemaValidator](SchemaValidator.md) __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Parameters:**

`reporter` - The reporter that collects or reports problem [Diagnostic](../../../cascara.common/diagnostic/Diagnostic.md) objects.


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) root)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) root, [Schema](../Schema.md) schema)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) root, [SchemaNode](../structure/SchemaNode.md) schema)</span>




---

