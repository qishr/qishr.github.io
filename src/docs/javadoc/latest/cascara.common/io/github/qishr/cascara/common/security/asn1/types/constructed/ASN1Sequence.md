Package [io.github.qishr.cascara.common.security.asn1.types.constructed](index.md)

# Class ASN1Sequence
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[java.util.List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?>>><br/>
                io.github.qishr.cascara.common.security.asn1.types.constructed.ASN1Sequence<br/>
<br/>
All Implemented Interfaces:<br/>
    [ASN1Constructed](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Constructed.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1Sequence__<br/>extends [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?>>>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                                | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.constructed.ASN1Sequence.Parser](ASN1Sequence.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.constructed.ASN1Sequence.Serializer](ASN1Sequence.Serializer.md) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                  | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1Sequence([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?>> objects) |             |



## Method Summary

| Modifier and Type                                                                                                | Method                  | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------|-------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)                  | [getValue](#getvalue)() |             |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)          | [iterator](#iterator)() |             |
| public int                                                                                                       | [size](#size)()         |             |
| public [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md) | [get](#get)(int i)      |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getTag, getEncoded, equals, valueString, hashCode


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html) __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html) __iterator__()</span>




---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md) __get__(int i)</span>




---

