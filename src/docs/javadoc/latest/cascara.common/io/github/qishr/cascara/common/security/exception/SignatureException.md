Package [io.github.qishr.cascara.common.security.exception](index.md)

# Class SignatureException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [java.lang.SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)<br/>
                                        [io.github.qishr.cascara.common.i18n.exception.LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableSecurityException.md)<br/>
                                                io.github.qishr.cascara.common.security.exception.SignatureException<br/>
<br/>
Direct Known Subtypes:<br/>
    [UnsupportedDigestException](../../../../../../../io/github/qishr/cascara/common/security/exception/UnsupportedDigestException.md), [InvalidKeyException](../../../../../../../io/github/qishr/cascara/common/security/exception/InvalidKeyException.md), [UnsupportedAlgorithmException](../../../../../../../io/github/qishr/cascara/common/security/exception/UnsupportedAlgorithmException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __SignatureException__<br/>extends [LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableSecurityException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| SignatureException([SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) signatureStatus, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                       |             |
| SignatureException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) signatureStatus, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                | Method                                      | Description |
|------------------------------------------------------------------------------------------------------------------|---------------------------------------------|-------------|
| public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) | [getSignatureStatus](#getsignaturestatus)() |             |


### Methods inherited from [LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableSecurityException.md)

getLocalizableMessage, getLocalizedMessage, getMessage, getDetails


## Method Details

### getSignatureStatus

<span style="font-family: monospace; font-size: 80%;">public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) __getSignatureStatus__()</span>




---

