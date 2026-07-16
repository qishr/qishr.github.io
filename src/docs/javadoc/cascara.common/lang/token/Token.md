Package [io.github.qishr.cascara.common.lang.token](index.md)

# Interface Token
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.token.Token<br/>
<br/>
All Known Implementing Classes:<br/>
    [JsonToken](../../../cascara.lang.json/token/JsonToken.md), [XmlToken](../../../cascara.lang.xml/token/XmlToken.md), [YamlToken](../../../cascara.lang.yaml/token/YamlToken.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Token__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                              | Description                                                                                                               |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| public abstract [TokenType](TokenType.md)                                                                    | [getType](#gettype)()               | Returns the basic type of this the token, defined in a class that implements TokenType.                                   |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLexeme](#getlexeme)()           | Returns the exact literal characters scanned from the source file, including any surrounding quotes or syntax indicators. |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()         | Returns the unescaped, processed string content within the token boundaries.                                              |
| public abstract int                                                                                          | [getOffset](#getoffset)()           | Returns the total number of bytes/characters read before start of current token.                                          |
| public abstract int                                                                                          | [getStartLine](#getstartline)()     | Returns the input row on which current token starts; 1-based                                                              |
| public abstract int                                                                                          | [getStartColumn](#getstartcolumn)() | Returns the column on input row that current token starts; 1-based                                                        |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()             | Returns a human readable description of the token.                                                                        |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public abstract [TokenType](TokenType.md) __getType__()</span>

Returns the basic type of this the token, defined in a class that implements TokenType.


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>

Returns the exact literal characters scanned from the source file,
including any surrounding quotes or syntax indicators.


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>

Returns the unescaped, processed string content within the token boundaries.


---

### getOffset

<span style="font-family: monospace; font-size: 80%;">public abstract int __getOffset__()</span>

Returns the total number of bytes/characters read before start of current token.


---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartLine__()</span>

Returns the input row on which current token starts; 1-based


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartColumn__()</span>

Returns the column on input row that current token starts; 1-based


---

### toString

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns a human readable description of the token.


---

