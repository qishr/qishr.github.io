Package [io.github.qishr.cascara.ui.theme](index.md)

# Class ThemeOptionProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.option.AbstractOptionProvider](../option/AbstractOptionProvider.md)<br/>
                io.github.qishr.cascara.ui.theme.ThemeOptionProvider<br/>
<br/>
All Implemented Interfaces:<br/>
    [AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


----

<span style="font-family: monospace; font-size: 80%;">public class __ThemeOptionProvider__<br/>extends [AbstractOptionProvider](../option/AbstractOptionProvider.md)
</span>


## Field Summary

| Modifier and Type                                                                                                | Field         | Description |
|------------------------------------------------------------------------------------------------------------------|---------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [NAME](#name) |             |



## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| ThemeOptionProvider() |             |



## Method Summary

| Modifier and Type                                                                                                              | Method                                                                                                                                                                 | Description |
|--------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                    | [initialize](#initialize)()                                                                                                                                            |             |
| public void                                                                                                                    | [close](#close)()                                                                                                                                                      |             |
| public [Option](../option/Option.md)                                                                                           | [getActiveOption](#getactiveoption)(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../option/Option.md)> | [getOptions](#getoptions)(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)           |             |


### Methods inherited from [AbstractOptionProvider](../option/AbstractOptionProvider.md)

addListener, getName, getSchemaType, getSchemaFormat, removeListener, getContentType, getServiceProperties, getRenderer


## Field Details

### NAME

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __NAME__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### initialize

<span style="font-family: monospace; font-size: 80%;">public void __initialize__()</span>



**Overrides:**

[AbstractOptionProvider](../cascara.ui/option/AbstractOptionProvider.md#initialize)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Specified By:**

[AutoCloseable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/AutoCloseable.html)


---

### getActiveOption

<span style="font-family: monospace; font-size: 80%;">public [Option](../option/Option.md) __getActiveOption__(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

### getOptions

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../option/Option.md)> __getOptions__(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

