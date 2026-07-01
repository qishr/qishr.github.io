Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface Emitter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.Emitter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](Processor.md)

All Known Implementing Classes:<br/>
    [JsonEmitter](../../../cascara.lang.json/json/processor/JsonEmitter.md), [YamlEmitter](../../../cascara.lang.yaml/yaml/processor/YamlEmitter.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Emitter__</span>

A generic interface for emitting structured text.


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                        | Description                                       |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------|
| public abstract void                                                                                         | [emitScalar](#emitscalar)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) | Writes a literal scalar value.                    |
| public abstract void                                                                                         | [emitMapStart](#emitmapstart)()                                                                                               | Signals the start of a mapping/object.            |
| public abstract void                                                                                         | [emitMapEnd](#emitmapend)()                                                                                                   | Signals the end of a mapping/object.              |
| public abstract void                                                                                         | [emitSequenceStart](#emitsequencestart)()                                                                                     | Signals the start of a sequence/list.             |
| public abstract void                                                                                         | [emitSequenceEnd](#emitsequenceend)()                                                                                         | Signals the end of a sequence/list.               |
| public abstract void                                                                                         | [emitPropertySeparator](#emitpropertyseparator)()                                                                             | Writes a separator between key and value.         |
| public abstract void                                                                                         | [emitItemSeparator](#emititemseparator)()                                                                                     | Writes a separator between items in a collection. |
| public abstract void                                                                                         | [emitNewLine](#emitnewline)()                                                                                                 | Manages white-space and indentation.              |
| public abstract void                                                                                         | [indent](#indent)()                                                                                                           |                                                   |
| public abstract void                                                                                         | [dedent](#dedent)()                                                                                                           |                                                   |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getOutput](#getoutput)()                                                                                                     | Returns the final produced string.                |
| public abstract [ContentType](../../util/ContentType.md)                                                     | [getContentType](#getcontenttype)()                                                                                           |                                                   |



## Method Details

### emitScalar

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitScalar__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>

Writes a literal scalar value.


---

### emitMapStart

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitMapStart__()</span>

Signals the start of a mapping/object.


---

### emitMapEnd

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitMapEnd__()</span>

Signals the end of a mapping/object.


---

### emitSequenceStart

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitSequenceStart__()</span>

Signals the start of a sequence/list.


---

### emitSequenceEnd

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitSequenceEnd__()</span>

Signals the end of a sequence/list.


---

### emitPropertySeparator

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitPropertySeparator__()</span>

Writes a separator between key and value.


---

### emitItemSeparator

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitItemSeparator__()</span>

Writes a separator between items in a collection.


---

### emitNewLine

<span style="font-family: monospace; font-size: 80%;">public abstract void __emitNewLine__()</span>

Manages white-space and indentation.


---

### indent

<span style="font-family: monospace; font-size: 80%;">public abstract void __indent__()</span>




---

### dedent

<span style="font-family: monospace; font-size: 80%;">public abstract void __dedent__()</span>




---

### getOutput

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOutput__()</span>

Returns the final produced string.


---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public abstract [ContentType](../../util/ContentType.md) __getContentType__()</span>



**Specified By:**

[Processor](Processor.md)


---

