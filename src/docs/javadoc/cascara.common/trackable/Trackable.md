Package [io.github.qishr.cascara.common.trackable](index.md)

# Interface Trackable
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.trackable.Trackable<br/>
<br/>
All Known Implementing Classes:<br/>
    [AbstractTrackable](AbstractTrackable.md), [TrackableProperty](property/TrackableProperty.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Trackable__</span>


## Method Summary

| Modifier and Type    | Method                                                                                          | Description |
|----------------------|-------------------------------------------------------------------------------------------------|-------------|
| public abstract void | [addTracker](#addtracker)([InvalidationTracker](tracker/InvalidationTracker.md) listener)       |             |
| public abstract void | [removeTracker](#removetracker)([InvalidationTracker](tracker/InvalidationTracker.md) listener) |             |



## Method Details

### addTracker

<span style="font-family: monospace; font-size: 80%;">public abstract void __addTracker__([InvalidationTracker](tracker/InvalidationTracker.md) listener)</span>




---

### removeTracker

<span style="font-family: monospace; font-size: 80%;">public abstract void __removeTracker__([InvalidationTracker](tracker/InvalidationTracker.md) listener)</span>




---

