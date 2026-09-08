Package [io.github.qishr.cascara.common.util](index.md)

# Class ParseResult
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ParseResult<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __ParseResult__</span>

Encapsulates the result of parsing an array of command line arguments.


## Nested Class Summary

| Modifier and Type | Class                                                                                                                             | Description                                                                                             |
|-------------------|-----------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.ParseResult.Builder](CommandLine.ParseResult.Builder.md)                         | Builds immutable `ParseResult` instances.                                                               |
| public static     | [io.github.qishr.cascara.common.util.CommandLine.ParseResult.GroupMatch](CommandLine.ParseResult.GroupMatch.md)                   | A group's multiplicity specifies how many matches of a group may  appear on the command line.           |
| public static     | [io.github.qishr.cascara.common.util.CommandLine.ParseResult.GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md) | Provides information about an [ArgGroup](CommandLine.ArgGroup.md) that was matched on the command line. |



## Method Summary

| Modifier and Type                                                                                                                                                                                   | Method                                                                                                                                                       | Description                                                                                                                                                                                                                               |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [Builder](CommandLine.ParseResult.Builder.md)                                                                                                                                         | [builder](#builder)([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec)                                                                             | Creates and returns a new `ParseResult.Builder` for the specified command spec.                                                                                                                                                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md)>                              | [findMatches](#findmatches)([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)                                                                         | Returns the matches for the specified argument group.                                                                                                                                                                                     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GroupMatch](CommandLine.ParseResult.GroupMatch.md)>                                                | [getGroupMatches](#getgroupmatches)()                                                                                                                        | Returns the top-level container for the [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) match or matches found.                                                                                                                         |
| public [OptionSpec](CommandLine.Model.OptionSpec.md)                                                                                                                                                | [matchedOption](#matchedoption)(char shortName)                                                                                                              | Returns the option with the specified short name, or `null` if no option with that name was matched  on the command line.                                                                                                                 |
| public [OptionSpec](CommandLine.Model.OptionSpec.md)                                                                                                                                                | [matchedOption](#matchedoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                           | Returns the option with the specified name, or `null` if no option with that name was matched on the command line.                                                                                                                        |
| public [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)                                                                                                                              | [matchedPositional](#matchedpositional)(int position)                                                                                                        | Returns the first `PositionalParamSpec` that matched an argument at the specified position, or `null` if no positional parameters were matched at that position.                                                                          |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)>                                    | [matchedPositionals](#matchedpositionals)(int position)                                                                                                      | Returns all `PositionalParamSpec` objects that matched an argument at the specified position, or an empty list if no positional parameters were matched at that position.                                                                 |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                              | [commandSpec](#commandspec)()                                                                                                                                | Returns the `CommandSpec` for the matched command.                                                                                                                                                                                        |
| public boolean                                                                                                                                                                                      | [hasMatchedOption](#hasmatchedoption)(char shortName)                                                                                                        | Returns whether an option whose aliases include the specified short name was matched on the command line.                                                                                                                                 |
| public boolean                                                                                                                                                                                      | [hasMatchedOption](#hasmatchedoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                     | Returns whether an option whose aliases include the specified name was matched on the command line.                                                                                                                                       |
| public boolean                                                                                                                                                                                      | [hasMatchedOption](#hasmatchedoption)([OptionSpec](CommandLine.Model.OptionSpec.md) option)                                                                  | Returns whether the specified option was matched on the command line.                                                                                                                                                                     |
| public boolean                                                                                                                                                                                      | [hasMatchedPositional](#hasmatchedpositional)(int position)                                                                                                  | Returns whether a positional parameter was matched at the specified position.                                                                                                                                                             |
| public boolean                                                                                                                                                                                      | [hasMatchedPositional](#hasmatchedpositional)([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) positional)                                    | Returns whether the specified positional parameter was matched on the command line.                                                                                                                                                       |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                                                        | [matchedOptionsSet](#matchedoptionsset)()                                                                                                                    | Returns a set of matched options.                                                                                                                                                                                                         |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                                                      | [matchedOptions](#matchedoptions)()                                                                                                                          | Returns a list of matched options, in order they were matched on the command line.                                                                                                                                                        |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)>                                      | [matchedPositionalsSet](#matchedpositionalsset)()                                                                                                            | Returns a set of matched positional parameters.                                                                                                                                                                                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)>                                    | [matchedPositionals](#matchedpositionals)()                                                                                                                  | Returns a list of matched positional parameters, in order they were matched on the command line.                                                                                                                                          |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)>                                                            | [matchedArgs](#matchedargs)()                                                                                                                                | Returns a list of matched options and positional parameters, in order they were matched on the command line.                                                                                                                              |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>       | [unmatched](#unmatched)()                                                                                                                                    | Returns a list of command line arguments that did not match any options or positional parameters.                                                                                                                                         |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>       | [originalArgs](#originalargs)()                                                                                                                              | Returns the original command line arguments that were passed to the CommandLine#parseArgs(String...) method, before @-file expansion.                                                                                                     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>       | [expandedArgs](#expandedargs)()                                                                                                                              | Returns the command line arguments after @-files were expanded;  these are the arguments that were actually parsed.                                                                                                                       |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)> | [errors](#errors)()                                                                                                                                          | If ParserSpec#collectErrors is `true`, returns the list of exceptions that were encountered during parsing, otherwise, returns an empty list.                                                                                             |
| public T                                                                                                                                                                                            | [matchedOptionValue](#matchedoptionvalue)(char shortName, T defaultValue)                                                                                    | Returns the command line argument value of the option with the specified name, converted to the type of the option, or the specified default value if no option with the specified name was matched.                                      |
| public T                                                                                                                                                                                            | [matchedOptionValue](#matchedoptionvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, T defaultValue) | Returns the command line argument value of the option with the specified name, converted to the type of the option, or the specified default value if no option with the specified name was matched.                                      |
| public T                                                                                                                                                                                            | [matchedPositionalValue](#matchedpositionalvalue)(int position, T defaultValue)                                                                              | Returns the command line argument value of the positional parameter at the specified position, converted to the type of the positional parameter, or the specified default value if no positional parameter was matched at that position. |
| public boolean                                                                                                                                                                                      | [hasSubcommand](#hassubcommand)()                                                                                                                            | Returns `true` if a subcommand was matched on the command line, `false` otherwise.                                                                                                                                                        |
| public [ParseResult](CommandLine.ParseResult.md)                                                                                                                                                    | [subcommand](#subcommand)()                                                                                                                                  | Returns the `ParseResult` for the last subcommand of this command that was matched on the command line, or `null` if no subcommand was matched.                                                                                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ParseResult](CommandLine.ParseResult.md)>                                                          | [subcommands](#subcommands)()                                                                                                                                | Returns a list with the `ParseResult` objects for each subcommand of this command  that was matched on the command line or an empty list if no subcommands were matched.                                                                  |
| public boolean                                                                                                                                                                                      | [isUsageHelpRequested](#isusagehelprequested)()                                                                                                              | Returns `true` if one of the options that was matched on the command line is a OptionSpec#usageHelp() option.                                                                                                                             |
| public boolean                                                                                                                                                                                      | [isVersionHelpRequested](#isversionhelprequested)()                                                                                                          | Returns `true` if one of the options that was matched on the command line is a OptionSpec#versionHelp() option.                                                                                                                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)>                                                                      | [asCommandLineList](#ascommandlinelist)()                                                                                                                    | Returns this `ParseResult` as a list of `CommandLine` objects, one for each matched command/subcommand.                                                                                                                                   |



## Method Details

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.ParseResult.Builder.md) __builder__([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec)</span>

Creates and returns a new `ParseResult.Builder` for the specified command spec.


---

### findMatches

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md)> __findMatches__([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)</span>

Returns the matches for the specified argument group.

**Since:**

4.0


---

### getGroupMatches

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[GroupMatch](CommandLine.ParseResult.GroupMatch.md)> __getGroupMatches__()</span>

Returns the top-level container for the [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) match or matches found.


If the user input was a valid combination of group arguments, the returned list should contain a single
[GroupMatch](CommandLine.ParseResult.GroupMatch.md). Details of the [GroupMatchContainer](CommandLine.ParseResult.GroupMatchContainer.md) encountered
on the command line can be obtained via its GroupMatch#matchedSubgroups() method.
The top-level match returned by this method contains no matched arguments.



If the returned list contains more than one [GroupMatch](CommandLine.ParseResult.GroupMatch.md), the user input was invalid:
the maximum multiplicity of a group was exceeded, and the parser created an extra
`match` to capture the values. Usually this results in a [ParameterException](CommandLine.ParameterException.md)
being thrown by the `parse` method, unless the parser is configured to collect errors.


**Since:**

4.0


---

### matchedOption

<span style="font-family: monospace; font-size: 80%;">public [OptionSpec](CommandLine.Model.OptionSpec.md) __matchedOption__(char shortName)</span>

Returns the option with the specified short name, or `null` if no option with that name was matched
 on the command line.

Use OptionSpec#getValue() on the returned `OptionSpec` to get the matched value (or values),
 converted to the type of the option. Alternatively, use OptionSpec#stringValues()
 to get the matched String values after they were split into parts, or
 OptionSpec#originalStringValues() to get the original String values that were
 matched on the command line, before any processing.
 

To get the default value of an option that was
 [hasMatchedOption.hasMatchedOption](#hasmatchedoption) on the command line, use
 `parseResult.commandSpec().findOption(shortName).getValue()`. 

**See Also:**


[findOption](null.md)



---

### matchedOption

<span style="font-family: monospace; font-size: 80%;">public [OptionSpec](CommandLine.Model.OptionSpec.md) __matchedOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Returns the option with the specified name, or `null` if no option with that name was matched on the command line.

Use OptionSpec#getValue() on the returned `OptionSpec` to get the matched value (or values),
 converted to the type of the option. Alternatively, use OptionSpec#stringValues()
 to get the matched String values after they were split into parts, or
 OptionSpec#originalStringValues() to get the original String values that were
 matched on the command line, before any processing.
 

To get the default value of an option that was
 [hasMatchedOption.hasMatchedOption](#hasmatchedoption) on the command line, use
 `parseResult.commandSpec().findOption(String).getValue()`. 

**Parameters:**

`name` - used to search the matched options. May be an alias of the option name that was actually specified on the command line.
      The specified name may include option name prefix characters or not.

**See Also:**


[findOption](null.md)



---

### matchedPositional

<span style="font-family: monospace; font-size: 80%;">public [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) __matchedPositional__(int position)</span>

Returns the first `PositionalParamSpec` that matched an argument at the specified position, or `null` if no positional parameters were matched at that position.


---

### matchedPositionals

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> __matchedPositionals__(int position)</span>

Returns all `PositionalParamSpec` objects that matched an argument at the specified position, or an empty list if no positional parameters were matched at that position.


---

### commandSpec

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __commandSpec__()</span>

Returns the `CommandSpec` for the matched command.


---

### hasMatchedOption

<span style="font-family: monospace; font-size: 80%;">public boolean __hasMatchedOption__(char shortName)</span>

Returns whether an option whose aliases include the specified short name was matched on the command line.

**Parameters:**

`shortName` - used to search the matched options. May be an alias of the option name that was actually specified on the command line.


---

### hasMatchedOption

<span style="font-family: monospace; font-size: 80%;">public boolean __hasMatchedOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Returns whether an option whose aliases include the specified name was matched on the command line.

**Parameters:**

`name` - used to search the matched options. May be an alias of the option name that was actually specified on the command line.
      The specified name may include option name prefix characters or not.


---

### hasMatchedOption

<span style="font-family: monospace; font-size: 80%;">public boolean __hasMatchedOption__([OptionSpec](CommandLine.Model.OptionSpec.md) option)</span>

Returns whether the specified option was matched on the command line.


---

### hasMatchedPositional

<span style="font-family: monospace; font-size: 80%;">public boolean __hasMatchedPositional__(int position)</span>

Returns whether a positional parameter was matched at the specified position.


---

### hasMatchedPositional

<span style="font-family: monospace; font-size: 80%;">public boolean __hasMatchedPositional__([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) positional)</span>

Returns whether the specified positional parameter was matched on the command line.


---

### matchedOptionsSet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __matchedOptionsSet__()</span>

Returns a set of matched options.

**Since:**

4.0


---

### matchedOptions

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __matchedOptions__()</span>

Returns a list of matched options, in order they were matched on the command line.The returned list may contain the same `OptionSpec` multiple times, if the option was matched multiple times on the command line.


---

### matchedPositionalsSet

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> __matchedPositionalsSet__()</span>

Returns a set of matched positional parameters.

**Since:**

4.0


---

### matchedPositionals

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> __matchedPositionals__()</span>

Returns a list of matched positional parameters, in order they were matched on the command line.The returned list may contain the same `PositionalParamSpec` multiple times, if the parameter was matched multiple times on the command line.


---

### matchedArgs

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> __matchedArgs__()</span>

Returns a list of matched options and positional parameters, in order they were matched on the command line.The returned list may contain an `OptionSpec` or `PositionalParamSpec` multiple times, if the option or parameter was matched multiple times on the command line.

**Since:**

4.0


---

### unmatched

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __unmatched__()</span>

Returns a list of command line arguments that did not match any options or positional parameters.


---

### originalArgs

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __originalArgs__()</span>

Returns the original command line arguments that were passed to the CommandLine#parseArgs(String...) method, before @-file expansion.

**See Also:**


[expandedArgs](#expandedargs)



---

### expandedArgs

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __expandedArgs__()</span>

Returns the command line arguments after @-files were expanded;
 these are the arguments that were actually parsed.

**Since:**

4.4

**See Also:**


[originalArgs](#originalargs)



---

### errors

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)> __errors__()</span>

If ParserSpec#collectErrors is `true`, returns the list of exceptions that were encountered during parsing, otherwise, returns an empty list.

**Since:**

3.2


---

### matchedOptionValue

<span style="font-family: monospace; font-size: 80%;">public T __matchedOptionValue__(char shortName, T defaultValue)</span>

Returns the command line argument value of the option with the specified name, converted to the type of the option, or the specified default value if no option with the specified name was matched.


---

### matchedOptionValue

<span style="font-family: monospace; font-size: 80%;">public T __matchedOptionValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, T defaultValue)</span>

Returns the command line argument value of the option with the specified name, converted to the type of the option, or the specified default value if no option with the specified name was matched.


---

### matchedPositionalValue

<span style="font-family: monospace; font-size: 80%;">public T __matchedPositionalValue__(int position, T defaultValue)</span>

Returns the command line argument value of the positional parameter at the specified position, converted to the type of the positional parameter, or the specified default value if no positional parameter was matched at that position.


---

### hasSubcommand

<span style="font-family: monospace; font-size: 80%;">public boolean __hasSubcommand__()</span>

Returns `true` if a subcommand was matched on the command line, `false` otherwise.


---

### subcommand

<span style="font-family: monospace; font-size: 80%;">public [ParseResult](CommandLine.ParseResult.md) __subcommand__()</span>

Returns the `ParseResult` for the last subcommand of this command that was matched on the command line, or `null` if no subcommand was matched.


---

### subcommands

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ParseResult](CommandLine.ParseResult.md)> __subcommands__()</span>

Returns a list with the `ParseResult` objects for each subcommand of this command
 that was matched on the command line or an empty list if no subcommands were matched.The returned list can only contain multiple values if this command's CommandSpec#subcommandsRepeatable() attribute is `true`.

**Since:**

4.2


---

### isUsageHelpRequested

<span style="font-family: monospace; font-size: 80%;">public boolean __isUsageHelpRequested__()</span>

Returns `true` if one of the options that was matched on the command line is a OptionSpec#usageHelp() option.


---

### isVersionHelpRequested

<span style="font-family: monospace; font-size: 80%;">public boolean __isVersionHelpRequested__()</span>

Returns `true` if one of the options that was matched on the command line is a OptionSpec#versionHelp() option.


---

### asCommandLineList

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[CommandLine](CommandLine.md)> __asCommandLineList__()</span>

Returns this `ParseResult` as a list of `CommandLine` objects, one for each matched command/subcommand.Note that for repeatable subcommands, there may be multiple commands at each level of the hierarchy in the returned list.

**Since:**

3.0


---

