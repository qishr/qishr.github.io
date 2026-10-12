Package [io.github.qishr.cascara.common.service](index.md)

# Class ServiceProviderFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.service.AbstractServiceProviderFactory](../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)<br/>
                io.github.qishr.cascara.common.service.ServiceProviderFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Beta<br/>
public class __ServiceProviderFactory__<br/>extends [AbstractServiceProviderFactory](../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)
</span>


Note: For language processors, use io.github.qishr.cascara.common.lang.util.ProcessorFactory


## Constructor Summary

| Constructor                                                                                          | Description |
|------------------------------------------------------------------------------------------------------|-------------|
| ServiceProviderFactory()                                                                             |             |
| ServiceProviderFactory([SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md) layer) |             |



## Method Summary

| Modifier and Type                                                                                                                   | Method                                                                                                                                                      | Description |
|-------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static io.github.qishr.cascara.common.service.@io.github.qishr.cascara.common.annotation.Experimental ServiceProviderFactory | [system](#system)()                                                                                                                                         |             |
| public [SourceBuffer](../../../../../../io/github/qishr/cascara/common/lang/util/SourceBuffer.md)                                   | [createSourceBuffer](#createsourcebuffer)([SourceBufferOptions](../../../../../../io/github/qishr/cascara/common/lang/util/SourceBufferOptions.md) options) |             |
| public [TypeDescriptor](../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?>                            | [createTypeDescriptor](#createtypedescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)        |             |
| public [ContentTypeResolver](../../../../../../io/github/qishr/cascara/common/util/ContentTypeResolver.md)                          | [getContentTypeResolver](#getcontenttyperesolver)()                                                                                                         |             |


### Methods inherited from [AbstractServiceProviderFactory](../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)

createServiceProvider, createServiceProvider


## Method Details

### system

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public static io.github.qishr.cascara.common.service.@io.github.qishr.cascara.common.annotation.Experimental ServiceProviderFactory __system__()</span>




---

### createSourceBuffer

<span style="font-family: monospace; font-size: 80%;">public [SourceBuffer](../../../../../../io/github/qishr/cascara/common/lang/util/SourceBuffer.md) __createSourceBuffer__([SourceBufferOptions](../../../../../../io/github/qishr/cascara/common/lang/util/SourceBufferOptions.md) options)</span>



**Throws:**

[ServiceException](../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public [TypeDescriptor](../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> __createTypeDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>



**Throws:**

[ServiceException](../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### getContentTypeResolver

<span style="font-family: monospace; font-size: 80%;">public [ContentTypeResolver](../../../../../../io/github/qishr/cascara/common/util/ContentTypeResolver.md) __getContentTypeResolver__()</span>



**Throws:**

[ServiceException](../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

