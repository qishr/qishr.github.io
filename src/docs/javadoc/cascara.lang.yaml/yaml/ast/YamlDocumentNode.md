Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlDocumentNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlDocumentNode<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlDocumentNode__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                            | Description |
|----------------------------------------|-------------|
| YamlDocumentNode(int line, int column) |             |



## Method Summary

| Modifier and Type                                                                                                                          | Method                                                                             | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                | [addDirective](#adddirective)([YamlDirectiveNode](YamlDirectiveNode.md) directive) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDirectiveNode](YamlDirectiveNode.md)> | [getDirectives](#getdirectives)()                                                  |             |
| public [YamlNode](YamlNode.md)                                                                                                             | [getBody](#getbody)()                                                              |             |
| public void                                                                                                                                | [setBody](#setbody)([YamlNode](YamlNode.md) body)                                  |             |
| public void                                                                                                                                | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)                           |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<? extends [YamlNode](YamlNode.md)>         | [getChildren](#getchildren)()                                                      |             |


### Methods inherited from [YamlNode](YamlNode.md)

setAnchor, getStartColumn, addComments, getStartLine, setToken, hashCode, getEndColumn, getEndLine, getComments, getToken, getAnchor, equals, addComment


## Method Details

### addDirective

<span style="font-family: monospace; font-size: 80%;">public void __addDirective__([YamlDirectiveNode](YamlDirectiveNode.md) directive)</span>




---

### getDirectives

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDirectiveNode](YamlDirectiveNode.md)> __getDirectives__()</span>




---

### getBody

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](YamlNode.md) __getBody__()</span>




---

### setBody

<span style="font-family: monospace; font-size: 80%;">public void __setBody__([YamlNode](YamlNode.md) body)</span>




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

