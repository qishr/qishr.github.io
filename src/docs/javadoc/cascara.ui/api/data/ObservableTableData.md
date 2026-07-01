Package [io.github.qishr.cascara.ui.api.data](index.md)

# Interface ObservableTableData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.data.ObservableTableData<br/>
<br/>
All Implemented Interfaces:<br/>
    [TableData](../../../cascara.common/data/TableData.md)

All Known Implementing Classes:<br/>
    [ObservableTreeData](ObservableTreeData.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ObservableTableData__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                                           | Method                                                                                                                            | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)[]                                                                                                                                                                                     | [getObservables](#getobservables)()                                                                                               |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)> | [getObservablesMap](#getobservablesmap)()                                                                                         |             |
| public abstract [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)                                                                                                                                                                                       | [getObservable](#getobservable)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key) |             |



## Method Details

### getObservables

<span style="font-family: monospace; font-size: 80%;">public abstract [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)[] __getObservables__()</span>




---

### getObservablesMap

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html)> __getObservablesMap__()</span>




---

### getObservable

<span style="font-family: monospace; font-size: 80%;">public abstract [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html) __getObservable__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

