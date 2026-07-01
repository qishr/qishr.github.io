Package [io.github.qishr.cascara.ui.menu](index.md)

# Class StandardSystemMenus
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.menu.StandardSystemMenus<br/>
<br/>
All Implemented Interfaces:<br/>
    [SystemMenusService](SystemMenusService.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __StandardSystemMenus__</span>


## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| StandardSystemMenus() |             |



## Method Summary

| Modifier and Type                                            | Method                                                                                                                                         | Description |
|--------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [Properties](../../cascara.common/util/Properties.md) | [getServiceProperties](#getserviceproperties)()                                                                                                |             |
| public void                                                  | [setOnAbout](#setonabout)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)            |             |
| public void                                                  | [onAbout](#onabout)()                                                                                                                          |             |
| public void                                                  | [setOnSettings](#setonsettings)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)      |             |
| public void                                                  | [onSettings](#onsettings)()                                                                                                                    |             |
| public void                                                  | [setOnQuit](#setonquit)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)              |             |
| public void                                                  | [onQuit](#onquit)()                                                                                                                            |             |
| public void                                                  | [setMenuRoot](#setmenuroot)([ObservableMenuItem](ObservableMenuItem.md) menuRoot)                                                              |             |
| public void                                                  | [integrate](#integrate)([Stage](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/stage/Stage.html) stage) |             |
| public [ObservableMenuItem](ObservableMenuItem.md)           | [buildAppMenu](#buildappmenu)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) appName)            |             |
| public [ObservableMenuItem](ObservableMenuItem.md)           | [buildWindowMenu](#buildwindowmenu)()                                                                                                          |             |



## Method Details

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../cascara.common/util/Properties.md) __getServiceProperties__()</span>




---

### setOnAbout

<span style="font-family: monospace; font-size: 80%;">public void __setOnAbout__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>



**Specified By:**

[SystemMenusService](SystemMenusService.md)


---

### onAbout

<span style="font-family: monospace; font-size: 80%;">public void __onAbout__()</span>




---

### setOnSettings

<span style="font-family: monospace; font-size: 80%;">public void __setOnSettings__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>



**Specified By:**

[SystemMenusService](SystemMenusService.md)


---

### onSettings

<span style="font-family: monospace; font-size: 80%;">public void __onSettings__()</span>




---

### setOnQuit

<span style="font-family: monospace; font-size: 80%;">public void __setOnQuit__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>



**Specified By:**

[SystemMenusService](SystemMenusService.md)


---

### onQuit

<span style="font-family: monospace; font-size: 80%;">public void __onQuit__()</span>




---

### setMenuRoot

<span style="font-family: monospace; font-size: 80%;">public void __setMenuRoot__([ObservableMenuItem](ObservableMenuItem.md) menuRoot)</span>



**Specified By:**

[SystemMenusService](SystemMenusService.md)


---

### integrate

<span style="font-family: monospace; font-size: 80%;">public void __integrate__([Stage](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/stage/Stage.html) stage)</span>



**Specified By:**

[SystemMenusService](SystemMenusService.md)


---

### buildAppMenu

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __buildAppMenu__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) appName)</span>



**Specified By:**

[SystemMenusService](SystemMenusService.md)


---

### buildWindowMenu

<span style="font-family: monospace; font-size: 80%;">public [ObservableMenuItem](ObservableMenuItem.md) __buildWindowMenu__()</span>



**Specified By:**

[SystemMenusService](SystemMenusService.md)


---

