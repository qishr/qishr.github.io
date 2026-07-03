Package [io.github.qishr.cascara.schema.util](index.md)

# Class ValidationResult
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.ValidationResult<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ValidationResult__</span>


## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| ValidationResult() |             |



## Method Summary

| Modifier and Type                                                                                                                       | Method                                                                                                                                                                                                                                            | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                             | [addError](#adderror)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, int line, int column) |             |
| public boolean                                                                                                                          | [isValid](#isvalid)()                                                                                                                                                                                                                             |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Message](ValidationResult.Message.md)> | [getMessages](#getmessages)()                                                                                                                                                                                                                     |             |



## Method Details

### addError

<span style="font-family: monospace; font-size: 80%;">public void __addError__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, int line, int column)</span>




---

### isValid

<span style="font-family: monospace; font-size: 80%;">public boolean __isValid__()</span>




---

### getMessages

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Message](ValidationResult.Message.md)> __getMessages__()</span>




---

