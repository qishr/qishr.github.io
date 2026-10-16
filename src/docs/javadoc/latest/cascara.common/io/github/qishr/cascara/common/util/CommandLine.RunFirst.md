Package [io.github.qishr.cascara.common.util](index.md)

# Class RunFirst
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.CommandLine.AbstractHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractHandler.md)<[java.util.List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>, [io.github.qishr.cascara.common.util.CommandLine.AbstractParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractParseResultHandler.md)<[java.util.List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>>><br/>
                [io.github.qishr.cascara.common.util.CommandLine.AbstractParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractParseResultHandler.md)<[java.util.List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>><br/>
                        io.github.qishr.cascara.common.util.CommandLine.RunFirst<br/>
<br/>
All Implemented Interfaces:<br/>
    [IParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IParseResultHandler.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __RunFirst__<br/>extends [AbstractParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractParseResultHandler.md)<[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>>
</span>

Command line [IExecutionStrategy](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExecutionStrategy.md) that prints help if requested, and otherwise executes the top-level
`Runnable` or `Callable` command.For use by the execute method.


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| RunFirst()  |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                 | Method                                                                                                                                                                                                                                                                                                                                                                                                                                       | Description                                                                                      |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| public int                                                                                                                                                                                                        | [execute](#execute)([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                                                                                                             |                                                                                                  |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                     | [handleParseResult](#handleparseresult)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.md) ansi) | Prints help if requested, and otherwise executes the top-level `Runnable` or `Callable` command. |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                  | [handle](#handle)([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                                                                                                               | Executes the top-level `Runnable` or `Callable` subcommand.                                      |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IExitCodeGenerator](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExitCodeGenerator.md)> | [extractExitCodeGenerators](#extractexitcodegenerators)([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                                                                         |                                                                                                  |
| protected [RunFirst](../../../../../../io/github/qishr/cascara/common/util/CommandLine.RunFirst.md)                                                                                                               | [self](#self)()                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                                                  |


### Methods inherited from [AbstractHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractHandler.md)

err, andExit, returnResultOrExit, colorScheme, ansi, useAnsi, throwOrExit, hasExitCode, exit, useOut, exitCode, out, useErr

### Methods inherited from [AbstractParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractParseResultHandler.md)

handleParseResult


## Method Details

### execute

<span style="font-family: monospace; font-size: 80%;">public int __execute__([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)</span>



**Throws:**

[ExecutionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ExecutionException.md)


---

### handleParseResult

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __handleParseResult__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.md) ansi)</span>

Prints help if requested, and otherwise executes the top-level `Runnable` or `Callable` command.Finally, either a list of result objects is returned, or the JVM is terminated if an exit code was set.
 If the top-level command does not implement either `Runnable` or `Callable`, an `ExecutionException`
 is thrown detailing the problem and capturing the offending `CommandLine` object.

**Parameters:**

`parsedCommands` - the `CommandLine` objects that resulted from successfully parsing the command line arguments

`out` - the `PrintStream` to print help to if requested

`ansi` - for printing help messages using ANSI styles and colors

**Returns:**

an empty list if help was requested, or a list containing a single element: the result of calling the
      `Callable`, or a `null` element if the top-level command was a `Runnable`

**Specified By:**

[IParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IParseResultHandler.md)


---

### handle

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __handle__([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)</span>

Executes the top-level `Runnable` or `Callable` subcommand.If the top-level command does not implement either `Runnable` or `Callable` and is not a `Method`, an `ExecutionException`
 is thrown detailing the problem and capturing the offending `CommandLine` object.

**Parameters:**

`parseResult` - the `ParseResult` that resulted from successfully parsing the command line arguments

**Returns:**

an empty list if help was requested, or a list containing a single element: the result of calling the
      `Callable`, or a `null` element if the last (sub)command was a `Runnable`

**Throws:**

[ExecutionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ExecutionException.md)

**Since:**

3.0


---

### extractExitCodeGenerators

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IExitCodeGenerator](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExitCodeGenerator.md)> __extractExitCodeGenerators__([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)</span>




---

### self

<span style="font-family: monospace; font-size: 80%;">protected [RunFirst](../../../../../../io/github/qishr/cascara/common/util/CommandLine.RunFirst.md) __self__()</span>



**Overrides:**

[AbstractHandler](../../../../../../../cascara.common/io/github/qishr/cascara/common/util/CommandLine.AbstractHandler.md#self)


---

