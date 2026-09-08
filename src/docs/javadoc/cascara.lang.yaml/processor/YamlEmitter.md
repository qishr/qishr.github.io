Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class YamlEmitter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.processor.YamlEmitter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlEmitter__</span>

Responsible for converting a [YamlNode](../ast/YamlNode.md) AST back into a valid YAML string.This emitter is high-fidelity: it prioritizes preserving the original [NodeStyle](../util/NodeStyle.md)
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


