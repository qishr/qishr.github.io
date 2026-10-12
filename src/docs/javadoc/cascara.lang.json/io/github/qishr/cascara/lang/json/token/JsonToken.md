Package [io.github.qishr.cascara.lang.json.token](index.md)

# Interface JsonToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.token.JsonToken<br/>
<br/>
All Implemented Interfaces:<br/>
    [Token](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/token/Token.md)

All Known Implementing Classes:<br/>
    [JsonBufferBackedToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonBufferBackedToken.md), [JsonNumberToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonNumberToken.md), [JsonErrorToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonErrorToken.md), [JsonLexemeBackedToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonLexemeBackedToken.md), [JsonStructuralToken](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonStructuralToken.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __JsonToken__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                    | Method                                                                                                                                                                                                                       | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [JsonTokenType](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonTokenType.md)                                                                                       | [getType](#gettype)()                                                                                                                                                                                                        |             |
| public abstract [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md)                                                                          | [getQuoteStyle](#getquotestyle)()                                                                                                                                                                                            |             |
| public abstract [JsonLiteral](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonLiteral.md)                                                                                           | [getLiteral](#getliteral)()                                                                                                                                                                                                  |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonComment.md)> | [getComments](#getcomments)()                                                                                                                                                                                                |             |
| public abstract void                                                                                                                                                                                 | [attachComments](#attachcomments)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonComment.md)> list) |             |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public abstract [JsonTokenType](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonTokenType.md) __getType__()</span>



**Specified By:**

[Token](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/token/Token.md)


---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [QuoteStyle](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>




---

### getLiteral

<span style="font-family: monospace; font-size: 80%;">public abstract [JsonLiteral](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonLiteral.md) __getLiteral__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonComment.md)> __getComments__()</span>




---

### attachComments

<span style="font-family: monospace; font-size: 80%;">public abstract void __attachComments__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](../../../../../../../io/github/qishr/cascara/lang/json/token/JsonComment.md)> list)</span>




---

