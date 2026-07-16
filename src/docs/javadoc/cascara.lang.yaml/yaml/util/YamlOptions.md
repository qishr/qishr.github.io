Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Class YamlOptions
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.util.LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<[io.github.qishr.cascara.lang.yaml.util.YamlOptions](YamlOptions.md)><br/>
                io.github.qishr.cascara.lang.yaml.util.YamlOptions<br/>
<br/>
All Implemented Interfaces:<br/>
    [Duplicable](../../../cascara.common/util/Duplicable.md)<[YamlOptions](YamlOptions.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __YamlOptions__<br/>extends [LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<[YamlOptions](YamlOptions.md)>
</span>


## Field Summary

| Modifier and Type               | Field               | Description |
|---------------------------------|---------------------|-------------|
| public static final YamlOptions | [DEFAULT](#default) |             |



## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| YamlOptions() |             |



## Method Summary

| Modifier and Type                    | Method                                                 | Description                                                    |
|--------------------------------------|--------------------------------------------------------|----------------------------------------------------------------|
| public [YamlOptions](YamlOptions.md) | [setAllowUnicode](#setallowunicode)(boolean val)       | Sets whether unicode characters are allowed in scalars.        |
| public [YamlOptions](YamlOptions.md) | [setExplicitStart](#setexplicitstart)(boolean val)     | Sets whether to always output the '---' document start marker. |
| public [YamlOptions](YamlOptions.md) | [setExpandedStyle](#setexpandedstyle)(boolean val)     |                                                                |
| public [YamlOptions](YamlOptions.md) | [setStrict](#setstrict)(boolean val)                   |                                                                |
| public [YamlOptions](YamlOptions.md) | [setIncludeComments](#setincludecomments)(boolean val) |                                                                |
| public [YamlOptions](YamlOptions.md) | [setMultiDocument](#setmultidocument)(boolean val)     |                                                                |
| public boolean                       | [isAllowUnicode](#isallowunicode)()                    |                                                                |
| public boolean                       | [isExplicitStart](#isexplicitstart)()                  |                                                                |
| public boolean                       | [isExpandedStyle](#isexpandedstyle)()                  |                                                                |
| public boolean                       | [isStrict](#isstrict)()                                |                                                                |
| public boolean                       | [isIncludeComments](#isincludecomments)()              |                                                                |
| public boolean                       | [isMultiDocument](#ismultidocument)()                  |                                                                |
| public [YamlOptions](YamlOptions.md) | [duplicate](#duplicate)()                              |                                                                |


### Methods inherited from [LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)

setIndentSize, getIndentSize


## Field Details

### DEFAULT

<span style="font-family: monospace; font-size: 80%;">public static final YamlOptions __DEFAULT__</span>




---


## Method Details

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

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](YamlOptions.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../../../cascara.common/util/Duplicable.md)


---

