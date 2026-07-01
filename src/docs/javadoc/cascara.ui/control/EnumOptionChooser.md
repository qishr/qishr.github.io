Package [io.github.qishr.cascara.ui.control](index.md)

# Class EnumOptionChooser
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.control.Control](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Control.html)<br/>
                                        [javafx.scene.control.ComboBoxBase](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/ComboBoxBase.html)<[io.github.qishr.cascara.ui.option.Option](../option/Option.md)><br/>
                                                [javafx.scene.control.ComboBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/ComboBox.html)<[io.github.qishr.cascara.ui.option.Option](../option/Option.md)><br/>
                                                        [io.github.qishr.cascara.ui.control.OptionChooser](OptionChooser.md)<br/>
                                                                io.github.qishr.cascara.ui.control.EnumOptionChooser<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __EnumOptionChooser__<br/>extends [OptionChooser](OptionChooser.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| EnumOptionChooser([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema, [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> initialValue)                                   |             |
| EnumOptionChooser([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) initialStringValue)                            |             |
| EnumOptionChooser([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema, [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> initialValue, java.util.Map dataContext)        |             |
| EnumOptionChooser([SchemaNode](../../cascara.schema/schema/structure/SchemaNode.md) schema, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) initialStringValue, java.util.Map dataContext) |             |



## Method Summary

| Modifier and Type                                                                                  | Method                                                                                                                               | Description |
|----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                        | [setEnumValue](#setenumvalue)([Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> enumValue) |             |
| public [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> | [getEnumValue](#getenumvalue)()                                                                                                      |             |


### Methods inherited from [OptionChooser](OptionChooser.md)

getOptionProvider, setOptionProvider, makeSearchable


## Method Details

### setEnumValue

<span style="font-family: monospace; font-size: 80%;">public void __setEnumValue__([Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> enumValue)</span>




---

### getEnumValue

<span style="font-family: monospace; font-size: 80%;">public [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<?> __getEnumValue__()</span>




---

