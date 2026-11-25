Package [io.github.qishr.cascara.common.trackable](index.md)

# Interface TrackableValue
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.trackable.TrackableValue<br/>
<br/>
All Implemented Interfaces:<br/>
    [Trackable](../../../../../../io/github/qishr/cascara/common/trackable/Trackable.md)

All Known Implementing Classes:<br/>
    [TrackableProperty](../../../../../../io/github/qishr/cascara/common/trackable/property/TrackableProperty.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TrackableValue__</span>


## Method Summary

| Modifier and Type    | Method                                                                                                                                          | Description |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract void | [addTracker](#addtracker)([ValueTracker](../../../../../../io/github/qishr/cascara/common/trackable/tracker/ValueTracker.md)<T> listener)       |             |
| public abstract void | [removeTracker](#removetracker)([ValueTracker](../../../../../../io/github/qishr/cascara/common/trackable/tracker/ValueTracker.md)<T> listener) |             |
| public abstract T    | [getValue](#getvalue)()                                                                                                                         |             |



## Method Details

### addTracker

<span style="font-family: monospace; font-size: 80%;">public abstract void __addTracker__([ValueTracker](../../../../../../io/github/qishr/cascara/common/trackable/tracker/ValueTracker.md)<T> listener)</span>




---

### removeTracker

<span style="font-family: monospace; font-size: 80%;">public abstract void __removeTracker__([ValueTracker](../../../../../../io/github/qishr/cascara/common/trackable/tracker/ValueTracker.md)<T> listener)</span>




---

### getValue

<span style="font-family: monospace; font-size: 80%;">public abstract T __getValue__()</span>




---

