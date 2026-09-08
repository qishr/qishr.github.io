Package [io.github.qishr.cascara.common.util](index.md)

# Interface IStyle
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.Ansi.IStyle<br/>
<br/>
All Known Implementing Classes:<br/>
    [Style](CommandLine.Help.Ansi.Style.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IStyle__</span>

Defines the interface for an ANSI escape sequence.


## Field Summary

| Modifier and Type          | Field       | Description                                             |
|----------------------------|-------------|---------------------------------------------------------|
| public static final String | [CSI](#csi) | The Control Sequence Introducer (CSI) escape sequence . |



## Method Summary

| Modifier and Type                                                                                            | Method        | Description                                              |
|--------------------------------------------------------------------------------------------------------------|---------------|----------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [on](#on)()   | Returns the ANSI escape code for turning this style on.  |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [off](#off)() | Returns the ANSI escape code for turning this style off. |



## Field Details

### CSI

<span style="font-family: monospace; font-size: 80%;">public static final String __CSI__</span>

The Control Sequence Introducer (CSI) escape sequence .


---


## Method Details

### on

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __on__()</span>

Returns the ANSI escape code for turning this style on.

**Returns:**

the ANSI escape code for turning this style on


---

### off

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __off__()</span>

Returns the ANSI escape code for turning this style off.

**Returns:**

the ANSI escape code for turning this style off


---

