Package [io.github.qishr.cascara.common.security.asn1.types.primitive](index.md)

# Class ASN1Enumerated
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[java.math.BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)><br/>
                [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[java.math.BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)><br/>
                        io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Enumerated<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1Enumerated__<br/>extends [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                                  | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Enumerated.Parser](ASN1Enumerated.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Enumerated.Serializer](ASN1Enumerated.Serializer.md) |             |



## Constructor Summary

| Constructor                                                                                                                | Description |
|----------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1Enumerated(int value)                                                                                                  |             |
| ASN1Enumerated([BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) value) |             |



## Method Summary

| Modifier and Type                                                                                           | Method                  | Description |
|-------------------------------------------------------------------------------------------------------------|-------------------------|-------------|
| public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) | [getValue](#getvalue)() |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getTag, getEncoded, equals, valueString, hashCode

### Methods inherited from [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)

valueHash


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

