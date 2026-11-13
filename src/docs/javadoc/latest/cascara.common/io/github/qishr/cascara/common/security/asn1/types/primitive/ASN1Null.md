Package [io.github.qishr.cascara.common.security.asn1.types.primitive](index.md)

# Class ASN1Null
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[java.lang.Void](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Void.html)><br/>
                [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[java.lang.Void](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Void.html)><br/>
                        io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Null<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1Null__<br/>extends [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[Void](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Void.html)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                      | Description |
|-------------------|------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Null.Parser](ASN1Null.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Null.Serializer](ASN1Null.Serializer.md) |             |



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| ASN1Null()  |             |



## Method Summary

| Modifier and Type                                                                               | Method                    | Description |
|-------------------------------------------------------------------------------------------------|---------------------------|-------------|
| public [Void](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Void.html) | [getValue](#getvalue)()   |             |
| protected int                                                                                   | [valueHash](#valuehash)() |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getTag, getEncoded, equals, valueString, hashCode


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public [Void](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Void.html) __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### valueHash

<span style="font-family: monospace; font-size: 80%;">protected int __valueHash__()</span>



**Overrides:**

[ASN1PrimitiveValue](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md#valuehash)


---

