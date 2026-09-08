Package [io.github.qishr.cascara.lang.yaml.token](index.md)

# Enum YamlTokenType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.lang.yaml.token.YamlTokenType](YamlTokenType.md)><br/>
                io.github.qishr.cascara.lang.yaml.token.YamlTokenType<br/>
<br/>
All Implemented Interfaces:<br/>
    [TokenType](../../cascara.common/lang/token/TokenType.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __YamlTokenType__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[YamlTokenType](YamlTokenType.md)>
</span>


##Enum Constants

| Enum Constant                                         | Description |
|-------------------------------------------------------|-------------|
| [INDENT](#indent)                                     |             |
| [DEDENT](#dedent)                                     |             |
| [BLOCK_END](#block_end)                               |             |
| [KEY_INDICATOR](#key_indicator)                       |             |
| [VALUE_INDICATOR](#value_indicator)                   |             |
| [COMMA](#comma)                                       |             |
| [SEQUENCE_ENTRY_INDICATOR](#sequence_entry_indicator) |             |
| [MAP_START](#map_start)                               |             |
| [MAP_END](#map_end)                                   |             |
| [SEQUENCE_START](#sequence_start)                     |             |
| [SEQUENCE_END](#sequence_end)                         |             |
| [DIRECTIVE](#directive)                               |             |
| [TAG](#tag)                                           |             |
| [ANCHOR](#anchor)                                     |             |
| [ALIAS](#alias)                                       |             |
| [SCALAR](#scalar)                                     |             |
| [NEWLINE](#newline)                                   |             |
| [COMMENT](#comment)                                   |             |
| [STREAM_START](#stream_start)                         |             |
| [STREAM_END](#stream_end)                             |             |
| [DOCUMENT_START](#document_start)                     |             |
| [DOCUMENT_END](#document_end)                         |             |
| [EOF](#eof)                                           |             |
| [ERROR](#error)                                       |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [YamlTokenType](YamlTokenType.md)[]                                                   | [values](#values)()                                                                                                    |             |
| public static [YamlTokenType](YamlTokenType.md)                                                     | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getId](#getid)()                                                                                                      |             |
| public [TokenCategory](../../cascara.common/lang/token/TokenCategory.md)                            | [getCategory](#getcategory)()                                                                                          |             |



## Enum Constant Details

### INDENT

public static final  INDENT




---

### DEDENT

public static final  DEDENT




---

### BLOCK_END

public static final  BLOCK_END




---

### KEY_INDICATOR

public static final  KEY_INDICATOR




---

### VALUE_INDICATOR

public static final  VALUE_INDICATOR




---

### COMMA

public static final  COMMA




---

### SEQUENCE_ENTRY_INDICATOR

public static final  SEQUENCE_ENTRY_INDICATOR




---

### MAP_START

public static final  MAP_START




---

### MAP_END

public static final  MAP_END




---

### SEQUENCE_START

public static final  SEQUENCE_START




---

### SEQUENCE_END

public static final  SEQUENCE_END




---

### DIRECTIVE

public static final  DIRECTIVE




---

### TAG

public static final  TAG




---

### ANCHOR

public static final  ANCHOR




---

### ALIAS

public static final  ALIAS




---

### SCALAR

public static final  SCALAR




---

### NEWLINE

public static final  NEWLINE




---

### COMMENT

public static final  COMMENT




---

### STREAM_START

public static final  STREAM_START




---

### STREAM_END

public static final  STREAM_END




---

### DOCUMENT_START

public static final  DOCUMENT_START




---

### DOCUMENT_END

public static final  DOCUMENT_END




---

### EOF

public static final  EOF




---

### ERROR

public static final  ERROR




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [YamlTokenType](YamlTokenType.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [YamlTokenType](YamlTokenType.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getId__()</span>



**Specified By:**

[TokenType](../../cascara.common/lang/token/TokenType.md)


---

### getCategory

<span style="font-family: monospace; font-size: 80%;">public [TokenCategory](../../cascara.common/lang/token/TokenCategory.md) __getCategory__()</span>



**Specified By:**

[TokenType](../../cascara.common/lang/token/TokenType.md)


---

