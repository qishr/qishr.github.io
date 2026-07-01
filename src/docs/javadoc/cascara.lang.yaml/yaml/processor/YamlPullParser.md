Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlPullParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.processor.AbstractYamlProcessor](AbstractYamlProcessor.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlPullParser](YamlPullParser.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlPullParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [PullParser](../../../cascara.common/lang/processor/PullParser.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlPullParser__<br/>extends [AbstractYamlProcessor](AbstractYamlProcessor.md)<[YamlPullParser](YamlPullParser.md)>
</span>


## Constructor Summary

| Constructor                                                                                                                | Description |
|----------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlPullParser([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) input) |             |



## Method Summary

| Modifier and Type                                               | Method                | Description |
|-----------------------------------------------------------------|-----------------------|-------------|
| protected [YamlPullParser](YamlPullParser.md)                   | [self](#self)()       |             |
| public boolean                                                  | [hasNext](#hasnext)() |             |
| public [Event](../../../cascara.common/lang/streaming/Event.md) | [next](#next)()       |             |
| public void                                                     | [close](#close)()     |             |


### Methods inherited from [AbstractYamlProcessor](AbstractYamlProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getReporter, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlPullParser](YamlPullParser.md) __self__()</span>



**Overrides:**

[AbstractYamlProcessor](../cascara.lang.yaml/yaml/processor/AbstractYamlProcessor.md#self)


---

### hasNext

<span style="font-family: monospace; font-size: 80%;">public boolean __hasNext__()</span>



**Specified By:**

[PullParser](../../../cascara.common/lang/processor/PullParser.md)


---

### next

<span style="font-family: monospace; font-size: 80%;">public [Event](../../../cascara.common/lang/streaming/Event.md) __next__()</span>



**Specified By:**

[PullParser](../../../cascara.common/lang/processor/PullParser.md)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

