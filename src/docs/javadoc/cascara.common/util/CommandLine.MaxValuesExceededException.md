Package [io.github.qishr.cascara.common.util](index.md)

# Class MaxValuesExceededException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.util.CommandLine.PicocliException](CommandLine.PicocliException.md)<br/>
                                        [io.github.qishr.cascara.common.util.CommandLine.ParameterException](CommandLine.ParameterException.md)<br/>
                                                io.github.qishr.cascara.common.util.CommandLine.MaxValuesExceededException<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __MaxValuesExceededException__<br/>extends [ParameterException](CommandLine.ParameterException.md)
</span>

Exception indicating that more values were specified for an option or parameter than its Option#arity() allows.


## Constructor Summary

| Constructor                                                                                                                                                             | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| MaxValuesExceededException([CommandLine](CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg) |             |


### Methods inherited from [ParameterException](CommandLine.ParameterException.md)

getArgSpec, getValue, getCommandLine

