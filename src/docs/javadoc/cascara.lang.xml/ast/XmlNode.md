Package [io.github.qishr.cascara.lang.xml.ast](index.md)

# Class XmlNode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.xml.ast.XmlNode<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstNode](../../cascara.common/lang/ast/AstNode.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __XmlNode__</span>


## Field Summary

| Modifier and Type          | Field                     | Description |
|----------------------------|---------------------------|-------------|
| public Map<String, String> | [attributes](#attributes) |             |
| public List<XmlNode>       | [children](#children)     |             |
| public String              | [name](#name)             |             |
| public String              | [value](#value)           |             |



## Constructor Summary

| Constructor                                                                                                | Description |
|------------------------------------------------------------------------------------------------------------|-------------|
| XmlNode([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                           | Method                                                                                                                                                                                                                                                | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                                                 | [addChild](#addchild)([XmlNode](XmlNode.md) child)                                                                                                                                                                                                    |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlNode](XmlNode.md)>                                                                      | [getChildren](#getchildren)()                                                                                                                                                                                                                         |             |
| public [XmlNode](XmlNode.md)                                                                                                                                                                | [getChild](#getchild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getTextValue](#gettextvalue)()                                                                                                                                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getAttribute](#getattribute)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) attributeName)                                                                                                             |             |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getAttributeNames](#getattributenames)()                                                                                                                                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getName](#getname)()                                                                                                                                                                                                                                 |             |
| public int                                                                                                                                                                                  | [getStartLine](#getstartline)()                                                                                                                                                                                                                       |             |
| public int                                                                                                                                                                                  | [getStartColumn](#getstartcolumn)()                                                                                                                                                                                                                   |             |
| public int                                                                                                                                                                                  | [getEndLine](#getendline)()                                                                                                                                                                                                                           |             |
| public int                                                                                                                                                                                  | [getEndColumn](#getendcolumn)()                                                                                                                                                                                                                       |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../cascara.common/lang/ast/CommentAstNode.md)>                          | [getComments](#getcomments)()                                                                                                                                                                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                         | [getAttributeOrDefault](#getattributeordefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dflt) |             |



## Field Details

### attributes

<span style="font-family: monospace; font-size: 80%;">public Map<String, String> __attributes__</span>




---

### children

<span style="font-family: monospace; font-size: 80%;">public List<XmlNode> __children__</span>




---

### name

<span style="font-family: monospace; font-size: 80%;">public String __name__</span>




---

### value

<span style="font-family: monospace; font-size: 80%;">public String __value__</span>




---


## Method Details

### addChild

<span style="font-family: monospace; font-size: 80%;">public void __addChild__([XmlNode](XmlNode.md) child)</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[XmlNode](XmlNode.md)> __getChildren__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getChild

<span style="font-family: monospace; font-size: 80%;">public [XmlNode](XmlNode.md) __getChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getTextValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTextValue__()</span>




---

### getAttribute

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAttribute__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) attributeName)</span>




---

### getAttributeNames

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getAttributeNames__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getStartLine

<span style="font-family: monospace; font-size: 80%;">public int __getStartLine__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __getStartColumn__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getEndLine

<span style="font-family: monospace; font-size: 80%;">public int __getEndLine__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getEndColumn

<span style="font-family: monospace; font-size: 80%;">public int __getEndColumn__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getComments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommentAstNode](../../cascara.common/lang/ast/CommentAstNode.md)> __getComments__()</span>



**Specified By:**

[AstNode](../../cascara.common/lang/ast/AstNode.md)


---

### getAttributeOrDefault

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getAttributeOrDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) dflt)</span>




---

