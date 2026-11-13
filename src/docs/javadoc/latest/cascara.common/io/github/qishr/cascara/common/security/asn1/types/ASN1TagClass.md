Package [io.github.qishr.cascara.common.security.asn1.types](index.md)

# Enum ASN1TagClass
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.security.asn1.types.ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md)><br/>
                io.github.qishr.cascara.common.security.asn1.types.ASN1TagClass<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final enum __ASN1TagClass__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md)>
</span>


##Enum Constants

| Enum Constant                         | Description |
|---------------------------------------|-------------|
| [UNIVERSAL](#universal)               |             |
| [APPLICATION](#application)           |             |
| [CONTEXT_SPECIFIC](#context_specific) |             |
| [PRIVATE](#private)                   |             |



## Method Summary

| Modifier and Type                                                                                                          | Method                                                                                                                 | Description |
|----------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md)[] | [values](#values)()                                                                                                    |             |
| public static [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public static [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md)   | [parseClass](#parseclass)(byte tagByte)                                                                                |             |
| public int                                                                                                                 | [getValue](#getvalue)()                                                                                                |             |



## Enum Constant Details

### UNIVERSAL

public static final  UNIVERSAL




---

### APPLICATION

public static final  APPLICATION




---

### CONTEXT_SPECIFIC

public static final  CONTEXT_SPECIFIC




---

### PRIVATE

public static final  PRIVATE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### parseClass

<span style="font-family: monospace; font-size: 80%;">public static [ASN1TagClass](../../../../../../../../io/github/qishr/cascara/common/security/asn1/types/ASN1TagClass.md) __parseClass__(byte tagByte)</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public int __getValue__()</span>




---

