Package [io.github.qishr.cascara.lang.yaml.streaming](index.md)

# Class YamlStreamingEvent
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.streaming.YamlStreamingEvent<br/>
<br/>
All Implemented Interfaces:<br/>
    [StreamingEvent](../../cascara.common/lang/streaming/StreamingEvent.md)<[YamlStreamingEventType](YamlStreamingEventType.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlStreamingEvent__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlStreamingEvent(int lineNumber, int columnNumber, [YamlStreamingEventType](YamlStreamingEventType.md) type, [NodeStyle](../util/NodeStyle.md) nodeStyle, [ScalarStyle](../util/ScalarStyle.md) scalarStyle, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) tag, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resolvedTag, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) anchor, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lexeme, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------|-------------|
| public [YamlStreamingEventType](YamlStreamingEventType.md)                                          | [getType](#gettype)()                 |             |
| public [NodeStyle](../util/NodeStyle.md)                                                            | [getNodeStyle](#getnodestyle)()       |             |
| public [ScalarStyle](../util/ScalarStyle.md)                                                        | [getScalarStyle](#getscalarstyle)()   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLexeme](#getlexeme)()             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getTag](#gettag)()                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getResolvedTag](#getresolvedtag)()   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getAnchor](#getanchor)()             |             |
| public long                                                                                         | [getLineNumber](#getlinenumber)()     |             |
| public long                                                                                         | [getColumnNumber](#getcolumnnumber)() |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()               |             |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public [YamlStreamingEventType](YamlStreamingEventType.md) __getType__()</span>



**Specified By:**

[StreamingEvent](../../cascara.common/lang/streaming/StreamingEvent.md)


---

### getNodeStyle

<span style="font-family: monospace; font-size: 80%;">public [NodeStyle](../util/NodeStyle.md) __getNodeStyle__()</span>




---

### getScalarStyle

<span style="font-family: monospace; font-size: 80%;">public [ScalarStyle](../util/ScalarStyle.md) __getScalarStyle__()</span>




---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[StreamingEvent](../../cascara.common/lang/streaming/StreamingEvent.md)


---

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>




---

### getTag

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTag__()</span>




---

### getResolvedTag

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getResolvedTag__()</span>




---

### getAnchor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAnchor__()</span>




---

### getLineNumber

<span style="font-family: monospace; font-size: 80%;">public long __getLineNumber__()</span>



**Specified By:**

[StreamingEvent](../../cascara.common/lang/streaming/StreamingEvent.md)


---

### getColumnNumber

<span style="font-family: monospace; font-size: 80%;">public long __getColumnNumber__()</span>



**Specified By:**

[StreamingEvent](../../cascara.common/lang/streaming/StreamingEvent.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

