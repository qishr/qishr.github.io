Package [io.github.qishr.cascara.common.lang.util](index.md)

# Class AstTreeData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.AstTreeData<br/>
<br/>
All Implemented Interfaces:<br/>
    [TreeData](../../data/TreeData.md)<[AstTreeData](AstTreeData.md), [AstNode](../ast/AstNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public class __AstTreeData__</span>


## Constructor Summary

| Constructor                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------|-------------|
| AstTreeData([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| AstTreeData([AstNode](../ast/AstNode.md) root)                                                                 |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                        | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getNodeName](#getnodename)()                                                                                 |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstTreeData](AstTreeData.md)>                                                                                                                                                            | [getChildren](#getchildren)()                                                                                 |             |
| public [AstTreeData](AstTreeData.md)                                                                                                                                                                                                                                                      | [getParent](#getparent)()                                                                                     |             |
| public void                                                                                                                                                                                                                                                                               | [setParent](#setparent)([AstTreeData](AstTreeData.md) parent)                                                 |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                     |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                               |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key) |             |
| public [AstNode](../ast/AstNode.md)                                                                                                                                                                                                                                                       | [getPayload](#getpayload)()                                                                                   |             |
| public [AstTreeData](AstTreeData.md)                                                                                                                                                                                                                                                      | [setPayload](#setpayload)([AstNode](../ast/AstNode.md) data)                                                  |             |



## Method Details

### getNodeName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getNodeName__()</span>



**Specified By:**

[TreeData](../../data/TreeData.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[AstTreeData](AstTreeData.md)> __getChildren__()</span>




---

### getParent

<span style="font-family: monospace; font-size: 80%;">public [AstTreeData](AstTreeData.md) __getParent__()</span>




---

### setParent

<span style="font-family: monospace; font-size: 80%;">public void __setParent__([AstTreeData](AstTreeData.md) parent)</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getPayload

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../ast/AstNode.md) __getPayload__()</span>



**Specified By:**

[TreeData](../../data/TreeData.md)


---

### setPayload

<span style="font-family: monospace; font-size: 80%;">public [AstTreeData](AstTreeData.md) __setPayload__([AstNode](../ast/AstNode.md) data)</span>




---

