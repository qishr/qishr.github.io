Package [io.github.qishr.cascara.lang.yaml.exception](index.md)

# Enum YamlDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.lang.yaml.exception.YamlDiagnosticCode](YamlDiagnosticCode.md)><br/>
                io.github.qishr.cascara.lang.yaml.exception.YamlDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __YamlDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[YamlDiagnosticCode](YamlDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                                           | Description |
|-------------------------------------------------------------------------|-------------|
| [TAB_NOT_ALLOWED](#tab_not_allowed)                                     |             |
| [EXPECTED_COMMA_OR_CLOSE_BRACE](#expected_comma_or_close_brace)         |             |
| [EXPECTED_SCALAR](#expected_scalar)                                     |             |
| [EXPECTED_MAP_KEY](#expected_map_key)                                   |             |
| [EXPECTED_OPEN_BRACE_FLOW_MAP](#expected_open_brace_flow_map)           |             |
| [EXPECTED_CLOSE_BRACKET](#expected_close_bracket)                       |             |
| [EXPECTED_OPEN_BRACKET](#expected_open_bracket)                         |             |
| [EXPECTED_COLON_MAP_KEY](#expected_colon_map_key)                       |             |
| [EXPECTED_COLON_FLOW_MAP](#expected_colon_flow_map)                     |             |
| [UNEXPECTED_TOKEN](#unexpected_token)                                   |             |
| [UNEXPECTED_CLOSE_BRACKET](#unexpected_close_bracket)                   |             |
| [UNEXPECTED_CLOSE_BRACE](#unexpected_close_brace)                       |             |
| [INCONSISTENT_INDENTATION](#inconsistent_indentation)                   |             |
| [EXPECTED_INDENTATION_BLOCK_SCALAR](#expected_indentation_block_scalar) |             |
| [EXPECTED_DEDENT_BLOCK_COMMENT](#expected_dedent_block_comment)         |             |
| [DUPLICATE_KEY](#duplicate_key)                                         |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [YamlDiagnosticCode](YamlDiagnosticCode.md)[]                                         | [values](#values)()                                                                                                    |             |
| public static [YamlDiagnosticCode](YamlDiagnosticCode.md)                                           | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### TAB_NOT_ALLOWED

public static final  TAB_NOT_ALLOWED




---

### EXPECTED_COMMA_OR_CLOSE_BRACE

public static final  EXPECTED_COMMA_OR_CLOSE_BRACE




---

### EXPECTED_SCALAR

public static final  EXPECTED_SCALAR




---

### EXPECTED_MAP_KEY

public static final  EXPECTED_MAP_KEY




---

### EXPECTED_OPEN_BRACE_FLOW_MAP

public static final  EXPECTED_OPEN_BRACE_FLOW_MAP




---

### EXPECTED_CLOSE_BRACKET

public static final  EXPECTED_CLOSE_BRACKET




---

### EXPECTED_OPEN_BRACKET

public static final  EXPECTED_OPEN_BRACKET




---

### EXPECTED_COLON_MAP_KEY

public static final  EXPECTED_COLON_MAP_KEY




---

### EXPECTED_COLON_FLOW_MAP

public static final  EXPECTED_COLON_FLOW_MAP




---

### UNEXPECTED_TOKEN

public static final  UNEXPECTED_TOKEN




---

### UNEXPECTED_CLOSE_BRACKET

public static final  UNEXPECTED_CLOSE_BRACKET




---

### UNEXPECTED_CLOSE_BRACE

public static final  UNEXPECTED_CLOSE_BRACE




---

### INCONSISTENT_INDENTATION

public static final  INCONSISTENT_INDENTATION




---

### EXPECTED_INDENTATION_BLOCK_SCALAR

public static final  EXPECTED_INDENTATION_BLOCK_SCALAR




---

### EXPECTED_DEDENT_BLOCK_COMMENT

public static final  EXPECTED_DEDENT_BLOCK_COMMENT




---

### DUPLICATE_KEY

public static final  DUPLICATE_KEY




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [YamlDiagnosticCode](YamlDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [YamlDiagnosticCode](YamlDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>



**Specified By:**

[DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md)


---

