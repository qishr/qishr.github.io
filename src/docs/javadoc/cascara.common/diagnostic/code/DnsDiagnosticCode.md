Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Enum DnsDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.code.DnsDiagnosticCode](DnsDiagnosticCode.md)><br/>
                io.github.qishr.cascara.common.diagnostic.code.DnsDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __DnsDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[DnsDiagnosticCode](DnsDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                 | Description |
|-------------------------------|-------------|
| [UNKNOWN_HOST](#unknown_host) |             |
| [TIMEOUT](#timeout)           |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [DnsDiagnosticCode](DnsDiagnosticCode.md)[]                                           | [values](#values)()                                                                                                    |             |
| public static [DnsDiagnosticCode](DnsDiagnosticCode.md)                                             | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### UNKNOWN_HOST

public static final  UNKNOWN_HOST




---

### TIMEOUT

public static final  TIMEOUT




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [DnsDiagnosticCode](DnsDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [DnsDiagnosticCode](DnsDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

