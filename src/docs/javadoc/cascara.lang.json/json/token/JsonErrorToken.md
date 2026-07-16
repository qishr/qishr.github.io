Package [io.github.qishr.cascara.lang.json.token](index.md)

# Class JsonErrorToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.token.JsonErrorToken<br/>
<br/>
All Implemented Interfaces:<br/>
    [JsonToken](JsonToken.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonErrorToken__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| JsonErrorToken(int line, int column, int offset, [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md)                                             | [getCode](#getcode)()                                                                                                                                           |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                          | [getDetails](#getdetails)()                                                                                                                                     |             |
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



## Method Details

### getCode

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticCode](../../../cascara.common/diagnostic/code/DiagnosticCode.md) __getCode__()</span>




---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>




---

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

