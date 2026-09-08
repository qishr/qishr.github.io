Package [io.github.qishr.cascara.common.util](index.md)

# Interface IExecutionExceptionHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IExecutionExceptionHandler<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IExecutionExceptionHandler__</span>

Classes implementing this interface know how to handle Exceptions that occurred while executing the `Runnable`, `Callable` or `Method` user object of the command.

Implementation Requirements:


Implementors that need to print messages to the console should use the output and error PrintWriters,
and the color scheme from the CommandLine object obtained from the exception.


API Note:


This interface supersedes [IExceptionHandler2](CommandLine.IExceptionHandler2.md).


Example usage:

IExecutionExceptionHandler errorHandler = new IExecutionExceptionHandler() {
    public int handleExecutionException(Exception ex,
                                        CommandLine commandLine,
                                        ParseResult parseResult) {
        //ex.printStackTrace(); // no stack trace
        commandLine.getErr().println(ex.getMessage());
        commandLine.usage(commandLine.getErr());
        return commandLine.getCommandSpec().exitCodeOnExecutionException();
    }
};
int exitCode = new CommandLine(new App())
        .setExecutionExceptionHandler(errorHandler)
        .execute(args);



## Method Summary

| Modifier and Type   | Method                                                                                                                                                                                                                                                             | Description                                                                                                                                                          |
|---------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract int | [handleExecutionException](#handleexecutionexception)([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) ex, [CommandLine](CommandLine.md) commandLine, [ParseResult](CommandLine.ParseResult.md) fullParseResult) | Handles an `Exception` that occurred while executing the `Runnable` or  `Callable` command and returns an exit code suitable for returning from #execute(String...). |



## Method Details

### handleExecutionException

<span style="font-family: monospace; font-size: 80%;">public abstract int __handleExecutionException__([Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html) ex, [CommandLine](CommandLine.md) commandLine, [ParseResult](CommandLine.ParseResult.md) fullParseResult)</span>

Handles an `Exception` that occurred while executing the `Runnable` or
 `Callable` command and returns an exit code suitable for returning from #execute(String...).

**Parameters:**

`ex` - the Exception thrown by the `Runnable`, `Callable` or `Method` user object of the command

`commandLine` - the CommandLine representing the command or subcommand where the exception occurred

`fullParseResult` - the result of parsing the command line arguments.
                        This is the ParseResult of the top-level command.
               Note that if the exception occurred in a subcommand, you may want to inspect the ParseResult of
               the subcommand that threw the exception, which can be obtained by calling `commandLine.getParseResult()`
               on the CommandLine object passed to this method.

**Returns:**

an exit code

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

