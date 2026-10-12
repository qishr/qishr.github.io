Package [io.github.qishr.cascara.common.util](index.md)

# Class AbstractParseResultHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.CommandLine.AbstractHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractHandler.md)<R, [io.github.qishr.cascara.common.util.CommandLine.AbstractParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractParseResultHandler.md)<R>><br/>
                io.github.qishr.cascara.common.util.CommandLine.AbstractParseResultHandler<br/>
<br/>
All Implemented Interfaces:<br/>
    [IParseResultHandler2](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IParseResultHandler2.md)<R>, [IExecutionStrategy](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExecutionStrategy.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)

Direct Known Subtypes:<br/>
    [RunFirst](../../../../../../io/github/qishr/cascara/common/util/CommandLine.RunFirst.md), [RunLast](../../../../../../io/github/qishr/cascara/common/util/CommandLine.RunLast.md), [RunAll](../../../../../../io/github/qishr/cascara/common/util/CommandLine.RunAll.md)


----

<span style="font-family: monospace; font-size: 80%;">public static abstract class __AbstractParseResultHandler__<br/>extends [AbstractHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractHandler.md)<R, [AbstractParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractParseResultHandler.md)<R>>
</span>

Command line parse result handler that returns a value.This handler prints help if requested, and otherwise calls
 handle with the parse result. Facilitates implementation of the [IParseResultHandler2](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IParseResultHandler2.md) interface.
 

Note that `AbstractParseResultHandler` is a generic type. This, along with the abstract `self` method,
 allows method chaining to work properly in subclasses, without the need for casts. An example subclass can look like this:
 ` class MyResultHandler extends AbstractParseResultHandler<MyReturnType> {

     protected MyReturnType handle(ParseResult parseResult) throws ExecutionException { ... }

     protected MyResultHandler self() { return this; }
 }
 `


## Constructor Summary

| Constructor                  | Description |
|------------------------------|-------------|
| AbstractParseResultHandler() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                 | Method                                                                                                                                                               | Description                                                                        |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| public R                                                                                                                                                                                                          | [handleParseResult](#handleparseresult)([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)                 | Prints help if requested, and otherwise calls handle.handle.                       |
| public int                                                                                                                                                                                                        | [execute](#execute)([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)                                     |                                                                                    |
| protected abstract R                                                                                                                                                                                              | [handle](#handle)([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)                                       | Processes the specified `ParseResult` and returns the result as a list of objects. |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IExitCodeGenerator](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExitCodeGenerator.md)> | [extractExitCodeGenerators](#extractexitcodegenerators)([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult) |                                                                                    |


### Methods inherited from [AbstractHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractHandler.md)

err, andExit, returnResultOrExit, colorScheme, ansi, useAnsi, throwOrExit, hasExitCode, self, exit, useOut, exitCode, out, useErr


## Method Details

### handleParseResult

<span style="font-family: monospace; font-size: 80%;">public R __handleParseResult__([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)</span>

Prints help if requested, and otherwise calls handle.handle.Finally, either a list of result objects is returned, or the JVM is terminated if an exit code was set.

**Parameters:**

`parseResult` - the `ParseResult` that resulted from successfully parsing the command line arguments

**Returns:**

the result of handle.handle

**Throws:**

[ExecutionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ExecutionException.md)

**Specified By:**

[IParseResultHandler2](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IParseResultHandler2.md)


---

### execute

<span style="font-family: monospace; font-size: 80%;">public int __execute__([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)</span>



**Throws:**

[ExecutionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ExecutionException.md)

**Specified By:**

[IExecutionStrategy](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExecutionStrategy.md)


---

### handle

<span style="font-family: monospace; font-size: 80%;">protected abstract R __handle__([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)</span>

Processes the specified `ParseResult` and returns the result as a list of objects.Implementations are responsible for catching any exceptions thrown in the `handle` method, and
 rethrowing an `ExecutionException` that details the problem and captures the offending `CommandLine` object.

**Parameters:**

`parseResult` - the `ParseResult` that resulted from successfully parsing the command line arguments

**Returns:**

the result of processing parse results

**Throws:**

[ExecutionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ExecutionException.md)


---

### extractExitCodeGenerators

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IExitCodeGenerator](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExitCodeGenerator.md)> __extractExitCodeGenerators__([ParseResult](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ParseResult.md) parseResult)</span>




---

