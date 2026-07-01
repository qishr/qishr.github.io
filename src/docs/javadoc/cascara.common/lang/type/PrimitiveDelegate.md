Package [io.github.qishr.cascara.common.lang.type](index.md)

# Interface PrimitiveDelegate
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.type.PrimitiveDelegate<br/>
<br/>
All Known Implementing Classes:<br/>
    [JsonPrimitiveDelegate](../../../cascara.lang.json/json/JsonPrimitiveDelegate.md), [YamlPrimitiveDelegate](../../../cascara.lang.yaml/yaml/YamlPrimitiveDelegate.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __PrimitiveDelegate__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [QuoteStyle](../util/QuoteStyle.md)                                                          | [inferQuoteStyle](#inferquotestyle)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                     |             |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [coerceLiteralValue](#coerceliteralvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [unescapeQuotedString](#unescapequotedstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [QuoteStyle](../util/QuoteStyle.md) style) |             |



## Method Details

### inferQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [QuoteStyle](../util/QuoteStyle.md) __inferQuoteStyle__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### coerceLiteralValue

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __coerceLiteralValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### unescapeQuotedString

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __unescapeQuotedString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [QuoteStyle](../util/QuoteStyle.md) style)</span>




---

