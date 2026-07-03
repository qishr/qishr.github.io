Package [io.github.qishr.cascara.schema.rule](index.md)

# Class FileExtensionRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.rule.AbstractValidationRule](AbstractValidationRule.md)<br/>
                io.github.qishr.cascara.schema.rule.FileExtensionRule<br/>
<br/>
All Implemented Interfaces:<br/>
    [ValidationRule](ValidationRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __FileExtensionRule__<br/>extends [AbstractValidationRule](AbstractValidationRule.md)
</span>


## Constructor Summary

| Constructor                                                                                                                  | Description |
|------------------------------------------------------------------------------------------------------------------------------|-------------|
| FileExtensionRule([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] extensions) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                                                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] | [getExtensions](#getextensions)()                                                                                                                                                                                                                          |             |
| public boolean                                                                                        | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |             |


### Methods inherited from [AbstractValidationRule](AbstractValidationRule.md)

error, error


## Method Details

### getExtensions

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __getExtensions__()</span>




---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Specified By:**

[ValidationRule](ValidationRule.md)


---

