Package [io.github.qishr.cascara.common.security.diagnostic](index.md)

# Class UnsupportedAlgorithmException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [java.lang.SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)<br/>
                                        [io.github.qishr.cascara.common.diagnostic.exception.LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableSecurityException.md)<br/>
                                                [io.github.qishr.cascara.common.security.policy.SignatureException](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureException.md)<br/>
                                                        io.github.qishr.cascara.common.security.diagnostic.UnsupportedAlgorithmException<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __UnsupportedAlgorithmException__<br/>extends [SignatureException](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| UnsupportedAlgorithmException([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) algorithm)                                                                                                           |             |
| UnsupportedAlgorithmException([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) algorithm) |             |


### Methods inherited from [SignatureException](../../../../../../../io/github/qishr/cascara/common/security/policy/SignatureException.md)

getSignatureStatus

### Methods inherited from [LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableSecurityException.md)

getLocalizableMessage, getLocalizedMessage, getDetails

