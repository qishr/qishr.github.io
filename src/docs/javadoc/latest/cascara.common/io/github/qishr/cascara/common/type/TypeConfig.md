Package [io.github.qishr.cascara.common.type](index.md)

# Class TypeConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)<br/>
                io.github.qishr.cascara.common.type.TypeConfig<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __TypeConfig__<br/>extends [Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)
</span>


## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                               | Description                                                                   |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| public static [TypeConfig](../../../../../../io/github/qishr/cascara/common/type/TypeConfig.md)     | [get](#get)()                                                                                                                        |                                                                               |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)       | [getMappings](#getmappings)()                                                                                                        | Returns the mappings of abstract names to concrete names.                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMapping](#getmapping)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) abstractName) | Returns the preferred concrete class name for an abstarct class or interface. |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)       | [getIgnore](#getignore)()                                                                                                            |                                                                               |


### Methods inherited from [Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)

ensureInitialized, get, get, get, getAllSettings, getPropertiesPath, getAppliedSettings, init, setFileSystem, getNamespace


## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">public static [TypeConfig](../../../../../../io/github/qishr/cascara/common/type/TypeConfig.md) __get__()</span>




---

### getMappings

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getMappings__()</span>

Returns the mappings of abstract names to concrete names.


---

### getMapping

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMapping__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) abstractName)</span>

Returns the preferred concrete class name for an abstarct class or interface.


---

### getIgnore

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html) __getIgnore__()</span>




---

