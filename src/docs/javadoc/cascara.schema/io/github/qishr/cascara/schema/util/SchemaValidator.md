Package [io.github.qishr.cascara.schema.util](index.md)

# Class SchemaValidator
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.SchemaValidator<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SchemaValidator__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                | Description                                                                                |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| SchemaValidator()                                                                                                                                                                                                                          |                                                                                            |
| SchemaValidator([Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)                                                                                                     |                                                                                            |
| SchemaValidator([SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md) resolver)                                                                                                                        | Sets the SchemaResolver that will be used to obtain the schema of the AST being validated. |
| SchemaValidator([SchemaResolver](../../../../../../io/github/qishr/cascara/schema/util/SchemaResolver.md) resolver, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter) | Sets the SchemaResolver that will be used to obtain the schema of the AST being validated. |



## Method Summary

| Modifier and Type                                                                                  | Method                                                                                                                                                                                                                       | Description |
|----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [SchemaValidator](../../../../../../io/github/qishr/cascara/schema/util/SchemaValidator.md) | [setReporter](#setreporter)([Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)                                                                           |             |
| public boolean                                                                                     | [validate](#validate)([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) root)                                                                                                |             |
| public boolean                                                                                     | [validate](#validate)([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) root, [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md) schema)              |             |
| public boolean                                                                                     | [validate](#validate)([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) root, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) schema) |             |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [SchemaValidator](../../../../../../io/github/qishr/cascara/schema/util/SchemaValidator.md) __setReporter__([Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>



**Parameters:**

`reporter` - The reporter that collects or reports problem `Diagnostic` objects.


---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) root)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) root, [Schema](../../../../../../io/github/qishr/cascara/schema/util/Schema.md) schema)</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) root, [SchemaNode](../../../../../../io/github/qishr/cascara/schema/structure/SchemaNode.md) schema)</span>




---

