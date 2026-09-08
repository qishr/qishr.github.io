Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Interface YamlCollection
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.ast.YamlCollection<br/>
<br/>
All Known Implementing Classes:<br/>
    [YamlMap](YamlMap.md), [YamlSequence](YamlSequence.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __YamlCollection__</span>


## Method Summary

| Modifier and Type                                 | Method                                    | Description |
|---------------------------------------------------|-------------------------------------------|-------------|
| public abstract boolean                           | [isEmpty](#isempty)()                     |             |
| public abstract int                               | [size](#size)()                           |             |
| public abstract [NodeStyle](../util/NodeStyle.md) | [getNodeStyle](#getnodestyle)()           |             |
| public abstract int                               | [getStartLine](#getstartline)()           |             |
| public abstract int                               | [getStartColumn](#getstartcolumn)()       |             |
| public abstract int                               | [getSemanticColumn](#getsemanticcolumn)() |             |



## Method Details

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isEmpty__()</span>




---

### size

<span style="font-family: monospace; font-size: 80%;">public abstract int __size__()</span>




---

### getNodeStyle

<span style="font-family: monospace; font-size: 80%;">public abstract [NodeStyle](../util/NodeStyle.md) __getNodeStyle__()</span>




---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartLine__()</span>




---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public abstract int __getStartColumn__()</span>




---

### getSemanticColumn

<span style="font-family: monospace; font-size: 80%;">public abstract int __getSemanticColumn__()</span>




---

