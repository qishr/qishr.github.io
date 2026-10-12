Package [io.github.qishr.cascara.schema.rule](index.md)

# Class AbstractValidationRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.rule.AbstractValidationRule<br/>
<br/>
Direct Known Subtypes:<br/>
    [MinItemsRule](../../../../../../io/github/qishr/cascara/schema/rule/MinItemsRule.md), [FormatRule](../../../../../../io/github/qishr/cascara/schema/rule/FormatRule.md), [FileExtensionRule](../../../../../../io/github/qishr/cascara/schema/rule/FileExtensionRule.md), [RequiredRule](../../../../../../io/github/qishr/cascara/schema/rule/RequiredRule.md), [MaxItemsRule](../../../../../../io/github/qishr/cascara/schema/rule/MaxItemsRule.md), [MaxLengthRule](../../../../../../io/github/qishr/cascara/schema/rule/MaxLengthRule.md), [EnumRule](../../../../../../io/github/qishr/cascara/schema/rule/EnumRule.md), [MaxValueRule](../../../../../../io/github/qishr/cascara/schema/rule/MaxValueRule.md), [TypeRule](../../../../../../io/github/qishr/cascara/schema/rule/TypeRule.md), [MinValueRule](../../../../../../io/github/qishr/cascara/schema/rule/MinValueRule.md), [UniqueItemsRule](../../../../../../io/github/qishr/cascara/schema/rule/UniqueItemsRule.md), [MinLengthRule](../../../../../../io/github/qishr/cascara/schema/rule/MinLengthRule.md), [RegexRule](../../../../../../io/github/qishr/cascara/schema/rule/RegexRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractValidationRule__</span>


## Constructor Summary

| Constructor              | Description |
|--------------------------|-------------|
| AbstractValidationRule() |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Description |
|-------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected void    | [error](#error)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, [AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter, [SchemaDiagnosticMessage](../../../../../../io/github/qishr/cascara/schema/diagnostic/SchemaDiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |
| protected void    | [error](#error)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, int line, int column, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter, [SchemaDiagnosticMessage](../../../../../../io/github/qishr/cascara/schema/diagnostic/SchemaDiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                   |             |



## Method Details

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, [AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter, [SchemaDiagnosticMessage](../../../../../../io/github/qishr/cascara/schema/diagnostic/SchemaDiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, int line, int column, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter, [SchemaDiagnosticMessage](../../../../../../io/github/qishr/cascara/schema/diagnostic/SchemaDiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

