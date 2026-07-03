Package [io.github.qishr.cascara.schema.rule](index.md)

# Class MinItemsRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.rule.AbstractValidationRule](AbstractValidationRule.md)<br/>
                io.github.qishr.cascara.schema.rule.MinItemsRule<br/>
<br/>
All Implemented Interfaces:<br/>
    [ValidationRule](ValidationRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __MinItemsRule__<br/>extends [AbstractValidationRule](AbstractValidationRule.md)
</span>


## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| MinItemsRule(int minItems) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                                      | Description |
|-------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean    | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                  |             |
| public boolean    | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |             |
| public int        | [getMinItems](#getminitems)()                                                                                                                                                                                                                                                                               |             |


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

### getMinItems

<span style="font-family: monospace; font-size: 80%;">public int __getMinItems__()</span>




---

