Package [io.github.qishr.cascara.common.util](index.md)

# Enum TraceLevel
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.util.CommandLine.TraceLevel](CommandLine.TraceLevel.md)><br/>
                io.github.qishr.cascara.common.util.CommandLine.TraceLevel<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final enum __TraceLevel__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[TraceLevel](CommandLine.TraceLevel.md)>
</span>

Enumerates over the trace level values for filtering which internal debug statements should be printed.


##Enum Constants

| Enum Constant   | Description |
|-----------------|-------------|
| [OFF](#off)     |             |
| [WARN](#warn)   |             |
| [INFO](#info)   |             |
| [DEBUG](#debug) |             |



## Method Summary

| Modifier and Type                                       | Method                                                                                                                 | Description                                                                                                 |
|---------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| public static [TraceLevel](CommandLine.TraceLevel.md)[] | [values](#values)()                                                                                                    |                                                                                                             |
| public static [TraceLevel](CommandLine.TraceLevel.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |                                                                                                             |
| public boolean                                          | [isEnabled](#isenabled)([TraceLevel](CommandLine.TraceLevel.md) other)                                                 | Returns whether messages at the specified `other` trace level would be printed for the current trace level. |



## Enum Constant Details

### OFF

public static final  OFF




---

### WARN

public static final  WARN




---

### INFO

public static final  INFO




---

### DEBUG

public static final  DEBUG




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [TraceLevel](CommandLine.TraceLevel.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [TraceLevel](CommandLine.TraceLevel.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### isEnabled

<span style="font-family: monospace; font-size: 80%;">public boolean __isEnabled__([TraceLevel](CommandLine.TraceLevel.md) other)</span>

Returns whether messages at the specified `other` trace level would be printed for the current trace level.


---

