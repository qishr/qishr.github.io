Package [io.github.qishr.cascara.schema.rule](index.md)

# Class MaxValueRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.rule.AbstractValidationRule](../../../../../../io/github/qishr/cascara/schema/rule/AbstractValidationRule.md)<br/>
                io.github.qishr.cascara.schema.rule.MaxValueRule<br/>
<br/>
All Implemented Interfaces:<br/>
    [ValidationRule](../../../../../../io/github/qishr/cascara/schema/rule/ValidationRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __MaxValueRule__<br/>extends [AbstractValidationRule](../../../../../../io/github/qishr/cascara/schema/rule/AbstractValidationRule.md)
</span>


## Constructor Summary

| Constructor              | Description |
|--------------------------|-------------|
| MaxValueRule(double max) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                                                                                        | Description |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean    | [validate](#validate)([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)       |             |
| public boolean    | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter) |             |
| public double     | [getMax](#getmax)()                                                                                                                                                                                                                                                                                                                                           |             |


### Methods inherited from [AbstractValidationRule](../../../../../../io/github/qishr/cascara/schema/rule/AbstractValidationRule.md)

error, error


## Method Details

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>



**Specified By:**

[ValidationRule](../../../../../../io/github/qishr/cascara/schema/rule/ValidationRule.md)


---

### validateValue

<span style="font-family: monospace; font-size: 80%;">public boolean __validateValue__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>



**Specified By:**

[ValidationRule](../../../../../../io/github/qishr/cascara/schema/rule/ValidationRule.md)


---

### getMax

<span style="font-family: monospace; font-size: 80%;">public double __getMax__()</span>




---

