Package [io.github.qishr.cascara.common.lang.type](index.md)

# Class TypeDescriptorFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.service.AbstractServiceProviderFactory](../../service/AbstractServiceProviderFactory.md)<br/>
                io.github.qishr.cascara.common.lang.type.TypeDescriptorFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Beta<br/>
public class __TypeDescriptorFactory__<br/>extends [AbstractServiceProviderFactory](../../service/AbstractServiceProviderFactory.md)
</span>


## Constructor Summary

| Constructor                                                                                | Description |
|--------------------------------------------------------------------------------------------|-------------|
| TypeDescriptorFactory()                                                                    |             |
| TypeDescriptorFactory([ServiceProviderLayer](../../service/ServiceProviderLayer.md) layer) |             |



## Method Summary

| Modifier and Type                                 | Method                                                                                                                                                       | Description |
|---------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [TypeDescriptor](TypeDescriptor.md)<?>     | [createTypeDescriptor](#createtypedescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)         |             |
| public [ScalarDescriptor](ScalarDescriptor.md)<?> | [createScalarDescriptor](#createscalardescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)     |             |
| public [ScalarDescriptor](ScalarDescriptor.md)<?> | [createScalarDescriptor](#createscalardescriptor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaFormat) |             |


### Methods inherited from [AbstractServiceProviderFactory](../../service/AbstractServiceProviderFactory.md)

createServiceProvider


## Method Details

### createTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public [TypeDescriptor](TypeDescriptor.md)<?> __createTypeDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createScalarDescriptor

<span style="font-family: monospace; font-size: 80%;">public [ScalarDescriptor](ScalarDescriptor.md)<?> __createScalarDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

### createScalarDescriptor

<span style="font-family: monospace; font-size: 80%;">public [ScalarDescriptor](ScalarDescriptor.md)<?> __createScalarDescriptor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) schemaFormat)</span>



**Throws:**

[ServiceException](../../service/ServiceException.md)


---

