Package [io.github.qishr.cascara.common.util](index.md)

# Interface IParseResultHandler2
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IParseResultHandler2<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [AbstractParseResultHandler](CommandLine.AbstractParseResultHandler.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IParseResultHandler2__</span>

Represents a function that can process the `ParseResult` object resulting from successfully
parsing the command line arguments.This is a
functional interface
whose functional method is [handleParseResult](#handleparseresult).



Implementations of this function can be passed to the #parseWithHandlers(IParseResultHandler2,  IExceptionHandler2, String...)
methods to take some next step after the command line was successfully parsed.



This interface replaces the [IParseResultHandler](CommandLine.IParseResultHandler.md) interface; it takes the parse result as a `ParseResult`
object instead of a List of `CommandLine` objects, and it has the freedom to select the Help.Ansi style
to use and what `PrintStreams` to print to.



## Method Summary

| Modifier and Type | Method                                                                                         | Description                                                                                                                    |
|-------------------|------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| public abstract R | [handleParseResult](#handleparseresult)([ParseResult](CommandLine.ParseResult.md) parseResult) | Processes the `ParseResult` object resulting from successfully  parsing the command line arguments and returns a return value. |



## Method Details

### handleParseResult

<span style="font-family: monospace; font-size: 80%;">public abstract R __handleParseResult__([ParseResult](CommandLine.ParseResult.md) parseResult)</span>

Processes the `ParseResult` object resulting from successfully
 parsing the command line arguments and returns a return value.

**Parameters:**

`parseResult` - the `ParseResult` that resulted from successfully parsing the command line arguments

**Throws:**

[ExecutionException](CommandLine.ExecutionException.md)


---

