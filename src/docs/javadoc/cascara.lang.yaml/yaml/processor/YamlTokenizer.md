Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlTokenizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.processor.AbstractYamlProcessor](AbstractYamlProcessor.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlTokenizer](YamlTokenizer.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlTokenizer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)<[YamlToken](../token/YamlToken.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlTokenizer__<br/>extends [AbstractYamlProcessor](AbstractYamlProcessor.md)<[YamlTokenizer](YamlTokenizer.md)>
</span>

Processes raw YAML source text into a stream of [YamlToken](../token/YamlToken.md) objects.This tokenizer implements a stateful scan that tracks indentation levels
to produce structural tokens (`INDENT`, `DEDENT`) alongside standard
YAML indicators and scalars.

### Indentation Rules
* Only spaces are permitted for indentation.
* Tabs encountered in a whitespace context will trigger a RuntimeException.
* A `DEDENT` must return exactly to a previously established indentation column.

### Scalar Constraints
* Plain scalars (unquoted) cannot contain a colon (`:`) unless it is a
  valid value indicator followed by whitespace.


## Constructor Summary

| Constructor     | Description                 |
|-----------------|-----------------------------|
| YamlTokenizer() | Default constructor for SPI |



## Method Summary

| Modifier and Type                                                                                                                         | Method                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [YamlTokenizer](YamlTokenizer.md)                                                                                               | [self](#self)()                                                                                                            |             |
| public int                                                                                                                                | [getLine](#getline)()                                                                                                      |             |
| public int                                                                                                                                | [getColumn](#getcolumn)()                                                                                                  |             |
| public void                                                                                                                               | [open](#open)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)           |             |
| public void                                                                                                                               | [open](#open)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)           |             |
| public void                                                                                                                               | [open](#open)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlToken](../token/YamlToken.md)>       | [tokenize](#tokenize)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source) |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlTokenType](../token/YamlTokenType.md)> | [getTokenTypes](#gettokentypes)()                                                                                          |             |
| public [YamlToken](../token/YamlToken.md)                                                                                                 | [nextToken](#nexttoken)()                                                                                                  |             |


### Methods inherited from [AbstractYamlProcessor](AbstractYamlProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getReporter, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlTokenizer](YamlTokenizer.md) __self__()</span>



**Overrides:**

[AbstractYamlProcessor](../cascara.lang.yaml/yaml/processor/AbstractYamlProcessor.md#self)


---

### getLine

<span style="font-family: monospace; font-size: 80%;">public int __getLine__()</span>




---

### getColumn

<span style="font-family: monospace; font-size: 80%;">public int __getColumn__()</span>




---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### open

<span style="font-family: monospace; font-size: 80%;">public void __open__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### tokenize

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlToken](../token/YamlToken.md)> __tokenize__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source)</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### getTokenTypes

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[YamlTokenType](../token/YamlTokenType.md)> __getTokenTypes__()</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

### nextToken

<span style="font-family: monospace; font-size: 80%;">public [YamlToken](../token/YamlToken.md) __nextToken__()</span>



**Specified By:**

[Tokenizer](../../../cascara.common/lang/processor/Tokenizer.md)


---

