Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonTokenizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.processor.AbstractJsonProcessor](AbstractJsonProcessor.md)<[io.github.qishr.cascara.lang.json.processor.JsonTokenizer](JsonTokenizer.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonTokenizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)<[JsonToken](../token/JsonToken.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonTokenizer__<br/>extends [AbstractJsonProcessor](AbstractJsonProcessor.md)<[JsonTokenizer](JsonTokenizer.md)>
</span>


## Constructor Summary

| Constructor     | Description                 |
|-----------------|-----------------------------|
| JsonTokenizer() | Default constructor for SPI |



## Method Summary

| Modifier and Type                                                                                                                         | Method                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [JsonTokenizer](JsonTokenizer.md)                                                                                               | [self](#self)()                                                                                                            |             |
| public void                                                                                                                               | [open](#open)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)           |             |
| public void                                                                                                                               | [open](#open)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../token/JsonToken.md)>       | [tokenize](#tokenize)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source) |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonTokenType](../token/JsonTokenType.md)> | [getTokenTypes](#gettokentypes)()                                                                                          |             |
| public [JsonToken](../token/JsonToken.md)                                                                                                 | [nextToken](#nexttoken)()                                                                                                  |             |


### Methods inherited from [AbstractJsonProcessor](AbstractJsonProcessor.md)

setReporter, getContentType, getServiceProperties, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonTokenizer](JsonTokenizer.md) __self__()</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#self)


---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### tokenize

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[JsonToken](../token/JsonToken.md)> __tokenize__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### getTokenTypes

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[JsonTokenType](../token/JsonTokenType.md)> __getTokenTypes__()</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### nextToken

<span style="font-family: monospace; font-size: 80%;">public [JsonToken](../token/JsonToken.md) __nextToken__()</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

