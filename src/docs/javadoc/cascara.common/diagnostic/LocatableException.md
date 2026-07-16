Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class LocatableException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.diagnostic.LocalizableRuntimeException](LocalizableRuntimeException.md)<br/>
                                        io.github.qishr.cascara.common.diagnostic.LocatableException<br/>
<br/>
Direct Known Subtypes:<br/>
    [ParserException](../lang/exception/ParserException.md), [TokenizerException](../lang/exception/TokenizerException.md), [SerializerException](../lang/exception/SerializerException.md), [SchemaException](../../cascara.schema/schema/exception/SchemaException.md), [YamlEmitterException](../../cascara.lang.yaml/yaml/exception/YamlEmitterException.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __LocatableException__<br/>extends [LocalizableRuntimeException](LocalizableRuntimeException.md)
</span>


## Field Summary

| Modifier and Type       | Field                           | Description |
|-------------------------|---------------------------------|-------------|
| public static final int | [UNKNOWN_COORD](#unknown_coord) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                   |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|
| LocatableException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Standard Constructor                                          |
| LocatableException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, int line, int column, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                                                                                                           | Standard constructor for parser-detected logic errors         |
| LocatableException([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)                       | Constructor for when we only have a URI but no line or column |



## Method Summary

| Modifier and Type                                                                                   | Method                                        | Description |
|-----------------------------------------------------------------------------------------------------|-----------------------------------------------|-------------|
| public int                                                                                          | [getLine](#getline)()                         |             |
| public int                                                                                          | [getColumn](#getcolumn)()                     |             |
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)        | [getUri](#geturi)()                           |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getRawMessage](#getrawmessage)()             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                   |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLocalizedMessage](#getlocalizedmessage)() |             |


### Methods inherited from [LocalizableRuntimeException](LocalizableRuntimeException.md)

getCode, getDetails


## Field Details

### UNKNOWN_COORD

<span style="font-family: monospace; font-size: 80%;">public static final int __UNKNOWN_COORD__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


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

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>




---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>



**Overrides:**

[LocalizableRuntimeException](../cascara.common/diagnostic/LocalizableRuntimeException.md#getlocalizedmessage)


---

