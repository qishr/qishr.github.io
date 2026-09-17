Package [io.github.qishr.cascara.common.trackable.property](index.md)

# Class TrackableProperty
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.property.Property](../../property/Property.md)<T><br/>
                io.github.qishr.cascara.common.trackable.property.TrackableProperty<br/>
<br/>
All Implemented Interfaces:<br/>
    [Trackable](../Trackable.md)

Direct Known Subtypes:<br/>
    [TrackableBooleanProperty](TrackableBooleanProperty.md), [TrackableStringProperty](TrackableStringProperty.md), [TrackableNumberProperty](TrackableNumberProperty.md), [TrackableIntegerProperty](TrackableIntegerProperty.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __TrackableProperty__<br/>extends [Property](../../property/Property.md)<T>
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| TrackableProperty()                                                                                                                                                                                                               |             |
| TrackableProperty([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                              |             |
| TrackableProperty([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, T value)                                                                                                     |             |
| TrackableProperty([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) owner, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, T value) |             |
| TrackableProperty([PrimitiveType](../../lang/type/PrimitiveType.md) primitiveType, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) mediaType, boolean isDeclaredProperty)            |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [getOwner](#getowner)()                                                                                                          |             |
| public void                                                                                         | [setOwner](#setowner)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMediaType](#getmediatype)()                                                                                                  |             |
| public void                                                                                         | [setMediaType](#setmediatype)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type) |             |
| public boolean                                                                                      | [isDeclaredProperty](#isdeclaredproperty)()                                                                                      |             |
| public void                                                                                         | [setDeclaredProperty](#setdeclaredproperty)(boolean b)                                                                           |             |
| public void                                                                                         | [setValue](#setvalue)(T v)                                                                                                       |             |
| public void                                                                                         | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)              |             |
| protected void                                                                                      | [invalidate](#invalidate)()                                                                                                      |             |
| public void                                                                                         | [addTracker](#addtracker)([InvalidationTracker](../tracker/InvalidationTracker.md) listener)                                     |             |
| public void                                                                                         | [removeTracker](#removetracker)([InvalidationTracker](../tracker/InvalidationTracker.md) listener)                               |             |


### Methods inherited from [Property](../../property/Property.md)

asInteger, asLong, isEmpty, getValue, getValue, asBoolean, getString, asString, asLong, getPrimitiveType, getName, getValues, asDouble, setPrimitiveType, asInteger, asDouble, asBoolean, getValuesMap


## Method Details

### getOwner

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __getOwner__()</span>




---

### setOwner

<span style="font-family: monospace; font-size: 80%;">public void __setOwner__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>




---

### getMediaType

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMediaType__()</span>




---

### setMediaType

<span style="font-family: monospace; font-size: 80%;">public void __setMediaType__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) type)</span>




---

### isDeclaredProperty

<span style="font-family: monospace; font-size: 80%;">public boolean __isDeclaredProperty__()</span>




---

### setDeclaredProperty

<span style="font-family: monospace; font-size: 80%;">public void __setDeclaredProperty__(boolean b)</span>




---

### setValue

<span style="font-family: monospace; font-size: 80%;">public void __setValue__(T v)</span>



**Overrides:**

[Property](../cascara.common/property/Property.md#setvalue)


---

### setName

<span style="font-family: monospace; font-size: 80%;">public void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### invalidate

<span style="font-family: monospace; font-size: 80%;">protected void __invalidate__()</span>




---

### addTracker

<span style="font-family: monospace; font-size: 80%;">public void __addTracker__([InvalidationTracker](../tracker/InvalidationTracker.md) listener)</span>



**Specified By:**

[Trackable](../Trackable.md)


---

### removeTracker

<span style="font-family: monospace; font-size: 80%;">public void __removeTracker__([InvalidationTracker](../tracker/InvalidationTracker.md) listener)</span>



**Specified By:**

[Trackable](../Trackable.md)


---

