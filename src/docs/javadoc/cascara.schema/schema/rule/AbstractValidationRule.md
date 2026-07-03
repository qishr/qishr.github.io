Package [io.github.qishr.cascara.schema.rule](index.md)

# Class AbstractValidationRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.rule.AbstractValidationRule<br/>
<br/>
Direct Known Subtypes:<br/>
    [MinItemsRule](MinItemsRule.md), [FormatRule](FormatRule.md), [FileExtensionRule](FileExtensionRule.md), [RequiredRule](RequiredRule.md), [MaxItemsRule](MaxItemsRule.md), [MaxLengthRule](MaxLengthRule.md), [EnumRule](EnumRule.md), [MaxValueRule](MaxValueRule.md), [TypeRule](TypeRule.md), [MinValueRule](MinValueRule.md), [UniqueItemsRule](UniqueItemsRule.md), [MinLengthRule](MinLengthRule.md), [RegexRule](RegexRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractValidationRule__</span>


## Constructor Summary

| Constructor              | Description |
|--------------------------|-------------|
| AbstractValidationRule() |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                                                                                                                                                                  | Description |
|-------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected void    | [error](#error)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, [AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter, [SchemaDiagnosticCode](../exception/SchemaDiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |
| protected void    | [error](#error)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, int line, int column, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter, [SchemaDiagnosticCode](../exception/SchemaDiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                        |             |



## Method Details

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, [AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter, [SchemaDiagnosticCode](../exception/SchemaDiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fragmentPath, int line, int column, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter, [SchemaDiagnosticCode](../exception/SchemaDiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>




---

