Package [io.github.qishr.cascara.common.diagnostic.code](index.md)

# Enum HttpDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.code.HttpDiagnosticCode](HttpDiagnosticCode.md)><br/>
                io.github.qishr.cascara.common.diagnostic.code.HttpDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __HttpDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[HttpDiagnosticCode](HttpDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                 | Description |
|-------------------------------|-------------|
| [BAD_REQUEST](#bad_request)   |             |
| [FORBIDDEN](#forbidden)       |             |
| [NOT_FOUND](#not_found)       |             |
| [SERVER_ERROR](#server_error) |             |



## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                 | Description                                                                                                           |
|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| public static [HttpDiagnosticCode](HttpDiagnosticCode.md)[]                                                | [values](#values)()                                                                                                    |                                                                                                                       |
| public static [HttpDiagnosticCode](HttpDiagnosticCode.md)                                                  | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getCode](#getcode)()                                                                                                  |                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getMessage](#getmessage)()                                                                                            |                                                                                                                       |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [fromStatusCode](#fromstatuscode)(int statusCode)                                                                      | Factory method to dynamically resolve or generate an HTTP code straight from a standard network response status code. |



## Enum Constant Details

### BAD_REQUEST

public static final  BAD_REQUEST




---

### FORBIDDEN

public static final  FORBIDDEN




---

### NOT_FOUND

public static final  NOT_FOUND




---

### SERVER_ERROR

public static final  SERVER_ERROR




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [HttpDiagnosticCode](HttpDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [HttpDiagnosticCode](HttpDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

### fromStatusCode

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __fromStatusCode__(int statusCode)</span>

Factory method to dynamically resolve or generate an HTTP code
straight from a standard network response status code.


---

