Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Enum InetDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.code.InetDiagnosticCode](InetDiagnosticCode.md)><br/>
                io.github.qishr.cascara.common.diagnostic.code.InetDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __InetDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[InetDiagnosticCode](InetDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                 | Description |
|-----------------------------------------------|-------------|
| [NETWORK_UNREACHABLE](#network_unreachable)   |             |
| [CONNECTION_REFUSED](#connection_refused)     |             |
| [CONNECTION_TIMEOUT](#connection_timeout)     |             |
| [TLS_HANDSHAKE_FAILED](#tls_handshake_failed) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [InetDiagnosticCode](InetDiagnosticCode.md)[]                                         | [values](#values)()                                                                                                    |             |
| public static [InetDiagnosticCode](InetDiagnosticCode.md)                                           | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### NETWORK_UNREACHABLE

public static final  NETWORK_UNREACHABLE




---

### CONNECTION_REFUSED

public static final  CONNECTION_REFUSED




---

### CONNECTION_TIMEOUT

public static final  CONNECTION_TIMEOUT




---

### TLS_HANDSHAKE_FAILED

public static final  TLS_HANDSHAKE_FAILED




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [InetDiagnosticCode](InetDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [InetDiagnosticCode](InetDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

