Package [io.github.qishr.cascara.common.property](index.md)

# Class Properties
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.property.Properties<br/>
<br/>
All Implemented Interfaces:<br/>
    [TabularData](../data/TabularData.md), [Duplicable](../util/Duplicable.md)<[Properties](Properties.md)>

Direct Known Subtypes:<br/>
    [JarManifest](../util/JarManifest.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __Properties__</span>


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| Properties() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                                                                                                                | Description                     |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------|
| public boolean                                                                                                                                                                                                                                                                            | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                           |                                 |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                                                                                                                                       |                                 |
| public java.util.List<io.github.qishr.cascara.common.property.Property<?>                                                                                                                                                                                                                 | [asList](#aslist)()                                                                                                                                                                                                                   |                                 |
| public [Property](Property.md)<T>                                                                                                                                                                                                                                                         | [getProperty](#getproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                        |                                 |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getValue](#getvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                              |                                 |
| public T                                                                                                                                                                                                                                                                                  | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                        |                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                            |                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue) |                                 |
| public int                                                                                                                                                                                                                                                                                | [getInt](#getint)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, int defaultValue)                                                                                                |                                 |
| public long                                                                                                                                                                                                                                                                               | [getLong](#getlong)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, long defaultValue)                                                                                             |                                 |
| public double                                                                                                                                                                                                                                                                             | [getDouble](#getdouble)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, double defaultValue)                                                                                       |                                 |
| public double                                                                                                                                                                                                                                                                             | [getNumber](#getnumber)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, double defaultValue)                                                                                       | For consistency with JSONSchema |
| public long                                                                                                                                                                                                                                                                               | [getInteger](#getinteger)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, long defaultValue)                                                                                       | For consistency with JSONSchema |
| public boolean                                                                                                                                                                                                                                                                            | [getBoolean](#getboolean)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, boolean defaultValue)                                                                                    |                                 |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                    |                                 |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, double v)                                                                                                                 |                                 |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int v)                                                                                                                    |                                 |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, boolean v)                                                                                                                |                                 |
| public void                                                                                                                                                                                                                                                                               | [addAll](#addall)([Properties](Properties.md) properties)                                                                                                                                                                             |                                 |
| public void                                                                                                                                                                                                                                                                               | [add](#add)([Property](Property.md)<?> property)                                                                                                                                                                                      |                                 |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                                                                                                                                             |                                 |
| public void                                                                                                                                                                                                                                                                               | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                                     |                                 |
| public void                                                                                                                                                                                                                                                                               | [remove](#remove)([Property](Property.md)<?> property)                                                                                                                                                                                |                                 |
| public void                                                                                                                                                                                                                                                                               | [clear](#clear)()                                                                                                                                                                                                                     |                                 |
| public boolean                                                                                                                                                                                                                                                                            | [isEmpty](#isempty)()                                                                                                                                                                                                                 |                                 |
| public [Properties](Properties.md)                                                                                                                                                                                                                                                        | [duplicate](#duplicate)()                                                                                                                                                                                                             |                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [toString](#tostring)()                                                                                                                                                                                                               |                                 |



## Method Details

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>



**Specified By:**

[TabularData](../data/TabularData.md)


---

### asList

<span style="font-family: monospace; font-size: 80%;">public java.util.List<io.github.qishr.cascara.common.property.Property<?> __asList__()</span>




---

### getProperty

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [Property](Property.md)<T> __getProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[TabularData](../data/TabularData.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public T __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[TabularData](../data/TabularData.md)


---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)</span>




---

### getInt

<span style="font-family: monospace; font-size: 80%;">public int __getInt__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, int defaultValue)</span>




---

### getLong

<span style="font-family: monospace; font-size: 80%;">public long __getLong__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, long defaultValue)</span>




---

### getDouble

<span style="font-family: monospace; font-size: 80%;">public double __getDouble__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, double defaultValue)</span>




---

### getNumber

<span style="font-family: monospace; font-size: 80%;">public double __getNumber__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, double defaultValue)</span>

For consistency with JSONSchema


---

### getInteger

<span style="font-family: monospace; font-size: 80%;">public long __getInteger__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, long defaultValue)</span>

For consistency with JSONSchema


---

### getBoolean

<span style="font-family: monospace; font-size: 80%;">public boolean __getBoolean__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, boolean defaultValue)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




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

<span style="font-family: monospace; font-size: 80%;">public void __add__([Property](Property.md)<?> property)</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>



**Specified By:**

[TabularData](../data/TabularData.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__([Property](Property.md)<?> property)</span>




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

[Duplicable](../util/Duplicable.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

