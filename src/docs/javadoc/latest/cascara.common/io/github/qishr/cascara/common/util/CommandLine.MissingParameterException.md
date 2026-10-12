Package [io.github.qishr.cascara.common.util](index.md)

# Class MissingParameterException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.util.CommandLine.PicocliException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.PicocliException.md)<br/>
                                        [io.github.qishr.cascara.common.util.CommandLine.ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)<br/>
                                                io.github.qishr.cascara.common.util.CommandLine.MissingParameterException<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __MissingParameterException__<br/>extends [ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)
</span>

Exception indicating that a required parameter was not specified.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                               | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| MissingParameterException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) missing, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)                                                                                                       |             |
| MissingParameterException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md)> missing, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                              | Method                      | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------|-------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md)> | [getMissing](#getmissing)() |             |


### Methods inherited from [ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)

getArgSpec, getValue, getCommandLine


## Method Details

### getMissing

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md)> __getMissing__()</span>




---

