Package [io.github.qishr.cascara.common.security.policy](index.md)

# Class SplSignaturePolicy
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.policy.SplSignaturePolicy<br/>
<br/>
All Implemented Interfaces:<br/>
    [SignaturePolicy](../../../../../../../io/github/qishr/cascara/common/security/policy/SignaturePolicy.md)


----

<span style="font-family: monospace; font-size: 80%;">public final class __SplSignaturePolicy__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                      | Description |
|-------------------|------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.policy.SplSignaturePolicy.Builder](SplSignaturePolicy.Builder.md) |             |



## Field Summary

| Modifier and Type                                                                                                | Field             | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SCHEMA](#schema) |             |



## Method Summary

| Modifier and Type                                                                                                          | Method                                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                                             | [getRequireSigned](#getrequiresigned)()                                                                                   |             |
| public boolean                                                                                                             | [getTrustStoreEnforced](#gettruststoreenforced)()                                                                         |             |
| public boolean                                                                                                             | [getCheckExpiry](#getcheckexpiry)()                                                                                       |             |
| public [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md)                       | [getTrustStore](#gettruststore)()                                                                                         |             |
| public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md)           | [evaluate](#evaluate)([JarFile](../../../../../../../io/github/qishr/cascara/common/util/JarFile.md) jarFile)             |             |
| public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md)           | [evaluate](#evaluate)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type) |             |
| public static [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) | [builder](#builder)()                                                                                                     |             |



## Field Details

### SCHEMA

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SCHEMA__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### getRequireSigned

<span style="font-family: monospace; font-size: 80%;">public boolean __getRequireSigned__()</span>




---

### getTrustStoreEnforced

<span style="font-family: monospace; font-size: 80%;">public boolean __getTrustStoreEnforced__()</span>




---

### getCheckExpiry

<span style="font-family: monospace; font-size: 80%;">public boolean __getCheckExpiry__()</span>




---

### getTrustStore

<span style="font-family: monospace; font-size: 80%;">public [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) __getTrustStore__()</span>




---

### evaluate

<span style="font-family: monospace; font-size: 80%;">public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) __evaluate__([JarFile](../../../../../../../io/github/qishr/cascara/common/util/JarFile.md) jarFile)</span>



**Specified By:**

[SignaturePolicy](../../../../../../../io/github/qishr/cascara/common/security/policy/SignaturePolicy.md)


---

### evaluate

<span style="font-family: monospace; font-size: 80%;">public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) __evaluate__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type)</span>



**Specified By:**

[SignaturePolicy](../../../../../../../io/github/qishr/cascara/common/security/policy/SignaturePolicy.md)


---

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __builder__()</span>




---

