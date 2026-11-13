Package [io.github.qishr.cascara.common.security.asn1](index.md)

# Class ASN1OutputStream
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.io.OutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/OutputStream.html)<br/>
                [java.io.FilterOutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/FilterOutputStream.html)<br/>
                        io.github.qishr.cascara.common.security.asn1.ASN1OutputStream<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ASN1OutputStream__<br/>extends [FilterOutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/FilterOutputStream.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                         | Description                                                                             |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|
| ASN1OutputStream([ASN1Encoder](../../../../../../../io/github/qishr/cascara/common/security/asn1/encodingrules/ASN1Encoder.md) encoder, [OutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/OutputStream.html) out) | Creates an output stream filter built on top of the specified underlying output stream. |



## Method Summary

| Modifier and Type | Method                                                                                                                                         | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void       | [writeObject](#writeobject)([ASN1Object](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?> asn1Object) |             |
| public void       | [write](#write)(byte[] b, int off, int len)                                                                                                    |             |



## Method Details

### writeObject

<span style="font-family: monospace; font-size: 80%;">public void __writeObject__([ASN1Object](../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1Object.md)<?> asn1Object)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### write

<span style="font-family: monospace; font-size: 80%;">public void __write__(byte[] b, int off, int len)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)

**Overrides:**

[FilterOutputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/FilterOutputStream.html#write)


---

