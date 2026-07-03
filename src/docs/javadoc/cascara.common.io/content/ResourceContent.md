Package [io.github.qishr.cascara.common.content](index.md)

# Record ResourceContent
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)<br/>
                io.github.qishr.cascara.common.content.ResourceContent<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final record __ResourceContent__<br/>extends [Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)
</span>

Any resource reachable by a URI, not just resource in the Java sense.


## Constructor Summary

| Constructor                                                                                                                                                                                | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ResourceContent([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) content, [ContentType](../../cascara.common/util/ContentType.md) contentType) |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                            | Description                                                 |
|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                           | Returns a string representation of this record class.       |
| public final int                                                                                          | [hashCode](#hashcode)()                                                                                           | Returns a hash code value for this object.                  |
| public final boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) | Indicates whether some other object is "equal to" this one. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)       | [content](#content)()                                                                                             | Returns the value of the `content` record component.        |
| public [ContentType](../../cascara.common/util/ContentType.md)                                            | [contentType](#contenttype)()                                                                                     | Returns the value of the `contentType` record component.    |



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

### content

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __content__()</span>

Returns the value of the `content` record component.


---

### contentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../cascara.common/util/ContentType.md) __contentType__()</span>

Returns the value of the `contentType` record component.


---

