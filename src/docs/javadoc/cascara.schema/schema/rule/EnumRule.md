Package [io.github.qishr.cascara.schema.rule](index.md)

# Class EnumRule
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.rule.EnumRule<br/>
<br/>
All Implemented Interfaces:<br/>
    [ValidationRule](ValidationRule.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __EnumRule__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| EnumRule([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> allowedValues) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                                                                                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                   | [validate](#validate)([AstNode](../../../cascara.common/lang/ast/AstNode.md) node, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result)                                                  |             |
| public void                                                                                                                                                                                   | [validateValue](#validatevalue)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [ValidationResult](../util/ValidationResult.md) result) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getAllowedValues](#getallowedvalues)()                                                                                                                                                                                                                                                        |             |



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

### getAllowedValues

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getAllowedValues__()</span>




---

