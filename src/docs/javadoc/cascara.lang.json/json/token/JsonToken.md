Package [io.github.qishr.cascara.lang.json.token](index.md)

# Interface JsonToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.token.JsonToken<br/>
<br/>
All Implemented Interfaces:<br/>
    [Token](../../../cascara.common/lang/token/Token.md)

All Known Implementing Classes:<br/>
    [JsonBufferBackedToken](JsonBufferBackedToken.md), [JsonNumberToken](JsonNumberToken.md), [JsonErrorToken](JsonErrorToken.md), [JsonLexemeBackedToken](JsonLexemeBackedToken.md), [JsonStructuralToken](JsonStructuralToken.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __JsonToken__</span>


## Method Summary

| Modifier and Type                                                                                                                       | Method                                                                                                                                                          | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [JsonTokenType](JsonTokenType.md)                                                                                       | [getType](#gettype)()                                                                                                                                           |             |
| public abstract [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md)                                                           | [getQuoteStyle](#getquotestyle)()                                                                                                                               |             |
| public abstract [JsonLiteral](JsonLiteral.md)                                                                                           | [getLiteral](#getliteral)()                                                                                                                                     |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> | [getComments](#getcomments)()                                                                                                                                   |             |
| public abstract void                                                                                                                    | [attachComments](#attachcomments)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> list) |             |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public abstract [JsonTokenType](JsonTokenType.md) __getType__()</span>



**Specified By:**

[Token](../../../cascara.common/lang/token/Token.md)


---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [QuoteStyle](../../../cascara.common/lang/util/QuoteStyle.md) __getQuoteStyle__()</span>




---

### getLiteral

<span style="font-family: monospace; font-size: 80%;">public abstract [JsonLiteral](JsonLiteral.md) __getLiteral__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> __getComments__()</span>




---

### attachComments

<span style="font-family: monospace; font-size: 80%;">public abstract void __attachComments__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonComment](JsonComment.md)> list)</span>




---

