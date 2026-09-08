Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlTag
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                [io.github.qishr.cascara.lang.yaml.ast.YamlNodeProperty](YamlNodeProperty.md)<br/>
                        io.github.qishr.cascara.lang.yaml.ast.YamlTag<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlTag__<br/>extends [YamlNodeProperty](YamlNodeProperty.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                          | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlTag([YamlToken](../token/YamlToken.md) token, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) handle, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) handleName, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) suffix) |             |
| YamlTag([YamlToken](../token/YamlToken.md) token)                                                                                                                                                                                                                                                                                                                    |             |
| YamlTag()                                                                                                                                                                                                                                                                                                                                                            |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                       | Description                                                |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getRawValue](#getrawvalue)()                                                                                                                |                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getResolvedValue](#getresolvedvalue)()                                                                                                      |                                                            |
| public [YamlTag](YamlTag.md)                                                                        | [setResolvedValue](#setresolvedvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resolved) |                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getHandle](#gethandle)()                                                                                                                    |                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getHandleName](#gethandlename)()                                                                                                            |                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getSuffix](#getsuffix)()                                                                                                                    |                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [asString](#asstring)()                                                                                                                      |                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                                      |                                                            |
| public boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                            |                                                            |
| public int                                                                                          | [hashCode](#hashcode)()                                                                                                                      | Generates a hash code based on the node's logical content. |


### Methods inherited from [YamlNode](YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, setResolvedTag, setSemanticColumn

### Methods inherited from [YamlNodeProperty](YamlNodeProperty.md)

getChildren, accept


## Method Details

### getRawValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRawValue__()</span>




---

### getResolvedValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getResolvedValue__()</span>




---

### setResolvedValue

<span style="font-family: monospace; font-size: 80%;">public [YamlTag](YamlTag.md) __setResolvedValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resolved)</span>




---

### getHandle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getHandle__()</span>




---

### getHandleName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getHandleName__()</span>




---

### getSuffix

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSuffix__()</span>




---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/ast/YamlNode.md#tostring)


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

