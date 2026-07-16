Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlEmitter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.processor.AbstractYamlProcessor](AbstractYamlProcessor.md)<[io.github.qishr.cascara.lang.yaml.processor.YamlEmitter](YamlEmitter.md)><br/>
                io.github.qishr.cascara.lang.yaml.processor.YamlEmitter<br/>
<br/>
All Implemented Interfaces:<br/>
    [Emitter](../../cascara.common/lang/processor/Emitter.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlEmitter__<br/>extends [AbstractYamlProcessor](AbstractYamlProcessor.md)<[YamlEmitter](YamlEmitter.md)>
</span>

Responsible for converting a [YamlNode](../ast/YamlNode.md) AST back into a valid YAML string.This emitter is high-fidelity: it prioritizes preserving the original [CollectionStyle](../ast/CollectionStyle.md)
and [QuoteStyle](../../cascara.common/lang/util/QuoteStyle.md) of nodes while ensuring that comments are placed correctly relative
to their owner nodes.

### Indentation Logic
The emitter maintains a virtual column through the `indent` parameters passed
during recursive calls. It handles special cases like "compact" sequences where
the mapping starts on the same line as the sequence dash (`- key: value`).


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| YamlEmitter() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                        | Description                                                                  |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| protected [YamlEmitter](YamlEmitter.md)                                                             | [self](#self)()                                                                                                               |                                                                              |
| public void                                                                                         | [emitScalar](#emitscalar)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |                                                                              |
| public void                                                                                         | [emitMapStart](#emitmapstart)()                                                                                               |                                                                              |
| public void                                                                                         | [emitMapEnd](#emitmapend)()                                                                                                   |                                                                              |
| public void                                                                                         | [emitSequenceStart](#emitsequencestart)()                                                                                     |                                                                              |
| public void                                                                                         | [emitSequenceEnd](#emitsequenceend)()                                                                                         |                                                                              |
| public void                                                                                         | [emitPropertySeparator](#emitpropertyseparator)()                                                                             |                                                                              |
| public void                                                                                         | [emitItemSeparator](#emititemseparator)()                                                                                     |                                                                              |
| public void                                                                                         | [emitNewLine](#emitnewline)()                                                                                                 |                                                                              |
| public void                                                                                         | [indent](#indent)()                                                                                                           |                                                                              |
| public void                                                                                         | [dedent](#dedent)()                                                                                                           |                                                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getOutput](#getoutput)()                                                                                                     |                                                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [emit](#emit)([YamlNode](../ast/YamlNode.md) root)                                                                            | Primary entry point for emitting a full document or a multi-document stream. |


### Methods inherited from [AbstractYamlProcessor](AbstractYamlProcessor.md)

setReporter, getOptions, getContentType, getServiceProperties, getReporter, setOptions


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected [YamlEmitter](YamlEmitter.md) __self__()</span>



**Overrides:**

[AbstractYamlProcessor](../cascara.lang.yaml/processor/AbstractYamlProcessor.md#self)


---

### emitScalar

<span style="font-family: monospace; font-size: 80%;">public void __emitScalar__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emitMapStart

<span style="font-family: monospace; font-size: 80%;">public void __emitMapStart__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emitMapEnd

<span style="font-family: monospace; font-size: 80%;">public void __emitMapEnd__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emitSequenceStart

<span style="font-family: monospace; font-size: 80%;">public void __emitSequenceStart__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emitSequenceEnd

<span style="font-family: monospace; font-size: 80%;">public void __emitSequenceEnd__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emitPropertySeparator

<span style="font-family: monospace; font-size: 80%;">public void __emitPropertySeparator__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emitItemSeparator

<span style="font-family: monospace; font-size: 80%;">public void __emitItemSeparator__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emitNewLine

<span style="font-family: monospace; font-size: 80%;">public void __emitNewLine__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### indent

<span style="font-family: monospace; font-size: 80%;">public void __indent__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### dedent

<span style="font-family: monospace; font-size: 80%;">public void __dedent__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### getOutput

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOutput__()</span>



**Specified By:**

[Emitter](../../cascara.common/lang/processor/Emitter.md)


---

### emit

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __emit__([YamlNode](../ast/YamlNode.md) root)</span>

Primary entry point for emitting a full document or a multi-document stream.

**Parameters:**

`root` - AST root (can be a YamlStreamNode, YamlMapNode, YamlSequenceNode, or YamlScalarNode).

**Returns:**

A formatted YAML string.


---

