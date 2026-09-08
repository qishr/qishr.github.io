Package [io.github.qishr.cascara.common.util](index.md)

# Interface IAnnotatedElement
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.IAnnotatedElement<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IAnnotatedElement__</span>

Internal interface to allow annotation processors to construct a command model at compile time.


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                                                                             | Description |
|--------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [userObject](#userobject)()                                                                                                                                                                                                                                                        |             |
| public abstract boolean                                                                                      | [isAnnotationPresent](#isannotationpresent)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)> annotationClass) |             |
| public abstract T                                                                                            | [getAnnotation](#getannotation)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> annotationClass)                                                                                                                                     |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getName](#getname)()                                                                                                                                                                                                                                                              |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMixinName](#getmixinname)()                                                                                                                                                                                                                                                    |             |
| public abstract boolean                                                                                      | [isArgSpec](#isargspec)()                                                                                                                                                                                                                                                          |             |
| public abstract boolean                                                                                      | [isOption](#isoption)()                                                                                                                                                                                                                                                            |             |
| public abstract boolean                                                                                      | [isParameter](#isparameter)()                                                                                                                                                                                                                                                      |             |
| public abstract boolean                                                                                      | [isArgGroup](#isarggroup)()                                                                                                                                                                                                                                                        |             |
| public abstract boolean                                                                                      | [isMixin](#ismixin)()                                                                                                                                                                                                                                                              |             |
| public abstract boolean                                                                                      | [isUnmatched](#isunmatched)()                                                                                                                                                                                                                                                      |             |
| public abstract boolean                                                                                      | [isSpec](#isspec)()                                                                                                                                                                                                                                                                |             |
| public abstract boolean                                                                                      | [isParentCommand](#isparentcommand)()                                                                                                                                                                                                                                              |             |
| public abstract boolean                                                                                      | [isMultiValue](#ismultivalue)()                                                                                                                                                                                                                                                    |             |
| public abstract boolean                                                                                      | [isInteractive](#isinteractive)()                                                                                                                                                                                                                                                  |             |
| public abstract boolean                                                                                      | [hasInitialValue](#hasinitialvalue)()                                                                                                                                                                                                                                              |             |
| public abstract boolean                                                                                      | [isMethodParameter](#ismethodparameter)()                                                                                                                                                                                                                                          |             |
| public abstract int                                                                                          | [getMethodParamPosition](#getmethodparamposition)()                                                                                                                                                                                                                                |             |
| public abstract [IScope](CommandLine.Model.IScope.md)                                                        | [scope](#scope)()                                                                                                                                                                                                                                                                  |             |
| public abstract [IGetter](CommandLine.Model.IGetter.md)                                                      | [getter](#getter)()                                                                                                                                                                                                                                                                |             |
| public abstract [ISetter](CommandLine.Model.ISetter.md)                                                      | [setter](#setter)()                                                                                                                                                                                                                                                                |             |
| public abstract [ITypeInfo](CommandLine.Model.ITypeInfo.md)                                                  | [getTypeInfo](#gettypeinfo)()                                                                                                                                                                                                                                                      |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getToString](#gettostring)()                                                                                                                                                                                                                                                      |             |



## Method Details

### userObject

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __userObject__()</span>




---

### isAnnotationPresent

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isAnnotationPresent__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)> annotationClass)</span>




---

### getAnnotation

<span style="font-family: monospace; font-size: 80%;">public abstract T __getAnnotation__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> annotationClass)</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getMixinName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMixinName__()</span>




---

### isArgSpec

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isArgSpec__()</span>




---

### isOption

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isOption__()</span>




---

### isParameter

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isParameter__()</span>




---

### isArgGroup

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isArgGroup__()</span>




---

### isMixin

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isMixin__()</span>




---

### isUnmatched

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isUnmatched__()</span>




---

### isSpec

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isSpec__()</span>




---

### isParentCommand

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isParentCommand__()</span>




---

### isMultiValue

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isMultiValue__()</span>




---

### isInteractive

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isInteractive__()</span>




---

### hasInitialValue

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hasInitialValue__()</span>




---

### isMethodParameter

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isMethodParameter__()</span>




---

### getMethodParamPosition

<span style="font-family: monospace; font-size: 80%;">public abstract int __getMethodParamPosition__()</span>




---

### scope

<span style="font-family: monospace; font-size: 80%;">public abstract [IScope](CommandLine.Model.IScope.md) __scope__()</span>




---

### getter

<span style="font-family: monospace; font-size: 80%;">public abstract [IGetter](CommandLine.Model.IGetter.md) __getter__()</span>




---

### setter

<span style="font-family: monospace; font-size: 80%;">public abstract [ISetter](CommandLine.Model.ISetter.md) __setter__()</span>




---

### getTypeInfo

<span style="font-family: monospace; font-size: 80%;">public abstract [ITypeInfo](CommandLine.Model.ITypeInfo.md) __getTypeInfo__()</span>




---

### getToString

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getToString__()</span>




---

