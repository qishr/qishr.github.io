Package [io.github.qishr.cascara.common.util](index.md)

# Class DefaultExceptionHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.AbstractHandler<br/>
                io.github.qishr.cascara.common.util.CommandLine.DefaultExceptionHandler<br/>
<br/>
All Implemented Interfaces:<br/>
    [IExceptionHandler](CommandLine.IExceptionHandler.md), [IExceptionHandler2](CommandLine.IExceptionHandler2.md)<R>

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __DefaultExceptionHandler__<br/>extends io.github.qishr.cascara.common.util.CommandLine.AbstractHandler
</span>

Default exception handler that handles invalid user input by printing the exception message, followed by the usage
message for the command or subcommand whose input was invalid.

`ParameterExceptions` (invalid user input) is handled like this:

    err().println(paramException.getMessage());
    paramException.getCommandLine().usage(err(), ansi());
    if (hasExitCode()) System.exit(exitCode()); else return returnValue;



`ExecutionExceptions` that occurred while executing the `Runnable` or `Callable` command are simply rethrown and not handled.


## Constructor Summary

| Constructor               | Description |
|---------------------------|-------------|
| DefaultExceptionHandler() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                                                                                                                                                                                                                                                | Description                                                                                                                                                            |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [handleException](#handleexception)([ParameterException](CommandLine.ParameterException.md) ex, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args) |                                                                                                                                                                        |
| public R                                                                                                                                                                                      | [handleParseException](#handleparseexception)([ParameterException](CommandLine.ParameterException.md) ex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                        | Prints the message of the specified exception, followed by the usage message for the command or subcommand  whose input was invalid, to the stream returned by #err(). |
| public R                                                                                                                                                                                      | [handleExecutionException](#handleexecutionexception)([ExecutionException](CommandLine.ExecutionException.md) ex, [ParseResult](CommandLine.ParseResult.md) parseResult)                                                                                                                                                                              | This implementation always simply rethrows the specified exception.                                                                                                    |
| protected [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md)<R>                                                                                                                | [self](#self)()                                                                                                                                                                                                                                                                                                                                       |                                                                                                                                                                        |


### Methods inherited from [AbstractHandler](CommandLine.AbstractHandler.md)

err, andExit, returnResultOrExit, colorScheme, ansi, useAnsi, throwOrExit, hasExitCode, exit, useOut, exitCode, out, useErr


## Method Details

### handleException

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __handleException__([ParameterException](CommandLine.ParameterException.md) ex, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>



**Specified By:**

[IExceptionHandler](CommandLine.IExceptionHandler.md)


---

### handleParseException

<span style="font-family: monospace; font-size: 80%;">public R __handleParseException__([ParameterException](CommandLine.ParameterException.md) ex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Prints the message of the specified exception, followed by the usage message for the command or subcommand
 whose input was invalid, to the stream returned by #err().

**Parameters:**

`ex` - the ParameterException describing the problem that occurred while parsing the command line arguments,
           and the CommandLine representing the command or subcommand whose input was invalid

`args` - the command line arguments that could not be parsed

**Returns:**

the empty list

**Specified By:**

[IExceptionHandler2](CommandLine.IExceptionHandler2.md)

**Since:**

3.0


---

### handleExecutionException

<span style="font-family: monospace; font-size: 80%;">public R __handleExecutionException__([ExecutionException](CommandLine.ExecutionException.md) ex, [ParseResult](CommandLine.ParseResult.md) parseResult)</span>

This implementation always simply rethrows the specified exception.

**Parameters:**

`ex` - the ExecutionException describing the problem that occurred while executing the `Runnable` or `Callable` command

`parseResult` - the result of parsing the command line arguments

**Returns:**

nothing: this method always rethrows the specified exception

**Specified By:**

[IExceptionHandler2](CommandLine.IExceptionHandler2.md)

**Since:**

3.0


---

### self

<span style="font-family: monospace; font-size: 80%;">protected [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md)<R> __self__()</span>



**Overrides:**

[AbstractHandler](../cascara.common/util/CommandLine.AbstractHandler.md#self)


---

