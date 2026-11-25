Package [io.github.qishr.cascara.common.security.exception](index.md)

# Class InvalidKeyException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [java.lang.SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)<br/>
                                        [io.github.qishr.cascara.common.i18n.exception.LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableSecurityException.md)<br/>
                                                [io.github.qishr.cascara.common.security.exception.SignatureException](../../../../../../../io/github/qishr/cascara/common/security/exception/SignatureException.md)<br/>
                                                        io.github.qishr.cascara.common.security.exception.InvalidKeyException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __InvalidKeyException__<br/>extends [SignatureException](../../../../../../../io/github/qishr/cascara/common/security/exception/SignatureException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                     | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| InvalidKeyException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                           |             |
| InvalidKeyException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key) |             |


### Methods inherited from [LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableSecurityException.md)

getLocalizableMessage, getLocalizedMessage, getMessage, getDetails

### Methods inherited from [SignatureException](../../../../../../../io/github/qishr/cascara/common/security/exception/SignatureException.md)

getSignatureStatus

