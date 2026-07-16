Package [io.github.qishr.cascara.lang.json.token](index.md)

# Class JsonStructuralToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.token.JsonStructuralToken<br/>
<br/>
All Implemented Interfaces:<br/>
    [JsonToken](JsonToken.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonStructuralToken__</span>


## Field Summary

| Modifier and Type             | Field                       | Description |
|-------------------------------|-----------------------------|-------------|
| protected final int           | [startColumn](#startcolumn) |             |
| protected final int           | [startLine](#startline)     |             |
| protected final int           | [startOffset](#startoffset) |             |
| protected final JsonTokenType | [type](#type)               |             |



## Constructor Summary

| Constructor                                                                                        | Description |
|----------------------------------------------------------------------------------------------------|-------------|
| JsonStructuralToken(int line, int column, int startOffset, [JsonTokenType](JsonTokenType.md) type) |             |
| JsonStructuralToken([JsonTokenType](JsonTokenType.md) type)                                        |             |



## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                            | [getLexeme](#getlexeme)()                                                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                            | [getContent](#getcontent)()                                                                                                                                     |             |
| public int                                                                                                                     | [getOffset](#getoffset)()                                                                                                                                       |             |
| public int                                                                                                                     | [getStartLine](#getstartline)()                                                                                                                                 |             |
| public int                                                                                                                     | [getStartColumn](#getstartcolumn)()                                                                                                                             |             |
| public [JsonTokenType](JsonTokenType.md)                                                                                       | [getType](#gettype)()                                                                                                                                           |             |
| public [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md)                                                           | [getQuoteStyle](#getquotestyle)()                                                                                                                               |             |
| public [JsonLiteral](JsonLiteral.md)                                                                                           | [getLiteral](#getliteral)()                                                                                                                                     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> | [getComments](#getcomments)()                                                                                                                                   |             |
| public void                                                                                                                    | [attachComments](#attachcomments)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> list) |             |



## Field Details

### startColumn

<span style="font-family: monospace; font-size: 80%;">protected final int __startColumn__</span>




---

### startLine

<span style="font-family: monospace; font-size: 80%;">protected final int __startLine__</span>




---

### startOffset

<span style="font-family: monospace; font-size: 80%;">protected final int __startOffset__</span>




---

### type

<span style="font-family: monospace; font-size: 80%;">protected final JsonTokenType __type__</span>




---


## Method Details

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>




---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>




---

### getOffset

<span style="font-family: monospace; font-size: 80%;">public int __getOffset__()</span>




---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>




---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>




---

### getType

<span style="font-family: monospace; font-size: 80%;">public [JsonTokenType](JsonTokenType.md) __getType__()</span>



**Specified By:**

[JsonToken](JsonToken.md)


---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>



**Specified By:**

[JsonToken](JsonToken.md)


---

### getLiteral

<span style="font-family: monospace; font-size: 80%;">public [JsonLiteral](JsonLiteral.md) __getLiteral__()</span>



**Specified By:**

[JsonToken](JsonToken.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> __getComments__()</span>



**Specified By:**

[JsonToken](JsonToken.md)


---

### attachComments

<span style="font-family: monospace; font-size: 80%;">public void __attachComments__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> list)</span>



**Specified By:**

[JsonToken](JsonToken.md)


---

