Package [io.github.qishr.cascara.common.service](index.md)

# Interface SPL
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.SPL<br/>
<br/>
All Implemented Interfaces:<br/>
    [TreeNode](../../../../../../io/github/qishr/cascara/common/data/TreeNode.md)<[SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)>


----

<span style="font-family: monospace; font-size: 80%;">public interface __SPL__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                             | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CONTENT_TYPE](#content_type)     |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [JAR_PATH](#jar_path)             |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [JVM_TYPE](#jvm_type)             |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [MODULE_NAME](#module_name)       |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [MODULE_VERSION](#module_version) |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [PROVIDER_NAME](#provider_name)   |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SERVICE_NAME](#service_name)     |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [TITLE](#title)                   |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                  | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Description                                                                                           |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| public static [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)                                                                                                                                                                                                               | [getRoot](#getroot)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Retrieves the root Service Provider Layer.                                                            |
| public static boolean                                                                                                                                                                                                                                                                              | [isBooting](#isbooting)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                                       |
| public static T                                                                                                                                                                                                                                                                                    | [load](#load)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md) metadata)                                                                                                                                                                                                                                                        | Returns an instance of a specific service provider.                                                   |
| public static T                                                                                                                                                                                                                                                                                    | [load](#load)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)                                                                                                                                                                                                                                                                                                                                                                 | Returns an instance of a service provider.                                                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getName](#getname)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                                       |
| public abstract [TrackableArray](../../../../../../io/github/qishr/cascara/common/trackable/TrackableArray.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                       | [getModules](#getmodules)()                                                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                                       |
| public abstract [TrackableArray](../../../../../../io/github/qishr/cascara/common/trackable/TrackableArray.md)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                     | [getDeclaredProviders](#getdeclaredproviders)()                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                                       |
| public abstract [TrackableArray](../../../../../../io/github/qishr/cascara/common/trackable/TrackableArray.md)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                     | [getVisibleProviders](#getvisibleproviders)()                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                                       |
| public abstract boolean                                                                                                                                                                                                                                                                            | [isPublic](#ispublic)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                                                       |
| public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)                                                                                                                                                                                                             | [getParent](#getparent)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                                       |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)>                                                                                                                   | [getChildren](#getchildren)()                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                                       |
| public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)                                                                                                                                                                                                             | [getChild](#getchild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                                 |                                                                                                       |
| public abstract boolean                                                                                                                                                                                                                                                                            | [hasChild](#haschild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                                 |                                                                                                       |
| public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)                                                                                                                                                                                                             | [create](#create)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                                     | Creates a service provider layer with the specified name.                                             |
| public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)                                                                                                                                                                                                             | [createPrivate](#createprivate)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                       | Creates private a service provider layer with the specified name.                                     |
| public abstract void                                                                                                                                                                                                                                                                               | [remove](#remove)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                                     |                                                                                                       |
| public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<[ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)>> | [findServiceTypes](#findservicetypes)()                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns a list of all known service types.                                                            |
| public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                             | [findServices](#findservices)()                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns a list of metadata for all known service types.                                               |
| public abstract [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)                                                                                                                                                                                     | [findProvider](#findprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType)                                                                                                                                                                                                                                          | Retrieves metadata of the nearest known provider of the specified service type.                       |
| public abstract [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)                                                                                                                                                                                     | [findProvider](#findprovider)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate)         | Retrieves metadata of the nearest known provider whose capabilities satisfy the given predicate.      |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                           | [findAllProviders](#findallproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType)                                                                                                                                                                                                                                  | Retrieves metadata of all known providers of the specified service type.                              |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                           | [findAllProviders](#findallproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate) | Retrieves metadata of all known providers whose capabilities satisfy the given predicate.             |
| public abstract [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)                                                                                                                                                                                     | [getProvider](#getprovider)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) providerName)                                                                                                                                                                                                                                                                                                                                                   | Retrieves metadata of the specified provider if it exists in this layer, otherwise `null` is returne. |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                           | [getProviders](#getproviders)()                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Retrieves metadata of providers in this layer.                                                        |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                           | [getProviders](#getproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType)                                                                                                                                                                                                                                          | Retrieves metadata of providers of the specified service type in this layer.                          |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)>                                                                                           | [getProviders](#getproviders)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate)         | Retrieves metadata of providers in this layer whose capabilities satisfy the given predicate.         |
| public abstract boolean                                                                                                                                                                                                                                                                            | [hasProvider](#hasprovider)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                                                                           |                                                                                                       |
| public abstract void                                                                                                                                                                                                                                                                               | [registerClass](#registerclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                                                                                                                                                     |                                                                                                       |
| public abstract void                                                                                                                                                                                                                                                                               | [registerJar](#registerjar)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)                                                                                                                                                                                                                                                                                                                                                        |                                                                                                       |



## Field Details

### CONTENT_TYPE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CONTENT_TYPE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### JAR_PATH

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __JAR_PATH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### JVM_TYPE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __JVM_TYPE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### MODULE_NAME

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __MODULE_NAME__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### MODULE_VERSION

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __MODULE_VERSION__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### PROVIDER_NAME

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __PROVIDER_NAME__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### SERVICE_NAME

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SERVICE_NAME__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### TITLE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __TITLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### getRoot

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public static [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md) __getRoot__()</span>

Retrieves the root Service Provider Layer.


---

### isBooting

<span style="font-family: monospace; font-size: 80%;">public static boolean __isBooting__()</span>




---

### load

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public static T __load__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType, [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md) metadata)</span>

Returns an instance of a specific service provider.


---

### load

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.NonNull<br/>
public static T __load__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> serviceType)</span>

Returns an instance of a service provider.


---

### getName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getModules

<span style="font-family: monospace; font-size: 80%;">public abstract [TrackableArray](../../../../../../io/github/qishr/cascara/common/trackable/TrackableArray.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getModules__()</span>




---

### getDeclaredProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [TrackableArray](../../../../../../io/github/qishr/cascara/common/trackable/TrackableArray.md)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __getDeclaredProviders__()</span>




---

### getVisibleProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [TrackableArray](../../../../../../io/github/qishr/cascara/common/trackable/TrackableArray.md)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __getVisibleProviders__()</span>




---

### isPublic

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isPublic__()</span>




---

### getParent

<span style="font-family: monospace; font-size: 80%;">public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md) __getParent__()</span>



**Specified By:**

[TreeNode](../../../../../../io/github/qishr/cascara/common/data/TreeNode.md)


---

### getChildren

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md)> __getChildren__()</span>



**Specified By:**

[TreeNode](../../../../../../io/github/qishr/cascara/common/data/TreeNode.md)


---

### getChild

<span style="font-family: monospace; font-size: 80%;">public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md) __getChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### hasChild

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hasChild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### create

<span style="font-family: monospace; font-size: 80%;">public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md) __create__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Creates a service provider layer with the specified name.


---

### createPrivate

<span style="font-family: monospace; font-size: 80%;">public abstract [SPL](../../../../../../io/github/qishr/cascara/common/service/SPL.md) __createPrivate__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Creates private a service provider layer with the specified name.Providers in a private layer can only be found by searching the
private layer or its descendants.


---

### remove

<span style="font-family: monospace; font-size: 80%;">public abstract void __remove__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### findServiceTypes

<span style="font-family: monospace; font-size: 80%;">public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<[ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)>> __findServiceTypes__()</span>

Returns a list of all known service types.


---

### findServices

<span style="font-family: monospace; font-size: 80%;">public abstract [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __findServices__()</span>

Returns a list of metadata for all known service types.


---

### findProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md) __findProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType)</span>

Retrieves metadata of the nearest known provider of the specified service type.


---

### findProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md) __findProvider__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate)</span>

Retrieves metadata of the nearest known provider whose capabilities satisfy the given predicate.


---

### findAllProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __findAllProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType)</span>

Retrieves metadata of all known providers of the specified service type.


---

### findAllProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __findAllProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate)</span>

Retrieves metadata of all known providers whose capabilities satisfy the given predicate.


---

### getProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md) __getProvider__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) providerName)</span>

Retrieves metadata of the specified provider if it exists in this layer, otherwise `null` is returne.


---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __getProviders__()</span>

Retrieves metadata of providers in this layer.


---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __getProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType)</span>

Retrieves metadata of providers of the specified service type in this layer.


---

### getProviders

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> __getProviders__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [ServiceProvider](../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md)> serviceType, [Predicate](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html)<[ServiceMetadata](../../../../../../io/github/qishr/cascara/common/service/ServiceMetadata.md)> capabilityPredicate)</span>

Retrieves metadata of providers in this layer whose capabilities satisfy the given predicate.


---

### hasProvider

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hasProvider__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### registerClass

<span style="font-family: monospace; font-size: 80%;">public abstract void __registerClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### registerJar

<span style="font-family: monospace; font-size: 80%;">public abstract void __registerJar__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) jarPath)</span>




---

