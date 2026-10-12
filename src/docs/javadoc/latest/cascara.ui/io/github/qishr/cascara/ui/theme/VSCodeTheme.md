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

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                                                                                                                                                                                                                            | Description                                      |
|------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getVscodeId](#getvscodeid)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                    |                                                  |
| public [ThemeVariation](../../../../../../io/github/qishr/cascara/ui/theme/ThemeVariation.md)              | [getVariation](#getvariation)()                                                                                                                                                                                                                                                                                                                                                                                                   |                                                  |
| public static [CodeTokenCategory](../../../../../../io/github/qishr/cascara/ui/theme/CodeTokenCategory.md) | [getTokenCategory](#gettokencategory)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CodeTokenCategory](../../../../../../io/github/qishr/cascara/ui/theme/CodeTokenCategory.md)> cats)                                                                                             |                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getDefaultTextColor](#getdefaulttextcolor)()                                                                                                                                                                                                                                                                                                                                                                                     |                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [getUiColor](#getuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                                                                                                                                                                                      |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getUiColor](#getuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Properties](../../../../../../../cascara.common/io/github/qishr/cascara/common/property/Properties.md) colors)                                                                                                                                                                                      |                                                  |
| public void                                                                                                | [load](#load)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jsonString)                                                                                                                                                                                                                                                                                                            |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getVariationJson](#getvariationjson)([Variation](../../../../../../io/github/qishr/cascara/ui/theme/Variation.md) variation)                                                                                                                                                                                                                                                                                                     |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getTextResource](#gettextresource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)                                                                                                                                                                                                                                                                                    |                                                  |
| public static void                                                                                         | [populateMissingColorGroups](#populatemissingcolorgroups)([ThemeVariation](../../../../../../io/github/qishr/cascara/ui/theme/ThemeVariation.md) variation)                                                                                                                                                                                                                                                                       | Fills in missing palette colors in the variation |
| public static void                                                                                         | [populateMissingColorNames](#populatemissingcolornames)([ThemeVariation](../../../../../../io/github/qishr/cascara/ui/theme/ThemeVariation.md) variation)                                                                                                                                                                                                                                                                         |                                                  |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getFallbackUiColor](#getfallbackuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md)> colors) |                                                  |



## Method Details

### getVscodeId

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getVscodeId__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getVariation

<span style="font-family: monospace; font-size: 80%;">public [ThemeVariation](../../../../../../io/github/qishr/cascara/ui/theme/ThemeVariation.md) __getVariation__()</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/ui/color/ColorException.md)


---

### getTokenCategory

<span style="font-family: monospace; font-size: 80%;">public static [CodeTokenCategory](../../../../../../io/github/qishr/cascara/ui/theme/CodeTokenCategory.md) __getTokenCategory__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CodeTokenCategory](../../../../../../io/github/qishr/cascara/ui/theme/CodeTokenCategory.md)> cats)</span>




---

### getDefaultTextColor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getDefaultTextColor__()</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/ui/color/ColorException.md)


---

### getUiColor

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/ui/color/ColorException.md)


---

### getUiColor

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Properties](../../../../../../../cascara.common/io/github/qishr/cascara/common/property/Properties.md) colors)</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/ui/color/ColorException.md)


---

### load

<span style="font-family: monospace; font-size: 80%;">public void __load__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) jsonString)</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/ui/color/ColorException.md)


---

### getVariationJson

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getVariationJson__([Variation](../../../../../../io/github/qishr/cascara/ui/theme/Variation.md) variation)</span>



**Throws:**

[ColorException](../../../../../../io/github/qishr/cascara/ui/color/ColorException.md)


---

### getTextResource

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTextResource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourcePath)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### populateMissingColorGroups

<span style="font-family: monospace; font-size: 80%;">public static void __populateMissingColorGroups__([ThemeVariation](../../../../../../io/github/qishr/cascara/ui/theme/ThemeVariation.md) variation)</span>

Fills in missing palette colors in the variation


---

### populateMissingColorNames

<span style="font-family: monospace; font-size: 80%;">public static void __populateMissingColorNames__([ThemeVariation](../../../../../../io/github/qishr/cascara/ui/theme/ThemeVariation.md) variation)</span>




---

### getFallbackUiColor

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFallbackUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../../../../../../io/github/qishr/cascara/ui/color/ColorDefinition.md)> colors)</span>




---

