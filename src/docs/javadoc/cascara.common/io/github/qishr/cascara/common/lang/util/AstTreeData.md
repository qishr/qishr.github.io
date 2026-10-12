Package [io.github.qishr.cascara.common.lang.util](index.md)

# Class AstTreeData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.AstTreeData<br/>
<br/>
All Implemented Interfaces:<br/>
    [TreeData](../../../../../../../io/github/qishr/cascara/common/data/TreeData.md)<[AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md), [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __AstTreeData__</span>


## Constructor Summary

| Constructor                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------|-------------|
| AstTreeData([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| AstTreeData([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) root)           |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                      | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getNodeName](#getnodename)()                                                                                               |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md)>                                                                                              | [getChildren](#getchildren)()                                                                                               |             |
| public [AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md)                                                                                                                                                                                        | [getParent](#getparent)()                                                                                                   |             |
| public void                                                                                                                                                                                                                                                                               | [setParent](#setparent)([AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md) parent) |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                                   |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                             |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getValue](#getvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)   |             |
| public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)                                                                                                                                                                                                 | [getPayload](#getpayload)()                                                                                                 |             |
| public [AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md)                                                                                                                                                                                        | [setPayload](#setpayload)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) data)          |             |



## Method Details

### getNodeName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getNodeName__()</span>



**Specified By:**

[TreeData](../../../../../../../io/github/qishr/cascara/common/data/TreeData.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md)> __getChildren__()</span>




---

### getParent

<span style="font-family: monospace; font-size: 80%;">public [AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md) __getParent__()</span>




---

### setParent

<span style="font-family: monospace; font-size: 80%;">public void __setParent__([AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md) parent)</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getPayload

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) __getPayload__()</span>



**Specified By:**

[TreeData](../../../../../../../io/github/qishr/cascara/common/data/TreeData.md)


---

### setPayload

<span style="font-family: monospace; font-size: 80%;">public [AstTreeData](../../../../../../../io/github/qishr/cascara/common/lang/util/AstTreeData.md) __setPayload__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) data)</span>




---

