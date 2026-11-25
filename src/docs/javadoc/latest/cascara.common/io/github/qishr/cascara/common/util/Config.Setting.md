Package [io.github.qishr.cascara.common.util](index.md)

# Class Setting
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.property.Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<[java.lang.String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)><br/>
                io.github.qishr.cascara.common.util.Config.Setting<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Setting__<br/>extends [Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                      | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Setting([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value, Source source, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|-------------|
| public [Setting](../../../../../../io/github/qishr/cascara/common/util/Config.Setting.md)           | [copyFrom](#copyfrom)([Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?> property) |             |
| public [Setting](../../../../../../io/github/qishr/cascara/common/util/Config.Setting.md)           | [duplicate](#duplicate)()                                                                                            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                              |             |
| public Source                                                                                       | [getSource](#getsource)()                                                                                            |             |
| public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) | [getPath](#getpath)()                                                                                                |             |


### Methods inherited from [Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)

asInteger, asLong, isEmpty, getValue, getValue, asBoolean, setValue, setPrimitiveType, getString, asString, asLong, getPrimitiveType, getName, getValues, asDouble, setName, asInteger, asDouble, asBoolean, getValuesMap


## Method Details

### copyFrom

<span style="font-family: monospace; font-size: 80%;">public [Setting](../../../../../../io/github/qishr/cascara/common/util/Config.Setting.md) __copyFrom__([Property](../../../../../../io/github/qishr/cascara/common/property/Property.md)<?> property)</span>



**Overrides:**

[Property](../../../../../../../cascara.common/io/github/qishr/cascara/common/property/Property.md#copyfrom)


---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [Setting](../../../../../../io/github/qishr/cascara/common/util/Config.Setting.md) __duplicate__()</span>



**Overrides:**

[Property](../../../../../../../cascara.common/io/github/qishr/cascara/common/property/Property.md#duplicate)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Property](../../../../../../../cascara.common/io/github/qishr/cascara/common/property/Property.md#tostring)


---

### getSource

<span style="font-family: monospace; font-size: 80%;">public Source __getSource__()</span>




---

### getPath

<span style="font-family: monospace; font-size: 80%;">public [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__()</span>




---

