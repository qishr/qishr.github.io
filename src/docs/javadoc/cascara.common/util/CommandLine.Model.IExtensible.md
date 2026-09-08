Package [io.github.qishr.cascara.common.util](index.md)

# Interface IExtensible
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.IExtensible<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IExtensible__</span>

Interface to allow extending the capabilities of other interface without Java 8 default methods.

Example usage:
 // suppose we want to add a method `getInitialValueState` to `IAnnotatedElement`
 IAnnotatedElement element = getAnnotatedElement();
 if (element instanceof IExtensible) {
     InitialValueState state = ((IExtensible) element).getExtension(InitialValueState.class);
     if (state != null) {
         // ...
     }
 }
 


## Method Summary

| Modifier and Type | Method                                                                                                                           | Description                                                                               |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| public abstract T | [getExtension](#getextension)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> cls) | Returns an instance of the specified class, or `null` if this extension is not supported. |



## Method Details

### getExtension

<span style="font-family: monospace; font-size: 80%;">public abstract T __getExtension__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> cls)</span>

Returns an instance of the specified class, or `null` if this extension is not supported.

**Parameters:**

`cls` - class of the desired extension


---

