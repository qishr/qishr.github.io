Package [io.github.qishr.cascara.common.io.provider](index.md)

# Class ResResourceProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.io.provider.AbstractResourceProvider](AbstractResourceProvider.md)<br/>
                io.github.qishr.cascara.common.io.provider.ResResourceProvider<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ResResourceProvider__<br/>extends [AbstractResourceProvider](AbstractResourceProvider.md)
</span>


## Constructor Summary

| Constructor                                                                                                              | Description |
|--------------------------------------------------------------------------------------------------------------------------|-------------|
| ResResourceProvider([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz) |             |
| ResResourceProvider()                                                                                                    |             |



## Method Summary

| Modifier and Type                             | Method                                                                                                                                 | Description |
|-----------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                   | [setClass](#setclass)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)             |             |
| public [ResourceStream](../ResourceStream.md) | [getResourceAsStream](#getresourceasstream)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri) |             |


### Methods inherited from [AbstractResourceProvider](AbstractResourceProvider.md)

getServiceProperties


## Method Details

### setClass

<span style="font-family: monospace; font-size: 80%;">public void __setClass__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz)</span>




---

### getResourceAsStream

<span style="font-family: monospace; font-size: 80%;">public [ResourceStream](../ResourceStream.md) __getResourceAsStream__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>



**Throws:**

[LocalizableException](../../../cascara.common/diagnostic/LocalizableException.md)


---

