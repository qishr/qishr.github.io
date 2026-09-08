Package [io.github.qishr.cascara.common.util](index.md)

# Interface IHelpCommandInitializable
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IHelpCommandInitializable<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [HelpCommand](CommandLine.HelpCommand.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IHelpCommandInitializable__</span>

Help commands that provide usage help for other commands can implement this interface to be initialized with the information they need.

The #printHelpIfRequested(List, PrintStream, PrintStream, Help.Ansi) method calls the
 [init](#init) method on commands marked as Command#helpCommand()
 before the help command's `run` or `call` method is called.
 

Implementation note:


 If an error occurs in the `run` or `call` method while processing the help request, it is recommended custom Help
 commands throw a [ParameterException](CommandLine.ParameterException.md) with a reference to the parent command. The [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md) will print
 the error message and the usage for the parent command, and will terminate with the exit code of the exception handler if one was set.
 


## Method Summary

| Modifier and Type    | Method                                                                                                                                                                                                                                                                                                                  | Description                                                                                                                  |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|
| public abstract void | [init](#init)([CommandLine](CommandLine.md) helpCommandLine, [Ansi](CommandLine.Help.Ansi.md) ansi, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err) | Initializes this object with the information needed to implement a help command that provides usage help for other commands. |



## Method Details

### init

<span style="font-family: monospace; font-size: 80%;">public abstract void __init__([CommandLine](CommandLine.md) helpCommandLine, [Ansi](CommandLine.Help.Ansi.md) ansi, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err)</span>

Initializes this object with the information needed to implement a help command that provides usage help for other commands.



!!! note "Deprecation"
    This has been marked as deprecated.


**Parameters:**

`helpCommandLine` - the `CommandLine` object associated with this help command. Implementors can use
                        this to walk the command hierarchy and get access to the help command's parent and sibling commands.

`ansi` - whether to use Ansi colors or not

`out` - the stream to print the usage help message to

`err` - the error stream to print any diagnostic messages to, in addition to the output from the exception handler


---

