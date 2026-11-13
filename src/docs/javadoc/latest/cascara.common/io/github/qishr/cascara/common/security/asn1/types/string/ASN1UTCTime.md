Package [io.github.qishr.cascara.common.security.asn1.types.string](index.md)

# Class ASN1UTCTime
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<byte[]><br/>
                [io.github.qishr.cascara.common.security.asn1.types.string.ASN1String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)<byte[]><br/>
                        io.github.qishr.cascara.common.security.asn1.types.string.ASN1UTCTime<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __ASN1UTCTime__<br/>extends [ASN1String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)<byte[]>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                         | Description |
|-------------------|---------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.string.ASN1UTCTime.Parser](ASN1UTCTime.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.string.ASN1UTCTime.Serializer](ASN1UTCTime.Serializer.md) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ASN1UTCTime(byte[] bytes)                                                                                                                                                                                                                              |             |
| ASN1UTCTime([ASN1Tag](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Tag.md)<[ASN1UTCTime](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1UTCTime.md)> tag, byte[] bytes) |             |



## Method Summary

| Modifier and Type                                                                                      | Method                        | Description |
|--------------------------------------------------------------------------------------------------------|-------------------------------|-------------|
| public byte[]                                                                                          | [getValue](#getvalue)()       |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [valueString](#valuestring)() |             |
| public int                                                                                             | [length](#length)()           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)    | [toString](#tostring)()       |             |


### Methods inherited from [ASN1String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)

iterator, getValueBytes

### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

getTag, getEncoded, equals, hashCode


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public byte[] __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### valueString

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __valueString__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#valuestring)


---

### length

<span style="font-family: monospace; font-size: 80%;">public int __length__()</span>



**Overrides:**

[ASN1String](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md#length)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#tostring)


---

