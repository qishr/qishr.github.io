Package [io.github.qishr.cascara.common.security.asn1.types.primitive](index.md)

# Class ASN1Boolean
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[java.lang.Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)><br/>
                [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[java.lang.Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)><br/>
                        io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Boolean<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1Boolean__<br/>extends [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                            | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Boolean.Parser](ASN1Boolean.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Boolean.Serializer](ASN1Boolean.Serializer.md) |             |



## Constructor Summary

| Constructor                | Description |
|----------------------------|-------------|
| ASN1Boolean(boolean value) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                    | Description |
|-------------------------------------------------------------------------------------------------------|---------------------------|-------------|
| public [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) | [getValue](#getvalue)()   |             |
| protected int                                                                                         | [valueHash](#valuehash)() |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getTag, getEncoded, equals, valueString, hashCode


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### valueHash

<span style="font-family: monospace; font-size: 80%;">protected int __valueHash__()</span>



**Overrides:**

[ASN1PrimitiveValue](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md#valuehash)


---

