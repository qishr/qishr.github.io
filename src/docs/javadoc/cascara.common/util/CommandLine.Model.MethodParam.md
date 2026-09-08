Package [io.github.qishr.cascara.common.util](index.md)

# Class MethodParam
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.reflect.AccessibleObject](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/AccessibleObject.html)<br/>
                io.github.qishr.cascara.common.util.CommandLine.Model.MethodParam<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __MethodParam__<br/>extends [AccessibleObject](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/AccessibleObject.html)
</span>

Command method parameter, similar to java.lang.reflect.Parameter (not available before Java 8).


## Constructor Summary

| Constructor                                                                                                                              | Description |
|------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| MethodParam([Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) method, int paramIndex) |             |



## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                                                         | Description |
|--------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html)                  | [getParameterizedType](#getparameterizedtype)()                                                                                                |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [getName](#getname)()                                                                                                                          |             |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>                     | [getType](#gettype)()                                                                                                                          |             |
| public [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)              | [getDeclaringExecutable](#getdeclaringexecutable)()                                                                                            |             |
| public T                                                                                                                 | [getAnnotation](#getannotation)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> annotationClass) |             |
| public [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)[] | [getDeclaredAnnotations](#getdeclaredannotations)()                                                                                            |             |
| public void                                                                                                              | [setAccessible](#setaccessible)(boolean flag)                                                                                                  |             |
| public boolean                                                                                                           | [isAccessible](#isaccessible)()                                                                                                                |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                      | [toString](#tostring)()                                                                                                                        |             |



## Method Details

### getParameterizedType

<span style="font-family: monospace; font-size: 80%;">public [Type](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Type.html) __getParameterizedType__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getType

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __getType__()</span>




---

### getDeclaringExecutable

<span style="font-family: monospace; font-size: 80%;">public [Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html) __getDeclaringExecutable__()</span>




---

### getAnnotation

<span style="font-family: monospace; font-size: 80%;">public T __getAnnotation__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> annotationClass)</span>



**Overrides:**

[AccessibleObject](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/AccessibleObject.html#getannotation)


---

### getDeclaredAnnotations

<span style="font-family: monospace; font-size: 80%;">public [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)[] __getDeclaredAnnotations__()</span>



**Overrides:**

[AccessibleObject](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/AccessibleObject.html#getdeclaredannotations)


---

### setAccessible

<span style="font-family: monospace; font-size: 80%;">public void __setAccessible__(boolean flag)</span>



**Throws:**

[SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)

**Overrides:**

[AccessibleObject](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/AccessibleObject.html#setaccessible)


---

### isAccessible

<span style="font-family: monospace; font-size: 80%;">public boolean __isAccessible__()</span>



**Throws:**

[SecurityException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/SecurityException.html)

**Overrides:**

[AccessibleObject](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/AccessibleObject.html#isaccessible)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[AccessibleObject](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/AccessibleObject.html#tostring)


---

