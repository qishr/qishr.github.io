Package [io.github.qishr.cascara.common.lang.util](index.md)

# Class SourceStringBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.SourceStringBuffer<br/>
<br/>
All Implemented Interfaces:<br/>
    [SimdCapableBuffer](SimdCapableBuffer.md), [LexemeProvider](LexemeProvider.md), [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public class __SourceStringBuffer__</span>


## Constructor Summary

| Constructor                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------|-------------|
| SourceStringBuffer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) source) |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                          | Description |
|-----------------------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [slice](#slice)(int startOffset, int endOffset) |             |
| public int                                                                                                      | [length](#length)()                             |             |
| public char                                                                                                     | [charAt](#charat)(int index)                    |             |
| public [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) | [subSequence](#subsequence)(int start, int end) |             |
| public char                                                                                                     | [advance](#advance)()                           |             |
| public char                                                                                                     | [peekAhead](#peekahead)(int steps)              |             |
| public char                                                                                                     | [peek](#peek)()                                 |             |
| public char                                                                                                     | [peekNext](#peeknext)()                         |             |
| public void                                                                                                     | [backup](#backup)()                             |             |
| public boolean                                                                                                  | [isAtEnd](#isatend)()                           |             |
| public int                                                                                                      | [line](#line)()                                 |             |
| public int                                                                                                      | [column](#column)()                             |             |
| public int                                                                                                      | [offset](#offset)()                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [getTokenWindowLexeme](#gettokenwindowlexeme)() |             |
| public void                                                                                                     | [startTokenWindow](#starttokenwindow)()         |             |
| public int                                                                                                      | [windowStartOffset](#windowstartoffset)()       |             |
| public int                                                                                                      | [windowStartLine](#windowstartline)()           |             |
| public int                                                                                                      | [windowStartColumn](#windowstartcolumn)()       |             |
| public void                                                                                                     | [skipWhitespaceSimd](#skipwhitespacesimd)()     |             |
| public int                                                                                                      | [scanDigitsSimd](#scandigitssimd)(int pos)      |             |
| public void                                                                                                     | [setOffset](#setoffset)(int newOffset)          |             |
| public void                                                                                                     | [advanceBy](#advanceby)(int n)                  |             |



## Method Details

### slice

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __slice__(int startOffset, int endOffset)</span>



**Specified By:**

[LexemeProvider](LexemeProvider.md)


---

### length

<span style="font-family: monospace; font-size: 80%;">public int __length__()</span>



**Specified By:**

[CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html)


---

### charAt

<span style="font-family: monospace; font-size: 80%;">public char __charAt__(int index)</span>




---

### subSequence

<span style="font-family: monospace; font-size: 80%;">public [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) __subSequence__(int start, int end)</span>




---

### advance

<span style="font-family: monospace; font-size: 80%;">public char __advance__()</span>




---

### peekAhead

<span style="font-family: monospace; font-size: 80%;">public char __peekAhead__(int steps)</span>




---

### peek

<span style="font-family: monospace; font-size: 80%;">public char __peek__()</span>




---

### peekNext

<span style="font-family: monospace; font-size: 80%;">public char __peekNext__()</span>




---

### backup

<span style="font-family: monospace; font-size: 80%;">public void __backup__()</span>




---

### isAtEnd

<span style="font-family: monospace; font-size: 80%;">public boolean __isAtEnd__()</span>




---

### line

<span style="font-family: monospace; font-size: 80%;">public int __line__()</span>




---

### column

<span style="font-family: monospace; font-size: 80%;">public int __column__()</span>




---

### offset

<span style="font-family: monospace; font-size: 80%;">public int __offset__()</span>




---

### getTokenWindowLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTokenWindowLexeme__()</span>




---

### startTokenWindow

<span style="font-family: monospace; font-size: 80%;">public void __startTokenWindow__()</span>




---

### windowStartOffset

<span style="font-family: monospace; font-size: 80%;">public int __windowStartOffset__()</span>




---

### windowStartLine

<span style="font-family: monospace; font-size: 80%;">public int __windowStartLine__()</span>




---

### windowStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __windowStartColumn__()</span>




---

### skipWhitespaceSimd

<span style="font-family: monospace; font-size: 80%;">public void __skipWhitespaceSimd__()</span>



**Specified By:**

[SimdCapableBuffer](SimdCapableBuffer.md)


---

### scanDigitsSimd

<span style="font-family: monospace; font-size: 80%;">public int __scanDigitsSimd__(int pos)</span>



**Specified By:**

[SimdCapableBuffer](SimdCapableBuffer.md)


---

### setOffset

<span style="font-family: monospace; font-size: 80%;">public void __setOffset__(int newOffset)</span>




---

### advanceBy

<span style="font-family: monospace; font-size: 80%;">public void __advanceBy__(int n)</span>




---

