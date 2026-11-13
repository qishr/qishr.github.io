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

| Modifier and Type                                                                                                         | Method                                                                                                                                                                                                                                        | Description                                                                                               |
|---------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) | [hasExactValue](#hasexactvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) expectedValue) | Matches if a property has a specific exact value (matches JSON Schema types like String, Boolean, Number) |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) | [isTrue](#istrue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                           | Matches if a property is a boolean flag set to true                                                       |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) | [supportsJvmTypeOrSupertype](#supportsjvmtypeorsupertype)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                              | Matches if a property is a boolean flag set to true                                                       |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) | [supportsExactJvmType](#supportsexactjvmtype)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                          | Matches if a property is a boolean flag set to true                                                       |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) | [supportsContentType](#supportscontenttype)([ContentType](../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)                                                                                                  | Matches if a property is a boolean flag set to true                                                       |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) | [allOf](#allof)([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>[] predicates)     | Combines multiple capability predicates using logical AND (All must match)                                |
| public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) | [anyOf](#anyof)([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>[] predicates)     | Combines multiple capability predicates using logical OR (At least one must match)                        |



## Method Details

### hasExactValue

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) __hasExactValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) expectedValue)</span>

Matches if a property has a specific exact value (matches JSON Schema types like String, Boolean, Number)


---

### isTrue

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) __isTrue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>

Matches if a property is a boolean flag set to true


---

### supportsJvmTypeOrSupertype

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) __supportsJvmTypeOrSupertype__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>

Matches if a property is a boolean flag set to true


---

### supportsExactJvmType

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) __supportsExactJvmType__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>

Matches if a property is a boolean flag set to true


---

### supportsContentType

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Beta<br/>
public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) __supportsContentType__([ContentType](../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)</span>

Matches if a property is a boolean flag set to true


---

### allOf

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) __allOf__([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>[] predicates)</span>

Combines multiple capability predicates using logical AND (All must match)

**Returns:**

predicate


---

### anyOf

<span style="font-family: monospace; font-size: 80%;">public static [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html) __anyOf__([Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>[] predicates)</span>

Combines multiple capability predicates using logical OR (At least one must match)


---

