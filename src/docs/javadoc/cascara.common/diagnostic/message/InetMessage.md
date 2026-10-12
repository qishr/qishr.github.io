Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Enum InetMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.message.InetMessage](InetMessage.md)><br/>
                io.github.qishr.cascara.common.diagnostic.message.InetMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __InetMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[InetMessage](InetMessage.md)>
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
| public static [InetMessage](InetMessage.md)[]                                                       | [values](#values)()                                                                                                    |             |
| public static [InetMessage](InetMessage.md)                                                         | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFormat](#getformat)()                                                                                              |             |



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

<span style="font-family: monospace; font-size: 80%;">public static [InetMessage](InetMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [InetMessage](InetMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

