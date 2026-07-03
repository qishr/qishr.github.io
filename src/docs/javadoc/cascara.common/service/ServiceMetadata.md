Package [io.github.qishr.cascara.common.service](index.md)

# Class ServiceMetadata
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.ServiceMetadata<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ServiceMetadata__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                       | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ServiceMetadata([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> type, [Properties](../util/Properties.md) properties) |             |



## Method Summary

| Modifier and Type                                                                                                                                  | Method                                                                                                                                              | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                                                                     | [getBooleanCapability](#getbooleancapability)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) capName) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                | [getModuleName](#getmodulename)()                                                                                                                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                | [getTypeName](#gettypename)()                                                                                                                       |             |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> | [getType](#gettype)()                                                                                                                               |             |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>                                               | [getCapabilityType](#getcapabilitytype)()                                                                                                           |             |
| public [Properties](../util/Properties.md)                                                                                                         | [getProperties](#getproperties)()                                                                                                                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                | [getProperty](#getproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                      |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                | [getJarPath](#getjarpath)()                                                                                                                         |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                | [getTitle](#gettitle)()                                                                                                                             |             |
| public boolean                                                                                                                                     | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                   |             |
| public int                                                                                                                                         | [hashCode](#hashcode)()                                                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                | [toString](#tostring)()                                                                                                                             |             |



## Method Details

### getBooleanCapability

<span style="font-family: monospace; font-size: 80%;">public boolean __getBooleanCapability__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) capName)</span>




---

### getModuleName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getModuleName__()</span>




---

### getTypeName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTypeName__()</span>




---

### getType

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> __getType__()</span>




---

### getCapabilityType

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getCapabilityType__()</span>




---

### getProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../util/Properties.md) __getProperties__()</span>




---

### getProperty

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getJarPath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getJarPath__()</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__()</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

