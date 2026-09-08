Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface Command
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Command<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(TYPE,LOCAL_VARIABLE,FIELD,PACKAGE,METHOD)<br/>
public static @interface __Command__</span>



Annotate your class with `@Command` when you want more control over the format of the generated help
message.From 3.6, methods can also be annotated with `@Command`, where the method parameters define the
command options and positional parameters.

Command(name              = "Encrypt", mixinStandardHelpOptions = true,
       description         = "Encrypt FILE(s), or standard input, to standard output or to the output file.",
       version             = "Encrypt version 1.0",
       footer              = "Copyright (c) 2017",
       exitCodeListHeading = "Exit Codes:%n",
       exitCodeList        = { " 0:Successful program execution.",
                               "64:Invalid input: an unknown option or invalid parameter was specified.",
                               "70:Execution exception: an exception occurred while executing the business logic."}
       )
public class Encrypt {
    Parameters(paramLabel = "FILE", description = "Any number of input files")
    private ListFile files = new ArrayListFile();

    Option(names = { "-o", "--out" }, description = "Output file (default: print to console)")
    private File outputFile;

    Option(names = { "-v", "--verbose"}, description = "Verbose mode. Helpful for troubleshooting. Multiple -v options increase the verbosity.")
    private boolean[] verbose;
}



The structure of a help message looks like this:

  [header]
  [synopsis]: `Usage: <commandName> [OPTIONS] [FILE...]`
  [description]
  [parameter list]: `     [FILE...]   Any number of input files`
  [option list]: `  -h, --help   prints this help message and exits`
  [exit code list]
  [footer]



## Method Summary

| Modifier and Type                                                                                                                                                                     | Method                                                                          | Description                                                                                                                                                                                                              |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [name](#name)()                                                                 | Program name to show in the synopsis.                                                                                                                                                                                    |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [aliases](#aliases)()                                                           | Alternative command names by which this subcommand is recognized on the command line.                                                                                                                                    |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[]                                                                       | [subcommands](#subcommands)()                                                   | A list of classes to instantiate and register as subcommands.                                                                                                                                                            |
| public abstract boolean                                                                                                                                                               | [subcommandsRepeatable](#subcommandsrepeatable)()                               | Returns whether the subcommands of this command are repeatable, that is, whether such subcommands can  occur multiple times and may be followed by sibling commands instead of only by child commands of the subcommand. |
| public abstract boolean                                                                                                                                                               | [addMethodSubcommands](#addmethodsubcommands)()                                 | Specify whether methods annotated with `@Command` should be registered as subcommands of their  enclosing `@Command` class.                                                                                              |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [separator](#separator)()                                                       | String that separates options from option parameters.                                                                                                                                                                    |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [version](#version)()                                                           | Version information for this command, to print to the console when the user specifies an  option to request version help.                                                                                                |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IVersionProvider](CommandLine.IVersionProvider.md)>             | [versionProvider](#versionprovider)()                                           | Class that can provide version information dynamically at runtime.                                                                                                                                                       |
| public abstract boolean                                                                                                                                                               | [mixinStandardHelpOptions](#mixinstandardhelpoptions)()                         | Adds the standard `-h` and `--help` usageHelp options and `-V` and `--version` versionHelp options to the options of this command.                                                                                       |
| public abstract boolean                                                                                                                                                               | [helpCommand](#helpcommand)()                                                   | Set this attribute to `true` if this subcommand is a help command, and required options and positional  parameters of the parent command should not be validated.                                                        |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [headerHeading](#headerheading)()                                               | Set the heading preceding the header section.                                                                                                                                                                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [header](#header)()                                                             | Optional summary description of the command, shown before the synopsis.                                                                                                                                                  |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [synopsisHeading](#synopsisheading)()                                           | Set the heading preceding the synopsis text.                                                                                                                                                                             |
| public abstract boolean                                                                                                                                                               | [abbreviateSynopsis](#abbreviatesynopsis)()                                     | Specify `true` to generate an abbreviated synopsis like `"<main> [OPTIONS] [PARAMETERS...] [COMMAND]"`.                                                                                                                  |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [customSynopsis](#customsynopsis)()                                             | Specify one or more custom synopsis lines to display instead of an auto-generated synopsis.                                                                                                                              |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [synopsisSubcommandLabel](#synopsissubcommandlabel)()                           | Specify the String to show in the synopsis for the subcommands of this command.                                                                                                                                          |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [descriptionHeading](#descriptionheading)()                                     | Set the heading preceding the description section.                                                                                                                                                                       |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [description](#description)()                                                   | Optional text to display between the synopsis line(s) and the list of options.                                                                                                                                           |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [parameterListHeading](#parameterlistheading)()                                 | Set the heading preceding the parameters list.                                                                                                                                                                           |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [optionListHeading](#optionlistheading)()                                       | Set the heading preceding the options list.                                                                                                                                                                              |
| public abstract boolean                                                                                                                                                               | [sortOptions](#sortoptions)()                                                   | Specify `false` to show Options in declaration order in the option list of the usage help message (or to sort options by their order index if set).                                                                      |
| public abstract boolean                                                                                                                                                               | [sortSynopsis](#sortsynopsis)()                                                 | Specify `false` to show options in declaration order in the synopsis of the usage help message (or to sort options by their order index if set).                                                                         |
| public abstract char                                                                                                                                                                  | [requiredOptionMarker](#requiredoptionmarker)()                                 | Prefix required options with this character in the options list.                                                                                                                                                         |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md)>   | [defaultValueProvider](#defaultvalueprovider)()                                 | Class that can provide default values dynamically at runtime.                                                                                                                                                            |
| public abstract boolean                                                                                                                                                               | [showDefaultValues](#showdefaultvalues)()                                       | Specify `true` to show default values in the description column of the options list (except for  boolean options).                                                                                                       |
| public abstract boolean                                                                                                                                                               | [showAtFileInUsageHelp](#showatfileinusagehelp)()                               | Specify `true` to show a `[@<filename>...]` entry  in the synopsis and parameter list of the usage help message.                                                                                                         |
| public abstract boolean                                                                                                                                                               | [showEndOfOptionsDelimiterInUsageHelp](#showendofoptionsdelimiterinusagehelp)() | Specify `true` to show a `[--]` "End of options" entry  in the synopsis and option list of the usage help message.                                                                                                       |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [commandListHeading](#commandlistheading)()                                     | Set the heading preceding the subcommands list.                                                                                                                                                                          |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [footerHeading](#footerheading)()                                               | Set the heading preceding the footer section.                                                                                                                                                                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [footer](#footer)()                                                             | Optional text to display after the list of options.                                                                                                                                                                      |
| public abstract boolean                                                                                                                                                               | [hidden](#hidden)()                                                             | Set `hidden=true` if this command should not be included in the list of commands in the usage help of the parent command.                                                                                                |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [resourceBundle](#resourcebundle)()                                             | Set the base name of the ResourceBundle to find option and positional parameters descriptions, as well as  usage help message sections and section headings.                                                             |
| public abstract int                                                                                                                                                                   | [usageHelpWidth](#usagehelpwidth)()                                             | Set the UsageMessageSpec#width(int).                                                                                                                                                                                     |
| public abstract boolean                                                                                                                                                               | [usageHelpAutoWidth](#usagehelpautowidth)()                                     | If `true`, picocli will attempt to detect the terminal width and adjust the usage help message accordingly.                                                                                                              |
| public abstract int                                                                                                                                                                   | [exitCodeOnSuccess](#exitcodeonsuccess)()                                       | Exit code for successful termination.                                                                                                                                                                                    |
| public abstract int                                                                                                                                                                   | [exitCodeOnUsageHelp](#exitcodeonusagehelp)()                                   | Exit code for successful termination after printing usage help on user request.                                                                                                                                          |
| public abstract int                                                                                                                                                                   | [exitCodeOnVersionHelp](#exitcodeonversionhelp)()                               | Exit code for successful termination after printing version help on user request.                                                                                                                                        |
| public abstract int                                                                                                                                                                   | [exitCodeOnInvalidInput](#exitcodeoninvalidinput)()                             | Exit code for command line usage error.                                                                                                                                                                                  |
| public abstract int                                                                                                                                                                   | [exitCodeOnExecutionException](#exitcodeonexecutionexception)()                 | Exit code signifying that an exception occurred when invoking the Runnable, Callable or Method user object of a command.                                                                                                 |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [exitCodeListHeading](#exitcodelistheading)()                                   | Set the heading preceding the exit codes section, may contain `"%n"` line separators.                                                                                                                                    |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [exitCodeList](#exitcodelist)()                                                 | Set the values to be displayed in the exit codes section as a list of `"key:value"` pairs:   keys are exit codes, values are descriptions.                                                                               |
| public abstract [ScopeType](CommandLine.ScopeType.md)                                                                                                                                 | [scope](#scope)()                                                               | Returns whether subcommands inherit their attributes from this parent command.                                                                                                                                           |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IModelTransformer](CommandLine.IModelTransformer.md)>           | [modelTransformer](#modeltransformer)()                                         | Returns the model transformer for this command.                                                                                                                                                                          |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)> | [preprocessor](#preprocessor)()                                                 | Returns the preprocessor for this command.                                                                                                                                                                               |



## Method Details

### name

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __name__()</span>

Program name to show in the synopsis.If omitted, `"<main class>"` is used.
 For [subcommands.subcommands](#subcommands) subcommands, this attribute is also used
 by the parser to recognize subcommands in the command line arguments.

**Returns:**

the program name to show in the synopsis

**See Also:**


[name](#name)


[commandName](null.md)



---

### aliases

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __aliases__()</span>

Alternative command names by which this subcommand is recognized on the command line.

**Returns:**

one or more alternative command names

**Since:**

3.1


---

### subcommands

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[] __subcommands__()</span>

A list of classes to instantiate and register as subcommands.When registering subcommands declaratively
 like this, you don't need to call the CommandLine#addSubcommand(String, Object) method. For example, this:
 
 Command(subcommands = {
         GitStatus.class,
         GitCommit.class,
         GitBranch.class })
 public class Git { ... }

 CommandLine commandLine = new CommandLine(new Git());
  is equivalent to this:
 
 // alternative: programmatically add subcommands.
 // NOTE: in this case there should be no `subcommands` attribute on the @Command annotation.
 Command public class Git { ... }

 CommandLine commandLine = new CommandLine(new Git())
         .addSubcommand("status",   new GitStatus())
         .addSubcommand("commit",   new GitCommit())
         .addSubcommand("branch",   new GitBranch());
 
 Applications may be interested in the following built-in commands in picocli
 that can be used as subcommands:
 
   [HelpCommand](CommandLine.HelpCommand.md) - a `help` subcommand that prints help on the following or preceding command
   AutoComplete.GenerateCompletion - a `generate-completion` subcommand that prints a Bash/ZSH completion script for its parent command, so that clients can install autocompletion in one line by running `source <(parent-command generate-completion)` in the shell
 

**Returns:**

the declaratively registered subcommands of this command, or an empty array if none

**Since:**

0.9.8

**See Also:**


[addSubcommand](null.md)


[HelpCommand](CommandLine.HelpCommand.md)



---

### subcommandsRepeatable

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __subcommandsRepeatable__()</span>

Returns whether the subcommands of this command are repeatable, that is, whether such subcommands can
 occur multiple times and may be followed by sibling commands instead of only by child commands of the subcommand.

**Since:**

4.2


---

### addMethodSubcommands

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __addMethodSubcommands__()</span>

Specify whether methods annotated with `@Command` should be registered as subcommands of their
 enclosing `@Command` class.The default is `true`. For example:
 
 Command
 public class Git {
     Command
     void status() { ... }
 }

 CommandLine git = new CommandLine(new Git());
  is equivalent to this:
 
 // don't add command methods as subcommands automatically
 Command(addMethodSubcommands = false)
 public class Git {
     Command
     void status() { ... }
 }

 // add command methods as subcommands programmatically
 CommandLine git = new CommandLine(new Git());
 CommandLine status = new CommandLine(CommandLine.getCommandMethods(Git.class, "status").get(0));
 git.addSubcommand("status", status);
 

**Returns:**

whether methods annotated with `@Command` should be registered as subcommands

**Since:**

3.6.0

**See Also:**


[addSubcommand](null.md)


[getCommandMethods](null.md)


[addMethodSubcommands](#addmethodsubcommands)



---

### separator

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __separator__()</span>

String that separates options from option parameters.Default is `"="`. Spaces are also accepted.

**Returns:**

the string that separates options from option parameters, used both when parsing and when generating usage help

**See Also:**


[setSeparator](null.md)



---

### version

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __version__()</span>

Version information for this command, to print to the console when the user specifies an
 option to request version help.Each element of the array is rendered on a separate line.
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.
 

This is not part of the usage help message.

**Returns:**

a string or an array of strings with version information about this command (each string in the array is displayed on a separate line).

**Since:**

0.9.8

**See Also:**


[printVersionHelp](null.md)



---

### versionProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IVersionProvider](CommandLine.IVersionProvider.md)> __versionProvider__()</span>

Class that can provide version information dynamically at runtime.An implementation may return version
 information obtained from the JAR manifest, a properties file or some other source.

**Returns:**

a Class that can provide version information dynamically at runtime

**Since:**

2.2


---

### mixinStandardHelpOptions

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __mixinStandardHelpOptions__()</span>

Adds the standard `-h` and `--help` usageHelp options and `-V`
and `--version` versionHelp options to the options of this command.


Note that if no [version.version](#version) or [versionProvider.versionProvider](#versionprovider) is specified, the `--version` option will not print anything.



For [resourceBundle.resourceBundle](#resourcebundle): the help option has `descriptionKey = "mixinStandardHelpOptions.help"`,
and the version option has `descriptionKey = "mixinStandardHelpOptions.version"`.


**Returns:**

whether the auto-help mixin should be added to this command

**Since:**

3.0


---

### helpCommand

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __helpCommand__()</span>

Set this attribute to `true` if this subcommand is a help command, and required options and positional
 parameters of the parent command should not be validated.If a subcommand marked as `helpCommand` is
 specified on the command line, picocli will not validate the parent arguments (so no "missing required
 option" errors) and the CommandLine#printHelpIfRequested(List, PrintStream, PrintStream, Help.Ansi) method will return `true`.

**Returns:**

`true` if this subcommand is a help command and picocli should not check for missing required
      options and positional parameters on the parent command

**Since:**

3.0


---

### headerHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __headerHeading__()</span>

Set the heading preceding the header section.

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

the heading preceding the header section

**See Also:**


[headerHeading](#headerheading)


[headerHeading](#headerheading)



---

### header

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __header__()</span>

Optional summary description of the command, shown before the synopsis.Each element of the array is rendered on a separate line.
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

summary description of the command

**See Also:**


[header](#header)


[header](#header)



---

### synopsisHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsisHeading__()</span>

Set the heading preceding the synopsis text.The default heading is `"Usage: "` (without a line break between the heading and the synopsis text).
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

the heading preceding the synopsis text

**See Also:**


[synopsisHeading](#synopsisheading)



---

### abbreviateSynopsis

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __abbreviateSynopsis__()</span>

Specify `true` to generate an abbreviated synopsis like `"<main> [OPTIONS] [PARAMETERS...] [COMMAND]"`.By default, a detailed synopsis with individual option names and parameters is generated.

**Returns:**

whether the synopsis should be abbreviated

**See Also:**


[abbreviatedSynopsis](null.md)


[detailedSynopsis](null.md)



---

### customSynopsis

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __customSynopsis__()</span>

Specify one or more custom synopsis lines to display instead of an auto-generated synopsis.Each element of the array is rendered on a separate line.
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

custom synopsis text to replace the auto-generated synopsis

**See Also:**


[customSynopsis](#customsynopsis)



---

### synopsisSubcommandLabel

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsisSubcommandLabel__()</span>

Specify the String to show in the synopsis for the subcommands of this command.The default is
`"[COMMAND]"`. Ignored if this command has no [subcommands.subcommands](#subcommands).

**Since:**

4.0


---

### descriptionHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __descriptionHeading__()</span>

Set the heading preceding the description section.

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

the heading preceding the description section

**See Also:**


[descriptionHeading](#descriptionheading)



---

### description

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __description__()</span>

Optional text to display between the synopsis line(s) and the list of options.Each element of the array is rendered on a separate line.
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

description of this command

**See Also:**


[description](#description)



---

### parameterListHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __parameterListHeading__()</span>

Set the heading preceding the parameters list.

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

the heading preceding the parameters list

**See Also:**


[parameterListHeading](#parameterlistheading)



---

### optionListHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionListHeading__()</span>

Set the heading preceding the options list.

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

the heading preceding the options list

**See Also:**


[optionListHeading](#optionlistheading)



---

### sortOptions

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __sortOptions__()</span>

Specify `false` to show Options in declaration order in the option list of the usage help message (or to sort options by their order index if set).Note that picocli cannot reliably detect declaration order in commands that have both `@Option`-annotated methods and `@Option`-annotated fields.
 The default (`true`) is to sort alphabetically.

**Returns:**

whether options should be shown in alphabetic order.


---

### sortSynopsis

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __sortSynopsis__()</span>

Specify `false` to show options in declaration order in the synopsis of the usage help message (or to sort options by their order index if set).Note that picocli cannot reliably detect declaration order in commands that have both `@Option`-annotated methods and `@Option`-annotated fields.
 The default (`true`) is to sort alphabetically.

**Returns:**

whether options in the synopsis should be shown in alphabetic order.

**Since:**

4.7.8-SNAPSHOT


---

### requiredOptionMarker

<span style="font-family: monospace; font-size: 80%;">public abstract char __requiredOptionMarker__()</span>

Prefix required options with this character in the options list.The default is no marker: the synopsis
 indicates which options and parameters are required.

**Returns:**

the character to show in the options list to mark required options


---

### defaultValueProvider

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md)> __defaultValueProvider__()</span>

Class that can provide default values dynamically at runtime.An implementation may return default
 value obtained from a configuration file like a properties file or some other source.
 


 Applications may be interested in the [PropertiesDefaultProvider](CommandLine.PropertiesDefaultProvider.md) built-in default provider
 that allows end users to maintain their own default values for options and positional parameters,
 which may override the defaults that are hard-coded in the application.
 

**Returns:**

a Class that can provide default values dynamically at runtime

**Since:**

3.6


---

### showDefaultValues

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __showDefaultValues__()</span>

Specify `true` to show default values in the description column of the options list (except for
 boolean options).False by default.
 

Note that picocli 3.2 allows [Option.description](#description) anywhere in the
 option or positional parameter description that ignores this setting.

**Returns:**

whether the default values for options and parameters should be shown in the description column


---

### showAtFileInUsageHelp

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __showAtFileInUsageHelp__()</span>

Specify `true` to show a `[@<filename>...]` entry
 in the synopsis and parameter list of the usage help message.(The entry is not shown if expanding parameter files is disabled.)

**Since:**

4.2


---

### showEndOfOptionsDelimiterInUsageHelp

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __showEndOfOptionsDelimiterInUsageHelp__()</span>

Specify `true` to show a `[--]` "End of options" entry
 in the synopsis and option list of the usage help message.

**Since:**

4.3


---

### commandListHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __commandListHeading__()</span>

Set the heading preceding the subcommands list.The default heading is `"Commands:%n"` (with a line break at the end).
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

the heading preceding the subcommands list

**See Also:**


[commandListHeading](#commandlistheading)



---

### footerHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __footerHeading__()</span>

Set the heading preceding the footer section.

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

the heading preceding the footer section

**See Also:**


[footerHeading](#footerheading)



---

### footer

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __footer__()</span>

Optional text to display after the list of options.Each element of the array is rendered on a separate line.
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.

**Returns:**

text to display after the list of options

**See Also:**


[footer](#footer)



---

### hidden

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hidden__()</span>

Set `hidden=true` if this command should not be included in the list of commands in the usage help of the parent command.

**Returns:**

whether this command should be excluded from the usage message

**Since:**

3.0


---

### resourceBundle

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __resourceBundle__()</span>

Set the base name of the ResourceBundle to find option and positional parameters descriptions, as well as
 usage help message sections and section headings.

See [Messages](CommandLine.Model.Messages.md) for more details and an example.

**Returns:**

the base name of the ResourceBundle for usage help strings

**Since:**

3.6

**See Also:**


[messages](null.md)


[messages](null.md)


[resourceBundle](#resourcebundle)


[setResourceBundle](null.md)



---

### usageHelpWidth

<span style="font-family: monospace; font-size: 80%;">public abstract int __usageHelpWidth__()</span>

Set the UsageMessageSpec#width(int).The default is 80.

**Since:**

3.7

**See Also:**


[width](null.md)



---

### usageHelpAutoWidth

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __usageHelpAutoWidth__()</span>

If `true`, picocli will attempt to detect the terminal width and adjust the usage help message accordingly.End users may enable this by setting system property `"picocli.usage.width"` to `AUTO`,
 and may disable this by setting this system property to a numeric value.
 This feature requires Java 7 or greater. The default is `false`

**Since:**

4.0

**See Also:**


[autoWidth](null.md)



---

### exitCodeOnSuccess

<span style="font-family: monospace; font-size: 80%;">public abstract int __exitCodeOnSuccess__()</span>

Exit code for successful termination. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnUsageHelp

<span style="font-family: monospace; font-size: 80%;">public abstract int __exitCodeOnUsageHelp__()</span>

Exit code for successful termination after printing usage help on user request. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnVersionHelp

<span style="font-family: monospace; font-size: 80%;">public abstract int __exitCodeOnVersionHelp__()</span>

Exit code for successful termination after printing version help on user request. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnInvalidInput

<span style="font-family: monospace; font-size: 80%;">public abstract int __exitCodeOnInvalidInput__()</span>

Exit code for command line usage error. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnExecutionException

<span style="font-family: monospace; font-size: 80%;">public abstract int __exitCodeOnExecutionException__()</span>

Exit code signifying that an exception occurred when invoking the Runnable, Callable or Method user object of a command. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeListHeading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __exitCodeListHeading__()</span>

Set the heading preceding the exit codes section, may contain `"%n"` line separators.`""` (empty string) by default.

**Since:**

4.0

**See Also:**


[exitCodeListHeading](#exitcodelistheading)



---

### exitCodeList

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __exitCodeList__()</span>

Set the values to be displayed in the exit codes section as a list of `"key:value"` pairs:
  keys are exit codes, values are descriptions.Descriptions may contain `"%n"` line separators.
 

For example:
 
 Command(exitCodeListHeading = "Exit Codes:%n",
          exitCodeList = { " 0:Successful program execution.",
                           "64:Invalid input: an unknown option or invalid parameter was specified.",
                           "70:Execution exception: an exception occurred while executing the business logic."})
 

**Since:**

4.0


---

### scope

<span style="font-family: monospace; font-size: 80%;">public abstract [ScopeType](CommandLine.ScopeType.md) __scope__()</span>

Returns whether subcommands inherit their attributes from this parent command.

**Since:**

4.6


---

### modelTransformer

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IModelTransformer](CommandLine.IModelTransformer.md)> __modelTransformer__()</span>

Returns the model transformer for this command.

**Since:**

4.6


---

### preprocessor

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)> __preprocessor__()</span>

Returns the preprocessor for this command.

**Since:**

4.6

**See Also:**


[IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)



---

