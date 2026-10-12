Package [io.github.qishr.cascara.common.util](index.md)

# Class AbstractHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.AbstractHandler<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)

Direct Known Subtypes:<br/>
    [DefaultExceptionHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.DefaultExceptionHandler.md), [AbstractParseResultHandler](../../../../../../io/github/qishr/cascara/common/util/CommandLine.AbstractParseResultHandler.md)


----

<span style="font-family: monospace; font-size: 80%;">public static abstract class __AbstractHandler__</span>

Abstract superclass for [IParseResultHandler2](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IParseResultHandler2.md) and [IExceptionHandler2](../../../../../../io/github/qishr/cascara/common/util/CommandLine.IExceptionHandler2.md) implementations.

Note that `AbstractHandler` is a generic type. This, along with the abstract `self` method,
 allows method chaining to work properly in subclasses, without the need for casts. An example subclass can look like this:
 ` class MyResultHandler extends AbstractHandler<MyReturnType, MyResultHandler> implements IParseResultHandler2<MyReturnType> {

     public MyReturnType handleParseResult(ParseResult parseResult) { ... }

     protected MyResultHandler self() { return this; }
 }
 `


## Constructor Summary

| Constructor       | Description |
|-------------------|-------------|
| AbstractHandler() |             |



## Method Summary

| Modifier and Type                                                                                           | Method                                                                                                                                        | Description                                                                                                                                                                                                                                                                                                                                              |
|-------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) | [out](#out)()                                                                                                                                 | Returns the stream to print command output to.                                                                                                                                                                                                                                                                                                           |
| public [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) | [err](#err)()                                                                                                                                 | Returns the stream to print diagnostic messages to.                                                                                                                                                                                                                                                                                                      |
| public [Ansi](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.md)               | [ansi](#ansi)()                                                                                                                               | Returns the ANSI style to use.                                                                                                                                                                                                                                                                                                                           |
| public [ColorScheme](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.ColorScheme.md) | [colorScheme](#colorscheme)()                                                                                                                 | Returns the ColorScheme to use.                                                                                                                                                                                                                                                                                                                          |
| public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html)       | [exitCode](#exitcode)()                                                                                                                       | Returns the exit code to use as the termination status, or `null` (the default) if the handler should  not call System.exit after processing completes.                                                                                                                                                                                                  |
| public boolean                                                                                              | [hasExitCode](#hasexitcode)()                                                                                                                 | Returns `true` if an exit code was set with andExit.andExit, or `false` (the default) if  the handler should not call System.exit after processing completes.                                                                                                                                                                                            |
| protected R                                                                                                 | [returnResultOrExit](#returnresultorexit)(R result)                                                                                           | Convenience method for subclasses that returns the specified result object if no exit code was set,  or otherwise, if an exit code andExit.andExit, calls `System.exit` with the configured  exit code to terminate the currently running Java virtual machine.                                                                                          |
| protected R                                                                                                 | [throwOrExit](#throworexit)([ExecutionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ExecutionException.md) ex) | Convenience method for subclasses that throws the specified ExecutionException if no exit code was set,  or otherwise, if an exit code andExit.andExit, prints the stacktrace of the specified exception  to the diagnostic error stream and calls `System.exit` with the configured  exit code to terminate the currently running Java virtual machine. |
| protected void                                                                                              | [exit](#exit)(int exitCode)                                                                                                                   | Calls `System.exit(int)` with the specified exit code.                                                                                                                                                                                                                                                                                                   |
| protected abstract T                                                                                        | [self](#self)()                                                                                                                               | Returns `this` to allow method chaining when calling the setters for a fluent API.                                                                                                                                                                                                                                                                       |
| public T                                                                                                    | [useOut](#useout)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)                   | Sets the stream to print command output to.                                                                                                                                                                                                                                                                                                              |
| public T                                                                                                    | [useErr](#useerr)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err)                   | Sets the stream to print diagnostic messages to.                                                                                                                                                                                                                                                                                                         |
| public T                                                                                                    | [useAnsi](#useansi)([Ansi](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.md) ansi)                              | Sets the ANSI style to use and resets the color scheme to the default.                                                                                                                                                                                                                                                                                   |
| public T                                                                                                    | [andExit](#andexit)(int exitCode)                                                                                                             | Indicates that the handler should call System.exit after processing completes and sets the exit code to use as the termination status.                                                                                                                                                                                                                   |



## Method Details

### out

<span style="font-family: monospace; font-size: 80%;">public [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) __out__()</span>

Returns the stream to print command output to.Defaults to `System.out`, unless useOut.useOut
 was called with a different stream.
 

`IParseResultHandler2` implementations should use this stream.
 By convention, when the user requests
 help with a `--help` or similar option, the usage help message is printed to the standard output stream so that it can be easily searched and paged.


---

### err

<span style="font-family: monospace; font-size: 80%;">public [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) __err__()</span>

Returns the stream to print diagnostic messages to.Defaults to `System.err`, unless useErr.useErr
 was called with a different stream. 

`IExceptionHandler2` implementations should use this stream to print error
 messages (which may include a usage help message) when an unexpected error occurs.


---

### ansi

<span style="font-family: monospace; font-size: 80%;">public [Ansi](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.md) __ansi__()</span>

Returns the ANSI style to use.Defaults to `Help.Ansi.AUTO`, unless useAnsi.useAnsi was called with a different setting.



!!! note "Deprecation"
    use colorScheme.colorScheme instead


---

### colorScheme

<span style="font-family: monospace; font-size: 80%;">public [ColorScheme](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.ColorScheme.md) __colorScheme__()</span>

Returns the ColorScheme to use.Defaults to `Help#defaultColorScheme(Help.Ansi.AUTO)`.

**Since:**

4.0


---

### exitCode

<span style="font-family: monospace; font-size: 80%;">public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __exitCode__()</span>

Returns the exit code to use as the termination status, or `null` (the default) if the handler should
 not call System.exit after processing completes.

**See Also:**


andExit



---

### hasExitCode

<span style="font-family: monospace; font-size: 80%;">public boolean __hasExitCode__()</span>

Returns `true` if an exit code was set with andExit.andExit, or `false` (the default) if
 the handler should not call System.exit after processing completes.


---

### returnResultOrExit

<span style="font-family: monospace; font-size: 80%;">protected R __returnResultOrExit__(R result)</span>

Convenience method for subclasses that returns the specified result object if no exit code was set,
 or otherwise, if an exit code andExit.andExit, calls `System.exit` with the configured
 exit code to terminate the currently running Java virtual machine.


---

### throwOrExit

<span style="font-family: monospace; font-size: 80%;">protected R __throwOrExit__([ExecutionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.ExecutionException.md) ex)</span>

Convenience method for subclasses that throws the specified ExecutionException if no exit code was set,
 or otherwise, if an exit code andExit.andExit, prints the stacktrace of the specified exception
 to the diagnostic error stream and calls `System.exit` with the configured
 exit code to terminate the currently running Java virtual machine.


---

### exit

<span style="font-family: monospace; font-size: 80%;">protected void __exit__(int exitCode)</span>

Calls `System.exit(int)` with the specified exit code.


---

### self

<span style="font-family: monospace; font-size: 80%;">protected abstract T __self__()</span>

Returns `this` to allow method chaining when calling the setters for a fluent API.


---

### useOut

<span style="font-family: monospace; font-size: 80%;">public T __useOut__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)</span>

Sets the stream to print command output to.



!!! note "Deprecation"
    use CommandLine#setOut(PrintWriter) and CommandLine#execute(String...) instead


---

### useErr

<span style="font-family: monospace; font-size: 80%;">public T __useErr__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err)</span>

Sets the stream to print diagnostic messages to.



!!! note "Deprecation"
    use CommandLine#setErr(PrintWriter) and CommandLine#execute(String...) instead


---

### useAnsi

<span style="font-family: monospace; font-size: 80%;">public T __useAnsi__([Ansi](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Help.Ansi.md) ansi)</span>

Sets the ANSI style to use and resets the color scheme to the default.



!!! note "Deprecation"
    use CommandLine#setColorScheme(Help.ColorScheme) and CommandLine#execute(String...) instead

**See Also:**


ansi



---

### andExit

<span style="font-family: monospace; font-size: 80%;">public T __andExit__(int exitCode)</span>

Indicates that the handler should call System.exit after processing completes and sets the exit code to use as the termination status.



!!! note "Deprecation"
    use CommandLine#execute(String...) instead, and call `System.exit()` in the application.


---

