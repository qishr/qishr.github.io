Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Enum GenericDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.code.GenericDiagnosticCode](GenericDiagnosticCode.md)><br/>
                io.github.qishr.cascara.common.diagnostic.code.GenericDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __GenericDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[GenericDiagnosticCode](GenericDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                               | Description |
|-------------------------------------------------------------|-------------|
| [INFO](#info)                                               |             |
| [WARN](#warn)                                               |             |
| [UNIMPLEMENTED_METHOD](#unimplemented_method)               |             |
| [ERROR](#error)                                             |             |
| [UNEXPECTED_NULL_PARAMETER](#unexpected_null_parameter)     |             |
| [UNEXPECTED_NULL_RETURN](#unexpected_null_return)           |             |
| [MANIFEST_NOT_FOUND](#manifest_not_found)                   |             |
| [MANIFEST_READ](#manifest_read)                             |             |
| [RESOURCE_INACCESSIBLE](#resource_inaccessible)             |             |
| [EXCEPTION](#exception)                                     |             |
| [RUNTIME_EXCEPTION](#runtime_exception)                     |             |
| [NPE](#npe)                                                 |             |
| [INCONSISTENT_STATE](#inconsistent_state)                   |             |
| [UNSUPPORTED_OPERATION](#unsupported_operation)             |             |
| [IO_ERROR](#io_error)                                       |             |
| [INTERRUPT_ERROR](#interrupt_error)                         |             |
| [FORMAT_ERROR](#format_error)                               |             |
| [INVALID_URI](#invalid_uri)                                 |             |
| [UNKNOWN_URI_SCHEME](#unknown_uri_scheme)                   |             |
| [MALFORMED_BASE64](#malformed_base64)                       |             |
| [MESSAGE_FORMATTING_ERROR](#message_formatting_error)       |             |
| [DIAGNOSTIC_FORMATTING_ERROR](#diagnostic_formatting_error) |             |
| [NO_RESOURCE_PROVIDER](#no_resource_provider)               |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [GenericDiagnosticCode](GenericDiagnosticCode.md)[]                                   | [values](#values)()                                                                                                    |             |
| public static [GenericDiagnosticCode](GenericDiagnosticCode.md)                                     | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### INFO

public static final  INFO




---

### WARN

public static final  WARN




---

### UNIMPLEMENTED_METHOD

public static final  UNIMPLEMENTED_METHOD




---

### ERROR

public static final  ERROR




---

### UNEXPECTED_NULL_PARAMETER

public static final  UNEXPECTED_NULL_PARAMETER




---

### UNEXPECTED_NULL_RETURN

public static final  UNEXPECTED_NULL_RETURN




---

### MANIFEST_NOT_FOUND

public static final  MANIFEST_NOT_FOUND




---

### MANIFEST_READ

public static final  MANIFEST_READ




---

### RESOURCE_INACCESSIBLE

public static final  RESOURCE_INACCESSIBLE




---

### EXCEPTION

public static final  EXCEPTION




---

### RUNTIME_EXCEPTION

public static final  RUNTIME_EXCEPTION




---

### NPE

public static final  NPE




---

### INCONSISTENT_STATE

public static final  INCONSISTENT_STATE




---

### UNSUPPORTED_OPERATION

public static final  UNSUPPORTED_OPERATION




---

### IO_ERROR

public static final  IO_ERROR




---

### INTERRUPT_ERROR

public static final  INTERRUPT_ERROR




---

### FORMAT_ERROR

public static final  FORMAT_ERROR




---

### INVALID_URI

public static final  INVALID_URI




---

### UNKNOWN_URI_SCHEME

public static final  UNKNOWN_URI_SCHEME




---

### MALFORMED_BASE64

public static final  MALFORMED_BASE64




---

### MESSAGE_FORMATTING_ERROR

public static final  MESSAGE_FORMATTING_ERROR




---

### DIAGNOSTIC_FORMATTING_ERROR

public static final  DIAGNOSTIC_FORMATTING_ERROR




---

### NO_RESOURCE_PROVIDER

public static final  NO_RESOURCE_PROVIDER




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [GenericDiagnosticCode](GenericDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [GenericDiagnosticCode](GenericDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

