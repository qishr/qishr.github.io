Package [io.github.qishr.cascara.ui.control](index.md)

# Class SvgBadgeIcon
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.StackPane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/StackPane.html)<br/>
                                                io.github.qishr.cascara.ui.control.SvgBadgeIcon<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __SvgBadgeIcon__<br/>extends [StackPane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/StackPane.html)
</span>


## Constructor Summary

| Constructor                              | Description |
|------------------------------------------|-------------|
| SvgBadgeIcon([SvgIcon](SvgIcon.md) icon) |             |



## Method Summary

| Modifier and Type            | Method                                                                                                                                                                                                                                                                   | Description                   |
|------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------|
| public void                  | [setBadge](#setbadge)([Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) badgeNode, [Pos](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Pos.html) alignment) | Attaches a badge to the icon. |
| public [SvgIcon](SvgIcon.md) | [getBaseIcon](#getbaseicon)()                                                                                                                                                                                                                                            |                               |



## Method Details

### setBadge

<span style="font-family: monospace; font-size: 80%;">public void __setBadge__([Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html) badgeNode, [Pos](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Pos.html) alignment)</span>

Attaches a badge to the icon.

**Parameters:**

`badgeNode` - The node to overlay (Circle, Label, another SvgIcon, etc.)

`alignment` - Where to place the badge (e.g., Pos.BOTTOM_RIGHT)


---

### getBaseIcon

<span style="font-family: monospace; font-size: 80%;">public [SvgIcon](SvgIcon.md) __getBaseIcon__()</span>




---

