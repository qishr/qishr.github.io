Package [io.github.qishr.cascara.common.trackable](index.md)

# Interface TrackableTabularData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.trackable.TrackableTabularData<br/>
<br/>
All Known Implementing Classes:<br/>
    [TrackableObject](TrackableObject.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TrackableTabularData__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                  | Method                                                                                                                          | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                                                 |             |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                                       |             |
| public abstract [Trackable](Trackable.md)[]                                                                                                                                                                                                                                                        | [getTrackables](#gettrackables)()                                                                                               |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Trackable](Trackable.md)>                                                                    | [getTrackablesMap](#gettrackablesmap)()                                                                                         |             |
| public abstract [Trackable](Trackable.md)                                                                                                                                                                                                                                                          | [getTrackable](#gettrackable)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key) |             |



## Method Details

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>




---

### getValues

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>




---

### getTrackables

<span style="font-family: monospace; font-size: 80%;">public abstract [Trackable](Trackable.md)[] __getTrackables__()</span>




---

### getTrackablesMap

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Trackable](Trackable.md)> __getTrackablesMap__()</span>




---

### getTrackable

<span style="font-family: monospace; font-size: 80%;">public abstract [Trackable](Trackable.md) __getTrackable__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

