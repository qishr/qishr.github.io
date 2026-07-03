Package [io.github.qishr.cascara.ui.theme](index.md)

# Class ThemeVariation
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.theme.ThemeVariation<br/>
<br/>
All Implemented Interfaces:<br/>
    [Variation](Variation.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __ThemeVariation__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                      | Description |
|-------------------|--------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.ui.theme.ThemeVariation.ColorGroup](ThemeVariation.ColorGroup.md) |             |



## Field Summary

| Modifier and Type                                                                                                | Field                                               | Description |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [GROUP_ID_BASE_COLORS](#group_id_base_colors)       |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [GROUP_ID_CODE_COLORS](#group_id_code_colors)       |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [GROUP_ID_PALETTE_COLORS](#group_id_palette_colors) |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [GROUP_ID_TRANSFORMS](#group_id_transforms)         |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [GROUP_ID_UI_COLORS](#group_id_ui_colors)           |             |



## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| ThemeVariation() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                           | Method                                                                                                                                                                                                                                                     | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getOptionId](#getoptionid)()                                                                                                                                                                                                                              |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getOptionText](#getoptiontext)()                                                                                                                                                                                                                          |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getOptionTranslationKey](#getoptiontranslationkey)()                                                                                                                                                                                                      |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getName](#getname)()                                                                                                                                                                                                                                      |             |
| public void                                                                                                                                                                                                                                 | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getPath](#getpath)()                                                                                                                                                                                                                                      |             |
| public void                                                                                                                                                                                                                                 | [setPath](#setpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)                                                                                                                                     |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getBaseColors](#getbasecolors)()                                                                                                                                                                                                                          |             |
| public [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getBaseColor](#getbasecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                             |             |
| public void                                                                                                                                                                                                                                 | [setBaseColor](#setbasecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                      |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getTransformDefinitions](#gettransformdefinitions)()                                                                                                                                                                                                      |             |
| public [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getTransformDefinition](#gettransformdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                         |             |
| public void                                                                                                                                                                                                                                 | [setTransformDefinition](#settransformdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transform) |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getPaletteColors](#getpalettecolors)()                                                                                                                                                                                                                    |             |
| public [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getPaletteColor](#getpalettecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                       |             |
| public void                                                                                                                                                                                                                                 | [setPaletteColor](#setpalettecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [ColorDefinition](../color/ColorDefinition.md) definition)                                                            |             |
| public void                                                                                                                                                                                                                                 | [setPaletteColor](#setpalettecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getUiColors](#getuicolors)()                                                                                                                                                                                                                              |             |
| public [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getUiColor](#getuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                                 |             |
| public void                                                                                                                                                                                                                                 | [setUiColor](#setuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                          |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getCodeColors](#getcodecolors)()                                                                                                                                                                                                                          |             |
| public [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getCodeColor](#getcodecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                             |             |
| public void                                                                                                                                                                                                                                 | [setCodeColor](#setcodecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                      |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getGroup](#getgroup)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) groupId)                                                                                                                                |             |
| public final [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)                                                                                       | [modifiedProperty](#modifiedproperty)()                                                                                                                                                                                                                    |             |
| public final [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)                                                                                                                                 | [getModified](#getmodified)()                                                                                                                                                                                                                              |             |
| public final void                                                                                                                                                                                                                           | [setModified](#setmodified)([Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) v)                                                                                                                              |             |



## Field Details

### GROUP_ID_BASE_COLORS

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __GROUP_ID_BASE_COLORS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### GROUP_ID_CODE_COLORS

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __GROUP_ID_CODE_COLORS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### GROUP_ID_PALETTE_COLORS

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __GROUP_ID_PALETTE_COLORS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### GROUP_ID_TRANSFORMS

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __GROUP_ID_TRANSFORMS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### GROUP_ID_UI_COLORS

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __GROUP_ID_UI_COLORS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### getOptionId

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOptionId__()</span>




---

### getOptionText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOptionText__()</span>




---

### getOptionTranslationKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOptionTranslationKey__()</span>




---

### getName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>



**Specified By:**

[Variation](Variation.md)


---

### setName

<span style="font-family: monospace; font-size: 80%;">public void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Specified By:**

[Variation](Variation.md)


---

### getPath

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPath__()</span>



**Specified By:**

[Variation](Variation.md)


---

### setPath

<span style="font-family: monospace; font-size: 80%;">public void __setPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>



**Specified By:**

[Variation](Variation.md)


---

### getBaseColors

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getBaseColors__()</span>



**Specified By:**

[Variation](Variation.md)


---

### getBaseColor

<span style="font-family: monospace; font-size: 80%;">public [ColorDefinition](../color/ColorDefinition.md) __getBaseColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>



**Specified By:**

[Variation](Variation.md)


---

### setBaseColor

<span style="font-family: monospace; font-size: 80%;">public void __setBaseColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>



**Specified By:**

[Variation](Variation.md)


---

### getTransformDefinitions

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getTransformDefinitions__()</span>



**Specified By:**

[Variation](Variation.md)


---

### getTransformDefinition

<span style="font-family: monospace; font-size: 80%;">public [ColorDefinition](../color/ColorDefinition.md) __getTransformDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>



**Specified By:**

[Variation](Variation.md)


---

### setTransformDefinition

<span style="font-family: monospace; font-size: 80%;">public void __setTransformDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transform)</span>



**Specified By:**

[Variation](Variation.md)


---

### getPaletteColors

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getPaletteColors__()</span>



**Specified By:**

[Variation](Variation.md)


---

### getPaletteColor

<span style="font-family: monospace; font-size: 80%;">public [ColorDefinition](../color/ColorDefinition.md) __getPaletteColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>



**Specified By:**

[Variation](Variation.md)


---

### setPaletteColor

<span style="font-family: monospace; font-size: 80%;">public void __setPaletteColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [ColorDefinition](../color/ColorDefinition.md) definition)</span>



**Specified By:**

[Variation](Variation.md)


---

### setPaletteColor

<span style="font-family: monospace; font-size: 80%;">public void __setPaletteColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>



**Specified By:**

[Variation](Variation.md)


---

### getUiColors

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getUiColors__()</span>



**Specified By:**

[Variation](Variation.md)


---

### getUiColor

<span style="font-family: monospace; font-size: 80%;">public [ColorDefinition](../color/ColorDefinition.md) __getUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>



**Specified By:**

[Variation](Variation.md)


---

### setUiColor

<span style="font-family: monospace; font-size: 80%;">public void __setUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>



**Specified By:**

[Variation](Variation.md)


---

### getCodeColors

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getCodeColors__()</span>



**Specified By:**

[Variation](Variation.md)


---

### getCodeColor

<span style="font-family: monospace; font-size: 80%;">public [ColorDefinition](../color/ColorDefinition.md) __getCodeColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>



**Specified By:**

[Variation](Variation.md)


---

### setCodeColor

<span style="font-family: monospace; font-size: 80%;">public void __setCodeColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>



**Specified By:**

[Variation](Variation.md)


---

### getGroup

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getGroup__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) groupId)</span>



**Specified By:**

[Variation](Variation.md)


---

### modifiedProperty

<span style="font-family: monospace; font-size: 80%;">public final [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __modifiedProperty__()</span>




---

### getModified

<span style="font-family: monospace; font-size: 80%;">public final [Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) __getModified__()</span>




---

### setModified

<span style="font-family: monospace; font-size: 80%;">public final void __setModified__([Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) v)</span>




---

