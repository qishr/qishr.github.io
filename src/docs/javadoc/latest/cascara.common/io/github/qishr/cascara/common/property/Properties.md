Package [io.github.qishr.cascara.common.property](index.md)

# Class Properties
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.property.Properties<br/>
<br/>
All Implemented Interfaces:<br/>
    [TabularData](../../../../../../io/github/qishr/cascara/common/data/TabularData.md), [Duplicable](../../../../../../io/github/qishr/cascara/common/util/Duplicable.md)<[Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)>, [Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<[Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?>>

Direct Known Subtypes:<br/>
    [JarManifest](../../../../../../io/github/qishr/cascara/common/util/JarManifest.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __Properties__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                             | Description |
|-------------------|---------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.common.property.Properties.PropertyParser](Properties.PropertyParser.md) |             |



## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| Properties() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                                                                                                                | Description                     |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------|
| public boolean                                                                                                                                                                                                                                                                            | [containsKey](#containskey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                           |                                 |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                                                                                                                                       |                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?>>                                                                                                     | [asList](#aslist)()                                                                                                                                                                                                                   |                                 |
| public [Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<T>                                                                                                                                                                                               | [getProperty](#getproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                        |                                 |
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
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                    |                                 |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, double v)                                                                                                                 |                                 |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int v)                                                                                                                    |                                 |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, boolean v)                                                                                                                |                                 |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [addAll](#addall)([Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) properties)                                                                                                                   |                                 |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [add](#add)([Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?> property)                                                                                                                            |                                 |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [add](#add)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                    |                                 |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                                                                                                                                             |                                 |
| public void                                                                                                                                                                                                                                                                               | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)                                                                                                                     |                                 |
| public void                                                                                                                                                                                                                                                                               | [remove](#remove)([Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?> property)                                                                                                                      |                                 |
| public void                                                                                                                                                                                                                                                                               | [clear](#clear)()                                                                                                                                                                                                                     |                                 |
| public boolean                                                                                                                                                                                                                                                                            | [isEmpty](#isempty)()                                                                                                                                                                                                                 |                                 |
| public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                              | [duplicate](#duplicate)()                                                                                                                                                                                                             |                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [toString](#tostring)()                                                                                                                                                                                                               |                                 |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?>>                                                                                             | [iterator](#iterator)()                                                                                                                                                                                                               | Returns Iterator instance       |
| public static [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                       | [fromSystemProperties](#fromsystemproperties)()                                                                                                                                                                                       |                                 |
| public static [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                       | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                                    |                                 |
| public static [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md)                                                                                                                                                                                       | [load](#load)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)                                                                                                                      |                                 |



## Method Details

### containsKey

<span style="font-family: monospace; font-size: 80%;">public boolean __containsKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>



**Specified By:**

[TabularData](../../../../../../io/github/qishr/cascara/common/data/TabularData.md)


---

### asList

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?>> __asList__()</span>




---

### getProperty

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<T> __getProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[TabularData](../../../../../../io/github/qishr/cascara/common/data/TabularData.md)


---

### get

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public T __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[TabularData](../../../../../../io/github/qishr/cascara/common/data/TabularData.md)


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

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, double v)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, int v)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, boolean v)</span>




---

### addAll

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __addAll__([Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) properties)</span>




---

### add

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __add__([Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?> property)</span>




---

### add

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __add__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>



**Specified By:**

[TabularData](../../../../../../io/github/qishr/cascara/common/data/TabularData.md)


---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__([Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?> property)</span>




---

### clear

<span style="font-family: monospace; font-size: 80%;">public void __clear__()</span>




---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>




---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../../../../../../io/github/qishr/cascara/common/util/Duplicable.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<[Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?>> __iterator__()</span>

Returns Iterator instance

**Specified By:**

[Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)


---

### fromSystemProperties

<span style="font-family: monospace; font-size: 80%;">public static [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __fromSystemProperties__()</span>




---

### parse

<span style="font-family: monospace; font-size: 80%;">public static [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### load

<span style="font-family: monospace; font-size: 80%;">public static [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __load__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)</span>



**Throws:**

[LocalizableIOException](../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableIOException.md)


---

