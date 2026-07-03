Package [io.github.qishr.cascara.common.service](index.md)

# Class AbstractServiceProviderFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.AbstractServiceProviderFactory<br/>
<br/>
Direct Known Subtypes:<br/>
    [ProcessorFactory](../lang/processor/ProcessorFactory.md), [TypeDescriptorFactory](../lang/type/TypeDescriptorFactory.md), [ServiceProviderFactory](ServiceProviderFactory.md), [RendererFactory](../../cascara.ui/render/RendererFactory.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __AbstractServiceProviderFactory__</span>


## Constructor Summary

| Constructor                                                                           | Description |
|---------------------------------------------------------------------------------------|-------------|
| AbstractServiceProviderFactory()                                                      |             |
| AbstractServiceProviderFactory([ServiceProviderLayer](ServiceProviderLayer.md) layer) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                                                                                                                                           | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected T       | [createServiceProvider](#createserviceprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate) |             |



## Method Details

### createServiceProvider

<span style="font-family: monospace; font-size: 80%;">protected T __createServiceProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate)</span>




---

