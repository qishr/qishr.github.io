Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Class YamlOptions
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.util.LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<[io.github.qishr.cascara.lang.yaml.util.YamlOptions](YamlOptions.md)><br/>
                io.github.qishr.cascara.lang.yaml.util.YamlOptions<br/>
<br/>
All Implemented Interfaces:<br/>
    [Duplicable](../../../cascara.common/util/Duplicable.md)<[YamlOptions](YamlOptions.md)>

Direct Known Subtypes:<br/>
    [ImmutableYamlOptions](YamlOptions.ImmutableYamlOptions.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlOptions__<br/>extends [LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<[YamlOptions](YamlOptions.md)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                          | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.lang.yaml.util.YamlOptions.ImmutableYamlOptions](YamlOptions.ImmutableYamlOptions.md) |             |



## Field Summary

| Modifier and Type               | Field                   | Description |
|---------------------------------|-------------------------|-------------|
| public static final YamlOptions | [CANONICAL](#canonical) |             |
| public static final YamlOptions | [DEFAULT](#default)     |             |



## Constructor Summary

| Constructor                                         | Description |
|-----------------------------------------------------|-------------|
| YamlOptions()                                       |             |
| YamlOptions([YamlOptions](YamlOptions.md) original) |             |



## Method Summary

| Modifier and Type                    | Method                                                                     | Description                                                    |
|--------------------------------------|----------------------------------------------------------------------------|----------------------------------------------------------------|
| public int                           | [getDepthLimit](#getdepthlimit)()                                          |                                                                |
| public boolean                       | [isAllowUnicode](#isallowunicode)()                                        |                                                                |
| public boolean                       | [isExplicitStart](#isexplicitstart)()                                      |                                                                |
| public boolean                       | [isExpandedStyle](#isexpandedstyle)()                                      |                                                                |
| public boolean                       | [isStrict](#isstrict)()                                                    |                                                                |
| public boolean                       | [isIncludeComments](#isincludecomments)()                                  |                                                                |
| public boolean                       | [isMultiDocument](#ismultidocument)()                                      |                                                                |
| public boolean                       | [stripComments](#stripcomments)()                                          |                                                                |
| public boolean                       | [stripTags](#striptags)()                                                  |                                                                |
| public boolean                       | [stripAnchors](#stripanchors)()                                            |                                                                |
| public boolean                       | [sortKeys](#sortkeys)()                                                    |                                                                |
| public boolean                       | [normalizeIndent](#normalizeindent)()                                      |                                                                |
| public boolean                       | [normalizeScalarFormatting](#normalizescalarformatting)()                  |                                                                |
| public [YamlOptions](YamlOptions.md) | [setDepthLimit](#setdepthlimit)(int val)                                   |                                                                |
| public [YamlOptions](YamlOptions.md) | [setAllowUnicode](#setallowunicode)(boolean val)                           | Sets whether unicode characters are allowed in scalars.        |
| public [YamlOptions](YamlOptions.md) | [setExplicitStart](#setexplicitstart)(boolean val)                         | Sets whether to always output the '---' document start marker. |
| public [YamlOptions](YamlOptions.md) | [setExpandedStyle](#setexpandedstyle)(boolean val)                         |                                                                |
| public [YamlOptions](YamlOptions.md) | [setStrict](#setstrict)(boolean val)                                       |                                                                |
| public [YamlOptions](YamlOptions.md) | [setIncludeComments](#setincludecomments)(boolean val)                     |                                                                |
| public [YamlOptions](YamlOptions.md) | [setMultiDocument](#setmultidocument)(boolean val)                         |                                                                |
| public [YamlOptions](YamlOptions.md) | [setStripComments](#setstripcomments)(boolean val)                         |                                                                |
| public [YamlOptions](YamlOptions.md) | [setStripTags](#setstriptags)(boolean val)                                 |                                                                |
| public [YamlOptions](YamlOptions.md) | [setStripAnchors](#setstripanchors)(boolean val)                           |                                                                |
| public [YamlOptions](YamlOptions.md) | [setSortKeys](#setsortkeys)(boolean val)                                   |                                                                |
| public [YamlOptions](YamlOptions.md) | [setNormalizeIndent](#setnormalizeindent)(boolean val)                     |                                                                |
| public [YamlOptions](YamlOptions.md) | [setNormalizeScalarFormatting](#setnormalizescalarformatting)(boolean val) |                                                                |
| public [YamlOptions](YamlOptions.md) | [duplicate](#duplicate)()                                                  |                                                                |


### Methods inherited from [LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)

setIndentSize, getIndentSize


## Field Details

### CANONICAL

<span style="font-family: monospace; font-size: 80%;">public static final YamlOptions __CANONICAL__</span>




---

### DEFAULT

<span style="font-family: monospace; font-size: 80%;">public static final YamlOptions __DEFAULT__</span>




---


## Method Details

### getDepthLimit

<span style="font-family: monospace; font-size: 80%;">public int __getDepthLimit__()</span>




---

### isAllowUnicode

<span style="font-family: monospace; font-size: 80%;">public boolean __isAllowUnicode__()</span>




---

### isExplicitStart

<span style="font-family: monospace; font-size: 80%;">public boolean __isExplicitStart__()</span>




---

### isExpandedStyle

<span style="font-family: monospace; font-size: 80%;">public boolean __isExpandedStyle__()</span>




---

### isStrict

<span style="font-family: monospace; font-size: 80%;">public boolean __isStrict__()</span>




---

### isIncludeComments

<span style="font-family: monospace; font-size: 80%;">public boolean __isIncludeComments__()</span>




---

### isMultiDocument

<span style="font-family: monospace; font-size: 80%;">public boolean __isMultiDocument__()</span>




---

### stripComments

<span style="font-family: monospace; font-size: 80%;">public boolean __stripComments__()</span>




---

### stripTags

<span style="font-family: monospace; font-size: 80%;">public boolean __stripTags__()</span>




---

### stripAnchors

<span style="font-family: monospace; font-size: 80%;">public boolean __stripAnchors__()</span>




---

### sortKeys

<span style="font-family: monospace; font-size: 80%;">public boolean __sortKeys__()</span>




---

### normalizeIndent

<span style="font-family: monospace; font-size: 80%;">public boolean __normalizeIndent__()</span>




---

### normalizeScalarFormatting

<span style="font-family: monospace; font-size: 80%;">public boolean __normalizeScalarFormatting__()</span>




---

### setDepthLimit

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setDepthLimit__(int val)</span>




---

### setAllowUnicode

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setAllowUnicode__(boolean val)</span>

Sets whether unicode characters are allowed in scalars.


---

### setExplicitStart

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setExplicitStart__(boolean val)</span>

Sets whether to always output the '---' document start marker.


---

### setExpandedStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setExpandedStyle__(boolean val)</span>




---

### setStrict

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setStrict__(boolean val)</span>




---

### setIncludeComments

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setIncludeComments__(boolean val)</span>




---

### setMultiDocument

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setMultiDocument__(boolean val)</span>




---

### setStripComments

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setStripComments__(boolean val)</span>




---

### setStripTags

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setStripTags__(boolean val)</span>




---

### setStripAnchors

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setStripAnchors__(boolean val)</span>




---

### setSortKeys

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setSortKeys__(boolean val)</span>




---

### setNormalizeIndent

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setNormalizeIndent__(boolean val)</span>




---

### setNormalizeScalarFormatting

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __setNormalizeScalarFormatting__(boolean val)</span>




---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../../../cascara.common/util/Duplicable.md)


---

