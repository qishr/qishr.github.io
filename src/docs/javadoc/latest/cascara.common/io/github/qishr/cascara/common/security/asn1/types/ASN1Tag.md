Package [io.github.qishr.cascara.common.security.asn1.types](index.md)

# Class ASN1Tag
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.security.asn1.types.ASN1Tag<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ASN1Tag__</span>


## Field Summary

| Modifier and Type                                 | Field                                   | Description |
|---------------------------------------------------|-----------------------------------------|-------------|
| public static final ASN1Tag<ASN1BitString>        | [BIT_STRING](#bit_string)               |             |
| public static final ASN1Tag<ASN1Boolean>          | [BOOLEAN](#boolean)                     |             |
| public static final ASN1Tag<ASN1Enumerated>       | [ENUMERATED](#enumerated)               |             |
| public static final ASN1Tag<ASN1Integer>          | [INTEGER](#integer)                     |             |
| public static final ASN1Tag<ASN1Null>             | [NULL](#null)                           |             |
| public static final ASN1Tag<ASN1ObjectIdentifier> | [OBJECT_IDENTIFIER](#object_identifier) |             |
| public static final ASN1Tag<ASN1OctetString>      | [OCTET_STRING](#octet_string)           |             |
| public static final ASN1Tag<ASN1PrintableString>  | [PRINTABLE_STRING](#printable_string)   |             |
| public static final ASN1Tag<ASN1Sequence>         | [SEQUENCE](#sequence)                   |             |
| public static final ASN1Tag<ASN1Set>              | [SET](#set)                             |             |
| public static final ASN1Tag<ASN1UTCTime>          | [UTC_TIME](#utc_time)                   |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                      | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1Tag([ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md) asn1TagClass, int tag, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ASN1Encoding](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Encoding.md)> supportedEncodings) |             |
| ASN1Tag([ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md) asn1TagClass, int tag, [ASN1Encoding](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Encoding.md) asn1Encoding)                                                                                               |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                                                                    | Description |
|--------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)                  | [constructed](#constructed)()                                                                                                                             |             |
| public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)                  | [primitive](#primitive)()                                                                                                                                 |             |
| public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)                  | [asEncoded](#asencoded)([ASN1Encoding](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Encoding.md) asn1Encoding)          |             |
| public static [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)           | [application](#application)(int tag)                                                                                                                      |             |
| public static [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)           | [contextSpecific](#contextspecific)(int tag)                                                                                                              |             |
| public static [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)           | [forTag](#fortag)([ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md) asn1TagClass, int tag)       |             |
| public int                                                                                                               | [getTag](#gettag)()                                                                                                                                       |             |
| public [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md)        | [getAsn1TagClass](#getasn1tagclass)()                                                                                                                     |             |
| public [EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html)                    | [getSupportedEncodings](#getsupportedencodings)()                                                                                                         |             |
| public [ASN1Encoding](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Encoding.md)        | [getAsn1Encoding](#getasn1encoding)()                                                                                                                     |             |
| public boolean                                                                                                           | [isConstructed](#isconstructed)()                                                                                                                         |             |
| public abstract [ASN1Parser](../../../../../../../../io/github/qishr/cascara/common/security/asn1/ASN1Parser.md)         | [newParser](#newparser)([ASN1Decoder](../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md) decoder)         |             |
| public abstract [ASN1Serializer](../../../../../../../../io/github/qishr/cascara/common/security/asn1/ASN1Serializer.md) | [newSerializer](#newserializer)([ASN1Encoder](../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Encoder.md) encoder) |             |
| public boolean                                                                                                           | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                         |             |
| public int                                                                                                               | [hashCode](#hashcode)()                                                                                                                                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [toString](#tostring)()                                                                                                                                   |             |



## Field Details

### BIT_STRING

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1BitString> __BIT_STRING__</span>




---

### BOOLEAN

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1Boolean> __BOOLEAN__</span>




---

### ENUMERATED

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1Enumerated> __ENUMERATED__</span>




---

### INTEGER

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1Integer> __INTEGER__</span>




---

### NULL

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1Null> __NULL__</span>




---

### OBJECT_IDENTIFIER

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1ObjectIdentifier> __OBJECT_IDENTIFIER__</span>




---

### OCTET_STRING

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1OctetString> __OCTET_STRING__</span>




---

### PRINTABLE_STRING

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1PrintableString> __PRINTABLE_STRING__</span>




---

### SEQUENCE

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1Sequence> __SEQUENCE__</span>




---

### SET

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1Set> __SET__</span>




---

### UTC_TIME

<span style="font-family: monospace; font-size: 80%;">public static final ASN1Tag<ASN1UTCTime> __UTC_TIME__</span>




---


## Method Details

### constructed

<span style="font-family: monospace; font-size: 80%;">public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __constructed__()</span>




---

### primitive

<span style="font-family: monospace; font-size: 80%;">public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __primitive__()</span>




---

### asEncoded

<span style="font-family: monospace; font-size: 80%;">public [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __asEncoded__([ASN1Encoding](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Encoding.md) asn1Encoding)</span>




---

### application

<span style="font-family: monospace; font-size: 80%;">public static [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __application__(int tag)</span>




---

### contextSpecific

<span style="font-family: monospace; font-size: 80%;">public static [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __contextSpecific__(int tag)</span>




---

### forTag

<span style="font-family: monospace; font-size: 80%;">public static [ASN1Tag](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md) __forTag__([ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md) asn1TagClass, int tag)</span>




---

### getTag

<span style="font-family: monospace; font-size: 80%;">public int __getTag__()</span>




---

### getAsn1TagClass

<span style="font-family: monospace; font-size: 80%;">public [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md) __getAsn1TagClass__()</span>




---

### getSupportedEncodings

<span style="font-family: monospace; font-size: 80%;">public [EnumSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/EnumSet.html) __getSupportedEncodings__()</span>




---

### getAsn1Encoding

<span style="font-family: monospace; font-size: 80%;">public [ASN1Encoding](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Encoding.md) __getAsn1Encoding__()</span>




---

### isConstructed

<span style="font-family: monospace; font-size: 80%;">public boolean __isConstructed__()</span>




---

### newParser

<span style="font-family: monospace; font-size: 80%;">public abstract [ASN1Parser](../../../../../../../../io/github/qishr/cascara/common/security/asn1/ASN1Parser.md) __newParser__([ASN1Decoder](../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Decoder.md) decoder)</span>




---

### newSerializer

<span style="font-family: monospace; font-size: 80%;">public abstract [ASN1Serializer](../../../../../../../../io/github/qishr/cascara/common/security/asn1/ASN1Serializer.md) __newSerializer__([ASN1Encoder](../../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Encoder.md) encoder)</span>




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

