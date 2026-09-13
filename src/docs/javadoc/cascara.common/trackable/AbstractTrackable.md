Package [io.github.qishr.cascara.common.trackable](index.md)

# Class AbstractTrackable
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.trackable.AbstractTrackable<br/>
<br/>
All Implemented Interfaces:<br/>
    [Trackable](Trackable.md)

Direct Known Subtypes:<br/>
    [TrackableArray](TrackableArray.md), [TrackableObject](TrackableObject.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractTrackable__</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| AbstractTrackable() |             |



## Method Summary

| Modifier and Type | Method                                                                                          | Description |
|-------------------|-------------------------------------------------------------------------------------------------|-------------|
| protected void    | [invalidate](#invalidate)()                                                                     |             |
| public void       | [addTracker](#addtracker)([InvalidationTracker](tracker/InvalidationTracker.md) listener)       |             |
| public void       | [removeTracker](#removetracker)([InvalidationTracker](tracker/InvalidationTracker.md) listener) |             |



## Method Details

### invalidate

<span style="font-family: monospace; font-size: 80%;">protected void __invalidate__()</span>




---

### addTracker

<span style="font-family: monospace; font-size: 80%;">public void __addTracker__([InvalidationTracker](tracker/InvalidationTracker.md) listener)</span>



**Specified By:**

[Trackable](Trackable.md)


---

### removeTracker

<span style="font-family: monospace; font-size: 80%;">public void __removeTracker__([InvalidationTracker](tracker/InvalidationTracker.md) listener)</span>



**Specified By:**

[Trackable](Trackable.md)


---

