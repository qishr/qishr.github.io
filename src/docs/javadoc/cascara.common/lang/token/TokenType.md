Package [io.github.qishr.cascara.common.lang.token](index.md)

# Interface TokenType
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.token.TokenType<br/>
<br/>
All Known Implementing Classes:<br/>
    [JsonTokenType](../../../cascara.lang.json/token/JsonTokenType.md), [XmlTokenType](../../../cascara.lang.xml/token/XmlTokenType.md), [YamlTokenType](../../../cascara.lang.yaml/token/YamlTokenType.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __TokenType__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                        | Description                                                                               |
|--------------------------------------------------------------------------------------------------------------|-------------------------------|-------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getId](#getid)()             | A stable, language\u2011specific identifier (e.g. "JAVA_IF", "YAML_KEY", "XML_TAG_NAME"). |
| public abstract [TokenCategory](TokenCategory.md)                                                            | [getCategory](#getcategory)() | The language\u2011agnostic category used by editors and highlighters.                     |



## Method Details

### getId

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getId__()</span>

A stable, language\u2011specific identifier (e.g. "JAVA_IF", "YAML_KEY", "XML_TAG_NAME").


---

### getCategory

<span style="font-family: monospace; font-size: 80%;">public abstract [TokenCategory](TokenCategory.md) __getCategory__()</span>

The language\u2011agnostic category used by editors and highlighters.


---

