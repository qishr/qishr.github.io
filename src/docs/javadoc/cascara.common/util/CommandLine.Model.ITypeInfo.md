Package [io.github.qishr.cascara.common.util](index.md)

# Interface ITypeInfo
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ITypeInfo<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __ITypeInfo__</span>

Encapculates type information for an option or parameter to make this information available both at runtime
 and at compile time (when `Class` values are not available).Most of the methods in this interface (but not all!) are safe to use by annotation processors.


## Method Summary

| Modifier and Type                                                                                                                                                                                      | Method                                                            | Description                                                                                                                                                |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract boolean                                                                                                                                                                                | [isBoolean](#isboolean)()                                         | Returns `true` if [getType.getType](#gettype) is `boolean` or `java.lang.Boolean`.                                                                         |
| public abstract boolean                                                                                                                                                                                | [isMultiValue](#ismultivalue)()                                   | Returns `true` if [getType.getType](#gettype) is an array, map or collection.                                                                              |
| public abstract boolean                                                                                                                                                                                | [isOptional](#isoptional)()                                       | Returns `true` if [getType.getType](#gettype) is `java.util.Optional`                                                                                      |
| public abstract boolean                                                                                                                                                                                | [isArray](#isarray)()                                             | Returns `true` if this type is an array multi-value type.                                                                                                  |
| public abstract boolean                                                                                                                                                                                | [isCollection](#iscollection)()                                   |                                                                                                                                                            |
| public abstract boolean                                                                                                                                                                                | [isMap](#ismap)()                                                 |                                                                                                                                                            |
| public abstract boolean                                                                                                                                                                                | [isEnum](#isenum)()                                               | Returns `true` if [getType.getType](#gettype) is an enum.                                                                                                  |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getEnumConstantNames](#getenumconstantnames)()                   |                                                                                                                                                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getClassName](#getclassname)()                                   |                                                                                                                                                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [getClassSimpleName](#getclasssimplename)()                       |                                                                                                                                                            |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ITypeInfo](CommandLine.Model.ITypeInfo.md)>                                                  | [getAuxiliaryTypeInfos](#getauxiliarytypeinfos)()                 | Returns type information of components or elements of a [isMultiValue.isMultiValue](#ismultivalue) type.                                                   |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getActualGenericTypeArguments](#getactualgenerictypearguments)() | Returns the names of the type arguments if this is a generic type.                                                                                         |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>                                                                                          | [getType](#gettype)()                                             | Returns the class that the option or parameter value should be converted to when matched on the command  line.                                             |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[]                                                                                        | [getAuxiliaryTypes](#getauxiliarytypes)()                         | Returns the component class of an array, or the parameter type of a generic Collection, or the parameter  types of the key and the value of a generic Map. |



## Method Details

### isBoolean

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isBoolean__()</span>

Returns `true` if [getType.getType](#gettype) is `boolean` or `java.lang.Boolean`.


---

### isMultiValue

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isMultiValue__()</span>

Returns `true` if [getType.getType](#gettype) is an array, map or collection.Note that from picocli 4.7, `char[]` arrays are considered single values (similar to String) and are not treated as arrays.


---

### isOptional

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isOptional__()</span>

Returns `true` if [getType.getType](#gettype) is `java.util.Optional`

**Since:**

4.6


---

### isArray

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isArray__()</span>

Returns `true` if this type is an array multi-value type.Note that from picocli 4.7, `char[]` arrays are considered single values (similar to String) and are not treated as arrays.


---

### isCollection

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isCollection__()</span>




---

### isMap

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isMap__()</span>




---

### isEnum

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isEnum__()</span>

Returns `true` if [getType.getType](#gettype) is an enum.


---

### getEnumConstantNames

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getEnumConstantNames__()</span>




---

### getClassName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getClassName__()</span>




---

### getClassSimpleName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getClassSimpleName__()</span>




---

### getAuxiliaryTypeInfos

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ITypeInfo](CommandLine.Model.ITypeInfo.md)> __getAuxiliaryTypeInfos__()</span>

Returns type information of components or elements of a [isMultiValue.isMultiValue](#ismultivalue) type.


---

### getActualGenericTypeArguments

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getActualGenericTypeArguments__()</span>

Returns the names of the type arguments if this is a generic type.For example, returns `["java.lang.String"]` if this type is `List<String>`.


---

### getType

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getType__()</span>

Returns the class that the option or parameter value should be converted to when matched on the command
 line.This method is not safe for annotation processors to use.

**Returns:**

the class that the option or parameter value should be converted to


---

### getAuxiliaryTypes

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[] __getAuxiliaryTypes__()</span>

Returns the component class of an array, or the parameter type of a generic Collection, or the parameter
 types of the key and the value of a generic Map.This method is not safe for annotation processors to use.

**Returns:**

the component type or types of an array, Collection or Map type


---

