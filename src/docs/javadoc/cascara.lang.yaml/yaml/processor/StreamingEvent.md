Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class StreamingEvent
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.processor.StreamingEvent<br/>
<br/>
All Implemented Interfaces:<br/>
    [Event](../../../cascara.common/lang/streaming/Event.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __StreamingEvent__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                   | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| StreamingEvent(int lineNumber, int columnNumber, [EventType](../../../cascara.common/lang/streaming/EventType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------|-------------|
| public [EventType](../../../cascara.common/lang/streaming/EventType.md)                             | [getType](#gettype)()                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()           |             |
| public long                                                                                         | [getLineNumber](#getlinenumber)()     |             |
| public long                                                                                         | [getColumnNumber](#getcolumnnumber)() |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()               |             |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public [EventType](../../../cascara.common/lang/streaming/EventType.md) __getType__()</span>



**Specified By:**

[Event](../../../cascara.common/lang/streaming/Event.md)


---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>



**Specified By:**

[Event](../../../cascara.common/lang/streaming/Event.md)


---

### getLineNumber

<span style="font-family: monospace; font-size: 80%;">public long __getLineNumber__()</span>



**Specified By:**

[Event](../../../cascara.common/lang/streaming/Event.md)


---

### getColumnNumber

<span style="font-family: monospace; font-size: 80%;">public long __getColumnNumber__()</span>



**Specified By:**

[Event](../../../cascara.common/lang/streaming/Event.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

