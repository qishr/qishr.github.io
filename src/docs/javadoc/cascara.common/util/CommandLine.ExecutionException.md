Package [io.github.qishr.cascara.common.util](index.md)

# Class ExecutionException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.util.CommandLine.PicocliException](CommandLine.PicocliException.md)<br/>
                                        io.github.qishr.cascara.common.util.CommandLine.ExecutionException<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __ExecutionException__<br/>extends [PicocliException](CommandLine.PicocliException.md)
</span>

Exception indicating a problem while invoking a command or subcommand.Keeps a reference to the `CommandLine` object where the cause exception occurred,
 so that client code can tailor their handling for the specific command (print the command's usage help message, for example).


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| ExecutionException([CommandLine](CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)                                                                                                       |             |
| ExecutionException([CommandLine](CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |             |



## Method Summary

| Modifier and Type                    | Method                              | Description                                                                      |
|--------------------------------------|-------------------------------------|----------------------------------------------------------------------------------|
| public [CommandLine](CommandLine.md) | [getCommandLine](#getcommandline)() | Returns the `CommandLine` object for the (sub)command that could not be invoked. |



## Method Details

### getCommandLine

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __getCommandLine__()</span>

Returns the `CommandLine` object for the (sub)command that could not be invoked.

**Returns:**

the `CommandLine` object for the (sub)command where invocation failed.


---

