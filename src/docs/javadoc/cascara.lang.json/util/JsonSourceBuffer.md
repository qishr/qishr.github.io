Package [io.github.qishr.cascara.lang.json.util](index.md)

# Interface JsonSourceBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.util.JsonSourceBuffer<br/>
<br/>
All Implemented Interfaces:<br/>
    [SourceBuffer](../../cascara.common/lang/util/SourceBuffer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __JsonSourceBuffer__</span>


## Method Summary

| Modifier and Type                                       | Method                                                                                                                                                                             | Description                    |
|---------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------|
| public abstract [JsonSourceBuffer](JsonSourceBuffer.md) | [setOptions](#setoptions)([SourceBufferOptions](../../cascara.common/lang/util/SourceBufferOptions.md) options)                                                                    |                                |
| public abstract void                                    | [skipWhitespaceSimd](#skipwhitespacesimd)()                                                                                                                                        |                                |
| public abstract byte                                    | [peekByte](#peekbyte)()                                                                                                                                                            |                                |
| public abstract byte                                    | [advanceByte](#advancebyte)()                                                                                                                                                      |                                |
| public abstract char                                    | [advanceWithTracking](#advancewithtracking)()                                                                                                                                      |                                |
| public abstract void                                    | [backupWithTracking](#backupwithtracking)()                                                                                                                                        |                                |
| public abstract int                                     | [scanStructuralSimd](#scanstructuralsimd)(int pos)                                                                                                                                 |                                |
| public abstract int                                     | [scanAsciiUntilUtf8LeadSimd](#scanasciiuntilutf8leadsimd)(int pos)                                                                                                                 |                                |
| public abstract int                                     | [scanIdentifierStartSimd](#scanidentifierstartsimd)(int pos)                                                                                                                       |                                |
| public abstract void                                    | [advanceBy](#advanceby)(int n)                                                                                                                                                     |                                |
| public abstract int                                     | [parseEightDigitsSIMD](#parseeightdigitssimd)(byte[] raw, int offset)                                                                                                              |                                |
| public abstract boolean                                 | [isEightDigitsSIMD](#iseightdigitssimd)(byte[] raw, int offset, int limit)                                                                                                         |                                |
| public abstract boolean                                 | [isEightDigits](#iseightdigits)(byte[] raw, int offset, int limit)                                                                                                                 |                                |
| public abstract int                                     | [parseEightDigits](#parseeightdigits)(byte[] raw, int offset)                                                                                                                      |                                |
| public abstract boolean                                 | [matchKeywordByte](#matchkeywordbyte)(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw)                     |                                |
| public abstract boolean                                 | [matchKeywordByte](#matchkeywordbyte)(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw, int relativeOffset) |                                |
| public abstract int                                     | [scanDigitsSimd](#scandigitssimd)(int pos)                                                                                                                                         |                                |
| public abstract int                                     | [scanStringAsciiSimd](#scanstringasciisimd)(int pos, byte quoteByte)                                                                                                               |                                |
| public abstract void                                    | [skipWhitespaceAndFormattingSimd](#skipwhitespaceandformattingsimd)()                                                                                                              | Skips whitespace and comments. |
| public abstract void                                    | [scanIdentifierSimd](#scanidentifiersimd)()                                                                                                                                        |                                |
| public abstract byte[]                                  | [getBytes](#getbytes)()                                                                                                                                                            |                                |



## Method Details

### setOptions

<span style="font-family: monospace; font-size: 80%;">public abstract [JsonSourceBuffer](JsonSourceBuffer.md) __setOptions__([SourceBufferOptions](../../cascara.common/lang/util/SourceBufferOptions.md) options)</span>




---

### skipWhitespaceSimd

<span style="font-family: monospace; font-size: 80%;">public abstract void __skipWhitespaceSimd__()</span>




---

### peekByte

<span style="font-family: monospace; font-size: 80%;">public abstract byte __peekByte__()</span>




---

### advanceByte

<span style="font-family: monospace; font-size: 80%;">public abstract byte __advanceByte__()</span>




---

### advanceWithTracking

<span style="font-family: monospace; font-size: 80%;">public abstract char __advanceWithTracking__()</span>




---

### backupWithTracking

<span style="font-family: monospace; font-size: 80%;">public abstract void __backupWithTracking__()</span>




---

### scanStructuralSimd

<span style="font-family: monospace; font-size: 80%;">public abstract int __scanStructuralSimd__(int pos)</span>




---

### scanAsciiUntilUtf8LeadSimd

<span style="font-family: monospace; font-size: 80%;">public abstract int __scanAsciiUntilUtf8LeadSimd__(int pos)</span>




---

### scanIdentifierStartSimd

<span style="font-family: monospace; font-size: 80%;">public abstract int __scanIdentifierStartSimd__(int pos)</span>




---

### advanceBy

<span style="font-family: monospace; font-size: 80%;">public abstract void __advanceBy__(int n)</span>




---

### parseEightDigitsSIMD

<span style="font-family: monospace; font-size: 80%;">public abstract int __parseEightDigitsSIMD__(byte[] raw, int offset)</span>




---

### isEightDigitsSIMD

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isEightDigitsSIMD__(byte[] raw, int offset, int limit)</span>




---

### isEightDigits

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isEightDigits__(byte[] raw, int offset, int limit)</span>




---

### parseEightDigits

<span style="font-family: monospace; font-size: 80%;">public abstract int __parseEightDigits__(byte[] raw, int offset)</span>




---

### matchKeywordByte

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __matchKeywordByte__(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw)</span>




---

### matchKeywordByte

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __matchKeywordByte__(byte[] raw, int offset, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kw, int relativeOffset)</span>




---

### scanDigitsSimd

<span style="font-family: monospace; font-size: 80%;">public abstract int __scanDigitsSimd__(int pos)</span>




---

### scanStringAsciiSimd

<span style="font-family: monospace; font-size: 80%;">public abstract int __scanStringAsciiSimd__(int pos, byte quoteByte)</span>




---

### skipWhitespaceAndFormattingSimd

<span style="font-family: monospace; font-size: 80%;">public abstract void __skipWhitespaceAndFormattingSimd__()</span>

Skips whitespace and comments.Suitable for JSON5.


---

### scanIdentifierSimd

<span style="font-family: monospace; font-size: 80%;">public abstract void __scanIdentifierSimd__()</span>




---

### getBytes

<span style="font-family: monospace; font-size: 80%;">public abstract byte[] __getBytes__()</span>




---

