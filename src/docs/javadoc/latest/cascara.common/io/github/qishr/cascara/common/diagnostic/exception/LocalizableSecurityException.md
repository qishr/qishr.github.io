Package [io.github.qishr.cascara.common.diagnostic.exception](index.md)

# Class LocalizableSecurityException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [java.lang.SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)<br/>
                                        io.github.qishr.cascara.common.diagnostic.exception.LocalizableSecurityException<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)

Direct Known Subtypes:<br/>
    [TrustStoreException](../../../../../../../io/github/qishr/cascara/common/security/diagnostic/TrustStoreException.md), [SignatureException](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureException.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __LocalizableSecurityException__<br/>extends [SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizableSecurityException([LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           |             |
| LocalizableSecurityException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                         | Method                                            | Description |
|---------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------|-------------|
| public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) | [getLocalizableMessage](#getlocalizablemessage)() |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                     | [getDetails](#getdetails)()                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                       | [getLocalizedMessage](#getlocalizedmessage)()     |             |



## Method Details

### getLocalizableMessage

<span style="font-family: monospace; font-size: 80%;">public [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) __getLocalizableMessage__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>



**Specified By:**

[LocalizableException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableException.md)

**Overrides:**

[SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html#getlocalizedmessage)


---

