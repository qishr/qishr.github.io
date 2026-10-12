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

| Modifier and Type                                                                                            | Method                                                                                                                                                | Description                                                                                                                        |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| public [YamlAliasResolver](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlAliasResolver.md) | [setReporter](#setreporter)([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter) |                                                                                                                                    |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                    | [resolve](#resolve)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) root)                                          | Traverses the document to collect all anchors, then replaces all YamlAlias nodes with their dereferenced target nodes.             |
| public [YamlStream](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlStream.md)                | [resolve](#resolve)([YamlStream](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlStream.md) stream)                                    | Resolves aliases across all documents in a stream, maintaining a single anchor mapping table across document boundaries if needed. |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [YamlAliasResolver](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlAliasResolver.md) __setReporter__([Reporter](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __resolve__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) root)</span>

Traverses the document to collect all anchors, then replaces
all YamlAlias nodes with their dereferenced target nodes.


---

### resolve

<span style="font-family: monospace; font-size: 80%;">public [YamlStream](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlStream.md) __resolve__([YamlStream](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlStream.md) stream)</span>

Resolves aliases across all documents in a stream, maintaining a single
anchor mapping table across document boundaries if needed.


---

