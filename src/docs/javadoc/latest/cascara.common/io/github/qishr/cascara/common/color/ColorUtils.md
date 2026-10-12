Package [io.github.qishr.cascara.common.color](index.md)

# Class ColorUtils
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.color.ColorUtils<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColorUtils__</span>


## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Description                                                                                                       |
|------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbHex](#torgbhex)([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                                                   |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbaHex](#torgbahex)([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                                                   |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbHex](#torgbhex)([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                                                   |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbaHex](#torgbahex)([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                                                   |
| public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [toRgbaColor](#torgbacolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |                                                                                                                   |
| public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md)             | [toHsbaColor](#tohsbacolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |                                                                                                                   |
| public static [ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md)   | [toColor](#tocolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                                                   |
| public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [toRgbaColor](#torgbacolor)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                                                   |
| public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md)             | [toHsbaColor](#tohsbacolor)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                                                   |
| public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md)             | [toHsbaColor](#tohsbacolor)([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                                                   |
| public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [toRgbaColor](#torgbacolor)([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                                                   |
| public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [toRgbaColor](#torgbacolor)(double hue, double saturation, double brightness, double alpha)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                                                                   |
| public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md)             | [toHsbaColor](#tohsbacolor)(double r, double g, double b, double alpha)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                                                   |
| public static double                                                                                       | [relativeLuminance](#relativeluminance)([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Gets the relative luminance of an RGB color, this is useful in determining the contrast ratio between two colors. |
| public static double                                                                                       | [contrastRatio](#contrastratio)(double luminance1, double luminance2)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |                                                                                                                   |
| public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [lerp](#lerp)([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) a, [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) b, double t)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | RGB interpolation                                                                                                 |
| public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md)             | [lerp](#lerp)([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) a, [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) b, double t)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Hue interpolation                                                                                                 |
| public static void                                                                                         | [processColor](#processcolor)([ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                                                   |
| public static void                                                                                         | [processColor](#processcolor)([ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md) color, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md)> baseColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md)> paletteColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md)> transforms) |                                                                                                                   |
| public static void                                                                                         | [copy](#copy)([ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md) from, [ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md) to)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                                                                                                   |



## Method Details

### toRgbHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbHex__([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)</span>




---

### toRgbaHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbaHex__([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)</span>




---

### toRgbHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbHex__([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) color)</span>




---

### toRgbaHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbaHex__([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) color)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __toRgbaColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) __toHsbaColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)</span>




---

### toColor

<span style="font-family: monospace; font-size: 80%;">public static [ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md) __toColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __toRgbaColor__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) __toHsbaColor__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) __toHsbaColor__([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __toRgbaColor__([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) color)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __toRgbaColor__(double hue, double saturation, double brightness, double alpha)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) __toHsbaColor__(double r, double g, double b, double alpha)</span>




---

### relativeLuminance

<span style="font-family: monospace; font-size: 80%;">public static double __relativeLuminance__([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) color)</span>

Gets the relative luminance of an RGB color, this is useful in determining the contrast ratio
between two colors.

**Parameters:**

`color` - The color.


---

### contrastRatio

<span style="font-family: monospace; font-size: 80%;">public static double __contrastRatio__(double luminance1, double luminance2)</span>




---

### lerp

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __lerp__([RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) a, [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) b, double t)</span>

RGB interpolation


---

### lerp

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) __lerp__([HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) a, [HsbaColor](../../../../../../io/github/qishr/cascara/common/color/HsbaColor.md) b, double t)</span>

Hue interpolation


---

### processColor

<span style="font-family: monospace; font-size: 80%;">public static void __processColor__([ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md) color)</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/common/color/ColorException.md)


---

### processColor

<span style="font-family: monospace; font-size: 80%;">public static void __processColor__([ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md) color, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md)> baseColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md)> paletteColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/common/color/ColorDefinition.md)> transforms)</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/common/color/ColorException.md)


---

### copy

<span style="font-family: monospace; font-size: 80%;">public static void __copy__([ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md) from, [ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md) to)</span>




---

