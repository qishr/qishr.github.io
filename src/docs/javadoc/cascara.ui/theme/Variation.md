Package [io.github.qishr.cascara.ui.theme](index.md)

# Interface Variation
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.theme.Variation<br/>
<br/>
All Implemented Interfaces:<br/>
    [Option](../option/Option.md)

All Known Implementing Classes:<br/>
    [ThemeVariation](ThemeVariation.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Variation__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                    | Method                                                                                                                                                                                                                                                     | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getName](#getname)()                                                                                                                                                                                                                                      |             |
| public abstract void                                                                                                                                                                                                                                 | [setName](#setname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                     |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                         | [getPath](#getpath)()                                                                                                                                                                                                                                      |             |
| public abstract void                                                                                                                                                                                                                                 | [setPath](#setpath)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)                                                                                                                                     |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getBaseColors](#getbasecolors)()                                                                                                                                                                                                                          |             |
| public abstract [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getBaseColor](#getbasecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                             |             |
| public abstract void                                                                                                                                                                                                                                 | [setBaseColor](#setbasecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                      |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getTransformDefinitions](#gettransformdefinitions)()                                                                                                                                                                                                      |             |
| public abstract [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getTransformDefinition](#gettransformdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                         |             |
| public abstract void                                                                                                                                                                                                                                 | [setTransformDefinition](#settransformdefinition)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transform) |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getPaletteColors](#getpalettecolors)()                                                                                                                                                                                                                    |             |
| public abstract [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getPaletteColor](#getpalettecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                       |             |
| public abstract void                                                                                                                                                                                                                                 | [setPaletteColor](#setpalettecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [ColorDefinition](../color/ColorDefinition.md) definition)                                                            |             |
| public abstract void                                                                                                                                                                                                                                 | [setPaletteColor](#setpalettecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getUiColors](#getuicolors)()                                                                                                                                                                                                                              |             |
| public abstract [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getUiColor](#getuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                                 |             |
| public abstract void                                                                                                                                                                                                                                 | [setUiColor](#setuicolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                          |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getCodeColors](#getcodecolors)()                                                                                                                                                                                                                          |             |
| public abstract [ColorDefinition](../color/ColorDefinition.md)                                                                                                                                                                                       | [getCodeColor](#getcodecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)                                                                                                                             |             |
| public abstract void                                                                                                                                                                                                                                 | [setCodeColor](#setcodecolor)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)                      |             |
| public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> | [getGroup](#getgroup)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) groupId)                                                                                                                                |             |



## Method Details

### getName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### setName

<span style="font-family: monospace; font-size: 80%;">public abstract void __setName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getPath

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPath__()</span>




---

### setPath

<span style="font-family: monospace; font-size: 80%;">public abstract void __setPath__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) path)</span>




---

### getBaseColors

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getBaseColors__()</span>




---

### getBaseColor

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorDefinition](../color/ColorDefinition.md) __getBaseColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### setBaseColor

<span style="font-family: monospace; font-size: 80%;">public abstract void __setBaseColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>




---

### getTransformDefinitions

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getTransformDefinitions__()</span>




---

### getTransformDefinition

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorDefinition](../color/ColorDefinition.md) __getTransformDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### setTransformDefinition

<span style="font-family: monospace; font-size: 80%;">public abstract void __setTransformDefinition__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) transform)</span>




---

### getPaletteColors

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getPaletteColors__()</span>




---

### getPaletteColor

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorDefinition](../color/ColorDefinition.md) __getPaletteColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### setPaletteColor

<span style="font-family: monospace; font-size: 80%;">public abstract void __setPaletteColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [ColorDefinition](../color/ColorDefinition.md) definition)</span>




---

### setPaletteColor

<span style="font-family: monospace; font-size: 80%;">public abstract void __setPaletteColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>




---

### getUiColors

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getUiColors__()</span>




---

### getUiColor

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorDefinition](../color/ColorDefinition.md) __getUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### setUiColor

<span style="font-family: monospace; font-size: 80%;">public abstract void __setUiColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>




---

### getCodeColors

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getCodeColors__()</span>




---

### getCodeColor

<span style="font-family: monospace; font-size: 80%;">public abstract [ColorDefinition](../color/ColorDefinition.md) __getCodeColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### setCodeColor

<span style="font-family: monospace; font-size: 80%;">public abstract void __setCodeColor__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) hexColor)</span>




---

### getGroup

<span style="font-family: monospace; font-size: 80%;">public abstract [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [ColorDefinition](../color/ColorDefinition.md)> __getGroup__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) groupId)</span>




---

