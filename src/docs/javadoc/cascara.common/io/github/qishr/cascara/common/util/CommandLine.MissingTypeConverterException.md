Package [io.github.qishr.cascara.common.util](index.md)

# Class MissingTypeConverterException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.util.CommandLine.PicocliException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.PicocliException.md)<br/>
                                        [io.github.qishr.cascara.common.util.CommandLine.ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)<br/>
                                                io.github.qishr.cascara.common.util.CommandLine.MissingTypeConverterException<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __MissingTypeConverterException__<br/>extends [ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)
</span>

Exception indicating that an annotated field had a type for which no [ITypeConverter](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ITypeConverter.md) was
registered.


## Constructor Summary

| Constructor                                                                                                                                                                                                                      | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| MissingTypeConverterException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg) |             |


### Methods inherited from [ParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParameterException.md)

getArgSpec, getValue, getCommandLine

