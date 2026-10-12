Package [io.github.qishr.cascara.schema.rule](index.md)

# Interface ValidationRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.rule.ValidationRule<br/>
<br/>
All Known Implementing Classes:<br/>
    [MinItemsRule](../../../../../../io/github/qishr/cascara/schema/rule/MinItemsRule.md), [FormatRule](../../../../../../io/github/qishr/cascara/schema/rule/FormatRule.md), [FileExtensionRule](../../../../../../io/github/qishr/cascara/schema/rule/FileExtensionRule.md), [RequiredRule](../../../../../../io/github/qishr/cascara/schema/rule/RequiredRule.md), [MaxItemsRule](../../../../../../io/github/qishr/cascara/schema/rule/MaxItemsRule.md), [MaxLengthRule](../../../../../../io/github/qishr/cascara/schema/rule/MaxLengthRule.md), [EnumRule](../../../../../../io/github/qishr/cascara/schema/rule/EnumRule.md), [MaxValueRule](../../../../../../io/github/qishr/cascara/schema/rule/MaxValueRule.md), [TypeRule](../../../../../../io/github/qishr/cascara/schema/rule/TypeRule.md), [MinValueRule](../../../../../../io/github/qishr/cascara/schema/rule/MinValueRule.md), [UniqueItemsRule](../../../../../../io/github/qishr/cascara/schema/rule/UniqueItemsRule.md), [MinLengthRule](../../../../../../io/github/qishr/cascara/schema/rule/MinLengthRule.md), [RegexRule](../../../../../../io/github/qishr/cascara/schema/rule/RegexRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ValidationRule__</span>


## Method Summary

| Modifier and Type       | Method                                                                                                                                                                                                                                                                                                                                                        | Description                                                  |
|-------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| public abstract boolean | [validate](#validate)([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)       | Validates a node and adds errors to the result if necessary. |
| public default boolean  | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter) |                                                              |



## Method Details

### validate

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __validate__([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>

Validates a node and adds errors to the result if necessary.


---

### validateValue

<span style="font-family: monospace; font-size: 80%;">public default boolean __validateValue__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>




---

