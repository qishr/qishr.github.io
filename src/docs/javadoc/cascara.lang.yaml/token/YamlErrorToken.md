Package [io.github.qishr.cascara.lang.yaml.token](index.md)

# Class YamlErrorToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.lang.yaml.token.YamlToken](YamlToken.md)<br/>
                io.github.qishr.cascara.lang.yaml.token.YamlErrorToken<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __YamlErrorToken__<br/>extends [YamlToken](YamlToken.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| YamlErrorToken(int line, int column, int offset, [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                      | Description |
|-------------------------------------------------------------------------------------------------------|-----------------------------|-------------|
| public [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md)                       | [getCode](#getcode)()       |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] | [getDetails](#getdetails)() |             |
| public [YamlTokenType](YamlTokenType.md)                                                              | [getType](#gettype)()       |             |


### Methods inherited from [YamlToken](YamlToken.md)

getOffset, setFollowedByTab, getLexeme, toString, setHasPreceedingNewLine, getStartColumn, getScalarStyle, getFirstLineIndent, getBlockIndent, getStartLine, getContent, setType, hasPreceedingNewLine, setStartsOnNewLine, startsOnNewLine, isFollowedByTab


## Method Details

### getCode

<span style="font-family: monospace; font-size: 80%;">public [DiagnosticCode](../../cascara.common/diagnostic/code/DiagnosticCode.md) __getCode__()</span>




---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>




---

### getType

<span style="font-family: monospace; font-size: 80%;">public [YamlTokenType](YamlTokenType.md) __getType__()</span>



**Overrides:**

[YamlToken](../cascara.lang.yaml/token/YamlToken.md#gettype)


---

