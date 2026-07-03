Package [io.github.qishr.cascara.common.io.filewatcher](index.md)

# Class FilteredFileHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.io.filewatcher.FilteredFileHandler<br/>
<br/>
All Implemented Interfaces:<br/>
    [FileChangeHandler](FileChangeHandler.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __FilteredFileHandler__</span>


## Constructor Summary

| Constructor                                                                                                                                                                        | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| FilteredFileHandler([FileChangeHandler](FileChangeHandler.md) delegate, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] extensions) |             |



## Method Summary

| Modifier and Type | Method                                                                                                                                                         | Description |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void       | [handle](#handle)([FileChangeType](FileChangeType.md) type, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path) |             |



## Method Details

### handle

<span style="font-family: monospace; font-size: 80%;">public void __handle__([FileChangeType](FileChangeType.md) type, [Path](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/nio/file/Path.html) path)</span>



**Specified By:**

[FileChangeHandler](FileChangeHandler.md)


---

