Package [io.github.qishr.cascara.common.util](index.md)

# Class Properties
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.Properties<br/>
<br/>
All Implemented Interfaces:<br/>
    [TableData](../data/TableData.md), [Duplicable](Duplicable.md)<[Properties](Properties.md)>

Direct Known Subtypes:<br/>
    [JarManifest](JarManifest.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __Properties__</span>


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| Properties() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                                                                                                                                                                                                            | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                        |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                                                                                                                                    |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Property](Property.md)>                                                                                                                                                                  | [asList](#aslist)()                                                                                                                                                                                                                |             |
| public [Property](Property.md)                                                                                                                                                                                                                                                            | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                                        |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue) |             |
| public int                                                                                                                                                                                                                                                                                | [getInt](#getint)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int defaultValue)                                                                                                |             |
| public long                                                                                                                                                                                                                                                                               | [getLong](#getlong)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int defaultValue)                                                                                              |             |
| public double                                                                                                                                                                                                                                                                             | [getDouble](#getdouble)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, double defaultValue)                                                                                       |             |
| public boolean                                                                                                                                                                                                                                                                            | [getBoolean](#getboolean)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, boolean defaultValue)                                                                                    |             |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)                        |             |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, double v)                                                                                                              |             |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int v)                                                                                                                 |             |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, boolean v)                                                                                                             |             |
| public void                                                                                                                                                                                                                                                                               | [addAll](#addall)([Properties](Properties.md) properties)                                                                                                                                                                          |             |
| public void                                                                                                                                                                                                                                                                               | [add](#add)([Property](Property.md) property)                                                                                                                                                                                      |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                                                                                                                                          |             |
| public void                                                                                                                                                                                                                                                                               | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                                  |             |
| public void                                                                                                                                                                                                                                                                               | [remove](#remove)([Property](Property.md) property)                                                                                                                                                                                |             |
| public void                                                                                                                                                                                                                                                                               | [clear](#clear)()                                                                                                                                                                                                                  |             |
| public boolean                                                                                                                                                                                                                                                                            | [isEmpty](#isempty)()                                                                                                                                                                                                              |             |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [duplicate](#duplicate)()                                                                                                                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [toString](#tostring)()                                                                                                                                                                                                            |             |



## Method Details

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>



**Specified By:**

[TableData](../data/TableData.md)


---

### asList

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Property](Property.md)> __asList__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public [Property](Property.md) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>



**Specified By:**

[TableData](../data/TableData.md)


---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)</span>




---

### getInt

<span style="font-family: monospace; font-size: 80%;">public int __getInt__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int defaultValue)</span>




---

### getLong

<span style="font-family: monospace; font-size: 80%;">public long __getLong__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int defaultValue)</span>




---

### getDouble

<span style="font-family: monospace; font-size: 80%;">public double __getDouble__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, double defaultValue)</span>




---

### getBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __getBoolean__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, boolean defaultValue)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, double v)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int v)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, boolean v)</span>




---

### addAll

<span style="font-family: monospace; font-size: 80%;">public void __addAll__([Properties](Properties.md) properties)</span>




---

### add

<span style="font-family: monospace; font-size: 80%;">public void __add__([Property](Property.md) property)</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>



**Specified By:**

[TableData](../data/TableData.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__([Property](Property.md) property)</span>




---

### clear

<span style="font-family: monospace; font-size: 80%;">public void __clear__()</span>




---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>




---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [Properties](Properties.md) __duplicate__()</span>



**Specified By:**

[Duplicable](Duplicable.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

