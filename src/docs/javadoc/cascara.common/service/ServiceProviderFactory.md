Package [io.github.qishr.cascara.common.service](index.md)

# Class ServiceProviderFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.service.AbstractServiceProviderFactory](AbstractServiceProviderFactory.md)<br/>
                io.github.qishr.cascara.common.service.ServiceProviderFactory<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Beta<br/>
public class __ServiceProviderFactory__<br/>extends [AbstractServiceProviderFactory](AbstractServiceProviderFactory.md)
</span>


## Constructor Summary

| Constructor                                                                   | Description |
|-------------------------------------------------------------------------------|-------------|
| ServiceProviderFactory()                                                      |             |
| ServiceProviderFactory([ServiceProviderLayer](ServiceProviderLayer.md) layer) |             |



## Method Summary

| Modifier and Type                                          | Method                                                                                                                                               | Description |
|------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [AstParser](../lang/processor/AstParser.md)<?, ?>   | [createParser](#createparser)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)              |             |
| public [TypeDescriptor](../lang/type/TypeDescriptor.md)<?> | [createTypeDescriptor](#createtypedescriptor)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType) |             |


### Methods inherited from [AbstractServiceProviderFactory](AbstractServiceProviderFactory.md)

createServiceProvider


## Method Details

### createParser

<span style="font-family: monospace; font-size: 80%;">public [AstParser](../lang/processor/AstParser.md)<?, ?> __createParser__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) contentType)</span>



**Throws:**

[ServiceException](ServiceException.md)


---

### createTypeDescriptor

<span style="font-family: monospace; font-size: 80%;">public [TypeDescriptor](../lang/type/TypeDescriptor.md)<?> __createTypeDescriptor__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>



**Throws:**

[ServiceException](ServiceException.md)


---

