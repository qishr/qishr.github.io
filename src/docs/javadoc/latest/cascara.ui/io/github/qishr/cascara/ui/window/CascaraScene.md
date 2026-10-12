Package [io.github.qishr.cascara.ui.window](index.md)

# Class CascaraScene
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Scene](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Scene.html)<br/>
                io.github.qishr.cascara.ui.window.CascaraScene<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CascaraScene__<br/>extends [Scene](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Scene.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                          | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| CascaraScene([Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html) root)                                                                                                                                  |             |
| CascaraScene([Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html) root, double width, double height)                                                                                                     |             |
| CascaraScene([Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html) root, double width, double height, [MenuBar](https://openjfx.io/javadoc/25/javafx.controls/javafx/scene/control/MenuBar.html) menuBar) |             |
| CascaraScene([Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html) root, [Paint](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Paint.html) fill)                                       |             |
| CascaraScene([Parent](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Parent.html) root, double width, double height, [Paint](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/paint/Paint.html) fill)          |             |



## Method Summary

| Modifier and Type                                                                          | Method                                                                                                                                 | Description |
|--------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [VBox](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/VBox.html) | [getWindowLayout](#getwindowlayout)()                                                                                                  |             |
| public void                                                                                | [setTitle](#settitle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title)              |             |
| public void                                                                                | [setTitlebarStyle](#settitlebarstyle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id) |             |
| public void                                                                                | [initMenuBar](#initmenubar)()                                                                                                          |             |
| public void                                                                                | [setupMenuBarShortcuts](#setupmenubarshortcuts)()                                                                                      |             |
| public void                                                                                | [setMenuBarVisible](#setmenubarvisible)(boolean visible)                                                                               |             |
| public void                                                                                | [setOnClose](#setonclose)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) r)          |             |
| public void                                                                                | [bind](#bind)([Scene](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Scene.html) scene)                                    |             |
| public void                                                                                | [setMousePointer](#setmousepointer)([Cursor](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Cursor.html) cursor)           |             |



## Method Details

### getWindowLayout

<span style="font-family: monospace; font-size: 80%;">public [VBox](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/layout/VBox.html) __getWindowLayout__()</span>




---

### setTitle

<span style="font-family: monospace; font-size: 80%;">public void __setTitle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) title)</span>




---

### setTitlebarStyle

<span style="font-family: monospace; font-size: 80%;">public void __setTitlebarStyle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id)</span>




---

### initMenuBar

<span style="font-family: monospace; font-size: 80%;">public void __initMenuBar__()</span>




---

### setupMenuBarShortcuts

<span style="font-family: monospace; font-size: 80%;">public void __setupMenuBarShortcuts__()</span>




---

### setMenuBarVisible

<span style="font-family: monospace; font-size: 80%;">public void __setMenuBarVisible__(boolean visible)</span>




---

### setOnClose

<span style="font-family: monospace; font-size: 80%;">public void __setOnClose__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) r)</span>




---

### bind

<span style="font-family: monospace; font-size: 80%;">public void __bind__([Scene](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Scene.html) scene)</span>




---

### setMousePointer

<span style="font-family: monospace; font-size: 80%;">public void __setMousePointer__([Cursor](https://openjfx.io/javadoc/25/javafx.graphics/javafx/scene/Cursor.html) cursor)</span>




---

