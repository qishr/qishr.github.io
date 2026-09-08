Package [io.github.qishr.cascara.common.util](index.md)

# Class HelpCommand
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.HelpCommand<br/>
<br/>
All Implemented Interfaces:<br/>
    [IHelpCommandInitializable](CommandLine.IHelpCommandInitializable.md), [IHelpCommandInitializable2](CommandLine.IHelpCommandInitializable2.md), [Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html), [Callable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/concurrent/Callable.html)<[Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html)>

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final class __HelpCommand__</span>

Help command that can be installed as a subcommand on all application commands.When invoked with a subcommand
 argument, it prints usage help for the specified subcommand. For example:

 // print help for subcommand
 command help subcommand
 


 When invoked without additional parameters, it prints usage help for the parent command. For example:
 

 // print help for command
 command help
 
 For [Messages](CommandLine.Model.Messages.md): this command has a `--help` option with `descriptionKey = "helpCommand.help"`,
 and a `COMMAND` positional parameter with `descriptionKey = "helpCommand.command"`.


## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| HelpCommand() |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                                                                                                                                                                                                                                       | Description                                                                                         |
|-------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| public void                                                                                           | [run](#run)()                                                                                                                                                                                                                                                                                                                                | Invokes #usage(PrintStream, Help.ColorScheme) for the specified command, or for the parent command. |
| public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) | [call](#call)()                                                                                                                                                                                                                                                                                                                              |                                                                                                     |
| public void                                                                                           | [init](#init)([CommandLine](CommandLine.md) helpCommandLine, [Ansi](CommandLine.Help.Ansi.md) ansi, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err)                      |                                                                                                     |
| public void                                                                                           | [init](#init)([CommandLine](CommandLine.md) helpCommandLine, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out, [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) err) |                                                                                                     |



## Method Details

### run

<span style="font-family: monospace; font-size: 80%;">public void __run__()</span>

Invokes #usage(PrintStream, Help.ColorScheme) for the specified command, or for the parent command.

**Specified By:**

[Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html)


---

### call

<span style="font-family: monospace; font-size: 80%;">public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __call__()</span>



**Specified By:**

[Callable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/concurrent/Callable.html)


---

### init

<span style="font-family: monospace; font-size: 80%;">public void __init__([CommandLine](CommandLine.md) helpCommandLine, [Ansi](CommandLine.Help.Ansi.md) ansi, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err)</span>





!!! note "Deprecation"
    This has been marked as deprecated.


**Specified By:**

[IHelpCommandInitializable](CommandLine.IHelpCommandInitializable.md)


---

### init

<span style="font-family: monospace; font-size: 80%;">public void __init__([CommandLine](CommandLine.md) helpCommandLine, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out, [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) err)</span>



**Specified By:**

[IHelpCommandInitializable2](CommandLine.IHelpCommandInitializable2.md)


---

