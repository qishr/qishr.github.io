Package [io.github.qishr.cascara.common.io.provider](index.md)

# Interface ResourceProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.io.provider.ResourceProvider<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../../cascara.common/service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [AbstractResourceProvider](AbstractResourceProvider.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ResourceProvider__</span>


## Method Summary

| Modifier and Type                                      | Method                                                                                                                                 | Description |
|--------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [ResourceStream](../ResourceStream.md) | [getResourceAsStream](#getresourceasstream)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri) |             |



## Method Details

### getResourceAsStream

<span style="font-family: monospace; font-size: 80%;">public abstract [ResourceStream](../ResourceStream.md) __getResourceAsStream__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[LocalizableException](../../../cascara.common/diagnostic/LocalizableException.md)


---

