Package [io.github.qishr.cascara.ui.control](index.md)

# Class ColorMixer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.control.Control](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Control.html)<br/>
                                        io.github.qishr.cascara.ui.control.ColorMixer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColorMixer__<br/>extends [Control](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Control.html)
</span>


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| ColorMixer() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                          | Method                                                                                                                                                   | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> | [leftColorProperty](#leftcolorproperty)()                                                                                                                |             |
| public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                         | [getLeftColor](#getleftcolor)()                                                                                                                          |             |
| public final void                                                                                                                                                                                                                                                          | [setLeftColor](#setleftcolor)([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) c)   |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> | [mixedColorProperty](#mixedcolorproperty)()                                                                                                              |             |
| public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                         | [getMixedColor](#getmixedcolor)()                                                                                                                        |             |
| public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> | [rightColorProperty](#rightcolorproperty)()                                                                                                              |             |
| public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)                                                                                                                                         | [getRightColor](#getrightcolor)()                                                                                                                        |             |
| public final void                                                                                                                                                                                                                                                          | [setRightColor](#setrightcolor)([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) c) |             |
| public final [DoubleProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/DoubleProperty.html)                                                                                                                        | [lerpProperty](#lerpproperty)()                                                                                                                          |             |
| public final double                                                                                                                                                                                                                                                        | [getLerp](#getlerp)()                                                                                                                                    |             |
| public final void                                                                                                                                                                                                                                                          | [setLerp](#setlerp)(double c)                                                                                                                            |             |
| protected [Skin](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Skin.html)<[ColorMixer](ColorMixer.md)>                                                                                                               | [createDefaultSkin](#createdefaultskin)()                                                                                                                |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                        | [getUserAgentStylesheet](#getuseragentstylesheet)()                                                                                                      |             |
| public static java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?>                                                                                    | [getClassCssMetaData](#getclasscssmetadata)()                                                                                                            |             |
| public java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?>                                                                                           | [getControlCssMetaData](#getcontrolcssmetadata)()                                                                                                        |             |



## Method Details

### leftColorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> __leftColorProperty__()</span>




---

### getLeftColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) __getLeftColor__()</span>




---

### setLeftColor

<span style="font-family: monospace; font-size: 80%;">public final void __setLeftColor__([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) c)</span>




---

### mixedColorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> __mixedColorProperty__()</span>




---

### getMixedColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) __getMixedColor__()</span>




---

### rightColorProperty

<span style="font-family: monospace; font-size: 80%;">public final [ObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/ObjectProperty.html)<[Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html)> __rightColorProperty__()</span>




---

### getRightColor

<span style="font-family: monospace; font-size: 80%;">public final [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) __getRightColor__()</span>




---

### setRightColor

<span style="font-family: monospace; font-size: 80%;">public final void __setRightColor__([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) c)</span>




---

### lerpProperty

<span style="font-family: monospace; font-size: 80%;">public final [DoubleProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/DoubleProperty.html) __lerpProperty__()</span>




---

### getLerp

<span style="font-family: monospace; font-size: 80%;">public final double __getLerp__()</span>




---

### setLerp

<span style="font-family: monospace; font-size: 80%;">public final void __setLerp__(double c)</span>




---

### createDefaultSkin

<span style="font-family: monospace; font-size: 80%;">protected [Skin](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.controls/javafx/scene/control/Skin.html)<[ColorMixer](ColorMixer.md)> __createDefaultSkin__()</span>




---

### getUserAgentStylesheet

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUserAgentStylesheet__()</span>




---

### getClassCssMetaData

<span style="font-family: monospace; font-size: 80%;">public static java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?> __getClassCssMetaData__()</span>




---

### getControlCssMetaData

<span style="font-family: monospace; font-size: 80%;">public java.util.List<javafx.css.CssMetaData<? extends [Styleable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/css/Styleable.html), ?> __getControlCssMetaData__()</span>




---

