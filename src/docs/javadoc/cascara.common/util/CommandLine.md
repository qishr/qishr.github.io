Package [io.github.qishr.cascara.common.util](index.md)

# Class CommandLine
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __CommandLine__</span>




CommandLine interpreter that uses reflection to initialize an annotated user object with values obtained from the
command line arguments.


The full user manual is hosted at https://picocli.info.
Example



An example that implements `Callable` and uses the [execute](#execute) convenience API to run in a single line of code:


Command(name = "checksum", mixinStandardHelpOptions = true, version = "checksum 4.0",
         description = "Prints the checksum (SHA-1 by default) of a file to STDOUT.")
class CheckSum implements CallableInteger {

    Parameters(index = "0", description = "The file whose checksum to calculate.")
    private File file;

    Option(names = {"-a", "--algorithm"}, description = "MD5, SHA-1, SHA-256, ...")
    private String algorithm = "SHA-1";

    Override
    public Integer call() throws Exception { // your business logic goes here...
        byte[] fileContents = Files.readAllBytes(file.toPath());
        byte[] digest = MessageDigest.getInstance(algorithm).digest(fileContents);
        System.out.printf("%0" + (digest.length*2) + "x%n", new BigInteger(1,digest));
        return 0;
    }

    // CheckSum implements Callable, so parsing, error handling and handling user
    // requests for usage help or version help can be done with one line of code.
    public static void main(String[] args) {
        int exitCode = new CommandLine(new CheckSum()).execute(args);
        System.exit(exitCode);
    }
}



Another example where the application calls `parseArgs` and takes responsibility
for error handling and checking whether the user requested help:
import static picocli.CommandLine.*;

Command(mixinStandardHelpOptions = true, version = "v3.0.0",
        header = "Encrypt FILE(s), or standard input, to standard output or to the output file.")
public class Encrypt {

    Parameters(description = "Any number of input files")
    private ListFile files = new ArrayListFile();

    Option(names = { "-o", "--out" }, description = "Output file (default: print to console)")
    private File outputFile;

    Option(names = { "-v", "--verbose"}, description = "Verbose mode. Helpful for troubleshooting. Multiple -v options increase the verbosity.")
    private boolean[] verbose;
}




Use `CommandLine` to initialize a user object as follows:

public static void main(String... args) {
    Encrypt encrypt = new Encrypt();
    try {
        ParseResult parseResult = new CommandLine(encrypt).parseArgs(args);
        if (!CommandLine.printHelpIfRequested(parseResult)) {
            runProgram(encrypt);
        }
    } catch (ParameterException ex) { // command line arguments could not be parsed
        System.err.println(ex.getMessage());
        ex.getCommandLine().usage(System.err);
    }
}



Invoke the above program with some command line arguments. The below are all equivalent:


--verbose --out=outfile in1 in2
--verbose --out outfile in1 in2
-v --out=outfile in1 in2
-v -o outfile in1 in2
-v -o=outfile in1 in2
-vo outfile in1 in2
-vo=outfile in1 in2
-v -ooutfile in1 in2
-vooutfile in1 in2

Classes and Interfaces for Defining a CommandSpec Model





Classes Related to Parsing Command Line Arguments







## Nested Class Summary

| Modifier and Type       | Class                                                                                                                                     | Description                                                                                                                                                                                                               |
|-------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static abstract  | [io.github.qishr.cascara.common.util.CommandLine.AbstractHandler](CommandLine.AbstractHandler.md)                                         | Abstract superclass for [IParseResultHandler2](CommandLine.IParseResultHandler2.md) and [IExceptionHandler2](CommandLine.IExceptionHandler2.md) implementations.                                                          |
| public static abstract  | [io.github.qishr.cascara.common.util.CommandLine.AbstractParseResultHandler](CommandLine.AbstractParseResultHandler.md)                   | Command line parse result handler that returns a value.                                                                                                                                                                   |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md)                         | Default exception handler that handles invalid user input by printing the exception message, followed by the usage message for the command or subcommand whose input was invalid.                                         |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.DuplicateNameException](CommandLine.DuplicateNameException.md)                           | Exception indicating that multiple named elements have incorrectly used the same name.                                                                                                                                    |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.DuplicateOptionAnnotationsException](CommandLine.DuplicateOptionAnnotationsException.md) | Exception indicating that multiple fields have been annotated with the same Option name.                                                                                                                                  |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.ExecutionException](CommandLine.ExecutionException.md)                                   | Exception indicating a problem while invoking a command or subcommand.                                                                                                                                                    |
| public static final     | [io.github.qishr.cascara.common.util.CommandLine.ExitCode](CommandLine.ExitCode.md)                                                       | Defines some exit codes used by picocli as default return values from the #execute(String...) and #executeHelpRequest(ParseResult) methods.                                                                               |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)                                                               | A collection of methods and inner classes that provide fine-grained control over the contents and layout of the usage help message to display to end users when help is requested or invalid input values were specified. |
| public static final     | [io.github.qishr.cascara.common.util.CommandLine.HelpCommand](CommandLine.HelpCommand.md)                                                 | Help command that can be installed as a subcommand on all application commands.                                                                                                                                           |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.InitializationException](CommandLine.InitializationException.md)                         | Exception indicating a problem during `CommandLine` initialization.                                                                                                                                                       |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.MaxValuesExceededException](CommandLine.MaxValuesExceededException.md)                   | Exception indicating that more values were specified for an option or parameter than its Option#arity() allows.                                                                                                           |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.MissingParameterException](CommandLine.MissingParameterException.md)                     | Exception indicating that a required parameter was not specified.                                                                                                                                                         |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.MissingTypeConverterException](CommandLine.MissingTypeConverterException.md)             | Exception indicating that an annotated field had a type for which no [ITypeConverter](CommandLine.ITypeConverter.md) was registered.                                                                                      |
| public static final     | [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)                                                             | This class provides a namespace for classes and interfaces that model concepts and attributes of command line interfaces in picocli.                                                                                      |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.MutuallyExclusiveArgsException](CommandLine.MutuallyExclusiveArgsException.md)           | Exception indicating that the user input included multiple arguments from a mutually exclusive group.                                                                                                                     |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.OverwrittenOptionException](CommandLine.OverwrittenOptionException.md)                   | Exception indicating that an option for a single-value option field has been specified multiple times on the command line.                                                                                                |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.ParameterException](CommandLine.ParameterException.md)                                   | Exception indicating something went wrong while parsing command line options.                                                                                                                                             |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.ParameterIndexGapException](CommandLine.ParameterIndexGapException.md)                   | Exception indicating that there was a gap in the indices of the fields annotated with [Parameters](CommandLine.Parameters.md).                                                                                            |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.ParseResult](CommandLine.ParseResult.md)                                                 | Encapsulates the result of parsing an array of command line arguments.                                                                                                                                                    |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.PicocliException](CommandLine.PicocliException.md)                                       | Base class of all exceptions thrown by `picocli.CommandLine`.                                                                                                                                                             |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.PropertiesDefaultProvider](CommandLine.PropertiesDefaultProvider.md)                     | [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) implementation that loads default values for command line options and positional parameters from a properties file or `Properties` object.                  |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.Range](CommandLine.Range.md)                                                             | Describes the number of parameters required and accepted by an option or a positional parameter.                                                                                                                          |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.RegexTransformer](CommandLine.RegexTransformer.md)                                       | A regular expression-based option name transformation for negatable options.                                                                                                                                              |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.RunAll](CommandLine.RunAll.md)                                                           | Command line [IExecutionStrategy](CommandLine.IExecutionStrategy.md) that prints help if requested, and otherwise executes the top-level command and all subcommands as `Runnable`, `Callable` or `Method`.               |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.RunFirst](CommandLine.RunFirst.md)                                                       | Command line [IExecutionStrategy](CommandLine.IExecutionStrategy.md) that prints help if requested, and otherwise executes the top-level `Runnable` or `Callable` command.                                                |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.RunLast](CommandLine.RunLast.md)                                                         | Command line [IExecutionStrategy](CommandLine.IExecutionStrategy.md) that prints help if requested, and otherwise executes the most specific `Runnable` or `Callable` subcommand.                                         |
| public static final     | [io.github.qishr.cascara.common.util.CommandLine.Tracer](CommandLine.Tracer.md)                                                           | Utility class for printing internal debug statements.                                                                                                                                                                     |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.TypeConversionException](CommandLine.TypeConversionException.md)                         | Exception thrown by [ITypeConverter](CommandLine.ITypeConverter.md) implementations to indicate a String could not be converted.                                                                                          |
| public static           | [io.github.qishr.cascara.common.util.CommandLine.UnmatchedArgumentException](CommandLine.UnmatchedArgumentException.md)                   | Exception indicating that a command line argument could not be mapped to any of the fields annotated with  [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md).                                    |
| public static final     | [io.github.qishr.cascara.common.util.CommandLine.UseDefaultConverter](CommandLine.UseDefaultConverter.md)                                 | Converter that can be used to signal to picocli that it should use the default converter.                                                                                                                                 |



## Field Summary

| Modifier and Type                                                                                                | Field               | Description               |
|------------------------------------------------------------------------------------------------------------------|---------------------|---------------------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VERSION](#version) | This is picocli version . |



## Constructor Summary

| Constructor                                                                                                                                                    | Description                                                                                                                                                                                                          |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| CommandLine([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)                                              | Constructs a new `CommandLine` interpreter with the specified object (which may be an annotated user object or a [CommandSpec](CommandLine.Model.CommandSpec.md)) and a default [IFactory](CommandLine.IFactory.md). |
| CommandLine([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [IFactory](CommandLine.IFactory.md) factory) | Constructs a new `CommandLine` interpreter with the specified object (which may be an annotated user object or a [CommandSpec](CommandLine.Model.CommandSpec.md)) and object factory.                                |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                         | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                                                                                   |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                                                    | [getCommandSpec](#getcommandspec)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the `CommandSpec` model that this `CommandLine` was constructed with.                                                                                                                                                                                                                                 |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [addMixin](#addmixin)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) mixin)                                                                                                                                                                                                                                                                                                                                                                  | Adds the options and positional parameters in the specified mixin to this command.                                                                                                                                                                                                                            |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> | [getMixins](#getmixins)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Returns a map of user objects whose options and positional parameters were added to ("mixed in" with) this command.                                                                                                                                                                                           |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [addSubcommand](#addsubcommand)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Registers a subcommand with the name obtained from the `@Command(name = "...")` annotation attribute of the specified command.                                                                                                                                                                                |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [addSubcommand](#addsubcommand)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)                                                                                                                                                                                                                                                                                                                                                      | Registers a subcommand with the specified name.                                                                                                                                                                                                                                                               |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [addSubcommand](#addsubcommand)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] aliases)                                                                                                                                                                                                                                              | Registers a subcommand with the specified name and all specified aliases.                                                                                                                                                                                                                                     |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandLine](CommandLine.md)>                                                                | [getSubcommands](#getsubcommands)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns a map with the subcommands [addSubcommand.addSubcommand](#addsubcommand) on this instance.                                                                                                                                                                                                            |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [getParent](#getparent)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Returns the command that this is a subcommand of, or `null` if this is a top-level command.                                                                                                                                                                                                                   |
| public T                                                                                                                                                                                                                                                                                  | [getCommand](#getcommand)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Returns the annotated user object that this `CommandLine` instance was constructed with.                                                                                                                                                                                                                      |
| public [IFactory](CommandLine.IFactory.md)                                                                                                                                                                                                                                                | [getFactory](#getfactory)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Returns the factory that this `CommandLine` was constructed with.                                                                                                                                                                                                                                             |
| public boolean                                                                                                                                                                                                                                                                            | [isUsageHelpRequested](#isusagehelprequested)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns `true` if an option annotated with Option#usageHelp() was specified on the command line.                                                                                                                                                                                                              |
| public boolean                                                                                                                                                                                                                                                                            | [isVersionHelpRequested](#isversionhelprequested)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns `true` if an option annotated with Option#versionHelp() was specified on the command line.                                                                                                                                                                                                            |
| public [Help](CommandLine.Help.md)                                                                                                                                                                                                                                                        | [getHelp](#gethelp)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Returns a new `Help` object created by the `IHelpFactory` with the `CommandSpec` and `ColorScheme` of this command.                                                                                                                                                                                           |
| public [IHelpFactory](CommandLine.IHelpFactory.md)                                                                                                                                                                                                                                        | [getHelpFactory](#gethelpfactory)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the `IHelpFactory` that is used to construct the usage help message.                                                                                                                                                                                                                                  |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setHelpFactory](#sethelpfactory)([IHelpFactory](CommandLine.IHelpFactory.md) helpFactory)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Sets a new `IHelpFactory` to customize the usage help message.                                                                                                                                                                                                                                                |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                             | [getHelpSectionKeys](#gethelpsectionkeys)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Returns the section keys in the order that the usage help message should render the sections.                                                                                                                                                                                                                 |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setHelpSectionKeys](#sethelpsectionkeys)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> keys)                                                                                                                                                                                                                                                                                                                                                        | Sets the section keys in the order that the usage help message should render the sections.                                                                                                                                                                                                                    |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)>                                  | [getHelpSectionMap](#gethelpsectionmap)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Returns the map of section keys and renderers used to construct the usage help message.                                                                                                                                                                                                                       |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setHelpSectionMap](#sethelpsectionmap)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)> map)                                                                                                                                                                                                                                                                                                | Sets the map of section keys and renderers used to construct the usage help message.                                                                                                                                                                                                                          |
| public boolean                                                                                                                                                                                                                                                                            | [isAdjustLineBreaksForWideCJKCharacters](#isadjustlinebreaksforwidecjkcharacters)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns whether line breaks should take wide Chinese, Japanese and Korean characters into account for line-breaking purposes.                                                                                                                                                                                 |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setAdjustLineBreaksForWideCJKCharacters](#setadjustlinebreaksforwidecjkcharacters)(boolean adjustForWideChars)                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Sets whether line breaks should take wide Chinese, Japanese and Korean characters into account, and returns this UsageMessageSpec.                                                                                                                                                                            |
| public boolean                                                                                                                                                                                                                                                                            | [isToggleBooleanFlags](#istogglebooleanflags)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns whether the value of boolean flag options should be "toggled" when the option is matched.                                                                                                                                                                                                             |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setToggleBooleanFlags](#settogglebooleanflags)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Sets whether the value of boolean flag options should be "toggled" when the option is matched.                                                                                                                                                                                                                |
| public boolean                                                                                                                                                                                                                                                                            | [isInterpolateVariables](#isinterpolatevariables)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns whether variables should be interpolated in String values.                                                                                                                                                                                                                                            |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setInterpolateVariables](#setinterpolatevariables)(boolean interpolate)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Sets whether variables should be interpolated in String values.                                                                                                                                                                                                                                               |
| public boolean                                                                                                                                                                                                                                                                            | [isOverwrittenOptionsAllowed](#isoverwrittenoptionsallowed)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Returns whether options for single-value fields can be specified multiple times on the command line.                                                                                                                                                                                                          |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setOverwrittenOptionsAllowed](#setoverwrittenoptionsallowed)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Sets whether options for single-value fields can be specified multiple times on the command line without a [OverwrittenOptionException](CommandLine.OverwrittenOptionException.md) being thrown.                                                                                                              |
| public boolean                                                                                                                                                                                                                                                                            | [isPosixClusteredShortOptionsAllowed](#isposixclusteredshortoptionsallowed)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Returns whether the parser accepts clustered short options.                                                                                                                                                                                                                                                   |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setPosixClusteredShortOptionsAllowed](#setposixclusteredshortoptionsallowed)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Sets whether short options like `-x -v -f SomeFile` can be clustered together like `-xvfSomeFile`.                                                                                                                                                                                                            |
| public boolean                                                                                                                                                                                                                                                                            | [isCaseInsensitiveEnumValuesAllowed](#iscaseinsensitiveenumvaluesallowed)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Returns whether the parser should ignore case when converting arguments to `enum` values.                                                                                                                                                                                                                     |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setCaseInsensitiveEnumValuesAllowed](#setcaseinsensitiveenumvaluesallowed)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Sets whether the parser should ignore case when converting arguments to `enum` values.                                                                                                                                                                                                                        |
| public boolean                                                                                                                                                                                                                                                                            | [isTrimQuotes](#istrimquotes)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns whether the parser should trim quotes from command line arguments.                                                                                                                                                                                                                                    |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setTrimQuotes](#settrimquotes)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Sets whether the parser should trim quotes from command line arguments before processing them.                                                                                                                                                                                                                |
| public boolean                                                                                                                                                                                                                                                                            | [isSplitQuotedStrings](#issplitquotedstrings)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns whether the parser is allowed to split quoted Strings or not.                                                                                                                                                                                                                                         |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setSplitQuotedStrings](#setsplitquotedstrings)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Sets whether the parser is allowed to split quoted Strings.                                                                                                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getEndOfOptionsDelimiter](#getendofoptionsdelimiter)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Returns the end-of-options delimiter that signals that the remaining command line arguments should be treated as positional parameters.                                                                                                                                                                       |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setEndOfOptionsDelimiter](#setendofoptionsdelimiter)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) delimiter)                                                                                                                                                                                                                                                                                                                                                                                                                                 | Sets the end-of-options delimiter that signals that the remaining command line arguments should be treated as positional parameters.                                                                                                                                                                          |
| public boolean                                                                                                                                                                                                                                                                            | [isSubcommandsCaseInsensitive](#issubcommandscaseinsensitive)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns whether upper case and lower case should be ignored when matching subcommands.                                                                                                                                                                                                                        |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setSubcommandsCaseInsensitive](#setsubcommandscaseinsensitive)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Sets whether upper case and lower case should be ignored when matching subcommands.                                                                                                                                                                                                                           |
| public boolean                                                                                                                                                                                                                                                                            | [isOptionsCaseInsensitive](#isoptionscaseinsensitive)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Returns whether upper case and lower case should be ignored when matching option names.                                                                                                                                                                                                                       |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setOptionsCaseInsensitive](#setoptionscaseinsensitive)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Sets whether upper case and lower case should be ignored when matching option names.                                                                                                                                                                                                                          |
| public boolean                                                                                                                                                                                                                                                                            | [isAbbreviatedSubcommandsAllowed](#isabbreviatedsubcommandsallowed)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Returns whether abbreviation of subcommands should be allowed when matching subcommands.                                                                                                                                                                                                                      |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setAbbreviatedSubcommandsAllowed](#setabbreviatedsubcommandsallowed)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Sets whether abbreviated subcommands should be matched.                                                                                                                                                                                                                                                       |
| public boolean                                                                                                                                                                                                                                                                            | [isAbbreviatedOptionsAllowed](#isabbreviatedoptionsallowed)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Returns whether abbreviation of option names should be allowed when matching options.                                                                                                                                                                                                                         |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setAbbreviatedOptionsAllowed](#setabbreviatedoptionsallowed)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Sets whether abbreviated option names should be matched.                                                                                                                                                                                                                                                      |
| public [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md)                                                                                                                                                                                                                      | [getDefaultValueProvider](#getdefaultvalueprovider)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Returns the default value provider for the command, or `null` if none has been set.                                                                                                                                                                                                                           |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setDefaultValueProvider](#setdefaultvalueprovider)([IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Sets a default value provider for the command and sub-commands                                                                                                                                                                                                                                                |
| public boolean                                                                                                                                                                                                                                                                            | [isStopAtPositional](#isstopatpositional)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Returns whether the parser interprets the first positional parameter as "end of options" so the remaining  arguments are all treated as positional parameters.                                                                                                                                                |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setStopAtPositional](#setstopatpositional)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Sets whether the parser interprets the first positional parameter as "end of options" so the remaining  arguments are all treated as positional parameters.                                                                                                                                                   |
| public boolean                                                                                                                                                                                                                                                                            | [isStopAtUnmatched](#isstopatunmatched)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Returns whether the parser should stop interpreting options and positional parameters as soon as it encounters an  unmatched option.                                                                                                                                                                          |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setStopAtUnmatched](#setstopatunmatched)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Sets whether the parser should stop interpreting options and positional parameters as soon as it encounters an  unmatched option.                                                                                                                                                                             |
| public boolean                                                                                                                                                                                                                                                                            | [isAllowSubcommandsAsOptionParameters](#isallowsubcommandsasoptionparameters)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns whether options can have parameter values that match subcommand names or aliases,  or whether such values should be rejected with a missing parameter exception.                                                                                                                                      |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setAllowSubcommandsAsOptionParameters](#setallowsubcommandsasoptionparameters)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Sets whether options can have parameter values that match subcommand names or aliases, or whether such values should be rejected with a missing parameter exception.                                                                                                                                          |
| public boolean                                                                                                                                                                                                                                                                            | [isAllowOptionsAsOptionParameters](#isallowoptionsasoptionparameters)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Returns whether options can have parameter values that match the name of an option in this command,  or whether such values should be rejected with a missing parameter exception.                                                                                                                            |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setAllowOptionsAsOptionParameters](#setallowoptionsasoptionparameters)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Sets whether options can have parameter values that match the name of an option in this command, or whether such values should be rejected with a missing parameter exception.                                                                                                                                |
| public boolean                                                                                                                                                                                                                                                                            | [isUnmatchedOptionsAllowedAsOptionParameters](#isunmatchedoptionsallowedasoptionparameters)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Returns whether options can have parameter values that resemble an option, or whether such values should be rejected as unknown options.                                                                                                                                                                      |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setUnmatchedOptionsAllowedAsOptionParameters](#setunmatchedoptionsallowedasoptionparameters)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Sets whether options can have parameter values that resemble an option, or whether such values should be rejected as unknown options.                                                                                                                                                                         |
| public boolean                                                                                                                                                                                                                                                                            | [isUnmatchedOptionsArePositionalParams](#isunmatchedoptionsarepositionalparams)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Returns whether arguments on the command line that resemble an option should be treated as positional parameters.                                                                                                                                                                                             |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setUnmatchedOptionsArePositionalParams](#setunmatchedoptionsarepositionalparams)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Sets whether arguments on the command line that resemble an option should be treated as positional parameters.                                                                                                                                                                                                |
| public boolean                                                                                                                                                                                                                                                                            | [isUnmatchedArgumentsAllowed](#isunmatchedargumentsallowed)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Returns whether the end user may specify arguments on the command line that are not matched to any option or parameter fields.                                                                                                                                                                                |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setUnmatchedArgumentsAllowed](#setunmatchedargumentsallowed)(boolean newValue)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Sets whether the end user may specify unmatched arguments on the command line without a [UnmatchedArgumentException](CommandLine.UnmatchedArgumentException.md) being thrown.                                                                                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                             | [getUnmatchedArguments](#getunmatchedarguments)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Returns the list of unmatched command line arguments, if any.                                                                                                                                                                                                                                                 |
| public [ColorScheme](CommandLine.Help.ColorScheme.md)                                                                                                                                                                                                                                     | [getColorScheme](#getcolorscheme)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the color scheme to use when printing help.                                                                                                                                                                                                                                                           |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setColorScheme](#setcolorscheme)([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Sets the color scheme to use when printing help.                                                                                                                                                                                                                                                              |
| public [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html)                                                                                                                                                                               | [getOut](#getout)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the writer used when printing user-requested usage help or version help during command [execute.execute](#execute).                                                                                                                                                                                   |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setOut](#setout)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out)                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Sets the writer to use when printing user-requested usage help or version help during command [execute.execute](#execute).                                                                                                                                                                                    |
| public [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html)                                                                                                                                                                               | [getErr](#geterr)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the writer to use when printing diagnostic (error) messages during command [execute.execute](#execute).                                                                                                                                                                                               |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setErr](#seterr)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) err)                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Sets the writer to use when printing diagnostic (error) messages during command [execute.execute](#execute).                                                                                                                                                                                                  |
| public [IExitCodeExceptionMapper](CommandLine.IExitCodeExceptionMapper.md)                                                                                                                                                                                                                | [getExitCodeExceptionMapper](#getexitcodeexceptionmapper)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Returns the mapper that was set by the application to map from exceptions to exit codes, for use by the [execute.execute](#execute) method.                                                                                                                                                                   |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setExitCodeExceptionMapper](#setexitcodeexceptionmapper)([IExitCodeExceptionMapper](CommandLine.IExitCodeExceptionMapper.md) exitCodeExceptionMapper)                                                                                                                                                                                                                                                                                                                                                                                                                                        | Sets the mapper used by the [execute.execute](#execute) method to map exceptions to exit codes.                                                                                                                                                                                                               |
| public [IExecutionStrategy](CommandLine.IExecutionStrategy.md)                                                                                                                                                                                                                            | [getExecutionStrategy](#getexecutionstrategy)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns the execution strategy used by the [execute.execute](#execute) method to invoke  the business logic on the user objects of this command and/or the user-specified subcommand(s).                                                                                                                      |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setExecutionStrategy](#setexecutionstrategy)([IExecutionStrategy](CommandLine.IExecutionStrategy.md) executionStrategy)                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Sets the execution strategy that the [execute.execute](#execute) method should use to invoke  the business logic on the user objects of this command and/or the user-specified subcommand(s).                                                                                                                 |
| public [IParameterExceptionHandler](CommandLine.IParameterExceptionHandler.md)                                                                                                                                                                                                            | [getParameterExceptionHandler](#getparameterexceptionhandler)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns the handler for dealing with invalid user input when the command is [execute.execute](#execute).                                                                                                                                                                                                      |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setParameterExceptionHandler](#setparameterexceptionhandler)([IParameterExceptionHandler](CommandLine.IParameterExceptionHandler.md) parameterExceptionHandler)                                                                                                                                                                                                                                                                                                                                                                                                                              | Sets the handler for dealing with invalid user input when the command is [execute.execute](#execute).                                                                                                                                                                                                         |
| public [IExecutionExceptionHandler](CommandLine.IExecutionExceptionHandler.md)                                                                                                                                                                                                            | [getExecutionExceptionHandler](#getexecutionexceptionhandler)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns the handler for dealing with exceptions that occurred in the `Callable`, `Runnable` or `Method`  user object of a command when the command was [execute.execute](#execute).                                                                                                                           |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setExecutionExceptionHandler](#setexecutionexceptionhandler)([IExecutionExceptionHandler](CommandLine.IExecutionExceptionHandler.md) executionExceptionHandler)                                                                                                                                                                                                                                                                                                                                                                                                                              | Sets a custom handler for dealing with exceptions that occurred in the `Callable`, `Runnable` or `Method` user object of a command when the command was executed via the [execute.execute](#execute) method.                                                                                                  |
| public static T                                                                                                                                                                                                                                                                           | [populateCommand](#populatecommand)(T command, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                                                                                                           |    Convenience method that initializes the specified annotated object from the specified command line arguments.                                                                                                                                                                                              |
| public static T                                                                                                                                                                                                                                                                           | [populateSpec](#populatespec)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> spec, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                        |    Convenience method that derives the command specification from the specified interface class, and returns an instance of the specified interface.                                                                                                                                                          |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)>                                                                                                                                                            | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Expands any [CommandLine.isExpandAtFiles](#isexpandatfiles) in the specified command line arguments, then  parses the arguments and returns a list of `CommandLine` objects representing the  top-level command and any subcommands (if any) that were recognized and initialized during the parsing process. |
| public [ParseResult](CommandLine.ParseResult.md)                                                                                                                                                                                                                                          | [parseArgs](#parseargs)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Expands any [CommandLine.isExpandAtFiles](#isexpandatfiles) in the specified command line arguments, then  parses the arguments and returns a `ParseResult` with the options, positional  parameters, and subcommands (if any) that were recognized and initialized during the parsing process.               |
| public [ParseResult](CommandLine.ParseResult.md)                                                                                                                                                                                                                                          | [getParseResult](#getparseresult)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                                                                                                                                                                                                                                               |
| public T                                                                                                                                                                                                                                                                                  | [getExecutionResult](#getexecutionresult)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Returns the result of calling the user object `Callable` or invoking the user object `Method`  after parsing the user input, or `null` if this command has not been [execute.execute](#execute)  or if this `CommandLine` is for a subcommand that was not specified by the end user on the command line.     |
| public void                                                                                                                                                                                                                                                                               | [setExecutionResult](#setexecutionresult)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) result)                                                                                                                                                                                                                                                                                                                                                                                                                                                | Sets the result of calling the business logic on the command's user object.                                                                                                                                                                                                                                   |
| public void                                                                                                                                                                                                                                                                               | [clearExecutionResults](#clearexecutionresults)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Clears the [getExecutionResult.getExecutionResult](#getexecutionresult) of a previous invocation from this `CommandLine` and all subcommands.                                                                                                                                                                 |
| public static io.github.qishr.cascara.common.util.CommandLine.DefaultExceptionHandler<java.util.List<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                                                                                        | [defaultExceptionHandler](#defaultexceptionhandler)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Convenience method that returns `new DefaultExceptionHandler<List<Object>>()`.                                                                                                                                                                                                                                |
| public static boolean                                                                                                                                                                                                                                                                     | [printHelpIfRequested](#printhelpifrequested)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                                                        |                                                                                                                                                                                                                                                                                                               |
| public static boolean                                                                                                                                                                                                                                                                     | [printHelpIfRequested](#printhelpifrequested)([ParseResult](CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Delegates to [executeHelpRequest.executeHelpRequest](#executehelprequest).                                                                                                                                                                                                                                    |
| public static boolean                                                                                                                                                                                                                                                                     | [printHelpIfRequested](#printhelpifrequested)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                              | Delegates to the implementation of [executeHelpRequest.executeHelpRequest](#executehelprequest).                                                                                                                                                                                                              |
| public static boolean                                                                                                                                                                                                                                                                     | [printHelpIfRequested](#printhelpifrequested)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                                                                                                         | Delegates to the implementation of [executeHelpRequest.executeHelpRequest](#executehelprequest).                                                                                                                                                                                                              |
| public static [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html)                                                                                                                                                                              | [executeHelpRequest](#executehelprequest)([ParseResult](CommandLine.ParseResult.md) parseResult)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Helper method that may be useful when processing the `ParseResult` that results from successfully [parseArgs.parseArgs](#parseargs) command line arguments.                                                                                                                                                   |
| public int                                                                                                                                                                                                                                                                                | [execute](#execute)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Convenience method to allow command line application authors to avoid some boilerplate code in their application.                                                                                                                                                                                             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                                                                                             | [parseWithHandler](#parsewithhandler)([IParseResultHandler](CommandLine.IParseResultHandler.md) handler, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                       |                                                                                                                                                                                                                                                                                                               |
| public R                                                                                                                                                                                                                                                                                  | [parseWithHandler](#parsewithhandler)([IParseResultHandler2](CommandLine.IParseResultHandler2.md)<R> handler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                                            | Returns the result of calling [parseWithHandlers.parseWithHandlers](#parsewithhandlers) with a new [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md) in addition to the specified parse result handler and the specified command line arguments.                                              |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                                                                                             | [parseWithHandlers](#parsewithhandlers)([IParseResultHandler](CommandLine.IParseResultHandler.md) handler, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [IExceptionHandler](CommandLine.IExceptionHandler.md) exceptionHandler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                      |                                                                                                                                                                                                                                                                                                               |
| public R                                                                                                                                                                                                                                                                                  | [parseWithHandlers](#parsewithhandlers)([IParseResultHandler2](CommandLine.IParseResultHandler2.md)<R> handler, [IExceptionHandler2](CommandLine.IExceptionHandler2.md)<R> exceptionHandler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                             | Tries to [parseArgs.parseArgs](#parseargs) the specified command line arguments, and if successful, delegates the processing of the resulting `ParseResult` object to the specified [IParseResultHandler2](CommandLine.IParseResultHandler2.md).                                                              |
| public static void                                                                                                                                                                                                                                                                        | [usage](#usage)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)                                                                                                                                                                                                                                                                                                                                                               | Equivalent to `new CommandLine(command).usage(out)`.                                                                                                                                                                                                                                                          |
| public static void                                                                                                                                                                                                                                                                        | [usage](#usage)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                                                                                                                        | Equivalent to `new CommandLine(command).usage(out, ansi)`.                                                                                                                                                                                                                                                    |
| public static void                                                                                                                                                                                                                                                                        | [usage](#usage)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                                                                                                                                                                                                                                                                                   | Equivalent to `new CommandLine(command).usage(out, colorScheme)`.                                                                                                                                                                                                                                             |
| public void                                                                                                                                                                                                                                                                               | [usage](#usage)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Delegates to [usage.usage](#usage) with the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.                                                                                                                                                                                                    |
| public void                                                                                                                                                                                                                                                                               | [usage](#usage)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer)                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Delegates to [usage.usage](#usage) with the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.                                                                                                                                                                                                    |
| public void                                                                                                                                                                                                                                                                               | [usage](#usage)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                                                                                                                                                                                                                              | Delegates to [usage.usage](#usage) with the default color scheme.                                                                                                                                                                                                                                             |
| public void                                                                                                                                                                                                                                                                               | [usage](#usage)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer, [Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                                                                                                                                                                                                                           | Similar to [usage.usage](#usage) but with the specified `PrintWriter` instead of a `PrintStream`.                                                                                                                                                                                                             |
| public void                                                                                                                                                                                                                                                                               | [usage](#usage)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                                                                                                                                                                                                                                                                                                                                                                                         | Prints a usage help message for the annotated command class to the specified `PrintStream`.                                                                                                                                                                                                                   |
| public void                                                                                                                                                                                                                                                                               | [usage](#usage)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                                                                                                                                                                                                                                                                                                                                                                                      | Similar to [usage.usage](#usage), but with the specified `PrintWriter` instead of a `PrintStream`.                                                                                                                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getUsageMessage](#getusagemessage)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Similar to [usage.usage](#usage), but returns the usage help message as a String instead of printing it to the `PrintStream`.                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getUsageMessage](#getusagemessage)([Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Similar to [usage.usage](#usage), but returns the usage help message as a String instead of printing it to the `PrintStream`.                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getUsageMessage](#getusagemessage)([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Similar to [usage.usage](#usage), but returns the usage help message as a String instead of printing it to the `PrintStream`.                                                                                                                                                                                 |
| public void                                                                                                                                                                                                                                                                               | [printVersionHelp](#printversionhelp)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)                                                                                                                                                                                                                                                                                                                                                                                                                                               | Delegates to [printVersionHelp.printVersionHelp](#printversionhelp) with the ANSI setting of the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.                                                                                                                                               |
| public void                                                                                                                                                                                                                                                                               | [printVersionHelp](#printversionhelp)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                                                                                                                                                                                                        | Prints version information from the Command#version() annotation to the specified `PrintStream`.                                                                                                                                                                                                              |
| public void                                                                                                                                                                                                                                                                               | [printVersionHelp](#printversionhelp)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                 | Prints version information from the Command#version() annotation to the specified `PrintStream`.                                                                                                                                                                                                              |
| public void                                                                                                                                                                                                                                                                               | [printVersionHelp](#printversionhelp)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out)                                                                                                                                                                                                                                                                                                                                                                                                                                               | Delegates to [printVersionHelp.printVersionHelp](#printversionhelp) with the ANSI setting of the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.                                                                                                                                               |
| public void                                                                                                                                                                                                                                                                               | [printVersionHelp](#printversionhelp)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                 | Prints version information from the Command#version() annotation to the specified `PrintWriter`.                                                                                                                                                                                                              |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)(C callable, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Equivalent to `new CommandLine(callable).execute(args)`, except for the return value.                                                                                                                                                                                                                         |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)(C callable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                      | Delegates to [call.call](#call) with `System.err` for diagnostic error messages and Help.Ansi#AUTO.                                                                                                                                                                                                           |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)(C callable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                               | Delegates to [call.call](#call) with `System.err` for diagnostic error messages.                                                                                                                                                                                                                              |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)(C callable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                     | Convenience method to allow command line application authors to avoid some boilerplate code in their application.                                                                                                                                                                                             |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                  | Equivalent to `new CommandLine(callableClass, factory).execute(args)`, except for the return value.                                                                                                                                                                                                           |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                        | Delegates to [call.call](#call) with `System.err` for diagnostic error messages, and Help.Ansi#AUTO.                                                                                                                                                                                                          |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                 | Delegates to [call.call](#call) with `System.err` for diagnostic error messages.                                                                                                                                                                                                                              |
| public static T                                                                                                                                                                                                                                                                           | [call](#call)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                       | Convenience method to allow command line application authors to avoid some boilerplate code in their application.                                                                                                                                                                                             |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)(R runnable, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Equivalent to `new CommandLine(runnable).execute(args)`.                                                                                                                                                                                                                                                      |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)(R runnable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                                                        | Delegates to [run.run](#run) with `System.err` for diagnostic error messages and Help.Ansi#AUTO.                                                                                                                                                                                                              |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)(R runnable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                 | Delegates to [run.run](#run) with `System.err` for diagnostic error messages.                                                                                                                                                                                                                                 |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)(R runnable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                       | Convenience method to allow command line application authors to avoid some boilerplate code in their application.                                                                                                                                                                                             |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                                                                                    | Equivalent to `new CommandLine(runnableClass, factory).execute(args)`.                                                                                                                                                                                                                                        |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                          | Delegates to [run.run](#run) with `System.err` for diagnostic error messages, and Help.Ansi#AUTO.                                                                                                                                                                                                             |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                   | Delegates to [run.run](#run) with `System.err` for diagnostic error messages.                                                                                                                                                                                                                                 |
| public static void                                                                                                                                                                                                                                                                        | [run](#run)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                         | Convenience method to allow command line application authors to avoid some boilerplate code in their application.                                                                                                                                                                                             |
| public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                | [invoke](#invoke)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                                                                                                                            | Delegates to [invoke.invoke](#invoke) with `System.out` for requested usage help messages, `System.err` for diagnostic error messages, and Help.Ansi#AUTO.                                                                                                                                                    |
| public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                | [invoke](#invoke)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                                                                  | Delegates to [invoke.invoke](#invoke) with the specified stream for requested usage help messages, `System.err` for diagnostic error messages, and Help.Ansi#AUTO.                                                                                                                                            |
| public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                | [invoke](#invoke)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)                                                                                                           | Delegates to [invoke.invoke](#invoke) with the specified stream for requested usage help messages, `System.err` for diagnostic error messages, and the specified Ansi mode.                                                                                                                                   |
| public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                                                | [invoke](#invoke)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args) | Convenience method to allow command line application authors to avoid some boilerplate code in their application.                                                                                                                                                                                             |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)>                                                                              | [getCommandMethods](#getcommandmethods)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName)                                                                                                                                                                                                                                                                                                                                           | Helper to get methods of a class annotated with [Command](CommandLine.Command.md) via reflection, optionally filtered by method name (not Command#name()).                                                                                                                                                    |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [registerConverter](#registerconverter)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<K> cls, [ITypeConverter](CommandLine.ITypeConverter.md)<K> converter)                                                                                                                                                                                                                                                                                                                                                                                      | Registers the specified type converter for the specified class.                                                                                                                                                                                                                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getSeparator](#getseparator)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns the String that separates option names from option values when parsing command line options.                                                                                                                                                                                                          |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setSeparator](#setseparator)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Sets the String the parser uses to separate option names from option values to the specified value.                                                                                                                                                                                                           |
| public [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html)                                                                                                                                                                       | [getResourceBundle](#getresourcebundle)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Returns the ResourceBundle of this command or `null` if no resource bundle is set.                                                                                                                                                                                                                            |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setResourceBundle](#setresourcebundle)([ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) bundle)                                                                                                                                                                                                                                                                                                                                                                                                                                  | Sets the ResourceBundle containing usage help message strings.                                                                                                                                                                                                                                                |
| public int                                                                                                                                                                                                                                                                                | [getUsageHelpWidth](#getusagehelpwidth)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Returns the maximum width of the usage help message.                                                                                                                                                                                                                                                          |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setUsageHelpWidth](#setusagehelpwidth)(int width)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Sets the maximum width of the usage help message.                                                                                                                                                                                                                                                             |
| public int                                                                                                                                                                                                                                                                                | [getUsageHelpLongOptionsMaxWidth](#getusagehelplongoptionsmaxwidth)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Returns the maximum usage help long options column max width to the specified value.                                                                                                                                                                                                                          |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setUsageHelpLongOptionsMaxWidth](#setusagehelplongoptionsmaxwidth)(int columnWidth)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns the maximum usage help long options column max width to the specified value.                                                                                                                                                                                                                          |
| public boolean                                                                                                                                                                                                                                                                            | [isUsageHelpAutoWidth](#isusagehelpautowidth)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns whether picocli should attempt to detect the terminal size and adjust the usage help message width  to take the full terminal width.                                                                                                                                                                  |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setUsageHelpAutoWidth](#setusagehelpautowidth)(boolean detectTerminalSize)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Sets whether picocli should attempt to detect the terminal size and adjust the usage help message width  to take the full terminal width.                                                                                                                                                                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                       | [getCommandName](#getcommandname)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the command name (also called program name) displayed in the usage help synopsis.                                                                                                                                                                                                                     |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setCommandName](#setcommandname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commandName)                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Sets the command name (also called program name) displayed in the usage help synopsis to the specified value.                                                                                                                                                                                                 |
| public boolean                                                                                                                                                                                                                                                                            | [isExpandAtFiles](#isexpandatfiles)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Returns whether arguments starting with `'@'` should be treated as the path to an argument file and its  contents should be expanded into separate arguments for each line in the specified file.                                                                                                             |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setExpandAtFiles](#setexpandatfiles)(boolean expandAtFiles)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Sets whether arguments starting with `'@'` should be treated as the path to an argument file and its  contents should be expanded into separate arguments for each line in the specified file.                                                                                                                |
| public [Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)                                                                                                                                                                                 | [getAtFileCommentChar](#getatfilecommentchar)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns the character that starts a single-line comment or `null` if all content of argument files should  be interpreted as arguments (without comments).                                                                                                                                                    |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setAtFileCommentChar](#setatfilecommentchar)([Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html) atFileCommentChar)                                                                                                                                                                                                                                                                                                                                                                                                                           | Sets the character that starts a single-line comment or `null` if all content of argument files should  be interpreted as arguments (without comments).                                                                                                                                                       |
| public boolean                                                                                                                                                                                                                                                                            | [isUseSimplifiedAtFiles](#isusesimplifiedatfiles)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns whether to use a simplified argument file format that is compatible with JCommander.                                                                                                                                                                                                                  |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setUseSimplifiedAtFiles](#setusesimplifiedatfiles)(boolean simplifiedAtFiles)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Sets whether to use a simplified argument file format that is compatible with JCommander.                                                                                                                                                                                                                     |
| public [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md)                                                                                                                                                                                                          | [getNegatableOptionTransformer](#getnegatableoptiontransformer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Returns the `INegatableOptionTransformer` used to create the negative form of negatable options.                                                                                                                                                                                                              |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                                                      | [setNegatableOptionTransformer](#setnegatableoptiontransformer)([INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) transformer)                                                                                                                                                                                                                                                                                                                                                                                                                                        | Sets the `INegatableOptionTransformer` used to create the negative form of negatable options.                                                                                                                                                                                                                 |
| public static [IFactory](CommandLine.IFactory.md)                                                                                                                                                                                                                                         | [defaultFactory](#defaultfactory)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the default [IFactory](CommandLine.IFactory.md) implementation used if no factory was specified in the [CommandLine](CommandLine.md).                                                                                                                                                                 |
| public static [Tracer](CommandLine.Tracer.md)                                                                                                                                                                                                                                             | [tracer](#tracer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the `Tracer` used internally for printing internal debug statements.                                                                                                                                                                                                                                  |



## Field Details

### VERSION

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VERSION__</span>

This is picocli version .

**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### getCommandSpec

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __getCommandSpec__()</span>

Returns the `CommandSpec` model that this `CommandLine` was constructed with.

**Returns:**

the `CommandSpec` model

**Since:**

3.0


---

### addMixin

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __addMixin__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) mixin)</span>

Adds the options and positional parameters in the specified mixin to this command.

The specified object may be a [CommandSpec](CommandLine.Model.CommandSpec.md) object, or it may be a user object with
`@Option` and `@Parameters`-annotated fields, in which case picocli automatically
constructs a `CommandSpec` from this user object.


**Parameters:**

`name` - the name by which the mixin object may later be retrieved

`mixin` - an annotated user object or a [CommandSpec](CommandLine.Model.CommandSpec.md) object whose options and positional parameters to add to this command

**Returns:**

this CommandLine object, to allow method chaining

**Since:**

3.0


---

### getMixins

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __getMixins__()</span>

Returns a map of user objects whose options and positional parameters were added to ("mixed in" with) this command.

**Returns:**

a new Map containing the user objects mixed in with this command. If `CommandSpec` objects without
         user objects were programmatically added, use the CommandSpec#mixins() directly.

**Since:**

3.0


---

### addSubcommand

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __addSubcommand__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)</span>

Registers a subcommand with the name obtained from the `@Command(name = "...")` annotation attribute of the specified command.

**Parameters:**

`command` - the object to initialize with command line arguments following the subcommand name.
                This may be a `Class` that has a `@Command` annotation, or an instance of such a
                class, or a `CommandSpec` or `CommandLine` instance with its own (nested) subcommands.

**Returns:**

this CommandLine object, to allow method chaining

**Since:**

4.0

**See Also:**


[addSubcommand](#addsubcommand)



---

### addSubcommand

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __addSubcommand__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)</span>

Registers a subcommand with the specified name.For example:
 
 CommandLine commandLine = new CommandLine(new Git())
         .addSubcommand("status",   new GitStatus())
         .addSubcommand("commit",   new GitCommit();
         .addSubcommand("add",      new GitAdd())
         .addSubcommand("branch",   new GitBranch())
         .addSubcommand("checkout", new GitCheckout())
         //...
         ;
 

 

The specified object can be an annotated object or a
 `CommandLine` instance with its own nested subcommands. For example:
 
 CommandLine commandLine = new CommandLine(new MainCommand())
         .addSubcommand("cmd1",                 new ChildCommand1()) // subcommand
         .addSubcommand("cmd2",                 new ChildCommand2())
         .addSubcommand("cmd3", new CommandLine(new ChildCommand3()) // subcommand with nested sub-subcommands
                 .addSubcommand("cmd3sub1",                 new GrandChild3Command1())
                 .addSubcommand("cmd3sub2",                 new GrandChild3Command2())
                 .addSubcommand("cmd3sub3", new CommandLine(new GrandChild3Command3()) // deeper nesting
                         .addSubcommand("cmd3sub3sub1", new GreatGrandChild3Command3_1())
                         .addSubcommand("cmd3sub3sub2", new GreatGrandChild3Command3_2())
                 )
         );
 
 

The default type converters are available on all subcommands and nested sub-subcommands, but custom type
 converters are registered only with the subcommand hierarchy as it existed when the custom type was registered.
 To ensure a custom type converter is available to all subcommands, register the type converter last, after
 adding subcommands.
 

See also the Command#subcommands() annotation to register subcommands declaratively.

**Parameters:**

`name` - the string to recognize on the command line as a subcommand.
             If `null`, the name of the specified subcommand is used;
             if this is also `null`, the first alias is used.

`command` - the object to initialize with command line arguments following the subcommand name.
                This may be a `Class` that has a `@Command` annotation, or an instance of such a
                class, or a `CommandSpec` or `CommandLine` instance with its own (nested) subcommands.

**Returns:**

this CommandLine object, to allow method chaining

**Since:**

0.9.7

**See Also:**


[registerConverter](#registerconverter)


[subcommands](null.md)



---

### addSubcommand

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __addSubcommand__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] aliases)</span>

Registers a subcommand with the specified name and all specified aliases.See also [addSubcommand.addSubcommand](#addsubcommand).

**Parameters:**

`name` - the string to recognize on the command line as a subcommand.
             If `null`, the name of the specified subcommand is used;
             if this is also `null`, the first alias is used.

`command` - the object to initialize with command line arguments following the subcommand name.
                This may be a `Class` that has a `@Command` annotation, or an instance of such a
                class, or a `CommandSpec` or `CommandLine` instance with its own (nested) subcommands.

`aliases` - zero or more alias names that are also recognized on the command line as this subcommand

**Returns:**

this CommandLine object, to allow method chaining

**Since:**

3.1

**See Also:**


[addSubcommand](#addsubcommand)



---

### getSubcommands

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandLine](CommandLine.md)> __getSubcommands__()</span>

Returns a map with the subcommands [addSubcommand.addSubcommand](#addsubcommand) on this instance.

**Returns:**

a map with the registered subcommands

**Since:**

0.9.7


---

### getParent

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __getParent__()</span>

Returns the command that this is a subcommand of, or `null` if this is a top-level command.

**Returns:**

the command that this is a subcommand of, or `null` if this is a top-level command

**Since:**

0.9.8

**See Also:**


[addSubcommand](#addsubcommand)


[subcommands](null.md)



---

### getCommand

<span style="font-family: monospace; font-size: 80%;">public T __getCommand__()</span>

Returns the annotated user object that this `CommandLine` instance was constructed with.

**Returns:**

the annotated object that this `CommandLine` instance was constructed with

**Since:**

0.9.7


---

### getFactory

<span style="font-family: monospace; font-size: 80%;">public [IFactory](CommandLine.IFactory.md) __getFactory__()</span>

Returns the factory that this `CommandLine` was constructed with.

**Returns:**

the factory that this `CommandLine` was constructed with, never `null`

**Since:**

4.6


---

### isUsageHelpRequested

<span style="font-family: monospace; font-size: 80%;">public boolean __isUsageHelpRequested__()</span>

Returns `true` if an option annotated with Option#usageHelp() was specified on the command line.

**Returns:**

whether the parser encountered an option annotated with Option#usageHelp().

**Since:**

0.9.8


---

### isVersionHelpRequested

<span style="font-family: monospace; font-size: 80%;">public boolean __isVersionHelpRequested__()</span>

Returns `true` if an option annotated with Option#versionHelp() was specified on the command line.

**Returns:**

whether the parser encountered an option annotated with Option#versionHelp().

**Since:**

0.9.8


---

### getHelp

<span style="font-family: monospace; font-size: 80%;">public [Help](CommandLine.Help.md) __getHelp__()</span>

Returns a new `Help` object created by the `IHelpFactory` with the `CommandSpec` and `ColorScheme` of this command.

**Since:**

4.1

**See Also:**


[Help](null.md)


[getHelpFactory](#gethelpfactory)


[getCommandSpec](#getcommandspec)


[getColorScheme](#getcolorscheme)



---

### getHelpFactory

<span style="font-family: monospace; font-size: 80%;">public [IHelpFactory](CommandLine.IHelpFactory.md) __getHelpFactory__()</span>

Returns the `IHelpFactory` that is used to construct the usage help message.

**Since:**

3.9

**See Also:**


[setHelpFactory](#sethelpfactory)



---

### setHelpFactory

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setHelpFactory__([IHelpFactory](CommandLine.IHelpFactory.md) helpFactory)</span>

Sets a new `IHelpFactory` to customize the usage help message.

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`helpFactory` - the new help factory. Must be non-`null`.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.9


---

### getHelpSectionKeys

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getHelpSectionKeys__()</span>

Returns the section keys in the order that the usage help message should render the sections.This ordering may be modified with [setHelpSectionKeys.setHelpSectionKeys](#sethelpsectionkeys). The default keys are (in order):

  UsageMessageSpec#SECTION_KEY_HEADER_HEADING
  UsageMessageSpec#SECTION_KEY_HEADER
  UsageMessageSpec#SECTION_KEY_SYNOPSIS_HEADING
  UsageMessageSpec#SECTION_KEY_SYNOPSIS
  UsageMessageSpec#SECTION_KEY_DESCRIPTION_HEADING
  UsageMessageSpec#SECTION_KEY_DESCRIPTION
  UsageMessageSpec#SECTION_KEY_PARAMETER_LIST_HEADING
  UsageMessageSpec#SECTION_KEY_AT_FILE_PARAMETER
  UsageMessageSpec#SECTION_KEY_PARAMETER_LIST
  UsageMessageSpec#SECTION_KEY_OPTION_LIST_HEADING
  UsageMessageSpec#SECTION_KEY_OPTION_LIST
  UsageMessageSpec#SECTION_KEY_COMMAND_LIST_HEADING
  UsageMessageSpec#SECTION_KEY_COMMAND_LIST
  UsageMessageSpec#SECTION_KEY_EXIT_CODE_LIST_HEADING
  UsageMessageSpec#SECTION_KEY_EXIT_CODE_LIST
  UsageMessageSpec#SECTION_KEY_FOOTER_HEADING
  UsageMessageSpec#SECTION_KEY_FOOTER


**Since:**

3.9


---

### setHelpSectionKeys

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setHelpSectionKeys__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> keys)</span>

Sets the section keys in the order that the usage help message should render the sections.

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
later will have the default setting. To ensure a setting is applied to all
subcommands, call the setter last, after adding subcommands.


Use UsageMessageSpec#sectionKeys(List) to customize a command without affecting its subcommands.

**Since:**

3.9

**See Also:**


[getHelpSectionKeys](#gethelpsectionkeys)



---

### getHelpSectionMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)> __getHelpSectionMap__()</span>

Returns the map of section keys and renderers used to construct the usage help message.The usage help message can be customized by adding, replacing and removing section renderers from this map.
Sections can be reordered with [setHelpSectionKeys.setHelpSectionKeys](#sethelpsectionkeys).
Sections that are either not in this map or not in the list returned by [getHelpSectionKeys.getHelpSectionKeys](#gethelpsectionkeys) are omitted.



NOTE: By modifying the returned `Map`, only the usage help message of this command is affected.
Use [setHelpSectionMap.setHelpSectionMap](#sethelpsectionmap) to customize the usage help message for this command and all subcommands.


**Since:**

3.9


---

### setHelpSectionMap

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setHelpSectionMap__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)> map)</span>

Sets the map of section keys and renderers used to construct the usage help message.

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
later will have the default setting. To ensure a setting is applied to all
subcommands, call the setter last, after adding subcommands.


Use UsageMessageSpec#sectionMap(Map) to customize a command without affecting its subcommands.

**Since:**

3.9

**See Also:**


[getHelpSectionMap](#gethelpsectionmap)



---

### isAdjustLineBreaksForWideCJKCharacters

<span style="font-family: monospace; font-size: 80%;">public boolean __isAdjustLineBreaksForWideCJKCharacters__()</span>

Returns whether line breaks should take wide Chinese, Japanese and Korean characters into account for line-breaking purposes.The default is `true`.

**Returns:**

true if wide Chinese, Japanese and Korean characters are counted as double the size of other characters for line-breaking purposes

**Since:**

4.0


---

### setAdjustLineBreaksForWideCJKCharacters

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setAdjustLineBreaksForWideCJKCharacters__(boolean adjustForWideChars)</span>

Sets whether line breaks should take wide Chinese, Japanese and Korean characters into account, and returns this UsageMessageSpec.The default is `true`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`adjustForWideChars` - if true, wide Chinese, Japanese and Korean characters are counted as double the size of other characters for line-breaking purposes

**Since:**

4.0


---

### isToggleBooleanFlags

<span style="font-family: monospace; font-size: 80%;">public boolean __isToggleBooleanFlags__()</span>

Returns whether the value of boolean flag options should be "toggled" when the option is matched.From 4.0, this is `false` by default, and when a flag option is specified on the command line picocli
 will set its value to the opposite of its default value.
 If this method returns `true`, flags are toggled, so if the value is `true` it is
 set to `false`, and when the value is `false` it is set to `true`.
 When toggling is enabled, specifying a flag option twice on the command line will have no effect because they cancel each other out.

**Returns:**

`true` the value of boolean flag options should be "toggled" when the option is matched, `false` otherwise

**Since:**

3.0


---

### setToggleBooleanFlags

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setToggleBooleanFlags__(boolean newValue)</span>

Sets whether the value of boolean flag options should be "toggled" when the option is matched.The default is `false`,
 and when a flag option is specified on the command line picocli will set its value to the opposite of its default value.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.0


---

### isInterpolateVariables

<span style="font-family: monospace; font-size: 80%;">public boolean __isInterpolateVariables__()</span>

Returns whether variables should be interpolated in String values.The default is `true`.

**Since:**

4.0


---

### setInterpolateVariables

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setInterpolateVariables__(boolean interpolate)</span>

Sets whether variables should be interpolated in String values.The default is `true`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Since:**

4.0


---

### isOverwrittenOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __isOverwrittenOptionsAllowed__()</span>

Returns whether options for single-value fields can be specified multiple times on the command line.The default is `false` and a [OverwrittenOptionException](CommandLine.OverwrittenOptionException.md) is thrown if this happens.
 When `true`, the last specified value is retained.

**Returns:**

`true` if options for single-value fields can be specified multiple times on the command line, `false` otherwise

**Since:**

0.9.7


---

### setOverwrittenOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setOverwrittenOptionsAllowed__(boolean newValue)</span>

Sets whether options for single-value fields can be specified multiple times on the command line without a [OverwrittenOptionException](CommandLine.OverwrittenOptionException.md) being thrown.The default is `false`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

0.9.7


---

### isPosixClusteredShortOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __isPosixClusteredShortOptionsAllowed__()</span>

Returns whether the parser accepts clustered short options.The default is `true`.

**Returns:**

`true` if short options like `-x -v -f SomeFile` can be clustered together like `-xvfSomeFile`, `false` otherwise

**Since:**

3.0


---

### setPosixClusteredShortOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setPosixClusteredShortOptionsAllowed__(boolean newValue)</span>

Sets whether short options like `-x -v -f SomeFile` can be clustered together like `-xvfSomeFile`.The default is `true`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.0


---

### isCaseInsensitiveEnumValuesAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __isCaseInsensitiveEnumValuesAllowed__()</span>

Returns whether the parser should ignore case when converting arguments to `enum` values.The default is `false`.

**Returns:**

`true` if enum values can be specified that don't match the `toString()` value of the enum constant, `false` otherwise;
 e.g., for an option of type java.time.DayOfWeek,
 values `MonDaY`, `monday` and `MONDAY` are all recognized if `true`.

**Since:**

3.4


---

### setCaseInsensitiveEnumValuesAllowed

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setCaseInsensitiveEnumValuesAllowed__(boolean newValue)</span>

Sets whether the parser should ignore case when converting arguments to `enum` values.The default is `false`.
 When set to true, for example, for an option of type java.time.DayOfWeek,
 values `MonDaY`, `monday` and `MONDAY` are all recognized if `true`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.4


---

### isTrimQuotes

<span style="font-family: monospace; font-size: 80%;">public boolean __isTrimQuotes__()</span>

Returns whether the parser should trim quotes from command line arguments.The default is
 read from the system property "picocli.trimQuotes" and will be `true` if the property is present and empty,
 or if its value is "true".
 

If this property is set to `true`, the parser will remove quotes from the command line arguments, as follows:
 
   if the command line argument contains just the leading and trailing quote, these quotes are removed
   if the command line argument contains more quotes than just the leading and trailing quote, the parser first
   tries to process the parameter with the quotes intact. For example, the `split` regular expression inside
   a quoted region should be ignored, so arguments like `"a,b","x,y"` are handled correctly.
   For arguments with nested quotes, quotes are removed later in the processing pipeline, after `split` operations are applied.
 

**Returns:**

`true` if the parser should trim quotes from command line arguments before processing them, `false` otherwise;

**Since:**

3.7

**See Also:**


[trimQuotes](null.md)



---

### setTrimQuotes

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setTrimQuotes__(boolean newValue)</span>

Sets whether the parser should trim quotes from command line arguments before processing them.The default is
 read from the system property "picocli.trimQuotes" and will be `true` if the property is set and empty, or
 if its value is "true".
 

If this property is set to `true`, the parser will remove quotes from the command line arguments, as follows:
 
   if the command line argument contains just the leading and trailing quote, these quotes are removed
   if the command line argument contains more quotes than just the leading and trailing quote, the parser first
   tries to process the parameter with the quotes intact. For example, the `split` regular expression inside
   a quoted region should be ignored, so arguments like `"a,b","x,y"` are handled correctly.
   For arguments with nested quotes, quotes are removed later in the processing pipeline, after `split` operations are applied.
 
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.
 

Calling this method will cause the "picocli.trimQuotes" property to have no effect.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.7

**See Also:**


[trimQuotes](null.md)



---

### isSplitQuotedStrings

<span style="font-family: monospace; font-size: 80%;">public boolean __isSplitQuotedStrings__()</span>

Returns whether the parser is allowed to split quoted Strings or not.The default is `false`,
 so quotes are respected: quoted strings are treated as a single value that should not be broken up.
 


 For example, take a single command line parameter `"a,b","x,y"`. With a comma split regex, the default of `splitQuotedStrings = false`
 means that this value will be split into two strings: `"a,b"` and `"x,y"`. This is usually what you want.
 


 If `splitQuotedStrings` is set to `true`, quotes are not respected, and the value is split up into four parts:
 the first is `"a`, the second is `b"`, the third is `"x`, and the last part is `y"`. This is generally not what you want.
 



!!! note "Deprecation"
    Most applications should not change the default. The rare application that does need to split parameter values
 without respecting quotes should use ParserSpec#splitQuotedStrings(boolean).

**Returns:**

`true` if the parser is allowed to split quoted Strings, `false` otherwise;

**Since:**

3.7

**See Also:**


[splitRegex](null.md)


[splitQuotedStrings](null.md)



---

### setSplitQuotedStrings

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setSplitQuotedStrings__(boolean newValue)</span>

Sets whether the parser is allowed to split quoted Strings.The default is `false`,
 so quotes are respected: quoted strings are treated as a single value that should not be broken up.
 


 For example, take a single command line parameter `"a,b","x,y"`. With a comma split regex, the default of `splitQuotedStrings = false`
 means that this value will be split into two strings: `"a,b"` and `"x,y"`. This is usually what you want.
 


 However, if `splitQuotedStrings` is set to `true`, quotes are not respected, and the value is split up into four parts:
 the first is `"a`, the second is `b"`, the third is `"x`, and the last part is `y"`. This is generally not what you want.
 
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.



!!! note "Deprecation"
    Most applications should not change the default. The rare application that does need to split parameter values
 without respecting quotes should use ParserSpec#splitQuotedStrings(boolean).

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.7

**See Also:**


[splitRegex](null.md)


[splitQuotedStrings](null.md)



---

### getEndOfOptionsDelimiter

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getEndOfOptionsDelimiter__()</span>

Returns the end-of-options delimiter that signals that the remaining command line arguments should be treated as positional parameters.

**Returns:**

the end-of-options delimiter. The default is `"--"`.

**Since:**

3.5


---

### setEndOfOptionsDelimiter

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setEndOfOptionsDelimiter__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) delimiter)</span>

Sets the end-of-options delimiter that signals that the remaining command line arguments should be treated as positional parameters.

**Parameters:**

`delimiter` - the end-of-options delimiter; must not be `null`. The default is `"--"`.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.5


---

### isSubcommandsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public boolean __isSubcommandsCaseInsensitive__()</span>

Returns whether upper case and lower case should be ignored when matching subcommands.The default is `false`.

**Returns:**

`true` if subcommands can be matched when they differ only in case from the `getCommandName()` value of a registered one, `false` otherwise.
       For example, if true, for a subcommand with name `help`, inputs like `help`, `HeLp` and `HELP` are all recognized.

**Since:**

4.3


---

### setSubcommandsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setSubcommandsCaseInsensitive__(boolean newValue)</span>

Sets whether upper case and lower case should be ignored when matching subcommands.The default is `false`.
 For example, when set to `true`, for a subcommand with name `help`, inputs like `help`, `HeLp` and `HELP` are all recognized.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.3


---

### isOptionsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public boolean __isOptionsCaseInsensitive__()</span>

Returns whether upper case and lower case should be ignored when matching option names.The default is `false`.

**Returns:**

`true` if options can be matched when they differ only in case from the `names()` value of a registered one, `false` otherwise;
       For example, if true, for an option with name `-h`, inputs like `-h`, `-H` are both recognized.

**Since:**

4.3


---

### setOptionsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setOptionsCaseInsensitive__(boolean newValue)</span>

Sets whether upper case and lower case should be ignored when matching option names.The default is `false`.
 For example, when set to `true`, for an option with name `-h`, inputs like `-h`, `-H` are both recognized.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.
 Note that changing case sensitivity will also change the case sensitivity of negatable options:
 any custom [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) that was previously installed will be replaced by the case-insensitive
 version of the default transformer. To ensure your custom transformer is used, install it last, after changing case sensitivity.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.3


---

### isAbbreviatedSubcommandsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __isAbbreviatedSubcommandsAllowed__()</span>

Returns whether abbreviation of subcommands should be allowed when matching subcommands.The default is `false`.

**Returns:**

`true` if subcommands can be matched when they are abbreviations of the `getCommandName()` value of a registered one, `false` otherwise.
       For example, if true, for a subcommand with name `helpCommand`, inputs like `h`, `h-c` and `hC` are all recognized.

**Since:**

4.4


---

### setAbbreviatedSubcommandsAllowed

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setAbbreviatedSubcommandsAllowed__(boolean newValue)</span>

Sets whether abbreviated subcommands should be matched.The default is `false`.
 For example, when set to `true`, for a subcommand `helpCommand`, inputs like `h`, `h-c` and `hC` are all recognized.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.4


---

### isAbbreviatedOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __isAbbreviatedOptionsAllowed__()</span>

Returns whether abbreviation of option names should be allowed when matching options.The default is `false`.

**Returns:**

`true` if options can be matched when they are abbreviations of the `names()` value of a registered one, `false` otherwise.
       For example, if true, for a subcommand with name `--helpMe`, inputs like `--h`, `--h-m` and `--hM` are all recognized.

**Since:**

4.4


---

### setAbbreviatedOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setAbbreviatedOptionsAllowed__(boolean newValue)</span>

Sets whether abbreviated option names should be matched.The default is `false`.
 For example, when set to `true`, for an option with name `--helpMe`, inputs like `--h`, `--h-m` and `--hM` are all recognized.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.4


---

### getDefaultValueProvider

<span style="font-family: monospace; font-size: 80%;">public [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) __getDefaultValueProvider__()</span>

Returns the default value provider for the command, or `null` if none has been set.

**Returns:**

the default value provider for this command, or `null`

**Since:**

3.6

**See Also:**


[defaultValueProvider](null.md)


[defaultValueProvider](null.md)


[defaultValueString](null.md)



---

### setDefaultValueProvider

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setDefaultValueProvider__([IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) newValue)</span>

Sets a default value provider for the command and sub-commands

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 sub-commands and nested sub-subcommands at the moment this method is called. Sub-commands added
 later will have the default setting. To ensure a setting is applied to all
 sub-commands, call the setter last, after adding sub-commands.

**Parameters:**

`newValue` - the default value provider to use

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.6


---

### isStopAtPositional

<span style="font-family: monospace; font-size: 80%;">public boolean __isStopAtPositional__()</span>

Returns whether the parser interprets the first positional parameter as "end of options" so the remaining
 arguments are all treated as positional parameters.The default is `false`.

**Returns:**

`true` if all values following the first positional parameter should be treated as positional parameters, `false` otherwise

**Since:**

2.3


---

### setStopAtPositional

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setStopAtPositional__(boolean newValue)</span>

Sets whether the parser interprets the first positional parameter as "end of options" so the remaining
 arguments are all treated as positional parameters.The default is `false`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - `true` if all values following the first positional parameter should be treated as positional parameters, `false` otherwise

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

2.3


---

### isStopAtUnmatched

<span style="font-family: monospace; font-size: 80%;">public boolean __isStopAtUnmatched__()</span>

Returns whether the parser should stop interpreting options and positional parameters as soon as it encounters an
 unmatched option.Unmatched options are arguments that look like an option but are not one of the known options, or
 positional arguments for which there is no available slots (the command has no positional parameters or their size is limited).
 The default is `false`.
 

Setting this flag to `true` automatically sets the [isUnmatchedArgumentsAllowed.isUnmatchedArgumentsAllowed](#isunmatchedargumentsallowed) flag to `true` also.

**Returns:**

`true` when an unmatched option should result in the remaining command line arguments to be added to the
      [getUnmatchedArguments.getUnmatchedArguments](#getunmatchedarguments)

**Since:**

2.3


---

### setStopAtUnmatched

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setStopAtUnmatched__(boolean newValue)</span>

Sets whether the parser should stop interpreting options and positional parameters as soon as it encounters an
 unmatched option.Unmatched options are arguments that look like an option but are not one of the known options, or
 positional arguments for which there is no available slots (the command has no positional parameters or their size is limited).
 The default is `false`.
 

Setting this flag to `true` automatically sets the [setUnmatchedArgumentsAllowed.setUnmatchedArgumentsAllowed](#setunmatchedargumentsallowed) flag to `true` also.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - `true` when an unmatched option should result in the remaining command line arguments to be added to the
      [getUnmatchedArguments.getUnmatchedArguments](#getunmatchedarguments)

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

2.3


---

### isAllowSubcommandsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public boolean __isAllowSubcommandsAsOptionParameters__()</span>

Returns whether options can have parameter values that match subcommand names or aliases,
 or whether such values should be rejected with a missing parameter exception.The default is `false`, so by default input like `-x=subcommand` is rejected if `-x` is an option that takes a String parameter, and `subcommand` is a subcommand of this command.

**Returns:**

`true` when options can have parameter values that match subcommand names or aliases, `false` when such values should be rejected with a missing parameter exception

**Since:**

4.7.8-SNAPSHOT

**See Also:**


[allowSubcommandsAsOptionParameters](null.md)



---

### setAllowSubcommandsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setAllowSubcommandsAsOptionParameters__(boolean newValue)</span>

Sets whether options can have parameter values that match subcommand names or aliases, or whether such values should be rejected with a missing parameter exception.The default is `false`, so by default
 input like `-x=subcommand` is rejected if `-x` is an option that takes a String parameter, and `subcommand` is a subcommand of this command.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting. When `true`, options can have parameter values that match subcommand names or aliases, when `false`, such values are rejected with a missing parameter exception

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.7.8-SNAPSHOT

**See Also:**


[allowSubcommandsAsOptionParameters](null.md)



---

### isAllowOptionsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public boolean __isAllowOptionsAsOptionParameters__()</span>

Returns whether options can have parameter values that match the name of an option in this command,
 or whether such values should be rejected with a missing parameter exception.The default is `false`, so by default input like `-x=--some-option` is rejected if `-x` is an option that takes a String parameter, and `--some-option` is an option of this command.
 

This method only considers actual options of this command, as opposed to [isUnmatchedOptionsAllowedAsOptionParameters.isUnmatchedOptionsAllowedAsOptionParameters](#isunmatchedoptionsallowedasoptionparameters), which considers values that resemble options.

**Returns:**

`true` when options can have parameter values that match the name of an option in this command, `false` when such values should be rejected with a missing parameter exception

**Since:**

4.7.8-SNAPSHOT

**See Also:**


[isUnmatchedOptionsAllowedAsOptionParameters](#isunmatchedoptionsallowedasoptionparameters)


[allowOptionsAsOptionParameters](null.md)



---

### setAllowOptionsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setAllowOptionsAsOptionParameters__(boolean newValue)</span>

Sets whether options can have parameter values that match the name of an option in this command, or whether such values should be rejected with a missing parameter exception.The default is `false`, so by default
 input like `-x=--some-option` is rejected if `-x` is an option that takes a String parameter, and `--some-option` is an option of this command.
 

This method only considers actual options of this command, as opposed to [setUnmatchedOptionsAllowedAsOptionParameters.setUnmatchedOptionsAllowedAsOptionParameters](#setunmatchedoptionsallowedasoptionparameters), which considers values that resemble options.
 

Use with caution! When set to `true`, any option in the command will consume the maximum number of arguments possible for its arity.
 This means that an option with `arity = "*"` will consume all command line arguments following that option.
 If this is not what you want, consider custom parameter processing.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting. When `true`, options can have parameter values that match the name of an option in this command, when `false`, such values are rejected with a missing parameter exception

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.7.8-SNAPSHOT

**See Also:**


[setUnmatchedOptionsAllowedAsOptionParameters](#setunmatchedoptionsallowedasoptionparameters)


[allowOptionsAsOptionParameters](null.md)



---

### isUnmatchedOptionsAllowedAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public boolean __isUnmatchedOptionsAllowedAsOptionParameters__()</span>

Returns whether options can have parameter values that resemble an option, or whether such values should be rejected as unknown options.The default is `true`, so by default input like `-x=-unknown` is accepted if `-x` is an option that takes a String parameter.
 

This method only considers values that resemble options, as opposed to [isAllowOptionsAsOptionParameters.isAllowOptionsAsOptionParameters](#isallowoptionsasoptionparameters), which considers actual options of this command.

**Returns:**

`true` when options can have parameter values that resemble an option, `false` when such values should be rejected as unknown options

**Since:**

4.4

**See Also:**


[isAllowOptionsAsOptionParameters](#isallowoptionsasoptionparameters)


[unmatchedOptionsAllowedAsOptionParameters](null.md)



---

### setUnmatchedOptionsAllowedAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setUnmatchedOptionsAllowedAsOptionParameters__(boolean newValue)</span>

Sets whether options can have parameter values that resemble an option, or whether such values should be rejected as unknown options.The default is `true`, so by default
 input like `-x=-unknown` is accepted if `-x` is an option that takes a String parameter.
 

This method only considers values that resemble options, as opposed to [setAllowOptionsAsOptionParameters.setAllowOptionsAsOptionParameters](#setallowoptionsasoptionparameters), which considers actual options of this command.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting. When `true`, options can have parameter values that resemble an option, when `false`, such values are rejected as unknown options

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.4

**See Also:**


[setAllowOptionsAsOptionParameters](#setallowoptionsasoptionparameters)


[unmatchedOptionsAllowedAsOptionParameters](null.md)



---

### isUnmatchedOptionsArePositionalParams

<span style="font-family: monospace; font-size: 80%;">public boolean __isUnmatchedOptionsArePositionalParams__()</span>

Returns whether arguments on the command line that resemble an option should be treated as positional parameters.The default is `false` and the parser behaviour depends on [isUnmatchedArgumentsAllowed.isUnmatchedArgumentsAllowed](#isunmatchedargumentsallowed).

**Returns:**

`true` arguments on the command line that resemble an option should be treated as positional parameters, `false` otherwise

**Since:**

3.0

**See Also:**


[getUnmatchedArguments](#getunmatchedarguments)



---

### setUnmatchedOptionsArePositionalParams

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setUnmatchedOptionsArePositionalParams__(boolean newValue)</span>

Sets whether arguments on the command line that resemble an option should be treated as positional parameters.The default is `false`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting. When `true`, arguments on the command line that resemble an option should be treated as positional parameters.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.0

**See Also:**


[getUnmatchedArguments](#getunmatchedarguments)


[isUnmatchedArgumentsAllowed](#isunmatchedargumentsallowed)



---

### isUnmatchedArgumentsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __isUnmatchedArgumentsAllowed__()</span>

Returns whether the end user may specify arguments on the command line that are not matched to any option or parameter fields.The default is `false` and a [UnmatchedArgumentException](CommandLine.UnmatchedArgumentException.md) is thrown if this happens.
 When `true`, the last unmatched arguments are available via the [getUnmatchedArguments.getUnmatchedArguments](#getunmatchedarguments) method.

**Returns:**

`true` if the end use may specify unmatched arguments on the command line, `false` otherwise

**Since:**

0.9.7

**See Also:**


[getUnmatchedArguments](#getunmatchedarguments)



---

### setUnmatchedArgumentsAllowed

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setUnmatchedArgumentsAllowed__(boolean newValue)</span>

Sets whether the end user may specify unmatched arguments on the command line without a [UnmatchedArgumentException](CommandLine.UnmatchedArgumentException.md) being thrown.The default is `false`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`newValue` - the new setting. When `true`, the last unmatched arguments are available via the [getUnmatchedArguments.getUnmatchedArguments](#getunmatchedarguments) method.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

0.9.7

**See Also:**


[getUnmatchedArguments](#getunmatchedarguments)



---

### getUnmatchedArguments

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getUnmatchedArguments__()</span>

Returns the list of unmatched command line arguments, if any.

**Returns:**

the list of unmatched command line arguments or an empty list

**Since:**

0.9.7

**See Also:**


[isUnmatchedArgumentsAllowed](#isunmatchedargumentsallowed)



---

### getColorScheme

<span style="font-family: monospace; font-size: 80%;">public [ColorScheme](CommandLine.Help.ColorScheme.md) __getColorScheme__()</span>

Returns the color scheme to use when printing help.The default value is the default color scheme with Help.Ansi#AUTO.

**Since:**

4.0

**See Also:**


[execute](#execute)


[usage](#usage)


[usage](#usage)


[getUsageMessage](#getusagemessage)


[defaultColorScheme](null.md)



---

### setColorScheme

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setColorScheme__([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)</span>

Sets the color scheme to use when printing help.

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`colorScheme` - the new color scheme

**Since:**

4.0

**See Also:**


[execute](#execute)


[usage](#usage)


[usage](#usage)


[getUsageMessage](#getusagemessage)



---

### getOut

<span style="font-family: monospace; font-size: 80%;">public [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) __getOut__()</span>

Returns the writer used when printing user-requested usage help or version help during command [execute.execute](#execute).Defaults to a PrintWriter wrapper around `System.out` unless [setOut.setOut](#setout) was called with a different writer.
 

This method is used by [execute.execute](#execute). Custom [IExecutionStrategy](CommandLine.IExecutionStrategy.md) implementations should also use this writer.
 


 By convention, when the user requests
 help with a `--help` or similar option, the usage help message is printed to the standard output stream so that it can be easily searched and paged.

**Since:**

4.0


---

### setOut

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setOut__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out)</span>

Sets the writer to use when printing user-requested usage help or version help during command [execute.execute](#execute).

This method is used by [execute.execute](#execute). Custom [IExecutionStrategy](CommandLine.IExecutionStrategy.md) implementations should also use this writer.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`out` - the new PrintWriter to use

**Returns:**

this CommandLine for method chaining

**Since:**

4.0


---

### getErr

<span style="font-family: monospace; font-size: 80%;">public [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) __getErr__()</span>

Returns the writer to use when printing diagnostic (error) messages during command [execute.execute](#execute).Defaults to a PrintWriter wrapper around `System.err`, unless [setErr.setErr](#seterr) was called with a different writer.
 

This method is used by [execute.execute](#execute).
 [IParameterExceptionHandler](CommandLine.IParameterExceptionHandler.md) and [IExecutionExceptionHandler](CommandLine.IExecutionExceptionHandler.md) implementations
 should use this writer to print error messages (which may include a usage help message) when an unexpected error occurs.

**Since:**

4.0


---

### setErr

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setErr__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) err)</span>

Sets the writer to use when printing diagnostic (error) messages during command [execute.execute](#execute).

This method is used by [execute.execute](#execute).
 [IParameterExceptionHandler](CommandLine.IParameterExceptionHandler.md) and [IExecutionExceptionHandler](CommandLine.IExecutionExceptionHandler.md) implementations
 should use this writer to print error messages (which may include a usage help message) when an unexpected error occurs.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`err` - the new PrintWriter to use

**Returns:**

this CommandLine for method chaining

**Since:**

4.0


---

### getExitCodeExceptionMapper

<span style="font-family: monospace; font-size: 80%;">public [IExitCodeExceptionMapper](CommandLine.IExitCodeExceptionMapper.md) __getExitCodeExceptionMapper__()</span>

Returns the mapper that was set by the application to map from exceptions to exit codes, for use by the [execute.execute](#execute) method.

**Returns:**

the mapper that was [setExitCodeExceptionMapper.setExitCodeExceptionMapper](#setexitcodeexceptionmapper), or `null` if none was set

**Since:**

4.0


---

### setExitCodeExceptionMapper

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setExitCodeExceptionMapper__([IExitCodeExceptionMapper](CommandLine.IExitCodeExceptionMapper.md) exitCodeExceptionMapper)</span>

Sets the mapper used by the [execute.execute](#execute) method to map exceptions to exit codes.

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`exitCodeExceptionMapper` - the new value

**Returns:**

this CommandLine for method chaining

**Since:**

4.0


---

### getExecutionStrategy

<span style="font-family: monospace; font-size: 80%;">public [IExecutionStrategy](CommandLine.IExecutionStrategy.md) __getExecutionStrategy__()</span>

Returns the execution strategy used by the [execute.execute](#execute) method to invoke
 the business logic on the user objects of this command and/or the user-specified subcommand(s).The default value is [RunLast](CommandLine.RunLast.md).

**Returns:**

the execution strategy to run the user-specified command

**Since:**

4.0


---

### setExecutionStrategy

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setExecutionStrategy__([IExecutionStrategy](CommandLine.IExecutionStrategy.md) executionStrategy)</span>

Sets the execution strategy that the [execute.execute](#execute) method should use to invoke
 the business logic on the user objects of this command and/or the user-specified subcommand(s).

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`executionStrategy` - the new execution strategy to run the user-specified command

**Returns:**

this CommandLine for method chaining

**Since:**

4.0


---

### getParameterExceptionHandler

<span style="font-family: monospace; font-size: 80%;">public [IParameterExceptionHandler](CommandLine.IParameterExceptionHandler.md) __getParameterExceptionHandler__()</span>

Returns the handler for dealing with invalid user input when the command is [execute.execute](#execute).

The default implementation prints an error message describing the problem, followed by either suggested alternatives
for mistyped options, or the full [usage.usage](#usage) help message of the problematic command;
it then delegates to the [getExitCodeExceptionMapper.getExitCodeExceptionMapper](#getexitcodeexceptionmapper) for an exit code, with
CommandSpec#exitCodeOnInvalidInput() as the default exit code.



Alternatively, you can install a "short error message handler" like this:


static class ShortErrorMessageHandler implements IParameterExceptionHandler {
    public int handleParseException(ParameterException ex, String[] args) {
        CommandLine cmd = ex.getCommandLine();
        PrintWriter writer = cmd.getErr();

        writer.println(ex.getMessage());
        UnmatchedArgumentException.printSuggestions(ex, writer);
        writer.print(cmd.getHelp().fullSynopsis());

        CommandSpec spec = cmd.getCommandSpec();
        writer.printf("Try '%s --help' for more information.%n", spec.qualifiedName());

        return cmd.getExitCodeExceptionMapper() != null
                    ? cmd.getExitCodeExceptionMapper().getExitCode(ex)
                    : spec.exitCodeOnInvalidInput();
    }
}



Install this error handler like this:

new CommandLine(new MyApp())
    .setParameterExceptionHandler(new ShortErrorMessageHandler())
    .execute(args);


**Returns:**

the handler for dealing with invalid user input

**Since:**

4.0


---

### setParameterExceptionHandler

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setParameterExceptionHandler__([IParameterExceptionHandler](CommandLine.IParameterExceptionHandler.md) parameterExceptionHandler)</span>

Sets the handler for dealing with invalid user input when the command is [execute.execute](#execute).

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
later will have the default setting. To ensure a setting is applied to all
subcommands, call the setter last, after adding subcommands.

**Parameters:**

`parameterExceptionHandler` - the new handler for dealing with invalid user input

**Returns:**

this CommandLine for method chaining

**Since:**

4.0

**See Also:**


[getParameterExceptionHandler](#getparameterexceptionhandler)



---

### getExecutionExceptionHandler

<span style="font-family: monospace; font-size: 80%;">public [IExecutionExceptionHandler](CommandLine.IExecutionExceptionHandler.md) __getExecutionExceptionHandler__()</span>

Returns the handler for dealing with exceptions that occurred in the `Callable`, `Runnable` or `Method`
 user object of a command when the command was [execute.execute](#execute).

The default implementation rethrows the specified exception.

**Returns:**

the handler for dealing with exceptions that occurred in the business logic when the [execute.execute](#execute) method was invoked.

**Since:**

4.0


---

### setExecutionExceptionHandler

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setExecutionExceptionHandler__([IExecutionExceptionHandler](CommandLine.IExecutionExceptionHandler.md) executionExceptionHandler)</span>

Sets a custom handler for dealing with exceptions that occurred in the `Callable`, `Runnable` or `Method`
user object of a command when the command was executed via the [execute.execute](#execute) method.

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
later will have the default setting. To ensure a setting is applied to all
subcommands, call the setter last, after adding subcommands.

**Parameters:**

`executionExceptionHandler` - the handler for dealing with exceptions that occurred in the business logic when the [execute.execute](#execute) method was invoked.

**Returns:**

this CommandLine for method chaining

**Since:**

4.0


---

### populateCommand

<span style="font-family: monospace; font-size: 80%;">public static T __populateCommand__(T command, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>




Convenience method that initializes the specified annotated object from the specified command line arguments.


This is equivalent to

new CommandLine(command).parseArgs(args);
return command;



All this method does is parse the arguments and populate the annotated fields and methods.
The caller is responsible for catching any exceptions, handling requests for usage help
or version information, and invoking the business logic.
Applications may be interested in using the [execute.execute](#execute) method instead.

**Parameters:**

`command` - the object to initialize. This object contains fields annotated with
         `@Option` or `@Parameters`.

`args` - the command line arguments to parse

**Returns:**

the specified annotated object

**Since:**

0.9.7

**See Also:**


[execute](#execute)



---

### populateSpec

<span style="font-family: monospace; font-size: 80%;">public static T __populateSpec__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<T> spec, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>




Convenience method that derives the command specification from the specified interface class, and returns an
instance of the specified interface.The interface is expected to have annotated getter methods. Picocli will
instantiate the interface and the getter methods will return the option and positional parameter values matched on the command line.



This is equivalent to

CommandLine cli = new CommandLine(spec);
cli.parse(args);
return cli.getCommand();



All this method does is parse the arguments and return an instance whose annotated methods return the specified values.
The caller is responsible for catching any exceptions, handling requests for usage help
or version information, and invoking the business logic.
Applications may be interested in using the [execute.execute](#execute) method instead.

**Parameters:**

`spec` - the interface that defines the command specification. This object contains getter methods annotated with
         `@Option` or `@Parameters`.

`args` - the command line arguments to parse

**Returns:**

an instance of the specified annotated interface

**Since:**

3.1

**See Also:**


[execute](#execute)



---

### parse

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Expands any [CommandLine.isExpandAtFiles](#isexpandatfiles) in the specified command line arguments, then
 parses the arguments and returns a list of `CommandLine` objects representing the
 top-level command and any subcommands (if any) that were recognized and initialized during the parsing process.


 If parsing succeeds, the first element in the returned list is always `this CommandLine` object. The
 returned list may contain more elements if subcommands were [addSubcommand.addSubcommand](#addsubcommand)
 and these subcommands were initialized by matching command line arguments. If parsing fails, a
 [ParameterException](CommandLine.ParameterException.md) is thrown.
 
 

All this method does is parse the arguments and populate the annotated fields and methods.
 The caller is responsible for catching any exceptions, handling requests for usage help
 or version information, and invoking the business logic.
 Applications may be interested in using the [execute.execute](#execute) method instead.



!!! note "Deprecation"
    use [parseArgs.parseArgs](#parseargs) instead

**Parameters:**

`args` - the command line arguments to parse

**Returns:**

a list with the top-level command and any subcommands initialized by this method


---

### parseArgs

<span style="font-family: monospace; font-size: 80%;">public [ParseResult](CommandLine.ParseResult.md) __parseArgs__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Expands any [CommandLine.isExpandAtFiles](#isexpandatfiles) in the specified command line arguments, then
 parses the arguments and returns a `ParseResult` with the options, positional
 parameters, and subcommands (if any) that were recognized and initialized during the parsing process.

If parsing fails, a [ParameterException](CommandLine.ParameterException.md) is thrown.
 

All this method does is parse the arguments and populate the annotated fields and methods.
 The caller is responsible for catching any exceptions, handling requests for usage help
 or version information, and invoking the business logic.
 Applications may be interested in using the [execute.execute](#execute) method instead.

**Parameters:**

`args` - the command line arguments to parse

**Returns:**

a list with the top-level command and any subcommands initialized by this method

**See Also:**


[execute](#execute)



---

### getParseResult

<span style="font-family: monospace; font-size: 80%;">public [ParseResult](CommandLine.ParseResult.md) __getParseResult__()</span>




---

### getExecutionResult

<span style="font-family: monospace; font-size: 80%;">public T __getExecutionResult__()</span>

Returns the result of calling the user object `Callable` or invoking the user object `Method`
 after parsing the user input, or `null` if this command has not been [execute.execute](#execute)
 or if this `CommandLine` is for a subcommand that was not specified by the end user on the command line.

Implementation note:
 

It is the responsibility of the [IExecutionStrategy](CommandLine.IExecutionStrategy.md) to set this value.

**Returns:**

the result of the user object `Callable` or `Method` (may be `null`), or `null` if this (sub)command was not executed

**Since:**

4.0


---

### setExecutionResult

<span style="font-family: monospace; font-size: 80%;">public void __setExecutionResult__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) result)</span>

Sets the result of calling the business logic on the command's user object.

**Parameters:**

`result` - the business logic result, may be `null`

**Since:**

4.0

**See Also:**


[execute](#execute)


[IExecutionStrategy](CommandLine.IExecutionStrategy.md)



---

### clearExecutionResults

<span style="font-family: monospace; font-size: 80%;">public void __clearExecutionResults__()</span>

Clears the [getExecutionResult.getExecutionResult](#getexecutionresult) of a previous invocation from this `CommandLine` and all subcommands.

**Since:**

4.0


---

### defaultExceptionHandler

<span style="font-family: monospace; font-size: 80%;">public static io.github.qishr.cascara.common.util.CommandLine.DefaultExceptionHandler<java.util.List<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __defaultExceptionHandler__()</span>

Convenience method that returns `new DefaultExceptionHandler<List<Object>>()`.


---

### printHelpIfRequested

<span style="font-family: monospace; font-size: 80%;">public static boolean __printHelpIfRequested__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>





!!! note "Deprecation"
    use [printHelpIfRequested.printHelpIfRequested](#printhelpifrequested) instead

**Since:**

2.0


---

### printHelpIfRequested

<span style="font-family: monospace; font-size: 80%;">public static boolean __printHelpIfRequested__([ParseResult](CommandLine.ParseResult.md) parseResult)</span>

Delegates to [executeHelpRequest.executeHelpRequest](#executehelprequest).

**Parameters:**

`parseResult` - contains the `CommandLine` objects found during parsing; check these to see if help was requested

**Returns:**

`true` if help was printed, `false` otherwise

**Since:**

3.0


---

### printHelpIfRequested

<span style="font-family: monospace; font-size: 80%;">public static boolean __printHelpIfRequested__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Delegates to the implementation of [executeHelpRequest.executeHelpRequest](#executehelprequest).



!!! note "Deprecation"
    use [executeHelpRequest.executeHelpRequest](#executehelprequest) instead

**Parameters:**

`parsedCommands` - the list of `CommandLine` objects to check if help was requested

`out` - the `PrintStream` to print help to if requested

`err` - the error string to print diagnostic messages to, in addition to the output from the exception handler

`ansi` - for printing help messages using ANSI styles and colors

**Returns:**

`true` if help was printed, `false` otherwise

**Since:**

3.0


---

### printHelpIfRequested

<span style="font-family: monospace; font-size: 80%;">public static boolean __printHelpIfRequested__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> parsedCommands, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)</span>

Delegates to the implementation of [executeHelpRequest.executeHelpRequest](#executehelprequest).



!!! note "Deprecation"
    use [executeHelpRequest.executeHelpRequest](#executehelprequest) instead

**Parameters:**

`parsedCommands` - the list of `CommandLine` objects to check if help was requested

`out` - the `PrintStream` to print help to if requested

`err` - the error string to print diagnostic messages to, in addition to the output from the exception handler

`colorScheme` - for printing help messages using ANSI styles and colors

**Returns:**

`true` if help was printed, `false` otherwise

**Since:**

3.6


---

### executeHelpRequest

<span style="font-family: monospace; font-size: 80%;">public static [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __executeHelpRequest__([ParseResult](CommandLine.ParseResult.md) parseResult)</span>

Helper method that may be useful when processing the `ParseResult` that results from successfully
[parseArgs.parseArgs](#parseargs) command line arguments.This method prints out
[usage.usage](#usage) to the [CommandLine.getOut](#getout)
if [isUsageHelpRequested.isUsageHelpRequested](#isusagehelprequested) or [printVersionHelp.printVersionHelp](#printversionhelp)
to the [CommandLine.getOut](#getout) if [isVersionHelpRequested.isVersionHelpRequested](#isversionhelprequested)
and returns CommandSpec#exitCodeOnUsageHelp() or CommandSpec#exitCodeOnVersionHelp(), respectively.
If the command is a Command#helpCommand() and `runnable` or `callable`,
that command is executed and this method returns CommandSpec#exitCodeOnUsageHelp().
Otherwise, if none of the specified `CommandLine` objects have help requested,
this method returns `null`.


Note that this method only looks at the Option#usageHelp() and
Option#versionHelp() attributes. The Option#help() attribute is ignored.


Implementation note:


When an error occurs while processing the help request, it is recommended custom Help commands throw a
[ParameterException](CommandLine.ParameterException.md) with a reference to the parent command. This will print the error message and the
usage for the parent command, and will use the exit code of the exception handler if one was set.


**Parameters:**

`parseResult` - contains the `CommandLine` objects found during parsing; check these to see if help was requested

**Returns:**

CommandSpec#exitCodeOnUsageHelp() if usage help was requested,
     CommandSpec#exitCodeOnVersionHelp() if version help was requested, and `null` otherwise

**Since:**

4.0

**See Also:**


[IHelpCommandInitializable2](CommandLine.IHelpCommandInitializable2.md)



---

### execute

<span style="font-family: monospace; font-size: 80%;">public int __execute__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Convenience method to allow command line application authors to avoid some boilerplate code in their application.To use this method, the annotated object that this `CommandLine` is constructed with needs to
either implement Runnable, Callable, or be a `Method` object.
See [getCommandMethods.getCommandMethods](#getcommandmethods) for a convenient way to obtain a command `Method`.


This method replaces the [run.run](#run), [call.call](#call)
and [invoke.invoke](#invoke) convenience methods that were available with previous versions of picocli.



Exit Code



This method returns an exit code that applications can use to call `System.exit`.
(The return value of the `Callable` or `Method` can still be obtained via [getExecutionResult.getExecutionResult](#getexecutionresult).)
If the user object `Callable` or `Method` returns an `int` or `Integer`,
this will be used as the exit code. Additionally, if the user object implements CommandLine.IExitCodeGenerator,
an exit code is obtained by calling its `getExitCode()` method (after invoking the user object).



In the case of multiple exit codes the highest value will be used (or if all values are negative, the lowest value will be used).



Exception Handling



This method never throws an exception.



If the user specified invalid input, the [getParameterExceptionHandler.getParameterExceptionHandler](#getparameterexceptionhandler) is invoked.
By default this prints an error message and the usage help message, and returns an exit code.



If an exception occurred while the user object `Runnable`, `Callable`, or `Method`
was invoked, this exception is caught and passed to the [getExecutionExceptionHandler.getExecutionExceptionHandler](#getexecutionexceptionhandler).
The default `IExecutionExceptionHandler` will rethrow this Exception.



Any exception thrown from the `IParameterExceptionHandler` or `IExecutionExceptionHandler` is caught,
it stacktrace is printed and is mapped to an exit code, using the following logic:



If an CommandLine.IExitCodeExceptionMapper is [setExitCodeExceptionMapper.setExitCodeExceptionMapper](#setexitcodeexceptionmapper),
this mapper is used to determine the exit code based on the exception.



If an `IExitCodeExceptionMapper` is not set, by default this method will return the `@Command` annotation's
Command#exitCodeOnInvalidInput() or Command#exitCodeOnExecutionException() value, respectively.


Example Usage:

Command
class MyCommand implements CallableInteger {
    public Integer call() { return 123; }
}
CommandLine cmd = new CommandLine(new MyCommand());
int exitCode = cmd.execute(args);
assert exitCode == 123;
System.exit(exitCode);



Since `execute` is an instance method, not a static method, applications can do configuration before invoking the command. For example:
`CommandLine cmd = new CommandLine(new MyCallable())
        .setCaseInsensitiveEnumValuesAllowed(true) // configure a non-default parser option
        .setOut(myOutWriter()) // configure an alternative to System.out
        .setErr(myErrWriter()) // configure an alternative to System.err
        .setColorScheme(myColorScheme()); // configure a custom color scheme
int exitCode = cmd.execute(args);
System.exit(exitCode);
`



If the specified command has subcommands, the [RunLast](CommandLine.RunLast.md) subcommand specified on the
command line is executed. This can be configured by setting the [setExecutionStrategy.setExecutionStrategy](#setexecutionstrategy).
Built-in alternatives are executing the [RunFirst](CommandLine.RunFirst.md) subcommand, or executing [RunAll](CommandLine.RunAll.md) specified subcommands.


**Parameters:**

`args` - the command line arguments to parse

**Returns:**

the exit code

**Since:**

4.0

**See Also:**


[ExitCode](CommandLine.ExitCode.md)


[IExitCodeGenerator](CommandLine.IExitCodeGenerator.md)


[getExecutionResult](#getexecutionresult)


[getExecutionStrategy](#getexecutionstrategy)


[getParameterExceptionHandler](#getparameterexceptionhandler)


[getExecutionExceptionHandler](#getexecutionexceptionhandler)


[getExitCodeExceptionMapper](#getexitcodeexceptionmapper)



---

### parseWithHandler

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __parseWithHandler__([IParseResultHandler](CommandLine.IParseResultHandler.md) handler, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>





!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Since:**

2.0


---

### parseWithHandler

<span style="font-family: monospace; font-size: 80%;">public R __parseWithHandler__([IParseResultHandler2](CommandLine.IParseResultHandler2.md)<R> handler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Returns the result of calling [parseWithHandlers.parseWithHandlers](#parsewithhandlers) with
a new [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md) in addition to the specified parse result handler and the specified command line arguments.


This is a convenience method intended to offer the same ease of use as the [run.run](#run)
and [call.call](#call) methods, but with more flexibility and better
support for nested subcommands.



Calling this method roughly expands to:
`try {
    ParseResult parseResult = parseArgs(args);
    return handler.handleParseResult(parseResult);
} catch (ParameterException ex) {
    return new DefaultExceptionHandler<R>().handleParseException(ex, args);
}
`



Picocli provides some default handlers that allow you to accomplish some common tasks with very little code.
The following handlers are available:

  [RunLast](CommandLine.RunLast.md) handler prints help if requested, and otherwise gets the last specified command or subcommand
and tries to execute it as a `Runnable` or `Callable`.
  [RunFirst](CommandLine.RunFirst.md) handler prints help if requested, and otherwise executes the top-level command as a `Runnable` or `Callable`.
  [RunAll](CommandLine.RunAll.md) handler prints help if requested, and otherwise executes all recognized commands and subcommands as `Runnable` or `Callable` tasks.
  [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md) prints the error message followed by usage help




!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`handler` - the function that will handle the result of successfully parsing the command line arguments

`args` - the command line arguments

**Returns:**

an object resulting from handling the parse result or the exception that occurred while parsing the input

**Since:**

3.0

**See Also:**


[RunLast](CommandLine.RunLast.md)


[RunAll](CommandLine.RunAll.md)



---

### parseWithHandlers

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __parseWithHandlers__([IParseResultHandler](CommandLine.IParseResultHandler.md) handler, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [IExceptionHandler](CommandLine.IExceptionHandler.md) exceptionHandler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>





!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Since:**

2.0


---

### parseWithHandlers

<span style="font-family: monospace; font-size: 80%;">public R __parseWithHandlers__([IParseResultHandler2](CommandLine.IParseResultHandler2.md)<R> handler, [IExceptionHandler2](CommandLine.IExceptionHandler2.md)<R> exceptionHandler, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Tries to [parseArgs.parseArgs](#parseargs) the specified command line arguments, and if successful, delegates
the processing of the resulting `ParseResult` object to the specified [IParseResultHandler2](CommandLine.IParseResultHandler2.md).If the command line arguments were invalid, the `ParameterException` thrown from the `parse` method
is caught and passed to the specified [IExceptionHandler2](CommandLine.IExceptionHandler2.md).



This is a convenience method intended to offer the same ease of use as the [run.run](#run)
and [call.call](#call) methods, but with more flexibility and better
support for nested subcommands.



Calling this method roughly expands to:

ParseResult parseResult = null;
try {
    parseResult = parseArgs(args);
    return handler.handleParseResult(parseResult);
} catch (ParameterException ex) {
    return exceptionHandler.handleParseException(ex, (String[]) args);
} catch (ExecutionException ex) {
    return exceptionHandler.handleExecutionException(ex, parseResult);
}




Picocli provides some default handlers that allow you to accomplish some common tasks with very little code.
The following handlers are available:

  [RunLast](CommandLine.RunLast.md) handler prints help if requested, and otherwise gets the last specified command or subcommand
and tries to execute it as a `Runnable` or `Callable`.
  [RunFirst](CommandLine.RunFirst.md) handler prints help if requested, and otherwise executes the top-level command as a `Runnable` or `Callable`.
  [RunAll](CommandLine.RunAll.md) handler prints help if requested, and otherwise executes all recognized commands and subcommands as `Runnable` or `Callable` tasks.
  [DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md) prints the error message followed by usage help




!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`handler` - the function that will handle the result of successfully parsing the command line arguments

`exceptionHandler` - the function that can handle the `ParameterException` thrown when the command line arguments are invalid

`args` - the command line arguments

**Returns:**

an object resulting from handling the parse result or the exception that occurred while parsing the input

**Since:**

3.0

**See Also:**


[RunLast](CommandLine.RunLast.md)


[RunAll](CommandLine.RunAll.md)


[DefaultExceptionHandler](CommandLine.DefaultExceptionHandler.md)



---

### usage

<span style="font-family: monospace; font-size: 80%;">public static void __usage__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)</span>

Equivalent to `new CommandLine(command).usage(out)`.See [usage.usage](#usage) for details.

**Parameters:**

`command` - the object annotated with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and [Parameters](CommandLine.Parameters.md)

`out` - the print stream to print the help message to


---

### usage

<span style="font-family: monospace; font-size: 80%;">public static void __usage__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Equivalent to `new CommandLine(command).usage(out, ansi)`.See [usage.usage](#usage) for details.

**Parameters:**

`command` - the object annotated with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and [Parameters](CommandLine.Parameters.md)

`out` - the print stream to print the help message to

`ansi` - whether the usage message should contain ANSI escape codes or not


---

### usage

<span style="font-family: monospace; font-size: 80%;">public static void __usage__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)</span>

Equivalent to `new CommandLine(command).usage(out, colorScheme)`.See [usage.usage](#usage) for details.

**Parameters:**

`command` - the object annotated with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and [Parameters](CommandLine.Parameters.md)

`out` - the print stream to print the help message to

`colorScheme` - the `ColorScheme` defining the styles for options, parameters and commands when ANSI is enabled


---

### usage

<span style="font-family: monospace; font-size: 80%;">public void __usage__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)</span>

Delegates to [usage.usage](#usage) with the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.

**Parameters:**

`out` - the printStream to print to

**See Also:**


[usage](#usage)



---

### usage

<span style="font-family: monospace; font-size: 80%;">public void __usage__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer)</span>

Delegates to [usage.usage](#usage) with the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.

**Parameters:**

`writer` - the PrintWriter to print to

**Since:**

3.0

**See Also:**


[usage](#usage)



---

### usage

<span style="font-family: monospace; font-size: 80%;">public void __usage__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Delegates to [usage.usage](#usage) with the default color scheme.

**Parameters:**

`out` - the printStream to print to

`ansi` - whether the usage message should include ANSI escape codes or not

**See Also:**


[usage](#usage)



---

### usage

<span style="font-family: monospace; font-size: 80%;">public void __usage__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Similar to [usage.usage](#usage) but with the specified `PrintWriter` instead of a `PrintStream`.

**Since:**

3.0


---

### usage

<span style="font-family: monospace; font-size: 80%;">public void __usage__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)</span>

Prints a usage help message for the annotated command class to the specified `PrintStream`.Delegates construction of the usage help message to the [Help](CommandLine.Help.md) inner class and is equivalent to:

Help.ColorScheme colorScheme = Help.defaultColorScheme(Help.Ansi.AUTO);
Help help = getHelpFactory().create(getCommandSpec(), colorScheme)
StringBuilder sb = new StringBuilder();
for (String key : getHelpSectionKeys()) {
    IHelpSectionRenderer renderer = getHelpSectionMap().get(key);
    if (renderer != null) { sb.append(renderer.render(help)); }
}
out.print(sb);



Annotate your class with [Command](CommandLine.Command.md) to control many aspects of the usage help message, including
the program name, text of section headings and section contents, and some aspects of the auto-generated sections
of the usage help message.


To customize the auto-generated sections of the usage help message, like how option details are displayed,
instantiate a [Help](CommandLine.Help.md) object and use a Help.TextTable with more of fewer columns, a custom
layout, and/or a custom option renderer
for ultimate control over which aspects of an Option or Field are displayed where.

**Parameters:**

`out` - the `PrintStream` to print the usage help message to

`colorScheme` - the `ColorScheme` defining the styles for options, parameters and commands when ANSI is enabled

**See Also:**


[UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)



---

### usage

<span style="font-family: monospace; font-size: 80%;">public void __usage__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)</span>

Similar to [usage.usage](#usage), but with the specified `PrintWriter` instead of a `PrintStream`.

**Since:**

3.0


---

### getUsageMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUsageMessage__()</span>

Similar to [usage.usage](#usage), but returns the usage help message as a String instead of printing it to the `PrintStream`.

**Since:**

3.2


---

### getUsageMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUsageMessage__([Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Similar to [usage.usage](#usage), but returns the usage help message as a String instead of printing it to the `PrintStream`.

**Since:**

3.2


---

### getUsageMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getUsageMessage__([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)</span>

Similar to [usage.usage](#usage), but returns the usage help message as a String instead of printing it to the `PrintStream`.

**Since:**

3.2


---

### printVersionHelp

<span style="font-family: monospace; font-size: 80%;">public void __printVersionHelp__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)</span>

Delegates to [printVersionHelp.printVersionHelp](#printversionhelp) with the ANSI setting of the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.

**Parameters:**

`out` - the printStream to print to

**Since:**

0.9.8

**See Also:**


[printVersionHelp](#printversionhelp)



---

### printVersionHelp

<span style="font-family: monospace; font-size: 80%;">public void __printVersionHelp__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Prints version information from the Command#version() annotation to the specified `PrintStream`.Each element of the array of version strings is printed on a separate line. Version strings may contain
markup for colors and style.

**Parameters:**

`out` - the printStream to print to

`ansi` - whether the usage message should include ANSI escape codes or not

**Since:**

0.9.8

**See Also:**


[version](null.md)


[versionHelp](null.md)


[isVersionHelpRequested](#isversionhelprequested)



---

### printVersionHelp

<span style="font-family: monospace; font-size: 80%;">public void __printVersionHelp__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Prints version information from the Command#version() annotation to the specified `PrintStream`.Each element of the array of version strings is formatted with the
specified parameters, and printed on a separate line. Both version strings and parameters may contain
markup for colors and style.

**Parameters:**

`out` - the printStream to print to

`ansi` - whether the usage message should include ANSI escape codes or not

`params` - Arguments referenced by the format specifiers in the version strings

**Since:**

1.0.0

**See Also:**


[version](null.md)


[versionHelp](null.md)


[isVersionHelpRequested](#isversionhelprequested)



---

### printVersionHelp

<span style="font-family: monospace; font-size: 80%;">public void __printVersionHelp__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out)</span>

Delegates to [printVersionHelp.printVersionHelp](#printversionhelp) with the ANSI setting of the [getColorScheme.getColorScheme](#getcolorscheme) color scheme.

**Parameters:**

`out` - the PrintWriter to print to

**Since:**

4.0


---

### printVersionHelp

<span style="font-family: monospace; font-size: 80%;">public void __printVersionHelp__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Prints version information from the Command#version() annotation to the specified `PrintWriter`.Each element of the array of version strings is formatted with the
specified parameters, and printed on a separate line. Both version strings and parameters may contain
markup for colors and style.

**Parameters:**

`out` - the PrintWriter to print to

`ansi` - whether the usage message should include ANSI escape codes or not

`params` - Arguments referenced by the format specifiers in the version strings

**Since:**

4.0

**See Also:**


[version](null.md)


[versionHelp](null.md)


[isVersionHelpRequested](#isversionhelprequested)



---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__(C callable, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Equivalent to `new CommandLine(callable).execute(args)`, except for the return value.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callable` - the command to call when [parseArgs.parseArgs](#parseargs) succeeds.

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**Since:**

3.0

**See Also:**


[execute](#execute)



---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__(C callable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [call.call](#call) with `System.err` for
diagnostic error messages and Help.Ansi#AUTO.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callable` - the command to call when [parseArgs.parseArgs](#parseargs) succeeds.

`out` - the printStream to print the usage help message to when the user requested help

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**See Also:**


[RunLast](CommandLine.RunLast.md)



---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__(C callable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [call.call](#call) with `System.err` for diagnostic error messages.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callable` - the command to call when [parseArgs.parseArgs](#parseargs) succeeds.

`out` - the printStream to print the usage help message to when the user requested help

`ansi` - the ANSI style to use

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**See Also:**


[RunLast](CommandLine.RunLast.md)



---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__(C callable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Convenience method to allow command line application authors to avoid some boilerplate code in their application.The annotated object needs to implement Callable.


Consider using the [execute.execute](#execute) method instead:
`CommandLine cmd = new CommandLine(callable)
        .setOut(myOutWriter()) // System.out by default
        .setErr(myErrWriter()) // System.err by default
        .setColorScheme(myColorScheme()); // default color scheme, Ansi.AUTO by default
int exitCode = cmd.execute(args);
//System.exit(exitCode);
`



If the specified Callable command has subcommands, the [RunLast](CommandLine.RunLast.md) subcommand specified on the
command line is executed.




!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callable` - the command to call when [parse.parse](#parse) succeeds.

`out` - the printStream to print the usage help message to when the user requested help

`err` - the printStream to print diagnostic messages to

`ansi` - including whether the usage message should include ANSI escape codes or not

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**Since:**

3.0


---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Equivalent to `new CommandLine(callableClass, factory).execute(args)`, except for the return value.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callableClass` - class of the command to call when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified callable class and potentially inject other components

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**Since:**

3.2

**See Also:**


[execute](#execute)



---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [call.call](#call) with
`System.err` for diagnostic error messages, and Help.Ansi#AUTO.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callableClass` - class of the command to call when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified callable class and potentially injecting other components

`out` - the printStream to print the usage help message to when the user requested help

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**Since:**

3.2


---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [call.call](#call) with
`System.err` for diagnostic error messages.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callableClass` - class of the command to call when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified callable class and potentially injecting other components

`out` - the printStream to print the usage help message to when the user requested help

`ansi` - the ANSI style to use

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**Since:**

3.2


---

### call

<span style="font-family: monospace; font-size: 80%;">public static T __call__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<C> callableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Convenience method to allow command line application authors to avoid some boilerplate code in their application.The specified [IFactory](CommandLine.IFactory.md) will create an instance of the specified `callableClass`;
use this method instead of [call.call](#call)
if you want to use a factory that performs Dependency Injection.
The annotated class needs to implement Callable.


Consider using the [execute.execute](#execute) method instead:
`CommandLine cmd = new CommandLine(callableClass, factory)
        .setOut(myOutWriter()) // System.out by default
        .setErr(myErrWriter()) // System.err by default
        .setColorScheme(myColorScheme()); // default color scheme, Ansi.AUTO by default
int exitCode = cmd.execute(args);
//System.exit(exitCode);
`



If the specified Callable command has subcommands, the [RunLast](CommandLine.RunLast.md) subcommand specified on the
command line is executed.




!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`callableClass` - class of the command to call when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified callable class and potentially injecting other components

`out` - the printStream to print the usage help message to when the user requested help

`err` - the printStream to print diagnostic messages to

`ansi` - the ANSI style to use

`args` - the command line arguments to parse

**Returns:**

`null` if an error occurred while parsing the command line options, or if help was requested and printed. Otherwise returns the result of calling the Callable

**Since:**

3.2


---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__(R runnable, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Equivalent to `new CommandLine(runnable).execute(args)`.



!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnable` - the command to run when [parseArgs.parseArgs](#parseargs) succeeds.

`args` - the command line arguments to parse

**Since:**

3.0

**See Also:**


[execute](#execute)



---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__(R runnable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [run.run](#run) with `System.err` for diagnostic error messages and Help.Ansi#AUTO.



!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnable` - the command to run when [parseArgs.parseArgs](#parseargs) succeeds.

`out` - the printStream to print the usage help message to when the user requested help

`args` - the command line arguments to parse

**See Also:**


[RunLast](CommandLine.RunLast.md)



---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__(R runnable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [run.run](#run) with `System.err` for diagnostic error messages.



!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnable` - the command to run when [parseArgs.parseArgs](#parseargs) succeeds.

`out` - the printStream to print the usage help message to when the user requested help

`ansi` - whether the usage message should include ANSI escape codes or not

`args` - the command line arguments to parse

**See Also:**


[RunLast](CommandLine.RunLast.md)



---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__(R runnable, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Convenience method to allow command line application authors to avoid some boilerplate code in their application.The annotated object needs to implement Runnable.


Consider using the [execute.execute](#execute) method instead:
`CommandLine cmd = new CommandLine(runnable)
        .setOut(myOutWriter()) // System.out by default
        .setErr(myErrWriter()) // System.err by default
        .setColorScheme(myColorScheme()); // default color scheme, Ansi.AUTO by default
int exitCode = cmd.execute(args);
//System.exit(exitCode);
`



If the specified Runnable command has subcommands, the [RunLast](CommandLine.RunLast.md) subcommand specified on the
command line is executed.



From picocli v2.0, this method prints usage help or version help if [printHelpIfRequested.printHelpIfRequested](#printhelpifrequested),
and any exceptions thrown by the `Runnable` are caught and rethrown wrapped in an `ExecutionException`.




!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnable` - the command to run when [parse.parse](#parse) succeeds.

`out` - the printStream to print the usage help message to when the user requested help

`err` - the printStream to print diagnostic messages to

`ansi` - whether the usage message should include ANSI escape codes or not

`args` - the command line arguments to parse

**Since:**

3.0


---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Equivalent to `new CommandLine(runnableClass, factory).execute(args)`.



!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnableClass` - class of the command to run when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified Runnable class and potentially injecting other components

`args` - the command line arguments to parse

**Since:**

3.2

**See Also:**


[execute](#execute)



---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [run.run](#run) with
`System.err` for diagnostic error messages, and Help.Ansi#AUTO.



!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnableClass` - class of the command to run when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified Runnable class and potentially injecting other components

`out` - the printStream to print the usage help message to when the user requested help

`args` - the command line arguments to parse

**Since:**

3.2

**See Also:**


[run](#run)


[parseWithHandlers](#parsewithhandlers)


[RunLast](CommandLine.RunLast.md)



---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [run.run](#run) with
`System.err` for diagnostic error messages.



!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnableClass` - class of the command to run when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified Runnable class and potentially injecting other components

`out` - the printStream to print the usage help message to when the user requested help

`ansi` - whether the usage message should include ANSI escape codes or not

`args` - the command line arguments to parse

**Since:**

3.2

**See Also:**


[run](#run)


[parseWithHandlers](#parsewithhandlers)


[RunLast](CommandLine.RunLast.md)



---

### run

<span style="font-family: monospace; font-size: 80%;">public static void __run__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<R> runnableClass, [IFactory](CommandLine.IFactory.md) factory, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Convenience method to allow command line application authors to avoid some boilerplate code in their application.The specified [IFactory](CommandLine.IFactory.md) will create an instance of the specified `runnableClass`;
use this method instead of [run.run](#run)
if you want to use a factory that performs Dependency Injection.
The annotated class needs to implement Runnable.


Consider using the [execute.execute](#execute) method instead:
`CommandLine cmd = new CommandLine(runnableClass, factory)
        .setOut(myOutWriter()) // System.out by default
        .setErr(myErrWriter()) // System.err by default
        .setColorScheme(myColorScheme()); // default color scheme, Ansi.AUTO by default
int exitCode = cmd.execute(args);
//System.exit(exitCode);
`



If the specified Runnable command has subcommands, the [RunLast](CommandLine.RunLast.md) subcommand specified on the
command line is executed.



This method prints usage help or version help if [printHelpIfRequested.printHelpIfRequested](#printhelpifrequested),
and any exceptions thrown by the `Runnable` are caught and rethrown wrapped in an `ExecutionException`.




!!! note "Deprecation"
    use [execute.execute](#execute) instead

**Parameters:**

`runnableClass` - class of the command to run when [parseArgs.parseArgs](#parseargs) succeeds.

`factory` - the factory responsible for instantiating the specified Runnable class and potentially injecting other components

`out` - the printStream to print the usage help message to when the user requested help

`err` - the printStream to print diagnostic messages to

`ansi` - whether the usage message should include ANSI escape codes or not

`args` - the command line arguments to parse

**Since:**

3.2


---

### invoke

<span style="font-family: monospace; font-size: 80%;">public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __invoke__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [invoke.invoke](#invoke) with `System.out` for
requested usage help messages, `System.err` for diagnostic error messages, and Help.Ansi#AUTO.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`methodName` - the `@Command`-annotated method to build a [CommandSpec](CommandLine.Model.CommandSpec.md) model from,
                  and run when [parseArgs.parseArgs](#parseargs) succeeds.

`cls` - the class where the `@Command`-annotated method is declared, or a subclass

`args` - the command line arguments to parse

**Since:**

3.6

**See Also:**


[invoke](#invoke)


[parseWithHandlers](#parsewithhandlers)



---

### invoke

<span style="font-family: monospace; font-size: 80%;">public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __invoke__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [invoke.invoke](#invoke) with the specified stream for
requested usage help messages, `System.err` for diagnostic error messages, and Help.Ansi#AUTO.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`methodName` - the `@Command`-annotated method to build a [CommandSpec](CommandLine.Model.CommandSpec.md) model from,
                  and run when [parseArgs.parseArgs](#parseargs) succeeds.

`cls` - the class where the `@Command`-annotated method is declared, or a subclass

`out` - the printstream to print requested help message to

`args` - the command line arguments to parse

**Since:**

3.6

**See Also:**


[invoke](#invoke)


[parseWithHandlers](#parsewithhandlers)



---

### invoke

<span style="font-family: monospace; font-size: 80%;">public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __invoke__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Delegates to [invoke.invoke](#invoke) with the specified stream for
requested usage help messages, `System.err` for diagnostic error messages, and the specified Ansi mode.



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`methodName` - the `@Command`-annotated method to build a [CommandSpec](CommandLine.Model.CommandSpec.md) model from,
                  and run when [parseArgs.parseArgs](#parseargs) succeeds.

`cls` - the class where the `@Command`-annotated method is declared, or a subclass

`out` - the printstream to print requested help message to

`ansi` - whether the usage message should include ANSI escape codes or not

`args` - the command line arguments to parse

**Since:**

3.6

**See Also:**


[invoke](#invoke)


[parseWithHandlers](#parsewithhandlers)



---

### invoke

<span style="font-family: monospace; font-size: 80%;">public static [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __invoke__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName, [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) err, [Ansi](CommandLine.Help.Ansi.md) ansi, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] args)</span>

Convenience method to allow command line application authors to avoid some boilerplate code in their application.Constructs a [CommandSpec](CommandLine.Model.CommandSpec.md) model from the `@Option` and `@Parameters`-annotated method parameters
of the `@Command`-annotated method, parses the specified command line arguments and invokes the specified method.


Consider using the [execute.execute](#execute) method instead:
`Method commandMethod = getCommandMethods(cls, methodName).get(0);
CommandLine cmd = new CommandLine(commandMethod)
        .setOut(myOutWriter()) // System.out by default
        .setErr(myErrWriter()) // System.err by default
        .setColorScheme(myColorScheme()); // default color scheme, Ansi.AUTO by default
int exitCode = cmd.execute(args);
//System.exit(exitCode);
`



!!! note "Deprecation"
    use [execute.execute](#execute) and [getExecutionResult.getExecutionResult](#getexecutionresult) instead

**Parameters:**

`methodName` - the `@Command`-annotated method to build a [CommandSpec](CommandLine.Model.CommandSpec.md) model from,
                  and run when [parseArgs.parseArgs](#parseargs) succeeds.

`cls` - the class where the `@Command`-annotated method is declared, or a subclass

`out` - the printStream to print the usage help message to when the user requested help

`err` - the printStream to print diagnostic messages to

`ansi` - whether the usage message should include ANSI escape codes or not

`args` - the command line arguments to parse

**Since:**

3.6


---

### getCommandMethods

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Method](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)> __getCommandMethods__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> cls, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) methodName)</span>

Helper to get methods of a class annotated with [Command](CommandLine.Command.md) via reflection, optionally filtered by method name (not Command#name()).Methods have to be either public (inherited) members or be declared by `cls`, that is "inherited" static or protected methods will not be picked up.

**Parameters:**

`cls` - the class to search for methods annotated with `@Command`

`methodName` - if not `null`, return only methods whose method name (not Command#name()) equals this string. Ignored if `null`.

**Returns:**

the matching command methods, or an empty list

**Since:**

3.6.0

**See Also:**


[invoke](#invoke)



---

### registerConverter

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __registerConverter__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<K> cls, [ITypeConverter](CommandLine.ITypeConverter.md)<K> converter)</span>

Registers the specified type converter for the specified class.When initializing fields annotated with
[Option](CommandLine.Option.md), the field's type is used as a lookup key to find the associated type converter, and this
type converter converts the original command line argument string value to the correct type.



Java 8 lambdas make it easy to register custom type converters:


commandLine.registerConverter(java.nio.file.Path.class, s - java.nio.file.Paths.get(s));
commandLine.registerConverter(java.time.Duration.class, s - java.time.Duration.parse(s));



Built-in type converters are pre-registered for the following java 1.5 types:


  all primitive types
  all primitive wrapper types: Boolean, Byte, Character, Double, Float, Integer, Long, Short
  any enum
  java.io.File
  java.math.BigDecimal
  java.math.BigInteger
  java.net.InetAddress
  java.net.URI
  java.net.URL
  java.nio.charset.Charset
  java.sql.Time
  java.util.Date
  java.util.UUID
  java.util.regex.Pattern
  StringBuilder
  CharSequence
  String



The specified converter will be registered with this `CommandLine` and the full hierarchy of its
subcommands and nested sub-subcommands at the moment the converter is registered. Subcommands added
later will not have this converter added automatically. To ensure a custom type converter is available to all
subcommands, register the type converter last, after adding subcommands.

**Parameters:**

`cls` - the target class to convert parameter string values to

`converter` - the class capable of converting string values to the specified target type

**Returns:**

this CommandLine object, to allow method chaining

**See Also:**


[addSubcommand](#addsubcommand)



---

### getSeparator

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSeparator__()</span>

Returns the String that separates option names from option values when parsing command line options.

**Returns:**

the String the parser uses to separate option names from option values

**See Also:**


[separator](null.md)



---

### setSeparator

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setSeparator__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)</span>

Sets the String the parser uses to separate option names from option values to the specified value.The separator may also be set declaratively with the CommandLine.Command#separator() annotation attribute.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`separator` - the String that separates option names from option values

**Returns:**

this `CommandLine` object, to allow method chaining

**See Also:**


[separator](null.md)



---

### getResourceBundle

<span style="font-family: monospace; font-size: 80%;">public [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) __getResourceBundle__()</span>

Returns the ResourceBundle of this command or `null` if no resource bundle is set.

**Since:**

3.6

**See Also:**


[resourceBundle](null.md)


[resourceBundle](null.md)



---

### setResourceBundle

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setResourceBundle__([ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) bundle)</span>

Sets the ResourceBundle containing usage help message strings.

The specified bundle will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will not be impacted. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`bundle` - the ResourceBundle containing usage help message strings

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.6

**See Also:**


[resourceBundle](null.md)


[resourceBundle](null.md)



---

### getUsageHelpWidth

<span style="font-family: monospace; font-size: 80%;">public int __getUsageHelpWidth__()</span>

Returns the maximum width of the usage help message.The default is 80.

**See Also:**


[width](null.md)



---

### setUsageHelpWidth

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setUsageHelpWidth__(int width)</span>

Sets the maximum width of the usage help message.Longer lines are wrapped.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`width` - the maximum width of the usage help message

**Returns:**

this `CommandLine` object, to allow method chaining

**See Also:**


[width](null.md)



---

### getUsageHelpLongOptionsMaxWidth

<span style="font-family: monospace; font-size: 80%;">public int __getUsageHelpLongOptionsMaxWidth__()</span>

Returns the maximum usage help long options column max width to the specified value.This value controls the maximum width of the long options column: any positional parameter
 labels or long options that are longer than the specified value will overflow into
 the description column, and cause the description to be displayed on the next line.

**Since:**

4.2

**See Also:**


[longOptionsMaxWidth](null.md)



---

### setUsageHelpLongOptionsMaxWidth

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setUsageHelpLongOptionsMaxWidth__(int columnWidth)</span>

Returns the maximum usage help long options column max width to the specified value.This value controls the maximum width of the long options column: any positional parameter
 labels or long options that are longer than the specified value will overflow into
 the description column, and cause the description to be displayed on the next line.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`columnWidth` - the new maximum usage help long options column max width. Must be 20 or greater.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.2

**See Also:**


[longOptionsMaxWidth](null.md)



---

### isUsageHelpAutoWidth

<span style="font-family: monospace; font-size: 80%;">public boolean __isUsageHelpAutoWidth__()</span>

Returns whether picocli should attempt to detect the terminal size and adjust the usage help message width
 to take the full terminal width.End users may enable this by setting system property `"picocli.usage.width"` to `AUTO`,
 and may disable this by setting this system property to a numeric value.
 This feature requires Java 7 or greater. The default is `false`.

**Since:**

4.0

**See Also:**


[autoWidth](null.md)



---

### setUsageHelpAutoWidth

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setUsageHelpAutoWidth__(boolean detectTerminalSize)</span>

Sets whether picocli should attempt to detect the terminal size and adjust the usage help message width
 to take the full terminal width.The default is `false`.
 

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.

**Parameters:**

`detectTerminalSize` - whether picocli should attempt to detect the terminal size

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.0

**See Also:**


[autoWidth](null.md)



---

### getCommandName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCommandName__()</span>

Returns the command name (also called program name) displayed in the usage help synopsis.

**Returns:**

the command name (also called program name) displayed in the usage

**Since:**

2.0

**See Also:**


[name](null.md)



---

### setCommandName

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setCommandName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commandName)</span>

Sets the command name (also called program name) displayed in the usage help synopsis to the specified value.Note that this method only modifies the usage help message, it does not impact parsing behaviour.
 The command name may also be set declaratively with the CommandLine.Command#name() annotation attribute.

**Parameters:**

`commandName` - command name (also called program name) displayed in the usage help synopsis

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

2.0

**See Also:**


[name](null.md)



---

### isExpandAtFiles

<span style="font-family: monospace; font-size: 80%;">public boolean __isExpandAtFiles__()</span>

Returns whether arguments starting with `'@'` should be treated as the path to an argument file and its
 contents should be expanded into separate arguments for each line in the specified file.This property is `true` by default.

**Returns:**

whether "argument files" or `@files` should be expanded into their content

**Since:**

2.1

**See Also:**


[expandAtFiles](null.md)



---

### setExpandAtFiles

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setExpandAtFiles__(boolean expandAtFiles)</span>

Sets whether arguments starting with `'@'` should be treated as the path to an argument file and its
 contents should be expanded into separate arguments for each line in the specified file.(`true` by default.)

**Parameters:**

`expandAtFiles` - whether "argument files" or `@files` should be expanded into their content

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

2.1

**See Also:**


[expandAtFiles](null.md)



---

### getAtFileCommentChar

<span style="font-family: monospace; font-size: 80%;">public [Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html) __getAtFileCommentChar__()</span>

Returns the character that starts a single-line comment or `null` if all content of argument files should
 be interpreted as arguments (without comments).If specified, all characters from the comment character to the end of the line are ignored.

**Returns:**

the character that starts a single-line comment or `null`. The default is `'#'`.

**Since:**

3.5

**See Also:**


[atFileCommentChar](null.md)



---

### setAtFileCommentChar

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setAtFileCommentChar__([Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html) atFileCommentChar)</span>

Sets the character that starts a single-line comment or `null` if all content of argument files should
 be interpreted as arguments (without comments).If specified, all characters from the comment character to the end of the line are ignored.

**Parameters:**

`atFileCommentChar` - the character that starts a single-line comment or `null`. The default is `'#'`.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.5

**See Also:**


[atFileCommentChar](null.md)



---

### isUseSimplifiedAtFiles

<span style="font-family: monospace; font-size: 80%;">public boolean __isUseSimplifiedAtFiles__()</span>

Returns whether to use a simplified argument file format that is compatible with JCommander.In this format, every line (except empty lines and comment lines)
 is interpreted as a single argument. Arguments containing whitespace do not need to be quoted.
 When system property `"picocli.useSimplifiedAtFiles"` is defined, the system property value overrides the programmatically set value.

**Returns:**

whether to use a simplified argument file format. The default is `false`.

**Since:**

3.9

**See Also:**


[useSimplifiedAtFiles](null.md)



---

### setUseSimplifiedAtFiles

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setUseSimplifiedAtFiles__(boolean simplifiedAtFiles)</span>

Sets whether to use a simplified argument file format that is compatible with JCommander.In this format, every line (except empty lines and comment lines)
 is interpreted as a single argument. Arguments containing whitespace do not need to be quoted.
 When system property `"picocli.useSimplifiedAtFiles"` is defined, the system property value overrides the programmatically set value.

**Parameters:**

`simplifiedAtFiles` - whether to use a simplified argument file format. The default is `false`.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

3.9

**See Also:**


[useSimplifiedAtFiles](null.md)



---

### getNegatableOptionTransformer

<span style="font-family: monospace; font-size: 80%;">public [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) __getNegatableOptionTransformer__()</span>

Returns the `INegatableOptionTransformer` used to create the negative form of negatable options.By default this returns the result of RegexTransformer#createDefault().

**Returns:**

the `INegatableOptionTransformer` used to create negative option names.

**Since:**

4.0

**See Also:**


[negatable](null.md)


[negatableOptionTransformer](null.md)



---

### setNegatableOptionTransformer

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __setNegatableOptionTransformer__([INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) transformer)</span>

Sets the `INegatableOptionTransformer` used to create the negative form of negatable options.

The specified setting will be registered with this `CommandLine` and the full hierarchy of its
 subcommands and nested sub-subcommands at the moment this method is called. Subcommands added
 later will have the default setting. To ensure a setting is applied to all
 subcommands, call the setter last, after adding subcommands.
 Note that [CommandLine.setOptionsCaseInsensitive](#setoptionscaseinsensitive) will also change the case sensitivity of negatable options:
 any custom [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) that was previously installed will be replaced by the case-insensitive
 version of the default transformer. To ensure your custom transformer is used, install it last, after changing case sensitivity.

**Parameters:**

`transformer` - the `INegatableOptionTransformer` used to create negative option names.

**Returns:**

this `CommandLine` object, to allow method chaining

**Since:**

4.0

**See Also:**


[negatable](null.md)


[negatableOptionTransformer](null.md)



---

### defaultFactory

<span style="font-family: monospace; font-size: 80%;">public static [IFactory](CommandLine.IFactory.md) __defaultFactory__()</span>

Returns the default [IFactory](CommandLine.IFactory.md) implementation used if no factory was specified in the [CommandLine](CommandLine.md).

This implementation has special logic for instantiating `Collections`
 and `Maps`, and otherwise tries to create an instance by invoking the default constructor of the specified class.
 

Special logic for instantiating Collections and Maps:
 ` // if class is an interface that extends java.util.Collection, return a new instance of:
 1. List       -> ArrayList
 2. SortedSet  -> TreeSet
 3. Set        -> LinkedHashSet
 4. Queue      -> LinkedList
 5. Collection -> ArrayList

 // if extending or implementing java.util.Map:
 1. try invoking the default constructor; return this on success.
 2. if this fails, return a LinkedHashMap
 `

**Since:**

4.0


---

### tracer

<span style="font-family: monospace; font-size: 80%;">public static [Tracer](CommandLine.Tracer.md) __tracer__()</span>

Returns the `Tracer` used internally for printing internal debug statements.

**Returns:**

the `Tracer` used internally for printing internal debug statements

**Since:**

4.7.8-SNAPSHOT


---

