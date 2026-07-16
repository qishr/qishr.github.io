Package [io.github.qishr.cascara.lang.json.token](index.md)

# Class JsonSourceByteBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.token.JsonSourceByteBuffer<br/>
<br/>
All Implemented Interfaces:<br/>
    [JsonSimdCapableBuffer](JsonSimdCapableBuffer.md), [LexemeProvider](../../../cascara.common/lang/util/LexemeProvider.md)


----

<span style="font-family: monospace; font-size: 80%;">public final class __JsonSourceByteBuffer__</span>


## Field Summary

| Modifier and Type           | Field                                 | Description |
|-----------------------------|---------------------------------------|-------------|
| public static final boolean | [VECTOR_AVAILABLE](#vector_available) |             |
| public final byte[]         | [raw](#raw)                           |             |



## Constructor Summary

| Constructor                                                                     | Description |
|---------------------------------------------------------------------------------|-------------|
| JsonSourceByteBuffer(byte[] raw, [JsonOptions](../util/JsonOptions.md) options) |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [slice](#slice)(int startOffset, int endOffset)                                                                                                                                    |             |
| public boolean                                                                                                  | [isAtEnd](#isatend)()                                                                                                                                                              |             |
| public byte                                                                                                     | [peekByte](#peekbyte)()                                                                                                                                                            |             |
| public byte                                                                                                     | [advanceByte](#advancebyte)()                                                                                                                                                      |             |
| public char                                                                                                     | [peekNext](#peeknext)()                                                                                                                                                            |             |
| public char                                                                                                     | [peekAhead](#peekahead)(int steps)                                                                                                                                                 |             |
| public char                                                                                                     | [peek](#peek)()                                                                                                                                                                    |             |
| public char                                                                                                     | [advance](#advance)()                                                                                                                                                              |             |
| public void                                                                                                     | [backup](#backup)()                                                                                                                                                                |             |
| public char                                                                                                     | [advanceWithTracking](#advancewithtracking)()                                                                                                                                      |             |
| public void                                                                                                     | [backupWithTracking](#backupwithtracking)()                                                                                                                                        |             |
| public int                                                                                                      | [offset](#offset)()                                                                                                                                                                |             |
| public void                                                                                                     | [setOffset](#setoffset)(int newOffset)                                                                                                                                             |             |
| public int                                                                                                      | [length](#length)()                                                                                                                                                                |             |
| public char                                                                                                     | [charAt](#charat)(int index)                                                                                                                                                       |             |
| public [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) | [subSequence](#subsequence)(int start, int end)                                                                                                                                    |             |
| public void                                                                                                     | [startTokenWindow](#starttokenwindow)()                                                                                                                                            |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [getTokenWindowLexeme](#gettokenwindowlexeme)()                                                                                                                                    |             |
| public int                                                                                                      | [windowStartOffset](#windowstartoffset)()                                                                                                                                          |             |
| public int                                                                                                      | [windowStartLine](#windowstartline)()                                                                                                                                              |             |
| public int                                                                                                      | [windowStartColumn](#windowstartcolumn)()                                                                                                                                          |             |
| public int                                                                                                      | [line](#line)()                                                                                                                                                                    |             |
| public int                                                                                                      | [column](#column)()                                                                                                                                                                |             |
| public void                                                                                                     | [skipWhitespaceSimd](#skipwhitespacesimd)()                                                                                                                                        | JSON Strict |
| public int                                                                                                      | [scanDigitsSimd](#scandigitssimd)(int pos)                                                                                                                                         |             |
| public int                                                                                                      | [scanStringAsciiSimd](#scanstringasciisimd)(int pos, byte quoteByte)                                                                                                               |             |
| public int                                                                                                      | [scanStructuralSimd](#scanstructuralsimd)(int pos)                                                                                                                                 |             |
| public void                                                                                                     | [skipWhitespaceAndFormattingSimd](#skipwhitespaceandformattingsimd)()                                                                                                              | JSON5       |
| public int                                                                                                      | [scanAsciiUntilUtf8LeadSimd](#scanasciiuntilutf8leadsimd)(int pos)                                                                                                                 |             |
| public int                                                                                                      | [scanIdentifierStartSimd](#scanidentifierstartsimd)(int pos)                                                                                                                       |             |
| public void                                                                                                     | [advanceBy](#advanceby)(int n)                                                                                                                                                     |             |
| public int                                                                                                      | [parseEightDigitsSIMD](#parseeightdigitssimd)(byte[] raw, int offset)                                                                                                              |             |
| public static boolean                                                                                           | [isVectorApiAvailable](#isvectorapiavailable)()                                                                                                                                    |             |
| public boolean                                                                                                  | [isEightDigitsSIMD](#iseightdigitssimd)(byte[] raw, int offset, int limit)                                                                                                         |             |
| public boolean                                                                                                  | [isEightDigits](#iseightdigits)(byte[] raw, int offset, int limit)                                                                                                                 |             |
| public int                                                                                                      | [parseEightDigits](#parseeightdigits)(byte[] raw, int offset)                                                                                                                      |             |
| public boolean                                                                                                  | [matchKeywordByte](#matchkeywordbyte)(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw)                     |             |
| public boolean                                                                                                  | [matchKeywordByte](#matchkeywordbyte)(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw, int relativeOffset) |             |



## Field Details

### VECTOR_AVAILABLE

<span style="font-family: monospace; font-size: 80%;">public static final boolean __VECTOR_AVAILABLE__</span>




---

### raw

<span style="font-family: monospace; font-size: 80%;">public final byte[] __raw__</span>




---


## Method Details

### slice

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __slice__(int startOffset, int endOffset)</span>



**Specified By:**

[LexemeProvider](../../../cascara.common/lang/util/LexemeProvider.md)


---

### isAtEnd

<span style="font-family: monospace; font-size: 80%;">public boolean __isAtEnd__()</span>




---

### peekByte

<span style="font-family: monospace; font-size: 80%;">public byte __peekByte__()</span>




---

### advanceByte

<span style="font-family: monospace; font-size: 80%;">public byte __advanceByte__()</span>




---

### peekNext

<span style="font-family: monospace; font-size: 80%;">public char __peekNext__()</span>




---

### peekAhead

<span style="font-family: monospace; font-size: 80%;">public char __peekAhead__(int steps)</span>




---

### peek

<span style="font-family: monospace; font-size: 80%;">public char __peek__()</span>




---

### advance

<span style="font-family: monospace; font-size: 80%;">public char __advance__()</span>




---

### backup

<span style="font-family: monospace; font-size: 80%;">public void __backup__()</span>




---

### advanceWithTracking

<span style="font-family: monospace; font-size: 80%;">public char __advanceWithTracking__()</span>




---

### backupWithTracking

<span style="font-family: monospace; font-size: 80%;">public void __backupWithTracking__()</span>




---

### offset

<span style="font-family: monospace; font-size: 80%;">public int __offset__()</span>




---

### setOffset

<span style="font-family: monospace; font-size: 80%;">public void __setOffset__(int newOffset)</span>




---

### length

<span style="font-family: monospace; font-size: 80%;">public int __length__()</span>




---

### charAt

<span style="font-family: monospace; font-size: 80%;">public char __charAt__(int index)</span>




---

### subSequence

<span style="font-family: monospace; font-size: 80%;">public [CharSequence](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/CharSequence.html) __subSequence__(int start, int end)</span>




---

### startTokenWindow

<span style="font-family: monospace; font-size: 80%;">public void __startTokenWindow__()</span>




---

### getTokenWindowLexeme

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTokenWindowLexeme__()</span>




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

### line

<span style="font-family: monospace; font-size: 80%;">public int __line__()</span>




---

### column

<span style="font-family: monospace; font-size: 80%;">public int __column__()</span>




---

### skipWhitespaceSimd

<span style="font-family: monospace; font-size: 80%;">public void __skipWhitespaceSimd__()</span>

JSON Strict


---

### scanDigitsSimd

<span style="font-family: monospace; font-size: 80%;">public int __scanDigitsSimd__(int pos)</span>




---

### scanStringAsciiSimd

<span style="font-family: monospace; font-size: 80%;">public int __scanStringAsciiSimd__(int pos, byte quoteByte)</span>



**Specified By:**

[JsonSimdCapableBuffer](JsonSimdCapableBuffer.md)


---

### scanStructuralSimd

<span style="font-family: monospace; font-size: 80%;">public int __scanStructuralSimd__(int pos)</span>




---

### skipWhitespaceAndFormattingSimd

<span style="font-family: monospace; font-size: 80%;">public void __skipWhitespaceAndFormattingSimd__()</span>

JSON5

**Specified By:**

[JsonSimdCapableBuffer](JsonSimdCapableBuffer.md)


---

### scanAsciiUntilUtf8LeadSimd

<span style="font-family: monospace; font-size: 80%;">public int __scanAsciiUntilUtf8LeadSimd__(int pos)</span>




---

### scanIdentifierStartSimd

<span style="font-family: monospace; font-size: 80%;">public int __scanIdentifierStartSimd__(int pos)</span>




---

### advanceBy

<span style="font-family: monospace; font-size: 80%;">public void __advanceBy__(int n)</span>




---

### parseEightDigitsSIMD

<span style="font-family: monospace; font-size: 80%;">public int __parseEightDigitsSIMD__(byte[] raw, int offset)</span>




---

### isVectorApiAvailable

<span style="font-family: monospace; font-size: 80%;">public static boolean __isVectorApiAvailable__()</span>




---

### isEightDigitsSIMD

<span style="font-family: monospace; font-size: 80%;">public boolean __isEightDigitsSIMD__(byte[] raw, int offset, int limit)</span>




---

### isEightDigits

<span style="font-family: monospace; font-size: 80%;">public boolean __isEightDigits__(byte[] raw, int offset, int limit)</span>




---

### parseEightDigits

<span style="font-family: monospace; font-size: 80%;">public int __parseEightDigits__(byte[] raw, int offset)</span>




---

### matchKeywordByte

<span style="font-family: monospace; font-size: 80%;">public boolean __matchKeywordByte__(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw)</span>




---

### matchKeywordByte

<span style="font-family: monospace; font-size: 80%;">public boolean __matchKeywordByte__(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw, int relativeOffset)</span>




---

