Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlStreamingEvent
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.processor.YamlStreamingEvent<br/>
<br/>
All Implemented Interfaces:<br/>
    [StreamingEvent](../../../cascara.common/lang/streaming/StreamingEvent.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlStreamingEvent__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlStreamingEvent(int lineNumber, int columnNumber, [StreamingEventType](../../../cascara.common/lang/streaming/StreamingEventType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------|-------------|
| public [StreamingEventType](../../../cascara.common/lang/streaming/StreamingEventType.md)           | [getType](#gettype)()                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()           |             |
| public long                                                                                         | [getLineNumber](#getlinenumber)()     |             |
| public long                                                                                         | [getColumnNumber](#getcolumnnumber)() |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()               |             |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public [StreamingEventType](../../../cascara.common/lang/streaming/StreamingEventType.md) __getType__()</span>



**Specified By:**

[StreamingEvent](../../../cascara.common/lang/streaming/StreamingEvent.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[StreamingEvent](../../../cascara.common/lang/streaming/StreamingEvent.md)


---

### getLineNumber

<span style="font-family: monospace; font-size: 80%;">public long __getLineNumber__()</span>



**Specified By:**

[StreamingEvent](../../../cascara.common/lang/streaming/StreamingEvent.md)


---

### getColumnNumber

<span style="font-family: monospace; font-size: 80%;">public long __getColumnNumber__()</span>



**Specified By:**

[StreamingEvent](../../../cascara.common/lang/streaming/StreamingEvent.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

