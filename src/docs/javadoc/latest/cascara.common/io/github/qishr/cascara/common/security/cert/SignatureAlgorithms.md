Package [io.github.qishr.cascara.common.security.cert](index.md)

# Class SignatureAlgorithms
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cert.SignatureAlgorithms<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __SignatureAlgorithms__</span>


## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                                                                            | Description                                                                                                                                              |
|------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSignatureAlgorithmName](#getsignaturealgorithmname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) oid)                                                                                                                         |                                                                                                                                                          |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSignatureOid](#getsignatureoid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jcaName)                                                                                                                                         |                                                                                                                                                          |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getDigestName](#getdigestname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) digestOid)                                                                                                                                           |                                                                                                                                                          |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getDefaultSignatureAlgorithm](#getdefaultsignaturealgorithm)([PublicKey](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/PublicKey.html) publicKey)                                                                                                   | Resolves the matching signature algorithm for a given private/public key, picking the standard default digest (matching Java's default curve/key sizes). |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [resolveSignatureAlgorithm](#resolvesignaturealgorithm)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) digestOid, [PublicKey](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/PublicKey.html) publicKey) | Combines a digest algorithm (e.g.                                                                                                                        |



## Method Details

### getSignatureAlgorithmName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSignatureAlgorithmName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) oid)</span>



**Throws:**

[NoSuchAlgorithmException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/NoSuchAlgorithmException.html)


---

### getSignatureOid

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSignatureOid__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jcaName)</span>



**Throws:**

[NoSuchAlgorithmException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/NoSuchAlgorithmException.html)


---

### getDigestName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDigestName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) digestOid)</span>



**Throws:**

[NoSuchAlgorithmException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/NoSuchAlgorithmException.html)


---

### getDefaultSignatureAlgorithm

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDefaultSignatureAlgorithm__([PublicKey](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/PublicKey.html) publicKey)</span>

Resolves the matching signature algorithm for a given private/public key,
picking the standard default digest (matching Java's default curve/key sizes).


---

### resolveSignatureAlgorithm

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __resolveSignatureAlgorithm__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) digestOid, [PublicKey](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/PublicKey.html) publicKey)</span>

Combines a digest algorithm (e.g.from PKCS#7 SignerInfo) with a key algorithm.

**Throws:**

[NoSuchAlgorithmException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/security/NoSuchAlgorithmException.html)


---

