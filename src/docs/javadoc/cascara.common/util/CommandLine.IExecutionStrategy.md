Package [io.github.qishr.cascara.common.util](index.md)

# Interface IExecutionStrategy
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IExecutionStrategy<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [AbstractParseResultHandler](CommandLine.AbstractParseResultHandler.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IExecutionStrategy__</span>

Implementations are responsible for "executing" the user input and returning an exit code.The [execute](#execute) method delegates to a configured execution strategy.


Implementation Requirements:


Implementers responsibilities are:

  From the `ParseResult`, select which `CommandSpec` should be executed. This is especially important for commands that have subcommands.
  "Execute" the selected `CommandSpec`. Often this means invoking a method on the spec's user object.
  Call CommandLine#setExecutionResult(Object) to make the return value of that method invocation available to the application
  Return an exit code. Common sources of exit values are the invoked method's return value, or the user object if it implements [IExitCodeGenerator](CommandLine.IExitCodeGenerator.md).



Implementors that need to print messages to the console should use the output and error PrintWriters,
and the color scheme from the CommandLine object obtained from ParseResult's CommandSpec.


API Note:


This interface supersedes [IParseResultHandler2](CommandLine.IParseResultHandler2.md).


## Method Summary

| Modifier and Type   | Method                                                                     | Description                                         |
|---------------------|----------------------------------------------------------------------------|-----------------------------------------------------|
| public abstract int | [execute](#execute)([ParseResult](CommandLine.ParseResult.md) parseResult) | "Executes" the user input and returns an exit code. |



## Method Details

### execute

<span style="font-family: monospace; font-size: 80%;">public abstract int __execute__([ParseResult](CommandLine.ParseResult.md) parseResult)</span>

"Executes" the user input and returns an exit code.Execution often means invoking a method on the selected CommandSpec's user object,
and making the return value of that invocation available via CommandLine#setExecutionResult(Object).

**Parameters:**

`parseResult` - the parse result from which to select one or more `CommandSpec` instances to execute.

**Returns:**

an exit code

**Throws:**

[ExecutionException](CommandLine.ExecutionException.md)
, [ParameterException](CommandLine.ParameterException.md)


---

