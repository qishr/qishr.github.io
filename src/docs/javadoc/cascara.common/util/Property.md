Package [io.github.qishr.cascara.common.util](index.md)

# Class Property
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.Property<br/>
<br/>
All Implemented Interfaces:<br/>
    [TableData](../data/TableData.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __Property__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                              | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Property([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                 |             |
| Property([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getName](#getname)()                                                                                                 |             |
| public void                                                                                                                                                                                                                                                                               | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)   |             |
| public [Kind](Property.Kind.md)                                                                                                                                                                                                                                                           | [getKind](#getkind)()                                                                                                 |             |
| public void                                                                                                                                                                                                                                                                               | [setKind](#setkind)([Kind](Property.Kind.md) kind)                                                                    |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)()                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getValue](#getvalue)()                                                                                               |             |
| public void                                                                                                                                                                                                                                                                               | [setValue](#setvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v) |             |
| public void                                                                                                                                                                                                                                                                               | [setValue](#setvalue)(boolean v)                                                                                      |             |
| public void                                                                                                                                                                                                                                                                               | [setValue](#setvalue)(int v)                                                                                          |             |
| public void                                                                                                                                                                                                                                                                               | [setValue](#setvalue)(double v)                                                                                       |             |
| public double                                                                                                                                                                                                                                                                             | [asDouble](#asdouble)()                                                                                               |             |
| public double                                                                                                                                                                                                                                                                             | [asDouble](#asdouble)(double defaultValue)                                                                            |             |
| public int                                                                                                                                                                                                                                                                                | [asInt](#asint)()                                                                                                     |             |
| public long                                                                                                                                                                                                                                                                               | [asLong](#aslong)()                                                                                                   |             |
| public int                                                                                                                                                                                                                                                                                | [asInt](#asint)(int defaultValue)                                                                                     |             |
| public long                                                                                                                                                                                                                                                                               | [asLong](#aslong)(int defaultValue)                                                                                   |             |
| public boolean                                                                                                                                                                                                                                                                            | [asBoolean](#asboolean)()                                                                                             |             |
| public boolean                                                                                                                                                                                                                                                                            | [asBoolean](#asboolean)(boolean defaultValue)                                                                         |             |
| public boolean                                                                                                                                                                                                                                                                            | [isEmpty](#isempty)()                                                                                                 |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                             |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                       |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)         |             |



## Method Details

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### setName

<span style="font-family: monospace; font-size: 80%;">public void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### getKind

<span style="font-family: monospace; font-size: 80%;">public [Kind](Property.Kind.md) __getKind__()</span>




---

### setKind

<span style="font-family: monospace; font-size: 80%;">public void __setKind__([Kind](Property.Kind.md) kind)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__()</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getValue__()</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public void __setValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public void __setValue__(boolean v)</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public void __setValue__(int v)</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public void __setValue__(double v)</span>




---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__()</span>




---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__(double defaultValue)</span>




---

### asInt

<span style="font-family: monospace; font-size: 80%;">public int __asInt__()</span>




---

### asLong

<span style="font-family: monospace; font-size: 80%;">public long __asLong__()</span>




---

### asInt

<span style="font-family: monospace; font-size: 80%;">public int __asInt__(int defaultValue)</span>




---

### asLong

<span style="font-family: monospace; font-size: 80%;">public long __asLong__(int defaultValue)</span>




---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__()</span>




---

### asBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __asBoolean__(boolean defaultValue)</span>




---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>



**Specified By:**

[TableData](../data/TableData.md)


---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>



**Specified By:**

[TableData](../data/TableData.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[TableData](../data/TableData.md)


---

