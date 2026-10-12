Package [io.github.qishr.cascara.ui.control](index.md)

# Class ColorMixer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.control.Control](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Control.html)<br/>
                                        io.github.qishr.cascara.ui.control.ColorMixer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColorMixer__<br/>extends [Control](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Control.html)
</span>


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| ColorMixer() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                   | Method                                                                                                                  | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|-------------|
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)>                                                                                            | [leftColorProperty](#leftcolorproperty)()                                                                               |             |
| public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                                                                                   | [getLeftColor](#getleftcolor)()                                                                                         |             |
| public final void                                                                                                                                                                                                                                                                                   | [setLeftColor](#setleftcolor)([Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) c)   |             |
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)>                                                                                            | [mixedColorProperty](#mixedcolorproperty)()                                                                             |             |
| public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                                                                                   | [getMixedColor](#getmixedcolor)()                                                                                       |             |
| public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)>                                                                                            | [rightColorProperty](#rightcolorproperty)()                                                                             |             |
| public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                                                                                   | [getRightColor](#getrightcolor)()                                                                                       |             |
| public final void                                                                                                                                                                                                                                                                                   | [setRightColor](#setrightcolor)([Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) c) |             |
| public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html)                                                                                                                                                                                  | [lerpProperty](#lerpproperty)()                                                                                         |             |
| public final double                                                                                                                                                                                                                                                                                 | [getLerp](#getlerp)()                                                                                                   |             |
| public final void                                                                                                                                                                                                                                                                                   | [setLerp](#setlerp)(double c)                                                                                           |             |
| protected [Skin](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Skin.html)<[ColorMixer](../../../../../../io/github/qishr/cascara/ui/control/ColorMixer.md)>                                                                                                                    | [createDefaultSkin](#createdefaultskin)()                                                                               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                                 | [getUserAgentStylesheet](#getuseragentstylesheet)()                                                                     |             |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>> | [getClassCssMetaData](#getclasscssmetadata)()                                                                           |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>>        | [getControlCssMetaData](#getcontrolcssmetadata)()                                                                       |             |



## Method Details

### leftColorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)> __leftColorProperty__()</span>




---

### getLeftColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) __getLeftColor__()</span>




---

### setLeftColor

<span style="font-family: monospace; font-size: 80%;">public final void __setLeftColor__([Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) c)</span>




---

### mixedColorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)> __mixedColorProperty__()</span>




---

### getMixedColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) __getMixedColor__()</span>




---

### rightColorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html)> __rightColorProperty__()</span>




---

### getRightColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) __getRightColor__()</span>




---

### setRightColor

<span style="font-family: monospace; font-size: 80%;">public final void __setRightColor__([Color](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Color.html) c)</span>




---

### lerpProperty

<span style="font-family: monospace; font-size: 80%;">public final [DoubleProperty](https://openjfx.io/javadoc/25/javafx.base/javafx/beans/property/DoubleProperty.html) __lerpProperty__()</span>




---

### getLerp

<span style="font-family: monospace; font-size: 80%;">public final double __getLerp__()</span>




---

### setLerp

<span style="font-family: monospace; font-size: 80%;">public final void __setLerp__(double c)</span>




---

### createDefaultSkin

<span style="font-family: monospace; font-size: 80%;">protected [Skin](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/Skin.html)<[ColorMixer](../../../../../../io/github/qishr/cascara/ui/control/ColorMixer.md)> __createDefaultSkin__()</span>




---

### getUserAgentStylesheet

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUserAgentStylesheet__()</span>




---

### getClassCssMetaData

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>> __getClassCssMetaData__()</span>




---

### getControlCssMetaData

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CssMetaData](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/CssMetaData.html)<? extends [Styleable](https://openjfx.io/javadoc/25/javafx.graphics/javafx/css/Styleable.html), ?>> __getControlCssMetaData__()</span>




---

