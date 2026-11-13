Package [io.github.qishr.cascara.common.security.diagnostic](index.md)

# Enum SecurityMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.security.diagnostic.SecurityMessage](../../../../../../../io/github/qishr/cascara/common/security/diagnostic/SecurityMessage.md)><br/>
                io.github.qishr.cascara.common.security.diagnostic.SecurityMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __SecurityMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[SecurityMessage](../../../../../../../io/github/qishr/cascara/common/security/diagnostic/SecurityMessage.md)>
</span>


##Enum Constants

| Enum Constant                                               | Description |
|-------------------------------------------------------------|-------------|
| [NO_ALGORITHM](#no_algorithm)                               |             |
| [UNSUPPORTED_ALGORITHM](#unsupported_algorithm)             |             |
| [UNSUPPORTED_DIGEST](#unsupported_digest)                   |             |
| [INVALID_KEY](#invalid_key)                                 |             |
| [EMPTY_CERT_CHAIN](#empty_cert_chain)                       |             |
| [EMPTY_TRUST_STORE](#empty_trust_store)                     |             |
| [CERT_PATH_VALIDATION_FAILED](#cert_path_validation_failed) |             |
| [ERROR_READING_MANIFEST](#error_reading_manifest)           |             |
| [NOT_A_SIGNED_ENTRY](#not_a_signed_entry)                   |             |
| [INCORRECT_DIGEST](#incorrect_digest)                       |             |
| [INCOMPLETE_SETUP](#incomplete_setup)                       |             |
| [MISSING_ATTRIBUTES](#missing_attributes)                   |             |
| [MISSING_DIGEST](#missing_digest)                           |             |
| [MISSING_KEY_FILE](#missing_key_file)                       |             |
| [EXTRA_KEY_FILE](#extra_key_file)                           |             |



## Method Summary

| Modifier and Type                                                                                                             | Method                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [SecurityMessage](../../../../../../../io/github/qishr/cascara/common/security/diagnostic/SecurityMessage.md)[] | [values](#values)()                                                                                                    |             |
| public static [SecurityMessage](../../../../../../../io/github/qishr/cascara/common/security/diagnostic/SecurityMessage.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                           | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                           | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### NO_ALGORITHM

public static final  NO_ALGORITHM




---

### UNSUPPORTED_ALGORITHM

public static final  UNSUPPORTED_ALGORITHM




---

### UNSUPPORTED_DIGEST

public static final  UNSUPPORTED_DIGEST




---

### INVALID_KEY

public static final  INVALID_KEY




---

### EMPTY_CERT_CHAIN

public static final  EMPTY_CERT_CHAIN




---

### EMPTY_TRUST_STORE

public static final  EMPTY_TRUST_STORE




---

### CERT_PATH_VALIDATION_FAILED

public static final  CERT_PATH_VALIDATION_FAILED




---

### ERROR_READING_MANIFEST

public static final  ERROR_READING_MANIFEST




---

### NOT_A_SIGNED_ENTRY

public static final  NOT_A_SIGNED_ENTRY




---

### INCORRECT_DIGEST

public static final  INCORRECT_DIGEST




---

### INCOMPLETE_SETUP

public static final  INCOMPLETE_SETUP




---

### MISSING_ATTRIBUTES

public static final  MISSING_ATTRIBUTES




---

### MISSING_DIGEST

public static final  MISSING_DIGEST




---

### MISSING_KEY_FILE

public static final  MISSING_KEY_FILE




---

### EXTRA_KEY_FILE

public static final  EXTRA_KEY_FILE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [SecurityMessage](../../../../../../../io/github/qishr/cascara/common/security/diagnostic/SecurityMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [SecurityMessage](../../../../../../../io/github/qishr/cascara/common/security/diagnostic/SecurityMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)


---

