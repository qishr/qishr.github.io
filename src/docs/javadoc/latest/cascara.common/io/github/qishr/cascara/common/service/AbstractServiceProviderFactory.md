Package [io.github.qishr.cascara.common.service](index.md)

# Class AbstractServiceProviderFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.AbstractServiceProviderFactory<br/>
<br/>
Direct Known Subtypes:<br/>
    [ProcessorFactory](../../../../../../io/github/qishr/cascara/common/lang/processor/ProcessorFactory.md), [ServiceProviderFactory](../../../../../../io/github/qishr/cascara/common/service/ServiceProviderFactory.md), [TypeDescriptorFactory](../../../../../../io/github/qishr/cascara/common/type/TypeDescriptorFactory.md), [ResourceProviderFactory](../../../../../../../cascara.common.io/io/github/qishr/cascara/common/io/ResourceProviderFactory.md), [RendererFactory](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/render/RendererFactory.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __AbstractServiceProviderFactory__</span>


## Constructor Summary

| Constructor                                                                                                  | Description |
|--------------------------------------------------------------------------------------------------------------|-------------|
| AbstractServiceProviderFactory()                                                                             |             |
| AbstractServiceProviderFactory([SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md) layer) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                                                                                                                      | Description |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected T       | [createServiceProvider](#createserviceprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)                                                                                                                                                                                                                                  |             |
| protected T       | [createServiceProvider](#createserviceprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate) |             |



## Method Details

### createServiceProvider

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected T __createServiceProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)</span>




---

### createServiceProvider

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
protected T __createServiceProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate)</span>




---

