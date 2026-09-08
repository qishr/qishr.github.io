Package [io.github.qishr.cascara.common.util](index.md)

# Interface IHelpSectionRenderer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IHelpSectionRenderer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IHelpSectionRenderer__</span>

Renders a section of the usage help message.The usage help message can be customized:
use the #setHelpSectionKeys(List) and #setHelpSectionMap(Map) to change the order of sections,
delete standard sections, add custom sections or replace the renderer of a standard sections with a custom one.



This gives complete freedom on how a usage help message section is rendered, but it also means that the section renderer
is responsible for all aspects of rendering the section, including layout and emitting ANSI escape codes.
The Help.TextTable and Help.Ansi.Text classes, and the CommandLine.Help.Ansi#string(String) and CommandLine.Help.Ansi#text(String) methods may be useful.



## Method Summary

| Modifier and Type                                                                                            | Method                                              | Description                                                                                                                          |
|--------------------------------------------------------------------------------------------------------------|-----------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [render](#render)([Help](CommandLine.Help.md) help) | Renders a section of the usage help, like header heading, header, synopsis heading, synopsis, description heading, description, etc. |



## Method Details

### render

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __render__([Help](CommandLine.Help.md) help)</span>

Renders a section of the usage help, like header heading, header, synopsis heading,
synopsis, description heading, description, etc.

**Parameters:**

`help` - the `Help` instance for which to render a section

**Returns:**

the text for this section; may contain ANSI escape codes

**Since:**

3.9


---

