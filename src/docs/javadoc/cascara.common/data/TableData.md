Package [io.github.qishr.cascara.common.data](index.md)

# Interface TableData
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.data.TableData<br/>
<br/>
All Known Implementing Classes:<br/>
    [TreeData](TreeData.md), [ReferenceTableData](reference/ReferenceTableData.md), [Property](../util/Property.md), [Properties](../util/Properties.md), [ObservableTableData](../../cascara.ui/api/data/ObservableTableData.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TableData__</span>

Data that can represent a row within a table


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                  | Method                                                                                                        | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                                                                                                                                                                                     | [getValues](#getvalues)()                                                                                     |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getValuesMap](#getvaluesmap)()                                                                               |             |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                       | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key) |             |



## Method Details

### getValues

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getValues__()</span>




---

### getValuesMap

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getValuesMap__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key)</span>




---

