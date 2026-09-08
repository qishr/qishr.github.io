Package [io.github.qishr.cascara.common.util](index.md)

# Enum Overflow
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.util.CommandLine.Help.Column.Overflow](CommandLine.Help.Column.Overflow.md)><br/>
                io.github.qishr.cascara.common.util.CommandLine.Help.Column.Overflow<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help.Column](CommandLine.Help.Column.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final enum __Overflow__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[Overflow](CommandLine.Help.Column.Overflow.md)>
</span>

Policy for handling text that is longer than the column width:
  span multiple columns, wrap to the next row, or simply truncate the portion that doesn't fit.


##Enum Constants

| Enum Constant         | Description |
|-----------------------|-------------|
| [TRUNCATE](#truncate) |             |
| [SPAN](#span)         |             |
| [WRAP](#wrap)         |             |



## Method Summary

| Modifier and Type                                               | Method                                                                                                                 | Description |
|-----------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [Overflow](CommandLine.Help.Column.Overflow.md)[] | [values](#values)()                                                                                                    |             |
| public static [Overflow](CommandLine.Help.Column.Overflow.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |



## Enum Constant Details

### TRUNCATE

public static final  TRUNCATE




---

### SPAN

public static final  SPAN




---

### WRAP

public static final  WRAP




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [Overflow](CommandLine.Help.Column.Overflow.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [Overflow](CommandLine.Help.Column.Overflow.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

