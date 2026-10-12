Package [io.github.qishr.cascara.common.util](index.md)

# Class ReflectionUtils
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.ReflectionUtils<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ReflectionUtils__</span>


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| ReflectionUtils() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                          | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static T                                                                                                                                                                                                            | [createInstanceUnsafe](#createinstanceunsafe)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> clazz)                                                                                                                                                                                                                                                                                                                           |             |
| public static C                                                                                                                                                                                                            | [createInstance](#createinstance)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> targetClass)                                                                                                                                                                                                                                                                                                                                 |             |
| public static boolean                                                                                                                                                                                                      | [isInstance](#isinstance)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) thisInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) thatType)                                                                                                                                                                                                                              |             |
| public static boolean                                                                                                                                                                                                      | [canAssign](#canassign)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) fromThis, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> toThat)                                                                                                                                                                                                                                     |             |
| public static C                                                                                                                                                                                                            | [getRawClass](#getrawclass)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)                                                                                                                                                                                                                                                                                                                                        |             |
| public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html)                                                                                                             | [getGenericKeyTypeFromMapType](#getgenerickeytypefrommaptype)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) mapType)                                                                                                                                                                                                                                                                                                      |             |
| public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html)                                                                                                             | [getGenericValueTypeFromMapType](#getgenericvaluetypefrommaptype)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) mapType)                                                                                                                                                                                                                                                                                                  |             |
| public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html)                                                                                                             | [getGenericElementTypeFromListType](#getgenericelementtypefromlisttype)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) listType)                                                                                                                                                                                                                                                                                           |             |
| public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html)                                                                                                             | [getParameterTypeFromGenericType](#getparametertypefromgenerictype)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) collectionType, int paramIndex)                                                                                                                                                                                                                                                                         |             |
| public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>                                                                                                                | [getArrayComponentType](#getarraycomponenttype)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType)                                                                                                                                                                                                                                                                                                                 |             |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)>                 | [getAllFields](#getallfields)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                                                                                                                                           |             |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)>                 | [getAllFields](#getallfields)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Function](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Function.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html), [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> excludeFunction)            |             |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)>               | [getAllMethods](#getallmethods)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)                                                                                                                                                                                                                                                                                                                                       |             |
| public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>>                        | [getReferencedClasses](#getreferencedclasses)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)                                                                                                                                                                                                                                                                                                                           |             |
| public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>>                        | [getReferencedClasses](#getreferencedclasses)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> excludeFunction)                                                                                                                     |             |
| public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>>                        | [getReferencedClasses](#getreferencedclasses)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Function](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Function.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> excludeFunction) |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                 | [getTypeName](#gettypename)([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)                                                                                                                                                                                                                                                                                                                                        |             |
| public static [Pair](Pair.md)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getCaller](#getcaller)()                                                                                                                                                                                                                                                                                                                                                                                                                                                    |             |
| public static [Pair](Pair.md)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getCaller](#getcaller)(boolean ignoreQueryingClass)                                                                                                                                                                                                                                                                                                                                                                                                                         |             |
| public static [Pair](Pair.md)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getCaller](#getcaller)(boolean ignoreQueryingClass, boolean ignoreQueryingModule)                                                                                                                                                                                                                                                                                                                                                                                           |             |
| public static java.lang.@io.github.qishr.cascara.common.annotation.Experimental String                                                                                                                                     | [getTestName](#gettestname)()                                                                                                                                                                                                                                                                                                                                                                                                                                                |             |
| public static java.lang.reflect.@io.github.qishr.cascara.common.annotation.Experimental Method                                                                                                                             | [getTestMethod](#gettestmethod)()                                                                                                                                                                                                                                                                                                                                                                                                                                            |             |



## Method Details

### createInstanceUnsafe

<span style="font-family: monospace; font-size: 80%;">public static T __createInstanceUnsafe__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> clazz)</span>



**Throws:**

[InstantiationException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/InstantiationException.html)


---

### createInstance

<span style="font-family: monospace; font-size: 80%;">public static C __createInstance__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> targetClass)</span>



**Throws:**

[InstantiationException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/InstantiationException.html)
, [IllegalAccessException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/IllegalAccessException.html)
, [IllegalArgumentException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/IllegalArgumentException.html)
, [InvocationTargetException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/InvocationTargetException.html)
, [SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)


---

### isInstance

<span style="font-family: monospace; font-size: 80%;">public static boolean __isInstance__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) thisInstance, [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) thatType)</span>




---

### canAssign

<span style="font-family: monospace; font-size: 80%;">public static boolean __canAssign__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) fromThis, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> toThat)</span>




---

### getRawClass

<span style="font-family: monospace; font-size: 80%;">public static C __getRawClass__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)</span>




---

### getGenericKeyTypeFromMapType

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) __getGenericKeyTypeFromMapType__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) mapType)</span>




---

### getGenericValueTypeFromMapType

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) __getGenericValueTypeFromMapType__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) mapType)</span>




---

### getGenericElementTypeFromListType

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) __getGenericElementTypeFromListType__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) listType)</span>




---

### getParameterTypeFromGenericType

<span style="font-family: monospace; font-size: 80%;">public static [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) __getParameterTypeFromGenericType__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) collectionType, int paramIndex)</span>




---

### getArrayComponentType

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getArrayComponentType__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) targetType)</span>




---

### getAllFields

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)> __getAllFields__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### getAllFields

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html)> __getAllFields__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Function](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Function.html)<[Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html), [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> excludeFunction)</span>




---

### getAllMethods

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)> __getAllMethods__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> jvmType)</span>




---

### getReferencedClasses

<span style="font-family: monospace; font-size: 80%;">public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>> __getReferencedClasses__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### getReferencedClasses

<span style="font-family: monospace; font-size: 80%;">public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>> __getReferencedClasses__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> excludeFunction)</span>




---

### getReferencedClasses

<span style="font-family: monospace; font-size: 80%;">public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>> __getReferencedClasses__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [Function](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Function.html)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> excludeFunction)</span>




---

### getTypeName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTypeName__([Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) jvmType)</span>




---

### getCaller

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Pair](Pair.md)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getCaller__()</span>




---

### getCaller

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Pair](Pair.md)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getCaller__(boolean ignoreQueryingClass)</span>




---

### getCaller

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static [Pair](Pair.md)<[Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getCaller__(boolean ignoreQueryingClass, boolean ignoreQueryingModule)</span>




---

### getTestName

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static java.lang.@io.github.qishr.cascara.common.annotation.Experimental String __getTestName__()</span>




---

### getTestMethod

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
@io.github.qishr.cascara.common.annotation.Nullable<br/>
public static java.lang.reflect.@io.github.qishr.cascara.common.annotation.Experimental Method __getTestMethod__()</span>




---

