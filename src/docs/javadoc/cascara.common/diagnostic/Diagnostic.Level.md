Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Enum Level
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.Diagnostic.Level](Diagnostic.Level.md)><br/>
                io.github.qishr.cascara.common.diagnostic.Diagnostic.Level<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.diagnostic.Diagnostic](Diagnostic.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final enum __Level__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[Level](Diagnostic.Level.md)>
</span>

Defines the severity hierarchy classifications available for diagnostic tracking.


##Enum Constants

| Enum Constant       | Description |
|---------------------|-------------|
| [DEFAULT](#default) |             |
| [ERROR](#error)     |             |
| [WARN](#warn)       |             |
| [INFO](#info)       |             |
| [DEBUG](#debug)     |             |
| [TRACE](#trace)     |             |



## Method Summary

| Modifier and Type                            | Method                                                                                                                 | Description                                                                                |
|----------------------------------------------|------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| public static [Level](Diagnostic.Level.md)[] | [values](#values)()                                                                                                    |                                                                                            |
| public static [Level](Diagnostic.Level.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |                                                                                            |
| public int                                   | [getLevel](#getlevel)()                                                                                                | Returns the raw integer ordinal configuration weight assigned to this severity tier level. |



## Enum Constant Details

### DEFAULT

public static final  DEFAULT




---

### ERROR

public static final  ERROR




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

### TRACE

public static final  TRACE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [Level](Diagnostic.Level.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [Level](Diagnostic.Level.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getLevel

<span style="font-family: monospace; font-size: 80%;">public int __getLevel__()</span>

Returns the raw integer ordinal configuration weight assigned to this severity tier level.


---

