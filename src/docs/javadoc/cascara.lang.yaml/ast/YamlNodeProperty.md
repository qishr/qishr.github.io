Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlNodeProperty
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlNodeProperty<br/>
<br/>
Direct Known Subtypes:<br/>
    [YamlAnchor](YamlAnchor.md), [YamlTag](YamlTag.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlNodeProperty__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                | Description |
|------------------------------------------------------------|-------------|
| YamlNodeProperty()                                         |             |
| YamlNodeProperty([YamlToken](../token/YamlToken.md) token) |             |



## Method Summary

| Modifier and Type                                                                                                                  | Method                                                           | Description |
|------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|-------------|
| public void                                                                                                                        | [accept](#accept)([YamlVisitor](../util/YamlVisitor.md) visitor) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                    |             |


### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

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

