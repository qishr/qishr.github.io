Package [io.github.qishr.cascara.ui.api](index.md)

# Class HighlightingToken
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.HighlightingToken<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __HighlightingToken__</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| HighlightingToken() |             |



## Method Summary

| Modifier and Type                                                                                                                       | Method                                                                                                                       | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                     | [getLexeme](#getlexeme)()                                                                                                    |             |
| public void                                                                                                                             | [setLexeme](#setlexeme)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lexeme) |             |
| public int                                                                                                                              | [getLine](#getline)()                                                                                                        |             |
| public void                                                                                                                             | [setLine](#setline)(int line)                                                                                                |             |
| public int                                                                                                                              | [getColumn](#getcolumn)()                                                                                                    |             |
| public void                                                                                                                             | [setColumn](#setcolumn)(int column)                                                                                          |             |
| public [Kind](HighlightingToken.Kind.md)                                                                                                | [getKind](#getkind)()                                                                                                        |             |
| public void                                                                                                                             | [setKind](#setkind)([Kind](HighlightingToken.Kind.md) kind)                                                                  |             |
| public int                                                                                                                              | [getStartIndex](#getstartindex)()                                                                                            |             |
| public void                                                                                                                             | [setStartIndex](#setstartindex)(int startIndex)                                                                              |             |
| public static [Kind](HighlightingToken.Kind.md)                                                                                         | [getKindForToken](#getkindfortoken)([Token](../../cascara.common/lang/token/Token.md) token)                                 |             |
| public static void                                                                                                                      | [init](#init)()                                                                                                              |             |
| public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Kind](HighlightingToken.Kind.md)> | [getKinds](#getkinds)()                                                                                                      |             |
| public static [Kind](HighlightingToken.Kind.md)                                                                                         | [getKind](#getkind)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)       |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                              | [getString](#getstring)([Kind](HighlightingToken.Kind.md) kind)                                                              |             |



## Method Details

### getLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLexeme__()</span>




---

### setLexeme

<span style="font-family: monospace; font-size: 80%;">public void __setLexeme__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lexeme)</span>




---

### getLine

<span style="font-family: monospace; font-size: 80%;">public int __getLine__()</span>




---

### setLine

<span style="font-family: monospace; font-size: 80%;">public void __setLine__(int line)</span>




---

### getColumn

<span style="font-family: monospace; font-size: 80%;">public int __getColumn__()</span>




---

### setColumn

<span style="font-family: monospace; font-size: 80%;">public void __setColumn__(int column)</span>




---

### getKind

<span style="font-family: monospace; font-size: 80%;">public [Kind](HighlightingToken.Kind.md) __getKind__()</span>




---

### setKind

<span style="font-family: monospace; font-size: 80%;">public void __setKind__([Kind](HighlightingToken.Kind.md) kind)</span>




---

### getStartIndex

<span style="font-family: monospace; font-size: 80%;">public int __getStartIndex__()</span>




---

### setStartIndex

<span style="font-family: monospace; font-size: 80%;">public void __setStartIndex__(int startIndex)</span>




---

### getKindForToken

<span style="font-family: monospace; font-size: 80%;">public static [Kind](HighlightingToken.Kind.md) __getKindForToken__([Token](../../cascara.common/lang/token/Token.md) token)</span>




---

### init

<span style="font-family: monospace; font-size: 80%;">public static void __init__()</span>




---

### getKinds

<span style="font-family: monospace; font-size: 80%;">public static [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[Kind](HighlightingToken.Kind.md)> __getKinds__()</span>




---

### getKind

<span style="font-family: monospace; font-size: 80%;">public static [Kind](HighlightingToken.Kind.md) __getKind__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getString

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([Kind](HighlightingToken.Kind.md) kind)</span>




---

