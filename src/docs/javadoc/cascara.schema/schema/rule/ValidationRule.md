Package [io.github.qishr.cascara.schema.rule](index.md)

# Interface ValidationRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.rule.ValidationRule<br/>
<br/>
All Known Implementing Classes:<br/>
    [MinItemsRule](MinItemsRule.md), [FormatRule](FormatRule.md), [FileExtensionRule](FileExtensionRule.md), [RequiredRule](RequiredRule.md), [MaxItemsRule](MaxItemsRule.md), [MaxLengthRule](MaxLengthRule.md), [EnumRule](EnumRule.md), [MaxValueRule](MaxValueRule.md), [TypeRule](TypeRule.md), [MinValueRule](MinValueRule.md), [UniqueItemsRule](UniqueItemsRule.md), [MinLengthRule](MinLengthRule.md), [RegexRule](RegexRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ValidationRule__</span>


## Method Summary

| Modifier and Type       | Method                                                                                                                                                                                                                                                                                                      | Description                                                  |
|-------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| public abstract boolean | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                  | Validates a node and adds errors to the result if necessary. |
| public default boolean  | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |                                                              |



## Method Details

### validate

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>

Validates a node and adds errors to the result if necessary.


---

### validateValue

<span style="font-family: monospace; font-size: 80%;">public default boolean __validateValue__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

