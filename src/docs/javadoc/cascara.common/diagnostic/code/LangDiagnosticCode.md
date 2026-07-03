Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Enum LangDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.code.LangDiagnosticCode](LangDiagnosticCode.md)><br/>
                io.github.qishr.cascara.common.diagnostic.code.LangDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __LangDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[LangDiagnosticCode](LangDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                               | Description |
|-------------------------------------------------------------|-------------|
| [EXPECTED_STREAM_START](#expected_stream_start)             |             |
| [EXPECTED_STREAM_END](#expected_stream_end)                 |             |
| [UNEXPECTED_STREAM_END](#unexpected_stream_end)             |             |
| [FAILED_TO_MAP_TYPE](#failed_to_map_type)                   |             |
| [FAILED_TO_MAP_AST](#failed_to_map_ast)                     |             |
| [CLASS_NOT_SERIALIZABLE](#class_not_serializable)           |             |
| [FIELD_NOT_ACCESSIBLE](#field_not_accessible)               |             |
| [NO_SUCH_METHOD](#no_such_method)                           |             |
| [INVOCATION_TARGET_EXCEPTION](#invocation_target_exception) |             |
| [ILLEGAL_ARGUMENT_EXCEPTION](#illegal_argument_exception)   |             |
| [INSTANTIATION_EXCEPTION](#instantiation_exception)         |             |
| [EXPECTED_MAP_STRUCTURE](#expected_map_structure)           |             |
| [FAILED_SERIALIZE](#failed_serialize)                       |             |
| [FAILED_DESERIALIZE](#failed_deserialize)                   |             |
| [INCOMPATIBLE_TYPES](#incompatible_types)                   |             |
| [FAILED_DESERIALIZE_SCALAR](#failed_deserialize_scalar)     |             |
| [UNSUPPORTED_TYPE](#unsupported_type)                       |             |
| [EXPECTED_SEQUENCE](#expected_sequence)                     |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [LangDiagnosticCode](LangDiagnosticCode.md)[]                                         | [values](#values)()                                                                                                    |             |
| public static [LangDiagnosticCode](LangDiagnosticCode.md)                                           | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



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

### FAILED_TO_MAP_TYPE

public static final  FAILED_TO_MAP_TYPE




---

### FAILED_TO_MAP_AST

public static final  FAILED_TO_MAP_AST




---

### CLASS_NOT_SERIALIZABLE

public static final  CLASS_NOT_SERIALIZABLE




---

### FIELD_NOT_ACCESSIBLE

public static final  FIELD_NOT_ACCESSIBLE




---

### NO_SUCH_METHOD

public static final  NO_SUCH_METHOD




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

### EXPECTED_MAP_STRUCTURE

public static final  EXPECTED_MAP_STRUCTURE




---

### FAILED_SERIALIZE

public static final  FAILED_SERIALIZE




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

<span style="font-family: monospace; font-size: 80%;">public static [LangDiagnosticCode](LangDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [LangDiagnosticCode](LangDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticCode](DiagnosticCode.md)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>



**Specified By:**

[DiagnosticCode](DiagnosticCode.md)


---

