Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlTagDirective
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                [io.github.qishr.cascara.lang.yaml.ast.YamlDirective](YamlDirective.md)<br/>
                        io.github.qishr.cascara.lang.yaml.ast.YamlTagDirective<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlTagDirective__<br/>extends [YamlDirective](YamlDirective.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlTagDirective([YamlToken](../token/YamlToken.md) token, [DirectiveType](../util/DirectiveType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                  | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getName](#getname)()   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getValue](#getvalue)() |             |


### Methods inherited from [YamlDirective](YamlDirective.md)

getType, getContent, getChildren, accept

### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getValue__()</span>




---

