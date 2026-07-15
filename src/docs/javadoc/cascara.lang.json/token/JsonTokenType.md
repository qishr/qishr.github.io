Package [io.github.qishr.cascara.lang.json.token](index.md)

# Enum JsonTokenType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.lang.json.token.JsonTokenType](JsonTokenType.md)><br/>
                io.github.qishr.cascara.lang.json.token.JsonTokenType<br/>
<br/>
All Implemented Interfaces:<br/>
    [TokenType](../../cascara.common/lang/token/TokenType.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __JsonTokenType__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[JsonTokenType](JsonTokenType.md)>
</span>


##Enum Constants

| Enum Constant                   | Description |
|---------------------------------|-------------|
| [LEFT_BRACE](#left_brace)       |             |
| [RIGHT_BRACE](#right_brace)     |             |
| [LEFT_BRACKET](#left_bracket)   |             |
| [RIGHT_BRACKET](#right_bracket) |             |
| [COLON](#colon)                 |             |
| [COMMA](#comma)                 |             |
| [DOT](#dot)                     |             |
| [STRING](#string)               |             |
| [NUMBER](#number)               |             |
| [BOOLEAN](#boolean)             |             |
| [NULL](#null)                   |             |
| [UNKNOWN](#unknown)             |             |
| [ERROR](#error)                 |             |
| [IDENTIFIER](#identifier)       |             |
| [COMMENT](#comment)             |             |
| [EOF](#eof)                     |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [JsonTokenType](JsonTokenType.md)[]                                                   | [values](#values)()                                                                                                    |             |
| public static [JsonTokenType](JsonTokenType.md)                                                     | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getId](#getid)()                                                                                                      |             |
| public [TokenCategory](../../cascara.common/lang/token/TokenCategory.md)                            | [getCategory](#getcategory)()                                                                                          |             |



## Enum Constant Details

### LEFT_BRACE

public static final  LEFT_BRACE




---

### RIGHT_BRACE

public static final  RIGHT_BRACE




---

### LEFT_BRACKET

public static final  LEFT_BRACKET




---

### RIGHT_BRACKET

public static final  RIGHT_BRACKET




---

### COLON

public static final  COLON




---

### COMMA

public static final  COMMA




---

### DOT

public static final  DOT




---

### STRING

public static final  STRING




---

### NUMBER

public static final  NUMBER




---

### BOOLEAN

public static final  BOOLEAN




---

### NULL

public static final  NULL




---

### UNKNOWN

public static final  UNKNOWN




---

### ERROR

public static final  ERROR




---

### IDENTIFIER

public static final  IDENTIFIER




---

### COMMENT

public static final  COMMENT




---

### EOF

public static final  EOF




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [JsonTokenType](JsonTokenType.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [JsonTokenType](JsonTokenType.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

