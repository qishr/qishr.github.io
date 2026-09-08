Package [io.github.qishr.cascara.common.util](index.md)

# Class RunLast
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.AbstractHandler<java.util.List<[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)><br/>
                io.github.qishr.cascara.common.util.CommandLine.AbstractParseResultHandler<java.util.List<[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)><br/>
                        io.github.qishr.cascara.common.util.CommandLine.RunLast<br/>
<br/>
All Implemented Interfaces:<br/>
    [IParseResultHandler](CommandLine.IParseResultHandler.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __RunLast__<br/>extends io.github.qishr.cascara.common.util.CommandLine.AbstractParseResultHandler<java.util.List<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>
</span>

Command line [IExecutionStrategy](CommandLine.IExecutionStrategy.md) that prints help if requested, and otherwise executes the most specific
`Runnable` or `Callable` subcommand.For use by the [execute](#execute) method.



Something like this:
`    // RunLast implementation: print help if requested, otherwise execute the most specific subcommand
    List<CommandLine> parsedCommands = parseResult.asCommandLineList();
    if (CommandLine.printHelpIfRequested(parsedCommands, out(), err(), ansi())) {
        return emptyList();
    }
    CommandLine last = parsedCommands.get(parsedCommands.size() - 1);
    Object command = last.getCommand();
    Object result = null;
    if (command instanceof Runnable) {
        try {
            ((Runnable) command).run();
        } catch (Exception ex) {
            throw new ExecutionException(last, "Error in runnable " + command, ex);
        }
    } else if (command instanceof Callable) {
        try {
            result = ((Callable) command).call();
        } catch (Exception ex) {
            throw new ExecutionException(last, "Error in callable " + command, ex);
        }
    } else {
        throw new ExecutionException(last, "Parsed command (" + command + ") is not Runnable or Callable");
    }
    last.setExecutionResult(result);
    return Arrays.asList(result);
`



From picocli v2.0, `RunLast` is used to implement the #run(Runnable, PrintStream, PrintStream, Help.Ansi, String...)
and #call(Callable, PrintStream, PrintStream, Help.Ansi, String...) convenience methods.



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| RunLast()   |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                | Method                                                                                                                                                                                                                                                                                                                           | Description                                                                                             |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| public int                                                                                                                                                                                       | [execute](#execute)([ParseResult](CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                                                       |                                                                                                         |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>    | [handleParseResult](#handleparseresult)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi) | Prints help if requested, and otherwise executes the most specific `Runnable` or `Callable` subcommand. |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [handle](#handle)([ParseResult](CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                                                         | Executes the most specific `Runnable` or `Callable` subcommand.                                         |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IExitCodeGenerator](CommandLine.IExitCodeGenerator.md)>                                      | [extractExitCodeGenerators](#extractexitcodegenerators)([ParseResult](CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                   |                                                                                                         |
| protected [RunLast](CommandLine.RunLast.md)                                                                                                                                                      | [self](#self)()                                                                                                                                                                                                                                                                                                                  |                                                                                                         |



## Method Details

### execute

<span style="font-family: monospace; font-size: 80%;">public int __execute__([ParseResult](CommandLine.ParseResult.md) parseResult)</span>



**Throws:**

[ExecutionException](CommandLine.ExecutionException.md)


---

### handleParseResult

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __handleParseResult__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Prints help if requested, and otherwise executes the most specific `Runnable` or `Callable` subcommand.

For repeatable subcommands, this method
 may execute multiple subcommands: the most deeply nested subcommands that have the same parent command.
 

Finally, either a list of result objects is returned, or the JVM is terminated if an exit code was set.
 

If the last (sub)command does not implement either `Runnable` or `Callable`, an `ExecutionException`
 is thrown detailing the problem and capturing the offending `CommandLine` object.

**Parameters:**

`parsedCommands` - the `CommandLine` objects that resulted from successfully parsing the command line arguments

`out` - the `PrintStream` to print help to if requested

`ansi` - for printing help messages using ANSI styles and colors

**Returns:**

an empty list if help was requested, or a list containing a single element: the result of calling the
      `Callable`, or a `null` element if the last (sub)command was a `Runnable`

**Specified By:**

[IParseResultHandler](CommandLine.IParseResultHandler.md)


---

### handle

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __handle__([ParseResult](CommandLine.ParseResult.md) parseResult)</span>

Executes the most specific `Runnable` or `Callable` subcommand.

For repeatable subcommands, this method
 may execute multiple subcommands: the most deeply nested subcommands that have the same parent command.
 

If the user object of the executed (sub)command does not implement either `Runnable` or `Callable` and is not a `Method`, an `ExecutionException`
 is thrown detailing the problem and capturing the offending `CommandLine` object.

**Parameters:**

`parseResult` - the `ParseResult` that resulted from successfully parsing the command line arguments

**Returns:**

an empty list if help was requested, or a list containing a single element: the result of calling the
      `Callable`, or a `null` element if the last (sub)command was a `Runnable`

**Throws:**

[ExecutionException](CommandLine.ExecutionException.md)

**Since:**

3.0


---

### extractExitCodeGenerators

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IExitCodeGenerator](CommandLine.IExitCodeGenerator.md)> __extractExitCodeGenerators__([ParseResult](CommandLine.ParseResult.md) parseResult)</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [RunLast](CommandLine.RunLast.md) __self__()</span>



**Overrides:**

[AbstractHandler](../cascara.common/util/CommandLine.AbstractHandler.md#self)


---

