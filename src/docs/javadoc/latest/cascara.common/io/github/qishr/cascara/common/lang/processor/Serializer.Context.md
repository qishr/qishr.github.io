Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Class Context
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.Serializer.Context<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public static class __Context__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Context([Serialize](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Serialize.md) serialize, [Deserialize](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.Deserialize.md) deserialize, [DeserializeEnum](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.DeserializeEnum.md) deserializeEnum, [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter) |             |



## Method Summary

| Modifier and Type                                                                                    | Method                                                                                                                                                                                                                                              | Description |
|------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md)            | [serialize](#serialize)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)         |             |
| public C                                                                                             | [deserialize](#deserialize)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)                      |             |
| public [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?>   | [deserializeEnum](#deserializeenum)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType) |             |
| public [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) | [getReporter](#getreporter)()                                                                                                                                                                                                                       |             |



## Method Details

### serialize

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) __serialize__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) jvmInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)</span>




---

### deserialize

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public C __deserialize__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)</span>




---

### deserializeEnum

<span style="font-family: monospace; font-size: 80%;">public [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> __deserializeEnum__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType)</span>




---

### getReporter

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public [Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) __getReporter__()</span>




---

