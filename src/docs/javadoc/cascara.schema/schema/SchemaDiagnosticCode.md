Package [io.github.qishr.cascara.schema](index.md)

# Enum SchemaDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.schema.SchemaDiagnosticCode](SchemaDiagnosticCode.md)><br/>
                io.github.qishr.cascara.schema.SchemaDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __SchemaDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[SchemaDiagnosticCode](SchemaDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                               | Description |
|-------------------------------------------------------------|-------------|
| [ERROR](#error)                                             |             |
| [UNIMPLEMENTED](#unimplemented)                             |             |
| [INVALID_SCHEMA_URI](#invalid_schema_uri)                   |             |
| [UNRECOGNIZED_LIFECYCLE](#unrecognized_lifecycle)           |             |
| [MISSING_MODULE_NAME](#missing_module_name)                 |             |
| [MISSING_SCHEMA_NAME](#missing_schema_name)                 |             |
| [MISSING_VERSION](#missing_version)                         |             |
| [COMPILER](#compiler)                                       |             |
| [ROOT_MUST_BE_MAP](#root_must_be_map)                       |             |
| [NO_ID](#no_id)                                             |             |
| [DECOMPILER](#decompiler)                                   |             |
| [MISSING_REF](#missing_ref)                                 |             |
| [GENERATOR](#generator)                                     |             |
| [NOT_OBJECT](#not_object)                                   |             |
| [RESOLVER](#resolver)                                       |             |
| [RESOLUTION_FAILED](#resolution_failed)                     |             |
| [LOCAL_RESOLUTION_FAILED](#local_resolution_failed)         |             |
| [NODE_NOT_FOUND](#node_not_found)                           |             |
| [META_INITIALIZATION_FAILURE](#meta_initialization_failure) |             |
| [STORE](#store)                                             |             |
| [FAILED_TO_STORE](#failed_to_store)                         |             |
| [NOT_FOUND](#not_found)                                     |             |
| [DYNAMIC_NOT_ALLOWED](#dynamic_not_allowed)                 |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [SchemaDiagnosticCode](SchemaDiagnosticCode.md)[]                                     | [values](#values)()                                                                                                    |             |
| public static [SchemaDiagnosticCode](SchemaDiagnosticCode.md)                                       | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### ERROR

public static final  ERROR




---

### UNIMPLEMENTED

public static final  UNIMPLEMENTED




---

### INVALID_SCHEMA_URI

public static final  INVALID_SCHEMA_URI




---

### UNRECOGNIZED_LIFECYCLE

public static final  UNRECOGNIZED_LIFECYCLE




---

### MISSING_MODULE_NAME

public static final  MISSING_MODULE_NAME




---

### MISSING_SCHEMA_NAME

public static final  MISSING_SCHEMA_NAME




---

### MISSING_VERSION

public static final  MISSING_VERSION




---

### COMPILER

public static final  COMPILER




---

### ROOT_MUST_BE_MAP

public static final  ROOT_MUST_BE_MAP




---

### NO_ID

public static final  NO_ID




---

### DECOMPILER

public static final  DECOMPILER




---

### MISSING_REF

public static final  MISSING_REF




---

### GENERATOR

public static final  GENERATOR




---

### NOT_OBJECT

public static final  NOT_OBJECT




---

### RESOLVER

public static final  RESOLVER




---

### RESOLUTION_FAILED

public static final  RESOLUTION_FAILED




---

### LOCAL_RESOLUTION_FAILED

public static final  LOCAL_RESOLUTION_FAILED




---

### NODE_NOT_FOUND

public static final  NODE_NOT_FOUND




---

### META_INITIALIZATION_FAILURE

public static final  META_INITIALIZATION_FAILURE




---

### STORE

public static final  STORE




---

### FAILED_TO_STORE

public static final  FAILED_TO_STORE




---

### NOT_FOUND

public static final  NOT_FOUND




---

### DYNAMIC_NOT_ALLOWED

public static final  DYNAMIC_NOT_ALLOWED




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [SchemaDiagnosticCode](SchemaDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [SchemaDiagnosticCode](SchemaDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>



**Specified By:**

[DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md)


---

