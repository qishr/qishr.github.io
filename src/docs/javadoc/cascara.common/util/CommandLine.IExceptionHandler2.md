Package [io.github.qishr.cascara.common.util](index.md)

# Interface IExceptionHandler2
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IExceptionHandler2<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IExceptionHandler2__</span>

Classes implementing this interface know how to handle `ParameterExceptions` (usually from invalid user input)
and `ExecutionExceptions` that occurred while executing the `Runnable` or `Callable` command.


Implementations of this interface can be passed to the
#parseWithHandlers(IParseResultHandler2,  IExceptionHandler2, String...) method.



This interface replaces the [IParseResultHandler](CommandLine.IParseResultHandler.md) interface.



## Method Summary

| Modifier and Type | Method                                                                                                                                                                                                         | Description                                                                                                                                  |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract R | [handleParseException](#handleparseexception)([ParameterException](CommandLine.ParameterException.md) ex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args) | Handles a `ParameterException` that occurred while parsing the command  line arguments and optionally returns a list of results.             |
| public abstract R | [handleExecutionException](#handleexecutionexception)([ExecutionException](CommandLine.ExecutionException.md) ex, [ParseResult](CommandLine.ParseResult.md) parseResult)                                       | Handles a `ExecutionException` that occurred while executing the `Runnable` or  `Callable` command and optionally returns a list of results. |



## Method Details

### handleParseException

<span style="font-family: monospace; font-size: 80%;">public abstract R __handleParseException__([ParameterException](CommandLine.ParameterException.md) ex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Handles a `ParameterException` that occurred while parsing the command
 line arguments and optionally returns a list of results.

**Parameters:**

`ex` - the ParameterException describing the problem that occurred while parsing the command line arguments,
           and the CommandLine representing the command or subcommand whose input was invalid

`args` - the command line arguments that could not be parsed

**Returns:**

an object resulting from handling the exception


---

### handleExecutionException

<span style="font-family: monospace; font-size: 80%;">public abstract R __handleExecutionException__([ExecutionException](CommandLine.ExecutionException.md) ex, [ParseResult](CommandLine.ParseResult.md) parseResult)</span>

Handles a `ExecutionException` that occurred while executing the `Runnable` or
 `Callable` command and optionally returns a list of results.

**Parameters:**

`ex` - the ExecutionException describing the problem that occurred while executing the `Runnable` or
          `Callable` command, and the CommandLine representing the command or subcommand that was being executed

`parseResult` - the result of parsing the command line arguments

**Returns:**

an object resulting from handling the exception


---

