Package [io.github.qishr.cascara.common.security.asn1.types.primitive](index.md)

# Class ASN1ObjectIdentifier
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[java.lang.String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)><br/>
                [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[java.lang.String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)><br/>
                        io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1ObjectIdentifier<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1ObjectIdentifier__<br/>extends [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                                              | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1ObjectIdentifier.Parser](ASN1ObjectIdentifier.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1ObjectIdentifier.Serializer](ASN1ObjectIdentifier.Serializer.md) |             |



## Constructor Summary

| Constructor                                                                                                            | Description |
|------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1ObjectIdentifier([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) oid) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                    | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getValue](#getvalue)()   |             |
| protected int                                                                                       | [valueHash](#valuehash)() |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getTag, getEncoded, equals, valueString, hashCode


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### valueHash

<span style="font-family: monospace; font-size: 80%;">protected int __valueHash__()</span>



**Overrides:**

[ASN1PrimitiveValue](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md#valuehash)


---

