Package [io.github.qishr.cascara.lang.yaml.token](index.md)

# Class YamlToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.token.YamlToken<br/>
<br/>
All Implemented Interfaces:<br/>
    [Token](../../cascara.common/lang/token/Token.md)

Direct Known Subtypes:<br/>
    [YamlErrorToken](YamlErrorToken.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlToken__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                  | Description      |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|
| YamlToken(int line, int column, int startOffset, [YamlTokenType](YamlTokenType.md) type)                                                                                                                                                                                                                                                                                                     | Structural Token |
| YamlToken(int line, int column, int startOffset, [YamlTokenType](YamlTokenType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content)                                                                                                                                                                                               |                  |
| YamlToken(int line, int column, int startOffset, [YamlTokenType](YamlTokenType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lexeme, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [ScalarStyle](../util/ScalarStyle.md) scalarStyle, int firstLineIndent, int blockIndent) |                  |



## Method Summary

| Modifier and Type                                                                                   | Method                                                         | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------|-------------|
| public int                                                                                          | [getStartLine](#getstartline)()                                |             |
| public int                                                                                          | [getStartColumn](#getstartcolumn)()                            |             |
| public int                                                                                          | [getOffset](#getoffset)()                                      |             |
| public int                                                                                          | [getFirstLineIndent](#getfirstlineindent)()                    |             |
| public int                                                                                          | [getBlockIndent](#getblockindent)()                            |             |
| public [YamlTokenType](YamlTokenType.md)                                                            | [getType](#gettype)()                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLexeme](#getlexeme)()                                      |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()                                    |             |
| public [ScalarStyle](../util/ScalarStyle.md)                                                        | [getScalarStyle](#getscalarstyle)()                            |             |
| public boolean                                                                                      | [startsOnNewLine](#startsonnewline)()                          |             |
| public [YamlToken](YamlToken.md)                                                                    | [setStartsOnNewLine](#setstartsonnewline)(boolean b)           |             |
| public boolean                                                                                      | [isFollowedByTab](#isfollowedbytab)()                          |             |
| public [YamlToken](YamlToken.md)                                                                    | [setFollowedByTab](#setfollowedbytab)(boolean b)               |             |
| public boolean                                                                                      | [hasPreceedingNewLine](#haspreceedingnewline)()                |             |
| public [YamlToken](YamlToken.md)                                                                    | [setHasPreceedingNewLine](#sethaspreceedingnewline)(boolean b) |             |
| public [YamlToken](YamlToken.md)                                                                    | [setType](#settype)([YamlTokenType](YamlTokenType.md) type)    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                        |             |



## Method Details

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>



**Specified By:**

[Token](../../cascara.common/lang/token/Token.md)


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>



**Specified By:**

[Token](../../cascara.common/lang/token/Token.md)


---

### getOffset

<span style="font-family: monospace; font-size: 80%;">public int __getOffset__()</span>



**Specified By:**

[Token](../../cascara.common/lang/token/Token.md)


---

### getFirstLineIndent

<span style="font-family: monospace; font-size: 80%;">public int __getFirstLineIndent__()</span>




---

### getBlockIndent

<span style="font-family: monospace; font-size: 80%;">public int __getBlockIndent__()</span>




---

### getType

<span style="font-family: monospace; font-size: 80%;">public [YamlTokenType](YamlTokenType.md) __getType__()</span>



**Specified By:**

[Token](../../cascara.common/lang/token/Token.md)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>



**Specified By:**

[Token](../../cascara.common/lang/token/Token.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[Token](../../cascara.common/lang/token/Token.md)


---

### getScalarStyle

<span style="font-family: monospace; font-size: 80%;">public [ScalarStyle](../util/ScalarStyle.md) __getScalarStyle__()</span>




---

### startsOnNewLine

<span style="font-family: monospace; font-size: 80%;">public boolean __startsOnNewLine__()</span>




---

### setStartsOnNewLine

<span style="font-family: monospace; font-size: 80%;">public [YamlToken](YamlToken.md) __setStartsOnNewLine__(boolean b)</span>




---

### isFollowedByTab

<span style="font-family: monospace; font-size: 80%;">public boolean __isFollowedByTab__()</span>




---

### setFollowedByTab

<span style="font-family: monospace; font-size: 80%;">public [YamlToken](YamlToken.md) __setFollowedByTab__(boolean b)</span>




---

### hasPreceedingNewLine

<span style="font-family: monospace; font-size: 80%;">public boolean __hasPreceedingNewLine__()</span>




---

### setHasPreceedingNewLine

<span style="font-family: monospace; font-size: 80%;">public [YamlToken](YamlToken.md) __setHasPreceedingNewLine__(boolean b)</span>




---

### setType

<span style="font-family: monospace; font-size: 80%;">public [YamlToken](YamlToken.md) __setType__([YamlTokenType](YamlTokenType.md) type)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Specified By:**

[Token](../../cascara.common/lang/token/Token.md)

**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

