Package [io.github.qishr.cascara.common.util](index.md)

# Interface IParseResultHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IParseResultHandler<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [RunFirst](CommandLine.RunFirst.md), [RunLast](CommandLine.RunLast.md), [RunAll](CommandLine.RunAll.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IParseResultHandler__</span>

Represents a function that can process a List of `CommandLine` objects resulting from successfully
parsing the command line arguments.This is a
functional interface
whose functional method is [handleParseResult](#handleparseresult).



Implementations of this functions can be passed to the #parseWithHandlers(IParseResultHandler, PrintStream, Help.Ansi, IExceptionHandler, String...)
methods to take some next step after the command line was successfully parsed.



## Method Summary

| Modifier and Type                                                                                                                                                                                      | Method                                                                                                                                                                                                                                                                                                                           | Description                                                                                                                                         |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [handleParseResult](#handleparseresult)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi) | Processes a List of `CommandLine` objects resulting from successfully  parsing the command line arguments and optionally returns a list of results. |



## Method Details

### handleParseResult

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __handleParseResult__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Processes a List of `CommandLine` objects resulting from successfully
 parsing the command line arguments and optionally returns a list of results.

**Parameters:**

`parsedCommands` - the `CommandLine` objects that resulted from successfully parsing the command line arguments

`out` - the `PrintStream` to print help to if requested

`ansi` - for printing help messages using ANSI styles and colors

**Returns:**

a list of results, or an empty list if there are no results

**Throws:**

[ExecutionException](CommandLine.ExecutionException.md)


---

