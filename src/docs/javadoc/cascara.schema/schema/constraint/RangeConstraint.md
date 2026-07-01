Package [io.github.qishr.cascara.schema.constraint](index.md)

# Record RangeConstraint
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)<br/>
                io.github.qishr.cascara.schema.constraint.RangeConstraint<br/>
<br/>
All Implemented Interfaces:<br/>
    [SchemaConstraint](SchemaConstraint.md)


----

<span style="font-family: monospace; font-size: 80%;">public final record __RangeConstraint__<br/>extends [Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                         | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| RangeConstraint([Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html) min, [Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html) max) |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                                    | Description                                                 |
|-----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| public boolean                                                                                            | [validate](#validate)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) | Returns the value of the `validate` record component.       |
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                   | Returns a string representation of this record class.       |
| public final int                                                                                          | [hashCode](#hashcode)()                                                                                                   | Returns a hash code value for this object.                  |
| public final boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)         | Indicates whether some other object is "equal to" this one. |
| public [Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html)       | [min](#min)()                                                                                                             | Returns the value of the `min` record component.            |
| public [Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html)       | [max](#max)()                                                                                                             | Returns the value of the `max` record component.            |



## Method Details

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>

Returns the value of the `validate` record component.

**Specified By:**

[SchemaConstraint](SchemaConstraint.md)


---

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

### min

<span style="font-family: monospace; font-size: 80%;">public [Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html) __min__()</span>

Returns the value of the `min` record component.


---

### max

<span style="font-family: monospace; font-size: 80%;">public [Double](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Double.html) __max__()</span>

Returns the value of the `max` record component.


---

