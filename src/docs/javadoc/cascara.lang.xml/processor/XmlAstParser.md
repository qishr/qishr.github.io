Package [io.github.qishr.cascara.lang.xml.processor](index.md)

# Class XmlAstParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.xml.processor.AbstractXmlProcessor](AbstractXmlProcessor.md)<[io.github.qishr.cascara.lang.xml.processor.XmlAstParser](XmlAstParser.md)><br/>
                io.github.qishr.cascara.lang.xml.processor.XmlAstParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstParser](../../cascara.common/lang/processor/AstParser.md)<[XmlNode](../ast/XmlNode.md), [XmlToken](../token/XmlToken.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __XmlAstParser__<br/>extends [AbstractXmlProcessor](AbstractXmlProcessor.md)<[XmlAstParser](XmlAstParser.md)>
</span>


## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| XmlAstParser() |             |



## Method Summary

| Modifier and Type                         | Method                                                                                                                                             | Description                               |
|-------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------|
| protected [XmlAstParser](XmlAstParser.md) | [self](#self)()                                                                                                                                    |                                           |
| public [XmlNode](../ast/XmlNode.md)       | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                 |                                           |
| public [XmlNode](../ast/XmlNode.md)       | [parse](#parse)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../token/XmlToken.md)> tokens) | Entry point for parsing a list of tokens. |
| public [XmlNode](../ast/XmlNode.md)       | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                           |                                           |
| public [XmlNode](../ast/XmlNode.md)       | [parse](#parse)([Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)<[XmlToken](../token/XmlToken.md)> tokenizer)                         |                                           |
| public [XmlNode](../ast/XmlNode.md)       | [parse](#parse)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)                                 |                                           |


### Methods inherited from [AbstractXmlProcessor](AbstractXmlProcessor.md)

setReporter, getContentType, getServiceProperties, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [XmlAstParser](XmlAstParser.md) __self__()</span>



**Overrides:**

[AbstractXmlProcessor](../cascara.lang.xml/processor/AbstractXmlProcessor.md#self)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../ast/XmlNode.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[AstParser](../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../ast/XmlNode.md) __parse__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../token/XmlToken.md)> tokens)</span>

Entry point for parsing a list of tokens.

**Specified By:**

[AstParser](../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../ast/XmlNode.md) __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[AstParser](../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../ast/XmlNode.md) __parse__([Tokenizer](../../cascara.common/lang/processor/Tokenizer.md)<[XmlToken](../token/XmlToken.md)> tokenizer)</span>



**Specified By:**

[AstParser](../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../ast/XmlNode.md) __parse__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>



**Specified By:**

[AstParser](../../cascara.common/lang/processor/AstParser.md)


---

