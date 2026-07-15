Package [io.github.qishr.cascara.common.lang.type](index.md)

# Enum PrimitiveType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.lang.type.PrimitiveType](PrimitiveType.md)><br/>
                io.github.qishr.cascara.common.lang.type.PrimitiveType<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final enum __PrimitiveType__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[PrimitiveType](PrimitiveType.md)>
</span>

Based on https://json-schema.org/draft-04/json-schema-core#rfc.section.3.5


##Enum Constants

| Enum Constant       | Description |
|---------------------|-------------|
| [ANY](#any)         |             |
| [ARRAY](#array)     |             |
| [BOOLEAN](#boolean) |             |
| [INTEGER](#integer) |             |
| [NUMBER](#number)   |             |
| [NULL](#null)       |             |
| [OBJECT](#object)   |             |
| [STRING](#string)   |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                       | Description                      |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|----------------------------------|
| public static [PrimitiveType](PrimitiveType.md)[]                                                   | [values](#values)()                                                                                                          |                                  |
| public static [PrimitiveType](PrimitiveType.md)                                                     | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)       |                                  |
| public static [PrimitiveType](PrimitiveType.md)                                                     | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type) |                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [asString](#asstring)()                                                                                                      | Return the JSON Schema type name |
| public static [PrimitiveType](PrimitiveType.md)                                                     | [of](#of)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmType)              |                                  |



## Enum Constant Details

### ANY

public static final  ANY




---

### ARRAY

public static final  ARRAY




---

### BOOLEAN

public static final  BOOLEAN




---

### INTEGER

public static final  INTEGER




---

### NUMBER

public static final  NUMBER




---

### NULL

public static final  NULL




---

### OBJECT

public static final  OBJECT




---

### STRING

public static final  STRING




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [PrimitiveType](PrimitiveType.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [PrimitiveType](PrimitiveType.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public static [PrimitiveType](PrimitiveType.md) __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type)</span>




---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

Return the JSON Schema type name


---

### of

<span style="font-family: monospace; font-size: 80%;">public static [PrimitiveType](PrimitiveType.md) __of__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmType)</span>




---

