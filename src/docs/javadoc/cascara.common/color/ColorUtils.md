Package [io.github.qishr.cascara.common.color](index.md)

# Class ColorUtils
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.color.ColorUtils<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColorUtils__</span>


## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Description                                                                                                       |
|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbHex](#torgbhex)([RgbaColor](RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                                                   |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbaHex](#torgbahex)([RgbaColor](RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                                                   |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbHex](#torgbhex)([HsbaColor](HsbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                                                                   |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toRgbaHex](#torgbahex)([HsbaColor](HsbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                                                   |
| public static [RgbaColor](RgbaColor.md)                                                                    | [toRgbaColor](#torgbacolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                                                   |
| public static [HsbaColor](HsbaColor.md)                                                                    | [toHsbaColor](#tohsbacolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                                                   |
| public static [ColorPrimitive](ColorPrimitive.md)                                                          | [toColor](#tocolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                                                   |
| public static [RgbaColor](RgbaColor.md)                                                                    | [toRgbaColor](#torgbacolor)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                                                   |
| public static [HsbaColor](HsbaColor.md)                                                                    | [toHsbaColor](#tohsbacolor)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                                                   |
| public static [HsbaColor](HsbaColor.md)                                                                    | [toHsbaColor](#tohsbacolor)([RgbaColor](RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                                                   |
| public static [RgbaColor](RgbaColor.md)                                                                    | [toRgbaColor](#torgbacolor)([HsbaColor](HsbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                                                   |
| public static [RgbaColor](RgbaColor.md)                                                                    | [toRgbaColor](#torgbacolor)(double hue, double saturation, double brightness, double alpha)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                                                   |
| public static [HsbaColor](HsbaColor.md)                                                                    | [toHsbaColor](#tohsbacolor)(double r, double g, double b, double alpha)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                                                   |
| public static double                                                                                       | [relativeLuminance](#relativeluminance)([RgbaColor](RgbaColor.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Gets the relative luminance of an RGB color, this is useful in determining the contrast ratio between two colors. |
| public static double                                                                                       | [contrastRatio](#contrastratio)(double luminance1, double luminance2)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                                                                   |
| public static [RgbaColor](RgbaColor.md)                                                                    | [lerp](#lerp)([RgbaColor](RgbaColor.md) a, [RgbaColor](RgbaColor.md) b, double t)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | RGB interpolation                                                                                                 |
| public static [HsbaColor](HsbaColor.md)                                                                    | [lerp](#lerp)([HsbaColor](HsbaColor.md) a, [HsbaColor](HsbaColor.md) b, double t)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Hue interpolation                                                                                                 |
| public static void                                                                                         | [processColor](#processcolor)([ColorDefinition](ColorDefinition.md) color)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                                                   |
| public static void                                                                                         | [processColor](#processcolor)([ColorDefinition](ColorDefinition.md) color, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](ColorDefinition.md)> baseColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](ColorDefinition.md)> paletteColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](ColorDefinition.md)> transforms) |                                                                                                                   |
| public static void                                                                                         | [copy](#copy)([ColorPrimitive](ColorPrimitive.md) from, [ColorPrimitive](ColorPrimitive.md) to)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                                                                   |



## Method Details

### toRgbHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbHex__([RgbaColor](RgbaColor.md) color)</span>




---

### toRgbaHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbaHex__([RgbaColor](RgbaColor.md) color)</span>




---

### toRgbHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbHex__([HsbaColor](HsbaColor.md) color)</span>




---

### toRgbaHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toRgbaHex__([HsbaColor](HsbaColor.md) color)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](RgbaColor.md) __toRgbaColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](HsbaColor.md) __toHsbaColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)</span>




---

### toColor

<span style="font-family: monospace; font-size: 80%;">public static [ColorPrimitive](ColorPrimitive.md) __toColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorString)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](RgbaColor.md) __toRgbaColor__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](HsbaColor.md) __toHsbaColor__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> components)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](HsbaColor.md) __toHsbaColor__([RgbaColor](RgbaColor.md) color)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](RgbaColor.md) __toRgbaColor__([HsbaColor](HsbaColor.md) color)</span>




---

### toRgbaColor

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](RgbaColor.md) __toRgbaColor__(double hue, double saturation, double brightness, double alpha)</span>




---

### toHsbaColor

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](HsbaColor.md) __toHsbaColor__(double r, double g, double b, double alpha)</span>




---

### relativeLuminance

<span style="font-family: monospace; font-size: 80%;">public static double __relativeLuminance__([RgbaColor](RgbaColor.md) color)</span>

Gets the relative luminance of an RGB color, this is useful in determining the contrast ratio
between two colors.

**Parameters:**

`color` - The color.


---

### contrastRatio

<span style="font-family: monospace; font-size: 80%;">public static double __contrastRatio__(double luminance1, double luminance2)</span>




---

### lerp

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](RgbaColor.md) __lerp__([RgbaColor](RgbaColor.md) a, [RgbaColor](RgbaColor.md) b, double t)</span>

RGB interpolation


---

### lerp

<span style="font-family: monospace; font-size: 80%;">public static [HsbaColor](HsbaColor.md) __lerp__([HsbaColor](HsbaColor.md) a, [HsbaColor](HsbaColor.md) b, double t)</span>

Hue interpolation


---

### processColor

<span style="font-family: monospace; font-size: 80%;">public static void __processColor__([ColorDefinition](ColorDefinition.md) color)</span>



**Throws:**

[ColorException](ColorException.md)


---

### processColor

<span style="font-family: monospace; font-size: 80%;">public static void __processColor__([ColorDefinition](ColorDefinition.md) color, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](ColorDefinition.md)> baseColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](ColorDefinition.md)> paletteColors, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](ColorDefinition.md)> transforms)</span>



**Throws:**

[ColorException](ColorException.md)


---

### copy

<span style="font-family: monospace; font-size: 80%;">public static void __copy__([ColorPrimitive](ColorPrimitive.md) from, [ColorPrimitive](ColorPrimitive.md) to)</span>




---

