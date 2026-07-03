Package [io.github.qishr.cascara.ui.theme](index.md)

# Class ThemeEngine
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.theme.ThemeEngine<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ThemeEngine__</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                        | Description |
|-------------------|----------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.ui.theme.ThemeEngine.ThemableObject](ThemeEngine.ThemableObject.md) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                               | Method                                                                                                                                                                                              | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [ThemeEngine](ThemeEngine.md)                                                                                                                                                     | [instance](#instance)()                                                                                                                                                                             |             |
| public static [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<[Option](../option/Option.md)> | [activeThemeOptionProperty](#activethemeoptionproperty)()                                                                                                                                           |             |
| public static [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<[Option](../option/Option.md)> | [activeVariationOptionProperty](#activevariationoptionproperty)()                                                                                                                                   |             |
| public static void                                                                                                                                                                              | [dispose](#dispose)()                                                                                                                                                                               |             |
| public static [OptionProvider](../option/OptionProvider.md)                                                                                                                                     | [getThemeOptionProvider](#getthemeoptionprovider)()                                                                                                                                                 |             |
| public static [OptionProvider](../option/OptionProvider.md)                                                                                                                                     | [getVariationOptionProvider](#getvariationoptionprovider)()                                                                                                                                         |             |
| public static [CascaraTheme](CascaraTheme.md)                                                                                                                                                   | [getDefaultTheme](#getdefaulttheme)()                                                                                                                                                               |             |
| public static [Option](../option/Option.md)                                                                                                                                                     | [getActiveThemeOption](#getactivethemeoption)()                                                                                                                                                     |             |
| public static [Option](../option/Option.md)                                                                                                                                                     | [getDefaultThemeOption](#getdefaultthemeoption)()                                                                                                                                                   |             |
| public static [CascaraTheme](CascaraTheme.md)                                                                                                                                                   | [getTheme](#gettheme)()                                                                                                                                                                             |             |
| public static [CascaraTheme](CascaraTheme.md)                                                                                                                                                   | [getTheme](#gettheme)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) themeId)                                                                         |             |
| public static void                                                                                                                                                                              | [setTheme](#settheme)([CascaraTheme](CascaraTheme.md) theme)                                                                                                                                        |             |
| public static void                                                                                                                                                                              | [setTheme](#settheme)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) themeId)                                                                         |             |
| public static void                                                                                                                                                                              | [setTheme](#settheme)([Option](../option/Option.md) themeOption)                                                                                                                                    |             |
| public static [Variation](Variation.md)                                                                                                                                                         | [getVariation](#getvariation)()                                                                                                                                                                     |             |
| public static void                                                                                                                                                                              | [setVariation](#setvariation)([Variation](Variation.md) variation)                                                                                                                                  |             |
| public static void                                                                                                                                                                              | [setVariation](#setvariation)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) variationName)                                                           |             |
| public static void                                                                                                                                                                              | [bind](#bind)([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) target)                                                             |             |
| public static void                                                                                                                                                                              | [bind](#bind)([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) target)                                                               |             |
| public static void                                                                                                                                                                              | [unbind](#unbind)([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) target)                                                         |             |
| public static void                                                                                                                                                                              | [unbind](#unbind)([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) target)                                                           |             |
| public static boolean                                                                                                                                                                           | [applyTheme](#applytheme)([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) parent)                                                 |             |
| public static boolean                                                                                                                                                                           | [applyTheme](#applytheme)([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) scene)                                                    |             |
| public static void                                                                                                                                                                              | [applyVariation](#applyvariation)([Variation](Variation.md) variation, [Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) parent)    |             |
| public static void                                                                                                                                                                              | [applyVariation](#applyvariation)([Variation](Variation.md) variation, [Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) scene)       |             |
| public static void                                                                                                                                                                              | [applyStyle](#applystyle)([ControlStyle](../style/ControlStyle.md) style, [Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) parent) |             |
| public static void                                                                                                                                                                              | [applyStyle](#applystyle)([ControlStyle](../style/ControlStyle.md) style, [Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) scene)    |             |
| public static void                                                                                                                                                                              | [addUserStyle](#adduserstyle)([ControlStyle](../style/ControlStyle.md) style)                                                                                                                       |             |
| public static void                                                                                                                                                                              | [removeUserStyle](#removeuserstyle)([ControlStyle](../style/ControlStyle.md) style)                                                                                                                 |             |
| public static void                                                                                                                                                                              | [clearUserStyles](#clearuserstyles)()                                                                                                                                                               |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                      | [getFontFamily](#getfontfamily)()                                                                                                                                                                   |             |
| public static void                                                                                                                                                                              | [setFontFamily](#setfontfamily)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fontFamily)                                                            |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                      | [getStylesheet](#getstylesheet)([Variation](Variation.md) variation)                                                                                                                                |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                      | [getUiColor](#getuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                          |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                      | [cssColorVariable](#csscolorvariable)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                            |             |



## Method Details

### instance

<span style="font-family: monospace; font-size: 80%;">public static [ThemeEngine](ThemeEngine.md) __instance__()</span>




---

### activeThemeOptionProperty

<span style="font-family: monospace; font-size: 80%;">public static [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<[Option](../option/Option.md)> __activeThemeOptionProperty__()</span>




---

### activeVariationOptionProperty

<span style="font-family: monospace; font-size: 80%;">public static [SimpleObjectProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleObjectProperty.html)<[Option](../option/Option.md)> __activeVariationOptionProperty__()</span>




---

### dispose

<span style="font-family: monospace; font-size: 80%;">public static void __dispose__()</span>




---

### getThemeOptionProvider

<span style="font-family: monospace; font-size: 80%;">public static [OptionProvider](../option/OptionProvider.md) __getThemeOptionProvider__()</span>




---

### getVariationOptionProvider

<span style="font-family: monospace; font-size: 80%;">public static [OptionProvider](../option/OptionProvider.md) __getVariationOptionProvider__()</span>




---

### getDefaultTheme

<span style="font-family: monospace; font-size: 80%;">public static [CascaraTheme](CascaraTheme.md) __getDefaultTheme__()</span>




---

### getActiveThemeOption

<span style="font-family: monospace; font-size: 80%;">public static [Option](../option/Option.md) __getActiveThemeOption__()</span>




---

### getDefaultThemeOption

<span style="font-family: monospace; font-size: 80%;">public static [Option](../option/Option.md) __getDefaultThemeOption__()</span>




---

### getTheme

<span style="font-family: monospace; font-size: 80%;">public static [CascaraTheme](CascaraTheme.md) __getTheme__()</span>




---

### getTheme

<span style="font-family: monospace; font-size: 80%;">public static [CascaraTheme](CascaraTheme.md) __getTheme__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) themeId)</span>




---

### setTheme

<span style="font-family: monospace; font-size: 80%;">public static void __setTheme__([CascaraTheme](CascaraTheme.md) theme)</span>




---

### setTheme

<span style="font-family: monospace; font-size: 80%;">public static void __setTheme__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) themeId)</span>




---

### setTheme

<span style="font-family: monospace; font-size: 80%;">public static void __setTheme__([Option](../option/Option.md) themeOption)</span>




---

### getVariation

<span style="font-family: monospace; font-size: 80%;">public static [Variation](Variation.md) __getVariation__()</span>




---

### setVariation

<span style="font-family: monospace; font-size: 80%;">public static void __setVariation__([Variation](Variation.md) variation)</span>




---

### setVariation

<span style="font-family: monospace; font-size: 80%;">public static void __setVariation__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) variationName)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) target)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public static void __bind__([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) target)</span>




---

### unbind

<span style="font-family: monospace; font-size: 80%;">public static void __unbind__([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) target)</span>




---

### unbind

<span style="font-family: monospace; font-size: 80%;">public static void __unbind__([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) target)</span>




---

### applyTheme

<span style="font-family: monospace; font-size: 80%;">public static boolean __applyTheme__([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) parent)</span>




---

### applyTheme

<span style="font-family: monospace; font-size: 80%;">public static boolean __applyTheme__([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) scene)</span>




---

### applyVariation

<span style="font-family: monospace; font-size: 80%;">public static void __applyVariation__([Variation](Variation.md) variation, [Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) parent)</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### applyVariation

<span style="font-family: monospace; font-size: 80%;">public static void __applyVariation__([Variation](Variation.md) variation, [Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) scene)</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### applyStyle

<span style="font-family: monospace; font-size: 80%;">public static void __applyStyle__([ControlStyle](../style/ControlStyle.md) style, [Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) parent)</span>




---

### applyStyle

<span style="font-family: monospace; font-size: 80%;">public static void __applyStyle__([ControlStyle](../style/ControlStyle.md) style, [Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) scene)</span>




---

### addUserStyle

<span style="font-family: monospace; font-size: 80%;">public static void __addUserStyle__([ControlStyle](../style/ControlStyle.md) style)</span>




---

### removeUserStyle

<span style="font-family: monospace; font-size: 80%;">public static void __removeUserStyle__([ControlStyle](../style/ControlStyle.md) style)</span>




---

### clearUserStyles

<span style="font-family: monospace; font-size: 80%;">public static void __clearUserStyles__()</span>




---

### getFontFamily

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFontFamily__()</span>




---

### setFontFamily

<span style="font-family: monospace; font-size: 80%;">public static void __setFontFamily__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fontFamily)</span>




---

### getStylesheet

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getStylesheet__([Variation](Variation.md) variation)</span>



**Throws:**

[ColorException](../color/ColorException.md)


---

### getUiColor

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### cssColorVariable

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __cssColorVariable__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

