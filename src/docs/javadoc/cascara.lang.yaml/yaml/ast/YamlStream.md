Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlStream
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlStream<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlStream__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                          | Description |
|------------------------------------------------------|-------------|
| YamlStream()                                         |             |
| YamlStream([YamlToken](../token/YamlToken.md) token) |             |



## Method Summary

| Modifier and Type                                                                                                                  | Method                                                                | Description |
|------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|-------------|
| public void                                                                                                                        | [addDocument](#adddocument)([YamlDocument](YamlDocument.md) document) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDocument](YamlDocument.md)>   | [getDocuments](#getdocuments)()                                       |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlComment](YamlComment.md)>     | [getComments](#getcomments)()                                         |             |
| public boolean                                                                                                                     | [isEmpty](#isempty)()                                                 |             |
| public void                                                                                                                        | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)              |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> | [getChildren](#getchildren)()                                         |             |


### Methods inherited from [YamlNode](YamlNode.md)

getNodeStyle, getOptions, getTag, setAnchor, getStartColumn, addComments, getStartLine, hashCode, getEndColumn, getEndLine, setTag, setNodeStyle, addComment, getToken, getAnchor, equals


## Method Details

### addDocument

<span style="font-family: monospace; font-size: 80%;">public void __addDocument__([YamlDocument](YamlDocument.md) document)</span>




---

### getDocuments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDocument](YamlDocument.md)> __getDocuments__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlComment](YamlComment.md)> __getComments__()</span>




---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>




---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#accept)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)> __getChildren__()</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

