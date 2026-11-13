Package [io.github.qishr.cascara.common.security.cms](index.md)

# Class IssuerAndSerialNumber
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.cms.IssuerAndSerialNumber<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __IssuerAndSerialNumber__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| IssuerAndSerialNumber([X500Principal](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/javax/security/auth/x500/X500Principal.html) issuer, [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) serialNumber) |             |



## Method Summary

| Modifier and Type                                                                                                                | Method                                                                                                                                   | Description |
|----------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [X500Principal](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/javax/security/auth/x500/X500Principal.html) | [issuer](#issuer)()                                                                                                                      |             |
| public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)                      | [serialNumber](#serialnumber)()                                                                                                          |             |
| public static [IssuerAndSerialNumber](../../../../../../../io/github/qishr/cascara/common/security/cms/IssuerAndSerialNumber.md) | [parse](#parse)([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq) |             |



## Method Details

### issuer

<span style="font-family: monospace; font-size: 80%;">public [X500Principal](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/javax/security/auth/x500/X500Principal.html) __issuer__()</span>




---

### serialNumber

<span style="font-family: monospace; font-size: 80%;">public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) __serialNumber__()</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public static [IssuerAndSerialNumber](../../../../../../../io/github/qishr/cascara/common/security/cms/IssuerAndSerialNumber.md) __parse__([ASN1Sequence](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md) seq)</span>




---

