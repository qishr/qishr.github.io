Package [io.github.qishr.cascara.common.color](index.md)

# Class RgbaColor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.color.RgbaColor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md), [Duplicable](../../../../../../io/github/qishr/cascara/common/util/Duplicable.md)<[RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __RgbaColor__</span>


## Field Summary

| Modifier and Type | Field           | Description |
|-------------------|-----------------|-------------|
| public double     | [alpha](#alpha) |             |
| public double     | [blue](#blue)   |             |
| public double     | [green](#green) |             |
| public double     | [red](#red)     |             |



## Constructor Summary

| Constructor                                                    | Description |
|----------------------------------------------------------------|-------------|
| RgbaColor(double red, double green, double blue, double alpha) |             |
| RgbaColor(int red, int green, int blue, double alpha)          |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)      | [from](#from)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)               |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [setHexColor](#sethexcolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                            |             |
| public double                                                                                       | [getRed](#getred)()                                                                                                                |             |
| public double                                                                                       | [getGreen](#getgreen)()                                                                                                            |             |
| public double                                                                                       | [getBlue](#getblue)()                                                                                                              |             |
| public double                                                                                       | [getAlpha](#getalpha)()                                                                                                            |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [setRed](#setred)(double red)                                                                                                      |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [setGreen](#setgreen)(double green)                                                                                                |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [setBlue](#setblue)(double blue)                                                                                                   |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [setAlpha](#setalpha)(double alpha)                                                                                                |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [brighter](#brighter)()                                                                                                            |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [saturate](#saturate)()                                                                                                            |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [deriveColor](#derivecolor)(double hueShift, double saturationFactor, double brightnessFactor, double opacityFactor)               |             |
| public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md)             | [duplicate](#duplicate)()                                                                                                          |             |



## Field Details

### alpha

<span style="font-family: monospace; font-size: 80%;">public double __alpha__</span>




---

### blue

<span style="font-family: monospace; font-size: 80%;">public double __blue__</span>




---

### green

<span style="font-family: monospace; font-size: 80%;">public double __green__</span>




---

### red

<span style="font-family: monospace; font-size: 80%;">public double __red__</span>




---


## Method Details

### from

<span style="font-family: monospace; font-size: 80%;">public static [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __from__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>




---

### setHexColor

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __setHexColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Specified By:**

[ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md)


---

### getRed

<span style="font-family: monospace; font-size: 80%;">public double __getRed__()</span>




---

### getGreen

<span style="font-family: monospace; font-size: 80%;">public double __getGreen__()</span>




---

### getBlue

<span style="font-family: monospace; font-size: 80%;">public double __getBlue__()</span>




---

### getAlpha

<span style="font-family: monospace; font-size: 80%;">public double __getAlpha__()</span>



**Specified By:**

[ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md)


---

### setRed

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __setRed__(double red)</span>




---

### setGreen

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __setGreen__(double green)</span>




---

### setBlue

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __setBlue__(double blue)</span>




---

### setAlpha

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __setAlpha__(double alpha)</span>



**Specified By:**

[ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md)


---

### brighter

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __brighter__()</span>



**Specified By:**

[ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md)


---

### saturate

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __saturate__()</span>



**Specified By:**

[ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md)


---

### deriveColor

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __deriveColor__(double hueShift, double saturationFactor, double brightnessFactor, double opacityFactor)</span>



**Specified By:**

[ColorPrimitive](../../../../../../io/github/qishr/cascara/common/color/ColorPrimitive.md)


---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [RgbaColor](../../../../../../io/github/qishr/cascara/common/color/RgbaColor.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../../../../../../io/github/qishr/cascara/common/util/Duplicable.md)


---

