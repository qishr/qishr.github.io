Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class TypeReference
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.type.TypeReference<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __TypeReference__</span>

References a generic type.


## Constructor Summary

| Constructor     | Description |
|-----------------|-------------|
| TypeReference() |             |



## Method Summary

| Modifier and Type                                                                                       | Method                        | Description                                                               |
|---------------------------------------------------------------------------------------------------------|-------------------------------|---------------------------------------------------------------------------|
| public T                                                                                                | [newInstance](#newinstance)() | Instantiates a new instance of `T` using the default, no-arg constructor. |
| public [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) | [getType](#gettype)()         | Gets the referenced type.                                                 |



## Method Details

### newInstance

<span style="font-family: monospace; font-size: 80%;">public T __newInstance__()</span>

Instantiates a new instance of `T` using the default, no-arg
constructor.

**Throws:**

[NoSuchMethodException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/NoSuchMethodException.html)
, [IllegalAccessException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/IllegalAccessException.html)
, [InvocationTargetException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/InvocationTargetException.html)
, [InstantiationException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/InstantiationException.html)


---

### getType

<span style="font-family: monospace; font-size: 80%;">public [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) __getType__()</span>

Gets the referenced type.


---

