Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface PullParser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.PullParser<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](Processor.md), [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[StreamingEvent](../streaming/StreamingEvent.md)>, [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)

All Known Implementing Classes:<br/>
    [YamlPullParser](../../../cascara.lang.yaml/yaml/processor/YamlPullParser.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Beta<br/>
public interface __PullParser__</span>


## Method Summary

| Modifier and Type                                                | Method                | Description                                              |
|------------------------------------------------------------------|-----------------------|----------------------------------------------------------|
| public abstract [StreamingEvent](../streaming/StreamingEvent.md) | [next](#next)()       | Advances to the next event in the stream and returns it. |
| public abstract boolean                                          | [hasNext](#hasnext)() | Checks if the parser can continue advancing.             |



## Method Details

### next

<span style="font-family: monospace; font-size: 80%;">public abstract [StreamingEvent](../streaming/StreamingEvent.md) __next__()</span>

Advances to the next event in the stream and returns it.Returns null (or an END_DOCUMENT event) when the stream is exhausted.

**Throws:**

[ParserException](../exception/ParserException.md)

**Specified By:**

[Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)


---

### hasNext

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hasNext__()</span>

Checks if the parser can continue advancing.

**Throws:**

[ParserException](../exception/ParserException.md)

**Specified By:**

[Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)


---

