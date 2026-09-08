Package [io.github.qishr.cascara.common.lang.util](index.md)

# Interface SourceBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.SourceBuffer<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [SourceStringBuffer](SourceStringBuffer.md), [SourceInputStreamBuffer](SourceInputStreamBuffer.md), [JsonSourceBuffer](../../../cascara.lang.json/util/JsonSourceBuffer.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public interface __SourceBuffer__</span>


## Method Summary

| Modifier and Type                                                                                                        | Method                                                                                                                 | Description                                                            |
|--------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| public abstract [SourceBuffer](SourceBuffer.md)                                                                          | [open](#open)(byte[] data)                                                                                             |                                                                        |
| public abstract [SourceBuffer](SourceBuffer.md)                                                                          | [open](#open)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) data)       |                                                                        |
| public abstract [SourceBuffer](SourceBuffer.md)                                                                          | [open](#open)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)       |                                                                        |
| public abstract [SourceBuffer](SourceBuffer.md)                                                                          | [open](#open)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is) |                                                                        |
| public abstract char                                                                                                     | [advance](#advance)()                                                                                                  | Increases the offset by 1 and returns the character at the new offset. |
| public abstract char                                                                                                     | [peek](#peek)()                                                                                                        |                                                                        |
| public abstract char                                                                                                     | [peekNext](#peeknext)()                                                                                                |                                                                        |
| public abstract char                                                                                                     | [peekAhead](#peekahead)(int steps)                                                                                     |                                                                        |
| public abstract char                                                                                                     | [previous](#previous)()                                                                                                |                                                                        |
| public abstract void                                                                                                     | [backup](#backup)()                                                                                                    |                                                                        |
| public abstract boolean                                                                                                  | [isAtEnd](#isatend)()                                                                                                  |                                                                        |
| public abstract char                                                                                                     | [charAt](#charat)(int index)                                                                                           |                                                                        |
| public abstract [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) | [subSequence](#subsequence)(int start, int end)                                                                        |                                                                        |
| public abstract int                                                                                                      | [length](#length)()                                                                                                    |                                                                        |
| public abstract int                                                                                                      | [line](#line)()                                                                                                        |                                                                        |
| public abstract int                                                                                                      | [column](#column)()                                                                                                    |                                                                        |
| public abstract int                                                                                                      | [offset](#offset)()                                                                                                    |                                                                        |
| public abstract void                                                                                                     | [setOffset](#setoffset)(int newOffset)                                                                                 |                                                                        |
| public abstract void                                                                                                     | [startTokenWindow](#starttokenwindow)()                                                                                |                                                                        |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [getTokenWindowLexeme](#gettokenwindowlexeme)()                                                                        |                                                                        |
| public abstract int                                                                                                      | [windowStartOffset](#windowstartoffset)()                                                                              |                                                                        |
| public abstract int                                                                                                      | [windowStartLine](#windowstartline)()                                                                                  |                                                                        |
| public abstract int                                                                                                      | [windowStartColumn](#windowstartcolumn)()                                                                              |                                                                        |



## Method Details

### open

<span style="font-family: monospace; font-size: 80%;">public abstract [SourceBuffer](SourceBuffer.md) __open__(byte[] data)</span>




---

### open

<span style="font-family: monospace; font-size: 80%;">public abstract [SourceBuffer](SourceBuffer.md) __open__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) data)</span>




---

### open

<span style="font-family: monospace; font-size: 80%;">public abstract [SourceBuffer](SourceBuffer.md) __open__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader)</span>




---

### open

<span style="font-family: monospace; font-size: 80%;">public abstract [SourceBuffer](SourceBuffer.md) __open__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is)</span>




---

### advance

<span style="font-family: monospace; font-size: 80%;">public abstract char __advance__()</span>

Increases the offset by 1 and returns the character at the new offset.


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

### previous

<span style="font-family: monospace; font-size: 80%;">public abstract char __previous__()</span>




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

### setOffset

<span style="font-family: monospace; font-size: 80%;">public abstract void __setOffset__(int newOffset)</span>




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

