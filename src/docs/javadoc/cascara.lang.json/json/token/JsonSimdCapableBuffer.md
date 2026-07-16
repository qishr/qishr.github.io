Package [io.github.qishr.cascara.lang.json.token](index.md)

# Interface JsonSimdCapableBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.json.token.JsonSimdCapableBuffer<br/>
<br/>
All Implemented Interfaces:<br/>
    [SimdCapableBuffer](../../../cascara.common/lang/util/SimdCapableBuffer.md)

All Known Implementing Classes:<br/>
    [JsonSourceByteBuffer](JsonSourceByteBuffer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __JsonSimdCapableBuffer__</span>


## Method Summary

| Modifier and Type    | Method                                                                | Description                    |
|----------------------|-----------------------------------------------------------------------|--------------------------------|
| public abstract int  | [scanStringAsciiSimd](#scanstringasciisimd)(int pos, byte quoteByte)  |                                |
| public abstract void | [skipWhitespaceAndFormattingSimd](#skipwhitespaceandformattingsimd)() | Skips whitespace and comments. |



## Method Details

### scanStringAsciiSimd

<span style="font-family: monospace; font-size: 80%;">public abstract int __scanStringAsciiSimd__(int pos, byte quoteByte)</span>




---

### skipWhitespaceAndFormattingSimd

<span style="font-family: monospace; font-size: 80%;">public abstract void __skipWhitespaceAndFormattingSimd__()</span>

Skips whitespace and comments.Suitable for JSON5.


---

