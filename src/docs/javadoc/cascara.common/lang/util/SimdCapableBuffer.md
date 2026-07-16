Package [io.github.qishr.cascara.common.lang.util](index.md)

# Interface SimdCapableBuffer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.SimdCapableBuffer<br/>
<br/>
All Implemented Interfaces:<br/>
    [SourceBuffer](SourceBuffer.md)

All Known Implementing Classes:<br/>
    [SourceStringBuffer](SourceStringBuffer.md), [JsonSimdCapableBuffer](../../../cascara.lang.json/token/JsonSimdCapableBuffer.md)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public interface __SimdCapableBuffer__</span>


## Method Summary

| Modifier and Type    | Method                                      | Description                                |
|----------------------|---------------------------------------------|--------------------------------------------|
| public abstract void | [skipWhitespaceSimd](#skipwhitespacesimd)() | Skips whitespace only (space, tab, CR, LF) |
| public abstract int  | [scanDigitsSimd](#scandigitssimd)(int pos)  |                                            |



## Method Details

### skipWhitespaceSimd

<span style="font-family: monospace; font-size: 80%;">public abstract void __skipWhitespaceSimd__()</span>

Skips whitespace only (space, tab, CR, LF)


---

### scanDigitsSimd

<span style="font-family: monospace; font-size: 80%;">public abstract int __scanDigitsSimd__(int pos)</span>




---

