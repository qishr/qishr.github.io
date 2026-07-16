Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface PushParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.PushParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](Processor.md)

All Known Implementing Classes:<br/>
    [YamlPushParser](../../../cascara.lang.yaml/yaml/processor/YamlPushParser.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Beta<br/>
public interface __PushParser__</span>


## Method Summary

| Modifier and Type    | Method                                                                                                                                                                              | Description                                                                                                                   |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| public abstract void | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../streaming/StreamHandler.md) handler) | Eagerly drives the input stream to completion, passing every structural event encountered directly to the registered handler. |



## Method Details

### parse

<span style="font-family: monospace; font-size: 80%;">public abstract void __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../streaming/StreamHandler.md) handler)</span>

Eagerly drives the input stream to completion, passing every
structural event encountered directly to the registered handler.

**Throws:**

[ParserException](../exception/ParserException.md)


---

