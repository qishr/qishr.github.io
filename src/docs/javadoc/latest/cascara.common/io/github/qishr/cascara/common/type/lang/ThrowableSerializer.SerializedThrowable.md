Package [io.github.qishr.cascara.common.type.lang](index.md)

# Class SerializedThrowable
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                io.github.qishr.cascara.common.type.lang.ThrowableSerializer.SerializedThrowable<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.type.lang.ThrowableSerializer](../../../../../../../io/github/qishr/cascara/common/type/lang/ThrowableSerializer.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __SerializedThrowable__<br/>extends [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)
</span>

Synthetic Throwable wrapper representing deserialized exceptions from dynamic
module layers without triggering ClassNotFoundException on the host classpath.


## Constructor Summary

| Constructor                                                                                                                                                                                                                               | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| SerializedThrowable([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) originalClassName, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) message) |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                          | Description |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getOriginalClassName](#getoriginalclassname)() |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                         |             |



## Method Details

### getOriginalClassName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOriginalClassName__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html#tostring)


---

