Package [io.github.qishr.cascara.common.color](index.md)

# Enum ColorMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.color.ColorMessage](ColorMessage.md)><br/>
                io.github.qishr.cascara.common.color.ColorMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](../diagnostic/message/DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __ColorMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[ColorMessage](ColorMessage.md)>
</span>


##Enum Constants

| Enum Constant                                 | Description |
|-----------------------------------------------|-------------|
| [INVALID_COLOR_FORMAT](#invalid_color_format) |             |
| [INVALID_RGBA_FORMAT](#invalid_rgba_format)   |             |
| [INVALID_Hsba_FORMAT](#invalid_hsba_format)   |             |
| [RED_RANGE](#red_range)                       |             |
| [GREEN_RANGE](#green_range)                   |             |
| [BLUE_RANGE](#blue_range)                     |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ColorMessage](ColorMessage.md)[]                                                     | [values](#values)()                                                                                                    |             |
| public static [ColorMessage](ColorMessage.md)                                                       | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### INVALID_COLOR_FORMAT

public static final  INVALID_COLOR_FORMAT




---

### INVALID_RGBA_FORMAT

public static final  INVALID_RGBA_FORMAT




---

### INVALID_Hsba_FORMAT

public static final  INVALID_Hsba_FORMAT




---

### RED_RANGE

public static final  RED_RANGE




---

### GREEN_RANGE

public static final  GREEN_RANGE




---

### BLUE_RANGE

public static final  BLUE_RANGE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [ColorMessage](ColorMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [ColorMessage](ColorMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticMessage](../diagnostic/message/DiagnosticMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[DiagnosticMessage](../diagnostic/message/DiagnosticMessage.md)


---

