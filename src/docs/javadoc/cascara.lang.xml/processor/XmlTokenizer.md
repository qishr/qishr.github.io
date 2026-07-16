Package [io.github.qishr.cascara.lang.xml.processor](index.md)

# Class XmlTokenizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.xml.processor.AbstractXmlProcessor](AbstractXmlProcessor.md)<[io.github.qishr.cascara.lang.xml.processor.XmlTokenizer](XmlTokenizer.md)><br/>
                io.github.qishr.cascara.lang.xml.processor.XmlTokenizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)<[XmlToken](../token/XmlToken.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __XmlTokenizer__<br/>extends [AbstractXmlProcessor](AbstractXmlProcessor.md)<[XmlTokenizer](XmlTokenizer.md)>
</span>


## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| XmlTokenizer() |             |



## Method Summary

| Modifier and Type                                                                                                                 | Method                                                                                                                     | Description |
|-----------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [XmlTokenizer](XmlTokenizer.md)                                                                                         | [self](#self)()                                                                                                            |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../token/XmlToken.md)> | [tokenize](#tokenize)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source) |             |
| public void                                                                                                                       | [open](#open)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)           |             |
| public void                                                                                                                       | [open](#open)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)     |             |
| public [XmlToken](../token/XmlToken.md)                                                                                           | [nextToken](#nexttoken)()                                                                                                  |             |
| public void                                                                                                                       | [open](#open)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)           |             |


### Methods inherited from [AbstractXmlProcessor](AbstractXmlProcessor.md)

setReporter, getContentType, getServiceProperties, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [XmlTokenizer](XmlTokenizer.md) __self__()</span>



**Overrides:**

[AbstractXmlProcessor](../cascara.lang.xml/processor/AbstractXmlProcessor.md#self)


---

### tokenize

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../token/XmlToken.md)> __tokenize__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)</span>



**Specified By:**

[Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)


---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)


---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)


---

### nextToken

<span style="font-family: monospace; font-size: 80%;">public [XmlToken](../token/XmlToken.md) __nextToken__()</span>



**Specified By:**

[Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)


---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>



**Specified By:**

[Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)


---

