Package [io.github.qishr.cascara.common.security.verifier](index.md)

# Interface JarVerifier
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.verifier.JarVerifier<br/>
<br/>
All Known Implementing Classes:<br/>
    [CascaraJarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/CascaraJarVerifier.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __JarVerifier__</span>


## Nested Class Summary

| Modifier and Type    | Class                                                                                                        | Description |
|----------------------|--------------------------------------------------------------------------------------------------------------|-------------|
| public static final  | [io.github.qishr.cascara.common.security.verifier.JarVerifier.VerifiedSigner](JarVerifier.VerifiedSigner.md) |             |



## Method Summary

| Modifier and Type                                                                                                                     | Method                                                                                                                                                                                                                                   | Description |
|---------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)                   | [setKeys](#setkeys)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> keys)                   |             |
| public abstract [JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)                   | [setSignatures](#setsignatures)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> signatures) |             |
| public abstract [JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md)                   | [setManifest](#setmanifest)(byte[] rawManifestBytes)                                                                                                                                                                                     |             |
| public abstract void                                                                                                                  | [verifyJarSignature](#verifyjarsignature)()                                                                                                                                                                                              |             |
| public abstract void                                                                                                                  | [verifyEntrySignature](#verifyentrysignature)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, byte[] content)                                                                    |             |
| public abstract boolean                                                                                                               | [isTrustedManifestEntry](#istrustedmanifestentry)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)                                | [getSigners](#getsigners)()                                                                                                                                                                                                              |             |
| public abstract [VerifiedSigner](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.VerifiedSigner.md) | [getSigner](#getsigner)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)                                                                                                          |             |



## Method Details

### setKeys

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public abstract [JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md) __setKeys__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> keys)</span>




---

### setSignatures

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public abstract [JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md) __setSignatures__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), byte[]> signatures)</span>




---

### setManifest

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public abstract [JarVerifier](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.md) __setManifest__(byte[] rawManifestBytes)</span>




---

### verifyJarSignature

<span style="font-family: monospace; font-size: 80%;">public abstract void __verifyJarSignature__()</span>




---

### verifyEntrySignature

<span style="font-family: monospace; font-size: 80%;">public abstract void __verifyEntrySignature__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName, byte[] content)</span>




---

### isTrustedManifestEntry

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isTrustedManifestEntry__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>




---

### getSigners

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getSigners__()</span>




---

### getSigner

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public abstract [VerifiedSigner](../../../../../../../io/github/qishr/cascara/common/security/verifier/JarVerifier.VerifiedSigner.md) __getSigner__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) entryName)</span>




---

