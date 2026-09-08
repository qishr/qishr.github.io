Package [io.github.qishr.cascara.common.color](index.md)

# Class HsbaColor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.color.HsbaColor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ColorPrimitive](ColorPrimitive.md), [Duplicable](../util/Duplicable.md)<[HsbaColor](HsbaColor.md)>


----

<span style="font-family: monospace; font-size: 80%;">public final class __HsbaColor__</span>


## Field Summary

| Modifier and Type | Field                     | Description |
|-------------------|---------------------------|-------------|
| public double     | [alpha](#alpha)           |             |
| public double     | [brightness](#brightness) |             |
| public double     | [hue](#hue)               |             |
| public double     | [saturation](#saturation) |             |



## Constructor Summary

| Constructor                                                               | Description |
|---------------------------------------------------------------------------|-------------|
| HsbaColor(double hue, double saturation, double brightness, double alpha) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                               | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                              |             |
| public double                                                                                       | [getHue](#gethue)()                                                                                                  |             |
| public double                                                                                       | [getSaturation](#getsaturation)()                                                                                    |             |
| public double                                                                                       | [getBrightness](#getbrightness)()                                                                                    |             |
| public double                                                                                       | [getAlpha](#getalpha)()                                                                                              |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [setHue](#sethue)(double hue)                                                                                        |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [setSaturation](#setsaturation)(double saturation)                                                                   |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [setBrightness](#setbrightness)(double brightness)                                                                   |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [setAlpha](#setalpha)(double alpha)                                                                                  |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [brighter](#brighter)()                                                                                              |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [saturate](#saturate)()                                                                                              |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [deriveColor](#derivecolor)(double hueShift, double saturationFactor, double brightnessFactor, double opacityFactor) |             |
| public [HsbaColor](HsbaColor.md)                                                                    | [duplicate](#duplicate)()                                                                                            |             |



## Field Details

### alpha

<span style="font-family: monospace; font-size: 80%;">public double __alpha__</span>




---

### brightness

<span style="font-family: monospace; font-size: 80%;">public double __brightness__</span>




---

### hue

<span style="font-family: monospace; font-size: 80%;">public double __hue__</span>




---

### saturation

<span style="font-family: monospace; font-size: 80%;">public double __saturation__</span>




---


## Method Details

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Specified By:**

[ColorPrimitive](ColorPrimitive.md)


---

### getHue

<span style="font-family: monospace; font-size: 80%;">public double __getHue__()</span>




---

### getSaturation

<span style="font-family: monospace; font-size: 80%;">public double __getSaturation__()</span>




---

### getBrightness

<span style="font-family: monospace; font-size: 80%;">public double __getBrightness__()</span>




---

### getAlpha

<span style="font-family: monospace; font-size: 80%;">public double __getAlpha__()</span>



**Specified By:**

[ColorPrimitive](ColorPrimitive.md)


---

### setHue

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __setHue__(double hue)</span>




---

### setSaturation

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __setSaturation__(double saturation)</span>




---

### setBrightness

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __setBrightness__(double brightness)</span>




---

### setAlpha

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __setAlpha__(double alpha)</span>



**Specified By:**

[ColorPrimitive](ColorPrimitive.md)


---

### brighter

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __brighter__()</span>



**Specified By:**

[ColorPrimitive](ColorPrimitive.md)


---

### saturate

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __saturate__()</span>



**Specified By:**

[ColorPrimitive](ColorPrimitive.md)


---

### deriveColor

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __deriveColor__(double hueShift, double saturationFactor, double brightnessFactor, double opacityFactor)</span>



**Specified By:**

[ColorPrimitive](ColorPrimitive.md)


---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [HsbaColor](HsbaColor.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../util/Duplicable.md)


---

