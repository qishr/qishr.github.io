Package [io.github.qishr.cascara.common.semver](index.md)

# Class Tokenizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.semver.Tokenizer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Tokenizer__</span>

Utility class to convert a NPM requirement string into a list of tokens.


## Nested Class Summary

| Modifier and Type | Class                                                                       | Description                      |
|-------------------|-----------------------------------------------------------------------------|----------------------------------|
| protected static  | [io.github.qishr.cascara.common.semver.Tokenizer.Token](Tokenizer.Token.md) | A token in a requirement string. |



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| Tokenizer() |             |



## Method Summary

| Modifier and Type                                                                                                                      | Method                                                                                                                                                                   | Description                                                                                                                                                                                                                                                     |
|----------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Token](Tokenizer.Token.md)> | [tokenize](#tokenize)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement, [SemVerType](SemVer.SemVerType.md) type) | Takes a NPM requirement string and creates a list of tokens by performing 3 operations: - If the token is a version, it will add the version string - If the token is an operator, it will add the operator - It will insert missing "AND" operators for ranges |



## Method Details

### tokenize

<span style="font-family: monospace; font-size: 80%;">protected static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Token](Tokenizer.Token.md)> __tokenize__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement, [SemVerType](SemVer.SemVerType.md) type)</span>

Takes a NPM requirement string and creates a list of tokens by performing 3 operations:
- If the token is a version, it will add the version string
- If the token is an operator, it will add the operator
- It will insert missing "AND" operators for ranges

**Parameters:**

`requirement` - the requirement string

`type` - the version system used when tokenizing the requirement

**Returns:**

the list of tokens


---

