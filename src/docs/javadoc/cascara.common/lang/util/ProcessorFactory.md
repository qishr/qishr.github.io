Package [io.github.qishr.cascara.common.lang.util](index.md)

# Class ProcessorFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.service.AbstractServiceProviderFactory](../../service/AbstractServiceProviderFactory.md)<br/>
                io.github.qishr.cascara.common.lang.util.ProcessorFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Beta<br/>
public class __ProcessorFactory__<br/>extends [AbstractServiceProviderFactory](../../service/AbstractServiceProviderFactory.md)
</span>


## Field Summary

| Modifier and Type                                                                                                | Field                         | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CONTENT_TYPE](#content_type) |             |



## Constructor Summary

| Constructor                                                                           | Description |
|---------------------------------------------------------------------------------------|-------------|
| ProcessorFactory()                                                                    |             |
| ProcessorFactory([ServiceProviderLayer](../../service/ServiceProviderLayer.md) layer) |             |



## Method Summary

| Modifier and Type                                      | Method                                                                                                                                          | Description |
|--------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Tokenizer](../processor/Tokenizer.md)<?>       | [createTokenizer](#createtokenizer)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)   |             |
| public [Tokenizer](../processor/Tokenizer.md)<?>       | [createTokenizer](#createtokenizer)([ContentType](../../util/ContentType.md) contentType)                                                       |             |
| public [AstParser](../processor/AstParser.md)<?, ?, ?> | [createAstParser](#createastparser)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)   |             |
| public [AstParser](../processor/AstParser.md)<?, ?, ?> | [createAstParser](#createastparser)([ContentType](../../util/ContentType.md) contentType)                                                       |             |
| public [PullParser](../processor/PullParser.md)        | [createPullParser](#createpullparser)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType) |             |
| public [PullParser](../processor/PullParser.md)        | [createPullParser](#createpullparser)([ContentType](../../util/ContentType.md) contentType)                                                     |             |
| public [PushParser](../processor/PushParser.md)        | [createPushParser](#createpushparser)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType) |             |
| public [PushParser](../processor/PushParser.md)        | [createPushParser](#createpushparser)([ContentType](../../util/ContentType.md) contentType)                                                     |             |
| public [Serializer](../processor/Serializer.md)<?>     | [createSerializer](#createserializer)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType) |             |
| public [Serializer](../processor/Serializer.md)<?>     | [createSerializer](#createserializer)([ContentType](../../util/ContentType.md) contentType)                                                     |             |


### Methods inherited from [AbstractServiceProviderFactory](../../service/AbstractServiceProviderFactory.md)

createServiceProvider


## Field Details

### CONTENT_TYPE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CONTENT_TYPE__</span>



**See Also:**


[Constant Field Values](../../../../../../../constant-values.md)



---


## Method Details

### createTokenizer

<span style="font-family: monospace; font-size: 80%;">public [Tokenizer](../processor/Tokenizer.md)<?> __createTokenizer__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createTokenizer

<span style="font-family: monospace; font-size: 80%;">public [Tokenizer](../processor/Tokenizer.md)<?> __createTokenizer__([ContentType](../../util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createAstParser

<span style="font-family: monospace; font-size: 80%;">public [AstParser](../processor/AstParser.md)<?, ?, ?> __createAstParser__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createAstParser

<span style="font-family: monospace; font-size: 80%;">public [AstParser](../processor/AstParser.md)<?, ?, ?> __createAstParser__([ContentType](../../util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createPullParser

<span style="font-family: monospace; font-size: 80%;">public [PullParser](../processor/PullParser.md) __createPullParser__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createPullParser

<span style="font-family: monospace; font-size: 80%;">public [PullParser](../processor/PullParser.md) __createPullParser__([ContentType](../../util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createPushParser

<span style="font-family: monospace; font-size: 80%;">public [PushParser](../processor/PushParser.md) __createPushParser__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createPushParser

<span style="font-family: monospace; font-size: 80%;">public [PushParser](../processor/PushParser.md) __createPushParser__([ContentType](../../util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createSerializer

<span style="font-family: monospace; font-size: 80%;">public [Serializer](../processor/Serializer.md)<?> __createSerializer__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createSerializer

<span style="font-family: monospace; font-size: 80%;">public [Serializer](../processor/Serializer.md)<?> __createSerializer__([ContentType](../../util/ContentType.md) contentType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

