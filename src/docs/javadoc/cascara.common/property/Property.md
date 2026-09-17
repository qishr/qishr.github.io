Package [io.github.qishr.cascara.common.property](index.md)

# Class Property
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.property.Property<br/>
<br/>
All Implemented Interfaces:<br/>
    [TabularData](../data/TabularData.md)

Direct Known Subtypes:<br/>
    [BooleanProperty](BooleanProperty.md), [IntegerProperty](IntegerProperty.md), [NumberProperty](NumberProperty.md), [StringProperty](StringProperty.md), [TrackableProperty](../trackable/property/TrackableProperty.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __Property__</span>


## Constructor Summary

| Constructor                                                                                                   | Description |
|---------------------------------------------------------------------------------------------------------------|-------------|
| Property()                                                                                                    |             |
| Property([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)      |             |
| Property([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k, T v) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getName](#getname)()                                                                                                      |             |
| public void                                                                                                                                                                                                                                                                               | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)        |             |
| public [PrimitiveType](../lang/type/PrimitiveType.md)                                                                                                                                                                                                                                     | [getPrimitiveType](#getprimitivetype)()                                                                                    |             |
| public void                                                                                                                                                                                                                                                                               | [setPrimitiveType](#setprimitivetype)([PrimitiveType](../lang/type/PrimitiveType.md) kind)                                 |             |
| public T                                                                                                                                                                                                                                                                                  | [getValue](#getvalue)()                                                                                                    |             |
| public void                                                                                                                                                                                                                                                                               | [setValue](#setvalue)(T v)                                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [asString](#asstring)()                                                                                                    |             |
| public double                                                                                                                                                                                                                                                                             | [asDouble](#asdouble)()                                                                                                    |             |
| public double                                                                                                                                                                                                                                                                             | [asDouble](#asdouble)(double defaultValue)                                                                                 |             |
| public int                                                                                                                                                                                                                                                                                | [asInteger](#asinteger)()                                                                                                  |             |
| public long                                                                                                                                                                                                                                                                               | [asLong](#aslong)()                                                                                                        |             |
| public int                                                                                                                                                                                                                                                                                | [asInteger](#asinteger)(int defaultValue)                                                                                  |             |
| public long                                                                                                                                                                                                                                                                               | [asLong](#aslong)(long defaultValue)                                                                                       |             |
| public boolean                                                                                                                                                                                                                                                                            | [asBoolean](#asboolean)()                                                                                                  |             |
| public boolean                                                                                                                                                                                                                                                                            | [asBoolean](#asboolean)(boolean defaultValue)                                                                              |             |
| public boolean                                                                                                                                                                                                                                                                            | [isEmpty](#isempty)()                                                                                                      |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                                  |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                            |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [getValue](#getvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)    |             |



## Method Details

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### setName

<span style="font-family: monospace; font-size: 80%;">public void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) k)</span>




---

### getPrimitiveType

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](../lang/type/PrimitiveType.md) __getPrimitiveType__()</span>




---

### setPrimitiveType

<span style="font-family: monospace; font-size: 80%;">public void __setPrimitiveType__([PrimitiveType](../lang/type/PrimitiveType.md) kind)</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public T __getValue__()</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public void __setValue__(T v)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[TabularData](../data/TabularData.md)


---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>




---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__()</span>




---

### asDouble

<span style="font-family: monospace; font-size: 80%;">public double __asDouble__(double defaultValue)</span>




---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__()</span>




---

### asLong

<span style="font-family: monospace; font-size: 80%;">public long __asLong__()</span>




---

### asInteger

<span style="font-family: monospace; font-size: 80%;">public int __asInteger__(int defaultValue)</span>




---

### asLong

<span style="font-family: monospace; font-size: 80%;">public long __asLong__(long defaultValue)</span>




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

[TabularData](../data/TabularData.md)


---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>



**Specified By:**

[TabularData](../data/TabularData.md)


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[TabularData](../data/TabularData.md)


---

