Package [io.github.qishr.cascara.common.security.asn1.types.constructed](index.md)

# Class ASN1TaggedObject
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?>><br/>
                io.github.qishr.cascara.common.security.asn1.types.constructed.ASN1TaggedObject<br/>
<br/>
All Implemented Interfaces:<br/>
    [ASN1Constructed](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Constructed.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1TaggedObject__<br/>extends [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?>>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                                        | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.constructed.ASN1TaggedObject.Parser](ASN1TaggedObject.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.constructed.ASN1TaggedObject.Serializer](ASN1TaggedObject.Serializer.md) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                         | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1TaggedObject([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<?> tag, [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?> object, boolean explicit) |             |
| ASN1TaggedObject([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<?> tag, [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?> object)                   |             |



## Method Summary

| Modifier and Type                                                                                                | Method                                                                                                                              | Description                                                     |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| public boolean                                                                                                   | [isExplicit](#isexplicit)()                                                                                                         |                                                                 |
| public [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md) | [getValue](#getvalue)()                                                                                                             |                                                                 |
| public int                                                                                                       | [getTagNo](#gettagno)()                                                                                                             | Returns the identifying tag number of this ASN.1 Tagged Object. |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)          | [iterator](#iterator)()                                                                                                             |                                                                 |
| public [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md) | [getObject](#getobject)()                                                                                                           |                                                                 |
| public T                                                                                                         | [getObject](#getobject)([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<T> tag) |                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)              | [toString](#tostring)()                                                                                                             |                                                                 |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

getTag, getEncoded, equals, valueString, hashCode


## Method Details

### isExplicit

<span style="font-family: monospace; font-size: 80%;">public boolean __isExplicit__()</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md) __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### getTagNo

<span style="font-family: monospace; font-size: 80%;">public int __getTagNo__()</span>

Returns the identifying tag number of this ASN.1 Tagged Object.

**Returns:**

the tag number.


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html) __iterator__()</span>




---

### getObject

<span style="font-family: monospace; font-size: 80%;">public [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md) __getObject__()</span>




---

### getObject

<span style="font-family: monospace; font-size: 80%;">public T __getObject__([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<T> tag)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#tostring)


---

