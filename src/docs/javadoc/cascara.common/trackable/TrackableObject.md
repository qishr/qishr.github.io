Package [io.github.qishr.cascara.common.trackable](index.md)

# Class TrackableObject
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.trackable.AbstractTrackable](AbstractTrackable.md)<br/>
                io.github.qishr.cascara.common.trackable.TrackableObject<br/>
<br/>
All Implemented Interfaces:<br/>
    [TrackableTabularData](TrackableTabularData.md)

Direct Known Subtypes:<br/>
    [SchematicObject](../../cascara.schema/schema/util/SchematicObject.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __TrackableObject__<br/>extends [AbstractTrackable](AbstractTrackable.md)
</span>


## Constructor Summary

| Constructor                                          | Description |
|------------------------------------------------------|-------------|
| TrackableObject(boolean additionalPropertiesAllowed) |             |
| TrackableObject()                                    |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                               | Method                                                                                                                                                                                                                            | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected boolean                                                                                                                                                                                                                                                                               | [additionalPropertiesAllowed](#additionalpropertiesallowed)()                                                                                                                                                                     |             |
| public void                                                                                                                                                                                                                                                                                     | [setAdditionalPropertiesAllowed](#setadditionalpropertiesallowed)(boolean b)                                                                                                                                                      |             |
| public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                                                                                                                                   |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                           | [getValues](#getvalues)()                                                                                                                                                                                                         |             |
| public final [Trackable](Trackable.md)[]                                                                                                                                                                                                                                                        | [getTrackables](#gettrackables)()                                                                                                                                                                                                 |             |
| public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Trackable](Trackable.md)>                                                                    | [getTrackablesMap](#gettrackablesmap)()                                                                                                                                                                                           |             |
| public final [Trackable](Trackable.md)                                                                                                                                                                                                                                                          | [getTrackable](#gettrackable)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                   |             |
| public final [TrackableArray](TrackableArray.md)<?>                                                                                                                                                                                                                                             | [getTrackableArray](#gettrackablearray)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                         |             |
| public final [AbstractTrackable](AbstractTrackable.md)                                                                                                                                                                                                                                          | [getObjectProperty](#getobjectproperty)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                         |             |
| public java.util.Map                                                                                                                                                                                                                                                                            | [getDataContext](#getdatacontext)()                                                                                                                                                                                               |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                             | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                                     |             |
| public final [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)                                                                                                                                                                                     | [getBoolean](#getboolean)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                       |             |
| public final [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html)                                                                                                                                                                                     | [getInteger](#getinteger)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                       |             |
| public final [Long](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Long.html)                                                                                                                                                                                           | [getLong](#getlong)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                             |             |
| public final [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html)                                                                                                                                                                                       | [getPath](#getpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                             |             |
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                         |             |
| public final [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html)                                                                                                                                                                                              | [getUri](#geturi)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                               |             |
| public void                                                                                                                                                                                                                                                                                     | [set](#set)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                 |             |
| public void                                                                                                                                                                                                                                                                                     | [putUserData](#putuserdata)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value) |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                             | [getUserData](#getuserdata)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)                                                                                                     |             |


### Methods inherited from [AbstractTrackable](AbstractTrackable.md)

invalidate, removeTracker, addTracker


## Method Details

### additionalPropertiesAllowed

<span style="font-family: monospace; font-size: 80%;">protected boolean __additionalPropertiesAllowed__()</span>




---

### setAdditionalPropertiesAllowed

<span style="font-family: monospace; font-size: 80%;">public void __setAdditionalPropertiesAllowed__(boolean b)</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>



**Specified By:**

[TrackableTabularData](TrackableTabularData.md)


---

### getValues

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>



**Specified By:**

[TrackableTabularData](TrackableTabularData.md)


---

### getTrackables

<span style="font-family: monospace; font-size: 80%;">public final [Trackable](Trackable.md)[] __getTrackables__()</span>



**Specified By:**

[TrackableTabularData](TrackableTabularData.md)


---

### getTrackablesMap

<span style="font-family: monospace; font-size: 80%;">public final [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Trackable](Trackable.md)> __getTrackablesMap__()</span>



**Specified By:**

[TrackableTabularData](TrackableTabularData.md)


---

### getTrackable

<span style="font-family: monospace; font-size: 80%;">public final [Trackable](Trackable.md) __getTrackable__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>



**Specified By:**

[TrackableTabularData](TrackableTabularData.md)


---

### getTrackableArray

<span style="font-family: monospace; font-size: 80%;">public final [TrackableArray](TrackableArray.md)<?> __getTrackableArray__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getObjectProperty

<span style="font-family: monospace; font-size: 80%;">public final [AbstractTrackable](AbstractTrackable.md) __getObjectProperty__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getDataContext

<span style="font-family: monospace; font-size: 80%;">public java.util.Map __getDataContext__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getBoolean

<span style="font-family: monospace; font-size: 80%;">public final [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) __getBoolean__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getInteger

<span style="font-family: monospace; font-size: 80%;">public final [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __getInteger__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getLong

<span style="font-family: monospace; font-size: 80%;">public final [Long](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Long.html) __getLong__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getPath

<span style="font-family: monospace; font-size: 80%;">public final [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) __getPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### getUri

<span style="font-family: monospace; font-size: 80%;">public final [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getUri__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public void __set__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### putUserData

<span style="font-family: monospace; font-size: 80%;">public void __putUserData__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>




---

### getUserData

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getUserData__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

