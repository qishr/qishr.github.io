Package [io.github.qishr.cascara.ui.api](index.md)

# Interface SyntaxHighlighter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.api.SyntaxHighlighter<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../../../../../../cascara.common/io/github/qishr/cascara/common/service/ServiceProvider.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SyntaxHighlighter__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                               | Method                                                                                                                | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> | [getSupportedContentTypes](#getsupportedcontenttypes)()                                                               |             |
| public abstract void                                                                                                                                                                                            | [setTextBuffer](#settextbuffer)([TextBuffer](../../../../../../io/github/qishr/cascara/ui/data/TextBuffer.md) buffer) |             |
| public abstract [TextBuffer](../../../../../../io/github/qishr/cascara/ui/data/TextBuffer.md)                                                                                                                   | [getTextBuffer](#gettextbuffer)()                                                                                     |             |
| public abstract boolean                                                                                                                                                                                         | [supportsSemanticHighlighting](#supportssemantichighlighting)()                                                       |             |
| public abstract [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)<[HighlightingToken](../../../../../../io/github/qishr/cascara/ui/api/HighlightingToken.md)>  | [getHighlightingTokens](#gethighlightingtokens)()                                                                     |             |



## Method Details

### getSupportedContentTypes

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ContentType](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/ContentType.md)> __getSupportedContentTypes__()</span>




---

### setTextBuffer

<span style="font-family: monospace; font-size: 80%;">public abstract void __setTextBuffer__([TextBuffer](../../../../../../io/github/qishr/cascara/ui/data/TextBuffer.md) buffer)</span>




---

### getTextBuffer

<span style="font-family: monospace; font-size: 80%;">public abstract [TextBuffer](../../../../../../io/github/qishr/cascara/ui/data/TextBuffer.md) __getTextBuffer__()</span>




---

### supportsSemanticHighlighting

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __supportsSemanticHighlighting__()</span>




---

### getHighlightingTokens

<span style="font-family: monospace; font-size: 80%;">public abstract [ObservableList](https://openjfx.io/javadoc/25/javafx.base/javafx/collections/ObservableList.html)<[HighlightingToken](../../../../../../io/github/qishr/cascara/ui/api/HighlightingToken.md)> __getHighlightingTokens__()</span>




---

