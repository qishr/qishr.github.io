Package [io.github.qishr.cascara.lang.json](index.md)

# Class JsonOptions
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.lang.util.LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<[io.github.qishr.cascara.lang.json.JsonOptions](JsonOptions.md)><br/>
                io.github.qishr.cascara.lang.json.JsonOptions<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __JsonOptions__<br/>extends [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)<[JsonOptions](JsonOptions.md)>
</span>


## Field Summary

| Modifier and Type | Field                         | Description |
|-------------------|-------------------------------|-------------|
| protected boolean | [insertSpaces](#insertspaces) |             |



## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| JsonOptions() |             |



## Method Summary

| Modifier and Type                    | Method                                           | Description                                             |
|--------------------------------------|--------------------------------------------------|---------------------------------------------------------|
| public boolean                       | [isAllowUnicode](#isallowunicode)()              |                                                         |
| public boolean                       | [isStrict](#isstrict)()                          |                                                         |
| public boolean                       | [isInsertSpaces](#isinsertspaces)()              |                                                         |
| public boolean                       | [isPrettyPrint](#isprettyprint)()                |                                                         |
| public [JsonOptions](JsonOptions.md) | [setAllowUnicode](#setallowunicode)(boolean val) | Sets whether unicode characters are allowed in scalars. |
| public [JsonOptions](JsonOptions.md) | [setStrict](#setstrict)(boolean val)             |                                                         |
| public [JsonOptions](JsonOptions.md) | [setInsertSpaces](#setinsertspaces)(boolean val) | Sets whether to use spaces or tabs for indentation.     |
| public [JsonOptions](JsonOptions.md) | [setPrettyPrint](#setprettyprint)(boolean v)     |                                                         |


### Methods inherited from [LanguageOptions](../../cascara.common/lang/util/LanguageOptions.md)

setIndentSize, getIndentSize


## Field Details

### insertSpaces

<span style="font-family: monospace; font-size: 80%;">protected boolean __insertSpaces__</span>




---


## Method Details

### isAllowUnicode

<span style="font-family: monospace; font-size: 80%;">public boolean __isAllowUnicode__()</span>




---

### isStrict

<span style="font-family: monospace; font-size: 80%;">public boolean __isStrict__()</span>




---

### isInsertSpaces

<span style="font-family: monospace; font-size: 80%;">public boolean __isInsertSpaces__()</span>




---

### isPrettyPrint

<span style="font-family: monospace; font-size: 80%;">public boolean __isPrettyPrint__()</span>




---

### setAllowUnicode

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setAllowUnicode__(boolean val)</span>

Sets whether unicode characters are allowed in scalars.


---

### setStrict

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setStrict__(boolean val)</span>




---

### setInsertSpaces

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setInsertSpaces__(boolean val)</span>

Sets whether to use spaces or tabs for indentation.


---

### setPrettyPrint

<span style="font-family: monospace; font-size: 80%;">public [JsonOptions](JsonOptions.md) __setPrettyPrint__(boolean v)</span>




---

