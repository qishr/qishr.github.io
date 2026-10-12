Package [io.github.qishr.cascara.common.trackable](index.md)

# Enum TrackingMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.trackable.TrackingMessage](../../../../../../io/github/qishr/cascara/common/trackable/TrackingMessage.md)><br/>
                io.github.qishr.cascara.common.trackable.TrackingMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __TrackingMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[TrackingMessage](../../../../../../io/github/qishr/cascara/common/trackable/TrackingMessage.md)>
</span>


##Enum Constants

| Enum Constant                                             | Description |
|-----------------------------------------------------------|-------------|
| [UI_DATA_ERROR](#ui_data_error)                           |             |
| [PROPERTY_NOT_RECOGNIZED](#property_not_recognized)       |             |
| [PROPERTY_NOT_FOUND_IN_MAP](#property_not_found_in_map)   |             |
| [CANNOT_SET_VALUE](#cannot_set_value)                     |             |
| [SCHEMA_NOT_SPECIFIED](#schema_not_specified)             |             |
| [SCHEMA_GENERATION_ERROR](#schema_generation_error)       |             |
| [SCHEMA_COMPILATION_ERROR](#schema_compilation_error)     |             |
| [EMPTY_ENUM](#empty_enum)                                 |             |
| [OPTION_PROVIDER_INIT_ERROR](#option_provider_init_error) |             |



## Method Summary

| Modifier and Type                                                                                                | Method                                                                                                                 | Description |
|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [TrackingMessage](../../../../../../io/github/qishr/cascara/common/trackable/TrackingMessage.md)[] | [values](#values)()                                                                                                    |             |
| public static [TrackingMessage](../../../../../../io/github/qishr/cascara/common/trackable/TrackingMessage.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)              | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)              | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### UI_DATA_ERROR

public static final  UI_DATA_ERROR




---

### PROPERTY_NOT_RECOGNIZED

public static final  PROPERTY_NOT_RECOGNIZED




---

### PROPERTY_NOT_FOUND_IN_MAP

public static final  PROPERTY_NOT_FOUND_IN_MAP




---

### CANNOT_SET_VALUE

public static final  CANNOT_SET_VALUE




---

### SCHEMA_NOT_SPECIFIED

public static final  SCHEMA_NOT_SPECIFIED




---

### SCHEMA_GENERATION_ERROR

public static final  SCHEMA_GENERATION_ERROR




---

### SCHEMA_COMPILATION_ERROR

public static final  SCHEMA_COMPILATION_ERROR




---

### EMPTY_ENUM

public static final  EMPTY_ENUM




---

### OPTION_PROVIDER_INIT_ERROR

public static final  OPTION_PROVIDER_INIT_ERROR




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [TrackingMessage](../../../../../../io/github/qishr/cascara/common/trackable/TrackingMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [TrackingMessage](../../../../../../io/github/qishr/cascara/common/trackable/TrackingMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


---

