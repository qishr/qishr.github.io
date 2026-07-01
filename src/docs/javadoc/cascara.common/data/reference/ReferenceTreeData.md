Package [io.github.qishr.cascara.common.data.reference](index.md)

# Class ReferenceTreeData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.data.reference.ReferenceTreeData<br/>
<br/>
All Implemented Interfaces:<br/>
    io.github.qishr.cascara.common.data.TreeData


----

<span style="font-family: monospace; font-size: 80%;">public class __ReferenceTreeData__</span>

A reference implementation of TreeData


## Constructor Summary

| Constructor                                                                                                          | Description |
|----------------------------------------------------------------------------------------------------------------------|-------------|
| ReferenceTreeData([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getNodeName](#getnodename)()                                                                                                                      |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceTreeData](ReferenceTreeData.md)>                                                                                                                                                | [getChildren](#getchildren)()                                                                                                                      |             |
| public [ReferenceTreeData](ReferenceTreeData.md)                                                                                                                                                                                                                                          | [getParent](#getparent)()                                                                                                                          |             |
| public void                                                                                                                                                                                                                                                                               | [setParent](#setparent)([ReferenceTreeData](ReferenceTreeData.md) parent)                                                                          |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                                                          |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                                                    |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                      |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TableData](../TableData.md)>                                                                                                                                                             | [getPayload](#getpayload)()                                                                                                                        |             |
| public [ReferenceTreeData](ReferenceTreeData.md)                                                                                                                                                                                                                                          | [setValue](#setvalue)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TableData](../TableData.md)> data) |             |



## Method Details

### getNodeName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getNodeName__()</span>



**Specified By:**

[TreeData](../TreeData.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ReferenceTreeData](ReferenceTreeData.md)> __getChildren__()</span>




---

### getParent

<span style="font-family: monospace; font-size: 80%;">public [ReferenceTreeData](ReferenceTreeData.md) __getParent__()</span>




---

### setParent

<span style="font-family: monospace; font-size: 80%;">public void __setParent__([ReferenceTreeData](ReferenceTreeData.md) parent)</span>




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

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TableData](../TableData.md)> __getPayload__()</span>



**Specified By:**

[TreeData](../TreeData.md)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public [ReferenceTreeData](ReferenceTreeData.md) __setValue__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TableData](../TableData.md)> data)</span>




---

