Package [io.github.qishr.cascara.common.data](index.md)

# Class Tree
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.data.Tree<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Tree__</span>


## Constructor Summary

| Constructor | Description               |
|-------------|---------------------------|
| Tree()      | Constructs an empty Tree. |



## Method Summary

| Modifier and Type | Method                                                                                                                                                               | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void       | [setRenderValues](#setrendervalues)(boolean v)                                                                                                                       |             |
| public void       | [setRoot](#setroot)([TreeData](TreeData.md)<T, V> node)                                                                                                              |             |
| public void       | [render](#render)([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)                                                 |             |
| public void       | [render](#render)([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer, [TreeData](TreeData.md)<T, V> node, int indent) |             |



## Method Details

### setRenderValues

<span style="font-family: monospace; font-size: 80%;">public void __setRenderValues__(boolean v)</span>




---

### setRoot

<span style="font-family: monospace; font-size: 80%;">public void __setRoot__([TreeData](TreeData.md)<T, V> node)</span>




---

### render

<span style="font-family: monospace; font-size: 80%;">public void __render__([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### render

<span style="font-family: monospace; font-size: 80%;">public void __render__([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer, [TreeData](TreeData.md)<T, V> node, int indent)</span>



**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

