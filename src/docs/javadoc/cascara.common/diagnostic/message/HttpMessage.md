Package [io.github.qishr.cascara.common.diagnostic.message](index.md)

# Enum HttpMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.diagnostic.message.HttpMessage](HttpMessage.md)><br/>
                io.github.qishr.cascara.common.diagnostic.message.HttpMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticMessage](DiagnosticMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __HttpMessage__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[HttpMessage](HttpMessage.md)>
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
| public static [HttpMessage](HttpMessage.md)[]                                                              | [values](#values)()                                                                                                    |                                                                                                                       |
| public static [HttpMessage](HttpMessage.md)                                                                | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getCode](#getcode)()                                                                                                  |                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getFormat](#getformat)()                                                                                              |                                                                                                                       |
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

<span style="font-family: monospace; font-size: 80%;">public static [HttpMessage](HttpMessage.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [HttpMessage](HttpMessage.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




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

### fromStatusCode

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __fromStatusCode__(int statusCode)</span>

Factory method to dynamically resolve or generate an HTTP code
straight from a standard network response status code.


---

