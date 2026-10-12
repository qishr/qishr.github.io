Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlDocument
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlDocument<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlDocument__<br/>extends [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlDocument([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token)                                                                                                                                                                                                                                                                                             |             |
| YamlDocument([YamlToken](../../../../../../../io/github/qishr/cascara/lang/yaml/token/YamlToken.md) token, [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) body, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md)> directives) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                   | Method                                                                                                                                | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                         | [addDirective](#adddirective)([YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md) directive) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md)>       | [getDirectives](#getdirectives)()                                                                                                     |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlTagDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlTagDirective.md)> | [getTagsDirectives](#gettagsdirectives)()                                                                                             |             |
| public [YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md)                                                                                                 | [getYamlDirective](#getyamldirective)()                                                                                               |             |
| public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)                                                                                                           | [getBody](#getbody)()                                                                                                                 |             |
| public void                                                                                                                                                                                         | [setBody](#setbody)([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) body)                          |             |
| public boolean                                                                                                                                                                                      | [hasEndMarker](#hasendmarker)()                                                                                                       |             |
| public void                                                                                                                                                                                         | [setHasEndMarker](#sethasendmarker)(boolean b)                                                                                        |             |
| public boolean                                                                                                                                                                                      | [hasStartMarker](#hasstartmarker)()                                                                                                   |             |
| public void                                                                                                                                                                                         | [setHasStartMarker](#sethasstartmarker)(boolean b)                                                                                    |             |
| public void                                                                                                                                                                                         | [accept](#accept)([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)                  |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)>                 | [getChildren](#getchildren)()                                                                                                         |             |


### Methods inherited from [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)

isPreceededByNewLine, getOptions, setFileEndsWithNewLine, getTag, setAnchor, addComments, getStartLine, hashCode, fileEndsWithNewLine, getEndColumn, setTag, addComment, setPreceededByNewLine, getResolvedTag, getToken, getAnchor, getNodeStyle, toString, setNodeStyle, getStartColumn, getSemanticColumn, getEndLine, getComments, getProperties, equals, setResolvedTag, setSemanticColumn


## Method Details

### addDirective

<span style="font-family: monospace; font-size: 80%;">public void __addDirective__([YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md) directive)</span>




---

### getDirectives

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md)> __getDirectives__()</span>




---

### getTagsDirectives

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlTagDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlTagDirective.md)> __getTagsDirectives__()</span>




---

### getYamlDirective

<span style="font-family: monospace; font-size: 80%;">public [YamlDirective](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlDirective.md) __getYamlDirective__()</span>




---

### getBody

<span style="font-family: monospace; font-size: 80%;">public [YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) __getBody__()</span>




---

### setBody

<span style="font-family: monospace; font-size: 80%;">public void __setBody__([YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md) body)</span>




---

### hasEndMarker

<span style="font-family: monospace; font-size: 80%;">public boolean __hasEndMarker__()</span>




---

### setHasEndMarker

<span style="font-family: monospace; font-size: 80%;">public void __setHasEndMarker__(boolean b)</span>




---

### hasStartMarker

<span style="font-family: monospace; font-size: 80%;">public boolean __hasStartMarker__()</span>




---

### setHasStartMarker

<span style="font-family: monospace; font-size: 80%;">public void __setHasStartMarker__(boolean b)</span>




---

### accept

<span style="font-family: monospace; font-size: 80%;">public void __accept__([YamlVisitor](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlVisitor.md) visitor)</span>



**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#accept)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](../../../../../../../io/github/qishr/cascara/lang/yaml/ast/YamlNode.md)> __getChildren__()</span>



**Overrides:**

[YamlNode](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/ast/YamlNode.md#getchildren)


---

