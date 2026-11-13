Package [io.github.qishr.cascara.common.security.policy](index.md)

# Class Builder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.policy.SplSignaturePolicy.Builder<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.security.policy.SplSignaturePolicy](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Builder__</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| Builder()   |             |



## Method Summary

| Modifier and Type                                                                                                      | Method                                                                                                                                                                                                                                               | Description |
|------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md)    | [requireSigned](#requiresigned)(boolean requireSigned)                                                                                                                                                                                               |             |
| public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md)    | [requireSignedClasses](#requiresignedclasses)(boolean requireSignedClasses)                                                                                                                                                                          |             |
| public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md)    | [checkExpiry](#checkexpiry)(boolean checkExpiry)                                                                                                                                                                                                     |             |
| public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md)    | [setTrustStore](#settruststore)([TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) trustStore)                                                                                                            |             |
| public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md)    | [trustSystemModules](#trustsystemmodules)(boolean trustSystemModules)                                                                                                                                                                                |             |
| public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md)    | [allowedDigestAlgorithms](#alloweddigestalgorithms)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> algorithms) |             |
| public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md)    | [addCrl](#addcrl)([X509CRL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509CRL.html) crl)                                                                                                                       |             |
| public [SplSignaturePolicy](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.md) | [build](#build)()                                                                                                                                                                                                                                    |             |



## Method Details

### requireSigned

<span style="font-family: monospace; font-size: 80%;">public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __requireSigned__(boolean requireSigned)</span>




---

### requireSignedClasses

<span style="font-family: monospace; font-size: 80%;">public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __requireSignedClasses__(boolean requireSignedClasses)</span>




---

### checkExpiry

<span style="font-family: monospace; font-size: 80%;">public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __checkExpiry__(boolean checkExpiry)</span>




---

### setTrustStore

<span style="font-family: monospace; font-size: 80%;">public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __setTrustStore__([TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) trustStore)</span>




---

### trustSystemModules

<span style="font-family: monospace; font-size: 80%;">public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __trustSystemModules__(boolean trustSystemModules)</span>




---

### allowedDigestAlgorithms

<span style="font-family: monospace; font-size: 80%;">public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __allowedDigestAlgorithms__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> algorithms)</span>




---

### addCrl

<span style="font-family: monospace; font-size: 80%;">public [Builder](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.Builder.md) __addCrl__([X509CRL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509CRL.html) crl)</span>




---

### build

<span style="font-family: monospace; font-size: 80%;">public [SplSignaturePolicy](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.md) __build__()</span>




---

