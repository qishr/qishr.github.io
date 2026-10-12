Package [io.github.qishr.cascara.lang.xml.processor](index.md)

# Class XmlAstParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.xml.processor.AbstractXmlProcessor](../../../../../../../io/github/qishr/cascara/lang/xml/processor/AbstractXmlProcessor.md)<[io.github.qishr.cascara.lang.xml.processor.XmlAstParser](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlAstParser.md)><br/>
                io.github.qishr.cascara.lang.xml.processor.XmlAstParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)<[XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md), [XmlToken](../../../../../../../io/github/qishr/cascara/lang/xml/token/XmlToken.md), [XmlTokenizer](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlTokenizer.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __XmlAstParser__<br/>extends [AbstractXmlProcessor](../../../../../../../io/github/qishr/cascara/lang/xml/processor/AbstractXmlProcessor.md)<[XmlAstParser](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlAstParser.md)>
</span>


## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| XmlAstParser() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                    | Method                                                                                                                                                                                                | Description                               |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------|
| protected [XmlAstParser](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlAstParser.md)                                                                            | [self](#self)()                                                                                                                                                                                       |                                           |
| public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md)                                                                                               | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                    |                                           |
| public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md)                                                                                               | [parse](#parse)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../../../../../../../io/github/qishr/cascara/lang/xml/token/XmlToken.md)> tokens) | Entry point for parsing a list of tokens. |
| public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md)                                                                                               | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                                                                              |                                           |
| public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md)                                                                                               | [parse](#parse)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)                                                                                    |                                           |
| public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md)                                                                                               | [parse](#parse)([XmlTokenizer](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlTokenizer.md) tokenizer)                                                                            |                                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../../../../../../../io/github/qishr/cascara/lang/xml/token/XmlToken.md)> | [getTokens](#gettokens)()                                                                                                                                                                             |                                           |
| public [XmlTokenizer](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlTokenizer.md)                                                                               | [getTokenizer](#gettokenizer)()                                                                                                                                                                       |                                           |


### Methods inherited from [AbstractXmlProcessor](../../../../../../../io/github/qishr/cascara/lang/xml/processor/AbstractXmlProcessor.md)

getContentType, getServiceProperties, setReporter, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [XmlAstParser](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlAstParser.md) __self__()</span>



**Overrides:**

[AbstractXmlProcessor](../../../../../../../../cascara.lang.xml/io/github/qishr/cascara/lang/xml/processor/AbstractXmlProcessor.md#self)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md) __parse__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../../../../../../../io/github/qishr/cascara/lang/xml/token/XmlToken.md)> tokens)</span>

Entry point for parsing a list of tokens.

**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md) __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md) __parse__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](../../../../../../../io/github/qishr/cascara/lang/xml/ast/XmlNode.md) __parse__([XmlTokenizer](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlTokenizer.md) tokenizer)</span>




---

### getTokens

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlToken](../../../../../../../io/github/qishr/cascara/lang/xml/token/XmlToken.md)> __getTokens__()</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

### getTokenizer

<span style="font-family: monospace; font-size: 80%;">public [XmlTokenizer](../../../../../../../io/github/qishr/cascara/lang/xml/processor/XmlTokenizer.md) __getTokenizer__()</span>



**Specified By:**

[AstParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/AstParser.md)


---

