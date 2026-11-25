Package [io.github.qishr.cascara.common.security.asn1.types.string](index.md)

# Class ASN1String
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<T><br/>
                io.github.qishr.cascara.common.security.asn1.types.string.ASN1String<br/>
<br/>
All Implemented Interfaces:<br/>
    [ASN1Primitive](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Primitive.md), [ASN1Constructed](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Constructed.md)

Direct Known Subtypes:<br/>
    [ASN1UTCTime](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1UTCTime.md), [ASN1BitString](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1BitString.md), [ASN1OctetString](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1OctetString.md), [ASN1PrintableString](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1PrintableString.md), [ASN1NumericString](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1NumericString.md), [ASN1UTF8String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1UTF8String.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ASN1String__<br/>extends [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<T>
</span>

An ASN.1 STRING type can either be expressed as a Primitive encoded or Constructed encoded sequence.


## Field Summary

| Modifier and Type | Field                     | Description |
|-------------------|---------------------------|-------------|
| protected byte[]  | [valueBytes](#valuebytes) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                      | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1String([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<? extends [ASN1String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)<T>> tag, byte[] bytes) |             |



## Method Summary

| Modifier and Type                                                                                       | Method                            | Description |
|---------------------------------------------------------------------------------------------------------|-----------------------------------|-------------|
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html) | [iterator](#iterator)()           |             |
| public byte[]                                                                                           | [getValueBytes](#getvaluebytes)() |             |
| public abstract int                                                                                     | [length](#length)()               |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getValue, getTag, getEncoded, equals, valueString, hashCode


## Field Details

### valueBytes

<span style="font-family: monospace; font-size: 80%;">protected byte[] __valueBytes__</span>




---


## Method Details

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html) __iterator__()</span>




---

### getValueBytes

<span style="font-family: monospace; font-size: 80%;">public byte[] __getValueBytes__()</span>




---

### length

<span style="font-family: monospace; font-size: 80%;">public abstract int __length__()</span>




---

