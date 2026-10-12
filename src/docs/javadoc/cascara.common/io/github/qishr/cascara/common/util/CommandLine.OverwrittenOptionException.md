Package [io.github.qishr.cascara.common.util](index.md)

# Class OverwrittenOptionException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.util.CommandLine.PicocliException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.PicocliException.md)<br/>
                                        [io.github.qishr.cascara.common.util.CommandLine.ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)<br/>
                                                io.github.qishr.cascara.common.util.CommandLine.OverwrittenOptionException<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __OverwrittenOptionException__<br/>extends [ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)
</span>

Exception indicating that an option for a single-value option field has been specified multiple times on the command line.


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                              | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| OverwrittenOptionException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) overwritten, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg) |             |



## Method Summary

| Modifier and Type                                                                                    | Method                              | Description                                                                                                                                           |
|------------------------------------------------------------------------------------------------------|-------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) | [getOverwritten](#getoverwritten)() | Returns the [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) for the option which was being overwritten. |


### Methods inherited from [ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)

getArgSpec, getValue, getCommandLine


## Method Details

### getOverwritten

<span style="font-family: monospace; font-size: 80%;">public [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) __getOverwritten__()</span>

Returns the [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) for the option which was being overwritten.

**Since:**

3.8


---

