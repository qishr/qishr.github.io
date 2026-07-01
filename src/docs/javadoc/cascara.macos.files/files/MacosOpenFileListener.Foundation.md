Package [io.github.qishr.cascara.macos.files](index.md)

# Interface Foundation
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.macos.files.MacosOpenFileListener.Foundation<br/>
<br/>
All Implemented Interfaces:<br/>
    Library

Enclosing Class:<br/>
    [io.github.qishr.cascara.macos.files.MacosOpenFileListener](MacosOpenFileListener.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __Foundation__</span>


## Field Summary

| Modifier and Type              | Field                 | Description |
|--------------------------------|-----------------------|-------------|
| public static final Foundation | [INSTANCE](#instance) |             |



## Method Summary

| Modifier and Type       | Method                                                                                                                                                                 | Description |
|-------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract Pointer | [objc_getClass](#objc_getclass)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)                                |             |
| public abstract Pointer | [sel_registerName](#sel_registername)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) selectorName)                       |             |
| public abstract Pointer | [objc_msgSend](#objc_msgsend)(Pointer receiver, Pointer selector, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |



## Field Details

### INSTANCE

<span style="font-family: monospace; font-size: 80%;">public static final Foundation __INSTANCE__</span>




---


## Method Details

### objc_getClass

<span style="font-family: monospace; font-size: 80%;">public abstract Pointer __objc_getClass__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) className)</span>




---

### sel_registerName

<span style="font-family: monospace; font-size: 80%;">public abstract Pointer __sel_registerName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) selectorName)</span>




---

### objc_msgSend

<span style="font-family: monospace; font-size: 80%;">public abstract Pointer __objc_msgSend__(Pointer receiver, Pointer selector, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args)</span>




---

