Package [io.github.qishr.cascara.common.lang.type](index.md)

# Record ScalarValue
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)<br/>
                io.github.qishr.cascara.common.lang.type.ScalarValue<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final record __ScalarValue__<br/>extends [Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                   | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ScalarValue([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) nativeValue, [PrimitiveType](PrimitiveType.md) type) |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                            | Description                                                 |
|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                           | Returns a string representation of this record class.       |
| public final int                                                                                          | [hashCode](#hashcode)()                                                                                           | Returns a hash code value for this object.                  |
| public final boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) | Indicates whether some other object is "equal to" this one. |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)       | [nativeValue](#nativevalue)()                                                                                     | Returns the value of the `nativeValue` record component.    |
| public [PrimitiveType](PrimitiveType.md)                                                                  | [type](#type)()                                                                                                   | Returns the value of the `type` record component.           |



## Method Details

### toString

<span style="font-family: monospace; font-size: 80%;">public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns a string representation of this record class.


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public final int __hashCode__()</span>

Returns a hash code value for this object.


---

### equals

<span style="font-family: monospace; font-size: 80%;">public final boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>

Indicates whether some other object is "equal to" this one.


---

### nativeValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __nativeValue__()</span>

Returns the value of the `nativeValue` record component.


---

### type

<span style="font-family: monospace; font-size: 80%;">public [PrimitiveType](PrimitiveType.md) __type__()</span>

Returns the value of the `type` record component.


---

