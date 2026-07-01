Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlStreamNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlStreamNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlStreamNode__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                          | Description |
|--------------------------------------|-------------|
| YamlStreamNode()                     |             |
| YamlStreamNode(int line, int column) |             |



## Method Summary

| Modifier and Type                                                                                                                        | Method                                                                        | Description |
|------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|-------------|
| public void                                                                                                                              | [addDocument](#adddocument)([YamlDocumentNode](YamlDocumentNode.md) document) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDocumentNode](YamlDocumentNode.md)> | [getDocuments](#getdocuments)()                                               |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlCommentNode](YamlCommentNode.md)>   | [getComments](#getcomments)()                                                 |             |
| public boolean                                                                                                                           | [isEmpty](#isempty)()                                                         |             |
| public void                                                                                                                              | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)                      |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)>       | [getChildren](#getchildren)()                                                 |             |


### Methods inherited from [YamlNode](YamlNode.md)

getEndColumn, getEndLine, setAnchor, getStartColumn, getToken, addComments, getAnchor, equals, getStartLine, addComment, setToken, hashCode


## Method Details

### addDocument

<span style="font-family: monospace; font-size: 80%;">public void __addDocument__([YamlDocumentNode](YamlDocumentNode.md) document)</span>




---

### getDocuments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDocumentNode](YamlDocumentNode.md)> __getDocuments__()</span>




---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlCommentNode](YamlCommentNode.md)> __getComments__()</span>




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

