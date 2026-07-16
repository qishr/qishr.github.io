Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface AstParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.AstParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](Processor.md)

All Known Implementing Classes:<br/>
    [JsonAstParser](../../../cascara.lang.json/json/processor/JsonAstParser.md), [XmlAstParser](../../../cascara.lang.xml/processor/XmlAstParser.md), [YamlAstParser](../../../cascara.lang.yaml/yaml/processor/YamlAstParser.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Beta<br/>
public interface __AstParser__</span>


## Method Summary

| Modifier and Type | Method                                                                                                                   | Description                                                                |
|-------------------|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| public abstract N | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)       | Entry point for parsing a source string.                                   |
| public abstract N | [parse](#parse)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)       |                                                                            |
| public abstract N | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is) | Entry point for parsing an `InputStream`.                                  |
| public abstract N | [parse](#parse)([Tokenizer](Tokenizer.md)<T> tokenizer)                                                                  | Primary parsing core driven directly by the Tokenizer interface structure. |
| public abstract N | [parse](#parse)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> tokens)      | Entry point for parsing a list of tokens.                                  |



## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public abstract N __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

Entry point for parsing a source string.

**Parameters:**

`text` - The raw text source.

**Returns:**

The root [AstNode](../ast/AstNode.md).


---

### parse

<span style="font-family: monospace; font-size: 80%;">public abstract N __parse__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public abstract N __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>

Entry point for parsing an `InputStream`.

**Parameters:**

`is` - is An input stream of the raw text source.

**Returns:**

The root [AstNode](../ast/AstNode.md).


---

### parse

<span style="font-family: monospace; font-size: 80%;">public abstract N __parse__([Tokenizer](Tokenizer.md)<T> tokenizer)</span>

Primary parsing core driven directly by the Tokenizer interface structure.

**Parameters:**

`tokenizer` - the tokenizer instance.

**Returns:**

The root [AstNode](../ast/AstNode.md).


---

### parse

<span style="font-family: monospace; font-size: 80%;">public abstract N __parse__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> tokens)</span>

Entry point for parsing a list of tokens.

**Parameters:**

`tokens` - A list of tokens representing the tokenized text source.

**Returns:**

The root [AstNode](../ast/AstNode.md).


---

