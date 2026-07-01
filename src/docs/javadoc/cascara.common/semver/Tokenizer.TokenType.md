Package [io.github.qishr.cascara.common.semver](index.md)

# Enum TokenType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.semver.Tokenizer.TokenType](Tokenizer.TokenType.md)><br/>
                io.github.qishr.cascara.common.semver.Tokenizer.TokenType<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.semver.Tokenizer](Tokenizer.md)


----

<span style="font-family: monospace; font-size: 80%;">protected static final enum __TokenType__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[TokenType](Tokenizer.TokenType.md)>
</span>

The different types of tokens (unary operators, binary operators, delimiters and versions)


##Enum Constants

| Enum Constant       | Description |
|---------------------|-------------|
| [TILDE](#tilde)     |             |
| [CARET](#caret)     |             |
| [EQ](#eq)           |             |
| [LT](#lt)           |             |
| [LTE](#lte)         |             |
| [GT](#gt)           |             |
| [GTE](#gte)         |             |
| [HYPHEN](#hyphen)   |             |
| [OR](#or)           |             |
| [AND](#and)         |             |
| [OPENING](#opening) |             |
| [CLOSING](#closing) |             |
| [VERSION](#version) |             |



## Field Summary

| Modifier and Type      | Field                   | Description |
|------------------------|-------------------------|-------------|
| public final Character | [character](#character) |             |
| public final Character | [character](#character) |             |



## Method Summary

| Modifier and Type                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [TokenType](Tokenizer.TokenType.md)[] | [values](#values)()                                                                                                    |             |
| public static [TokenType](Tokenizer.TokenType.md)   | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public boolean                                      | [isUnary](#isunary)()                                                                                                  |             |
| public boolean                                      | [supports](#supports)([SemVerType](SemVer.SemVerType.md) type)                                                         |             |



## Enum Constant Details

### TILDE

public static final  TILDE




---

### CARET

public static final  CARET




---

### EQ

public static final  EQ




---

### LT

public static final  LT




---

### LTE

public static final  LTE




---

### GT

public static final  GT




---

### GTE

public static final  GTE




---

### HYPHEN

public static final  HYPHEN




---

### OR

public static final  OR




---

### AND

public static final  AND




---

### OPENING

public static final  OPENING




---

### CLOSING

public static final  CLOSING




---

### VERSION

public static final  VERSION




---


## Field Details

### character

<span style="font-family: monospace; font-size: 80%;">public final Character __character__</span>




---

### character

<span style="font-family: monospace; font-size: 80%;">public final Character __character__</span>




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [TokenType](Tokenizer.TokenType.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [TokenType](Tokenizer.TokenType.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### isUnary

<span style="font-family: monospace; font-size: 80%;">public boolean __isUnary__()</span>




---

### supports

<span style="font-family: monospace; font-size: 80%;">public boolean __supports__([SemVerType](SemVer.SemVerType.md) type)</span>




---

