Package [io.github.qishr.cascara.lang.yaml](index.md)

# Class YamlPrimitiveDelegate
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.YamlPrimitiveDelegate<br/>
<br/>
All Implemented Interfaces:<br/>
    [PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlPrimitiveDelegate__</span>


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| YamlPrimitiveDelegate() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                             | Description                                                                         |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [coerceLiteralValue](#coerceliteralvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                       |                                                                                     |
| public [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md)                                   | [inferQuoteStyle](#inferquotestyle)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                                            |                                                                                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [unescapeQuotedString](#unescapequotedstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) style) | Overrides the hook from AbstractPrimitive to handle YAML-specific string formatting |



## Method Details

### coerceLiteralValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __coerceLiteralValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


---

### inferQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) __inferQuoteStyle__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>



**Specified By:**

[PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


---

### unescapeQuotedString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __unescapeQuotedString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) style)</span>

Overrides the hook from AbstractPrimitive to handle YAML-specific string formatting

**Specified By:**

[PrimitiveDelegate](../../cascara.common/lang/type/PrimitiveDelegate.md)


---

