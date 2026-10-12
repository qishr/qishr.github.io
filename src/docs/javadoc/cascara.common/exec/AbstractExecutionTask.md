Package [io.github.qishr.cascara.common.exec](index.md)

# Class AbstractExecutionTask
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.exec.AbstractExecutionTask<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractExecutionTask__</span>


## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| AbstractExecutionTask() |             |



## Method Summary

| Modifier and Type    | Method                                                                                                                                                                                                                           | Description |
|----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected abstract O | [run](#run)(I input)                                                                                                                                                                                                             |             |
| public static void   | [main](#main)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                               |             |
| public void          | [executeLifecycle](#executelifecycle)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> targetClass)                                                                                 |             |
| public void          | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> targetClass, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> inputClass) |             |
| protected void       | [error](#error)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)                                                                                                                |             |
| protected void       | [error](#error)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)      |             |



## Method Details

### run

<span style="font-family: monospace; font-size: 80%;">protected abstract O __run__(I input)</span>



**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

### main

<span style="font-family: monospace; font-size: 80%;">public static void __main__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>




---

### executeLifecycle

<span style="font-family: monospace; font-size: 80%;">public void __executeLifecycle__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> targetClass)</span>




---

### run

<span style="font-family: monospace; font-size: 80%;">public void __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> targetClass, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> inputClass)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)</span>




---

### error

<span style="font-family: monospace; font-size: 80%;">protected void __error__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) cause, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)</span>




---

