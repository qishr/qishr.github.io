Package [io.github.qishr.cascara.common.diagnostic.exception](index.md)

# Class LocatableException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.exception.LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.common.diagnostic.exception.LocatableException<br/>
<br/>
Direct Known Subtypes:<br/>
    [ParserException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/ParserException.md), [TokenizerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/TokenizerException.md), [SerializerException](../../../../../../../io/github/qishr/cascara/common/lang/diagnostic/SerializerException.md), [SchemaException](../../../../../../../../cascara.schema/io/github/qishr/cascara/schema/diagnostic/SchemaException.md), [YamlEmitterException](../../../../../../../../cascara.lang.yaml/io/github/qishr/cascara/lang/yaml/diagnostic/YamlEmitterException.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __LocatableException__<br/>extends [LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Description                                                   |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|
| LocatableException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Standard Constructor                                          |
| LocatableException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | Standard constructor for parser-detected logic errors         |
| LocatableException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticMessage](../../../../../../../io/github/qishr/cascara/common/diagnostic/message/DiagnosticMessage.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                       | Constructor for when we only have a URI but no line or column |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|-------------|
| public int                                                                                          | [getLine](#getline)()                                                                                        |             |
| public int                                                                                          | [getColumn](#getcolumn)()                                                                                    |             |
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)        | [getUri](#geturi)()                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getRawMessage](#getrawmessage)()                                                                            |             |
| public void                                                                                         | [setUri](#seturi)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLocalizedMessage](#getlocalizedmessage)()                                                                |             |


### Methods inherited from [LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md)

getDiagnosticMessage, getDetails


## Method Details

### getLine

<span style="font-family: monospace; font-size: 80%;">public int __getLine__()</span>




---

### getColumn

<span style="font-family: monospace; font-size: 80%;">public int __getColumn__()</span>




---

### getUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getUri__()</span>




---

### getRawMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRawMessage__()</span>




---

### setUri

<span style="font-family: monospace; font-size: 80%;">public void __setUri__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>




---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>




---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>



**Overrides:**

[LocalizableRuntimeException](../../../../../../../../cascara.common/io/github/qishr/cascara/common/diagnostic/exception/LocalizableRuntimeException.md#getlocalizedmessage)


---

