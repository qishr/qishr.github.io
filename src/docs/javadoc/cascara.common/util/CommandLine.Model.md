Package [io.github.qishr.cascara.common.util](index.md)

# Class Model
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final class __Model__</span>

This class provides a namespace for classes and interfaces that model concepts and attributes of command line interfaces in picocli.


## Nested Class Summary

| Modifier and Type       | Class                                                                                                                   | Description                                                                                                                                                                                                                                                                                 |
|-------------------------|-------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)                 | The `ArgGroupSpec` class models a [ArgGroup](CommandLine.ArgGroup.md) of arguments (options, positional parameters or a mixture of the two).                                                                                                                                                |
| public static abstract  | [io.github.qishr.cascara.common.util.CommandLine.Model.ArgSpec](CommandLine.Model.ArgSpec.md)                           | Models the shared attributes of [OptionSpec](CommandLine.Model.OptionSpec.md) and [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md).                                                                                                                                          |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.CommandSpec](CommandLine.Model.CommandSpec.md)                   | The `CommandSpec` class models a command specification, including the options, positional parameters and subcommands  supported by the command, as well as attributes for the version help message and the usage help message of the command.                                               |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.Messages](CommandLine.Model.Messages.md)                         | Utility class for getting resource bundle strings.                                                                                                                                                                                                                                          |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.MethodParam](CommandLine.Model.MethodParam.md)                   | Command method parameter, similar to java.lang.reflect.Parameter (not available before Java 8).                                                                                                                                                                                             |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.OptionSpec](CommandLine.Model.OptionSpec.md)                     | The `OptionSpec` class models aspects of a named option of a [CommandSpec](CommandLine.Model.CommandSpec.md), including whether  it is required or optional, the option parameters supported (or required) by the option,  and attributes for the usage help message describing the option. |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.ParserSpec](CommandLine.Model.ParserSpec.md)                     | Models parser configuration specification.                                                                                                                                                                                                                                                  |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)   | The `PositionalParamSpec` class models aspects of a positional parameter of a [CommandSpec](CommandLine.Model.CommandSpec.md), including whether  it is required or optional, and attributes for the usage help message describing the positional parameter.                                |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) | This class allows applications to specify a custom binding that will be invoked for unmatched arguments.                                                                                                                                                                                    |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Model.UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)         | Models the usage help message specification and can be used to customize the usage help message.                                                                                                                                                                                            |


