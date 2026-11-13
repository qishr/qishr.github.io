Package [io.github.qishr.cascara.common.security.asn1.types.primitive](index.md)

# Class ASN1Integer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<[java.math.BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)><br/>
                [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[java.math.BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)><br/>
                        io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Integer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1Integer__<br/>extends [ASN1PrimitiveValue](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md)<[BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                            | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Integer.Parser](ASN1Integer.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.primitive.ASN1Integer.Serializer](ASN1Integer.Serializer.md) |             |



## Constructor Summary

| Constructor                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1Integer(long value)                                                                                                 |             |
| ASN1Integer([BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) value) |             |



## Method Summary

| Modifier and Type                                                                                           | Method                    | Description |
|-------------------------------------------------------------------------------------------------------------|---------------------------|-------------|
| public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) | [getValue](#getvalue)()   |             |
| public int                                                                                                  | [intValue](#intvalue)()   |             |
| protected int                                                                                               | [valueHash](#valuehash)() |             |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getTag, getEncoded, equals, valueString, hashCode


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public [BigInteger](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/math/BigInteger.html) __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### intValue

<span style="font-family: monospace; font-size: 80%;">public int __intValue__()</span>




---

### valueHash

<span style="font-family: monospace; font-size: 80%;">protected int __valueHash__()</span>



**Overrides:**

[ASN1PrimitiveValue](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/primitive/ASN1PrimitiveValue.md#valuehash)


---

