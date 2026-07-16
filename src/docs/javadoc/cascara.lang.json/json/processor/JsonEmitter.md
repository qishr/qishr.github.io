Package [io.github.qishr.cascara.lang.json.processor](index.md)

# Class JsonEmitter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.json.processor.AbstractJsonProcessor](AbstractJsonProcessor.md)<[io.github.qishr.cascara.lang.json.processor.JsonEmitter](JsonEmitter.md)><br/>
                io.github.qishr.cascara.lang.json.processor.JsonEmitter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Emitter](../../../cascara.common/lang/processor/Emitter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonEmitter__<br/>extends [AbstractJsonProcessor](AbstractJsonProcessor.md)<[JsonEmitter](JsonEmitter.md)>
</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| JsonEmitter() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                        | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [JsonEmitter](JsonEmitter.md)                                                             | [self](#self)()                                                                                                               |             |
| public [ContentType](../../../cascara.common/util/ContentType.md)                                   | [getContentType](#getcontenttype)()                                                                                           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [emit](#emit)([JsonNode](../ast/JsonNode.md) root)                                                                            |             |
| public void                                                                                         | [emitScalar](#emitscalar)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |
| public void                                                                                         | [emitMapStart](#emitmapstart)()                                                                                               |             |
| public void                                                                                         | [emitMapEnd](#emitmapend)()                                                                                                   |             |
| public void                                                                                         | [emitSequenceStart](#emitsequencestart)()                                                                                     |             |
| public void                                                                                         | [emitSequenceEnd](#emitsequenceend)()                                                                                         |             |
| public void                                                                                         | [emitPropertySeparator](#emitpropertyseparator)()                                                                             |             |
| public void                                                                                         | [emitItemSeparator](#emititemseparator)()                                                                                     |             |
| public void                                                                                         | [emitNewLine](#emitnewline)()                                                                                                 |             |
| public void                                                                                         | [indent](#indent)()                                                                                                           |             |
| public void                                                                                         | [dedent](#dedent)()                                                                                                           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getOutput](#getoutput)()                                                                                                     |             |
| public [JsonEmitter](JsonEmitter.md)                                                                | [setOptions](#setoptions)([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)                 |             |
| public [JsonEmitter](JsonEmitter.md)                                                                | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)                              |             |


### Methods inherited from [AbstractJsonProcessor](AbstractJsonProcessor.md)

getOptions, getServiceProperties, getVersion, getReporter, getTextResource


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [JsonEmitter](JsonEmitter.md) __self__()</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#self)


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../cascara.common/util/ContentType.md) __getContentType__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)

**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#getcontenttype)


---

### emit

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __emit__([JsonNode](../ast/JsonNode.md) root)</span>




---

### emitScalar

<span style="font-family: monospace; font-size: 80%;">public void __emitScalar__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### emitMapStart

<span style="font-family: monospace; font-size: 80%;">public void __emitMapStart__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### emitMapEnd

<span style="font-family: monospace; font-size: 80%;">public void __emitMapEnd__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### emitSequenceStart

<span style="font-family: monospace; font-size: 80%;">public void __emitSequenceStart__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### emitSequenceEnd

<span style="font-family: monospace; font-size: 80%;">public void __emitSequenceEnd__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### emitPropertySeparator

<span style="font-family: monospace; font-size: 80%;">public void __emitPropertySeparator__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### emitItemSeparator

<span style="font-family: monospace; font-size: 80%;">public void __emitItemSeparator__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### emitNewLine

<span style="font-family: monospace; font-size: 80%;">public void __emitNewLine__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### indent

<span style="font-family: monospace; font-size: 80%;">public void __indent__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### dedent

<span style="font-family: monospace; font-size: 80%;">public void __dedent__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### getOutput

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOutput__()</span>



**Specified By:**

[Emitter](../../../cascara.common/lang/processor/Emitter.md)


---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [JsonEmitter](JsonEmitter.md) __setOptions__([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#setoptions)


---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [JsonEmitter](JsonEmitter.md) __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>



**Overrides:**

[AbstractJsonProcessor](../cascara.lang.json/json/processor/AbstractJsonProcessor.md#setreporter)


---

