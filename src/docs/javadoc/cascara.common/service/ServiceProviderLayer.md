Package [io.github.qishr.cascara.common.service](index.md)

# Class ServiceProviderLayer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.ServiceProviderLayer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ServiceProviderLayer__</span>


## Method Summary

| Modifier and Type                                                                                                                                            | Method                                                                                                                                                                                                                                                                                                                                                               | Description                                                                                      |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| public static [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [getRootLayer](#getrootlayer)()                                                                                                                                                                                                                                                                                                                                      | Retrieves the root Service Provider Layer.                                                       |
| public static [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [getRootLayer](#getrootlayer)([Reporter](../diagnostic/Reporter.md) reporter)                                                                                                                                                                                                                                                                                        | Retrieves the root Service Provider Layer.                                                       |
| public static T                                                                                                                                              | [loadProvider](#loadprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> providerClass)                                                                                                                                                                                                                           |                                                                                                  |
| public static T                                                                                                                                              | [loadProvider](#loadprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [ServiceMetadata](ServiceMetadata.md) metadata)                                                                                                                                                                             |                                                                                                  |
| public static T                                                                                                                                              | [loadDefault](#loaddefault)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)                                                                                                                                                                                                                               |                                                                                                  |
| public java.util.Set<java.lang.Class<[ServiceProvider](ServiceProvider.md)>                                                                                  | [findServiceTypes](#findservicetypes)()                                                                                                                                                                                                                                                                                                                              | Returns a list of all known service types.                                                       |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ServiceMetadata](ServiceMetadata.md)>                         | [findServices](#findservices)()                                                                                                                                                                                                                                                                                                                                      |                                                                                                  |
| public [ServiceMetadata](ServiceMetadata.md)                                                                                                                 | [findProvider](#findprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)                                                                                                                                                                               | Retrieves metadata of the nearest known provider of the specified service type.                  |
| public [ServiceMetadata](ServiceMetadata.md)                                                                                                                 | [findProvider](#findprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate)         | Retrieves metadata of the nearest known provider whose capabilities satisfy the given predicate. |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                       | [findAllProviders](#findallproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)                                                                                                                                                                       | Retrieves metadata of all known providers of the specified service type.                         |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                       | [findAllProviders](#findallproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate) | Retrieves metadata of all known providers whose capabilities satisfy the given predicate.        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                          | [getName](#getname)()                                                                                                                                                                                                                                                                                                                                                |                                                                                                  |
| public [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                       | [getParent](#getparent)()                                                                                                                                                                                                                                                                                                                                            |                                                                                                  |
| public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceProviderLayer](ServiceProviderLayer.md)> | [getChildren](#getchildren)()                                                                                                                                                                                                                                                                                                                                        |                                                                                                  |
| public [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                       | [getChild](#getchild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                             |                                                                                                  |
| public boolean                                                                                                                                               | [hasChild](#haschild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                             |                                                                                                  |
| public boolean                                                                                                                                               | [hasProvider](#hasprovider)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                       |                                                                                                  |
| public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)>           | [getProvidersByFqcn](#getprovidersbyfqcn)()                                                                                                                                                                                                                                                                                                                          |                                                                                                  |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                          | [getModulePath](#getmodulepath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                   |                                                                                                  |
| public boolean                                                                                                                                               | [isPublic](#ispublic)()                                                                                                                                                                                                                                                                                                                                              |                                                                                                  |
| public void                                                                                                                                                  | [setPublic](#setpublic)(boolean v)                                                                                                                                                                                                                                                                                                                                   |                                                                                                  |
| public [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                       | [setReporter](#setreporter)([Reporter](../diagnostic/Reporter.md) reporter)                                                                                                                                                                                                                                                                                          | Sets the reporter for communicating mapping warnings or errors in this layer.                    |
| public [ServiceMetadata](ServiceMetadata.md)                                                                                                                 | [getProvider](#getprovider)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) providerName)                                                                                                                                                                                                                               | Retrieves metadata of the specified provider if it exists in this layer.                         |
| public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)>           | [getProviders](#getproviders)()                                                                                                                                                                                                                                                                                                                                      | Retrieves metadata of providers of the specified service type in this layer.                     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                       | [getProviders](#getproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)                                                                                                                                                                               | Retrieves metadata of providers of the specified service type in this layer.                     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                       | [getProviders](#getproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate)         | Retrieves metadata of providers in this layer whose capabilities satisfy the given predicate.    |
| public [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                       | [create](#create)()                                                                                                                                                                                                                                                                                                                                                  |                                                                                                  |
| public [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                       | [create](#create)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                 |                                                                                                  |
| public void                                                                                                                                                  | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) layerName)                                                                                                                                                                                                                                            |                                                                                                  |
| public void                                                                                                                                                  | [registerModule](#registermodule)([Module](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Module.html) module)                                                                                                                                                                                                                               |                                                                                                  |
| public void                                                                                                                                                  | [registerClass](#registerclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type)                                                                                                                                                                                                                                  |                                                                                                  |
| public void                                                                                                                                                  | [registerJar](#registerjar)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)                                                                                                                                                                                                                                    |                                                                                                  |



## Method Details

### getRootLayer

<span style="font-family: monospace; font-size: 80%;">public static [ServiceProviderLayer](ServiceProviderLayer.md) __getRootLayer__()</span>

Retrieves the root Service Provider Layer.On the initial call, the root layer will be configured.


---

### getRootLayer

<span style="font-family: monospace; font-size: 80%;">public static [ServiceProviderLayer](ServiceProviderLayer.md) __getRootLayer__([Reporter](../diagnostic/Reporter.md) reporter)</span>

Retrieves the root Service Provider Layer.On the initial call, the root layer will be configured with a specified Reporter.
This reporter is used for non-fatal error and warning reporting.


---

### loadProvider

<span style="font-family: monospace; font-size: 80%;">public static T __loadProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> providerClass)</span>




---

### loadProvider

<span style="font-family: monospace; font-size: 80%;">public static T __loadProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [ServiceMetadata](ServiceMetadata.md) metadata)</span>




---

### loadDefault

<span style="font-family: monospace; font-size: 80%;">public static T __loadDefault__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)</span>




---

### findServiceTypes

<span style="font-family: monospace; font-size: 80%;">public java.util.Set<java.lang.Class<[ServiceProvider](ServiceProvider.md)> __findServiceTypes__()</span>

Returns a list of all known service types.


---

### findServices

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ServiceMetadata](ServiceMetadata.md)> __findServices__()</span>




---

### findProvider

<span style="font-family: monospace; font-size: 80%;">public [ServiceMetadata](ServiceMetadata.md) __findProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)</span>

Retrieves metadata of the nearest known provider of the specified service type.


---

### findProvider

<span style="font-family: monospace; font-size: 80%;">public [ServiceMetadata](ServiceMetadata.md) __findProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate)</span>

Retrieves metadata of the nearest known provider whose capabilities satisfy the given predicate.


---

### findAllProviders

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __findAllProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)</span>

Retrieves metadata of all known providers of the specified service type.


---

### findAllProviders

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __findAllProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate)</span>

Retrieves metadata of all known providers whose capabilities satisfy the given predicate.


---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getParent

<span style="font-family: monospace; font-size: 80%;">public [ServiceProviderLayer](ServiceProviderLayer.md) __getParent__()</span>




---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceProviderLayer](ServiceProviderLayer.md)> __getChildren__()</span>




---

### getChild

<span style="font-family: monospace; font-size: 80%;">public [ServiceProviderLayer](ServiceProviderLayer.md) __getChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### hasChild

<span style="font-family: monospace; font-size: 80%;">public boolean __hasChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### hasProvider

<span style="font-family: monospace; font-size: 80%;">public boolean __hasProvider__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getProvidersByFqcn

<span style="font-family: monospace; font-size: 80%;">public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)> __getProvidersByFqcn__()</span>




---

### getModulePath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getModulePath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### isPublic

<span style="font-family: monospace; font-size: 80%;">public boolean __isPublic__()</span>




---

### setPublic

<span style="font-family: monospace; font-size: 80%;">public void __setPublic__(boolean v)</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [ServiceProviderLayer](ServiceProviderLayer.md) __setReporter__([Reporter](../diagnostic/Reporter.md) reporter)</span>

Sets the reporter for communicating mapping warnings or errors in this layer.


---

### getProvider

<span style="font-family: monospace; font-size: 80%;">public [ServiceMetadata](ServiceMetadata.md) __getProvider__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) providerName)</span>

Retrieves metadata of the specified provider if it exists in this layer.


---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)> __getProviders__()</span>

Retrieves metadata of providers of the specified service type in this layer.


---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __getProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)</span>

Retrieves metadata of providers of the specified service type in this layer.


---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __getProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[Properties](../util/Properties.md)> capabilityPredicate)</span>

Retrieves metadata of providers in this layer whose capabilities satisfy the given predicate.


---

### create

<span style="font-family: monospace; font-size: 80%;">public [ServiceProviderLayer](ServiceProviderLayer.md) __create__()</span>




---

### create

<span style="font-family: monospace; font-size: 80%;">public [ServiceProviderLayer](ServiceProviderLayer.md) __create__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public void __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) layerName)</span>




---

### registerModule

<span style="font-family: monospace; font-size: 80%;">public void __registerModule__([Module](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Module.html) module)</span>




---

### registerClass

<span style="font-family: monospace; font-size: 80%;">public void __registerClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type)</span>




---

### registerJar

<span style="font-family: monospace; font-size: 80%;">public void __registerJar__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)</span>




---

