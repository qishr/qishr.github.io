Package [io.github.qishr.cascara.common.security.cert](index.md)

# Class CertPathValidationResult
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cert.CertPathValidationResult<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __CertPathValidationResult__</span>


## Method Summary

| Modifier and Type                                                                                                                       | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) | [valid](#valid)([CertPath](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/CertPath.html) certPath, [TrustAnchor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/TrustAnchor.html) trustAnchor)                                                                                                                                                                                                                                                                              |             |
| public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) | [invalid](#invalid)(io.github.qishr.cascara.common.security.policy.@io.github.qishr.cascara.common.annotation.NonNull SignatureStatus status, int failedIndex, [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) failedCertificate, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause) |             |
| public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) | [invalid](#invalid)(io.github.qishr.cascara.common.security.policy.@io.github.qishr.cascara.common.annotation.NonNull SignatureStatus status, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause)                                                                                                                                                             |             |
| public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) | [invalid](#invalid)(io.github.qishr.cascara.common.security.policy.@io.github.qishr.cascara.common.annotation.NonNull SignatureStatus status, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message)                                                                                                                                                                                                                                                                                   |             |
| public boolean                                                                                                                          | [isValid](#isvalid)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md)                        | [getStatus](#getstatus)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |             |
| public int                                                                                                                              | [getFailedIndex](#getfailedindex)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)          | [getFailedCertificate](#getfailedcertificate)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |             |
| public [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)                 | [getMessage](#getmessage)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |             |
| public [CertPath](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/CertPath.html)                        | [getCertPath](#getcertpath)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |             |
| public [TrustAnchor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/TrustAnchor.html)                  | [getTrustAnchor](#gettrustanchor)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |             |
| public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)          | [getTrustAnchorCertificate](#gettrustanchorcertificate)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |             |
| public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)                               | [getCause](#getcause)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |             |



## Method Details

### valid

<span style="font-family: monospace; font-size: 80%;">public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) __valid__([CertPath](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/CertPath.html) certPath, [TrustAnchor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/TrustAnchor.html) trustAnchor)</span>




---

### invalid

<span style="font-family: monospace; font-size: 80%;">public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) __invalid__(io.github.qishr.cascara.common.security.policy.@io.github.qishr.cascara.common.annotation.NonNull SignatureStatus status, int failedIndex, [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) failedCertificate, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause)</span>




---

### invalid

<span style="font-family: monospace; font-size: 80%;">public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) __invalid__(io.github.qishr.cascara.common.security.policy.@io.github.qishr.cascara.common.annotation.NonNull SignatureStatus status, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) message, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause)</span>




---

### invalid

<span style="font-family: monospace; font-size: 80%;">public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) __invalid__(io.github.qishr.cascara.common.security.policy.@io.github.qishr.cascara.common.annotation.NonNull SignatureStatus status, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) message)</span>




---

### isValid

<span style="font-family: monospace; font-size: 80%;">public boolean __isValid__()</span>




---

### getStatus

<span style="font-family: monospace; font-size: 80%;">public [SignatureStatus](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureStatus.md) __getStatus__()</span>




---

### getFailedIndex

<span style="font-family: monospace; font-size: 80%;">public int __getFailedIndex__()</span>




---

### getFailedCertificate

<span style="font-family: monospace; font-size: 80%;">public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) __getFailedCertificate__()</span>




---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) __getMessage__()</span>




---

### getCertPath

<span style="font-family: monospace; font-size: 80%;">public [CertPath](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/CertPath.html) __getCertPath__()</span>




---

### getTrustAnchor

<span style="font-family: monospace; font-size: 80%;">public [TrustAnchor](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/TrustAnchor.html) __getTrustAnchor__()</span>




---

### getTrustAnchorCertificate

<span style="font-family: monospace; font-size: 80%;">public [X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) __getTrustAnchorCertificate__()</span>




---

### getCause

<span style="font-family: monospace; font-size: 80%;">public [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) __getCause__()</span>




---

