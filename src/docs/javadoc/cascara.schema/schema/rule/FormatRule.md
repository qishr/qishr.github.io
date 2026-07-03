Package [io.github.qishr.cascara.schema.rule](index.md)

# Class FormatRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.schema.rule.AbstractValidationRule](AbstractValidationRule.md)<br/>
                io.github.qishr.cascara.schema.rule.FormatRule<br/>
<br/>
All Implemented Interfaces:<br/>
    [ValidationRule](ValidationRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __FormatRule__<br/>extends [AbstractValidationRule](AbstractValidationRule.md)
</span>


## Constructor Summary

| Constructor                                                                                                     | Description |
|-----------------------------------------------------------------------------------------------------------------|-------------|
| FormatRule([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) format) |             |
| FormatRule([ScalarDescriptor](../../../cascara.common/lang/type/ScalarDescriptor.md)<?> scalarDescriptor)       |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                                      | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                      | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                                                  |             |
| public boolean                                                                                      | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter) |             |
| public [ScalarDescriptor](../../../cascara.common/lang/type/ScalarDescriptor.md)<?>                 | [getScalarDescriptor](#getscalardescriptor)()                                                                                                                                                                                                                                                               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                                                                                                                                                                                                                   |             |


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

### getScalarDescriptor

<span style="font-family: monospace; font-size: 80%;">public [ScalarDescriptor](../../../cascara.common/lang/type/ScalarDescriptor.md)<?> __getScalarDescriptor__()</span>




---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>




---

