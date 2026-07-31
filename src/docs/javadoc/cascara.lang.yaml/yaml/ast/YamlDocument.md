Package [io.github.qishr.cascara.lang.yaml.ast](index.md)

# Class YamlDocument
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.ast.YamlNode](YamlNode.md)<br/>
                io.github.qishr.cascara.lang.yaml.ast.YamlDocument<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlDocument__<br/>extends [YamlNode](YamlNode.md)
</span>


## Constructor Summary

| Constructor                                            | Description |
|--------------------------------------------------------|-------------|
| YamlDocument([YamlToken](../token/YamlToken.md) token) |             |



## Method Summary

| Modifier and Type                                                                                                                  | Method                                                                     | Description |
|------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|-------------|
| public void                                                                                                                        | [addDirective](#adddirective)([YamlDirective](YamlDirective.md) directive) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDirective](YamlDirective.md)> | [getDirectives](#getdirectives)()                                          |             |
| public [YamlNode](YamlNode.md)                                                                                                     | [getBody](#getbody)()                                                      |             |
| public void                                                                                                                        | [setBody](#setbody)([YamlNode](YamlNode.md) body)                          |             |
| public void                                                                                                                        | [accept](#accept)([YamlVisitor](YamlVisitor.md) visitor)                   |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)>           | [getChildren](#getchildren)()                                              |             |


### Methods inherited from [YamlNode](YamlNode.md)

getNodeStyle, getOptions, getTag, setAnchor, getStartColumn, addComments, getStartLine, hashCode, getEndColumn, getEndLine, getComments, setTag, setNodeStyle, addComment, getToken, getAnchor, equals


## Method Details

### addDirective

<span style="font-family: monospace; font-size: 80%;">public void __addDirective__([YamlDirective](YamlDirective.md) directive)</span>




---

### getDirectives

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlDirective](YamlDirective.md)> __getDirectives__()</span>




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

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[YamlNode](YamlNode.md)> __getChildren__()</span>



**Overrides:**

[YamlNode](../cascara.lang.yaml/yaml/ast/YamlNode.md#getchildren)


---

