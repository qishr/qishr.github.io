Package [io.github.qishr.cascara.common.semver](index.md)

# Class Token
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.semver.Tokenizer.Token<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.semver.Tokenizer](Tokenizer.md)


----

<span style="font-family: monospace; font-size: 80%;">protected static class __Token__</span>

A token in a requirement string.Has a type and a value if it is of type VERSION


## Field Summary

| Modifier and Type      | Field           | Description |
|------------------------|-----------------|-------------|
| public final TokenType | [type](#type)   |             |
| public String          | [value](#value) |             |



## Constructor Summary

| Constructor                                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Token([TokenType](Tokenizer.TokenType.md) type)                                                                                                     |             |
| Token([TokenType](Tokenizer.TokenType.md) type, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) |             |



## Method Summary

| Modifier and Type | Method                    | Description |
|-------------------|---------------------------|-------------|
| public void       | [append](#append)(char c) |             |



## Field Details

### type

<span style="font-family: monospace; font-size: 80%;">public final TokenType __type__</span>




---

### value

<span style="font-family: monospace; font-size: 80%;">public String __value__</span>




---


## Method Details

### append

<span style="font-family: monospace; font-size: 80%;">public void __append__(char c)</span>




---

