Package [io.github.qishr.cascara.lang.json.util](index.md)

# Class JsonOptions
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.util.LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<[io.github.qishr.cascara.lang.json.util.JsonOptions](JsonOptions.md)><br/>
                io.github.qishr.cascara.lang.json.util.JsonOptions<br/>
<br/>
All Implemented Interfaces:<br/>
    [Duplicable](../cascara.common/Duplicable.md)<[JsonOptions](JsonOptions.md)>

Direct Known Subtypes:<br/>
    [ImmutableJsonOptions](JsonOptions.ImmutableJsonOptions.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __JsonOptions__<br/>extends [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<[JsonOptions](JsonOptions.md)>
</span>


## Nested Class Summary

| Modifier and Type | Class                                                                                                          | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------|-------------|
| public static     | [io.github.qishr.cascara.lang.json.util.JsonOptions.ImmutableJsonOptions](JsonOptions.ImmutableJsonOptions.md) |             |



## Field Summary

| Modifier and Type                                                                                                                   | Field             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------|-------------------|-------------|
| public static final io.github.qishr.cascara.lang.json.util.@io.github.qishr.cascara.common.lang.annotation.Experimental JsonOptions | [JSON5](#json5)   |             |
| public static final JsonOptions                                                                                                     | [STRICT](#strict) |             |



## Constructor Summary

| Constructor                                         | Description |
|-----------------------------------------------------|-------------|
| JsonOptions()                                       |             |
| JsonOptions([JsonOptions](JsonOptions.md) original) |             |



## Method Summary

| Modifier and Type                    | Method                                                                   | Description                                             |
|--------------------------------------|--------------------------------------------------------------------------|---------------------------------------------------------|
| public boolean                       | [allowComments](#allowcomments)()                                        |                                                         |
| public boolean                       | [allowHexadecimalNumbers](#allowhexadecimalnumbers)()                    |                                                         |
| public boolean                       | [allowJson5Numbers](#allowjson5numbers)()                                |                                                         |
| public boolean                       | [allowSingleQuotedStrings](#allowsinglequotedstrings)()                  |                                                         |
| public boolean                       | [allowTrailingComma](#allowtrailingcomma)()                              |                                                         |
| public boolean                       | [allowUnicode](#allowunicode)()                                          |                                                         |
| public boolean                       | [allowUnquotedKeys](#allowunquotedkeys)()                                |                                                         |
| public boolean                       | [captureComments](#capturecomments)()                                    |                                                         |
| public boolean                       | [insertSpaces](#insertspaces)()                                          |                                                         |
| public boolean                       | [prettyPrint](#prettyprint)()                                            |                                                         |
| public boolean                       | [useSimd](#usesimd)()                                                    |                                                         |
| public boolean                       | [validateUnicode](#validateunicode)()                                    |                                                         |
| public boolean                       | [trackPosition](#trackposition)()                                        |                                                         |
| public int                           | [getDepthLimit](#getdepthlimit)()                                        |                                                         |
| public [JsonOptions](JsonOptions.md) | [setDepthLimit](#setdepthlimit)(int limit)                               |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowBooleanKeys](#setallowbooleankeys)(boolean val)                 |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowComments](#setallowcomments)(boolean val)                       |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowHexadecimalNumbers](#setallowhexadecimalnumbers)(boolean val)   |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowJson5Numbers](#setallowjson5numbers)(boolean val)               |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowSingleQuotedStrings](#setallowsinglequotedstrings)(boolean val) |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowTrailingComma](#setallowtrailingcomma)(boolean val)             |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowUnicode](#setallowunicode)(boolean val)                         | Sets whether unicode characters are allowed in scalars. |
| public [JsonOptions](JsonOptions.md) | [setAllowUnquotedKeys](#setallowunquotedkeys)(boolean val)               |                                                         |
| public [JsonOptions](JsonOptions.md) | [setCaptureComments](#setcapturecomments)(boolean val)                   |                                                         |
| public [JsonOptions](JsonOptions.md) | [setInsertSpaces](#setinsertspaces)(boolean val)                         | Sets whether to use spaces or tabs for indentation.     |
| public [JsonOptions](JsonOptions.md) | [setPrettyPrint](#setprettyprint)(boolean v)                             |                                                         |
| public [JsonOptions](JsonOptions.md) | [setUseSimd](#setusesimd)(boolean v)                                     |                                                         |
| public [JsonOptions](JsonOptions.md) | [setValidateUnicode](#setvalidateunicode)(boolean v)                     |                                                         |
| public [JsonOptions](JsonOptions.md) | [setTrackPosition](#settrackposition)(boolean v)                         |                                                         |
| public [JsonOptions](JsonOptions.md) | [duplicate](#duplicate)()                                                |                                                         |


### Methods inherited from [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)

setIndentSize, getIndentSize


## Field Details

### JSON5

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public static final io.github.qishr.cascara.lang.json.util.@io.github.qishr.cascara.common.lang.annotation.Experimental JsonOptions __JSON5__</span>




---

### STRICT

<span style="font-family: monospace; font-size: 80%;">public static final JsonOptions __STRICT__</span>




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

### getDepthLimit

<span style="font-family: monospace; font-size: 80%;">public int __getDepthLimit__()</span>




---

### setDepthLimit

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setDepthLimit__(int limit)</span>




---

### setAllowBooleanKeys

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowBooleanKeys__(boolean val)</span>




---

### setAllowComments

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowComments__(boolean val)</span>




---

### setAllowHexadecimalNumbers

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowHexadecimalNumbers__(boolean val)</span>




---

### setAllowJson5Numbers

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowJson5Numbers__(boolean val)</span>




---

### setAllowSingleQuotedStrings

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowSingleQuotedStrings__(boolean val)</span>




---

### setAllowTrailingComma

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowTrailingComma__(boolean val)</span>




---

### setAllowUnicode

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowUnicode__(boolean val)</span>

Sets whether unicode characters are allowed in scalars.


---

### setAllowUnquotedKeys

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowUnquotedKeys__(boolean val)</span>




---

### setCaptureComments

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setCaptureComments__(boolean val)</span>




---

### setInsertSpaces

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setInsertSpaces__(boolean val)</span>

Sets whether to use spaces or tabs for indentation.


---

### setPrettyPrint

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setPrettyPrint__(boolean v)</span>




---

### setUseSimd

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setUseSimd__(boolean v)</span>




---

### setValidateUnicode

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setValidateUnicode__(boolean v)</span>




---

### setTrackPosition

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setTrackPosition__(boolean v)</span>




---

### duplicate

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __duplicate__()</span>



**Specified By:**

[Duplicable](../cascara.common/Duplicable.md)


---

