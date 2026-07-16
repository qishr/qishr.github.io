Package [io.github.qishr.cascara.common.lang.util](index.md)

# Class LanguageOptions
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.LanguageOptions<br/>
<br/>
Direct Known Subtypes:<br/>
    [JsonOptions](../../../cascara.lang.json/json/util/JsonOptions.md), [XmlOptions](../../../cascara.lang.xml/util/XmlOptions.md), [YamlOptions](../../../cascara.lang.yaml/yaml/util/YamlOptions.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __LanguageOptions__</span>

Base class for all language-specific configuration.T is the specific implementation type for fluent chaining.


## Field Summary

| Modifier and Type | Field                     | Description |
|-------------------|---------------------------|-------------|
| protected int     | [indentSize](#indentsize) |             |



## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| LanguageOptions() |             |



## Method Summary

| Modifier and Type | Method                                    | Description                                          |
|-------------------|-------------------------------------------|------------------------------------------------------|
| public T          | [setIndentSize](#setindentsize)(int size) | Sets the number of spaces/tabs used for indentation. |
| public int        | [getIndentSize](#getindentsize)()         |                                                      |



## Field Details

### indentSize

<span style="font-family: monospace; font-size: 80%;">protected int __indentSize__</span>




---


## Method Details

### setIndentSize

<span style="font-family: monospace; font-size: 80%;">public T __setIndentSize__(int size)</span>

Sets the number of spaces/tabs used for indentation.


---

### getIndentSize

<span style="font-family: monospace; font-size: 80%;">public int __getIndentSize__()</span>




---

