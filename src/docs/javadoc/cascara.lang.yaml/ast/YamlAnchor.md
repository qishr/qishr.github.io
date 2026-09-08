Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlAnchor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                [io.github.qishr.cascara.lang.yaml.ast.YamlNodeProperty](YamlNodeProperty.md)<br/>
                        io.github.qishr.cascara.lang.yaml.ast.YamlAnchor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlAnchor__<br/>extends [YamlNodeProperty](YamlNodeProperty.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                           | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlAnchor([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [YamlNode](YamlNode.md) node)                                           |             |
| YamlAnchor([YamlToken](../token/YamlToken.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [YamlNode](YamlNode.md) node) |             |
| YamlAnchor([YamlToken](../token/YamlToken.md) token)                                                                                                                                  |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                            | Description                                                |
|--------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getName](#getname)()                                                                                             |                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                                                                     |                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [asString](#asstring)()                                                                                           |                                                            |
| public boolean                                                                                                           | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) |                                                            |
| public int                                                                                                               | [hashCode](#hashcode)()                                                                                           | Generates a hash code based on the node's logical content. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [toString](#tostring)()                                                                                           |                                                            |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [extractAnchorName](#extractanchorname)([YamlToken](../token/YamlToken.md) anchorToken)                           |                                                            |


### Methods inherited from [YamlNodeProperty](YamlNodeProperty.md)

accept

### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, setResolvedTag, setSemanticColumn


## Method Details

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



**Overrides:**

[YamlNodeProperty](../cascara.lang.yaml/ast/YamlNodeProperty.md#getchildren)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>

Generates a hash code based on the node's logical content.

**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#tostring)


---

### extractAnchorName

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __extractAnchorName__([YamlToken](../token/YamlToken.md) anchorToken)</span>




---

