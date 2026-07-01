Package [io.github.qishr.cascara.ui.control](index.md)

# Class LcdScreen
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.control.Control](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Control.html)<br/>
                                        io.github.qishr.cascara.ui.control.LcdScreen<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __LcdScreen__<br/>extends [Control](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Control.html)
</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| LcdScreen() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                          | Method                                                                                                                                                              | Description                                                                |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[ColorDefinition](../color/ColorDefinition.md)>                                                                        | [colorDefinitionProperty](#colordefinitionproperty)()                                                                                                               |                                                                            |
| public final [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                                                | [getColorDefinition](#getcolordefinition)()                                                                                                                         |                                                                            |
| public final void                                                                                                                                                                                                                                                          | [setColorDefinition](#setcolordefinition)([ColorDefinition](../color/ColorDefinition.md) definition)                                                                |                                                                            |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Insets](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Insets.html)>  | [screenPaddingProperty](#screenpaddingproperty)()                                                                                                                   |                                                                            |
| public final [Insets](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Insets.html)                                                                                                                                          | [getScreenPadding](#getscreenpadding)()                                                                                                                             |                                                                            |
| public final void                                                                                                                                                                                                                                                          | [setScreenPadding](#setscreenpadding)([Insets](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Insets.html) padding) |                                                                            |
| public final void                                                                                                                                                                                                                                                          | [setScreenPadding](#setscreenpadding)(double value)                                                                                                                 |                                                                            |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> | [colorProperty](#colorproperty)()                                                                                                                                   |                                                                            |
| public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                         | [getColor](#getcolor)()                                                                                                                                             |                                                                            |
| public final void                                                                                                                                                                                                                                                          | [setColor](#setcolor)([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) c)                      |                                                                            |
| public final [DoubleProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/DoubleProperty.html)                                                                                                                        | [displayValueProperty](#displayvalueproperty)()                                                                                                                     |                                                                            |
| public final double                                                                                                                                                                                                                                                        | [getDisplayValue](#getdisplayvalue)()                                                                                                                               |                                                                            |
| public [OnPasteHandler](LcdScreen.OnPasteHandler.md)                                                                                                                                                                                                                       | [getOnPaste](#getonpaste)()                                                                                                                                         |                                                                            |
| public void                                                                                                                                                                                                                                                                | [setOnPaste](#setonpaste)([OnPasteHandler](LcdScreen.OnPasteHandler.md) onPaste)                                                                                    |                                                                            |
| public void                                                                                                                                                                                                                                                                | [onPaste](#onpaste)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                                             |                                                                            |
| public void                                                                                                                                                                                                                                                                | [showValue](#showvalue)(double value)                                                                                                                               | Temporarily displays the given number for the default duration (1 second). |
| public void                                                                                                                                                                                                                                                                | [showValue](#showvalue)(double value, [Duration](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/util/Duration.html) duration)    | Temporarily displays the given number for a configurable duration.         |
| public double                                                                                                                                                                                                                                                              | [computeMinWidth](#computeminwidth)(double height)                                                                                                                  |                                                                            |
| public double                                                                                                                                                                                                                                                              | [computeMinHeight](#computeminheight)(double width)                                                                                                                 |                                                                            |
| public double                                                                                                                                                                                                                                                              | [computePrefWidth](#computeprefwidth)(double height)                                                                                                                |                                                                            |
| public double                                                                                                                                                                                                                                                              | [computePrefHeight](#computeprefheight)(double width)                                                                                                               |                                                                            |
| public double                                                                                                                                                                                                                                                              | [computeMaxWidth](#computemaxwidth)(double height)                                                                                                                  |                                                                            |
| public double                                                                                                                                                                                                                                                              | [computeMaxHeight](#computemaxheight)(double width)                                                                                                                 |                                                                            |
| protected [Skin](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Skin.html)<[LcdScreen](LcdScreen.md)>                                                                                                                 | [createDefaultSkin](#createdefaultskin)()                                                                                                                           |                                                                            |
| public static java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?>                                                                                    | [getClassCssMetaData](#getclasscssmetadata)()                                                                                                                       |                                                                            |
| public java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?>                                                                                           | [getControlCssMetaData](#getcontrolcssmetadata)()                                                                                                                   |                                                                            |



## Method Details

### colorDefinitionProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[ColorDefinition](../color/ColorDefinition.md)> __colorDefinitionProperty__()</span>




---

### getColorDefinition

<span style="font-family: monospace; font-size: 80%;">public final [ColorDefinition](../color/ColorDefinition.md) __getColorDefinition__()</span>




---

### setColorDefinition

<span style="font-family: monospace; font-size: 80%;">public final void __setColorDefinition__([ColorDefinition](../color/ColorDefinition.md) definition)</span>




---

### screenPaddingProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Insets](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Insets.html)> __screenPaddingProperty__()</span>




---

### getScreenPadding

<span style="font-family: monospace; font-size: 80%;">public final [Insets](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Insets.html) __getScreenPadding__()</span>




---

### setScreenPadding

<span style="font-family: monospace; font-size: 80%;">public final void __setScreenPadding__([Insets](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Insets.html) padding)</span>




---

### setScreenPadding

<span style="font-family: monospace; font-size: 80%;">public final void __setScreenPadding__(double value)</span>




---

### colorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> __colorProperty__()</span>




---

### getColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) __getColor__()</span>




---

### setColor

<span style="font-family: monospace; font-size: 80%;">public final void __setColor__([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) c)</span>




---

### displayValueProperty

<span style="font-family: monospace; font-size: 80%;">public final [DoubleProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/DoubleProperty.html) __displayValueProperty__()</span>




---

### getDisplayValue

<span style="font-family: monospace; font-size: 80%;">public final double __getDisplayValue__()</span>




---

### getOnPaste

<span style="font-family: monospace; font-size: 80%;">public [OnPasteHandler](LcdScreen.OnPasteHandler.md) __getOnPaste__()</span>




---

### setOnPaste

<span style="font-family: monospace; font-size: 80%;">public void __setOnPaste__([OnPasteHandler](LcdScreen.OnPasteHandler.md) onPaste)</span>




---

### onPaste

<span style="font-family: monospace; font-size: 80%;">public void __onPaste__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>




---

### showValue

<span style="font-family: monospace; font-size: 80%;">public void __showValue__(double value)</span>

Temporarily displays the given number for the default duration (1 second).The display returns to the background color's hex code automatically.

**Parameters:**

`value` - The double value to display.


---

### showValue

<span style="font-family: monospace; font-size: 80%;">public void __showValue__(double value, [Duration](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/util/Duration.html) duration)</span>

Temporarily displays the given number for a configurable duration.

**Parameters:**

`value` - The double value to display.

`duration` - The duration to show the number before returning to the default hex display.
                A value of Duration.INDEFINITE will display the value until it's explicitly changed again.


---

### computeMinWidth

<span style="font-family: monospace; font-size: 80%;">public double __computeMinWidth__(double height)</span>




---

### computeMinHeight

<span style="font-family: monospace; font-size: 80%;">public double __computeMinHeight__(double width)</span>




---

### computePrefWidth

<span style="font-family: monospace; font-size: 80%;">public double __computePrefWidth__(double height)</span>




---

### computePrefHeight

<span style="font-family: monospace; font-size: 80%;">public double __computePrefHeight__(double width)</span>




---

### computeMaxWidth

<span style="font-family: monospace; font-size: 80%;">public double __computeMaxWidth__(double height)</span>




---

### computeMaxHeight

<span style="font-family: monospace; font-size: 80%;">public double __computeMaxHeight__(double width)</span>




---

### createDefaultSkin

<span style="font-family: monospace; font-size: 80%;">protected [Skin](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Skin.html)<[LcdScreen](LcdScreen.md)> __createDefaultSkin__()</span>




---

### getClassCssMetaData

<span style="font-family: monospace; font-size: 80%;">public static java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?> __getClassCssMetaData__()</span>




---

### getControlCssMetaData

<span style="font-family: monospace; font-size: 80%;">public java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?> __getControlCssMetaData__()</span>




---

