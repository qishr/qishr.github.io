Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Enum DnsMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.message.DnsMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DnsMessage.md)><br/>
                io.github.qishr.cascara.common.diagnostic.message.DnsMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __DnsMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[DnsMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DnsMessage.md)>
</span>


##Enum Constants

| Enum Constant                 | Description |
|-------------------------------|-------------|
| [UNKNOWN_HOST](#unknown_host) |             |
| [TIMEOUT](#timeout)           |             |



## Method Summary

| Modifier and Type                                                                                                  | Method                                                                                                                 | Description |
|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [DnsMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DnsMessage.md)[] | [values](#values)()                                                                                                    |             |
| public static [DnsMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DnsMessage.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### UNKNOWN_HOST

public static final  UNKNOWN_HOST




---

### TIMEOUT

public static final  TIMEOUT




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [DnsMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DnsMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [DnsMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DnsMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


---

