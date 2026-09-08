Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface Option
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Option<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD,METHOD,PARAMETER)<br/>
public static @interface __Option__</span>




Annotate fields in your class with `@Option` and picocli will initialize these fields when matching
arguments are specified on the command line.In the case of command methods (annotated with `@Command`),
command options can be defined by annotating method parameters with `@Option`.



Command class example:


import static picocli.CommandLine.*;

public class MyClass {
    Parameters(description = "Any number of input files")
    private ListFile files = new ArrayListFile();

    Option(names = { "-o", "--out" }, description = "Output file (default: print to console)")
    private File outputFile;

    Option(names = { "-v", "--verbose"}, description = "Verbose mode. Helpful for troubleshooting. Multiple -v options increase the verbosity.")
    private boolean[] verbose;

    Option(names = { "-h", "--help", "-?", "-help"}, usageHelp = true, description = "Display this help and exit")
    private boolean help;
}




A field cannot be annotated with both `@Parameters` and `@Option` or a
`ParameterException` is thrown.



## Field Summary

| Modifier and Type          | Field                     | Description                                                                       |
|----------------------------|---------------------------|-----------------------------------------------------------------------------------|
| public static final String | [NULL_VALUE](#null_value) | Special value that can be used in some annotation attributes to designate `null`. |



## Method Summary

| Modifier and Type                                                                                                                                                                     | Method                                          | Description                                                                                                                                                                                             |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [names](#names)()                               | One or more option names.                                                                                                                                                                               |
| public abstract boolean                                                                                                                                                               | [required](#required)()                         | Indicates whether this option is required.                                                                                                                                                              |
| public abstract boolean                                                                                                                                                               | [help](#help)()                                 |   This should rarely be used: the recommended attributes are [usageHelp.usageHelp](#usagehelp) and [versionHelp.versionHelp](#versionhelp).                                                             |
| public abstract boolean                                                                                                                                                               | [usageHelp](#usagehelp)()                       | Set `usageHelp=true` for the `--help` option that triggers display of the usage help message.                                                                                                           |
| public abstract boolean                                                                                                                                                               | [versionHelp](#versionhelp)()                   | Set `versionHelp=true` for the `--version` option that triggers display of the version information.                                                                                                     |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [description](#description)()                   | Description of this option, used when generating the usage documentation.                                                                                                                               |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [arity](#arity)()                               | Specifies the minimum number of required parameters and the maximum number of accepted parameters.                                                                                                      |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [paramLabel](#paramlabel)()                     | Specify a `paramLabel` for the option parameter to be used in the usage help message.                                                                                                                   |
| public abstract boolean                                                                                                                                                               | [hideParamSyntax](#hideparamsyntax)()           | Returns whether usage syntax decorations around the [paramLabel.paramLabel](#paramlabel) should be suppressed.                                                                                          |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[]                                                                       | [type](#type)()                                 |     Optionally specify a `type` to control exactly what Class the option parameter should be converted  to.                                                                                             |
| public abstract java.lang.Class<? extends io.github.qishr.cascara.common.util.CommandLine.ITypeConverter<?>                                                                           | [converter](#converter)()                       | Optionally specify one or more [ITypeConverter](CommandLine.ITypeConverter.md) classes to use to convert the command line argument into a strongly typed value (or key-value pair for map fields).      |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [split](#split)()                               | Specify a regular expression to use to split option parameter values before applying them to the field.                                                                                                 |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [splitSynopsisLabel](#splitsynopsislabel)()     | Specify the string to display for the [split.split](#split) regular expression in the usage help synopsis.                                                                                              |
| public abstract boolean                                                                                                                                                               | [hidden](#hidden)()                             | Set `hidden=true` if this option should not be included in the usage help message.                                                                                                                      |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [defaultValue](#defaultvalue)()                 | Returns the default value of this option, before splitting and type conversion.                                                                                                                         |
| public abstract [Visibility](CommandLine.Help.Visibility.md)                                                                                                                          | [showDefaultValue](#showdefaultvalue)()         | Use this attribute to control for a specific option whether its default value should be shown in the usage  help message.                                                                               |
| public abstract java.lang.Class<? extends java.lang.Iterable<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                            | [completionCandidates](#completioncandidates)() | Use this attribute to specify an `Iterable<String>` class that generates completion candidates for this option.                                                                                         |
| public abstract boolean                                                                                                                                                               | [interactive](#interactive)()                   | Set `interactive=true` to make this option prompt the end user for a value (like a password).                                                                                                           |
| public abstract boolean                                                                                                                                                               | [echo](#echo)()                                 | Use this attribute to control whether user input for an interactive option is echoed to the console or not.                                                                                             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [prompt](#prompt)()                             | Use this attribute to customize the text displayed to the end user for an interactive option when asking for user input.                                                                                |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [descriptionKey](#descriptionkey)()             | ResourceBundle key for this option.                                                                                                                                                                     |
| public abstract int                                                                                                                                                                   | [order](#order)()                               | When Command#sortOptions() is specified, this attribute can be used to control the order in which options are listed in the usage help message.                                                         |
| public abstract boolean                                                                                                                                                               | [negatable](#negatable)()                       | (Only for boolean options): set this to automatically add a negative version for this boolean option.                                                                                                   |
| public abstract [ScopeType](CommandLine.ScopeType.md)                                                                                                                                 | [scope](#scope)()                               | Determines on which command(s) this option exists: on this command only (the default), or  whether this is a "global" option that is applied to this command and all subcommands, sub-subcommands, etc. |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [fallbackValue](#fallbackvalue)()               | For options with an optional parameter (for example, `arity = "0..1"`), this value is assigned to the annotated element if the option is specified on the command line without an option parameter.     |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [mapFallbackValue](#mapfallbackvalue)()         | For options of type Map, setting the `mapFallbackValue` to any value allows end user  to specify key-only parameters for this option.                                                                   |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterConsumer](CommandLine.IParameterConsumer.md)>         | [parameterConsumer](#parameterconsumer)()       | Optionally specify a custom `IParameterConsumer` to temporarily suspend picocli's parsing logic and process one or more command line arguments in a custom manner.                                      |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)> | [preprocessor](#preprocessor)()                 | Returns the preprocessor for this option.                                                                                                                                                               |



## Field Details

### NULL_VALUE

<span style="font-family: monospace; font-size: 80%;">public static final String __NULL_VALUE__</span>

Special value that can be used in some annotation attributes to designate `null`.


---


## Method Details

### names

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __names__()</span>

One or more option names.At least one option name is required.



Different environments have different conventions for naming options, but usually options have a prefix
that sets them apart from parameters.
Picocli supports all of the below styles. The default separator is `'='`, but this can be configured.



*nix



In Unix and Linux, options have a short (single-character) name, a long name or both.
Short options
(POSIX
style are single-character and are preceded by the `'-'` character, e.g., ``-v'`.
GNU-style long
(or mnemonic) options start with two dashes in a row, e.g., ``--file'`.


Picocli supports the POSIX convention that short options can be grouped, with the last option
optionally taking a parameter, which may be attached to the option name or separated by a space or
a `'='` character. The below examples are all equivalent:

-xvfFILE
-xvf FILE
-xvf=FILE
-xv --file FILE
-xv --file=FILE
-x -v --file FILE
-x -v --file=FILE



DOS



DOS options mostly have upper case single-character names and start with a single slash `'/'` character.
Option parameters are separated by a `':'` character. Options cannot be grouped together but
must be specified separately. For example:

DIR /S /A:D /T:C



PowerShell



Windows PowerShell options generally are a word preceded by a single `'-'` character, e.g., ``-Help'`.
Option parameters are separated by a space or by a `':'` character.


**Returns:**

one or more option names


---

### required

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __required__()</span>

Indicates whether this option is required.By default this is false.


If an option is required, but a user invokes the program without specifying the required option,
a [MissingParameterException](CommandLine.MissingParameterException.md) is thrown from the #parse(String...) method.


Required options that are part of a [ArgGroup](CommandLine.ArgGroup.md) are required within the group, not required within the command:
the group's multiplicity determines whether the group itself is required or optional.

**Returns:**

whether this option is required


---

### help

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __help__()</span>



This should rarely be used: the recommended attributes are [usageHelp.usageHelp](#usagehelp) and [versionHelp.versionHelp](#versionhelp).


Only set `help=true` when this option should disable validation of the remaining
arguments, and no error message should be generated for missing required options.



This is useful for custom help options that are in addition to the standard help and
version options. For example if your application has many hidden options or
subcommands, and there is a custom help option like `--detailed-help` that prints
the usage help message for these hidden options and subcommands.



Note:



Use the [usageHelp.usageHelp](#usagehelp) for "normal" help options (like `-h` and `--help` on unix,
`-?` and `-Help` on Windows)
and use [versionHelp.versionHelp](#versionhelp) for "normal" version help (`-V` and `--version` on unix,
`-Version` on Windows):
picocli has built-in logic so that options with `usageHelp=true` or `versionHelp=true`
will automatically cause the requested help message to be printed in applications
that use the #execute(String...) method, without any code in the application.



Note that there is no such automatic help printing for options with `help=true`;
applications need to check whether the end user specified this option and take appropriate action
in the business logic of the application.


**Returns:**

whether this option disables validation of the other arguments


---

### usageHelp

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __usageHelp__()</span>

Set `usageHelp=true` for the `--help` option that triggers display of the usage help message.The convenience methods `Commandline.call`,
`Commandline.run`, and `Commandline.parseWithHandler(s)` will automatically print usage help
when an option with `usageHelp=true` was specified on the command line.



By default, all options and positional parameters are included in the usage help message
except when explicitly marked [hidden.hidden](#hidden).



If this option is specified on the command line, picocli will not validate the remaining arguments (so no "missing required
option" errors) and the CommandLine#isUsageHelpRequested() method will return `true`.



Alternatively, consider annotating your command with @Command(mixinStandardHelpOptions = true).


**Returns:**

whether this option allows the user to request usage help

**Since:**

0.9.8

**See Also:**


[hidden](#hidden)


[run](null.md)


[call](null.md)


[parseWithHandler](null.md)


[printHelpIfRequested](null.md)



---

### versionHelp

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __versionHelp__()</span>

Set `versionHelp=true` for the `--version` option that triggers display of the version information.The convenience methods `Commandline.call`,
`Commandline.run`, and `Commandline.parseWithHandler(s)` will automatically print version information
when an option with `versionHelp=true` was specified on the command line.



The version information string is obtained from the command's version annotation
or from the version provider.



If this option is specified on the command line, picocli will not validate the remaining arguments (so no "missing required
option" errors) and the CommandLine#isUsageHelpRequested() method will return `true`.



Alternatively, consider annotating your command with @Command(mixinStandardHelpOptions = true).


**Returns:**

whether this option allows the user to request version information

**Since:**

0.9.8

**See Also:**


[hidden](#hidden)


[run](null.md)


[call](null.md)


[parseWithHandler](null.md)


[printHelpIfRequested](null.md)



---

### description

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __description__()</span>

Description of this option, used when generating the usage documentation.Each element of the array is rendered on a separate line.


May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.



The description may contain variables that are rendered when help is requested.
The string `${DEFAULT-VALUE}` is replaced with the default value of the option. This is regardless of
the command's Command#showDefaultValues() setting or the option's [showDefaultValue.showDefaultValue](#showdefaultvalue) setting.
The string `${COMPLETION-CANDIDATES}` is replaced with the completion candidates generated by
[completionCandidates.completionCandidates](#completioncandidates) in the description for this option.
Also, embedded `%n` newline markers are converted to actual newlines.


**Returns:**

the description of this option


---

### arity

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __arity__()</span>

Specifies the minimum number of required parameters and the maximum number of accepted parameters.If an option declares a positive arity, and the user specifies an insufficient number of parameters on the
command line, a [MissingParameterException](CommandLine.MissingParameterException.md) is thrown by the #parse(String...) method.



In many cases picocli can deduce the number of required parameters from the field's type.
By default, flags (boolean options) have arity "0..1",
and single-valued type fields (String, int, Integer, double, Double, File, Date, etc) have arity one.
Generally, fields with types that cannot hold multiple values can omit the `arity` attribute.



Fields used to capture options with arity two or higher should have a type that can hold multiple values,
like arrays or Collections. See [type.type](#type) for strongly-typed Collection fields.



For example, if an option has 2 required parameters and any number of optional parameters,
specify `@Option(names = "-example", arity = "2..*")`.

A note on boolean options



By default picocli allows boolean options (also called "flags" or "switches") to have an optional parameter,
which must be either "true" or "false" (lowercase, other values are rejected).
You can make a boolean option take a required parameter by annotating your field with `arity="1"`.
For example: 
Option(names = "-v", arity = "1") boolean verbose;



Because this boolean field is defined with arity 1, the user must specify either `<program> -v false`
or `<program> -v true`
on the command line, or a [MissingParameterException](CommandLine.MissingParameterException.md) is thrown by the #parse(String...)
method.



To remove the optional parameter, define the field with `arity = "0"`.
For example: 
Option(names="-v", arity="0") boolean verbose;


This will reject any of the below:

-v true
-v false


**Returns:**

how many arguments this option requires


---

### paramLabel

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __paramLabel__()</span>

Specify a `paramLabel` for the option parameter to be used in the usage help message.If omitted,
picocli uses the field name in fish brackets (`'<'` and `'>'`) by default. Example:
class Example {
    Option(names = {"-o", "--output"}, paramLabel="FILE", description="path of the output file")
    private File out;
    Option(names = {"-j", "--jobs"}, arity="0..1", description="Allow N jobs at once; infinite jobs with no arg.")
    private int maxJobs = -1;
}


By default, the above gives a usage help message like the following:
Usage: main class [OPTIONS]
-o, --output FILE       path of the output file
-j, --jobs [maxJobs]  Allow N jobs at once; infinite jobs with no arg.


**Returns:**

name of the option parameter used in the usage help message


---

### hideParamSyntax

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hideParamSyntax__()</span>

Returns whether usage syntax decorations around the [paramLabel.paramLabel](#paramlabel) should be suppressed.The default is `false`: by default, the paramLabel is surrounded with `'['` and `']'` characters
 if the value is optional and followed by ellipses ("...") when multiple values can be specified, and the parameter
 label is repeated for each parameter for multi-arity options.
 May be set to `true` if full control over the formating is desired, such as different labels for each parameter.

**Since:**

3.6.0


---

### type

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[] __type__()</span>




 Optionally specify a `type` to control exactly what Class the option parameter should be converted
 to.This may be useful when the field type is an interface or an abstract class. For example, a field can
 be declared to have type `java.lang.Number`, and annotating `@Option(type=Short.class)`
 ensures that the option parameter value is converted to a `Short` before setting the field value.
 


 For array fields whose component type is an interface or abstract class, specify the concrete component type.
 For example, a field with type `Number[]` may be annotated with `@Option(type=Short.class)`
 to ensure that option parameter values are converted to `Short` before adding an element to the array.
 


 Picocli will use the [ITypeConverter](CommandLine.ITypeConverter.md) that is
 registered for the specified type to convert
 the raw String values before modifying the field value.
 


 Prior to 2.0, the `type` attribute was necessary for `Collection` and `Map` fields,
 but starting from 2.0 picocli will infer the component type from the generic type's type arguments.
 For example, for a field of type `Map<TimeUnit, Long>` picocli will know the option parameter
 should be split up in key=value pairs, where the key should be converted to a `java.util.concurrent.TimeUnit`
 enum value, and the value should be converted to a `Long`. No `@Option(type=...)` type attribute
 is required for this. For generic types with wildcards, picocli will take the specified upper or lower bound
 as the Class to convert to, unless the `@Option` annotation specifies an explicit `type` attribute.
 


 If the field type is a raw collection or a raw map, and you want it to contain other values than Strings,
 or if the generic type's type arguments are interfaces or abstract classes, you may
 specify a `type` attribute to control the Class that the option parameter should be converted to.

**Returns:**

the type(s) to convert the raw String values


---

### converter

<span style="font-family: monospace; font-size: 80%;">public abstract java.lang.Class<? extends io.github.qishr.cascara.common.util.CommandLine.ITypeConverter<?> __converter__()</span>

Optionally specify one or more [ITypeConverter](CommandLine.ITypeConverter.md) classes to use to convert the command line argument into
a strongly typed value (or key-value pair for map fields).This is useful when a particular field should
use a custom conversion that is different from the normal conversion for the field's type.


For example, for a specific field you may want to use a converter that maps the constant names defined
in java.sql.Types to the `int` value of these constants, but any other `int` fields should
not be affected by this and should continue to use the standard int converter that parses numeric values.

**Returns:**

the type converter(s) to use to convert String values to strongly typed values for this field

**See Also:**


[registerConverter](null.md)



---

### split

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __split__()</span>

Specify a regular expression to use to split option parameter values before applying them to the field.All elements resulting from the split are added to the array or Collection. Previously ignored for single-value fields,
from picocli 4.0 a `split` regex can only be specified on multi-value options and positional parameters.

**Returns:**

a regular expression to split option parameter values or `""` if the value should not be split

**See Also:**


[split](#split)



---

### splitSynopsisLabel

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __splitSynopsisLabel__()</span>

Specify the string to display for the [split.split](#split) regular expression in the usage help synopsis.

**Since:**

4.3


---

### hidden

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hidden__()</span>

Set `hidden=true` if this option should not be included in the usage help message.

**Returns:**

whether this option should be excluded from the usage documentation


---

### defaultValue

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __defaultValue__()</span>

Returns the default value of this option, before splitting and type conversion.

To get a `null` default value, omit specifying a default value or use the special value Option#NULL_VALUE -
 for options of type `Optional<T>` that will result in the `Optional.empty()`
 value being assigned when the option is not specified on the command line.

**Returns:**

a String that (after type conversion) will be used as the value for this option if the option was not specified on the command line

**Since:**

3.2

**See Also:**


[fallbackValue](#fallbackvalue)



---

### showDefaultValue

<span style="font-family: monospace; font-size: 80%;">public abstract [Visibility](CommandLine.Help.Visibility.md) __showDefaultValue__()</span>

Use this attribute to control for a specific option whether its default value should be shown in the usage
 help message.If not specified, the default value is only shown when the Command#showDefaultValues()
 is set `true` on the command. Use this attribute to specify whether the default value
 for this specific option should always be shown or never be shown, regardless of the command setting.
 

Note that picocli 3.2 allows [description.description](#description) by specifying the variable
 `${DEFAULT-VALUE}` anywhere in the description that ignores this setting.

**Returns:**

whether this option's default value should be shown in the usage help message


---

### completionCandidates

<span style="font-family: monospace; font-size: 80%;">public abstract java.lang.Class<? extends java.lang.Iterable<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __completionCandidates__()</span>

Use this attribute to specify an `Iterable<String>` class that generates completion candidates for this option.For map fields, completion candidates should be in `key=value` form.
 


 Completion candidates are used in bash completion scripts generated by the `picocli.AutoComplete` class.
 Bash has special completion options to generate file names and host names, and the bash completion scripts
 generated by `AutoComplete` delegate to these bash built-ins for `@Options` whose `type` is
 `java.io.File`, `java.nio.file.Path` or `java.net.InetAddress`.
 


 For `@Options` whose `type` is a Java `enum`, `AutoComplete` can generate completion
 candidates from the type. For other types, use this attribute to specify completion candidates.
 

**Returns:**

a class whose instances can iterate over the completion candidates for this option

**Since:**

3.2

**See Also:**


[IFactory](null.md)



---

### interactive

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __interactive__()</span>

Set `interactive=true` to make this option prompt the end user for a value (like a password).Only supported for single-value options and `char[]` arrays (no collections, maps or other array types).
When running on Java 6 or greater and [Option.echo](#echo) (the default),
this will use the Console#readPassword() API to get a value without echoing input to the console,
otherwise it will simply read a value from `System.in`.



For passwords, best security practice is to use type `char[]` instead of `String`, and to to null out the array after use.



When defined with `arity = "0..1"`, the option can also take a value from the command line.
(The user will still be prompted if no option parameter was specified on the command line.)
This is useful for commands that need to be run interactively as well as in batch mode.


**Returns:**

whether this option prompts the end user for a value to be entered on the command line

**Since:**

3.5


---

### echo

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __echo__()</span>

Use this attribute to control whether user input for an interactive option is echoed to the console or not.If `echo = true`, the user input is echoed to the console.
 This attribute is ignored when `interactive = false` (the default).

**Returns:**

whether the user input for an interactive option should be echoed to the console or not

**Since:**

4.6

**See Also:**


[echo](#echo)



---

### prompt

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __prompt__()</span>

Use this attribute to customize the text displayed to the end user for an interactive option when asking for user input.When omitted, the displayed text is derived from the option name and the first description line.
 This attribute is ignored when `interactive = false` (the default).

**Returns:**

the text to display to the end user for an interactive option when asking for user input

**Since:**

4.6

**See Also:**


[prompt](#prompt)



---

### descriptionKey

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __descriptionKey__()</span>

ResourceBundle key for this option.If not specified, (and a ResourceBundle exists for this command) an attempt
 is made to find the option description using any of the option names (without leading hyphens) as key.

**Since:**

3.6

**See Also:**


[description](#description)



---

### order

<span style="font-family: monospace; font-size: 80%;">public abstract int __order__()</span>

When Command#sortOptions() is specified, this attribute can be used to control the order in which options are listed in the usage help message.When Command#sortSynopsis() is specified, this attribute controls the order in which options appear in the synopsis of the usage help message.

**Returns:**

the position in the options list at which this option should be shown. Options with a lower number are shown before options with a higher number. Gaps are allowed.

**Since:**

3.9


---

### negatable

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __negatable__()</span>

(Only for boolean options): set this to automatically add a negative version for this boolean option.For example, for a `--force` option the negative version would be `--no-force`,
 and for a `-XX:+PrintGCDetails` option, the negative version would be `-XX:-PrintGCDetails`.
 The synopsis would show `--[no-]force` and `-XX:(+|-)PrintGCDetails`, respectively.
 

The form of the negative name can be customized by modifying the regular expressions
 used by default, or by replacing the default
 [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) with a custom implementation entirely.
 

Negative option names used to parse the command line are collected when the command is constructed
 (so any variables in the option names will be resolved at that time).
 Documentation strings for negatable options are generated on demand when the usage help message is shown.

**Since:**

4.0

**See Also:**


[getNegatableOptionTransformer](null.md)


[setNegatableOptionTransformer](null.md)



---

### scope

<span style="font-family: monospace; font-size: 80%;">public abstract [ScopeType](CommandLine.ScopeType.md) __scope__()</span>

Determines on which command(s) this option exists: on this command only (the default), or
 whether this is a "global" option that is applied to this command and all subcommands, sub-subcommands, etc.

**Since:**

4.3


---

### fallbackValue

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __fallbackValue__()</span>

For options with an optional parameter (for example, `arity = "0..1"`), this value is assigned to the annotated element
if the option is specified on the command line without an option parameter.


This is different from the [defaultValue.defaultValue](#defaultvalue), which is assigned if the option is not specified at all on the command line.



Using a `fallbackValue` allows applications to distinguish between

  option was not specified on the command line (default value assigned)
  option was specified without parameter on the command line (fallback value assigned)
  option was specified with parameter on the command line (command line argument value assigned)



This is useful to define options that can function as a boolean "switch"
and optionally allow users to provide a (strongly typed) extra parameter value.



Use the special value Option#NULL_VALUE to specify `null` -
for options of type `Optional<T>` that will result in the `Optional.empty()`
value being assigned when the option name is specified without a parameter on the command line.

**Since:**

4.0

**See Also:**


[fallbackValue](#fallbackvalue)



---

### mapFallbackValue

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __mapFallbackValue__()</span>

For options of type Map, setting the `mapFallbackValue` to any value allows end user
 to specify key-only parameters for this option.For example, `-Dkey` instead of `-Dkey=value`.
 

The value specified in this annotation is the value that is put into the Map for the user-specified key.
 Use the special value Option#NULL_VALUE to specify `null` -
 for maps of type `Map<K, Optional<V>>` that will result in `Optional.empty()`
 values in the map when only the key is specified.
 

If no `mapFallbackValue` is set, key-only Map parameters like `-Dkey`
 are considered invalid user input and cause a [ParameterException](CommandLine.ParameterException.md) to be thrown.

**Since:**

4.6

**See Also:**


[mapFallbackValue](#mapfallbackvalue)



---

### parameterConsumer

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterConsumer](CommandLine.IParameterConsumer.md)> __parameterConsumer__()</span>

Optionally specify a custom `IParameterConsumer` to temporarily suspend picocli's parsing logic
and process one or more command line arguments in a custom manner.This may be useful when passing arguments through to another program.

**Since:**

4.0


---

### preprocessor

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)> __preprocessor__()</span>

Returns the preprocessor for this option.

**Since:**

4.6

**See Also:**


[IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)



---

