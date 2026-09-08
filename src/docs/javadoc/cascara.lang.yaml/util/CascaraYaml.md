Package [io.github.qishr.cascara.lang.yaml.util](index.md)

# Class CascaraYaml
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.util.CascaraYaml<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __CascaraYaml__</span>


## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                                                                                     | Description                                                   |
|------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|
| public static [SemVer](../../cascara.common/semver/SemVer.md)                                              | [getVersion](#getversion)()                                                                                                                                                                                                | Return the version of Cascara YAML.                           |
| public static [YamlSerializer](../processor/YamlSerializer.md)                                             | [newSerializer](#newserializer)()                                                                                                                                                                                          | Create a new YAML serializer instance.                        |
| public static [YamlNormalizer](../processor/YamlNormalizer.md)                                             | [newNormalizer](#newnormalizer)()                                                                                                                                                                                          | Create a new YAML normalizer instance.                        |
| public static [YamlAliasResolver](YamlAliasResolver.md)                                                    | [newResolver](#newresolver)()                                                                                                                                                                                              | Create a new YAML alias resolver instance.                    |
| public static T                                                                                            | [read](#read)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)       | Read YAML text into a JVM object of the given type.           |
| public static T                                                                                            | [read](#read)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)                                 | Read YAML text using a generic type reference.                |
| public static T                                                                                            | [read](#read)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)       | Read YAML from a Reader into a JVM object.                    |
| public static T                                                                                            | [read](#read)([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)                                 | Read JSON from a Reader using a generic type reference.       |
| public static T                                                                                            | [read](#read)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type) | Read YAML from an InputStream into a JVM object.              |
| public static T                                                                                            | [read](#read)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)                           | Read YAML from an InputStream using a generic type reference. |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [write](#write)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                                                                        | Write a JVM object to YAML text.                              |
| public static void                                                                                         | [write](#write)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)     | Write a JVM object to a Writer as YAML.                       |
| public static [YamlNode](../ast/YamlNode.md)                                                               | [toAst](#toast)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)                                                                                                        | Convert a JVM object into a YAML AST node.                    |
| public static T                                                                                            | [fromAst](#fromast)([YamlNode](../ast/YamlNode.md) ast, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)                                                                | Convert a YAML AST node into a JVM object.                    |
| public static T                                                                                            | [fromAst](#fromast)([YamlNode](../ast/YamlNode.md) ast, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)                                                                                          | Convert a YAML AST node using a generic type reference.       |
| public static [YamlNode](../ast/YamlNode.md)                                                               | [normalize](#normalize)([YamlNode](../ast/YamlNode.md) node)                                                                                                                                                               |                                                               |
| public static [YamlNode](../ast/YamlNode.md)                                                               | [resolve](#resolve)([YamlNode](../ast/YamlNode.md) node)                                                                                                                                                                   |                                                               |
| public static [YamlStream](../ast/YamlStream.md)                                                           | [resolve](#resolve)([YamlStream](../ast/YamlStream.md) node)                                                                                                                                                               |                                                               |



## Method Details

### getVersion

<span style="font-family: monospace; font-size: 80%;">public static [SemVer](../../cascara.common/semver/SemVer.md) __getVersion__()</span>

Return the version of Cascara YAML.


---

### newSerializer

<span style="font-family: monospace; font-size: 80%;">public static [YamlSerializer](../processor/YamlSerializer.md) __newSerializer__()</span>

Create a new YAML serializer instance.


---

### newNormalizer

<span style="font-family: monospace; font-size: 80%;">public static [YamlNormalizer](../processor/YamlNormalizer.md) __newNormalizer__()</span>

Create a new YAML normalizer instance.


---

### newResolver

<span style="font-family: monospace; font-size: 80%;">public static [YamlAliasResolver](YamlAliasResolver.md) __newResolver__()</span>

Create a new YAML alias resolver instance.


---

### read

<span style="font-family: monospace; font-size: 80%;">public static T __read__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)</span>

Read YAML text into a JVM object of the given type.


---

### read

<span style="font-family: monospace; font-size: 80%;">public static T __read__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)</span>

Read YAML text using a generic type reference.


---

### read

<span style="font-family: monospace; font-size: 80%;">public static T __read__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)</span>

Read YAML from a Reader into a JVM object.


---

### read

<span style="font-family: monospace; font-size: 80%;">public static T __read__([Reader](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Reader.html) reader, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)</span>

Read JSON from a Reader using a generic type reference.


---

### read

<span style="font-family: monospace; font-size: 80%;">public static T __read__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)</span>

Read YAML from an InputStream into a JVM object.


---

### read

<span style="font-family: monospace; font-size: 80%;">public static T __read__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) is, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)</span>

Read YAML from an InputStream using a generic type reference.


---

### write

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __write__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>

Write a JVM object to YAML text.


---

### write

<span style="font-family: monospace; font-size: 80%;">public static void __write__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value, [Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)</span>

Write a JVM object to a Writer as YAML.

**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### toAst

<span style="font-family: monospace; font-size: 80%;">public static [YamlNode](../ast/YamlNode.md) __toAst__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) value)</span>

Convert a JVM object into a YAML AST node.


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public static T __fromAst__([YamlNode](../ast/YamlNode.md) ast, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> type)</span>

Convert a YAML AST node into a JVM object.


---

### fromAst

<span style="font-family: monospace; font-size: 80%;">public static T __fromAst__([YamlNode](../ast/YamlNode.md) ast, [TypeReference](../../cascara.common/lang/type/TypeReference.md)<T> type)</span>

Convert a YAML AST node using a generic type reference.


---

### normalize

<span style="font-family: monospace; font-size: 80%;">public static [YamlNode](../ast/YamlNode.md) __normalize__([YamlNode](../ast/YamlNode.md) node)</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public static [YamlNode](../ast/YamlNode.md) __resolve__([YamlNode](../ast/YamlNode.md) node)</span>




---

### resolve

<span style="font-family: monospace; font-size: 80%;">public static [YamlStream](../ast/YamlStream.md) __resolve__([YamlStream](../ast/YamlStream.md) node)</span>




---

