Package [io.github.qishr.cascara.common.trackable.property](index.md)

# Class TrackableStringProperty
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.property.Property](../../property/Property.md)<[java.lang.String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)><br/>
                [io.github.qishr.cascara.common.trackable.property.TrackableProperty](TrackableProperty.md)<[java.lang.String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)><br/>
                        io.github.qishr.cascara.common.trackable.property.TrackableStringProperty<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __TrackableStringProperty__<br/>extends [TrackableProperty](TrackableProperty.md)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                        | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| TrackableStringProperty()                                                                                                                                                                                                                                                                                                          |             |
| TrackableStringProperty([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) owner, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                | Description |
|-------------------|-----------------------------------------------------------------------------------------------------------------------|-------------|
| public void       | [setValue](#setvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v) |             |


### Methods inherited from [Property](../../property/Property.md)

asLong, asBoolean, asString, getName, getValues, asDouble, setPrimitiveType, asInteger, asDouble, asBoolean, asInteger, isEmpty, getValue, getValue, getString, asLong, getPrimitiveType, getValuesMap

### Methods inherited from [TrackableProperty](TrackableProperty.md)

getOwner, setOwner, setDeclaredProperty, addTracker, [setValue](#setvalue), isDeclaredProperty, invalidate, removeTracker, setMediaType, setName, getMediaType


## Method Details

### setValue

<span style="font-family: monospace; font-size: 80%;">public void __setValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) v)</span>




---

