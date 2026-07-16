Package [io.github.qishr.cascara.lang.xml.token](index.md)

# Enum XmlTokenType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.lang.xml.token.XmlTokenType](XmlTokenType.md)><br/>
                io.github.qishr.cascara.lang.xml.token.XmlTokenType<br/>
<br/>
All Implemented Interfaces:<br/>
    [TokenType](../../cascara.common/lang/token/TokenType.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __XmlTokenType__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[XmlTokenType](XmlTokenType.md)>
</span>


##Enum Constants

| Enum Constant                   | Description |
|---------------------------------|-------------|
| [TAG_START](#tag_start)         |             |
| [TAG_END](#tag_end)             |             |
| [TAG_SLASH](#tag_slash)         |             |
| [END_TAG_START](#end_tag_start) |             |
| [EQUALS](#equals)               |             |
| [TAG_NAME](#tag_name)           |             |
| [ATTR_NAME](#attr_name)         |             |
| [ATTR_VALUE](#attr_value)       |             |
| [TEXT](#text)                   |             |
| [CDATA_START](#cdata_start)     |             |
| [CDATA_CONTENT](#cdata_content) |             |
| [CDATA_END](#cdata_end)         |             |
| [PI_START](#pi_start)           |             |
| [PI_TARGET](#pi_target)         |             |
| [PI_CONTENT](#pi_content)       |             |
| [PI_END](#pi_end)               |             |
| [COMMENT](#comment)             |             |
| [WHITESPACE](#whitespace)       |             |
| [ERROR](#error)                 |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [XmlTokenType](XmlTokenType.md)[]                                                     | [values](#values)()                                                                                                    |             |
| public static [XmlTokenType](XmlTokenType.md)                                                       | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getId](#getid)()                                                                                                      |             |
| public [TokenCategory](../../cascara.common/lang/token/TokenCategory.md)                            | [getCategory](#getcategory)()                                                                                          |             |



## Enum Constant Details

### TAG_START

public static final  TAG_START




---

### TAG_END

public static final  TAG_END




---

### TAG_SLASH

public static final  TAG_SLASH




---

### END_TAG_START

public static final  END_TAG_START




---

### EQUALS

public static final  EQUALS




---

### TAG_NAME

public static final  TAG_NAME




---

### ATTR_NAME

public static final  ATTR_NAME




---

### ATTR_VALUE

public static final  ATTR_VALUE




---

### TEXT

public static final  TEXT




---

### CDATA_START

public static final  CDATA_START




---

### CDATA_CONTENT

public static final  CDATA_CONTENT




---

### CDATA_END

public static final  CDATA_END




---

### PI_START

public static final  PI_START




---

### PI_TARGET

public static final  PI_TARGET




---

### PI_CONTENT

public static final  PI_CONTENT




---

### PI_END

public static final  PI_END




---

### COMMENT

public static final  COMMENT




---

### WHITESPACE

public static final  WHITESPACE




---

### ERROR

public static final  ERROR




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [XmlTokenType](XmlTokenType.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [XmlTokenType](XmlTokenType.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

