Package [io.github.qishr.cascara.ui.control](index.md)

# Class ResourceTabHeader
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [javafx.scene.Node](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Node.html)<br/>
                [javafx.scene.Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html)<br/>
                        [javafx.scene.layout.Region](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Region.html)<br/>
                                [javafx.scene.layout.Pane](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/Pane.html)<br/>
                                        [javafx.scene.layout.HBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/HBox.html)<br/>
                                                io.github.qishr.cascara.ui.control.ResourceTabHeader<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __ResourceTabHeader__<br/>extends [HBox](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/layout/HBox.html)
</span>


## Field Summary

| Modifier and Type                                                                                                | Field                               | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ICON_CIRCLE](#icon_circle)         |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ICON_CLOSE](#icon_close)           |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ICON_PIN](#icon_pin)               |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ICON_PIN_CIRCLE](#icon_pin_circle) |             |



## Constructor Summary

| Constructor                                                                                                          | Description |
|----------------------------------------------------------------------------------------------------------------------|-------------|
| ResourceTabHeader()                                                                                                  |             |
| ResourceTabHeader([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |



## Method Summary

| Modifier and Type                                                                                                                                         | Method                                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [activeProperty](#activeproperty)()                                                                                              |             |
| public boolean                                                                                                                                            | [isActive](#isactive)()                                                                                                          |             |
| public void                                                                                                                                               | [setActive](#setactive)(boolean t)                                                                                               |             |
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [transientProperty](#transientproperty)()                                                                                        |             |
| public boolean                                                                                                                                            | [isTransient](#istransient)()                                                                                                    |             |
| public void                                                                                                                                               | [setTransient](#settransient)(boolean t)                                                                                         |             |
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [modifiedProperty](#modifiedproperty)()                                                                                          |             |
| public boolean                                                                                                                                            | [isModified](#ismodified)()                                                                                                      |             |
| public void                                                                                                                                               | [setModified](#setmodified)(boolean t)                                                                                           |             |
| public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html)           | [pinnedProperty](#pinnedproperty)()                                                                                              |             |
| public boolean                                                                                                                                            | [isPinned](#ispinned)()                                                                                                          |             |
| public void                                                                                                                                               | [setPinned](#setpinned)(boolean pinned)                                                                                          |             |
| public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) | [titleProperty](#titleproperty)()                                                                                                |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                       | [getTitle](#gettitle)()                                                                                                          |             |
| public void                                                                                                                                               | [setTitle](#settitle)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)         |             |
| public void                                                                                                                                               | [setOnCloseButtonClick](#setonclosebuttonclick)([OnButtonClickHandler](ResourceTabHeader.OnButtonClickHandler.md) onButtonClick) |             |
| public void                                                                                                                                               | [onButtonClick](#onbuttonclick)()                                                                                                |             |



## Field Details

### ICON_CIRCLE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ICON_CIRCLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### ICON_CLOSE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ICON_CLOSE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### ICON_PIN

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ICON_PIN__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### ICON_PIN_CIRCLE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ICON_PIN_CIRCLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### activeProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __activeProperty__()</span>




---

### isActive

<span style="font-family: monospace; font-size: 80%;">public boolean __isActive__()</span>




---

### setActive

<span style="font-family: monospace; font-size: 80%;">public void __setActive__(boolean t)</span>




---

### transientProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __transientProperty__()</span>




---

### isTransient

<span style="font-family: monospace; font-size: 80%;">public boolean __isTransient__()</span>




---

### setTransient

<span style="font-family: monospace; font-size: 80%;">public void __setTransient__(boolean t)</span>




---

### modifiedProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __modifiedProperty__()</span>




---

### isModified

<span style="font-family: monospace; font-size: 80%;">public boolean __isModified__()</span>




---

### setModified

<span style="font-family: monospace; font-size: 80%;">public void __setModified__(boolean t)</span>




---

### pinnedProperty

<span style="font-family: monospace; font-size: 80%;">public [BooleanProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/BooleanProperty.html) __pinnedProperty__()</span>




---

### isPinned

<span style="font-family: monospace; font-size: 80%;">public boolean __isPinned__()</span>




---

### setPinned

<span style="font-family: monospace; font-size: 80%;">public void __setPinned__(boolean pinned)</span>




---

### titleProperty

<span style="font-family: monospace; font-size: 80%;">public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) __titleProperty__()</span>




---

### getTitle

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getTitle__()</span>




---

### setTitle

<span style="font-family: monospace; font-size: 80%;">public void __setTitle__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### setOnCloseButtonClick

<span style="font-family: monospace; font-size: 80%;">public void __setOnCloseButtonClick__([OnButtonClickHandler](ResourceTabHeader.OnButtonClickHandler.md) onButtonClick)</span>




---

### onButtonClick

<span style="font-family: monospace; font-size: 80%;">public void __onButtonClick__()</span>




---

