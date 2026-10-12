Package [io.github.qishr.cascara.schema.constraint](index.md)

# Record EnumConstraint
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)<br/>
                io.github.qishr.cascara.schema.constraint.EnumConstraint<br/>
<br/>
All Implemented Interfaces:<br/>
    [SchemaConstraint](SchemaConstraint.md)


----

<span style="font-family: monospace; font-size: 80%;">public final record __EnumConstraint__<br/>extends [Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                    | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| EnumConstraint([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> options) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                    | Description                                                 |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| public boolean                                                                                                                                                                                | [validate](#validate)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) | Returns the value of the `validate` record component.       |
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                     | [toString](#tostring)()                                                                                                   | Returns a string representation of this record class.       |
| public final int                                                                                                                                                                              | [hashCode](#hashcode)()                                                                                                   | Returns a hash code value for this object.                  |
| public final boolean                                                                                                                                                                          | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)         | Indicates whether some other object is "equal to" this one. |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [options](#options)()                                                                                                     | Returns the value of the `options` record component.        |



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

### options

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __options__()</span>

Returns the value of the `options` record component.


---

