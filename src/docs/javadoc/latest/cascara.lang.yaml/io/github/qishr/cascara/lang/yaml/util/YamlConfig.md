Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Class YamlConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.util.LanguageConfig](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageConfig.md)<[io.github.qishr.cascara.lang.yaml.util.YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md)><br/>
                io.github.qishr.cascara.lang.yaml.util.YamlConfig<br/>
<br/>
All Implemented Interfaces:<br/>
    [Duplicable](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/Duplicable.md)<[YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md)>

Direct Known Subtypes:<br/>
    [ImmutableYamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.ImmutableYamlConfig.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlConfig__<br/>extends [LanguageConfig](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageConfig.md)<[YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                      | Description |
|-------------------|------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.lang.yaml.util.YamlConfig.ImmutableYamlConfig](YamlConfig.ImmutableYamlConfig.md) |             |



## Field Summary

| Modifier and Type              | Field                     | Description |
|--------------------------------|---------------------------|-------------|
| public static final YamlConfig | [CANONICAL](#canonical)   |             |
| public static final YamlConfig | [DEFAULT](#default)       |             |
| protected int                  | [indentSize](#indentsize) |             |



## Constructor Summary

| Constructor                                                                                                  | Description |
|--------------------------------------------------------------------------------------------------------------|-------------|
| YamlConfig()                                                                                                 |             |
| YamlConfig([YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) original) |             |



## Method Summary

| Modifier and Type                                                                              | Method                                                                   | Description                                                    |
|------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|----------------------------------------------------------------|
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setIndentSize](#setindentsize)(int size)                                |                                                                |
| public int                                                                                     | [indentSize](#indentsize)()                                              |                                                                |
| public int                                                                                     | [depthLimit](#depthlimit)()                                              |                                                                |
| public boolean                                                                                 | [allowUnicode](#allowunicode)()                                          |                                                                |
| public boolean                                                                                 | [isExplicitStart](#isexplicitstart)()                                    |                                                                |
| public boolean                                                                                 | [outputExpandedStyle](#outputexpandedstyle)()                            |                                                                |
| public boolean                                                                                 | [isStrict](#isstrict)()                                                  |                                                                |
| public boolean                                                                                 | [outputComments](#outputcomments)()                                      |                                                                |
| public boolean                                                                                 | [isMultiDocument](#ismultidocument)()                                    |                                                                |
| public boolean                                                                                 | [stripTags](#striptags)()                                                |                                                                |
| public boolean                                                                                 | [stripAnchors](#stripanchors)()                                          |                                                                |
| public boolean                                                                                 | [sortKeys](#sortkeys)()                                                  |                                                                |
| public boolean                                                                                 | [normalizeIndent](#normalizeindent)()                                    |                                                                |
| public boolean                                                                                 | [normalizeScalarFormatting](#normalizescalarformatting)()                |                                                                |
| public boolean                                                                                 | [forceExplicitNull](#forceexplicitnull)()                                |                                                                |
| public boolean                                                                                 | [forceBlockCollections](#forceblockcollections)()                        |                                                                |
| public boolean                                                                                 | [preloadTokenBuffer](#preloadtokenbuffer)()                              |                                                                |
| public boolean                                                                                 | [outputResolvedAliases](#outputresolvedaliases)()                        |                                                                |
| public boolean                                                                                 | [alwaysEndWithNewLine](#alwaysendwithnewline)()                          |                                                                |
| public boolean                                                                                 | [retainFormatting](#retainformatting)()                                  |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setDepthLimit](#setdepthlimit)(int val)                                 |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setAllowUnicode](#setallowunicode)(boolean val)                         | Sets whether unicode characters are allowed in scalars.        |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setExplicitStart](#setexplicitstart)(boolean val)                       | Sets whether to always output the '---' document start marker. |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setOutputExpandedStyle](#setoutputexpandedstyle)(boolean val)           |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setStrict](#setstrict)(boolean val)                                     |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setOutputComments](#setoutputcomments)(boolean val)                     |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setMultiDocument](#setmultidocument)(boolean val)                       |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setStripTags](#setstriptags)(boolean val)                               |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setStripAnchors](#setstripanchors)(boolean val)                         |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setSortKeys](#setsortkeys)(boolean val)                                 |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setNormalizeIndent](#setnormalizeindent)(boolean b)                     |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setNormalizeScalarFormatting](#setnormalizescalarformatting)(boolean b) |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setForceExplicitNull](#setforceexplicitnull)(boolean b)                 |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setForceBlockCollections](#setforceblockcollections)(boolean b)         |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setPreloadTokenBuffer](#setpreloadtokenbuffer)(boolean b)               |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setOutputResolvedAliases](#setoutputresolvedaliases)(boolean b)         |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setAlwaysEndWithNewLine](#setalwaysendwithnewline)(boolean b)           |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [setRetainFormatting](#setretainformatting)(boolean b)                   |                                                                |
| public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) | [duplicate](#duplicate)()                                                |                                                                |



## Field Details

### CANONICAL

<span style="font-family: monospace; font-size: 80%;">public static final YamlConfig __CANONICAL__</span>




---

### DEFAULT

<span style="font-family: monospace; font-size: 80%;">public static final YamlConfig __DEFAULT__</span>




---

### indentSize

<span style="font-family: monospace; font-size: 80%;">protected int __indentSize__</span>




---


## Method Details

### setIndentSize

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setIndentSize__(int size)</span>




---

### indentSize

<span style="font-family: monospace; font-size: 80%;">public int __indentSize__()</span>




---

### depthLimit

<span style="font-family: monospace; font-size: 80%;">public int __depthLimit__()</span>




---

### allowUnicode

<span style="font-family: monospace; font-size: 80%;">public boolean __allowUnicode__()</span>




---

### isExplicitStart

<span style="font-family: monospace; font-size: 80%;">public boolean __isExplicitStart__()</span>




---

### outputExpandedStyle

<span style="font-family: monospace; font-size: 80%;">public boolean __outputExpandedStyle__()</span>




---

### isStrict

<span style="font-family: monospace; font-size: 80%;">public boolean __isStrict__()</span>




---

### outputComments

<span style="font-family: monospace; font-size: 80%;">public boolean __outputComments__()</span>




---

### isMultiDocument

<span style="font-family: monospace; font-size: 80%;">public boolean __isMultiDocument__()</span>




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

### forceExplicitNull

<span style="font-family: monospace; font-size: 80%;">public boolean __forceExplicitNull__()</span>




---

### forceBlockCollections

<span style="font-family: monospace; font-size: 80%;">public boolean __forceBlockCollections__()</span>




---

### preloadTokenBuffer

<span style="font-family: monospace; font-size: 80%;">public boolean __preloadTokenBuffer__()</span>




---

### outputResolvedAliases

<span style="font-family: monospace; font-size: 80%;">public boolean __outputResolvedAliases__()</span>




---

### alwaysEndWithNewLine

<span style="font-family: monospace; font-size: 80%;">public boolean __alwaysEndWithNewLine__()</span>




---

### retainFormatting

<span style="font-family: monospace; font-size: 80%;">public boolean __retainFormatting__()</span>




---

### setDepthLimit

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setDepthLimit__(int val)</span>




---

### setAllowUnicode

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setAllowUnicode__(boolean val)</span>

Sets whether unicode characters are allowed in scalars.


---

### setExplicitStart

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setExplicitStart__(boolean val)</span>

Sets whether to always output the '---' document start marker.


---

### setOutputExpandedStyle

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setOutputExpandedStyle__(boolean val)</span>




---

### setStrict

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setStrict__(boolean val)</span>




---

### setOutputComments

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setOutputComments__(boolean val)</span>




---

### setMultiDocument

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setMultiDocument__(boolean val)</span>




---

### setStripTags

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setStripTags__(boolean val)</span>




---

### setStripAnchors

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setStripAnchors__(boolean val)</span>




---

### setSortKeys

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setSortKeys__(boolean val)</span>




---

### setNormalizeIndent

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setNormalizeIndent__(boolean b)</span>




---

### setNormalizeScalarFormatting

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setNormalizeScalarFormatting__(boolean b)</span>




---

### setForceExplicitNull

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setForceExplicitNull__(boolean b)</span>




---

### setForceBlockCollections

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setForceBlockCollections__(boolean b)</span>




---

### setPreloadTokenBuffer

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setPreloadTokenBuffer__(boolean b)</span>




---

### setOutputResolvedAliases

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setOutputResolvedAliases__(boolean b)</span>




---

### setAlwaysEndWithNewLine

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setAlwaysEndWithNewLine__(boolean b)</span>




---

### setRetainFormatting

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __setRetainFormatting__(boolean b)</span>




---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [YamlConfig](../../../../../../../io/github/qishr/cascara/lang/yaml/util/YamlConfig.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/Duplicable.md)


---

