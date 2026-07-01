Package [io.github.qishr.cascara.ui.color](index.md)

# Class ColorUtil
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.color.ColorUtil<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColorUtil__</span>


## Method Summary

| Modifier and Type                                                                                                                   | Method                                                                                                                                                                                                                                                                              | Description |
|-------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                          | [toRGBHexCode](#torgbhexcode)([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color)                                                                                                                          |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                          | [toRGBHexCode](#torgbhexcode)([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color, double alpha)                                                                                                            |             |
| public static [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) | [toColor](#tocolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hex)                                                                                                                                                               |             |
| public static [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) | [lerp](#lerp)([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color1, [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color2, double t) |             |
| public static void                                                                                                                  | [processColor](#processcolor)([ColorDefinition](ColorDefinition.md) color, [Variation](../theme/Variation.md) variation)                                                                                                                                                            |             |



## Method Details

### toRGBHexCode

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRGBHexCode__([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color)</span>




---

### toRGBHexCode

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRGBHexCode__([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color, double alpha)</span>




---

### toColor

<span style="font-family: monospace; font-size: 80%;">public static [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) __toColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hex)</span>



**Throws:**

[ColorException](ColorException.md)


---

### lerp

<span style="font-family: monospace; font-size: 80%;">public static [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) __lerp__([Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color1, [Color](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/paint/Color.html) color2, double t)</span>




---

### processColor

<span style="font-family: monospace; font-size: 80%;">public static void __processColor__([ColorDefinition](ColorDefinition.md) color, [Variation](../theme/Variation.md) variation)</span>



**Throws:**

[ColorException](ColorException.md)


---

