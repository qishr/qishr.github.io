Package [io.github.qishr.cascara.schema.util](index.md)

# Interface TypeAnalyzer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.util.TypeAnalyzer<br/>
<br/>
All Known Implementing Classes:<br/>
    [UiTypeAnalyzer](../../cascara.ui/UiTypeAnalyzer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TypeAnalyzer__</span>


## Method Summary

| Modifier and Type    | Method                                                                                                                                                                                                                  | Description                                                                                  |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| public abstract void | [analyze](#analyze)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field, [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) targetAst) | Inspects a field and adds "hints" to the MapAstNode being built before the compiler sees it. |
| public abstract void | [analyze](#analyze)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) targetAst)      |                                                                                              |



## Method Details

### analyze

<span style="font-family: monospace; font-size: 80%;">public abstract void __analyze__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field, [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) targetAst)</span>

Inspects a field and adds "hints" to the MapAstNode
being built before the compiler sees it.


---

### analyze

<span style="font-family: monospace; font-size: 80%;">public abstract void __analyze__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> clazz, [ReferenceMapNode](../../../cascara.common/lang/reference/ReferenceMapNode.md) targetAst)</span>




---

