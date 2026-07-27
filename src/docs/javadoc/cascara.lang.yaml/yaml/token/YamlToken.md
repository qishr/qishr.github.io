Package [io.github.qishr.cascara.lang.yaml.token](index.md)

# Class YamlToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.token.YamlToken<br/>
<br/>
All Implemented Interfaces:<br/>
    [Token](../../../cascara.common/lang/token/Token.md)

Direct Known Subtypes:<br/>
    [YamlErrorToken](YamlErrorToken.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlToken__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                           | Description      |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|
| YamlToken(int line, int column, int startOffset, [YamlTokenType](YamlTokenType.md) type)                                                                                                                                                                                                                                                              | Structural Token |
| YamlToken(int line, int column, int startOffset, [YamlTokenType](YamlTokenType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lexeme, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [ScalarStyle](../ast/ScalarStyle.md) scalarStyle) |                  |



## Method Summary

| Modifier and Type                                                                                   | Method                                                      | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------|-------------|
| public int                                                                                          | [getStartLine](#getstartline)()                             |             |
| public int                                                                                          | [getStartColumn](#getstartcolumn)()                         |             |
| public int                                                                                          | [getOffset](#getoffset)()                                   |             |
| public [YamlTokenType](YamlTokenType.md)                                                            | [getType](#gettype)()                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLexeme](#getlexeme)()                                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()                                 |             |
| public [ScalarStyle](../ast/ScalarStyle.md)                                                         | [getScalarStyle](#getscalarstyle)()                         |             |
| public void                                                                                         | [setType](#settype)([YamlTokenType](YamlTokenType.md) type) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                     |             |



## Method Details

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)


---

### getOffset

<span style="font-family: monospace; font-size: 80%;">public int __getOffset__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)


---

### getType

<span style="font-family: monospace; font-size: 80%;">public [YamlTokenType](YamlTokenType.md) __getType__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)


---

### getScalarStyle

<span style="font-family: monospace; font-size: 80%;">public [ScalarStyle](../ast/ScalarStyle.md) __getScalarStyle__()</span>




---

### setType

<span style="font-family: monospace; font-size: 80%;">public void __setType__([YamlTokenType](YamlTokenType.md) type)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)

**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

