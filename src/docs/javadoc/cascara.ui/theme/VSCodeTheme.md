Package [io.github.qishr.cascara.ui.theme](index.md)

# Class VSCodeTheme
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.theme.VSCodeTheme<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __VSCodeTheme__</span>


## Constructor Summary

| Constructor                                                                                                          | Description |
|----------------------------------------------------------------------------------------------------------------------|-------------|
| VSCodeTheme()                                                                                                        |             |
| VSCodeTheme([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jsonString) |             |



## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                                                                                                                                                                                  | Description                                      |
|------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getVscodeId](#getvscodeid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                          |                                                  |
| public [ThemeVariation](ThemeVariation.md)                                                                 | [getVariation](#getvariation)()                                                                                                                                                                                                                                                                                                                                                         |                                                  |
| public static [CodeTokenCategory](CodeTokenCategory.md)                                                    | [getTokenCategory](#gettokencategory)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CodeTokenCategory](CodeTokenCategory.md)> cats)                                                                                                      |                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getDefaultTextColor](#getdefaulttextcolor)()                                                                                                                                                                                                                                                                                                                                           |                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getUiColor](#getuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                            |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getUiColor](#getuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Properties](../../cascara.common/util/Properties.md) colors)                                                                                                                                                                                              |                                                  |
| public void                                                                                                | [load](#load)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jsonString)                                                                                                                                                                                                                                                                  |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getVariationJson](#getvariationjson)([Variation](Variation.md) variation)                                                                                                                                                                                                                                                                                                              |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getTextResource](#gettextresource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)                                                                                                                                                                                                                                          |                                                  |
| public static void                                                                                         | [populateMissingColorGroups](#populatemissingcolorgroups)([ThemeVariation](ThemeVariation.md) variation)                                                                                                                                                                                                                                                                                | Fills in missing palette colors in the variation |
| public static void                                                                                         | [populateMissingColorNames](#populatemissingcolornames)([ThemeVariation](ThemeVariation.md) variation)                                                                                                                                                                                                                                                                                  |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFallbackUiColor](#getfallbackuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> colors) |                                                  |



## Method Details

### getVscodeId

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getVscodeId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getVariation

<span style="font-family: monospace; font-size: 80%;">public [ThemeVariation](ThemeVariation.md) __getVariation__()</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### getTokenCategory

<span style="font-family: monospace; font-size: 80%;">public static [CodeTokenCategory](CodeTokenCategory.md) __getTokenCategory__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CodeTokenCategory](CodeTokenCategory.md)> cats)</span>




---

### getDefaultTextColor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDefaultTextColor__()</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### getUiColor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### getUiColor

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Properties](../../cascara.common/util/Properties.md) colors)</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### load

<span style="font-family: monospace; font-size: 80%;">public void __load__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jsonString)</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### getVariationJson

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getVariationJson__([Variation](Variation.md) variation)</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### getTextResource

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTextResource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### populateMissingColorGroups

<span style="font-family: monospace; font-size: 80%;">public static void __populateMissingColorGroups__([ThemeVariation](ThemeVariation.md) variation)</span>

Fills in missing palette colors in the variation


---

### populateMissingColorNames

<span style="font-family: monospace; font-size: 80%;">public static void __populateMissingColorNames__([ThemeVariation](ThemeVariation.md) variation)</span>




---

### getFallbackUiColor

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFallbackUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> colors)</span>




---

