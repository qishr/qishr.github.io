Package [io.github.qishr.cascara.common.lang.diagnostic](index.md)

# Enum LangMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.lang.diagnostic.LangMessage](LangMessage.md)><br/>
                io.github.qishr.cascara.common.lang.diagnostic.LangMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __LangMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[LangMessage](LangMessage.md)>
</span>


##Enum Constants

| Enum Constant                                                                       | Description |
|-------------------------------------------------------------------------------------|-------------|
| [EXPECTED_STREAM_START](#expected_stream_start)                                     |             |
| [EXPECTED_STREAM_END](#expected_stream_end)                                         |             |
| [UNEXPECTED_STREAM_END](#unexpected_stream_end)                                     |             |
| [UNKNOWN_NODE_TYPE](#unknown_node_type)                                             |             |
| [FAILED_TO_MAP_TYPE](#failed_to_map_type)                                           |             |
| [FAILED_TO_MAP_AST](#failed_to_map_ast)                                             |             |
| [EXPECTED_MAP_STRUCTURE](#expected_map_structure)                                   |             |
| [FAILED_SERIALIZE](#failed_serialize)                                               |             |
| [FAILED_DESERIALIZE](#failed_deserialize)                                           |             |
| [WRONG_FORMAT](#wrong_format)                                                       |             |
| [INCOMPATIBLE_TYPES](#incompatible_types)                                           |             |
| [FAILED_DESERIALIZE_SCALAR](#failed_deserialize_scalar)                             |             |
| [FAILED_DESERIALIZE_SCALAR_TO_NON_SCALAR](#failed_deserialize_scalar_to_non_scalar) |             |
| [UNSUPPORTED_TYPE](#unsupported_type)                                               |             |
| [EXPECTED_SEQUENCE](#expected_sequence)                                             |             |
| [EXPECTED_SCALAR](#expected_scalar)                                                 |             |
| [FIELD_NOT_ACCESSIBLE_REASON](#field_not_accessible_reason)                         |             |
| [CLASS_NOT_SERIALIZABLE](#class_not_serializable)                                   |             |
| [NO_SUCH_METHOD](#no_such_method)                                                   |             |
| [NO_SUCH_CONSTRUCTOR](#no_such_constructor)                                         |             |
| [FIELD_NOT_ACCESSIBLE](#field_not_accessible)                                       |             |
| [INVOCATION_TARGET_EXCEPTION](#invocation_target_exception)                         |             |
| [ILLEGAL_ARGUMENT_EXCEPTION](#illegal_argument_exception)                           |             |
| [INSTANTIATION_EXCEPTION](#instantiation_exception)                                 |             |
| [EXCEPTION_IN_INITIALIZER](#exception_in_initializer)                               |             |
| [ABSTRACT_METHOD_ERROR](#abstract_method_error)                                     |             |
| [NO_CLASS_DEF_FOUND_ERROR](#no_class_def_found_error)                               |             |
| [SERVICE_CONFIG_ERROR](#service_config_error)                                       |             |
| [SECURITY_EXCEPTION](#security_exception)                                           |             |
| [ILLEGAL_ACCESS_EXCEPTION](#illegal_access_exception)                               |             |
| [UNKNOWN_GENERIC_TYPE](#unknown_generic_type)                                       |             |
| [NOT_ARRAY_OR_OBJECT](#not_array_or_object)                                         |             |
| [OUT_OF_BOUNDS](#out_of_bounds)                                                     |             |
| [ERROR_READING_VALUE_AT](#error_reading_value_at)                                   |             |
| [NOT_AN_ARRAY_INDEX](#not_an_array_index)                                           |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [LangMessage](LangMessage.md)[]                                                       | [values](#values)()                                                                                                    |             |
| public static [LangMessage](LangMessage.md)                                                         | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### EXPECTED_STREAM_START

public static final  EXPECTED_STREAM_START




---

### EXPECTED_STREAM_END

public static final  EXPECTED_STREAM_END




---

### UNEXPECTED_STREAM_END

public static final  UNEXPECTED_STREAM_END




---

### UNKNOWN_NODE_TYPE

public static final  UNKNOWN_NODE_TYPE




---

### FAILED_TO_MAP_TYPE

public static final  FAILED_TO_MAP_TYPE




---

### FAILED_TO_MAP_AST

public static final  FAILED_TO_MAP_AST




---

### EXPECTED_MAP_STRUCTURE

public static final  EXPECTED_MAP_STRUCTURE




---

### FAILED_SERIALIZE

public static final  FAILED_SERIALIZE




---

### FAILED_DESERIALIZE

public static final  FAILED_DESERIALIZE




---

### WRONG_FORMAT

public static final  WRONG_FORMAT




---

### INCOMPATIBLE_TYPES

public static final  INCOMPATIBLE_TYPES




---

### FAILED_DESERIALIZE_SCALAR

public static final  FAILED_DESERIALIZE_SCALAR




---

### FAILED_DESERIALIZE_SCALAR_TO_NON_SCALAR

public static final  FAILED_DESERIALIZE_SCALAR_TO_NON_SCALAR




---

### UNSUPPORTED_TYPE

public static final  UNSUPPORTED_TYPE




---

### EXPECTED_SEQUENCE

public static final  EXPECTED_SEQUENCE




---

### EXPECTED_SCALAR

public static final  EXPECTED_SCALAR




---

### FIELD_NOT_ACCESSIBLE_REASON

public static final  FIELD_NOT_ACCESSIBLE_REASON




---

### CLASS_NOT_SERIALIZABLE

public static final  CLASS_NOT_SERIALIZABLE




---

### NO_SUCH_METHOD

public static final  NO_SUCH_METHOD




---

### NO_SUCH_CONSTRUCTOR

public static final  NO_SUCH_CONSTRUCTOR




---

### FIELD_NOT_ACCESSIBLE

public static final  FIELD_NOT_ACCESSIBLE




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

### NO_CLASS_DEF_FOUND_ERROR

public static final  NO_CLASS_DEF_FOUND_ERROR




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

### UNKNOWN_GENERIC_TYPE

public static final  UNKNOWN_GENERIC_TYPE




---

### NOT_ARRAY_OR_OBJECT

public static final  NOT_ARRAY_OR_OBJECT




---

### OUT_OF_BOUNDS

public static final  OUT_OF_BOUNDS




---

### ERROR_READING_VALUE_AT

public static final  ERROR_READING_VALUE_AT




---

### NOT_AN_ARRAY_INDEX

public static final  NOT_AN_ARRAY_INDEX




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [LangMessage](LangMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [LangMessage](LangMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[DiagnosticMessage](../../diagnostic/message/DiagnosticMessage.md)


---

