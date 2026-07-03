Package [io.github.qishr.cascara.ui.color](index.md)

# Class ColorDefinition
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.color.ColorDefinition<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ColorDefinition__</span>


## Field Summary

| Modifier and Type              | Field                       | Description |
|--------------------------------|-----------------------------|-------------|
| public static final DataFormat | [DATA_FORMAT](#data_format) |             |



## Constructor Summary

| Constructor                                                                                                            | Description                                                                          |
|------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| ColorDefinition()                                                                                                      | Creates a new ColorDefinition with a unique ID and placeholder name.                 |
| ColorDefinition([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor) | Creates a new ColorDefinition with a unique ID, placeholder name, and hex color code |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                            | Description                                                                          |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getId](#getid)()                                                                                                                                                 | Gets the unique ID of this color definition.                                         |
| public void                                                                                         | [setId](#setid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                  | Sets the unique ID of this color definition.                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLerp](#getlerp)()                                                                                                                                             | Gets the linear interpolation (lerp) value (usually 0.0 to 1.0) used for mixing.     |
| public void                                                                                         | [setLerp](#setlerp)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lerp)                                            | Sets the linear interpolation (lerp) value.                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getName](#getname)()                                                                                                                                             | Gets the user-assigned name of the definition.                                       |
| public void                                                                                         | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                            | Sets the user-assigned name of the definition.                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getHexColor](#gethexcolor)()                                                                                                                                     | Gets the final 6 or 8 digit hex color string.                                        |
| public void                                                                                         | [setHexColor](#sethexcolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                                | Sets the final 6 or 8 digit hex color string.                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getLeftHexColor](#getlefthexcolor)()                                                                                                                             | Gets the hex representation of the left color input for a transform/lerp operation.  |
| public void                                                                                         | [setLeftHexColor](#setlefthexcolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                        | Sets the hex representation of the left color input for a transform/lerp operation.  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getRightHexColor](#getrighthexcolor)()                                                                                                                           | Gets the hex representation of the right color input for a transform/lerp operation. |
| public void                                                                                         | [setRightHexColor](#setrighthexcolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                      | Sets the hex representation of the right color input for a transform/lerp operation. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getPaletteColorId](#getpalettecolorid)()                                                                                                                         | Gets the ID of the palette color this definition refers to.                          |
| public void                                                                                         | [setPaletteColorId](#setpalettecolorid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                          | Sets the ID of the palette color this definition refers to.                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getTransformId](#gettransformid)()                                                                                                                               | Gets the ID of the transform function to be used.                                    |
| public void                                                                                         | [setTransformId](#settransformid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transform)                         | Sets the ID of the transform function to be used.                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getBaseColorId](#getbasecolorid)()                                                                                                                               | Gets the ID of the base color this definition inherits from or uses as input.        |
| public void                                                                                         | [setBaseColorId](#setbasecolorid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                | Sets the ID of the base color this definition inherits from or uses as input.        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getTransformDefinition](#gettransformdefinition)()                                                                                                               | Gets the string representation of a custom transform function.                       |
| public void                                                                                         | [setTransformDefinition](#settransformdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transformFunction) | Sets the string representation of a custom transform function.                       |
| public [ColorDefinition](ColorDefinition.md)                                                        | [duplicate](#duplicate)()                                                                                                                                         | Creates a deep copy of the color definition state, assigning a new unique ID.        |
| public boolean                                                                                      | [isBlank](#isblank)()                                                                                                                                             | Checks if the primary hex color field is blank.                                      |
| public boolean                                                                                      | [usesTransform](#usestransform)()                                                                                                                                 | Checks if a transform function ID is defined.                                        |
| public boolean                                                                                      | [usesPaletteColor](#usespalettecolor)()                                                                                                                           | Checks if the color is defined by a palette color ID.                                |
| public boolean                                                                                      | [usesBaseColor](#usesbasecolor)()                                                                                                                                 | Checks if a base color ID is defined.                                                |
| public boolean                                                                                      | [usesLerp](#useslerp)()                                                                                                                                           | Checks if a lerp value is defined, indicating color mixing.                          |
| public boolean                                                                                      | [isEmpty](#isempty)()                                                                                                                                             | Checks if the definition fields that control the color are all empty.                |



## Field Details

### DATA_FORMAT

<span style="font-family: monospace; font-size: 80%;">public static final DataFormat __DATA_FORMAT__</span>




---


## Method Details

### getId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getId__()</span>

Gets the unique ID of this color definition.


---

### setId

<span style="font-family: monospace; font-size: 80%;">public void __setId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>

Sets the unique ID of this color definition.

**Parameters:**

`id` - The ID string.


---

### getLerp

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLerp__()</span>

Gets the linear interpolation (lerp) value (usually 0.0 to 1.0) used for mixing.


---

### setLerp

<span style="font-family: monospace; font-size: 80%;">public void __setLerp__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lerp)</span>

Sets the linear interpolation (lerp) value.

**Parameters:**

`lerp` - The lerp value string.


---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>

Gets the user-assigned name of the definition.


---

### setName

<span style="font-family: monospace; font-size: 80%;">public void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Sets the user-assigned name of the definition.

**Parameters:**

`name` - The name string.


---

### getHexColor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getHexColor__()</span>

Gets the final 6 or 8 digit hex color string.


---

### setHexColor

<span style="font-family: monospace; font-size: 80%;">public void __setHexColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>

Sets the final 6 or 8 digit hex color string.

**Parameters:**

`hexColor` - The hex color string.


---

### getLeftHexColor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLeftHexColor__()</span>

Gets the hex representation of the left color input for a transform/lerp operation.


---

### setLeftHexColor

<span style="font-family: monospace; font-size: 80%;">public void __setLeftHexColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>

Sets the hex representation of the left color input for a transform/lerp operation.

**Parameters:**

`hexColor` - The hex color string.


---

### getRightHexColor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getRightHexColor__()</span>

Gets the hex representation of the right color input for a transform/lerp operation.


---

### setRightHexColor

<span style="font-family: monospace; font-size: 80%;">public void __setRightHexColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>

Sets the hex representation of the right color input for a transform/lerp operation.

**Parameters:**

`hexColor` - The hex color string.


---

### getPaletteColorId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPaletteColorId__()</span>

Gets the ID of the palette color this definition refers to.


---

### setPaletteColorId

<span style="font-family: monospace; font-size: 80%;">public void __setPaletteColorId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>

Sets the ID of the palette color this definition refers to.

**Parameters:**

`id` - The palette color ID string.


---

### getTransformId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTransformId__()</span>

Gets the ID of the transform function to be used.


---

### setTransformId

<span style="font-family: monospace; font-size: 80%;">public void __setTransformId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transform)</span>

Sets the ID of the transform function to be used.

**Parameters:**

`transform` - The transform ID string.


---

### getBaseColorId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getBaseColorId__()</span>

Gets the ID of the base color this definition inherits from or uses as input.


---

### setBaseColorId

<span style="font-family: monospace; font-size: 80%;">public void __setBaseColorId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>

Sets the ID of the base color this definition inherits from or uses as input.

**Parameters:**

`id` - The base color ID string.


---

### getTransformDefinition

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTransformDefinition__()</span>

Gets the string representation of a custom transform function.


---

### setTransformDefinition

<span style="font-family: monospace; font-size: 80%;">public void __setTransformDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transformFunction)</span>

Sets the string representation of a custom transform function.

**Parameters:**

`transformFunction` - The transform function string.


---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [ColorDefinition](ColorDefinition.md) __duplicate__()</span>

Creates a deep copy of the color definition state, assigning a new unique ID.

**Returns:**

A new ColorDefinition instance with copied state.


---

### isBlank

<span style="font-family: monospace; font-size: 80%;">public boolean __isBlank__()</span>

Checks if the primary hex color field is blank.

**Returns:**

true if hexColor is null or contains only whitespace.


---

### usesTransform

<span style="font-family: monospace; font-size: 80%;">public boolean __usesTransform__()</span>

Checks if a transform function ID is defined.


---

### usesPaletteColor

<span style="font-family: monospace; font-size: 80%;">public boolean __usesPaletteColor__()</span>

Checks if the color is defined by a palette color ID.


---

### usesBaseColor

<span style="font-family: monospace; font-size: 80%;">public boolean __usesBaseColor__()</span>

Checks if a base color ID is defined.


---

### usesLerp

<span style="font-family: monospace; font-size: 80%;">public boolean __usesLerp__()</span>

Checks if a lerp value is defined, indicating color mixing.


---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>

Checks if the definition fields that control the color are all empty.NOTE: This does not check name or ID.


---

