Package [io.github.qishr.cascara.ui.theme](index.md)

# Class VariationOptionProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.option.AbstractOptionProvider](../../../../../../io/github/qishr/cascara/ui/option/AbstractOptionProvider.md)<br/>
                io.github.qishr.cascara.ui.theme.VariationOptionProvider<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __VariationOptionProvider__<br/>extends [AbstractOptionProvider](../../../../../../io/github/qishr/cascara/ui/option/AbstractOptionProvider.md)
</span>


## Field Summary

| Modifier and Type                                                                                                | Field         | Description |
|------------------------------------------------------------------------------------------------------------------|---------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [NAME](#name) |             |



## Constructor Summary

| Constructor               | Description |
|---------------------------|-------------|
| VariationOptionProvider() |             |



## Method Summary

| Modifier and Type                                                                                                                                                        | Method                                                                                                                                                                                                                                                                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                                                                              | [initialize](#initialize)()                                                                                                                                                                                                                                                                                                                                                                                                                 |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                      | [getName](#getname)()                                                                                                                                                                                                                                                                                                                                                                                                                       |             |
| public [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)                                                                                           | [getActiveOption](#getactiveoption)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter) |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)> | [getOptions](#getoptions)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> dataContext, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)           |             |


### Methods inherited from [AbstractOptionProvider](../../../../../../io/github/qishr/cascara/ui/option/AbstractOptionProvider.md)

addListener, getSchemaType, getSchemaFormat, removeListener, getContentType, getServiceProperties, getRenderer


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

[AbstractOptionProvider](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/option/AbstractOptionProvider.md#initialize)


---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>



**Overrides:**

[AbstractOptionProvider](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/option/AbstractOptionProvider.md#getname)


---

### getActiveOption

<span style="font-family: monospace; font-size: 80%;">public [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) __getActiveOption__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

### getOptions

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)> __getOptions__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> dataContext, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

