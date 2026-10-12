Package [io.github.qishr.cascara.common.exec](index.md)

# Enum ExecutionMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.exec.ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)><br/>
                io.github.qishr.cascara.common.exec.ExecutionMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __ExecutionMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)>
</span>


##Enum Constants

| Enum Constant                                                           | Description |
|-------------------------------------------------------------------------|-------------|
| [PROCESS_FAILED](#process_failed)                                       |             |
| [TASK_FAILED](#task_failed)                                             |             |
| [INPUT_FAILED](#input_failed)                                           |             |
| [OUTPUT_FAILED](#output_failed)                                         |             |
| [INTERRUPT](#interrupt)                                                 |             |
| [DIAGNOSTIC_SERVER_FAILED](#diagnostic_server_failed)                   |             |
| [DIAGNOSTIC_DESERIALIZATION_FAILED](#diagnostic_deserialization_failed) |             |
| [DESERIALIZATION_FAILED](#deserialization_failed)                       |             |
| [IPC_RECV_FAILED](#ipc_recv_failed)                                     |             |
| [NO_SOCKET_FILE](#no_socket_file)                                       |             |
| [CONNECT_FAILED](#connect_failed)                                       |             |



## Method Summary

| Modifier and Type                                                                                             | Method                                                                                                                 | Description |
|---------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)[] | [values](#values)()                                                                                                    |             |
| public static [ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)           | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)           | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### PROCESS_FAILED

public static final  PROCESS_FAILED




---

### TASK_FAILED

public static final  TASK_FAILED




---

### INPUT_FAILED

public static final  INPUT_FAILED




---

### OUTPUT_FAILED

public static final  OUTPUT_FAILED




---

### INTERRUPT

public static final  INTERRUPT




---

### DIAGNOSTIC_SERVER_FAILED

public static final  DIAGNOSTIC_SERVER_FAILED




---

### DIAGNOSTIC_DESERIALIZATION_FAILED

public static final  DIAGNOSTIC_DESERIALIZATION_FAILED




---

### DESERIALIZATION_FAILED

public static final  DESERIALIZATION_FAILED




---

### IPC_RECV_FAILED

public static final  IPC_RECV_FAILED




---

### NO_SOCKET_FILE

public static final  NO_SOCKET_FILE




---

### CONNECT_FAILED

public static final  CONNECT_FAILED




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

