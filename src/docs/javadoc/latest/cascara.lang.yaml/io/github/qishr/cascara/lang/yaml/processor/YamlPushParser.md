Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlPushParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.internal.AbstractYamlProcessor](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlProcessor.html)<[io.github.qishr.cascara.lang.yaml.processor.YamlPushParser](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlPushParser.md)><br/>
                [io.github.qishr.cascara.lang.yaml.internal.AbstractYamlParser](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlParser.html)<[io.github.qishr.cascara.lang.yaml.processor.YamlPushParser](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlPushParser.md)><br/>
                        io.github.qishr.cascara.lang.yaml.processor.YamlPushParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PushParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/PushParser.md)<[YamlStreamingEventType](../../../../../../../io/github/qishr/cascara/lang/yaml/streaming/YamlStreamingEventType.md), [YamlStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/yaml/streaming/YamlStreamingEvent.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlPushParser__<br/>extends [AbstractYamlParser](https://docs.oracle.com/en/java/javase/24/docs/api/cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/internal/AbstractYamlParser.html)<[YamlPushParser](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlPushParser.md)>
</span>


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| YamlPushParser() |             |



## Method Summary

| Modifier and Type                                                                                              | Method                                                                                                                                                                                                                                                                                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [YamlPushParser](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlPushParser.md) | [self](#self)()                                                                                                                                                                                                                                                                                                                                                           |             |
| public void                                                                                                    | [parse](#parse)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/streaming/StreamHandler.md)<[YamlStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/yaml/streaming/YamlStreamingEvent.md)> handler) |             |
| protected void                                                                                                 | [handleEvent](#handleevent)([YamlStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/yaml/streaming/YamlStreamingEvent.md) event)                                                                                                                                                                                                                           |             |



## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlPushParser](../../../../../../../io/github/qishr/cascara/lang/yaml/processor/YamlPushParser.md) __self__()</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public void __parse__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input, [StreamHandler](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/streaming/StreamHandler.md)<[YamlStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/yaml/streaming/YamlStreamingEvent.md)> handler)</span>



**Throws:**

[ParserException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/diagnostic/ParserException.md)

**Specified By:**

[PushParser](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/processor/PushParser.md)


---

### handleEvent

<span style="font-family: monospace; font-size: 80%;">protected void __handleEvent__([YamlStreamingEvent](../../../../../../../io/github/qishr/cascara/lang/yaml/streaming/YamlStreamingEvent.md) event)</span>




---

