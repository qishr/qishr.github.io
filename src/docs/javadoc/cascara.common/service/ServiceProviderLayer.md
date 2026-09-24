Package [io.github.qishr.cascara.common.service](index.md)

# Interface ServiceProviderLayer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.ServiceProviderLayer<br/>
<br/>
All Implemented Interfaces:<br/>
    [TreeNode](../data/TreeNode.md)<[ServiceProviderLayer](ServiceProviderLayer.md)>

All Known Implementing Classes:<br/>
    [ServiceProviderRoot](ServiceProviderRoot.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ServiceProviderLayer__</span>


## Method Summary

| Modifier and Type                                                                                                                                              | Method                                                                                                                                                                                                                                                                                                                                                                 | Description                                |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------|
| public static [ServiceProviderRoot](ServiceProviderRoot.md)                                                                                                    | [getRoot](#getroot)([Reporter](../diagnostic/Reporter.md) reporter)                                                                                                                                                                                                                                                                                                    | Retrieves the root Service Provider Layer. |
| public static [ServiceProviderRoot](ServiceProviderRoot.md)                                                                                                    | [getRoot](#getroot)()                                                                                                                                                                                                                                                                                                                                                  |                                            |
| public static T                                                                                                                                                | [loadProvider](#loadprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [ServiceMetadata](ServiceMetadata.md) metadata)                                                                                                                                                                               |                                            |
| public static T                                                                                                                                                | [loadDefault](#loaddefault)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)                                                                                                                                                                                                                                 |                                            |
| public static T                                                                                                                                                | [getInstance](#getinstance)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> providerClass, [ServiceMetadata](ServiceMetadata.md) metadata)                                                                                                                                                                               | Instantiates a service provider            |
| public abstract [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [setReporter](#setreporter)([Reporter](../diagnostic/Reporter.md) reporter)                                                                                                                                                                                                                                                                                            |                                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                   | [getName](#getname)()                                                                                                                                                                                                                                                                                                                                                  |                                            |
| public abstract [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                   | [getModulePath](#getmodulepath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                     |                                            |
| public abstract [TrackableArray](../trackable/TrackableArray.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getModules](#getmodules)()                                                                                                                                                                                                                                                                                                                                            |                                            |
| public abstract [TrackableArray](../trackable/TrackableArray.md)<[ServiceMetadata](ServiceMetadata.md)>                                                        | [getDeclaredProviders](#getdeclaredproviders)()                                                                                                                                                                                                                                                                                                                        |                                            |
| public abstract [TrackableArray](../trackable/TrackableArray.md)<[ServiceMetadata](ServiceMetadata.md)>                                                        | [getVisibleProviders](#getvisibleproviders)()                                                                                                                                                                                                                                                                                                                          |                                            |
| public abstract boolean                                                                                                                                        | [isPublic](#ispublic)()                                                                                                                                                                                                                                                                                                                                                |                                            |
| public abstract [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [getParent](#getparent)()                                                                                                                                                                                                                                                                                                                                              |                                            |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceProviderLayer](ServiceProviderLayer.md)>      | [getChildren](#getchildren)()                                                                                                                                                                                                                                                                                                                                          |                                            |
| public abstract [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [getChild](#getchild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                               |                                            |
| public abstract boolean                                                                                                                                        | [hasChild](#haschild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                               |                                            |
| public abstract [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [create](#create)()                                                                                                                                                                                                                                                                                                                                                    |                                            |
| public abstract [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [create](#create)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                   |                                            |
| public abstract [ServiceProviderLayer](ServiceProviderLayer.md)                                                                                                | [createPrivate](#createprivate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                     |                                            |
| public abstract void                                                                                                                                           | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                   |                                            |
| public abstract java.util.Set<java.lang.Class<[ServiceProvider](ServiceProvider.md)>                                                                           | [findServiceTypes](#findservicetypes)()                                                                                                                                                                                                                                                                                                                                |                                            |
| public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ServiceMetadata](ServiceMetadata.md)>                  | [findServices](#findservices)()                                                                                                                                                                                                                                                                                                                                        |                                            |
| public abstract [ServiceMetadata](ServiceMetadata.md)                                                                                                          | [findProvider](#findprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)                                                                                                                                                                                 |                                            |
| public abstract [ServiceMetadata](ServiceMetadata.md)                                                                                                          | [findProvider](#findprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](ServiceMetadata.md)> capabilityPredicate)         |                                            |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                | [findAllProviders](#findallproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)                                                                                                                                                                         |                                            |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                | [findAllProviders](#findallproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](ServiceMetadata.md)> capabilityPredicate) |                                            |
| public abstract [ServiceMetadata](ServiceMetadata.md)                                                                                                          | [getProvider](#getprovider)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) providerName)                                                                                                                                                                                                                                 |                                            |
| public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)>    | [getProviders](#getproviders)()                                                                                                                                                                                                                                                                                                                                        |                                            |
| public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)>    | [getProvidersByFqcn](#getprovidersbyfqcn)()                                                                                                                                                                                                                                                                                                                            |                                            |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                | [getProviders](#getproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)                                                                                                                                                                                 |                                            |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)>                | [getProviders](#getproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](ServiceMetadata.md)> capabilityPredicate)         |                                            |
| public abstract boolean                                                                                                                                        | [hasProvider](#hasprovider)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                         |                                            |
| public abstract void                                                                                                                                           | [registerModule](#registermodule)([Module](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Module.html) module)                                                                                                                                                                                                                                 |                                            |
| public abstract void                                                                                                                                           | [registerClass](#registerclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                                   |                                            |
| public abstract void                                                                                                                                           | [registerJar](#registerjar)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)                                                                                                                                                                                                                                      |                                            |



## Method Details

### getRoot

<span style="font-family: monospace; font-size: 80%;">public static [ServiceProviderRoot](ServiceProviderRoot.md) __getRoot__([Reporter](../diagnostic/Reporter.md) reporter)</span>

Retrieves the root Service Provider Layer.On the initial call, the root layer will be configured with a specified Reporter.
This reporter is used for non-fatal error and warning reporting.


---

### getRoot

<span style="font-family: monospace; font-size: 80%;">public static [ServiceProviderRoot](ServiceProviderRoot.md) __getRoot__()</span>




---

### loadProvider

<span style="font-family: monospace; font-size: 80%;">public static T __loadProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [ServiceMetadata](ServiceMetadata.md) metadata)</span>




---

### loadDefault

<span style="font-family: monospace; font-size: 80%;">public static T __loadDefault__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)</span>




---

### getInstance

<span style="font-family: monospace; font-size: 80%;">public static T __getInstance__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> providerClass, [ServiceMetadata](ServiceMetadata.md) metadata)</span>

Instantiates a service provider

**Parameters:**

`providerClass` - The class of the provider to instantiate.


---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceProviderLayer](ServiceProviderLayer.md) __setReporter__([Reporter](../diagnostic/Reporter.md) reporter)</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getModulePath

<span style="font-family: monospace; font-size: 80%;">public abstract [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getModulePath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getModules

<span style="font-family: monospace; font-size: 80%;">public abstract [TrackableArray](../trackable/TrackableArray.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getModules__()</span>




---

### getDeclaredProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [TrackableArray](../trackable/TrackableArray.md)<[ServiceMetadata](ServiceMetadata.md)> __getDeclaredProviders__()</span>




---

### getVisibleProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [TrackableArray](../trackable/TrackableArray.md)<[ServiceMetadata](ServiceMetadata.md)> __getVisibleProviders__()</span>




---

### isPublic

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isPublic__()</span>




---

### getParent

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceProviderLayer](ServiceProviderLayer.md) __getParent__()</span>



**Specified By:**

[TreeNode](../data/TreeNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceProviderLayer](ServiceProviderLayer.md)> __getChildren__()</span>



**Specified By:**

[TreeNode](../data/TreeNode.md)


---

### getChild

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceProviderLayer](ServiceProviderLayer.md) __getChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### hasChild

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hasChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### create

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceProviderLayer](ServiceProviderLayer.md) __create__()</span>




---

### create

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceProviderLayer](ServiceProviderLayer.md) __create__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### createPrivate

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceProviderLayer](ServiceProviderLayer.md) __createPrivate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract void __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### findServiceTypes

<span style="font-family: monospace; font-size: 80%;">public abstract java.util.Set<java.lang.Class<[ServiceProvider](ServiceProvider.md)> __findServiceTypes__()</span>




---

### findServices

<span style="font-family: monospace; font-size: 80%;">public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ServiceMetadata](ServiceMetadata.md)> __findServices__()</span>




---

### findProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceMetadata](ServiceMetadata.md) __findProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)</span>




---

### findProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceMetadata](ServiceMetadata.md) __findProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](ServiceMetadata.md)> capabilityPredicate)</span>




---

### findAllProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __findAllProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)</span>




---

### findAllProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __findAllProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](ServiceMetadata.md)> capabilityPredicate)</span>




---

### getProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceMetadata](ServiceMetadata.md) __getProvider__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) providerName)</span>




---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)> __getProviders__()</span>




---

### getProvidersByFqcn

<span style="font-family: monospace; font-size: 80%;">public abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ServiceMetadata](ServiceMetadata.md)> __getProvidersByFqcn__()</span>




---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __getProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType)</span>




---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](ServiceMetadata.md)> __getProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](ServiceMetadata.md)> capabilityPredicate)</span>




---

### hasProvider

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hasProvider__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### registerModule

<span style="font-family: monospace; font-size: 80%;">public abstract void __registerModule__([Module](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Module.html) module)</span>




---

### registerClass

<span style="font-family: monospace; font-size: 80%;">public abstract void __registerClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### registerJar

<span style="font-family: monospace; font-size: 80%;">public abstract void __registerJar__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)</span>




---

