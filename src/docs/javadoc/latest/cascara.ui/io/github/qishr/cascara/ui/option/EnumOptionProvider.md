Package [io.github.qishr.cascara.ui.option](index.md)

# Class EnumOptionProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.option.AbstractOptionProvider](../../../../../../io/github/qishr/cascara/ui/option/AbstractOptionProvider.md)<br/>
                io.github.qishr.cascara.ui.option.EnumOptionProvider<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __EnumOptionProvider__<br/>extends [AbstractOptionProvider](../../../../../../io/github/qishr/cascara/ui/option/AbstractOptionProvider.md)
</span>


## Field Summary

| Modifier and Type                                                                                                | Field         | Description |
|------------------------------------------------------------------------------------------------------------------|---------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [NAME](#name) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                          | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| EnumOptionProvider([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) initialStringValue) |             |
| EnumOptionProvider([SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema, [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> initialValue)        |             |



## Method Summary

| Modifier and Type                                                                                                                                                        | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)                                                                                           | [getOption](#getoption)([Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> enumValue)                                                                                                                                                                                                                                                                                                                           |             |
| public static [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)                                                                                    | [populateEnumOptions](#populateenumoptions)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)> options, [SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) initialValueString) |             |
| public [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)                                                                                           | [getActiveOption](#getactiveoption)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)              |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)> | [getOptions](#getoptions)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)                        |             |


### Methods inherited from [AbstractOptionProvider](../../../../../../io/github/qishr/cascara/ui/option/AbstractOptionProvider.md)

addListener, getName, getSchemaType, getSchemaFormat, initialize, removeListener, getContentType, getServiceProperties, getRenderer


## Field Details

### NAME

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __NAME__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### getOption

<span style="font-family: monospace; font-size: 80%;">public [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) __getOption__([Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> enumValue)</span>




---

### populateEnumOptions

<span style="font-family: monospace; font-size: 80%;">public static [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) __populateEnumOptions__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)> options, [SchemaNode](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/structure/SchemaNode.md) schema, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) initialValueString)</span>




---

### getActiveOption

<span style="font-family: monospace; font-size: 80%;">public [Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md) __getActiveOption__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

### getOptions

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](../../../../../../io/github/qishr/cascara/ui/option/Option.md)> __getOptions__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Property](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/Property.html)<?>> contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

