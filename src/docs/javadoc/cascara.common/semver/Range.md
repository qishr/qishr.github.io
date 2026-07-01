Package [io.github.qishr.cascara.common.semver](index.md)

# Class Range
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.semver.Range<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Range__</span>


## Field Summary

| Modifier and Type             | Field               | Description |
|-------------------------------|---------------------|-------------|
| protected final RangeOperator | [op](#op)           |             |
| protected final SemVer        | [version](#version) |             |



## Constructor Summary

| Constructor                                                                                                                                             | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Range([SemVer](SemVer.md) version, [RangeOperator](Range.RangeOperator.md) op)                                                                          |             |
| Range([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version, [RangeOperator](Range.RangeOperator.md) op) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                      | [isSatisfiedBy](#issatisfiedby)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version) |             |
| public boolean                                                                                      | [isSatisfiedBy](#issatisfiedby)([SemVer](SemVer.md) version)                                                                          |             |
| public boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                     |             |
| public int                                                                                          | [hashCode](#hashcode)()                                                                                                               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                               |             |



## Field Details

### op

<span style="font-family: monospace; font-size: 80%;">protected final RangeOperator __op__</span>




---

### version

<span style="font-family: monospace; font-size: 80%;">protected final SemVer __version__</span>




---


## Method Details

### isSatisfiedBy

<span style="font-family: monospace; font-size: 80%;">public boolean __isSatisfiedBy__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>




---

### isSatisfiedBy

<span style="font-family: monospace; font-size: 80%;">public boolean __isSatisfiedBy__([SemVer](SemVer.md) version)</span>




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

