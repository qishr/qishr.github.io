Package [io.github.qishr.cascara.common.security.policy](index.md)

# Interface SignaturePolicy
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.policy.SignaturePolicy<br/>
<br/>
All Known Implementing Classes:<br/>
    [SplSignaturePolicy](../../../../../../../io/github/qishr/cascara/common/security/policy/SplSignaturePolicy.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SignaturePolicy__</span>


## Method Summary

| Modifier and Type                                                                                                         | Method                                                                                                                    | Description |
|---------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) | [evaluate](#evaluate)([JarFile](../../../../../../../io/github/qishr/cascara/common/util/JarFile.md) jar)                 |             |
| public abstract [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) | [evaluate](#evaluate)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type) |             |



## Method Details

### evaluate

<span style="font-family: monospace; font-size: 80%;">public abstract [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) __evaluate__([JarFile](../../../../../../../io/github/qishr/cascara/common/util/JarFile.md) jar)</span>




---

### evaluate

<span style="font-family: monospace; font-size: 80%;">public abstract [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) __evaluate__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type)</span>




---

