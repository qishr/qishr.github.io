Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlPushParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.internal.AbstractYamlProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlProcessor.html)<[io.github.qishr.cascara.lang.yaml.processor.YamlPushParser](YamlPushParser.md)><br/>
                [io.github.qishr.cascara.lang.yaml.internal.AbstractYamlParser](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlParser.html)<[io.github.qishr.cascara.lang.yaml.processor.YamlPushParser](YamlPushParser.md)><br/>
                        io.github.qishr.cascara.lang.yaml.processor.YamlPushParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PushParser](../../cascara.common/lang/processor/PushParser.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlPushParser__<br/>extends [AbstractYamlParser](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlParser.html)<[YamlPushParser](YamlPushParser.md)>
</span>


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| YamlPushParser() |             |



## Method Summary

| Modifier and Type                             | Method                                                                                                                                                                                                     | Description |
|-----------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [YamlPushParser](YamlPushParser.md) | [self](#self)()                                                                                                                                                                                            |             |
| public void                                   | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../cascara.common/lang/streaming/StreamHandler.md) handler) |             |
| protected void                                | [handleEvent](#handleevent)([YamlStreamingEvent](../streaming/YamlStreamingEvent.md) event)                                                                                                                |             |



## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlPushParser](YamlPushParser.md) __self__()</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public void __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../cascara.common/lang/streaming/StreamHandler.md) handler)</span>



**Throws:**

[ParserException](../../cascara.common/lang/exception/ParserException.md)

**Specified By:**

[PushParser](../../cascara.common/lang/processor/PushParser.md)


---

### handleEvent

<span style="font-family: monospace; font-size: 80%;">protected void __handleEvent__([YamlStreamingEvent](../streaming/YamlStreamingEvent.md) event)</span>




---

