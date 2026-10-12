Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class TypeDescriptorFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.service.AbstractServiceProviderFactory](../../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)<br/>
                io.github.qishr.cascara.common.lang.type.TypeDescriptorFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Beta<br/>
public class __TypeDescriptorFactory__<br/>extends [AbstractServiceProviderFactory](../../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)
</span>


## Constructor Summary

| Constructor                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------|-------------|
| TypeDescriptorFactory()                                                                                |             |
| TypeDescriptorFactory([SPL](../../../../../../../io/github/qishr/cascara/common/service/SPL.md) layer) |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?>     | [createTypeDescriptor](#createtypedescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)         |             |
| public [ScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/ScalarDescriptor.md)<?> | [createScalarDescriptor](#createscalardescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)     |             |
| public [ScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/ScalarDescriptor.md)<?> | [createScalarDescriptor](#createscalardescriptor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaFormat) |             |


### Methods inherited from [AbstractServiceProviderFactory](../../../../../../../io/github/qishr/cascara/common/service/AbstractServiceProviderFactory.md)

createServiceProvider, createServiceProvider


## Method Details

### createTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public [TypeDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/TypeDescriptor.md)<?> __createTypeDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createScalarDescriptor

<span style="font-family: monospace; font-size: 80%;">public [ScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/ScalarDescriptor.md)<?> __createScalarDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

### createScalarDescriptor

<span style="font-family: monospace; font-size: 80%;">public [ScalarDescriptor](../../../../../../../io/github/qishr/cascara/common/lang/type/ScalarDescriptor.md)<?> __createScalarDescriptor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaFormat)</span>



**Throws:**

[ServiceException](../../../../../../../io/github/qishr/cascara/common/service/ServiceException.md)


---

