Package [io.github.qishr.cascara.common.security.cert](index.md)

# Class CertPathVerifier
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cert.CertPathVerifier<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __CertPathVerifier__</span>


## Method Summary

| Modifier and Type                                                                                                                       | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Description                                                                                      |
|-----------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) | [validatePath](#validatepath)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates, [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) trustStore)                                                                                                                                                                                                                     | Validates a certificate chain against trusted anchors in a TrustStore.                           |
| public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) | [validatePath](#validatepath)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates, [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) trustStore, [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[X509CRL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509CRL.html)> crls) | Validates a certificate chain against trusted anchors in a TrustStore, optionally checking CRLs. |



## Method Details

### validatePath

<span style="font-family: monospace; font-size: 80%;">public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) __validatePath__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates, [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) trustStore)</span>

Validates a certificate chain against trusted anchors in a TrustStore.


---

### validatePath

<span style="font-family: monospace; font-size: 80%;">public static [CertPathValidationResult](../../../../../../../io/github/qishr/cascara/common/security/cert/CertPathValidationResult.md) __validatePath__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates, [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) trustStore, [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[X509CRL](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509CRL.html)> crls)</span>

Validates a certificate chain against trusted anchors in a TrustStore, optionally checking CRLs.


---

