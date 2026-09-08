Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Class YamlAliasResolver
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.util.YamlAliasResolver<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlAliasResolver__</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| YamlAliasResolver() |             |



## Method Summary

| Modifier and Type                                | Method                                                                                        | Description                                                                                                                        |
|--------------------------------------------------|-----------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| public [YamlAliasResolver](YamlAliasResolver.md) | [setReporter](#setreporter)([Reporter](../../cascara.common/diagnostic/Reporter.md) reporter) |                                                                                                                                    |
| public [YamlNode](../ast/YamlNode.md)            | [resolve](#resolve)([YamlNode](../ast/YamlNode.md) root)                                      | Traverses the document to collect all anchors, then replaces all YamlAlias nodes with their dereferenced target nodes.             |
| public [YamlStream](../ast/YamlStream.md)        | [resolve](#resolve)([YamlStream](../ast/YamlStream.md) stream)                                | Resolves aliases across all documents in a stream, maintaining a single anchor mapping table across document boundaries if needed. |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [YamlAliasResolver](YamlAliasResolver.md) __setReporter__([Reporter](../../cascara.common/diagnostic/Reporter.md) reporter)</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../ast/YamlNode.md) __resolve__([YamlNode](../ast/YamlNode.md) root)</span>

Traverses the document to collect all anchors, then replaces
all YamlAlias nodes with their dereferenced target nodes.


---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [YamlStream](../ast/YamlStream.md) __resolve__([YamlStream](../ast/YamlStream.md) stream)</span>

Resolves aliases across all documents in a stream, maintaining a single
anchor mapping table across document boundaries if needed.


---

