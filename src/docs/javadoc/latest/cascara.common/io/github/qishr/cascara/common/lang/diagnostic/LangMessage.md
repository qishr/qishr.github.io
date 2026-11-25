Package [io.github.qishr.cascara.common.lang.diagnostic](index.md)

# Enum LangMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.lang.diagnostic.LangMessage](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/LangMessage.md)><br/>
                io.github.qishr.cascara.common.lang.diagnostic.LangMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


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
| [FAILED_TO_MAP_TYPE_REASON](#failed_to_map_type_reason)                                         |             |
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
| [AMBIGUOUS_TARGET_TYPE](#ambiguous_target_type)                                                 |             |
| [NON_SCALAR_KEY](#non_scalar_key)                                                               |             |
| [NON_STRING_KEY](#non_string_key)                                                               |             |
| [AST_FACTORY_FAIL_SCALAR](#ast_factory_fail_scalar)                                             |             |
| [AST_FACTORY_FAIL_MAP](#ast_factory_fail_map)                                                   |             |
| [AST_FACTORY_FAIL_SEQUENCE](#ast_factory_fail_sequence)                                         |             |
| [AST_FACTORY_FAIL_KEY](#ast_factory_fail_key)                                                   |             |
| [CONCURRENT_USE](#concurrent_use)                                                               |             |
| [FIELD_NOT_ACCESSIBLE](#field_not_accessible)                                                   |             |
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

### FAILED_TO_MAP_TYPE_REASON

public static final  FAILED_TO_MAP_TYPE_REASON




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

### AMBIGUOUS_TARGET_TYPE

public static final  AMBIGUOUS_TARGET_TYPE




---

### NON_SCALAR_KEY

public static final  NON_SCALAR_KEY




---

### NON_STRING_KEY

public static final  NON_STRING_KEY




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

### CONCURRENT_USE

public static final  CONCURRENT_USE




---

### FIELD_NOT_ACCESSIBLE

public static final  FIELD_NOT_ACCESSIBLE




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

[LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


---

