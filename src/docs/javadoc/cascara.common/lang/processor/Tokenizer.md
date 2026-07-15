Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface Tokenizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.Tokenizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](Processor.md)

All Known Implementing Classes:<br/>
    [JsonTokenizer](../../../cascara.lang.json/processor/JsonTokenizer.md), [XmlTokenizer](../../../cascara.lang.xml/xml/processor/XmlTokenizer.md), [YamlTokenizer](../../../cascara.lang.yaml/yaml/processor/YamlTokenizer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Tokenizer__</span>


## Method Summary

| Modifier and Type                                                                                                                                   | Method                                                                                                                         | Description                                                                |
|-----------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T>                                          | [tokenize](#tokenize)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)       | High-level API: Tokenizes a complete String eagerly.                       |
| public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T>                                          | [tokenize](#tokenize)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is) | High-level API: Tokenizes an entire InputStream eagerly.                   |
| public abstract void                                                                                                                                | [open](#open)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)               | Low-level Streaming API: Resets the tokenizer state to read from a String. |
| public abstract void                                                                                                                                | [open](#open)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)         | Low-level Streaming API: Resets the tokenizer state to read from a stream. |
| public abstract T                                                                                                                                   | [nextToken](#nexttoken)()                                                                                                      | Low-level Streaming API: Pulls the next token on demand.                   |
| public default [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<? extends [TokenType](../token/TokenType.md)> | [getTokenTypes](#gettokentypes)()                                                                                              |                                                                            |



## Method Details

### tokenize

<span style="font-family: monospace; font-size: 80%;">public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __tokenize__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

High-level API: Tokenizes a complete String eagerly.


---

### tokenize

<span style="font-family: monospace; font-size: 80%;">public default [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<T> __tokenize__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>

High-level API: Tokenizes an entire InputStream eagerly.


---

### open

<span style="font-family: monospace; font-size: 80%;">public abstract void __open__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>

Low-level Streaming API: Resets the tokenizer state to read from a String.


---

### open

<span style="font-family: monospace; font-size: 80%;">public abstract void __open__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>

Low-level Streaming API: Resets the tokenizer state to read from a stream.


---

### nextToken

<span style="font-family: monospace; font-size: 80%;">public abstract T __nextToken__()</span>

Low-level Streaming API: Pulls the next token on demand.


---

### getTokenTypes

<span style="font-family: monospace; font-size: 80%;">public default [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<? extends [TokenType](../token/TokenType.md)> __getTokenTypes__()</span>




---

