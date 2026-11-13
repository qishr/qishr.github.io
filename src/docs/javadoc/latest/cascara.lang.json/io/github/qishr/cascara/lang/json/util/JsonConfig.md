Package [io.github.qishr.cascara.lang.json.util](index.md)

# Class JsonConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.util.LanguageConfig](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageConfig.md)<[io.github.qishr.cascara.lang.json.util.JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md)><br/>
                io.github.qishr.cascara.lang.json.util.JsonConfig<br/>
<br/>
All Implemented Interfaces:<br/>
    [Duplicable](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/Duplicable.md)<[JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md)>

Direct Known Subtypes:<br/>
    [ImmutableJsonOptions](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.ImmutableJsonOptions.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonConfig__<br/>extends [LanguageConfig](../../../../../../../../cascara.common/io/github/qishr/cascara/common/lang/util/LanguageConfig.md)<[JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                        | Description |
|-------------------|--------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.lang.json.util.JsonConfig.ImmutableJsonOptions](JsonConfig.ImmutableJsonOptions.md) |             |



## Field Summary

| Modifier and Type                                                                                                             | Field                     | Description |
|-------------------------------------------------------------------------------------------------------------------------------|---------------------------|-------------|
| public static final io.github.qishr.cascara.lang.json.util.@io.github.qishr.cascara.common.annotation.Experimental JsonConfig | [JSON5](#json5)           |             |
| public static final JsonConfig                                                                                                | [STRICT](#strict)         |             |
| protected int                                                                                                                 | [indentSize](#indentsize) |             |



## Constructor Summary

| Constructor                                                                                                  | Description |
|--------------------------------------------------------------------------------------------------------------|-------------|
| JsonConfig()                                                                                                 |             |
| JsonConfig([JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) original) |             |



## Method Summary

| Modifier and Type                                                                              | Method                                                                   | Description                                             |
|------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|---------------------------------------------------------|
| public boolean                                                                                 | [allowComments](#allowcomments)()                                        |                                                         |
| public boolean                                                                                 | [allowHexadecimalNumbers](#allowhexadecimalnumbers)()                    |                                                         |
| public boolean                                                                                 | [allowJson5Numbers](#allowjson5numbers)()                                |                                                         |
| public boolean                                                                                 | [allowSingleQuotedStrings](#allowsinglequotedstrings)()                  |                                                         |
| public boolean                                                                                 | [allowTrailingComma](#allowtrailingcomma)()                              |                                                         |
| public boolean                                                                                 | [allowUnicode](#allowunicode)()                                          |                                                         |
| public boolean                                                                                 | [allowUnquotedKeys](#allowunquotedkeys)()                                |                                                         |
| public boolean                                                                                 | [captureComments](#capturecomments)()                                    |                                                         |
| public boolean                                                                                 | [insertSpaces](#insertspaces)()                                          |                                                         |
| public boolean                                                                                 | [prettyPrint](#prettyprint)()                                            |                                                         |
| public boolean                                                                                 | [useSimd](#usesimd)()                                                    |                                                         |
| public boolean                                                                                 | [validateUnicode](#validateunicode)()                                    |                                                         |
| public boolean                                                                                 | [trackPosition](#trackposition)()                                        |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setIndentSize](#setindentsize)(int size)                                |                                                         |
| public int                                                                                     | [getIndentSize](#getindentsize)()                                        |                                                         |
| public int                                                                                     | [getDepthLimit](#getdepthlimit)()                                        |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setDepthLimit](#setdepthlimit)(int limit)                               |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowBooleanKeys](#setallowbooleankeys)(boolean val)                 |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowComments](#setallowcomments)(boolean val)                       |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowHexadecimalNumbers](#setallowhexadecimalnumbers)(boolean val)   |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowJson5Numbers](#setallowjson5numbers)(boolean val)               |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowSingleQuotedStrings](#setallowsinglequotedstrings)(boolean val) |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowTrailingComma](#setallowtrailingcomma)(boolean val)             |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowUnicode](#setallowunicode)(boolean val)                         | Sets whether unicode characters are allowed in scalars. |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setAllowUnquotedKeys](#setallowunquotedkeys)(boolean val)               |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setCaptureComments](#setcapturecomments)(boolean val)                   |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setInsertSpaces](#setinsertspaces)(boolean val)                         | Sets whether to use spaces or tabs for indentation.     |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setPrettyPrint](#setprettyprint)(boolean v)                             |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setUseSimd](#setusesimd)(boolean v)                                     |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setValidateUnicode](#setvalidateunicode)(boolean v)                     |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [setTrackPosition](#settrackposition)(boolean v)                         |                                                         |
| public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) | [duplicate](#duplicate)()                                                |                                                         |



## Field Details

### JSON5

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public static final io.github.qishr.cascara.lang.json.util.@io.github.qishr.cascara.common.annotation.Experimental JsonConfig __JSON5__</span>




---

### STRICT

<span style="font-family: monospace; font-size: 80%;">public static final JsonConfig __STRICT__</span>




---

### indentSize

<span style="font-family: monospace; font-size: 80%;">protected int __indentSize__</span>




---


## Method Details

### allowComments

<span style="font-family: monospace; font-size: 80%;">public boolean __allowComments__()</span>




---

### allowHexadecimalNumbers

<span style="font-family: monospace; font-size: 80%;">public boolean __allowHexadecimalNumbers__()</span>




---

### allowJson5Numbers

<span style="font-family: monospace; font-size: 80%;">public boolean __allowJson5Numbers__()</span>




---

### allowSingleQuotedStrings

<span style="font-family: monospace; font-size: 80%;">public boolean __allowSingleQuotedStrings__()</span>




---

### allowTrailingComma

<span style="font-family: monospace; font-size: 80%;">public boolean __allowTrailingComma__()</span>




---

### allowUnicode

<span style="font-family: monospace; font-size: 80%;">public boolean __allowUnicode__()</span>




---

### allowUnquotedKeys

<span style="font-family: monospace; font-size: 80%;">public boolean __allowUnquotedKeys__()</span>




---

### captureComments

<span style="font-family: monospace; font-size: 80%;">public boolean __captureComments__()</span>




---

### insertSpaces

<span style="font-family: monospace; font-size: 80%;">public boolean __insertSpaces__()</span>




---

### prettyPrint

<span style="font-family: monospace; font-size: 80%;">public boolean __prettyPrint__()</span>




---

### useSimd

<span style="font-family: monospace; font-size: 80%;">public boolean __useSimd__()</span>




---

### validateUnicode

<span style="font-family: monospace; font-size: 80%;">public boolean __validateUnicode__()</span>




---

### trackPosition

<span style="font-family: monospace; font-size: 80%;">public boolean __trackPosition__()</span>




---

### setIndentSize

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setIndentSize__(int size)</span>




---

### getIndentSize

<span style="font-family: monospace; font-size: 80%;">public int __getIndentSize__()</span>




---

### getDepthLimit

<span style="font-family: monospace; font-size: 80%;">public int __getDepthLimit__()</span>




---

### setDepthLimit

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setDepthLimit__(int limit)</span>




---

### setAllowBooleanKeys

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowBooleanKeys__(boolean val)</span>




---

### setAllowComments

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowComments__(boolean val)</span>




---

### setAllowHexadecimalNumbers

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowHexadecimalNumbers__(boolean val)</span>




---

### setAllowJson5Numbers

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowJson5Numbers__(boolean val)</span>




---

### setAllowSingleQuotedStrings

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowSingleQuotedStrings__(boolean val)</span>




---

### setAllowTrailingComma

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowTrailingComma__(boolean val)</span>




---

### setAllowUnicode

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowUnicode__(boolean val)</span>

Sets whether unicode characters are allowed in scalars.


---

### setAllowUnquotedKeys

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setAllowUnquotedKeys__(boolean val)</span>




---

### setCaptureComments

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setCaptureComments__(boolean val)</span>




---

### setInsertSpaces

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setInsertSpaces__(boolean val)</span>

Sets whether to use spaces or tabs for indentation.


---

### setPrettyPrint

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setPrettyPrint__(boolean v)</span>




---

### setUseSimd

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setUseSimd__(boolean v)</span>




---

### setValidateUnicode

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setValidateUnicode__(boolean v)</span>




---

### setTrackPosition

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __setTrackPosition__(boolean v)</span>




---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [JsonConfig](../../../../../../../io/github/qishr/cascara/lang/json/util/JsonConfig.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../../../../../../../../cascara.common/io/github/qishr/cascara/common/util/Duplicable.md)


---

