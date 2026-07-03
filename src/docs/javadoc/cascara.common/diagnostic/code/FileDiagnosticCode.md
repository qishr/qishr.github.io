Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Enum FileDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.code.FileDiagnosticCode](FileDiagnosticCode.md)><br/>
                io.github.qishr.cascara.common.diagnostic.code.FileDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __FileDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[FileDiagnosticCode](FileDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                     | Description |
|-----------------------------------|-------------|
| [FILE_NOT_FOUND](#file_not_found) |             |
| [ACCESS_DENIED](#access_denied)   |             |
| [DISK_FULL](#disk_full)           |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [FileDiagnosticCode](FileDiagnosticCode.md)[]                                         | [values](#values)()                                                                                                    |             |
| public static [FileDiagnosticCode](FileDiagnosticCode.md)                                           | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### FILE_NOT_FOUND

public static final  FILE_NOT_FOUND




---

### ACCESS_DENIED

public static final  ACCESS_DENIED




---

### DISK_FULL

public static final  DISK_FULL




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [FileDiagnosticCode](FileDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [FileDiagnosticCode](FileDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticCode](DiagnosticCode.md)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>



**Specified By:**

[DiagnosticCode](DiagnosticCode.md)


---

