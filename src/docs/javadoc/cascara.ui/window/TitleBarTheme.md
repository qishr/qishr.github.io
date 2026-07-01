Package [io.github.qishr.cascara.ui.window](index.md)

# Record TitleBarTheme
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)<br/>
                io.github.qishr.cascara.ui.window.TitleBarTheme<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final record __TitleBarTheme__<br/>extends [Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)
</span>

Defines the structural configuration of a custom title bar.The visual "look" is handled via the styleClass in CSS.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| TitleBarTheme([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) styleClass, double height, [Pos](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Pos.html) titleAlignment, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TitleButtonType](TitleBarTheme.TitleButtonType.md)> leftButtons, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TitleButtonType](TitleBarTheme.TitleButtonType.md)> rightButtons, boolean useStretchingLines, [ShadowProfile](ShadowProfile.md) activeProfile, [ShadowProfile](ShadowProfile.md) inactiveProfile) |             |



## Method Summary

| Modifier and Type                                                                                                                                    | Method                                                                                                            | Description                                                     |
|------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| public static [TitleBarTheme](TitleBarTheme.md)                                                                                                      | [macSystem8](#macsystem8)()                                                                                       | Returns the value of the `macSystem8` record component.         |
| public static [TitleBarTheme](TitleBarTheme.md)                                                                                                      | [modern](#modern)()                                                                                               | Returns the value of the `modern` record component.             |
| public static [TitleBarTheme](TitleBarTheme.md)                                                                                                      | [windows7](#windows7)()                                                                                           | Returns the value of the `windows7` record component.           |
| public static [TitleBarTheme](TitleBarTheme.md)                                                                                                      | [windows10](#windows10)()                                                                                         | Returns the value of the `windows10` record component.          |
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                            | [toString](#tostring)()                                                                                           | Returns a string representation of this record class.           |
| public final int                                                                                                                                     | [hashCode](#hashcode)()                                                                                           | Returns a hash code value for this object.                      |
| public final boolean                                                                                                                                 | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) | Indicates whether some other object is "equal to" this one.     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                  | [id](#id)()                                                                                                       | Returns the value of the `id` record component.                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                  | [styleClass](#styleclass)()                                                                                       | Returns the value of the `styleClass` record component.         |
| public double                                                                                                                                        | [height](#height)()                                                                                               | Returns the value of the `height` record component.             |
| public [Pos](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Pos.html)                                | [titleAlignment](#titlealignment)()                                                                               | Returns the value of the `titleAlignment` record component.     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TitleButtonType](TitleBarTheme.TitleButtonType.md)> | [leftButtons](#leftbuttons)()                                                                                     | Returns the value of the `leftButtons` record component.        |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TitleButtonType](TitleBarTheme.TitleButtonType.md)> | [rightButtons](#rightbuttons)()                                                                                   | Returns the value of the `rightButtons` record component.       |
| public boolean                                                                                                                                       | [useStretchingLines](#usestretchinglines)()                                                                       | Returns the value of the `useStretchingLines` record component. |
| public [ShadowProfile](ShadowProfile.md)                                                                                                             | [activeProfile](#activeprofile)()                                                                                 | Returns the value of the `activeProfile` record component.      |
| public [ShadowProfile](ShadowProfile.md)                                                                                                             | [inactiveProfile](#inactiveprofile)()                                                                             | Returns the value of the `inactiveProfile` record component.    |



## Method Details

### macSystem8

<span style="font-family: monospace; font-size: 80%;">public static [TitleBarTheme](TitleBarTheme.md) __macSystem8__()</span>

Returns the value of the `macSystem8` record component.


---

### modern

<span style="font-family: monospace; font-size: 80%;">public static [TitleBarTheme](TitleBarTheme.md) __modern__()</span>

Returns the value of the `modern` record component.


---

### windows7

<span style="font-family: monospace; font-size: 80%;">public static [TitleBarTheme](TitleBarTheme.md) __windows7__()</span>

Returns the value of the `windows7` record component.


---

### windows10

<span style="font-family: monospace; font-size: 80%;">public static [TitleBarTheme](TitleBarTheme.md) __windows10__()</span>

Returns the value of the `windows10` record component.


---

### toString

<span style="font-family: monospace; font-size: 80%;">public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns a string representation of this record class.


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public final int __hashCode__()</span>

Returns a hash code value for this object.


---

### equals

<span style="font-family: monospace; font-size: 80%;">public final boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>

Indicates whether some other object is "equal to" this one.


---

### id

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __id__()</span>

Returns the value of the `id` record component.


---

### styleClass

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __styleClass__()</span>

Returns the value of the `styleClass` record component.


---

### height

<span style="font-family: monospace; font-size: 80%;">public double __height__()</span>

Returns the value of the `height` record component.


---

### titleAlignment

<span style="font-family: monospace; font-size: 80%;">public [Pos](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/geometry/Pos.html) __titleAlignment__()</span>

Returns the value of the `titleAlignment` record component.


---

### leftButtons

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TitleButtonType](TitleBarTheme.TitleButtonType.md)> __leftButtons__()</span>

Returns the value of the `leftButtons` record component.


---

### rightButtons

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[TitleButtonType](TitleBarTheme.TitleButtonType.md)> __rightButtons__()</span>

Returns the value of the `rightButtons` record component.


---

### useStretchingLines

<span style="font-family: monospace; font-size: 80%;">public boolean __useStretchingLines__()</span>

Returns the value of the `useStretchingLines` record component.


---

### activeProfile

<span style="font-family: monospace; font-size: 80%;">public [ShadowProfile](ShadowProfile.md) __activeProfile__()</span>

Returns the value of the `activeProfile` record component.


---

### inactiveProfile

<span style="font-family: monospace; font-size: 80%;">public [ShadowProfile](ShadowProfile.md) __inactiveProfile__()</span>

Returns the value of the `inactiveProfile` record component.


---

