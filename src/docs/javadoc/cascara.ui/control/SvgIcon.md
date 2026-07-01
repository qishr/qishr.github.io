Package [io.github.qishr.cascara.ui.control](index.md)

# Class SvgIcon
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.StackPane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/StackPane.html)<br/>
                                                io.github.qishr.cascara.ui.control.SvgIcon<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SvgIcon__<br/>extends [StackPane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/StackPane.html)
</span>


## Constructor Summary

| Constructor                                                                                                               | Description |
|---------------------------------------------------------------------------------------------------------------------------|-------------|
| SvgIcon([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) svgSource, int size) |             |
| SvgIcon()                                                                                                                 |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                     | Description                   |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------|
| public void       | [setSize](#setsize)(int size)                                                                                                              |                               |
| public void       | [loadFromSource](#loadfromsource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) svgContent) |                               |
| public void       | [setBadge](#setbadge)([Badge](Badge.md) badgeInfo)                                                                                         | Attaches a badge to the icon. |
| public void       | [setSource](#setsource)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) svgSource)            |                               |



## Method Details

### setSize

<span style="font-family: monospace; font-size: 80%;">public void __setSize__(int size)</span>




---

### loadFromSource

<span style="font-family: monospace; font-size: 80%;">public void __loadFromSource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) svgContent)</span>




---

### setBadge

<span style="font-family: monospace; font-size: 80%;">public void __setBadge__([Badge](Badge.md) badgeInfo)</span>

Attaches a badge to the icon.

**Parameters:**

`badgeInfo` - Metadata of the badge to overlay


---

### setSource

<span style="font-family: monospace; font-size: 80%;">public void __setSource__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) svgSource)</span>




---

