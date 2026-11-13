Package [io.github.qishr.cascara.common.security.asn1.types.primitive](index.md)

# Class ASN1PrimitiveValue
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<T><br/>
                io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1PrimitiveValue<br/>
<br/>
All Implemented Interfaces:<br/>
    [ASN1Primitive](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Primitive.md)

Direct Known Subtypes:<br/>
    [ASN1ObjectIdentifier](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1ObjectIdentifier.md), [ASN1Boolean](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Boolean.md), [ASN1Enumerated](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Enumerated.md), [ASN1Integer](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Integer.md), [ASN1Null](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1Null.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ASN1PrimitiveValue__<br/>extends [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<T>
</span>


## Field Summary

| Modifier and Type | Field                     | Description |
|-------------------|---------------------------|-------------|
| protected byte[]  | [valueBytes](#valuebytes) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1PrimitiveValue([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<? extends [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<T>> tag)                    |             |
| ASN1PrimitiveValue([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<? extends [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<T>> tag, byte[] valueBytes) |             |



## Method Summary

| Modifier and Type | Method                    | Description |
|-------------------|---------------------------|-------------|
| protected int     | [valueHash](#valuehash)() |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getValue, getTag, getEncoded, equals, valueString, hashCode


## Field Details

### valueBytes

<span style="font-family: monospace; font-size: 80%;">protected byte[] __valueBytes__</span>




---


## Method Details

### valueHash

<span style="font-family: monospace; font-size: 80%;">protected int __valueHash__()</span>




---

