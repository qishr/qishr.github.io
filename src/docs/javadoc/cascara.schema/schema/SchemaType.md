Package [io.github.qishr.cascara.schema](index.md)

# Enum SchemaType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.schema.SchemaType](SchemaType.md)><br/>
                io.github.qishr.cascara.schema.SchemaType<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final enum __SchemaType__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[SchemaType](SchemaType.md)>
</span>


##Enum Constants

| Enum Constant       | Description |
|---------------------|-------------|
| [ANY](#any)         |             |
| [STRING](#string)   |             |
| [BOOLEAN](#boolean) |             |
| [INTEGER](#integer) |             |
| [NUMBER](#number)   |             |
| [OBJECT](#object)   |             |
| [ARRAY](#array)     |             |
| [NULL](#null)       |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                       | Description                      |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|----------------------------------|
| public static [SchemaType](SchemaType.md)[]                                                         | [values](#values)()                                                                                                          |                                  |
| public static [SchemaType](SchemaType.md)                                                           | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)       |                                  |
| public static [SchemaType](SchemaType.md)                                                           | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type) |                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [asString](#asstring)()                                                                                                      | Return the JSON Schema type name |



## Enum Constant Details

### ANY

public static final  ANY




---

### STRING

public static final  STRING




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

### OBJECT

public static final  OBJECT




---

### ARRAY

public static final  ARRAY




---

### NULL

public static final  NULL




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [SchemaType](SchemaType.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [SchemaType](SchemaType.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public static [SchemaType](SchemaType.md) __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type)</span>




---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

Return the JSON Schema type name


---

