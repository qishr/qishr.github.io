Package [io.github.qishr.cascara.ui.control](index.md)

# Class ColorWheel
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.control.Control](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Control.html)<br/>
                                        io.github.qishr.cascara.ui.control.ColorWheel<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColorWheel__<br/>extends [Control](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Control.html)
</span>


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| ColorWheel() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                   | Method                                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md)>                                                                                        | [colorDefinitionProperty](#colordefinitionproperty)()                                                                                          |             |
| public final [ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md)                                                                                                                                                                                               | [getColorDefinition](#getcolordefinition)()                                                                                                    |             |
| public final void                                                                                                                                                                                                                                                                                   | [setColorDefinition](#setcolordefinition)([ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md) definition) |             |
| public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html)                                                                                                                                                                                  | [hueProperty](#hueproperty)()                                                                                                                  |             |
| public final double                                                                                                                                                                                                                                                                                 | [getHue](#gethue)()                                                                                                                            |             |
| public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html)                                                                                                                                                                                  | [saturationProperty](#saturationproperty)()                                                                                                    |             |
| public final double                                                                                                                                                                                                                                                                                 | [getSaturation](#getsaturation)()                                                                                                              |             |
| public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html)                                                                                                                                                                                  | [brightnessProperty](#brightnessproperty)()                                                                                                    |             |
| public final double                                                                                                                                                                                                                                                                                 | [getBrightness](#getbrightness)()                                                                                                              |             |
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)>                                                                                            | [colorProperty](#colorproperty)()                                                                                                              |             |
| public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                                                                                   | [getColor](#getcolor)()                                                                                                                        |             |
| public final void                                                                                                                                                                                                                                                                                   | [setColor](#setcolor)([Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) c)                                  |             |
| public void                                                                                                                                                                                                                                                                                         | [setOnChange](#setonchange)([OnChangeHandler](../../../../../../io/github/qishr/cascara/ui/control/ColorWheel.OnChangeHandler.md) onChange)    |             |
| public void                                                                                                                                                                                                                                                                                         | [onChange](#onchange)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                      |             |
| protected [Skin](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Skin.html)<[ColorWheel](../../../../../../io/github/qishr/cascara/ui/control/ColorWheel.md)>                                                                                                                    | [createDefaultSkin](#createdefaultskin)()                                                                                                      |             |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>> | [getClassCssMetaData](#getclasscssmetadata)()                                                                                                  |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>>        | [getControlCssMetaData](#getcontrolcssmetadata)()                                                                                              |             |



## Method Details

### colorDefinitionProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md)> __colorDefinitionProperty__()</span>




---

### getColorDefinition

<span style="font-family: monospace; font-size: 80%;">public final [ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md) __getColorDefinition__()</span>




---

### setColorDefinition

<span style="font-family: monospace; font-size: 80%;">public final void __setColorDefinition__([ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md) definition)</span>




---

### hueProperty

<span style="font-family: monospace; font-size: 80%;">public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html) __hueProperty__()</span>




---

### getHue

<span style="font-family: monospace; font-size: 80%;">public final double __getHue__()</span>




---

### saturationProperty

<span style="font-family: monospace; font-size: 80%;">public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html) __saturationProperty__()</span>




---

### getSaturation

<span style="font-family: monospace; font-size: 80%;">public final double __getSaturation__()</span>




---

### brightnessProperty

<span style="font-family: monospace; font-size: 80%;">public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html) __brightnessProperty__()</span>




---

### getBrightness

<span style="font-family: monospace; font-size: 80%;">public final double __getBrightness__()</span>




---

### colorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)> __colorProperty__()</span>




---

### getColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) __getColor__()</span>




---

### setColor

<span style="font-family: monospace; font-size: 80%;">public final void __setColor__([Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) c)</span>




---

### setOnChange

<span style="font-family: monospace; font-size: 80%;">public void __setOnChange__([OnChangeHandler](../../../../../../io/github/qishr/cascara/ui/control/ColorWheel.OnChangeHandler.md) onChange)</span>




---

### onChange

<span style="font-family: monospace; font-size: 80%;">public void __onChange__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### createDefaultSkin

<span style="font-family: monospace; font-size: 80%;">protected [Skin](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Skin.html)<[ColorWheel](../../../../../../io/github/qishr/cascara/ui/control/ColorWheel.md)> __createDefaultSkin__()</span>




---

### getClassCssMetaData

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>> __getClassCssMetaData__()</span>




---

### getControlCssMetaData

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>> __getControlCssMetaData__()</span>




---

