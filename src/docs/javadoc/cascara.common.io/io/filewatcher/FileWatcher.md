Package [io.github.qishr.cascara.common.io.filewatcher](index.md)

# Class FileWatcher
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.io.filewatcher.FileWatcher<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __FileWatcher__</span>


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| FileWatcher() |             |



## Method Summary

| Modifier and Type  | Method                                                                                                                                                                                                                                                                                             | Description                                                                               |
|--------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| public void        | [watchFile](#watchfile)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onEvent)                                                               | Simple delegate, as true file-specific watching is complicated.                           |
| public void        | [watchDirectory](#watchdirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onEvent)                                                     | Watch a specific directory and run onEvent when any event occurs.                         |
| public void        | [watchDirectory](#watchdirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [FileChangeHandler](FileChangeHandler.md) handler)                                                                                                            | Watch a specific directory and receive granular event details via a callback.             |
| public void        | [watchDirectory](#watchdirectory)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [FileChangeHandler](FileChangeHandler.md) handler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] extensions) |                                                                                           |
| public void        | [watchDirectoryRecursively](#watchdirectoryrecursively)([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onEvent)                               | Watch a specific directory and all subdirectories, and run onEvent when any event occurs. |
| public void        | [resumeWatching](#resumewatching)()                                                                                                                                                                                                                                                                | Start watching for file changes.                                                          |
| public void        | [pauseWatching](#pausewatching)()                                                                                                                                                                                                                                                                  | Stop watching for file changes until `resumeWatching()` is called.                        |
| public void        | [clear](#clear)()                                                                                                                                                                                                                                                                                  | Stop watching all currently watched files and directories.                                |
| public static void | [clearAll](#clearall)()                                                                                                                                                                                                                                                                            | Clears all file watchers globally                                                         |



## Method Details

### watchFile

<span style="font-family: monospace; font-size: 80%;">public void __watchFile__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onEvent)</span>

Simple delegate, as true file-specific watching is complicated.

**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### watchDirectory

<span style="font-family: monospace; font-size: 80%;">public void __watchDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onEvent)</span>

Watch a specific directory and run onEvent when any event occurs.

**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### watchDirectory

<span style="font-family: monospace; font-size: 80%;">public void __watchDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [FileChangeHandler](FileChangeHandler.md) handler)</span>

Watch a specific directory and receive granular event details via a callback.

**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### watchDirectory

<span style="font-family: monospace; font-size: 80%;">public void __watchDirectory__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [FileChangeHandler](FileChangeHandler.md) handler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] extensions)</span>



**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### watchDirectoryRecursively

<span style="font-family: monospace; font-size: 80%;">public void __watchDirectoryRecursively__([Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path, [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) onEvent)</span>

Watch a specific directory and all subdirectories, and run onEvent when any event occurs.This registers the current tree and dynamically registers new subdirectories.

**Throws:**

[IOException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/IOException.html)


---

### resumeWatching

<span style="font-family: monospace; font-size: 80%;">public void __resumeWatching__()</span>

Start watching for file changes.


---

### pauseWatching

<span style="font-family: monospace; font-size: 80%;">public void __pauseWatching__()</span>

Stop watching for file changes until `resumeWatching()` is called.


---

### clear

<span style="font-family: monospace; font-size: 80%;">public void __clear__()</span>

Stop watching all currently watched files and directories.


---

### clearAll

<span style="font-family: monospace; font-size: 80%;">public static void __clearAll__()</span>

Clears all file watchers globally


---

