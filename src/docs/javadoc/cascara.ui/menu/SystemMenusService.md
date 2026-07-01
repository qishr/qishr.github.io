Package [io.github.qishr.cascara.ui.menu](index.md)

# Interface SystemMenusService
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.menu.SystemMenusService<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../cascara.common/service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [MacosSystemMenus](../../cascara.macos.menus/menus/MacosSystemMenus.md), [StandardSystemMenus](StandardSystemMenus.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __SystemMenusService__</span>


## Method Summary

| Modifier and Type                                           | Method                                                                                                                                         | Description |
|-------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract [ObservableMenuItem](ObservableMenuItem.md) | [buildAppMenu](#buildappmenu)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) appName)            |             |
| public abstract [ObservableMenuItem](ObservableMenuItem.md) | [buildWindowMenu](#buildwindowmenu)()                                                                                                          |             |
| public abstract void                                        | [setMenuRoot](#setmenuroot)([ObservableMenuItem](ObservableMenuItem.md) menuRoot)                                                              |             |
| public abstract void                                        | [integrate](#integrate)([Stage](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/stage/Stage.html) stage) |             |
| public abstract void                                        | [setOnAbout](#setonabout)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)            |             |
| public abstract void                                        | [setOnSettings](#setonsettings)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)      |             |
| public abstract void                                        | [setOnQuit](#setonquit)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)              |             |



## Method Details

### buildAppMenu

<span style="font-family: monospace; font-size: 80%;">public abstract [ObservableMenuItem](ObservableMenuItem.md) __buildAppMenu__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) appName)</span>




---

### buildWindowMenu

<span style="font-family: monospace; font-size: 80%;">public abstract [ObservableMenuItem](ObservableMenuItem.md) __buildWindowMenu__()</span>




---

### setMenuRoot

<span style="font-family: monospace; font-size: 80%;">public abstract void __setMenuRoot__([ObservableMenuItem](ObservableMenuItem.md) menuRoot)</span>




---

### integrate

<span style="font-family: monospace; font-size: 80%;">public abstract void __integrate__([Stage](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/stage/Stage.html) stage)</span>




---

### setOnAbout

<span style="font-family: monospace; font-size: 80%;">public abstract void __setOnAbout__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

### setOnSettings

<span style="font-family: monospace; font-size: 80%;">public abstract void __setOnSettings__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

### setOnQuit

<span style="font-family: monospace; font-size: 80%;">public abstract void __setOnQuit__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

