Package [io.github.qishr.cascara.common.lang.util](index.md)

# Class SourceInputStreamBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.SourceInputStreamBuffer<br/>
<br/>
All Implemented Interfaces:<br/>
    [SourceBuffer](SourceBuffer.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __SourceInputStreamBuffer__</span>


## Constructor Summary

| Constructor                                                                                                                      | Description |
|----------------------------------------------------------------------------------------------------------------------------------|-------------|
| SourceInputStreamBuffer([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is) |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                          | Description |
|-----------------------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public int                                                                                                      | [length](#length)()                             |             |
| public char                                                                                                     | [charAt](#charat)(int index)                    |             |
| public [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) | [subSequence](#subsequence)(int start, int end) |             |
| public char                                                                                                     | [advance](#advance)()                           |             |
| public char                                                                                                     | [peek](#peek)()                                 |             |
| public char                                                                                                     | [peekNext](#peeknext)()                         |             |
| public void                                                                                                     | [backup](#backup)()                             |             |
| public boolean                                                                                                  | [isAtEnd](#isatend)()                           |             |
| public int                                                                                                      | [line](#line)()                                 |             |
| public int                                                                                                      | [column](#column)()                             |             |
| public int                                                                                                      | [offset](#offset)()                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [getTokenWindowLexeme](#gettokenwindowlexeme)() |             |
| public char                                                                                                     | [peekAhead](#peekahead)(int steps)              |             |
| public void                                                                                                     | [startTokenWindow](#starttokenwindow)()         |             |
| public int                                                                                                      | [windowStartOffset](#windowstartoffset)()       |             |
| public int                                                                                                      | [windowStartLine](#windowstartline)()           |             |
| public int                                                                                                      | [windowStartColumn](#windowstartcolumn)()       |             |



## Method Details

### length

<span style="font-family: monospace; font-size: 80%;">public int __length__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### charAt

<span style="font-family: monospace; font-size: 80%;">public char __charAt__(int index)</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### subSequence

<span style="font-family: monospace; font-size: 80%;">public [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) __subSequence__(int start, int end)</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### advance

<span style="font-family: monospace; font-size: 80%;">public char __advance__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### peek

<span style="font-family: monospace; font-size: 80%;">public char __peek__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### peekNext

<span style="font-family: monospace; font-size: 80%;">public char __peekNext__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### backup

<span style="font-family: monospace; font-size: 80%;">public void __backup__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### isAtEnd

<span style="font-family: monospace; font-size: 80%;">public boolean __isAtEnd__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### line

<span style="font-family: monospace; font-size: 80%;">public int __line__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### column

<span style="font-family: monospace; font-size: 80%;">public int __column__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### offset

<span style="font-family: monospace; font-size: 80%;">public int __offset__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### getTokenWindowLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTokenWindowLexeme__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### peekAhead

<span style="font-family: monospace; font-size: 80%;">public char __peekAhead__(int steps)</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### startTokenWindow

<span style="font-family: monospace; font-size: 80%;">public void __startTokenWindow__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### windowStartOffset

<span style="font-family: monospace; font-size: 80%;">public int __windowStartOffset__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### windowStartLine

<span style="font-family: monospace; font-size: 80%;">public int __windowStartLine__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

### windowStartColumn

<span style="font-family: monospace; font-size: 80%;">public int __windowStartColumn__()</span>



**Specified By:**

[SourceBuffer](SourceBuffer.md)


---

