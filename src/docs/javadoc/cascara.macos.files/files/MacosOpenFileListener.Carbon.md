Package [io.github.qishr.cascara.macos.files](index.md)

# Interface Carbon
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.macos.files.MacosOpenFileListener.Carbon<br/>
<br/>
All Implemented Interfaces:<br/>
    Library

Enclosing Class:<br/>
    [io.github.qishr.cascara.macos.files.MacosOpenFileListener](MacosOpenFileListener.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __Carbon__</span>

Interface for macOS Carbon framework Apple Event handling.This is your original shape, plus AEGetParamPtr added.


## Field Summary

| Modifier and Type          | Field                 | Description |
|----------------------------|-----------------------|-------------|
| public static final Carbon | [INSTANCE](#instance) |             |



## Method Summary

| Modifier and Type   | Method                                                                                                                                                                                                     | Description |
|---------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract int | [AEInstallEventHandler](#aeinstalleventhandler)(int eventClass, int eventID, Callback handler, Pointer refcon, boolean isSysHandler)                                                                       |             |
| public abstract int | [AEGetParamDesc](#aegetparamdesc)(Pointer appleEvent, int keyword, int desiredType, [AEDesc](MacosOpenFileListener.AEDesc.md) resultDesc)                                                                  |             |
| public abstract int | [AECountItems](#aecountitems)([AEDesc](MacosOpenFileListener.AEDesc.md) descList, IntByReference count)                                                                                                    |             |
| public abstract int | [AEGetNthPtr](#aegetnthptr)([AEDesc](MacosOpenFileListener.AEDesc.md) descList, int index, int desiredType, Pointer keyword, Pointer actualType, byte[] buffer, int bufferSize, IntByReference actualSize) |             |
| public abstract int | [AEGetParamPtr](#aegetparamptr)(Pointer appleEvent, int keyword, int desiredType, Pointer actualType, byte[] dataPtr, int maximumSize, IntByReference actualSize)                                          |             |



## Field Details

### INSTANCE

<span style="font-family: monospace; font-size: 80%;">public static final Carbon __INSTANCE__</span>




---


## Method Details

### AEInstallEventHandler

<span style="font-family: monospace; font-size: 80%;">public abstract int __AEInstallEventHandler__(int eventClass, int eventID, Callback handler, Pointer refcon, boolean isSysHandler)</span>




---

### AEGetParamDesc

<span style="font-family: monospace; font-size: 80%;">public abstract int __AEGetParamDesc__(Pointer appleEvent, int keyword, int desiredType, [AEDesc](MacosOpenFileListener.AEDesc.md) resultDesc)</span>




---

### AECountItems

<span style="font-family: monospace; font-size: 80%;">public abstract int __AECountItems__([AEDesc](MacosOpenFileListener.AEDesc.md) descList, IntByReference count)</span>




---

### AEGetNthPtr

<span style="font-family: monospace; font-size: 80%;">public abstract int __AEGetNthPtr__([AEDesc](MacosOpenFileListener.AEDesc.md) descList, int index, int desiredType, Pointer keyword, Pointer actualType, byte[] buffer, int bufferSize, IntByReference actualSize)</span>




---

### AEGetParamPtr

<span style="font-family: monospace; font-size: 80%;">public abstract int __AEGetParamPtr__(Pointer appleEvent, int keyword, int desiredType, Pointer actualType, byte[] dataPtr, int maximumSize, IntByReference actualSize)</span>




---

