Package [io.github.qishr.cascara.common.security.asn1.types](index.md)

# Class ASN1Object
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.asn1.types.ASN1Object<br/>
<br/>
Direct Known Subtypes:<br/>
    [ASN1TaggedObject](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1TaggedObject.md), [ASN1Set](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Set.md), [ASN1Sequence](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/constructed/ASN1Sequence.md), [ASN1PrimitiveValue](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md), [ASN1String](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ASN1Object__</span>


## Field Summary

| Modifier and Type                          | Field       | Description |
|--------------------------------------------|-------------|-------------|
| protected ASN1Tag<? extends ASN1Object<?>> | [tag](#tag) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                           | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1Object([ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<? extends [ASN1Object](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?>> tag) |             |



## Method Summary

| Modifier and Type                                                                                       | Method                                                                                                            | Description |
|---------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract T                                                                                       | [getValue](#getvalue)()                                                                                           |             |
| public boolean                                                                                          | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |             |
| public int                                                                                              | [hashCode](#hashcode)()                                                                                           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)     | [toString](#tostring)()                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)  | [valueString](#valuestring)()                                                                                     |             |
| public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) | [getTag](#gettag)()                                                                                               |             |
| public byte[]                                                                                           | [getEncoded](#getencoded)()                                                                                       |             |



## Field Details

### tag

<span style="font-family: monospace; font-size: 80%;">protected ASN1Tag<? extends ASN1Object<?>> __tag__</span>




---


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public abstract T __getValue__()</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### valueString

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __valueString__()</span>




---

### getTag

<span style="font-family: monospace; font-size: 80%;">public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __getTag__()</span>




---

### getEncoded

<span style="font-family: monospace; font-size: 80%;">public byte[] __getEncoded__()</span>




---

