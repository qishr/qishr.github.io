Package [io.github.qishr.cascara.common.lang.diagnostic](index.md)

# Enum LangMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.lang.diagnostic.LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md)><br/>
                io.github.qishr.cascara.common.lang.diagnostic.LangMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __LangMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md)>
</span>


##Enum Constants

| Enum Constant                                                                                   | Description |
|-------------------------------------------------------------------------------------------------|-------------|
| [EXPECTED_STREAM_START](#expected_stream_start)                                                 |             |
| [EXPECTED_STREAM_END](#expected_stream_end)                                                     |             |
| [UNEXPECTED_STREAM_END](#unexpected_stream_end)                                                 |             |
| [UNKNOWN_NODE_TYPE](#unknown_node_type)                                                         |             |
| [FAILED_TO_MAP_TYPE](#failed_to_map_type)                                                       |             |
| [FAILED_TO_MAP_AST](#failed_to_map_ast)                                                         |             |
| [EXPECTED_MAP_STRUCTURE](#expected_map_structure)                                               |             |
| [FAILED_SERIALIZE](#failed_serialize)                                                           |             |
| [FAILED_DESERIALIZE](#failed_deserialize)                                                       |             |
| [WRONG_FORMAT](#wrong_format)                                                                   |             |
| [INCOMPATIBLE_TYPES](#incompatible_types)                                                       |             |
| [FAILED_DESERIALIZE_SCALAR](#failed_deserialize_scalar)                                         |             |
| [FAILED_DESERIALIZE_SCALAR_TO_NON_SCALAR](#failed_deserialize_scalar_to_non_scalar)             |             |
| [FAILED_DESERIALIZE_SCALAR_TO_NON_SCALAR_NAMED](#failed_deserialize_scalar_to_non_scalar_named) |             |
| [UNSUPPORTED_TYPE](#unsupported_type)                                                           |             |
| [EXPECTED_SEQUENCE](#expected_sequence)                                                         |             |
| [EXPECTED_SCALAR](#expected_scalar)                                                             |             |
| [EXPECTED_SCALAR_NAMED](#expected_scalar_named)                                                 |             |
| [FIELD_NOT_ACCESSIBLE_REASON](#field_not_accessible_reason)                                     |             |
| [AMBIGUOUS_POLYMORPHIC](#ambiguous_polymorphic)                                                 |             |
| [NON_SCALAR_KEY](#non_scalar_key)                                                               |             |
| [AST_FACTORY_FAIL_SCALAR](#ast_factory_fail_scalar)                                             |             |
| [AST_FACTORY_FAIL_MAP](#ast_factory_fail_map)                                                   |             |
| [AST_FACTORY_FAIL_SEQUENCE](#ast_factory_fail_sequence)                                         |             |
| [AST_FACTORY_FAIL_KEY](#ast_factory_fail_key)                                                   |             |
| [CLASS_NOT_SERIALIZABLE](#class_not_serializable)                                               |             |
| [NO_SUCH_METHOD](#no_such_method)                                                               |             |
| [NO_SUCH_CONSTRUCTOR](#no_such_constructor)                                                     |             |
| [FIELD_NOT_ACCESSIBLE](#field_not_accessible)                                                   |             |
| [INVOCATION_TARGET_EXCEPTION](#invocation_target_exception)                                     |             |
| [ILLEGAL_ARGUMENT_EXCEPTION](#illegal_argument_exception)                                       |             |
| [INSTANTIATION_EXCEPTION](#instantiation_exception)                                             |             |
| [EXCEPTION_IN_INITIALIZER](#exception_in_initializer)                                           |             |
| [ABSTRACT_METHOD_ERROR](#abstract_method_error)                                                 |             |
| [NO_CLASS_DEF_FOUND_ERROR](#no_class_def_found_error)                                           |             |
| [SERVICE_CONFIG_ERROR](#service_config_error)                                                   |             |
| [SECURITY_EXCEPTION](#security_exception)                                                       |             |
| [ILLEGAL_ACCESS_EXCEPTION](#illegal_access_exception)                                           |             |
| [CLASS_CAST_EXCEPTION](#class_cast_exception)                                                   |             |
| [UNKNOWN_GENERIC_TYPE](#unknown_generic_type)                                                   |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md)[] | [values](#values)()                                                                                                    |             |
| public static [LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [getFormat](#getformat)()                                                                                              |             |



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

### FAILED_DESERIALIZE_SCALAR_TO_NON_SCALAR_NAMED

public static final  FAILED_DESERIALIZE_SCALAR_TO_NON_SCALAR_NAMED




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

### EXPECTED_SCALAR_NAMED

public static final  EXPECTED_SCALAR_NAMED




---

### FIELD_NOT_ACCESSIBLE_REASON

public static final  FIELD_NOT_ACCESSIBLE_REASON




---

### AMBIGUOUS_POLYMORPHIC

public static final  AMBIGUOUS_POLYMORPHIC




---

### NON_SCALAR_KEY

public static final  NON_SCALAR_KEY




---

### AST_FACTORY_FAIL_SCALAR

public static final  AST_FACTORY_FAIL_SCALAR




---

### AST_FACTORY_FAIL_MAP

public static final  AST_FACTORY_FAIL_MAP




---

### AST_FACTORY_FAIL_SEQUENCE

public static final  AST_FACTORY_FAIL_SEQUENCE




---

### AST_FACTORY_FAIL_KEY

public static final  AST_FACTORY_FAIL_KEY




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

### CLASS_CAST_EXCEPTION

public static final  CLASS_CAST_EXCEPTION




---

### UNKNOWN_GENERIC_TYPE

public static final  UNKNOWN_GENERIC_TYPE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


---

