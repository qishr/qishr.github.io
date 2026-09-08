Package [io.github.qishr.cascara.common.util](index.md)

# Class Help
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Help__</span>

A collection of methods and inner classes that provide fine-grained control over the contents and layout of
the usage help message to display to end users when help is requested or invalid input values were specified.Class Diagram of the CommandLine.Help API





Layered API


The [Command](CommandLine.Command.md) annotation and the [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) programmatic API equivalent
provide the easiest way to configure the usage help message. See
the Manual for details.


This Help class provides high-level functions to create sections of the usage help message and headings
for these sections. Instead of calling the CommandLine#usage(PrintStream, CommandLine.Help.ColorScheme)
method, application authors may want to create a custom usage help message by reorganizing sections in a
different order and/or adding custom sections.


Finally, the Help class contains inner classes and interfaces that can be used to create custom help messages.
IOptionRenderer and IParameterRenderer


Renders a field annotated with [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md) to an array of [Text](CommandLine.Help.Ansi.Text.md) values.
By default, these values are
mandatory marker character (if the option/parameter is Option#required())
short option name (empty for parameters)
comma or empty (empty for parameters)
long option names (the parameter [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) for parameters)
description



Other components rely on this ordering.
Layout


Delegates to the renderers to create [Text](CommandLine.Help.Ansi.Text.md) values for the annotated fields, and uses a
[TextTable](CommandLine.Help.TextTable.md) to display these values in tabular format. Layout is responsible for deciding which values
to display where in the table. By default, Layout shows one option or parameter per table row.
TextTable


Responsible for spacing out [Text](CommandLine.Help.Ansi.Text.md) values according to the [Column](CommandLine.Help.Column.md) definitions the table was
created with. Columns have a width, indentation, and an overflow policy that decides what to do if a value is
longer than the column's width.
Text


Encapsulates rich text with styles and colors in a way that other components like [TextTable](CommandLine.Help.TextTable.md) are
unaware of the embedded ANSI escape codes.


## Nested Class Summary

| Modifier and Type | Class                                                                                               | Description                                                                                                                                                                                                       |
|-------------------|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Help.ColorScheme](CommandLine.Help.ColorScheme.md) | All usage help message are generated with a color scheme that assigns certain styles and colors to common  parts of a usage message: the command name, options, positional parameters and option parameters.      |
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Help.Column](CommandLine.Help.Column.md)           | Columns define the width, indent (leading number of spaces in a column before the value) and  [Overflow](CommandLine.Help.Column.Overflow.md) policy of a column in a [TextTable](CommandLine.Help.TextTable.md). |
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Help.Layout](CommandLine.Help.Layout.md)           | Use a Layout to format usage help text for options and parameters in tabular format.                                                                                                                              |
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Help.TextTable](CommandLine.Help.TextTable.md)     |   Responsible for spacing out [Text](CommandLine.Help.Ansi.Text.md) values according to the [Column](CommandLine.Help.Column.md) definitions the table was created with.                                          |



## Field Summary

| Modifier and Type                | Field                                                 | Description                                                                                                                              |
|----------------------------------|-------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------|
| public final PositionalParamSpec | [AT_FILE_POSITIONAL_PARAM](#at_file_positional_param) |                                                                                                                                          |
| protected static final String    | [DEFAULT_COMMAND_NAME](#default_command_name)         | Constant String holding the default program name, value defined in CommandSpec#DEFAULT_COMMAND_NAME.                                     |
| protected static final String    | [DEFAULT_SEPARATOR](#default_separator)               | Constant String holding the default string that separates options from option parameters, value defined in ParserSpec#DEFAULT_SEPARATOR. |
| public final OptionSpec          | [END_OF_OPTIONS_OPTION](#end_of_options_option)       |                                                                                                                                          |



## Constructor Summary

| Constructor                                                                                                                                                            | Description                                                                                                                              |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------|
| Help([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)                                                             | Constructs a new `Help` instance with a default color scheme, initialized from annotations  on the specified class and superclasses.     |
| Help([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [Ansi](CommandLine.Help.Ansi.md) ansi)                      | Constructs a new `Help` instance with a default color scheme, initialized from annotations  on the specified class and superclasses.     |
| Help([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme) | Constructs a new `Help` instance with the specified color scheme, initialized from annotations  on the specified class and superclasses. |
| Help([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                          | Constructs a new `Help` instance with the specified color scheme, initialized from annotations  on the specified class and superclasses. |



## Method Summary

| Modifier and Type                                                                                                                                                                                                        | Method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                                                                                                                               |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                   | [commandSpec](#commandspec)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns the `CommandSpec` model that this Help was constructed with.                                                                                                                                                                                                                                                                      |
| public [ColorScheme](CommandLine.Help.ColorScheme.md)                                                                                                                                                                    | [colorScheme](#colorscheme)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns the `ColorScheme` model that this Help was constructed with.                                                                                                                                                                                                                                                                      |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Help](CommandLine.Help.md)> | [subcommands](#subcommands)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns the map of non-hidden subcommand `Help` instances for this command Help.                                                                                                                                                                                                                                                          |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Help](CommandLine.Help.md)> | [allSubcommands](#allsubcommands)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Returns the map of all subcommand `Help` instances (including hidden commands) for this command Help.                                                                                                                                                                                                                                     |
| protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                         | [aliases](#aliases)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns the list of aliases for the command in this Help.                                                                                                                                                                                                                                                                                 |
| public [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md)                                                                                                                                                    | [parameterLabelRenderer](#parameterlabelrenderer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Option and positional parameter value label renderer used for the synopsis line(s) and the option list.                                                                                                                                                                                                                                   |
| public [Help](CommandLine.Help.md)                                                                                                                                                                                       | [addAllSubcommands](#addallsubcommands)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandLine](CommandLine.md)> subcommands)                                                                                                                                                                                                                                                                                                       | Registers all specified subcommands with this Help.                                                                                                                                                                                                                                                                                       |
| public [Help](CommandLine.Help.md)                                                                                                                                                                                       | [addSubcommand](#addsubcommand)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commandName, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)                                                                                                                                                                                                                                                                                                                                | Registers the specified subcommand as one of the visible commands in this Help.                                                                                                                                                                                                                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [fullSynopsis](#fullsynopsis)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Returns the full usage synopsis of this command.                                                                                                                                                                                                                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [synopsis](#synopsis)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Returns a synopsis for the command without reserving space for the synopsis heading.                                                                                                                                                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [synopsis](#synopsis)(int synopsisHeadingLength)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns a synopsis for the command, reserving the specified space for the synopsis heading.                                                                                                                                                                                                                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [abbreviatedSynopsis](#abbreviatedsynopsis)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Generates a generic synopsis like `<command name> [OPTIONS] [PARAM1 [PARAM2]...]`, omitting parts  that don't apply to the command (e.g., does not show [OPTIONS] if the command has no options).                                                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [detailedSynopsis](#detailedsynopsis)([Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions)                                                                                                                                                                                                                                                                                                                                           | Generates a detailed synopsis message showing all options and parameters.                                                                                                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [detailedSynopsis](#detailedsynopsis)(int synopsisHeadingLength, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions)                                                                                                                                                                                                                                                                                                                | Generates a detailed synopsis message showing all options and parameters.                                                                                                                                                                                                                                                                 |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [makeSynopsisFromParts](#makesynopsisfromparts)(int synopsisHeadingLength, [Text](CommandLine.Help.Ansi.Text.md) optionText, [Text](CommandLine.Help.Ansi.Text.md) groupsText, [Text](CommandLine.Help.Ansi.Text.md) endOfOptionsText, [Text](CommandLine.Help.Ansi.Text.md) positionalParamText, [Text](CommandLine.Help.Ansi.Text.md) commandText)                                                                                                                                                                                                                           | Concatenates the command name and the specified synopsis parts and returns a fully rendered synopsis String.                                                                                                                                                                                                                              |
| protected [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                          | [createDetailedSynopsisGroupsText](#createdetailedsynopsisgroupstext)([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> outparam_groupArgs)                                                                                                                                                                                                                                                                                                                                                      | Returns a Text object containing a partial detailed synopsis showing only the options and positional parameters in  the specified validating [ArgGroup](CommandLine.ArgGroup.md), starting with a `" "` space.                                                                                                                            |
| protected [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                          | [createDetailedSynopsisOptionsText](#createdetailedsynopsisoptionstext)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> done, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions)                                                                                                                                                     | Returns a Text object containing a partial detailed synopsis showing only the options, starting with a `" "` space.                                                                                                                                                                                                                       |
| protected [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                          | [createDetailedSynopsisOptionsText](#createdetailedsynopsisoptionstext)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> done, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionList, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions) | Returns a Text object containing a partial detailed synopsis showing only the specified options, starting with a `" "` space.                                                                                                                                                                                                             |
| protected [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                          | [createDetailedSynopsisEndOfOptionsText](#createdetailedsynopsisendofoptionstext)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Returns a Text object containing a partial detailed synopsis showing only the end of options delimiter (if enabled), starting with a `" "` space.                                                                                                                                                                                         |
| protected [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                          | [createDetailedSynopsisPositionalsText](#createdetailedsynopsispositionalstext)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> done)                                                                                                                                                                                                                                                                                                                                            | Returns a Text object containing a partial detailed synopsis showing only the positional parameters, starting with a `" "` space.                                                                                                                                                                                                         |
| protected [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                          | [createDetailedSynopsisCommandText](#createdetailedsynopsiscommandtext)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Returns a Text object containing a partial detailed synopsis showing only the subcommands, starting with a `" "` space.                                                                                                                                                                                                                   |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [insertSynopsisCommandName](#insertsynopsiscommandname)(int synopsisHeadingLength, [Text](CommandLine.Help.Ansi.Text.md) optionsAndPositionalsAndCommandsDetails)                                                                                                                                                                                                                                                                                                                                                                                                              | Returns the detailed synopsis text by inserting the command name before the specified text with options and positional parameters details.                                                                                                                                                                                                |
| public int                                                                                                                                                                                                               | [synopsisHeadingLength](#synopsisheadinglength)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Returns the number of characters the synopsis heading will take on the same line as the synopsis.                                                                                                                                                                                                                                         |
| public [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                                                               | [createDefaultOptionSort](#createdefaultoptionsort)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns a comparator for sorting options, or `null`, depending on the settings for this command.                                                                                                                                                                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [optionList](#optionlist)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |   Returns a description of all options in this command, including any argument groups.                                                                                                                                                                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [optionListExcludingGroups](#optionlistexcludinggroups)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options)                                                                                                                                                                                                                                                                                                                                                                       |   Returns a description of the specified list of options.                                                                                                                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [optionList](#optionlist)([Layout](CommandLine.Help.Layout.md) layout, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) valueLabelRenderer)                                                                                                                                                                                                                                                      | Sorts all `Options` with the specified `comparator` (if the comparator is non-`null`),  then adds all non-hidden options to the  specified TextTable and returns the result of TextTable.toString().                                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [optionListExcludingGroups](#optionlistexcludinggroups)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionList, [Layout](CommandLine.Help.Layout.md) layout, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) valueLabelRenderer)                                                                    | Sorts all `Options` with the specified `comparator` (if the comparator is non-`null`),  then adds the specified options to the  specified TextTable and returns the result of TextTable.toString().                                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [optionListGroupSections](#optionlistgroupsections)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns a rendered section of the usage help message that contains the argument groups that have a non-`null` heading.                                                                                                                                                                                                                    |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)>                                                                       | [optionSectionGroups](#optionsectiongroups)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns the list of `ArgGroupSpec` instances in this command that have a non-`null` heading, most deeply nested argument groups first.                                                                                                                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [parameterList](#parameterlist)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Returns the rendered positional parameters section of the usage help message for all positional parameters in this command.                                                                                                                                                                                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [parameterList](#parameterlist)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionalParams)                                                                                                                                                                                                                                                                                                                                                                    | Returns the rendered positional parameters section of the usage help message for the specified positional parameters.                                                                                                                                                                                                                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [parameterList](#parameterlist)([Layout](CommandLine.Help.Layout.md) layout, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)                                                                                                                                                                                                                                                                                                                                                                                                                | Returns the rendered section of the usage help message that lists all positional parameters in this command with their descriptions.                                                                                                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [parameterList](#parameterlist)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionalParams, [Layout](CommandLine.Help.Layout.md) layout, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)                                                                                                                                                                                                                                    | Returns the rendered section of the usage help message that lists the specified parameters with their descriptions.                                                                                                                                                                                                                       |
| public boolean                                                                                                                                                                                                           | [hasAtFileParameter](#hasatfileparameter)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Returns true if the usage help should show the at file parameter in the parameter list, otherwise false.                                                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [atFileParameterList](#atfileparameterlist)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns the section of the usage help message that lists the @-file and its description.                                                                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [endOfOptionsList](#endofoptionslist)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Returns the section of the usage help message that lists the `--` End of Options delimiter and its description.                                                                                                                                                                                                                           |
| public static [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html)                                                                                                 | [join](#join)([Ansi](CommandLine.Help.Ansi.md) ansi, int usageHelpWidth, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values, [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                          |                                                                                                                                                                                                                                                                                                                                           |
| public static [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html)                                                                                                 | [join](#join)([Ansi](CommandLine.Help.Ansi.md) ansi, int usageHelpWidth, boolean adjustCJK, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values, [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                       | Formats each of the specified values and appends it to the specified StringBuilder.                                                                                                                                                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [customSynopsis](#customsynopsis)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                       | Returns command custom synopsis as a string.                                                                                                                                                                                                                                                                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [description](#description)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                             | Returns command description text as a string.                                                                                                                                                                                                                                                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [header](#header)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Returns the command header text as a string.                                                                                                                                                                                                                                                                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [footer](#footer)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Returns command footer text as a string.                                                                                                                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [headerHeading](#headerheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                         | Returns the text displayed before the header text; the result of `String.format(headerHeading, params)`.                                                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [synopsisHeading](#synopsisheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                     | Returns the text displayed before the synopsis text; the result of `String.format(synopsisHeading, params)`.                                                                                                                                                                                                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [descriptionHeading](#descriptionheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns the text displayed before the description text; an empty string if there is no description,  otherwise the result of `String.format(descriptionHeading, params)`.                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [parameterListHeading](#parameterlistheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                           | Returns the text displayed before the positional parameter list; an empty string if there are no positional  parameters, otherwise the result of `String.format(parameterListHeading, params)`.                                                                                                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [optionListHeading](#optionlistheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                 | Returns the text displayed before the option list; an empty string if there are no options,  otherwise the result of `String.format(optionListHeading, params)`.                                                                                                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [commandListHeading](#commandlistheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                               | Returns the text displayed before the command list; an empty string if there are no commands,  otherwise the result of `String.format(commandListHeading, params)`.                                                                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [footerHeading](#footerheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                                         | Returns the text displayed before the footer text; the result of `String.format(footerHeading, params)`.                                                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [exitCodeListHeading](#exitcodelistheading)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                                                                                                             | Returns the text displayed before the exit code list text; the result of `String.format(exitCodeHeading, params)`.                                                                                                                                                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [exitCodeList](#exitcodelist)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Returns a 2-column list with exit codes and their description.                                                                                                                                                                                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [createHeading](#createheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)                                                                                                                                                                                                                                                                                                                                      | Returns a String that can be used as a help section heading.                                                                                                                                                                                                                                                                              |
| public [TextTable](CommandLine.Help.TextTable.md)                                                                                                                                                                        | [createTextTable](#createtexttable)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<?, ?> map)                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns a 2-column `TextTable` containing data from the specified map: the keys are put in the left column and the map values are in the right column.                                                                                                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [commandList](#commandlist)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns a 2-column list with the command names and first line of their header or (if absent) description of the commands returned by [subcommands.subcommands](#subcommands).                                                                                                                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                      | [commandList](#commandlist)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Help](CommandLine.Help.md)> subcommands)                                                                                                                                                                                                                                                                                                                     | Returns a 2-column list with the command names and first line of their header or (if absent) description of the specified command map.                                                                                                                                                                                                    |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                                                                             | [commandNamesText](#commandnamestext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns a `Text` object containing the command name and all aliases, separated with the specified separator.                                                                                                                                                                                                                              |
| public [Layout](CommandLine.Help.Layout.md)                                                                                                                                                                              | [createDefaultLayout](#createdefaultlayout)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns a `Layout` instance configured with the user preferences captured in this Help instance.                                                                                                                                                                                                                                          |
| public [Layout](CommandLine.Help.Layout.md)                                                                                                                                                                              | [createDefaultLayout](#createdefaultlayout)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionals, [ColorScheme](CommandLine.Help.ColorScheme.md) aColorScheme)                                                                                                                                               | Returns a `Layout` instance configured with the user preferences captured in this Help instance.                                                                                                                                                                                                                                          |
| public int                                                                                                                                                                                                               | [calcLongOptionColumnWidth](#calclongoptioncolumnwidth)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionals, [ColorScheme](CommandLine.Help.ColorScheme.md) aColorScheme)                                                                                                                                   | Returns the width of the long options column in the usage help message.                                                                                                                                                                                                                                                                   |
| public [IOptionRenderer](CommandLine.Help.IOptionRenderer.md)                                                                                                                                                            | [createDefaultOptionRenderer](#createdefaultoptionrenderer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns a new default OptionRenderer which converts [OptionSpec](CommandLine.Model.OptionSpec.md) to five columns of text to match   the default [TextTable](CommandLine.Help.TextTable.md) column layout.                                                                                                                                |
| public static [IOptionRenderer](CommandLine.Help.IOptionRenderer.md)                                                                                                                                                     | [createMinimalOptionRenderer](#createminimaloptionrenderer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Returns a new minimal OptionRenderer which converts [OptionSpec](CommandLine.Model.OptionSpec.md) to a single row with two columns  of text: an option name and a description.                                                                                                                                                            |
| public [IParameterRenderer](CommandLine.Help.IParameterRenderer.md)                                                                                                                                                      | [createDefaultParameterRenderer](#createdefaultparameterrenderer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Returns a new default ParameterRenderer which converts [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) to four columns of  text to match the default [TextTable](CommandLine.Help.TextTable.md) column layout.                                                                                                            |
| public static [IParameterRenderer](CommandLine.Help.IParameterRenderer.md)                                                                                                                                               | [createMinimalParameterRenderer](#createminimalparameterrenderer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Returns a new minimal ParameterRenderer which converts [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)  to a single row with two columns of text: an option name and a description.                                                                                                                                       |
| public static [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md)                                                                                                                                             | [createMinimalParamLabelRenderer](#createminimalparamlabelrenderer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns a value renderer that returns the `paramLabel` if defined or the field name otherwise.                                                                                                                                                                                                                                            |
| public [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md)                                                                                                                                                    | [createDefaultParamLabelRenderer](#createdefaultparamlabelrenderer)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Returns a new default param label renderer that separates option parameters from their option name  with the specified separator string, and, unless ArgSpec#hideParamSyntax() is true,  surrounds optional parameters with `'['` and `']'`  characters and uses ellipses ("...") to indicate that any number of a parameter are allowed. |
| public static [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                                                        | [createShortOptionNameComparator](#createshortoptionnamecomparator)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Sorts [OptionSpec](CommandLine.Model.OptionSpec.md) by their option name in case-insensitive alphabetic order.                                                                                                                                                                                                                            |
| public static [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                                                        | [createShortOptionArityAndNameComparator](#createshortoptionarityandnamecomparator)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Sorts [OptionSpec](CommandLine.Model.OptionSpec.md) by their option max arity first, by  min arity next, and by [createShortOptionNameComparator.createShortOptionNameComparator](#createshortoptionnamecomparator) last.                                                                                                                 |
| public static [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>         | [shortestFirst](#shortestfirst)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Sorts short strings before longer strings.                                                                                                                                                                                                                                                                                                |
| public [Ansi](CommandLine.Help.Ansi.md)                                                                                                                                                                                  | [ansi](#ansi)()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Returns whether ANSI escape codes are enabled or not.                                                                                                                                                                                                                                                                                     |
| public static [ColorScheme](CommandLine.Help.ColorScheme.md)                                                                                                                                                             | [defaultColorScheme](#defaultcolorscheme)([Ansi](CommandLine.Help.Ansi.md) ansi)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Creates and returns a new [ColorScheme](CommandLine.Help.ColorScheme.md) initialized with picocli default values: commands are bold,   options and parameters use a yellow foreground, and option parameters use italic.                                                                                                                  |



## Field Details

### AT_FILE_POSITIONAL_PARAM

<span style="font-family: monospace; font-size: 80%;">public final PositionalParamSpec __AT_FILE_POSITIONAL_PARAM__</span>




---

### DEFAULT_COMMAND_NAME

<span style="font-family: monospace; font-size: 80%;">protected static final String __DEFAULT_COMMAND_NAME__</span>

Constant String holding the default program name, value defined in CommandSpec#DEFAULT_COMMAND_NAME.


---

### DEFAULT_SEPARATOR

<span style="font-family: monospace; font-size: 80%;">protected static final String __DEFAULT_SEPARATOR__</span>

Constant String holding the default string that separates options from option parameters, value defined in ParserSpec#DEFAULT_SEPARATOR.


---

### END_OF_OPTIONS_OPTION

<span style="font-family: monospace; font-size: 80%;">public final OptionSpec __END_OF_OPTIONS_OPTION__</span>




---


## Method Details

### commandSpec

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __commandSpec__()</span>

Returns the `CommandSpec` model that this Help was constructed with.

**Since:**

3.9


---

### colorScheme

<span style="font-family: monospace; font-size: 80%;">public [ColorScheme](CommandLine.Help.ColorScheme.md) __colorScheme__()</span>

Returns the `ColorScheme` model that this Help was constructed with.

**Since:**

3.0


---

### subcommands

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Help](CommandLine.Help.md)> __subcommands__()</span>

Returns the map of non-hidden subcommand `Help` instances for this command Help.

**Since:**

3.9

**See Also:**


[allSubcommands](#allsubcommands)



---

### allSubcommands

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Help](CommandLine.Help.md)> __allSubcommands__()</span>

Returns the map of all subcommand `Help` instances (including hidden commands) for this command Help.

**Since:**

4.4

**See Also:**


[subcommands](#subcommands)



---

### aliases

<span style="font-family: monospace; font-size: 80%;">protected [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __aliases__()</span>

Returns the list of aliases for the command in this Help.

**Since:**

3.9


---

### parameterLabelRenderer

<span style="font-family: monospace; font-size: 80%;">public [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) __parameterLabelRenderer__()</span>

Option and positional parameter value label renderer used for the synopsis line(s) and the option list.By default initialized to the result of [createDefaultParamLabelRenderer.createDefaultParamLabelRenderer](#createdefaultparamlabelrenderer), which takes a snapshot
 of the ParserSpec#separator() at construction time. If the separator is modified after Help construction, you
 may need to re-initialize this field by calling [createDefaultParamLabelRenderer.createDefaultParamLabelRenderer](#createdefaultparamlabelrenderer) again.


---

### addAllSubcommands

<span style="font-family: monospace; font-size: 80%;">public [Help](CommandLine.Help.md) __addAllSubcommands__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandLine](CommandLine.md)> subcommands)</span>

Registers all specified subcommands with this Help.

**Parameters:**

`subcommands` - the subcommands of this command

**Returns:**

this Help instance (for method chaining)

**See Also:**


[subcommands](#subcommands)


[allSubcommands](#allsubcommands)



---

### addSubcommand

<span style="font-family: monospace; font-size: 80%;">public [Help](CommandLine.Help.md) __addSubcommand__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commandName, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) command)</span>

Registers the specified subcommand as one of the visible commands in this Help.This method does not check whether the specified command is hidden or not.



!!! note "Deprecation"
    use [addAllSubcommands.addAllSubcommands](#addallsubcommands) instead

**Parameters:**

`commandName` - the name of the subcommand to display in the usage message

`command` - the `CommandSpec` or `@Command` annotated object to get more information from

**Returns:**

this Help instance (for method chaining)

**See Also:**


[subcommands](#subcommands)



---

### fullSynopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __fullSynopsis__()</span>

Returns the full usage synopsis of this command.This is equivalent to:
`this.synopsisHeading() + this.synopsis(this.synopsisHeadingLength())`

**Since:**

4.1


---

### synopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsis__()</span>

Returns a synopsis for the command without reserving space for the synopsis heading.



!!! note "Deprecation"
    use [synopsis.synopsis](#synopsis) instead

**Returns:**

a synopsis

**See Also:**


[abbreviatedSynopsis](#abbreviatedsynopsis)


[detailedSynopsis](#detailedsynopsis)



---

### synopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsis__(int synopsisHeadingLength)</span>

Returns a synopsis for the command, reserving the specified space for the synopsis heading.

**Parameters:**

`synopsisHeadingLength` - the length of the synopsis heading that will be displayed on the same line

**Returns:**

a synopsis

**See Also:**


[abbreviatedSynopsis](#abbreviatedsynopsis)


[detailedSynopsis](#detailedsynopsis)


[synopsisHeading](#synopsisheading)



---

### abbreviatedSynopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __abbreviatedSynopsis__()</span>

Generates a generic synopsis like `<command name> [OPTIONS] [PARAM1 [PARAM2]...]`, omitting parts
 that don't apply to the command (e.g., does not show [OPTIONS] if the command has no options).

**Returns:**

a generic synopsis


---

### detailedSynopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __detailedSynopsis__([Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions)</span>

Generates a detailed synopsis message showing all options and parameters.Follows the unix convention of
 showing optional options and parameters in square brackets (`[ ]`).



!!! note "Deprecation"
    use [detailedSynopsis.detailedSynopsis](#detailedsynopsis) instead.

**Parameters:**

`optionSort` - comparator to sort options or `null` if options should not be sorted

`clusterBooleanOptions` - `true` if boolean short options should be clustered into a single string

**Returns:**

a detailed synopsis


---

### detailedSynopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __detailedSynopsis__(int synopsisHeadingLength, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions)</span>

Generates a detailed synopsis message showing all options and parameters.Follows the unix convention of
 showing optional options and parameters in square brackets (`[ ]`).

**Parameters:**

`synopsisHeadingLength` - the length of the synopsis heading that will be displayed on the same line

`optionSort` - comparator to sort options or `null` if options should not be sorted

`clusterBooleanOptions` - `true` if boolean short options should be clustered into a single string

**Returns:**

a detailed synopsis

**Since:**

3.0


---

### makeSynopsisFromParts

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __makeSynopsisFromParts__(int synopsisHeadingLength, [Text](CommandLine.Help.Ansi.Text.md) optionText, [Text](CommandLine.Help.Ansi.Text.md) groupsText, [Text](CommandLine.Help.Ansi.Text.md) endOfOptionsText, [Text](CommandLine.Help.Ansi.Text.md) positionalParamText, [Text](CommandLine.Help.Ansi.Text.md) commandText)</span>

Concatenates the command name and the specified synopsis parts and returns a fully rendered synopsis String.

**Parameters:**

`synopsisHeadingLength` - length of the synopsis heading string to be displayed on the same line as the first synopsis line.
                             For example, if the synopsis heading is `"Usage: "`, this value is 7.

`optionText` - the Ansi.Text object with the rendered options list (excluding the argument groups)

`groupsText` - the Ansi.Text object showing the rendered argument groups

`endOfOptionsText` - the Ansi.Text object containing the end of options delimiter (if enabled)

`positionalParamText` - the Ansi.Text object showing the rendered positional parameters

`commandText` - the Ansi.Text object showing the subcommands part of the synopsis

**Returns:**

a fully rendered synopsis String

**Since:**

4.4


---

### createDetailedSynopsisGroupsText

<span style="font-family: monospace; font-size: 80%;">protected [Text](CommandLine.Help.Ansi.Text.md) __createDetailedSynopsisGroupsText__([Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> outparam_groupArgs)</span>

Returns a Text object containing a partial detailed synopsis showing only the options and positional parameters in
 the specified validating [ArgGroup](CommandLine.ArgGroup.md), starting with a `" "` space.

**Parameters:**

`outparam_groupArgs` - all options and positional parameters in the groups this method generates a synopsis for;
                           these options and positional parameters should be excluded from appearing elsewhere in the synopsis

**Returns:**

the formatted groups synopsis elements, starting with a `" "` space, or an empty Text if this command has no validating groups

**Since:**

4.0


---

### createDetailedSynopsisOptionsText

<span style="font-family: monospace; font-size: 80%;">protected [Text](CommandLine.Help.Ansi.Text.md) __createDetailedSynopsisOptionsText__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> done, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions)</span>

Returns a Text object containing a partial detailed synopsis showing only the options, starting with a `" "` space.Follows the unix convention of showing optional options and parameters in square brackets (`[ ]`).

**Parameters:**

`done` - the list of options and positional parameters for which a synopsis was already generated. Options in this set should be excluded.

`optionSort` - comparator to sort options or `null` if options should not be sorted

`clusterBooleanOptions` - `true` if boolean short options should be clustered into a single string

**Returns:**

the formatted options, starting with a `" "` space, or an empty Text if this command has no named options

**Since:**

3.9


---

### createDetailedSynopsisOptionsText

<span style="font-family: monospace; font-size: 80%;">protected [Text](CommandLine.Help.Ansi.Text.md) __createDetailedSynopsisOptionsText__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> done, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionList, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, boolean clusterBooleanOptions)</span>

Returns a Text object containing a partial detailed synopsis showing only the specified options, starting with a `" "` space.Follows the unix convention of showing optional options and parameters in square brackets (`[ ]`).

**Parameters:**

`done` - the list of options and positional parameters for which a synopsis was already generated. Options in this set should be excluded.

`optionList` - the list of options to include in the synopsis

`optionSort` - comparator to sort options or `null` if options should not be sorted

`clusterBooleanOptions` - `true` if boolean short options should be clustered into a single string

**Returns:**

the formatted options, starting with a `" "` space, or an empty Text if this command has no named options

**Since:**

4.4


---

### createDetailedSynopsisEndOfOptionsText

<span style="font-family: monospace; font-size: 80%;">protected [Text](CommandLine.Help.Ansi.Text.md) __createDetailedSynopsisEndOfOptionsText__()</span>

Returns a Text object containing a partial detailed synopsis showing only the end of options delimiter (if enabled), starting with a `" "` space.Follows the unix convention of showing optional options and parameters in square brackets (`[ ]`).

**Returns:**

the formatted end of options delimiter, starting with a `" "` space, or an empty Text if the end of options delimiter should not be shown

**Since:**

4.3


---

### createDetailedSynopsisPositionalsText

<span style="font-family: monospace; font-size: 80%;">protected [Text](CommandLine.Help.Ansi.Text.md) __createDetailedSynopsisPositionalsText__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> done)</span>

Returns a Text object containing a partial detailed synopsis showing only the positional parameters, starting with a `" "` space.Follows the unix convention of showing optional options and parameters in square brackets (`[ ]`).

**Parameters:**

`done` - the list of options and positional parameters for which a synopsis was already generated. Positional parameters in this set should be excluded.

**Returns:**

the formatted positional parameters, starting with a `" "` space, or an empty Text if this command has no positional parameters

**Since:**

3.9


---

### createDetailedSynopsisCommandText

<span style="font-family: monospace; font-size: 80%;">protected [Text](CommandLine.Help.Ansi.Text.md) __createDetailedSynopsisCommandText__()</span>

Returns a Text object containing a partial detailed synopsis showing only the subcommands, starting with a `" "` space.Follows the unix convention of showing optional elements in square brackets (`[ ]`).

**Returns:**

this implementation returns " " + UsageMessageSpec#synopsisSubcommandLabel() if this command has subcommands, an empty Text otherwise.

**Since:**

3.9


---

### insertSynopsisCommandName

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __insertSynopsisCommandName__(int synopsisHeadingLength, [Text](CommandLine.Help.Ansi.Text.md) optionsAndPositionalsAndCommandsDetails)</span>

Returns the detailed synopsis text by inserting the command name before the specified text with options and positional parameters details.

**Parameters:**

`synopsisHeadingLength` - length of the synopsis heading string to be displayed on the same line as the first synopsis line.
                             For example, if the synopsis heading is `"Usage: "`, this value is 7.

`optionsAndPositionalsAndCommandsDetails` - formatted string with options, positional parameters and subcommands.
         Follows the unix convention of showing optional options and parameters in square brackets (`[ ]`).

**Returns:**

the detailed synopsis text, in multiple lines if the length exceeds the usage width


---

### synopsisHeadingLength

<span style="font-family: monospace; font-size: 80%;">public int __synopsisHeadingLength__()</span>

Returns the number of characters the synopsis heading will take on the same line as the synopsis.

**Returns:**

the number of characters the synopsis heading will take on the same line as the synopsis.

**See Also:**


[detailedSynopsis](#detailedsynopsis)



---

### createDefaultOptionSort

<span style="font-family: monospace; font-size: 80%;">public [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __createDefaultOptionSort__()</span>

Returns a comparator for sorting options, or `null`, depending on the settings for this command.

**Returns:**

if sortOptions is selected,
     return a comparator for sorting options based on their short name.
     Otherwise, if any of the options has a non-default value for their order attribute,
     then return a comparator for sorting options based on the order attribute.
     Otherwise, return `null` to indicate that options should not be sorted.

**Since:**

4.4


---

### optionList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionList__()</span>



Returns a description of all options in this command, including any argument groups.


This implementation [createShortOptionNameComparator.createShortOptionNameComparator](#createshortoptionnamecomparator), and shows
only the non-hidden options in a [TextTable](CommandLine.Help.TextTable.md)
using the [createDefaultOptionRenderer.createDefaultOptionRenderer](#createdefaultoptionrenderer) and [Layout](CommandLine.Help.Layout.md).

**Returns:**

the fully formatted option list, including any argument groups

**See Also:**


[optionListExcludingGroups](#optionlistexcludinggroups)


[optionListGroupSections](#optionlistgroupsections)



---

### optionListExcludingGroups

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionListExcludingGroups__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options)</span>



Returns a description of the specified list of options.


This implementation [createShortOptionNameComparator.createShortOptionNameComparator](#createshortoptionnamecomparator), and shows
only the specified options in a [TextTable](CommandLine.Help.TextTable.md)
using the [createDefaultOptionRenderer.createDefaultOptionRenderer](#createdefaultoptionrenderer) and [createDefaultLayout.createDefaultLayout](#createdefaultlayout) default layout}.



Argument groups are not rendered by this method.


**Parameters:**

`options` - the options to display in the returned rendered section of the usage help message

**Returns:**

the fully formatted portion of the option list for the specified options only (argument groups are not included)

**Since:**

4.4

**See Also:**


[optionListExcludingGroups](#optionlistexcludinggroups)



---

### optionList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionList__([Layout](CommandLine.Help.Layout.md) layout, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) valueLabelRenderer)</span>

Sorts all `Options` with the specified `comparator` (if the comparator is non-`null`),
 then adds all non-hidden options to the
 specified TextTable and returns the result of TextTable.toString().

**Parameters:**

`layout` - the layout responsible for rendering the option list

`valueLabelRenderer` - used for options with a parameter

**Returns:**

the fully formatted option list, including any argument groups

**Since:**

3.0

**See Also:**


[optionListExcludingGroups](#optionlistexcludinggroups)


[optionListGroupSections](#optionlistgroupsections)



---

### optionListExcludingGroups

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionListExcludingGroups__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionList, [Layout](CommandLine.Help.Layout.md) layout, [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> optionSort, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) valueLabelRenderer)</span>

Sorts all `Options` with the specified `comparator` (if the comparator is non-`null`),
 then adds the specified options to the
 specified TextTable and returns the result of TextTable.toString().Argument groups are not rendered by this method.

**Parameters:**

`optionList` - the options to show (this may be a subset of the options in this command);
                   it is the responsibility of the caller to remove options that should not be displayed

`layout` - the layout responsible for rendering the option list

`valueLabelRenderer` - used for options with a parameter

**Returns:**

the fully formatted portion of the option list for the specified options only (argument groups are not included)

**Since:**

4.4


---

### optionListGroupSections

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionListGroupSections__()</span>

Returns a rendered section of the usage help message that contains the argument groups that have a non-`null` heading.This is usually shown below the "normal" options of the command (that are not in an argument group).

**Returns:**

the fully formatted portion of the option list showing the argument groups

**Since:**

4.4

**See Also:**


[optionList](#optionlist)


[optionListExcludingGroups](#optionlistexcludinggroups)


[optionSectionGroups](#optionsectiongroups)



---

### optionSectionGroups

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)> __optionSectionGroups__()</span>

Returns the list of `ArgGroupSpec` instances in this command that have a non-`null` heading, most deeply nested argument groups first.

**Since:**

4.4

**See Also:**


[optionListGroupSections](#optionlistgroupsections)



---

### parameterList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __parameterList__()</span>

Returns the rendered positional parameters section of the usage help message for all positional parameters in this command.

**Returns:**

the section of the usage help message that lists the parameters

**See Also:**


[parameterList](#parameterlist)



---

### parameterList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __parameterList__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionalParams)</span>

Returns the rendered positional parameters section of the usage help message for the specified positional parameters.

**Parameters:**

`positionalParams` - the positional parameters to display in the returned rendered section of the usage help message;
                        the caller is responsible for removing parameters that should not be displayed

**Returns:**

the section of the usage help message that lists the parameters

**Since:**

4.4

**See Also:**


[parameterList](#parameterlist)



---

### parameterList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __parameterList__([Layout](CommandLine.Help.Layout.md) layout, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Returns the rendered section of the usage help message that lists all positional parameters in this command with their descriptions.

**Parameters:**

`layout` - the layout to use

`paramLabelRenderer` - for rendering parameter names

**Returns:**

the section of the usage help message that lists the parameters


---

### parameterList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __parameterList__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionalParams, [Layout](CommandLine.Help.Layout.md) layout, [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) paramLabelRenderer)</span>

Returns the rendered section of the usage help message that lists the specified parameters with their descriptions.

**Parameters:**

`positionalParams` - the positional parameters to display in the returned rendered section of the usage help message;
                        the caller is responsible for removing parameters that should not be displayed

`layout` - the layout to use

`paramLabelRenderer` - for rendering parameter names

**Returns:**

the section of the usage help message that lists the parameters

**Since:**

4.4


---

### hasAtFileParameter

<span style="font-family: monospace; font-size: 80%;">public boolean __hasAtFileParameter__()</span>

Returns true if the usage help should show the at file parameter in the parameter list, otherwise false.

**Since:**

4.3


---

### atFileParameterList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __atFileParameterList__()</span>

Returns the section of the usage help message that lists the @-file and its description.

**Returns:**

the section of the usage help message that lists the @-file and its description

**Since:**

4.2


---

### endOfOptionsList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __endOfOptionsList__()</span>

Returns the section of the usage help message that lists the `--` End of Options delimiter and its description.

**Returns:**

the section of the usage help message that lists the `--` End of Options delimiter and its description.

**Since:**

4.3


---

### join

<span style="font-family: monospace; font-size: 80%;">public static [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) __join__([Ansi](CommandLine.Help.Ansi.md) ansi, int usageHelpWidth, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values, [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>





!!! note "Deprecation"
    Use [join.join](#join)  instead


---

### join

<span style="font-family: monospace; font-size: 80%;">public static [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) __join__([Ansi](CommandLine.Help.Ansi.md) ansi, int usageHelpWidth, boolean adjustCJK, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values, [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) sb, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Formats each of the specified values and appends it to the specified StringBuilder.

**Parameters:**

`ansi` - whether the result should contain ANSI escape codes or not

`usageHelpWidth` - the width of the usage help message

`adjustCJK` - true if wide Chinese, Japanese and Korean characters should be counted as double the size of other characters for line-breaking purposes

`values` - the values to format and append to the StringBuilder

`sb` - the StringBuilder to collect the formatted strings

`params` - the parameters to pass to the format method when formatting each value

**Returns:**

the specified StringBuilder

**Since:**

4.0


---

### customSynopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __customSynopsis__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns command custom synopsis as a string.A custom synopsis can be zero or more lines, and can be
 specified declaratively with the [Command.customSynopsis](#customsynopsis) annotation attribute or programmatically
 by setting the Help instance's [Help.customSynopsis](#customsynopsis) field.

**Parameters:**

`params` - Arguments referenced by the format specifiers in the synopsis strings

**Returns:**

the custom synopsis lines combined into a single String (which may be empty)


---

### description

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __description__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns command description text as a string.Description text can be zero or more lines, and can be specified
 declaratively with the [Command.description](#description) annotation attribute or programmatically by
 setting the Help instance's [Help.description](#description) field.

**Parameters:**

`params` - Arguments referenced by the format specifiers in the description strings

**Returns:**

the description lines combined into a single String (which may be empty)


---

### header

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __header__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the command header text as a string.Header text can be zero or more lines, and can be specified
 declaratively with the [Command.header](#header) annotation attribute or programmatically by
 setting the Help instance's [Help.header](#header) field.

**Parameters:**

`params` - Arguments referenced by the format specifiers in the header strings

**Returns:**

the header lines combined into a single String (which may be empty)


---

### footer

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __footer__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns command footer text as a string.Footer text can be zero or more lines, and can be specified
 declaratively with the [Command.footer](#footer) annotation attribute or programmatically by
 setting the Help instance's [Help.footer](#footer) field.

**Parameters:**

`params` - Arguments referenced by the format specifiers in the footer strings

**Returns:**

the footer lines combined into a single String (which may be empty)


---

### headerHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __headerHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the header text; the result of `String.format(headerHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the header heading

**Returns:**

the formatted header heading


---

### synopsisHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsisHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the synopsis text; the result of `String.format(synopsisHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the synopsis heading

**Returns:**

the formatted synopsis heading


---

### descriptionHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __descriptionHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the description text; an empty string if there is no description,
 otherwise the result of `String.format(descriptionHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the description heading

**Returns:**

the formatted description heading


---

### parameterListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __parameterListHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the positional parameter list; an empty string if there are no positional
 parameters, otherwise the result of `String.format(parameterListHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the parameter list heading

**Returns:**

the formatted parameter list heading


---

### optionListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionListHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the option list; an empty string if there are no options,
 otherwise the result of `String.format(optionListHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the option list heading

**Returns:**

the formatted option list heading


---

### commandListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __commandListHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the command list; an empty string if there are no commands,
 otherwise the result of `String.format(commandListHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the command list heading

**Returns:**

the formatted command list heading


---

### footerHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __footerHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the footer text; the result of `String.format(footerHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the footer heading

**Returns:**

the formatted footer heading


---

### exitCodeListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __exitCodeListHeading__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns the text displayed before the exit code list text; the result of `String.format(exitCodeHeading, params)`.

**Parameters:**

`params` - the parameters to use to format the exit code heading

**Returns:**

the formatted heading of the exit code section of the usage help message

**Since:**

4.0


---

### exitCodeList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __exitCodeList__()</span>

Returns a 2-column list with exit codes and their description.Descriptions containing `"%n"` line separators are broken up into multiple lines.

**Returns:**

a usage help section describing the exit codes

**Since:**

4.0


---

### createHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __createHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Returns a String that can be used as a help section heading.Embedded `%n` format
specifiers will be converted to platform-specific line breaks. Long lines will be wrapped
on word boundaries to ensure they do not exceed the usage message width.
Embedded `@|style[,style] ...|@` markup will be converted to Ansi escape codes when
Ansi is enabled, and stripped out otherwise.

**Parameters:**

`text` - a printf-style format string that may one or more embedded format specifiers

`params` - optional parameters to use when formatting the specified text string

**Returns:**

a help section heading String

**Since:**

4.1


---

### createTextTable

<span style="font-family: monospace; font-size: 80%;">public [TextTable](CommandLine.Help.TextTable.md) __createTextTable__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<?, ?> map)</span>

Returns a 2-column `TextTable` containing data from the specified map:
the keys are put in the left column and the map values are in the right column.


The width of the left column is the width of the longest key, plus 3 for spacing between the columns.


All map entries are converted to Strings and any embedded `%n` format
specifiers are converted to platform-specific line breaks. Long lines are wrapped
on word boundaries to ensure they do not exceed the column width.


Embedded `@|style[,style] ...|@` markup will be converted to Ansi escape codes when
Ansi is enabled, and stripped out otherwise.

**Parameters:**

`map` - the map to convert to a `TextTable`

**Returns:**

a 2-column `TextTable` containing data from the specified map

**Since:**

4.1


---

### commandList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __commandList__()</span>

Returns a 2-column list with the command names and first line of their header or (if absent) description of the commands returned by [subcommands.subcommands](#subcommands).

**Returns:**

a usage help section describing the added commands

**See Also:**


[commandList](#commandlist)



---

### commandList

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __commandList__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [Help](CommandLine.Help.md)> subcommands)</span>

Returns a 2-column list with the command names and first line of their header or (if absent) description of the specified command map.

**Returns:**

a usage help section describing the added commands

**Since:**

4.4

**See Also:**


[subcommands](#subcommands)


[allSubcommands](#allsubcommands)



---

### commandNamesText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __commandNamesText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)</span>

Returns a `Text` object containing the command name and all aliases, separated with the specified separator.Command names will use the ColorScheme#commandText(String) for the color scheme of this Help.

**Since:**

3.9


---

### createDefaultLayout

<span style="font-family: monospace; font-size: 80%;">public [Layout](CommandLine.Help.Layout.md) __createDefaultLayout__()</span>

Returns a `Layout` instance configured with the user preferences captured in this Help instance.

**Returns:**

a Layout


---

### createDefaultLayout

<span style="font-family: monospace; font-size: 80%;">public [Layout](CommandLine.Help.Layout.md) __createDefaultLayout__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionals, [ColorScheme](CommandLine.Help.ColorScheme.md) aColorScheme)</span>

Returns a `Layout` instance configured with the user preferences captured in this Help instance.

**Parameters:**

`options` - used to calculate the long options column width in the layout

`positionals` - used to calculate the long options column width in the layout

`aColorScheme` - used in the layout to create [Text](CommandLine.Help.Ansi.Text.md) values

**Returns:**

a Layout with the default columns

**Since:**

4.4


---

### calcLongOptionColumnWidth

<span style="font-family: monospace; font-size: 80%;">public int __calcLongOptionColumnWidth__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> options, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> positionals, [ColorScheme](CommandLine.Help.ColorScheme.md) aColorScheme)</span>

Returns the width of the long options column in the usage help message.

**Parameters:**

`options` - the options shown in the usage help message

`positionals` - the positional parameters shown in the usage help message

`aColorScheme` - the colorscheme used in the layout to create [Text](CommandLine.Help.Ansi.Text.md) values

**Returns:**

the width of the long options column in the layout

**Since:**

4.6


---

### createDefaultOptionRenderer

<span style="font-family: monospace; font-size: 80%;">public [IOptionRenderer](CommandLine.Help.IOptionRenderer.md) __createDefaultOptionRenderer__()</span>

Returns a new default OptionRenderer which converts [OptionSpec](CommandLine.Model.OptionSpec.md) to five columns of text to match
  the default [TextTable](CommandLine.Help.TextTable.md) column layout.The first row of values looks like this:
 
 the required option marker
 2-character short option name (or empty string if no short option exists)
 comma separator (only if both short option and long option exist, empty string otherwise)
 comma-separated string with long option name(s)
 first element of the [OptionSpec.description](#description) array
 
 

Following this, there will be one row for each of the remaining elements of the [OptionSpec.description](#description) array, and these rows look like `{"", "", "", "", option.description()[i]}`.
 

If configured, this option renderer adds an additional row to display the default field value.

**Returns:**

a new default OptionRenderer


---

### createMinimalOptionRenderer

<span style="font-family: monospace; font-size: 80%;">public static [IOptionRenderer](CommandLine.Help.IOptionRenderer.md) __createMinimalOptionRenderer__()</span>

Returns a new minimal OptionRenderer which converts [OptionSpec](CommandLine.Model.OptionSpec.md) to a single row with two columns
 of text: an option name and a description.If multiple names or descriptions exist, the first value is used.

**Returns:**

a new minimal OptionRenderer


---

### createDefaultParameterRenderer

<span style="font-family: monospace; font-size: 80%;">public [IParameterRenderer](CommandLine.Help.IParameterRenderer.md) __createDefaultParameterRenderer__()</span>

Returns a new default ParameterRenderer which converts [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) to four columns of
 text to match the default [TextTable](CommandLine.Help.TextTable.md) column layout.The first row of values looks like this:
 
 empty string 
 empty string 
 parameter(s) label as rendered by the [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md)
 first element of the [PositionalParamSpec.description](#description) array
 
 

Following this, there will be one row for each of the remaining elements of the [PositionalParamSpec.description](#description) array, and these rows look like `{"", "", "", param.description()[i]}`.
 

If configured, this parameter renderer adds an additional row to display the default field value.

**Returns:**

a new default ParameterRenderer


---

### createMinimalParameterRenderer

<span style="font-family: monospace; font-size: 80%;">public static [IParameterRenderer](CommandLine.Help.IParameterRenderer.md) __createMinimalParameterRenderer__()</span>

Returns a new minimal ParameterRenderer which converts [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)
 to a single row with two columns of text: an option name and a description.If multiple descriptions exist, the first value is used.

**Returns:**

a new minimal ParameterRenderer


---

### createMinimalParamLabelRenderer

<span style="font-family: monospace; font-size: 80%;">public static [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) __createMinimalParamLabelRenderer__()</span>

Returns a value renderer that returns the `paramLabel` if defined or the field name otherwise.

**Returns:**

a new minimal ParamLabelRenderer


---

### createDefaultParamLabelRenderer

<span style="font-family: monospace; font-size: 80%;">public [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) __createDefaultParamLabelRenderer__()</span>

Returns a new default param label renderer that separates option parameters from their option name
 with the specified separator string, and, unless ArgSpec#hideParamSyntax() is true,
 surrounds optional parameters with `'['` and `']'`
 characters and uses ellipses ("...") to indicate that any number of a parameter are allowed.

**Returns:**

a new default ParamLabelRenderer


---

### createShortOptionNameComparator

<span style="font-family: monospace; font-size: 80%;">public static [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __createShortOptionNameComparator__()</span>

Sorts [OptionSpec](CommandLine.Model.OptionSpec.md) by their option name in case-insensitive alphabetic order.If an
 option has multiple names, the shortest name is used for the sorting. Help options follow non-help options.

**Returns:**

a comparator that sorts OptionSpecs by their option name in case-insensitive alphabetic order


---

### createShortOptionArityAndNameComparator

<span style="font-family: monospace; font-size: 80%;">public static [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __createShortOptionArityAndNameComparator__()</span>

Sorts [OptionSpec](CommandLine.Model.OptionSpec.md) by their option max arity first, by
 min arity next, and by [createShortOptionNameComparator.createShortOptionNameComparator](#createshortoptionnamecomparator) last.

**Returns:**

a comparator that sorts OptionSpecs by arity first, then their option name


---

### shortestFirst

<span style="font-family: monospace; font-size: 80%;">public static [Comparator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Comparator.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __shortestFirst__()</span>

Sorts short strings before longer strings.

**Returns:**

a comparators that sorts short strings before longer strings


---

### ansi

<span style="font-family: monospace; font-size: 80%;">public [Ansi](CommandLine.Help.Ansi.md) __ansi__()</span>

Returns whether ANSI escape codes are enabled or not.

**Returns:**

whether ANSI escape codes are enabled or not


---

### defaultColorScheme

<span style="font-family: monospace; font-size: 80%;">public static [ColorScheme](CommandLine.Help.ColorScheme.md) __defaultColorScheme__([Ansi](CommandLine.Help.Ansi.md) ansi)</span>

Creates and returns a new [ColorScheme](CommandLine.Help.ColorScheme.md) initialized with picocli default values: commands are bold,
  options and parameters use a yellow foreground, and option parameters use italic.

**Parameters:**

`ansi` - whether the usage help message should contain ANSI escape codes or not

**Returns:**

a new default color scheme


---

