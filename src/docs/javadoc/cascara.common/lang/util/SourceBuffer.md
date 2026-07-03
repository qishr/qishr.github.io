Package [io.github.qishr.cascara.common.lang.util](index.md)

# Interface SourceBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.SourceBuffer<br/>
<br/>
All Known Implementing Classes:<br/>
    [SourceStringBuffer](SourceStringBuffer.md), [SourceInputStreamBuffer](SourceInputStreamBuffer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SourceBuffer__</span>


## Method Summary

| Modifier and Type                                                                                                        | Method                                          | Description |
|--------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public abstract char                                                                                                     | [advance](#advance)()                           |             |
| public abstract char                                                                                                     | [peek](#peek)()                                 |             |
| public abstract char                                                                                                     | [peekNext](#peeknext)()                         |             |
| public abstract char                                                                                                     | [peekAhead](#peekahead)(int steps)              |             |
| public abstract void                                                                                                     | [backup](#backup)()                             |             |
| public abstract boolean                                                                                                  | [isAtEnd](#isatend)()                           |             |
| public abstract char                                                                                                     | [charAt](#charat)(int index)                    |             |
| public abstract [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) | [subSequence](#subsequence)(int start, int end) |             |
| public abstract int                                                                                                      | [length](#length)()                             |             |
| public abstract int                                                                                                      | [line](#line)()                                 |             |
| public abstract int                                                                                                      | [column](#column)()                             |             |
| public abstract int                                                                                                      | [offset](#offset)()                             |             |
| public abstract void                                                                                                     | [startTokenWindow](#starttokenwindow)()         |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [getTokenWindowLexeme](#gettokenwindowlexeme)() |             |
| public abstract int                                                                                                      | [windowStartOffset](#windowstartoffset)()       |             |
| public abstract int                                                                                                      | [windowStartLine](#windowstartline)()           |             |
| public abstract int                                                                                                      | [windowStartColumn](#windowstartcolumn)()       |             |



## Method Details

### advance

<span style="font-family: monospace; font-size: 80%;">public abstract char __advance__()</span>




---

### peek

<span style="font-family: monospace; font-size: 80%;">public abstract char __peek__()</span>




---

### peekNext

<span style="font-family: monospace; font-size: 80%;">public abstract char __peekNext__()</span>




---

### peekAhead

<span style="font-family: monospace; font-size: 80%;">public abstract char __peekAhead__(int steps)</span>




---

### backup

<span style="font-family: monospace; font-size: 80%;">public abstract void __backup__()</span>




---

### isAtEnd

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isAtEnd__()</span>




---

### charAt

<span style="font-family: monospace; font-size: 80%;">public abstract char __charAt__(int index)</span>




---

### subSequence

<span style="font-family: monospace; font-size: 80%;">public abstract [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) __subSequence__(int start, int end)</span>




---

### length

<span style="font-family: monospace; font-size: 80%;">public abstract int __length__()</span>




---

### line

<span style="font-family: monospace; font-size: 80%;">public abstract int __line__()</span>




---

### column

<span style="font-family: monospace; font-size: 80%;">public abstract int __column__()</span>




---

### offset

<span style="font-family: monospace; font-size: 80%;">public abstract int __offset__()</span>




---

### startTokenWindow

<span style="font-family: monospace; font-size: 80%;">public abstract void __startTokenWindow__()</span>




---

### getTokenWindowLexeme

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTokenWindowLexeme__()</span>




---

### windowStartOffset

<span style="font-family: monospace; font-size: 80%;">public abstract int __windowStartOffset__()</span>




---

### windowStartLine

<span style="font-family: monospace; font-size: 80%;">public abstract int __windowStartLine__()</span>




---

### windowStartColumn

<span style="font-family: monospace; font-size: 80%;">public abstract int __windowStartColumn__()</span>




---

