Package [io.github.qishr.cascara.ui.api](index.md)

# Interface TextEditor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.TextEditor<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __TextEditor__</span>


## Method Summary

| Modifier and Type                                   | Method                                                                                                                                                                                               | Description |
|-----------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract void                                | [initialize](#initialize)()                                                                                                                                                                          |             |
| public abstract [TextBuffer](../data/TextBuffer.md) | [getTextBuffer](#gettextbuffer)()                                                                                                                                                                    |             |
| public abstract void                                | [setTextBuffer](#settextbuffer)([TextBuffer](../data/TextBuffer.md) buffer)                                                                                                                          |             |
| public abstract void                                | [scrollTo](#scrollto)(int line)                                                                                                                                                                      |             |
| public abstract void                                | [scrollTo](#scrollto)(int line, int column)                                                                                                                                                          |             |
| public abstract void                                | [setHighlights](#sethighlights)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[HighlightingToken](HighlightingToken.md)> tokens)                          |             |
| public abstract void                                | [setDiagnostics](#setdiagnostics)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../cascara.common/diagnostic/Diagnostic.md)> diagnostics) |             |



## Method Details

### initialize

<span style="font-family: monospace; font-size: 80%;">public abstract void __initialize__()</span>




---

### getTextBuffer

<span style="font-family: monospace; font-size: 80%;">public abstract [TextBuffer](../data/TextBuffer.md) __getTextBuffer__()</span>




---

### setTextBuffer

<span style="font-family: monospace; font-size: 80%;">public abstract void __setTextBuffer__([TextBuffer](../data/TextBuffer.md) buffer)</span>




---

### scrollTo

<span style="font-family: monospace; font-size: 80%;">public abstract void __scrollTo__(int line)</span>




---

### scrollTo

<span style="font-family: monospace; font-size: 80%;">public abstract void __scrollTo__(int line, int column)</span>




---

### setHighlights

<span style="font-family: monospace; font-size: 80%;">public abstract void __setHighlights__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[HighlightingToken](HighlightingToken.md)> tokens)</span>




---

### setDiagnostics

<span style="font-family: monospace; font-size: 80%;">public abstract void __setDiagnostics__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Diagnostic](../../cascara.common/diagnostic/Diagnostic.md)> diagnostics)</span>




---

