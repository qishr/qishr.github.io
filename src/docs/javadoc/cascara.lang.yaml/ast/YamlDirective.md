Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlDirective
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlDirective<br/>
<br/>
Direct Known Subtypes:<br/>
    [YamlTagDirective](YamlTagDirective.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlDirective__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                   | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlDirective([YamlToken](../token/YamlToken.md) token, [DirectiveType](../util/DirectiveType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content) |             |



## Method Summary

| Modifier and Type                                                                                                                  | Method                                                           | Description |
|------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|-------------|
| public [DirectiveType](../util/DirectiveType.md)                                                                                   | [getType](#gettype)()                                            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                | [getContent](#getcontent)()                                      |             |
| public void                                                                                                                        | [accept](#accept)([YamlVisitor](../util/YamlVisitor.md) visitor) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                    |             |


### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### getType

<span style="font-family: monospace; font-size: 80%;">public [DirectiveType](../util/DirectiveType.md) __getType__()</span>




---

### getContent

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContent__()</span>




---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#accept)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> __getChildren__()</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#getchildren)


---

