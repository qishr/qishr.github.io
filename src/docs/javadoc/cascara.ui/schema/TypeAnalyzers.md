Package [io.github.qishr.cascara.ui.schema](index.md)

# Class TypeAnalyzers
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.schema.TypeAnalyzers<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __TypeAnalyzers__</span>


## Method Summary

| Modifier and Type                                                                                                                                                                                                                                          | Method                                                                                                                                                                                            | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [TypeAnalyzers](TypeAnalyzers.md)                                                                                                                                                                                                            | [instance](#instance)()                                                                                                                                                                           |             |
| public static [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [TypeAnalyzer](../cascara.schema/util/TypeAnalyzer.md)> | [getAnalyzers](#getanalyzers)()                                                                                                                                                                   |             |
| public static void                                                                                                                                                                                                                                         | [register](#register)([TypeAnalyzer](../cascara.schema/util/TypeAnalyzer.md) analyazer)                                                                                                           |             |
| public static boolean                                                                                                                                                                                                                                      | [isRegistered](#isregistered)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [TypeAnalyzer](../cascara.schema/util/TypeAnalyzer.md)> clazz) |             |
| public static [SchemaResolver](../cascara.schema/util/SchemaResolver.md)                                                                                                                                                                                   | [getSchemaResolver](#getschemaresolver)()                                                                                                                                                         |             |
| public static void                                                                                                                                                                                                                                         | [setSchemaResolver](#setschemaresolver)([SchemaResolver](../cascara.schema/util/SchemaResolver.md) resolver)                                                                                      |             |



## Method Details

### instance

<span style="font-family: monospace; font-size: 80%;">public static [TypeAnalyzers](TypeAnalyzers.md) __instance__()</span>




---

### getAnalyzers

<span style="font-family: monospace; font-size: 80%;">public static [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [TypeAnalyzer](../cascara.schema/util/TypeAnalyzer.md)> __getAnalyzers__()</span>




---

### register

<span style="font-family: monospace; font-size: 80%;">public static void __register__([TypeAnalyzer](../cascara.schema/util/TypeAnalyzer.md) analyazer)</span>




---

### isRegistered

<span style="font-family: monospace; font-size: 80%;">public static boolean __isRegistered__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [TypeAnalyzer](../cascara.schema/util/TypeAnalyzer.md)> clazz)</span>




---

### getSchemaResolver

<span style="font-family: monospace; font-size: 80%;">public static [SchemaResolver](../cascara.schema/util/SchemaResolver.md) __getSchemaResolver__()</span>




---

### setSchemaResolver

<span style="font-family: monospace; font-size: 80%;">public static void __setSchemaResolver__([SchemaResolver](../cascara.schema/util/SchemaResolver.md) resolver)</span>




---

