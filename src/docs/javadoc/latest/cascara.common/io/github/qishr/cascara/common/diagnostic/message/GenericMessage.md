Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Enum GenericMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.message.GenericMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/GenericMessage.md)><br/>
                io.github.qishr.cascara.common.diagnostic.message.GenericMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __GenericMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[GenericMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/GenericMessage.md)>
</span>


##Enum Constants

| Enum Constant                                                                   | Description |
|---------------------------------------------------------------------------------|-------------|
| [INFO](#info)                                                                   |             |
| [WARN](#warn)                                                                   |             |
| [ERROR](#error)                                                                 |             |
| [UNIMPLEMENTED_METHOD](#unimplemented_method)                                   |             |
| [UNEXPECTED_NULL_VALUE](#unexpected_null_value)                                 |             |
| [UNEXPECTED_NULL_RETURN](#unexpected_null_return)                               |             |
| [MANIFEST_NOT_FOUND](#manifest_not_found)                                       |             |
| [MANIFEST_READ](#manifest_read)                                                 |             |
| [MANIFEST_PARSE](#manifest_parse)                                               |             |
| [RESOURCE_INACCESSIBLE](#resource_inaccessible)                                 |             |
| [STREAM_READ_ERROR](#stream_read_error)                                         |             |
| [CONFIG_LOAD_FAILED](#config_load_failed)                                       |             |
| [CONFIG_FS_ALREADY_SET](#config_fs_already_set)                                 |             |
| [CASCARA_CONFIG_ALREADY_INIT](#cascara_config_already_init)                     |             |
| [EXCEPTION](#exception)                                                         |             |
| [RUNTIME_EXCEPTION](#runtime_exception)                                         |             |
| [NPE](#npe)                                                                     |             |
| [CLASS_NOT_FOUND](#class_not_found)                                             |             |
| [JRE_CLASS_CAST_EXCEPTION](#jre_class_cast_exception)                           |             |
| [CLASS_CAST_EXCEPTION](#class_cast_exception)                                   |             |
| [NO_SUCH_METHOD](#no_such_method)                                               |             |
| [NO_SUCH_CONSTRUCTOR](#no_such_constructor)                                     |             |
| [INVOCATION_TARGET_EXCEPTION](#invocation_target_exception)                     |             |
| [ILLEGAL_ARGUMENT_EXCEPTION](#illegal_argument_exception)                       |             |
| [INSTANTIATION_EXCEPTION](#instantiation_exception)                             |             |
| [EXCEPTION_IN_INITIALIZER](#exception_in_initializer)                           |             |
| [ABSTRACT_METHOD_ERROR](#abstract_method_error)                                 |             |
| [SERVICE_CONFIG_ERROR](#service_config_error)                                   |             |
| [SECURITY_EXCEPTION](#security_exception)                                       |             |
| [ILLEGAL_ACCESS_EXCEPTION](#illegal_access_exception)                           |             |
| [INACCESSIBLE_OBJECT_EXCEPTION](#inaccessible_object_exception)                 |             |
| [INCONSISTENT_STATE](#inconsistent_state)                                       |             |
| [UNSUPPORTED_OPERATION](#unsupported_operation)                                 |             |
| [UNSATISFIED_LINK_ERROR](#unsatisfied_link_error)                               |             |
| [INTERNAL_ERROR](#internal_error)                                               |             |
| [REFLECTIVE_OPERATION_EXCEPTION](#reflective_operation_exception)               |             |
| [NUMBER_FORMAT_EXCEPTION](#number_format_exception)                             |             |
| [CERTIFICATE_EXCEPTION](#certificate_exception)                                 |             |
| [INVALID_ALGORITHM_PARAMETER_EXCEPTION](#invalid_algorithm_parameter_exception) |             |
| [NO_SUCH_ALGORITHM_EXCEPTION](#no_such_algorithm_exception)                     |             |
| [IO_ERROR](#io_error)                                                           |             |
| [INTERRUPT_ERROR](#interrupt_error)                                             |             |
| [FORMAT_ERROR](#format_error)                                                   |             |
| [INVALID_URI](#invalid_uri)                                                     |             |
| [UNKNOWN_URI_SCHEME](#unknown_uri_scheme)                                       |             |
| [MALFORMED_BASE64](#malformed_base64)                                           |             |
| [MESSAGE_FORMATTING_ERROR](#message_formatting_error)                           |             |
| [DIAGNOSTIC_FORMATTING_ERROR](#diagnostic_formatting_error)                     |             |
| [NO_RESOURCE_PROVIDER](#no_resource_provider)                                   |             |
| [CLASS_NOT_SERIALIZABLE](#class_not_serializable)                               |             |



## Method Summary

| Modifier and Type                                                                                                          | Method                                                                                                                 | Description |
|----------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [GenericMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/GenericMessage.md)[] | [values](#values)()                                                                                                    |             |
| public static [GenericMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/GenericMessage.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                        | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                        | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### INFO

public static final  INFO




---

### WARN

public static final  WARN




---

### ERROR

public static final  ERROR




---

### UNIMPLEMENTED_METHOD

public static final  UNIMPLEMENTED_METHOD




---

### UNEXPECTED_NULL_VALUE

public static final  UNEXPECTED_NULL_VALUE




---

### UNEXPECTED_NULL_RETURN

public static final  UNEXPECTED_NULL_RETURN




---

### MANIFEST_NOT_FOUND

public static final  MANIFEST_NOT_FOUND




---

### MANIFEST_READ

public static final  MANIFEST_READ




---

### MANIFEST_PARSE

public static final  MANIFEST_PARSE




---

### RESOURCE_INACCESSIBLE

public static final  RESOURCE_INACCESSIBLE




---

### STREAM_READ_ERROR

public static final  STREAM_READ_ERROR




---

### CONFIG_LOAD_FAILED

public static final  CONFIG_LOAD_FAILED




---

### CONFIG_FS_ALREADY_SET

public static final  CONFIG_FS_ALREADY_SET




---

### CASCARA_CONFIG_ALREADY_INIT

public static final  CASCARA_CONFIG_ALREADY_INIT




---

### EXCEPTION

public static final  EXCEPTION




---

### RUNTIME_EXCEPTION

public static final  RUNTIME_EXCEPTION




---

### NPE

public static final  NPE




---

### CLASS_NOT_FOUND

public static final  CLASS_NOT_FOUND




---

### JRE_CLASS_CAST_EXCEPTION

public static final  JRE_CLASS_CAST_EXCEPTION




---

### CLASS_CAST_EXCEPTION

public static final  CLASS_CAST_EXCEPTION




---

### NO_SUCH_METHOD

public static final  NO_SUCH_METHOD




---

### NO_SUCH_CONSTRUCTOR

public static final  NO_SUCH_CONSTRUCTOR




---

### INVOCATION_TARGET_EXCEPTION

public static final  INVOCATION_TARGET_EXCEPTION




---

### ILLEGAL_ARGUMENT_EXCEPTION

public static final  ILLEGAL_ARGUMENT_EXCEPTION




---

### INSTANTIATION_EXCEPTION

public static final  INSTANTIATION_EXCEPTION




---

### EXCEPTION_IN_INITIALIZER

public static final  EXCEPTION_IN_INITIALIZER




---

### ABSTRACT_METHOD_ERROR

public static final  ABSTRACT_METHOD_ERROR




---

### SERVICE_CONFIG_ERROR

public static final  SERVICE_CONFIG_ERROR




---

### SECURITY_EXCEPTION

public static final  SECURITY_EXCEPTION




---

### ILLEGAL_ACCESS_EXCEPTION

public static final  ILLEGAL_ACCESS_EXCEPTION




---

### INACCESSIBLE_OBJECT_EXCEPTION

public static final  INACCESSIBLE_OBJECT_EXCEPTION




---

### INCONSISTENT_STATE

public static final  INCONSISTENT_STATE




---

### UNSUPPORTED_OPERATION

public static final  UNSUPPORTED_OPERATION




---

### UNSATISFIED_LINK_ERROR

public static final  UNSATISFIED_LINK_ERROR




---

### INTERNAL_ERROR

public static final  INTERNAL_ERROR




---

### REFLECTIVE_OPERATION_EXCEPTION

public static final  REFLECTIVE_OPERATION_EXCEPTION




---

### NUMBER_FORMAT_EXCEPTION

public static final  NUMBER_FORMAT_EXCEPTION




---

### CERTIFICATE_EXCEPTION

public static final  CERTIFICATE_EXCEPTION




---

### INVALID_ALGORITHM_PARAMETER_EXCEPTION

public static final  INVALID_ALGORITHM_PARAMETER_EXCEPTION




---

### NO_SUCH_ALGORITHM_EXCEPTION

public static final  NO_SUCH_ALGORITHM_EXCEPTION




---

### IO_ERROR

public static final  IO_ERROR




---

### INTERRUPT_ERROR

public static final  INTERRUPT_ERROR




---

### FORMAT_ERROR

public static final  FORMAT_ERROR




---

### INVALID_URI

public static final  INVALID_URI




---

### UNKNOWN_URI_SCHEME

public static final  UNKNOWN_URI_SCHEME




---

### MALFORMED_BASE64

public static final  MALFORMED_BASE64




---

### MESSAGE_FORMATTING_ERROR

public static final  MESSAGE_FORMATTING_ERROR




---

### DIAGNOSTIC_FORMATTING_ERROR

public static final  DIAGNOSTIC_FORMATTING_ERROR




---

### NO_RESOURCE_PROVIDER

public static final  NO_RESOURCE_PROVIDER




---

### CLASS_NOT_SERIALIZABLE

public static final  CLASS_NOT_SERIALIZABLE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [GenericMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/GenericMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [GenericMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/GenericMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


---

