Package [io.github.qishr.cascara.common.util](index.md)

# Interface IExceptionHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IExceptionHandler<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IExceptionHandler__</span>

Represents a function that can handle a `ParameterException` that occurred while
parsing the command line arguments.This is a
functional interface
whose functional method is [handleException](#handleexception).



Implementations of this function can be passed to the #parseWithHandlers(IParseResultHandler, PrintStream, Help.Ansi, IExceptionHandler, String...)
methods to handle situations when the command line could not be parsed.



## Method Summary

| Modifier and Type                                                                                                                                                                                      | Method                                                                                                                                                                                                                                                                                                                                                | Description                                                                                                                      |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [handleException](#handleexception)([ParameterException](CommandLine.ParameterException.md) ex, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args) | Handles a `ParameterException` that occurred while parsing the command  line arguments and optionally returns a list of results. |



## Method Details

### handleException

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __handleException__([ParameterException](CommandLine.ParameterException.md) ex, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Handles a `ParameterException` that occurred while parsing the command
 line arguments and optionally returns a list of results.

**Parameters:**

`ex` - the ParameterException describing the problem that occurred while parsing the command line arguments,
           and the CommandLine representing the command or subcommand whose input was invalid

`out` - the `PrintStream` to print help to if requested

`ansi` - for printing help messages using ANSI styles and colors

`args` - the command line arguments that could not be parsed

**Returns:**

a list of results, or an empty list if there are no results


---

