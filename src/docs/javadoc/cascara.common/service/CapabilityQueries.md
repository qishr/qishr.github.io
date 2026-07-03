Package [io.github.qishr.cascara.common.service](index.md)

# Class CapabilityQueries
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.CapabilityQueries<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CapabilityQueries__</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| CapabilityQueries() |             |



## Method Summary

| Modifier and Type                                                                                                                                              | Method                                                                                                                                                                                                                                        | Description                                                                                               |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> | [hasExactValue](#hasexactvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) expectedValue) | Matches if a property has a specific exact value (matches JSON Schema types like String, Boolean, Number) |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> | [isTrue](#istrue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                           | Matches if a property is a boolean flag set to true                                                       |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> | [supportsJvmType](#supportsjvmtype)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                                    | Matches if a property is a boolean flag set to true                                                       |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> | [allOf](#allof)([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)>[] predicates)                                                                | Combines multiple capability predicates using logical AND (All must match)                                |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> | [anyOf](#anyof)([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)>[] predicates)                                                                | Combines multiple capability predicates using logical OR (At least one must match)                        |



## Method Details

### hasExactValue

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> __hasExactValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) expectedValue)</span>

Matches if a property has a specific exact value (matches JSON Schema types like String, Boolean, Number)


---

### isTrue

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> __isTrue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>

Matches if a property is a boolean flag set to true


---

### supportsJvmType

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> __supportsJvmType__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>

Matches if a property is a boolean flag set to true


---

### allOf

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> __allOf__([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)>[] predicates)</span>

Combines multiple capability predicates using logical AND (All must match)

**Returns:**

predicate


---

### anyOf

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> __anyOf__([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)>[] predicates)</span>

Combines multiple capability predicates using logical OR (At least one must match)


---

