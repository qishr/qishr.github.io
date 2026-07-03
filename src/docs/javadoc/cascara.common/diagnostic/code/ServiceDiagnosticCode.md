Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Enum ServiceDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.code.ServiceDiagnosticCode](ServiceDiagnosticCode.md)><br/>
                io.github.qishr.cascara.common.diagnostic.code.ServiceDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __ServiceDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[ServiceDiagnosticCode](ServiceDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                               | Description |
|-------------------------------------------------------------|-------------|
| [NOT_A_SERVICE](#not_a_service)                             |             |
| [NOT_A_SERVICE_PROVIDER](#not_a_service_provider)           |             |
| [FAILED_TO_REGISTER_MODULE](#failed_to_register_module)     |             |
| [NOARGS_CONSTRUCTOR_REQUIRED](#noargs_constructor_required) |             |
| [FAILED_TO_INSTANTIATE_CLASS](#failed_to_instantiate_class) |             |
| [FAILED_TO_LOAD_CLASS](#failed_to_load_class)               |             |
| [FAILED_TO_READ_JAR](#failed_to_read_jar)                   |             |
| [NON_MODULAR_JAR](#non_modular_jar)                         |             |
| [NO_PROVIDER_REGISTERED](#no_provider_registered)           |             |
| [NO_PROVIDER_REGISTERED_FOR](#no_provider_registered_for)   |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ServiceDiagnosticCode](ServiceDiagnosticCode.md)[]                                   | [values](#values)()                                                                                                    |             |
| public static [ServiceDiagnosticCode](ServiceDiagnosticCode.md)                                     | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### NOT_A_SERVICE

public static final  NOT_A_SERVICE




---

### NOT_A_SERVICE_PROVIDER

public static final  NOT_A_SERVICE_PROVIDER




---

### FAILED_TO_REGISTER_MODULE

public static final  FAILED_TO_REGISTER_MODULE




---

### NOARGS_CONSTRUCTOR_REQUIRED

public static final  NOARGS_CONSTRUCTOR_REQUIRED




---

### FAILED_TO_INSTANTIATE_CLASS

public static final  FAILED_TO_INSTANTIATE_CLASS




---

### FAILED_TO_LOAD_CLASS

public static final  FAILED_TO_LOAD_CLASS




---

### FAILED_TO_READ_JAR

public static final  FAILED_TO_READ_JAR




---

### NON_MODULAR_JAR

public static final  NON_MODULAR_JAR




---

### NO_PROVIDER_REGISTERED

public static final  NO_PROVIDER_REGISTERED




---

### NO_PROVIDER_REGISTERED_FOR

public static final  NO_PROVIDER_REGISTERED_FOR




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [ServiceDiagnosticCode](ServiceDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [ServiceDiagnosticCode](ServiceDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

