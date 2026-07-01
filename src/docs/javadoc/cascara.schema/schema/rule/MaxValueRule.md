Package [io.github.qishr.cascara.schema.rule](index.md)

# Class MaxValueRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.rule.MaxValueRule<br/>
<br/>
All Implemented Interfaces:<br/>
    [ValidationRule](ValidationRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __MaxValueRule__</span>


## Constructor Summary

| Constructor              | Description |
|--------------------------|-------------|
| MaxValueRule(double max) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                         | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void       | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result)                                                  |             |
| public void       | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result) |             |
| public double     | [getMax](#getmax)()                                                                                                                                                                                                                                                                            |             |



## Method Details

### validate

<span style="font-family: monospace; font-size: 80%;">public void __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result)</span>



**Specified By:**

[ValidationRule](ValidationRule.md)


---

### validateValue

<span style="font-family: monospace; font-size: 80%;">public void __validateValue__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result)</span>



**Specified By:**

[ValidationRule](ValidationRule.md)


---

### getMax

<span style="font-family: monospace; font-size: 80%;">public double __getMax__()</span>




---

