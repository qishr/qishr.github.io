Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlAstParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.processor.AbstractYamlProcessor](AbstractYamlProcessor.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlAstParser](YamlAstParser.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlAstParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstParser](../../../cascara.common/lang/processor/AstParser.md)<[YamlNode](../ast/YamlNode.md), [YamlToken](../token/YamlToken.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlAstParser__<br/>extends [AbstractYamlProcessor](AbstractYamlProcessor.md)<[YamlAstParser](YamlAstParser.md)>
</span>

A recursive descent parser that transforms a stream of [YamlToken](../token/YamlToken.md)s into a [YamlNode](../ast/YamlNode.md) AST.This parser is designed for **high-fidelity AST construction**, meaning it preserves
comments, indentation styles, and quote styles for round-tripping.

### Core Responsibilities
* **Structural Validation**: Enforces strict column alignment for map keys and sequence items.
* **Trivia Management**: Buffers comments using pendingComments and attaches them to
  the next appropriate data node (Scalar, Map, or Sequence).
* **Indentation Lifecycle**: Manages block boundaries by consuming `INDENT` and `DEDENT`
  tokens through the parseValue dispatcher.


## Constructor Summary

| Constructor     | Description                        |
|-----------------|------------------------------------|
| YamlAstParser() | Empty default constructor for SPI. |



## Method Summary

| Modifier and Type                                                                                                                   | Method                                                                                                                                               | Description                                                                |
|-------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| protected [YamlAstParser](YamlAstParser.md)                                                                                         | [self](#self)()                                                                                                                                      |                                                                            |
| public [YamlAstParser](YamlAstParser.md)                                                                                            | [setOptions](#setoptions)([YamlOptions](../YamlOptions.md) options)                                                                                  |                                                                            |
| public [YamlNode](../ast/YamlNode.md)                                                                                               | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                   | Entry point for parsing a full YAML source string.                         |
| public [YamlNode](../ast/YamlNode.md)                                                                                               | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                             | Entry point for parsing an InputStream.                                    |
| public io.github.qishr.cascara.lang.yaml.ast.@io.github.qishr.cascara.common.lang.annotation.Experimental YamlStreamNode            | [parseMulti](#parsemulti)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                         | Type-safe method specifically for multi-document scenarios.                |
| public io.github.qishr.cascara.lang.yaml.ast.@io.github.qishr.cascara.common.lang.annotation.Experimental YamlStreamNode            | [parseMulti](#parsemulti)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)                   | Type-safe method specifically for multi-document scenarios.                |
| public [YamlNode](../ast/YamlNode.md)                                                                                               | [parse](#parse)([Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)<[YamlToken](../token/YamlToken.md)> tokenizer)                      | Primary parsing core driven directly by the Tokenizer interface structure. |
| public [YamlNode](../ast/YamlNode.md)                                                                                               | [parse](#parse)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlToken](../token/YamlToken.md)> tokens) | Entry point for parsing a list of tokens.                                  |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlToken](../token/YamlToken.md)> | [getTokens](#gettokens)()                                                                                                                            |                                                                            |


### Methods inherited from [AbstractYamlProcessor](AbstractYamlProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getReporter, [setOptions](#setoptions)


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlAstParser](YamlAstParser.md) __self__()</span>



**Overrides:**

[AbstractYamlProcessor](../cascara.lang.yaml/yaml/processor/AbstractYamlProcessor.md#self)


---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [YamlAstParser](YamlAstParser.md) __setOptions__([YamlOptions](../YamlOptions.md) options)</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

Entry point for parsing a full YAML source string.

**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>

Entry point for parsing an InputStream.

**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### parseMulti

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public io.github.qishr.cascara.lang.yaml.ast.@io.github.qishr.cascara.common.lang.annotation.Experimental YamlStreamNode __parseMulti__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

Type-safe method specifically for multi-document scenarios.


---

### parseMulti

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public io.github.qishr.cascara.lang.yaml.ast.@io.github.qishr.cascara.common.lang.annotation.Experimental YamlStreamNode __parseMulti__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>

Type-safe method specifically for multi-document scenarios.


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __parse__([Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)<[YamlToken](../token/YamlToken.md)> tokenizer)</span>

Primary parsing core driven directly by the Tokenizer interface structure.

**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### parse

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __parse__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlToken](../token/YamlToken.md)> tokens)</span>

Entry point for parsing a list of tokens.

**Specified By:**

[AstParser](../../../cascara.common/lang/processor/AstParser.md)


---

### getTokens

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlToken](../token/YamlToken.md)> __getTokens__()</span>




---

