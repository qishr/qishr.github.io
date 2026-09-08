Package [io.github.qishr.cascara.common.util](index.md)

# Class Column
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.Column<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Column__</span>

Columns define the width, indent (leading number of spaces in a column before the value) and
 [Overflow](CommandLine.Help.Column.Overflow.md) policy of a column in a [TextTable](CommandLine.Help.TextTable.md).


## Field Summary

| Modifier and Type     | Field                 | Description                                                                         |
|-----------------------|-----------------------|-------------------------------------------------------------------------------------|
| public int            | [indent](#indent)     | Indent (number of empty spaces at the start of the column preceding the text value) |
| public final Overflow | [overflow](#overflow) | Policy that determines how to handle values larger than the column width.           |
| public final int      | [width](#width)       | Column width in characters                                                          |



## Constructor Summary

| Constructor                                                                             | Description |
|-----------------------------------------------------------------------------------------|-------------|
| Column(int width, int indent, [Overflow](CommandLine.Help.Column.Overflow.md) overflow) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                              | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|-------------|
| public boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj) |             |
| public int                                                                                          | [hashCode](#hashcode)()                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                             |             |



## Field Details

### indent

<span style="font-family: monospace; font-size: 80%;">public int __indent__</span>

Indent (number of empty spaces at the start of the column preceding the text value)


---

### overflow

<span style="font-family: monospace; font-size: 80%;">public final Overflow __overflow__</span>

Policy that determines how to handle values larger than the column width.


---

### width

<span style="font-family: monospace; font-size: 80%;">public final int __width__</span>

Column width in characters


---


## Method Details

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)</span>




---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

