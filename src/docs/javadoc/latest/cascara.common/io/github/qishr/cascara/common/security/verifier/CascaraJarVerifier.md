Package [io.github.qishr.cascara.common.security.verifier](index.md)

# Class CascaraJarVerifier
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.verifier.CascaraJarVerifier<br/>
<br/>
All Implemented Interfaces:<br/>
    [JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __CascaraJarVerifier__</span>


## Constructor Summary

| Constructor          | Description |
|----------------------|-------------|
| CascaraJarVerifier() |             |



## Method Summary

| Modifier and Type                                                                                                            | Method                                                                                                                                                                                                                                                                                                                                                                                              | Description                                                                                                                                                                                             |
|------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [CascaraJarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/CascaraJarVerifier.md)     | [setKeys](#setkeys)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> keysFiles)                                                                                                                                                                         |                                                                                                                                                                                                         |
| public [CascaraJarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/CascaraJarVerifier.md)     | [setSignatures](#setsignatures)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> signatureFiles)                                                                                                                                                        |                                                                                                                                                                                                         |
| public [CascaraJarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/CascaraJarVerifier.md)     | [setManifest](#setmanifest)(byte[] mf)                                                                                                                                                                                                                                                                                                                                                              |                                                                                                                                                                                                         |
| public void                                                                                                                  | [verifyJarSignature](#verifyjarsignature)()                                                                                                                                                                                                                                                                                                                                                         |                                                                                                                                                                                                         |
| public void                                                                                                                  | [verifyEntrySignature](#verifyentrysignature)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, byte[] content)                                                                                                                                                                                                                               | Verifies an individual file entry's stream against its SHA-256 digest in MANIFEST.MF.                                                                                                                   |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)                                | [getSigners](#getsigners)()                                                                                                                                                                                                                                                                                                                                                                         |                                                                                                                                                                                                         |
| public [VerifiedSigner](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.VerifiedSigner.md) | [getSigner](#getsigner)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                                                     |                                                                                                                                                                                                         |
| public boolean                                                                                                               | [isTrustedManifestEntry](#istrustedmanifestentry)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                                                                                                                                                           |                                                                                                                                                                                                         |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)                       | [buildChain](#buildchain)([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) leaf, [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates) | Constructs an ordered certificate chain [leaf, intermediate1, intermediate2, ...] from a target leaf certificate and an unordered collection of certificates found in the PKCS#7 / CMS signature block. |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                   | [resolveSignatureAlgorithm](#resolvesignaturealgorithm)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) digestOid, [PublicKey](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/PublicKey.html) publicKey)                                                                                                                   |                                                                                                                                                                                                         |
| public static [SignedData](../../../../../../../io/github/qishr/cascara/common/security/cms/SignedData.md)                   | [signedDataOrNull](#signeddataornull)([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq)                                                                                                                                                                                                                                      |                                                                                                                                                                                                         |



## Method Details

### setKeys

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [CascaraJarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/CascaraJarVerifier.md) __setKeys__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> keysFiles)</span>



**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### setSignatures

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [CascaraJarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/CascaraJarVerifier.md) __setSignatures__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> signatureFiles)</span>



**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### setManifest

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [CascaraJarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/CascaraJarVerifier.md) __setManifest__(byte[] mf)</span>



**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### verifyJarSignature

<span style="font-family: monospace; font-size: 80%;">public void __verifyJarSignature__()</span>



**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### verifyEntrySignature

<span style="font-family: monospace; font-size: 80%;">public void __verifyEntrySignature__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, byte[] content)</span>

Verifies an individual file entry's stream against its SHA-256 digest in MANIFEST.MF.

**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### getSigners

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getSigners__()</span>



**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### getSigner

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [VerifiedSigner](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.VerifiedSigner.md) __getSigner__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### isTrustedManifestEntry

<span style="font-family: monospace; font-size: 80%;">public boolean __isTrustedManifestEntry__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>



**Specified By:**

[JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)


---

### buildChain

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __buildChain__([X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html) leaf, [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[X509Certificate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/cert/X509Certificate.html)> certificates)</span>

Constructs an ordered certificate chain [leaf, intermediate1, intermediate2, ...]
from a target leaf certificate and an unordered collection of certificates found
in the PKCS#7 / CMS signature block.


---

### resolveSignatureAlgorithm

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __resolveSignatureAlgorithm__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) digestOid, [PublicKey](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/PublicKey.html) publicKey)</span>




---

### signedDataOrNull

<span style="font-family: monospace; font-size: 80%;">public static [SignedData](../../../../../../../io/github/qishr/cascara/common/security/cms/SignedData.md) __signedDataOrNull__([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq)</span>




---

