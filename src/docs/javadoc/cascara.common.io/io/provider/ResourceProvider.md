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


## Field Summary

| Modifier and Type                                                                                                | Field                     | Description |
|------------------------------------------------------------------------------------------------------------------|---------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [URI_SCHEME](#uri_scheme) |             |



## Method Summary

| Modifier and Type                                      | Method                                                                                                                                 | Description |
|--------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [ResourceStream](../ResourceStream.md) | [getResourceAsStream](#getresourceasstream)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri) |             |



## Field Details

### URI_SCHEME

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __URI_SCHEME__</span>



**See Also:**


[Constant Field Values](../../constant-values.md)



---


## Method Details

### getResourceAsStream

<span style="font-family: monospace; font-size: 80%;">public abstract [ResourceStream](../ResourceStream.md) __getResourceAsStream__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[LocalizableIOException](../../../cascara.common/diagnostic/exception/LocalizableIOException.md)


---

