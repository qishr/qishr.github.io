Package [io.github.qishr.cascara.schema.constraint](index.md)

# Annotation Interface FileConstraint
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.schema.constraint.FileConstraint<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD)<br/>
public @interface __FileConstraint__</span>


## Method Summary

| Modifier and Type                                                                                              | Method                                  | Description |
|----------------------------------------------------------------------------------------------------------------|-----------------------------------------|-------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] | [extensions](#extensions)()             |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [initialDirectory](#initialdirectory)() |             |
| public abstract boolean                                                                                        | [mustExist](#mustexist)()               |             |
| public abstract boolean                                                                                        | [absolute](#absolute)()                 |             |



## Method Details

### extensions

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __extensions__()</span>




---

### initialDirectory

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __initialDirectory__()</span>




---

### mustExist

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __mustExist__()</span>




---

### absolute

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __absolute__()</span>




---

