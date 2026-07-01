Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class Primitive
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.type.Primitive<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Primitive__</span>


## Field Summary

| Modifier and Type      | Field                                       | Description |
|------------------------|---------------------------------------------|-------------|
| protected final Object | [rawInput](#rawinput)                       |             |
| protected QuoteStyle   | [specifiedQuoteStyle](#specifiedquotestyle) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                   | Description                                |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------|
| public static [Primitive](Primitive.md)                                                             | [of](#of)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) nativeInstance)                                                                   |                                            |
| public static [Primitive](Primitive.md)                                                             | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) unescapedContent, [QuoteStyle](../util/QuoteStyle.md) quoteStyle) | Parses unescaped text and infers its type. |
| public [Primitive](Primitive.md)                                                                    | [setDelegate](#setdelegate)([PrimitiveDelegate](PrimitiveDelegate.md) delegate)                                                                                                          |                                            |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [unwrap](#unwrap)()                                                                                                                                                                      |                                            |
| public [QuoteStyle](../util/QuoteStyle.md)                                                          | [getQuoteStyle](#getquotestyle)()                                                                                                                                                        |                                            |
| public [Primitive](Primitive.md)                                                                    | [setQuoteStyle](#setquotestyle)([QuoteStyle](../util/QuoteStyle.md) style)                                                                                                               |                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [asString](#asstring)()                                                                                                                                                                  |                                            |
| public double                                                                                       | [asDouble](#asdouble)(double defaultValue)                                                                                                                                               |                                            |
| public int                                                                                          | [asInteger](#asinteger)(int defaultValue)                                                                                                                                                |                                            |
| public boolean                                                                                      | [asBoolean](#asboolean)(boolean defaultValue)                                                                                                                                            |                                            |
| public boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                                        |                                            |
| public int                                                                                          | [hashCode](#hashcode)()                                                                                                                                                                  |                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                                                                                  |                                            |



## Field Details

### rawInput

<span style="font-family: monospace; font-size: 80%;">protected final Object __rawInput__</span>




---

### specifiedQuoteStyle

<span style="font-family: monospace; font-size: 80%;">protected QuoteStyle __specifiedQuoteStyle__</span>




---


## Method Details

### of

<span style="font-family: monospace; font-size: 80%;">public static [Primitive](Primitive.md) __of__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) nativeInstance)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public static [Primitive](Primitive.md) __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) unescapedContent, [QuoteStyle](../util/QuoteStyle.md) quoteStyle)</span>

Parses unescaped text and infers its type.


---

### setDelegate

<span style="font-family: monospace; font-size: 80%;">public [Primitive](Primitive.md) __setDelegate__([PrimitiveDelegate](PrimitiveDelegate.md) delegate)</span>




---

### unwrap

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __unwrap__()</span>




---

### getQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [QuoteStyle](../util/QuoteStyle.md) __getQuoteStyle__()</span>




---

### setQuoteStyle

<span style="font-family: monospace; font-size: 80%;">public [Primitive](Primitive.md) __setQuoteStyle__([QuoteStyle](../util/QuoteStyle.md) style)</span>




---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>




---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__(double defaultValue)</span>




---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__(int defaultValue)</span>




---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__(boolean defaultValue)</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

