Package [io.github.qishr.cascara.ui.render](index.md)

# Record Renderers
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)<br/>
                io.github.qishr.cascara.ui.render.Renderers<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final record __Renderers__<br/>extends [Record](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Record.html)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Renderers([ScalarRenderer](../api/render/ScalarRenderer.md) scalarRenderer, [ScalarEditorRenderer](../api/render/ScalarEditorRenderer.md) scalarEditorRenderer, [ArrayEditorRenderer](../api/render/ArrayEditorRenderer.md) arrayEditorRenderer) |             |



## Method Summary

| Modifier and Type                                                                                         | Method                                                                                                            | Description                                                       |
|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| public final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                           | Returns a string representation of this record class.             |
| public final int                                                                                          | [hashCode](#hashcode)()                                                                                           | Returns a hash code value for this object.                        |
| public final boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o) | Indicates whether some other object is "equal to" this one.       |
| public [ScalarRenderer](../api/render/ScalarRenderer.md)                                                  | [scalarRenderer](#scalarrenderer)()                                                                               | Returns the value of the `scalarRenderer` record component.       |
| public [ScalarEditorRenderer](../api/render/ScalarEditorRenderer.md)                                      | [scalarEditorRenderer](#scalareditorrenderer)()                                                                   | Returns the value of the `scalarEditorRenderer` record component. |
| public [ArrayEditorRenderer](../api/render/ArrayEditorRenderer.md)                                        | [arrayEditorRenderer](#arrayeditorrenderer)()                                                                     | Returns the value of the `arrayEditorRenderer` record component.  |



## Method Details

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

### scalarRenderer

<span style="font-family: monospace; font-size: 80%;">public [ScalarRenderer](../api/render/ScalarRenderer.md) __scalarRenderer__()</span>

Returns the value of the `scalarRenderer` record component.


---

### scalarEditorRenderer

<span style="font-family: monospace; font-size: 80%;">public [ScalarEditorRenderer](../api/render/ScalarEditorRenderer.md) __scalarEditorRenderer__()</span>

Returns the value of the `scalarEditorRenderer` record component.


---

### arrayEditorRenderer

<span style="font-family: monospace; font-size: 80%;">public [ArrayEditorRenderer](../api/render/ArrayEditorRenderer.md) __arrayEditorRenderer__()</span>

Returns the value of the `arrayEditorRenderer` record component.


---

