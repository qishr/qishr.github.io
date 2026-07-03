Package [io.github.qishr.cascara.lang.json](index.md)

# Class JsonPrimitiveDelegate
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.JsonPrimitiveDelegate<br/>
<br/>
All Implemented Interfaces:<br/>
    [PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonPrimitiveDelegate__</span>


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| JsonPrimitiveDelegate() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                             | Description                                                                |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| public [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md)                                   | [inferQuoteStyle](#inferquotestyle)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                                            |                                                                            |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [coerceLiteralValue](#coerceliteralvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                       | Converts JSON primitive literal values into native Java types.             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [unescapeQuotedString](#unescapequotedstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) style) | Handles strict JSON string unescaping mechanics for double-quoted strings. |



## Method Details

### inferQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) __inferQuoteStyle__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>



**Specified By:**

[PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


---

### coerceLiteralValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __coerceLiteralValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

Converts JSON primitive literal values into native Java types.Handles case-sensitive 'true', 'false', 'null', and JSON5 floating-point literals.

**Specified By:**

[PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


---

### unescapeQuotedString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __unescapeQuotedString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) style)</span>

Handles strict JSON string unescaping mechanics for double-quoted strings.

**Specified By:**

[PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


---

