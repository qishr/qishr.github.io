Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Class ProcessorFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.service.AbstractServiceProviderFactory](../../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)<br/>
                io.github.qishr.cascara.common.lang.processor.ProcessorFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Beta<br/>
public class __ProcessorFactory__<br/>extends [AbstractServiceProviderFactory](../../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)
</span>


## Field Summary

| Modifier and Type                                                                                                | Field                         | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CONTENT_TYPE](#content_type) |             |



## Constructor Summary

| Constructor                                                                                       | Description |
|---------------------------------------------------------------------------------------------------|-------------|
| ProcessorFactory()                                                                                |             |
| ProcessorFactory([SPL](../../../../../../../io/github/qishr/cascara/common/service/SPL.md) layer) |             |



## Method Summary

| Modifier and Type                                                                                                                    | Method                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static io.github.qishr.cascara.common.lang.processor.@io.github.qishr.cascara.common.annotation.Experimental ProcessorFactory | [system](#system)()                                                                                                                             |             |
| public [Tokenizer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Tokenizer.md)<?>                               | [createTokenizer](#createtokenizer)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)   |             |
| public [Tokenizer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Tokenizer.md)<?>                               | [createTokenizer](#createtokenizer)([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)         |             |
| public [AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<?, ?, ?>                         | [createAstParser](#createastparser)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)   |             |
| public [AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<?, ?, ?>                         | [createAstParser](#createastparser)([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)         |             |
| public [PullParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PullParser.md)<?>                             | [createPullParser](#createpullparser)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType) |             |
| public [PullParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PullParser.md)<?>                             | [createPullParser](#createpullparser)([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)       |             |
| public [PushParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PushParser.md)<?, ?>                          | [createPushParser](#createpushparser)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType) |             |
| public [PushParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PushParser.md)<?, ?>                          | [createPushParser](#createpushparser)([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)       |             |
| public [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?>                             | [createSerializer](#createserializer)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType) |             |
| public [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?>                             | [createSerializer](#createserializer)([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)       |             |


### Methods inherited from [AbstractServiceProviderFactory](../../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)

createServiceProvider, createServiceProvider


## Field Details

### CONTENT_TYPE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CONTENT_TYPE__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### system

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public static io.github.qishr.cascara.common.lang.processor.@io.github.qishr.cascara.common.annotation.Experimental ProcessorFactory __system__()</span>




---

### createTokenizer

<span style="font-family: monospace; font-size: 80%;">public [Tokenizer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Tokenizer.md)<?> __createTokenizer__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createTokenizer

<span style="font-family: monospace; font-size: 80%;">public [Tokenizer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Tokenizer.md)<?> __createTokenizer__([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createAstParser

<span style="font-family: monospace; font-size: 80%;">public [AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<?, ?, ?> __createAstParser__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createAstParser

<span style="font-family: monospace; font-size: 80%;">public [AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md)<?, ?, ?> __createAstParser__([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createPullParser

<span style="font-family: monospace; font-size: 80%;">public [PullParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PullParser.md)<?> __createPullParser__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createPullParser

<span style="font-family: monospace; font-size: 80%;">public [PullParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PullParser.md)<?> __createPullParser__([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createPushParser

<span style="font-family: monospace; font-size: 80%;">public [PushParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PushParser.md)<?, ?> __createPushParser__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createPushParser

<span style="font-family: monospace; font-size: 80%;">public [PushParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PushParser.md)<?, ?> __createPushParser__([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createSerializer

<span style="font-family: monospace; font-size: 80%;">public [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?> __createSerializer__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createSerializer

<span style="font-family: monospace; font-size: 80%;">public [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md)<?> __createSerializer__([ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

