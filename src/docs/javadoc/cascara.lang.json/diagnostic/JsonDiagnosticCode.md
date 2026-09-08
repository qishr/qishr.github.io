Package [io.github.qishr.cascara.lang.json.diagnostic](index.md)

# Enum JsonDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.lang.json.diagnostic.JsonDiagnosticCode](JsonDiagnosticCode.md)><br/>
                io.github.qishr.cascara.lang.json.diagnostic.JsonDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](../cascara.common/code/DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __JsonDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[JsonDiagnosticCode](JsonDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                                         | Description |
|-----------------------------------------------------------------------|-------------|
| [EXPECTED_CLOSE_BRACE](#expected_close_brace)                         |             |
| [EXPECTED_EOS](#expected_eos)                                         |             |
| [EXPECTED_SCALAR](#expected_scalar)                                   |             |
| [EXPECTED_COLON_FLOW_MAP](#expected_colon_flow_map)                   |             |
| [EXPECTED_OPEN_BRACE](#expected_open_brace)                           |             |
| [EXPECTED_CLOSE_BRACKET](#expected_close_bracket)                     |             |
| [EXPECTED_OPEN_BRACKET](#expected_open_bracket)                       |             |
| [EXPECTED_COLON_AFTER_MAP_KEY](#expected_colon_after_map_key)         |             |
| [INVALID_NUMBER](#invalid_number)                                     |             |
| [UNEXPECTED_UNQUOTED_STRING_VALUE](#unexpected_unquoted_string_value) |             |
| [MISSING_INTEGER_PART](#missing_integer_part)                         |             |
| [MISSING_FRACTIONAL_PART](#missing_fractional_part)                   |             |
| [MISSING_EXPONENT](#missing_exponent)                                 |             |
| [MISSING_EXPONENT_DIGITS](#missing_exponent_digits)                   |             |
| [NOT_ALLOWED_SINGLE_QUOTED_STRING](#not_allowed_single_quoted_string) |             |
| [NOT_ALLOWED_LEADING_PLUS](#not_allowed_leading_plus)                 |             |
| [NOT_ALLOWED_LEADING_ZERO](#not_allowed_leading_zero)                 |             |
| [NOT_ALLOWED_TRAILING_DOT](#not_allowed_trailing_dot)                 |             |
| [EXPECTED_MAP_KEY](#expected_map_key)                                 |             |
| [UNEXPECTED_CHARACTER](#unexpected_character)                         |             |
| [UNTERMINATED_STRING](#unterminated_string)                           |             |
| [DEPTH_LIMIT](#depth_limit)                                           |             |
| [UNEXPECTED_TOKEN](#unexpected_token)                                 |             |
| [DUPLICATE_KEY](#duplicate_key)                                       |             |
| [FAILED_TO_MAP_TYPE](#failed_to_map_type)                             |             |
| [FAILED_TO_MAP_AST](#failed_to_map_ast)                               |             |
| [CLASS_NOT_SERIALIZABLE](#class_not_serializable)                     |             |
| [EXPECTED_MAP_STRUCTURE](#expected_map_structure)                     |             |
| [NO_SUCH_METHOD](#no_such_method)                                     |             |
| [FAILED_DESERIALIZE](#failed_deserialize)                             |             |
| [INCOMPATIBLE_TYPES](#incompatible_types)                             |             |
| [FAILED_DESERIALIZE_SCALAR](#failed_deserialize_scalar)               |             |
| [UNSUPPORTED_TYPE](#unsupported_type)                                 |             |
| [EXPECTED_SEQUENCE](#expected_sequence)                               |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [JsonDiagnosticCode](JsonDiagnosticCode.md)[]                                         | [values](#values)()                                                                                                    |             |
| public static [JsonDiagnosticCode](JsonDiagnosticCode.md)                                           | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### EXPECTED_CLOSE_BRACE

public static final  EXPECTED_CLOSE_BRACE




---

### EXPECTED_EOS

public static final  EXPECTED_EOS




---

### EXPECTED_SCALAR

public static final  EXPECTED_SCALAR




---

### EXPECTED_COLON_FLOW_MAP

public static final  EXPECTED_COLON_FLOW_MAP




---

### EXPECTED_OPEN_BRACE

public static final  EXPECTED_OPEN_BRACE




---

### EXPECTED_CLOSE_BRACKET

public static final  EXPECTED_CLOSE_BRACKET




---

### EXPECTED_OPEN_BRACKET

public static final  EXPECTED_OPEN_BRACKET




---

### EXPECTED_COLON_AFTER_MAP_KEY

public static final  EXPECTED_COLON_AFTER_MAP_KEY




---

### INVALID_NUMBER

public static final  INVALID_NUMBER




---

### UNEXPECTED_UNQUOTED_STRING_VALUE

public static final  UNEXPECTED_UNQUOTED_STRING_VALUE




---

### MISSING_INTEGER_PART

public static final  MISSING_INTEGER_PART




---

### MISSING_FRACTIONAL_PART

public static final  MISSING_FRACTIONAL_PART




---

### MISSING_EXPONENT

public static final  MISSING_EXPONENT




---

### MISSING_EXPONENT_DIGITS

public static final  MISSING_EXPONENT_DIGITS




---

### NOT_ALLOWED_SINGLE_QUOTED_STRING

public static final  NOT_ALLOWED_SINGLE_QUOTED_STRING




---

### NOT_ALLOWED_LEADING_PLUS

public static final  NOT_ALLOWED_LEADING_PLUS




---

### NOT_ALLOWED_LEADING_ZERO

public static final  NOT_ALLOWED_LEADING_ZERO




---

### NOT_ALLOWED_TRAILING_DOT

public static final  NOT_ALLOWED_TRAILING_DOT




---

### EXPECTED_MAP_KEY

public static final  EXPECTED_MAP_KEY




---

### UNEXPECTED_CHARACTER

public static final  UNEXPECTED_CHARACTER




---

### UNTERMINATED_STRING

public static final  UNTERMINATED_STRING




---

### DEPTH_LIMIT

public static final  DEPTH_LIMIT




---

### UNEXPECTED_TOKEN

public static final  UNEXPECTED_TOKEN




---

### DUPLICATE_KEY

public static final  DUPLICATE_KEY




---

### FAILED_TO_MAP_TYPE

public static final  FAILED_TO_MAP_TYPE




---

### FAILED_TO_MAP_AST

public static final  FAILED_TO_MAP_AST




---

### CLASS_NOT_SERIALIZABLE

public static final  CLASS_NOT_SERIALIZABLE




---

### EXPECTED_MAP_STRUCTURE

public static final  EXPECTED_MAP_STRUCTURE




---

### NO_SUCH_METHOD

public static final  NO_SUCH_METHOD




---

### FAILED_DESERIALIZE

public static final  FAILED_DESERIALIZE




---

### INCOMPATIBLE_TYPES

public static final  INCOMPATIBLE_TYPES




---

### FAILED_DESERIALIZE_SCALAR

public static final  FAILED_DESERIALIZE_SCALAR




---

### UNSUPPORTED_TYPE

public static final  UNSUPPORTED_TYPE




---

### EXPECTED_SEQUENCE

public static final  EXPECTED_SEQUENCE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [JsonDiagnosticCode](JsonDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [JsonDiagnosticCode](JsonDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticCode](../cascara.common/code/DiagnosticCode.md)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>



**Specified By:**

[DiagnosticCode](../cascara.common/code/DiagnosticCode.md)


---

