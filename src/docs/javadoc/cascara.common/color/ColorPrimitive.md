Package [io.github.qishr.cascara.common.color](index.md)

# Interface ColorPrimitive
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.color.ColorPrimitive<br/>
<br/>
All Known Implementing Classes:<br/>
    [HsbaColor](HsbaColor.md), [RgbaColor](RgbaColor.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ColorPrimitive__</span>


## Field Summary

| Modifier and Type          | Field                                   | Description |
|----------------------------|-----------------------------------------|-------------|
| public static final double | [BRIGHTNESS_FACTOR](#brightness_factor) |             |
| public static final double | [SATURATION_FACTOR](#saturation_factor) |             |



## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                               | Description |
|--------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                              |             |
| public abstract double                                                                                       | [getAlpha](#getalpha)()                                                                                              |             |
| public abstract [ColorPrimitive](ColorPrimitive.md)                                                          | [setAlpha](#setalpha)(double alpha)                                                                                  |             |
| public abstract [ColorPrimitive](ColorPrimitive.md)                                                          | [brighter](#brighter)()                                                                                              |             |
| public abstract [ColorPrimitive](ColorPrimitive.md)                                                          | [saturate](#saturate)()                                                                                              |             |
| public abstract [ColorPrimitive](ColorPrimitive.md)                                                          | [deriveColor](#derivecolor)(double hueShift, double saturationFactor, double brightnessFactor, double opacityFactor) |             |



## Field Details

### BRIGHTNESS_FACTOR

<span style="font-family: monospace; font-size: 80%;">public static final double __BRIGHTNESS_FACTOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### SATURATION_FACTOR

<span style="font-family: monospace; font-size: 80%;">public static final double __SATURATION_FACTOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### toString

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

### getAlpha

<span style="font-family: monospace; font-size: 80%;">public abstract double __getAlpha__()</span>




---

### setAlpha

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorPrimitive](ColorPrimitive.md) __setAlpha__(double alpha)</span>




---

### brighter

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorPrimitive](ColorPrimitive.md) __brighter__()</span>




---

### saturate

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorPrimitive](ColorPrimitive.md) __saturate__()</span>




---

### deriveColor

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorPrimitive](ColorPrimitive.md) __deriveColor__(double hueShift, double saturationFactor, double brightnessFactor, double opacityFactor)</span>




---

