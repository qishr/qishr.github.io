Package [io.github.qishr.cascara.common.util](index.md)

# Interface IParameterExceptionHandler
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IParameterExceptionHandler<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IParameterExceptionHandler__</span>

Classes implementing this interface know how to handle `ParameterExceptions` (usually from invalid user input).

Implementation Requirements:
 

Implementors that need to print messages to the console should use the output and error PrintWriters,
 and the color scheme from the CommandLine object obtained from the exception.
 

Implementation Note:
 

See #getParameterExceptionHandler() for a description of the default handler.
 

API Note:
 

This interface supersedes [IExceptionHandler2](CommandLine.IExceptionHandler2.md).


## Method Summary

| Modifier and Type   | Method                                                                                                                                                                                                         | Description                                                                                                                                                      |
|---------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract int | [handleParseException](#handleparseexception)([ParameterException](CommandLine.ParameterException.md) ex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args) | Handles a `ParameterException` that occurred while parsing the command  line arguments and returns an exit code suitable for returning from #execute(String...). |



## Method Details

### handleParseException

<span style="font-family: monospace; font-size: 80%;">public abstract int __handleParseException__([ParameterException](CommandLine.ParameterException.md) ex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Handles a `ParameterException` that occurred while parsing the command
 line arguments and returns an exit code suitable for returning from #execute(String...).

**Parameters:**

`ex` - the ParameterException describing the problem that occurred while parsing the command line arguments,
           and the CommandLine representing the command or subcommand whose input was invalid

`args` - the command line arguments that could not be parsed

**Returns:**

an exit code

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

