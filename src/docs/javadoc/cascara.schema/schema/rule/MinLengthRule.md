Package [io.github.qishr.cascara.schema.rule](index.md)

# Class MinLengthRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.rule.AbstractValidationRule](AbstractValidationRule.md)<br/>
                io.github.qishr.cascara.schema.rule.MinLengthRule<br/>
<br/>
All Implemented Interfaces:<br/>
    [ValidationRule](ValidationRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __MinLengthRule__<br/>extends [AbstractValidationRule](AbstractValidationRule.md)
</span>


## Constructor Summary

| Constructor            | Description |
|------------------------|-------------|
| MinLengthRule(int min) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                                      | Description |
|-------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean    | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                  |             |
| public boolean    | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |             |
| public int        | [getMin](#getmin)()                                                                                                                                                                                                                                                                                         |             |


### Methods inherited from [AbstractValidationRule](AbstractValidationRule.md)

error, error


## Method Details

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Specified By:**

[ValidationRule](ValidationRule.md)


---

### validateValue

<span style="font-family: monospace; font-size: 80%;">public boolean __validateValue__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Specified By:**

[ValidationRule](ValidationRule.md)


---

### getMin

<span style="font-family: monospace; font-size: 80%;">public int __getMin__()</span>




---

