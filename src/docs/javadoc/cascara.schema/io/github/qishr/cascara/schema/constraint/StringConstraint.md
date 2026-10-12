Package [io.github.qishr.cascara.schema.constraint](index.md)

# Annotation Interface StringConstraint
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.constraint.StringConstraint<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD)<br/>
public @interface __StringConstraint__</span>


## Method Summary

| Modifier and Type                                                                                              | Method                    | Description |
|----------------------------------------------------------------------------------------------------------------|---------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [pattern](#pattern)()     |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] | [options](#options)()     |             |
| public abstract int                                                                                            | [minLength](#minlength)() |             |
| public abstract int                                                                                            | [maxLength](#maxlength)() |             |



## Method Details

### pattern

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __pattern__()</span>




---

### options

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __options__()</span>




---

### minLength

<span style="font-family: monospace; font-size: 80%;">public abstract int __minLength__()</span>




---

### maxLength

<span style="font-family: monospace; font-size: 80%;">public abstract int __maxLength__()</span>




---

