Package [io.github.qishr.cascara.common.lang.streaming](index.md)

# Interface Event
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.streaming.Event<br/>
<br/>
All Known Implementing Classes:<br/>
    [StreamingEvent](../../../cascara.lang.yaml/yaml/processor/StreamingEvent.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public interface __Event__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                | Description |
|--------------------------------------------------------------------------------------------------------------|---------------------------------------|-------------|
| public abstract [EventType](EventType.md)                                                                    | [getType](#gettype)()                 |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getContent](#getcontent)()           |             |
| public abstract long                                                                                         | [getLineNumber](#getlinenumber)()     |             |
| public abstract long                                                                                         | [getColumnNumber](#getcolumnnumber)() |             |



## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public abstract [EventType](EventType.md) __getType__()</span>




---

### getContent

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>




---

### getLineNumber

<span style="font-family: monospace; font-size: 80%;">public abstract long __getLineNumber__()</span>




---

### getColumnNumber

<span style="font-family: monospace; font-size: 80%;">public abstract long __getColumnNumber__()</span>




---

