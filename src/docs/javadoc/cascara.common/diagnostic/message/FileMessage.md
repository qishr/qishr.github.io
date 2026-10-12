Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Enum FileMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.message.FileMessage](FileMessage.md)><br/>
                io.github.qishr.cascara.common.diagnostic.message.FileMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __FileMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[FileMessage](FileMessage.md)>
</span>


##Enum Constants

| Enum Constant                     | Description |
|-----------------------------------|-------------|
| [FILE_NOT_FOUND](#file_not_found) |             |
| [ACCESS_DENIED](#access_denied)   |             |
| [IS_DIRECTORY](#is_directory)     |             |
| [DISK_FULL](#disk_full)           |             |
| [READ_ERROR](#read_error)         |             |
| [WRITE_ERROR](#write_error)       |             |
| [DELETE_ERROR](#delete_error)     |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [FileMessage](FileMessage.md)[]                                                       | [values](#values)()                                                                                                    |             |
| public static [FileMessage](FileMessage.md)                                                         | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### FILE_NOT_FOUND

public static final  FILE_NOT_FOUND




---

### ACCESS_DENIED

public static final  ACCESS_DENIED




---

### IS_DIRECTORY

public static final  IS_DIRECTORY




---

### DISK_FULL

public static final  DISK_FULL




---

### READ_ERROR

public static final  READ_ERROR




---

### WRITE_ERROR

public static final  WRITE_ERROR




---

### DELETE_ERROR

public static final  DELETE_ERROR




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [FileMessage](FileMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [FileMessage](FileMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticMessage](DiagnosticMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[DiagnosticMessage](DiagnosticMessage.md)


---

