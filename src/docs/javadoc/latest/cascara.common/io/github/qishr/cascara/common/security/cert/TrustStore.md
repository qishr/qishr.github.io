Package [io.github.qishr.cascara.common.security.cert](index.md)

# Class TrustStore
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cert.TrustStore<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __TrustStore__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| TrustStore([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> trustedCertificates) |             |



## Method Summary

| Modifier and Type                                                                                           | Method                                                                                                                                                                     | Description                                                                                                                                   |
|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|
| public static [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) | [empty](#empty)()                                                                                                                                                          |                                                                                                                                               |
| public static [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) | [fromSystemProperties](#fromsystemproperties)()                                                                                                                            | Loads a TrustStore from standard Cascara system properties: -Dcascara.truststore=/path/to/truststore.jks -Dcascara.truststore.password=secret |
| public static [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) | [load](#load)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, char[] password)                                          |                                                                                                                                               |
| public boolean                                                                                              | [contains](#contains)([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) cert)                        |                                                                                                                                               |
| public boolean                                                                                              | [isTrusted](#istrusted)([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) cert, boolean checkExpiry) |                                                                                                                                               |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)               | [getCertificates](#getcertificates)()                                                                                                                                      |                                                                                                                                               |



## Method Details

### empty

<span style="font-family: monospace; font-size: 80%;">public static [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) __empty__()</span>




---

### fromSystemProperties

<span style="font-family: monospace; font-size: 80%;">public static [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) __fromSystemProperties__()</span>

Loads a TrustStore from standard Cascara system properties:
-Dcascara.truststore=/path/to/truststore.jks
-Dcascara.truststore.password=secret


---

### load

<span style="font-family: monospace; font-size: 80%;">public static [TrustStore](../../../../../../../io/github/qishr/cascara/common/security/cert/TrustStore.md) __load__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, char[] password)</span>




---

### contains

<span style="font-family: monospace; font-size: 80%;">public boolean __contains__([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) cert)</span>




---

### isTrusted

<span style="font-family: monospace; font-size: 80%;">public boolean __isTrusted__([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) cert, boolean checkExpiry)</span>




---

### getCertificates

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getCertificates__()</span>




---

