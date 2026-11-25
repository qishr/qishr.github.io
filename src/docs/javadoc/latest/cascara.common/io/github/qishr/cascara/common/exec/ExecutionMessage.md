Package [io.github.qishr.cascara.common.exec](index.md)

# Enum ExecutionMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.exec.ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)><br/>
                io.github.qishr.cascara.common.exec.ExecutionMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __ExecutionMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)>
</span>


##Enum Constants

| Enum Constant                                                           | Description |
|-------------------------------------------------------------------------|-------------|
| [TASK_FAILED](#task_failed)                                             |             |
| [MAIN_CLASS_ERROR](#main_class_error)                                   |             |
| [UNRESOLVE_INPUT_CLASS](#unresolve_input_class)                         |             |
| [PROCESS_NOT_STARTED](#process_not_started)                             |             |
| [PROCESS_NOT_EXITED](#process_not_exited)                               |             |
| [INPUT_FAILED](#input_failed)                                           |             |
| [OUTPUT_FAILED](#output_failed)                                         |             |
| [INTERRUPT](#interrupt)                                                 |             |
| [NO_DESERIALIZER](#no_deserializer)                                     |             |
| [DESERIALIZATION_FAILED](#deserialization_failed)                       |             |
| [DIAGNOSTIC_SERVER_FAILED](#diagnostic_server_failed)                   |             |
| [DIAGNOSTIC_DESERIALIZATION_FAILED](#diagnostic_deserialization_failed) |             |
| [IPC_INIT_FAILED](#ipc_init_failed)                                     |             |
| [IPC_NO_SOCKET_FILE](#ipc_no_socket_file)                               |             |
| [IPC_CONNECT_FAILED](#ipc_connect_failed)                               |             |
| [IPC_RECV_FAILED](#ipc_recv_failed)                                     |             |
| [IPC_CLOSE_FAILED](#ipc_close_failed)                                   |             |
| [IPC_REMOVE_FAILED](#ipc_remove_failed)                                 |             |



## Method Summary

| Modifier and Type                                                                                             | Method                                                                                                                 | Description |
|---------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)[] | [values](#values)()                                                                                                    |             |
| public static [ExecutionMessage](../../../../../../io/github/qishr/cascara/common/exec/ExecutionMessage.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)           | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)           | [getFormat](#getformat)()                                                                                              |             |



## Enum Constant Details

### TASK_FAILED

public static final  TASK_FAILED




---

### MAIN_CLASS_ERROR

public static final  MAIN_CLASS_ERROR




---

### UNRESOLVE_INPUT_CLASS

public static final  UNRESOLVE_INPUT_CLASS




---

### PROCESS_NOT_STARTED

public static final  PROCESS_NOT_STARTED




---

### PROCESS_NOT_EXITED

public static final  PROCESS_NOT_EXITED




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

### NO_DESERIALIZER

public static final  NO_DESERIALIZER




---

### DESERIALIZATION_FAILED

public static final  DESERIALIZATION_FAILED




---

### DIAGNOSTIC_SERVER_FAILED

public static final  DIAGNOSTIC_SERVER_FAILED




---

### DIAGNOSTIC_DESERIALIZATION_FAILED

public static final  DIAGNOSTIC_DESERIALIZATION_FAILED




---

### IPC_INIT_FAILED

public static final  IPC_INIT_FAILED




---

### IPC_NO_SOCKET_FILE

public static final  IPC_NO_SOCKET_FILE




---

### IPC_CONNECT_FAILED

public static final  IPC_CONNECT_FAILED




---

### IPC_RECV_FAILED

public static final  IPC_RECV_FAILED




---

### IPC_CLOSE_FAILED

public static final  IPC_CLOSE_FAILED




---

### IPC_REMOVE_FAILED

public static final  IPC_REMOVE_FAILED




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

[LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)


---

