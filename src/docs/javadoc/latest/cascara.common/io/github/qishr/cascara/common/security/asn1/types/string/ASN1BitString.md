Package [io.github.qishr.cascara.common.security.asn1.types.string](index.md)

# Class ASN1BitString
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.security.asn1.types.ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<boolean[]><br/>
                [io.github.qishr.cascara.common.security.asn1.types.string.ASN1String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)<boolean[]><br/>
                        io.github.qishr.cascara.common.security.asn1.types.string.ASN1BitString<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1BitString__<br/>extends [ASN1String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)<boolean[]>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                             | Description |
|-------------------|-------------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.security.asn1.types.string.ASN1BitString.Parser](ASN1BitString.Parser.md)         |             |
| public static     | [io.github.qishr.cascara.common.security.asn1.types.string.ASN1BitString.Serializer](ASN1BitString.Serializer.md) |             |



## Constructor Summary

| Constructor                                                                                                        | Description                       |
|--------------------------------------------------------------------------------------------------------------------|-----------------------------------|
| ASN1BitString(byte[] bytes, int unusedBits)                                                                        |                                   |
| ASN1BitString(boolean[] bits)                                                                                      |                                   |
| ASN1BitString([BitSet](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/BitSet.html) bitSet) | Constructor for ASN.1 BIT STRING. |



## Method Summary

| Modifier and Type                                                                                      | Method                        | Description                                          |
|--------------------------------------------------------------------------------------------------------|-------------------------------|------------------------------------------------------|
| public boolean[]                                                                                       | [getValue](#getvalue)()       |                                                      |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [valueString](#valuestring)() |                                                      |
| public boolean                                                                                         | [isSet](#isset)(int x)        | Check whether bit 'x' is set in the ASN.1 BIT_STRING |
| public int                                                                                             | [length](#length)()           |                                                      |


### Methods inherited from [ASN1Object](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)

toString, getTag, getEncoded, equals, hashCode

### Methods inherited from [ASN1String](../../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md)

iterator, getValueBytes


## Method Details

### getValue

<span style="font-family: monospace; font-size: 80%;">public boolean[] __getValue__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#getvalue)


---

### valueString

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __valueString__()</span>



**Overrides:**

[ASN1Object](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md#valuestring)


---

### isSet

<span style="font-family: monospace; font-size: 80%;">public boolean __isSet__(int x)</span>

Check whether bit 'x' is set in the ASN.1 BIT_STRING

**Parameters:**

`x` - The bit to check

**Returns:**

true if bit 'x' is set, false otherwise.


---

### length

<span style="font-family: monospace; font-size: 80%;">public int __length__()</span>



**Overrides:**

[ASN1String](../../../../../../../../../../cascara.common/io/github/qishr/cascara/common/security/asn1/types/string/ASN1String.md#length)


---

