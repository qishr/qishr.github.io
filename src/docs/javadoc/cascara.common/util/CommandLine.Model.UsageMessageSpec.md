Package [io.github.qishr.cascara.common.util](index.md)

# Class UsageMessageSpec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.UsageMessageSpec<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __UsageMessageSpec__</span>

Models the usage help message specification and can be used to customize the usage help message.


 This class provides two ways to customize the usage help message:
 
 
     Change the text of the predefined sections (this may also be done declaratively using the annotations)
     Add custom sections, or remove or re-order predefined sections
 
 


 The pre-defined sections have getters and setters that return a String (or array of Strings). For example:
 [description](#description) and [description](#description) or [header](#header) and [header](#header).
 


 Changing the section order, or adding custom sections can be accomplished with [sectionKeys](#sectionkeys) and [sectionMap](#sectionmap).
 This gives complete freedom on how a usage help message section is rendered, but it also means that the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)
 is responsible for all aspects of rendering the section, including layout and emitting ANSI escape codes.
 The Help.TextTable and Help.Ansi.Text classes, and the CommandLine.Help.Ansi#string(String) and CommandLine.Help.Ansi#text(String) methods may be useful.
 


 The usage help message is created more or less like this:
 
 
 // CommandLine.usage(...) or CommandLine.getUsageMessage(...)
 Help.ColorScheme colorScheme = Help.defaultColorScheme(Help.Ansi.AUTO);
 Help help = getHelpFactory().create(getCommandSpec(), colorScheme)
 StringBuilder result = new StringBuilder();
 for (String key : getHelpSectionKeys()) {
     IHelpSectionRenderer renderer = getHelpSectionMap().get(key);
     if (renderer != null) { result.append(renderer.render(help)); }
 }
 // return or print result
 
 


 Where the default [sectionMap](#sectionmap) is constructed like this:
 ` // The default section renderers delegate to methods in Help for their implementation
 // (using Java 8 lambda notation for brevity):
 Map<String, IHelpSectionRenderer> sectionMap = new HashMap<>();
 sectionMap.put(SECTION_KEY_HEADER_HEADING,         help -> help.headerHeading());
 sectionMap.put(SECTION_KEY_HEADER,                 help -> help.header());
 sectionMap.put(SECTION_KEY_SYNOPSIS_HEADING,       help -> help.synopsisHeading());      //e.g. Usage:
 sectionMap.put(SECTION_KEY_SYNOPSIS,               help -> help.synopsis(help.synopsisHeadingLength())); //e.g. <cmd> [OPTIONS] <subcmd> [COMMAND-OPTIONS] [ARGUMENTS]
 sectionMap.put(SECTION_KEY_DESCRIPTION_HEADING,    help -> help.descriptionHeading());   //e.g. %nDescription:%n%n
 sectionMap.put(SECTION_KEY_DESCRIPTION,            help -> help.description());          //e.g. {"Converts foos to bars.", "Use options to control conversion mode."}
 sectionMap.put(SECTION_KEY_PARAMETER_LIST_HEADING, help -> help.parameterListHeading()); //e.g. %nPositional parameters:%n%n
 sectionMap.put(SECTION_KEY_PARAMETER_LIST,         help -> help.parameterList());        //e.g. [FILE...] the files to convert
 sectionMap.put(SECTION_KEY_OPTION_LIST_HEADING,    help -> help.optionListHeading());    //e.g. %nOptions:%n%n
 sectionMap.put(SECTION_KEY_OPTION_LIST,            help -> help.optionList());           //e.g. -h, --help   displays this help and exits
 sectionMap.put(SECTION_KEY_COMMAND_LIST_HEADING,   help -> help.commandListHeading());   //e.g. %nCommands:%n%n
 sectionMap.put(SECTION_KEY_COMMAND_LIST,           help -> help.commandList());          //e.g.    add       adds the frup to the frooble
 sectionMap.put(SECTION_KEY_EXIT_CODE_LIST_HEADING, help -> help.exitCodeListHeading());
 sectionMap.put(SECTION_KEY_EXIT_CODE_LIST,         help -> help.exitCodeList());
 sectionMap.put(SECTION_KEY_FOOTER_HEADING,         help -> help.footerHeading());
 sectionMap.put(SECTION_KEY_FOOTER,                 help -> help.footer());
 `


## Field Summary

| Modifier and Type          | Field                                                                     | Description                                                                                                                                                                               |
|----------------------------|---------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static final int    | [DEFAULT_USAGE_WIDTH](#default_usage_width)                               | Constant holding the default usage message width: .                                                                                                                                       |
| public static final String | [SECTION_KEY_AT_FILE_PARAMETER](#section_key_at_file_parameter)           | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the @-file parameter list section.    |
| public static final String | [SECTION_KEY_COMMAND_LIST](#section_key_command_list)                     | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Subcommand List section.          |
| public static final String | [SECTION_KEY_COMMAND_LIST_HEADING](#section_key_command_list_heading)     | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Subcommand List Heading section.  |
| public static final String | [SECTION_KEY_DESCRIPTION](#section_key_description)                       | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Description section.              |
| public static final String | [SECTION_KEY_DESCRIPTION_HEADING](#section_key_description_heading)       | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Description Heading section.      |
| public static final String | [SECTION_KEY_END_OF_OPTIONS](#section_key_end_of_options)                 | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the `--` End of Options list section. |
| public static final String | [SECTION_KEY_EXIT_CODE_LIST](#section_key_exit_code_list)                 | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Exit Code List section.           |
| public static final String | [SECTION_KEY_EXIT_CODE_LIST_HEADING](#section_key_exit_code_list_heading) | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Exit Code List Heading section.   |
| public static final String | [SECTION_KEY_FOOTER](#section_key_footer)                                 | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Footer section.                   |
| public static final String | [SECTION_KEY_FOOTER_HEADING](#section_key_footer_heading)                 | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Footer Heading section.           |
| public static final String | [SECTION_KEY_HEADER](#section_key_header)                                 | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Header section.                   |
| public static final String | [SECTION_KEY_HEADER_HEADING](#section_key_header_heading)                 | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Header Heading section.           |
| public static final String | [SECTION_KEY_OPTION_LIST](#section_key_option_list)                       | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Option List section.              |
| public static final String | [SECTION_KEY_OPTION_LIST_HEADING](#section_key_option_list_heading)       | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Option List Heading section.      |
| public static final String | [SECTION_KEY_PARAMETER_LIST](#section_key_parameter_list)                 | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Parameter List section.           |
| public static final String | [SECTION_KEY_PARAMETER_LIST_HEADING](#section_key_parameter_list_heading) | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Parameter List Heading section.   |
| public static final String | [SECTION_KEY_SYNOPSIS](#section_key_synopsis)                             | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Synopsis section.                 |
| public static final String | [SECTION_KEY_SYNOPSIS_HEADING](#section_key_synopsis_heading)             | [sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Synopsis Heading section.         |



## Constructor Summary

| Constructor        | Description |
|--------------------|-------------|
| UsageMessageSpec() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                                                                | Method                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                        |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [width](#width)(int newValue)                                                                                                                                                                                                                                                                                              | Sets the maximum usage help message width to the specified value.                                                                                                                                                                                                                                                                  |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [longOptionsMaxWidth](#longoptionsmaxwidth)(int newValue)                                                                                                                                                                                                                                                                  | Sets the maximum usage help long options column max width to the specified value.                                                                                                                                                                                                                                                  |
| public int                                                                                                                                                                                                                                                                                       | [width](#width)()                                                                                                                                                                                                                                                                                                          | Returns the maximum usage help message width.                                                                                                                                                                                                                                                                                      |
| public int                                                                                                                                                                                                                                                                                       | [longOptionsMaxWidth](#longoptionsmaxwidth)()                                                                                                                                                                                                                                                                              | Returns the maximum usage help long options column max width to the specified value.                                                                                                                                                                                                                                               |
| public boolean                                                                                                                                                                                                                                                                                   | [autoWidth](#autowidth)()                                                                                                                                                                                                                                                                                                  | Returns whether picocli should attempt to detect the terminal size and adjust the usage help message width  to take the full terminal width.                                                                                                                                                                                       |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [autoWidth](#autowidth)(boolean detectTerminalSize)                                                                                                                                                                                                                                                                        | Sets whether picocli should attempt to detect the terminal size and adjust the usage help message width  to take the full terminal width.                                                                                                                                                                                          |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                                                                    | [sectionKeys](#sectionkeys)()                                                                                                                                                                                                                                                                                              | Returns the section keys in the order that the usage help message should render the sections.                                                                                                                                                                                                                                      |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [sectionKeys](#sectionkeys)([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> keys)                                                                                                   | Sets the section keys in the order that the usage help message should render the sections.                                                                                                                                                                                                                                         |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)>                                         | [sectionMap](#sectionmap)()                                                                                                                                                                                                                                                                                                | Returns the map of section keys and renderers used to construct the usage help message.                                                                                                                                                                                                                                            |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [sectionMap](#sectionmap)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)> map)                                           | Sets the map of section keys and renderers used to construct the usage help message to a copy of the specified map.                                                                                                                                                                                                                |
| public [IHelpFactory](CommandLine.IHelpFactory.md)                                                                                                                                                                                                                                               | [helpFactory](#helpfactory)()                                                                                                                                                                                                                                                                                              | Returns the `IHelpFactory` that is used to construct the usage help message.                                                                                                                                                                                                                                                       |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [helpFactory](#helpfactory)([IHelpFactory](CommandLine.IHelpFactory.md) helpFactory)                                                                                                                                                                                                                                       | Sets a new `IHelpFactory` to customize the usage help message.                                                                                                                                                                                                                                                                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [headerHeading](#headerheading)()                                                                                                                                                                                                                                                                                          | Returns the optional heading preceding the header section.                                                                                                                                                                                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                                                                                            | [header](#header)()                                                                                                                                                                                                                                                                                                        | Returns the optional header lines displayed at the top of the help message.                                                                                                                                                                                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [synopsisHeading](#synopsisheading)()                                                                                                                                                                                                                                                                                      | Returns the optional heading preceding the synopsis.                                                                                                                                                                                                                                                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [synopsisSubcommandLabel](#synopsissubcommandlabel)()                                                                                                                                                                                                                                                                      | Returns the String representing the subcommands in the synopsis.                                                                                                                                                                                                                                                                   |
| public double                                                                                                                                                                                                                                                                                    | [synopsisAutoIndentThreshold](#synopsisautoindentthreshold)()                                                                                                                                                                                                                                                              | Returns the fraction of the usage help [width.width](#width) that is the threshold up to which  the 2nd line and subsequent lines of a multi-line synopsis should be aligned to the end of the command name.                                                                                                                       |
| public int                                                                                                                                                                                                                                                                                       | [synopsisIndent](#synopsisindent)()                                                                                                                                                                                                                                                                                        | Returns the indentation to use on the 2nd line and subsequent lines of a multi-line synopsis  when the length of the synopsis heading and the fully qualified command name exceed the [width.width](#width) times the [synopsisAutoIndentThreshold.synopsisAutoIndentThreshold](#synopsisautoindentthreshold), `-1` by default.    |
| public boolean                                                                                                                                                                                                                                                                                   | [abbreviateSynopsis](#abbreviatesynopsis)()                                                                                                                                                                                                                                                                                | Returns whether the synopsis line(s) should show an abbreviated synopsis without detailed option names.                                                                                                                                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                                                                                            | [customSynopsis](#customsynopsis)()                                                                                                                                                                                                                                                                                        | Returns the optional custom synopsis lines to use instead of the auto-generated synopsis.                                                                                                                                                                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [descriptionHeading](#descriptionheading)()                                                                                                                                                                                                                                                                                | Returns the optional heading preceding the description section.                                                                                                                                                                                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                                                                                            | [description](#description)()                                                                                                                                                                                                                                                                                              | Returns the optional text lines to use as the description of the help message, displayed between the synopsis and the  options list.                                                                                                                                                                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [parameterListHeading](#parameterlistheading)()                                                                                                                                                                                                                                                                            | Returns the optional heading preceding the parameter list.                                                                                                                                                                                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [optionListHeading](#optionlistheading)()                                                                                                                                                                                                                                                                                  | Returns the optional heading preceding the options list.                                                                                                                                                                                                                                                                           |
| public boolean                                                                                                                                                                                                                                                                                   | [sortOptions](#sortoptions)()                                                                                                                                                                                                                                                                                              | Returns whether the options list in the usage help message should be sorted alphabetically.                                                                                                                                                                                                                                        |
| public boolean                                                                                                                                                                                                                                                                                   | [sortSynopsis](#sortsynopsis)()                                                                                                                                                                                                                                                                                            | Returns whether the options in the synopsis should be sorted alphabetically.                                                                                                                                                                                                                                                       |
| public char                                                                                                                                                                                                                                                                                      | [requiredOptionMarker](#requiredoptionmarker)()                                                                                                                                                                                                                                                                            | Returns the character used to prefix required options in the options list.                                                                                                                                                                                                                                                         |
| public boolean                                                                                                                                                                                                                                                                                   | [showDefaultValues](#showdefaultvalues)()                                                                                                                                                                                                                                                                                  | Returns whether the options list in the usage help message should show default values for all non-boolean options.                                                                                                                                                                                                                 |
| public boolean                                                                                                                                                                                                                                                                                   | [showAtFileInUsageHelp](#showatfileinusagehelp)()                                                                                                                                                                                                                                                                          | Sets whether to show a `[@<filename>...]` entry in the synopsis and parameter list of the usage help message.                                                                                                                                                                                                                      |
| public boolean                                                                                                                                                                                                                                                                                   | [showEndOfOptionsDelimiterInUsageHelp](#showendofoptionsdelimiterinusagehelp)()                                                                                                                                                                                                                                            | Sets whether to show a `[--]` (End of Options) entry in the synopsis and options list of the usage help message.                                                                                                                                                                                                                   |
| public boolean                                                                                                                                                                                                                                                                                   | [hidden](#hidden)()                                                                                                                                                                                                                                                                                                        | Returns whether this command should be hidden from the usage help message of the parent command.                                                                                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [commandListHeading](#commandlistheading)()                                                                                                                                                                                                                                                                                | Returns the optional heading preceding the subcommand list.                                                                                                                                                                                                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [exitCodeListHeading](#exitcodelistheading)()                                                                                                                                                                                                                                                                              | Returns the optional heading preceding the exit codes section, may contain `"%n"` line separators.                                                                                                                                                                                                                                 |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>        | [exitCodeList](#exitcodelist)()                                                                                                                                                                                                                                                                                            | Returns an unmodifiable map with values to be displayed in the exit codes section: keys are exit codes, values are descriptions.                                                                                                                                                                                                   |
| public static [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [keyValuesMap](#keyvaluesmap)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] entries)                                                                                                                                                                                      | Creates and returns a `Map` that contains an entry for each specified String that is in `"key:value"` format.                                                                                                                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                                                              | [footerHeading](#footerheading)()                                                                                                                                                                                                                                                                                          | Returns the optional heading preceding the footer section.                                                                                                                                                                                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                                                                                            | [footer](#footer)()                                                                                                                                                                                                                                                                                                        | Returns the optional footer text lines displayed at the bottom of the help message.                                                                                                                                                                                                                                                |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [headerHeading](#headerheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) headerHeading)                                                                                                                                                                                | Sets the heading preceding the header section.                                                                                                                                                                                                                                                                                     |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [header](#header)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] header)                                                                                                                                                                                                   | Sets the optional header lines displayed at the top of the help message.                                                                                                                                                                                                                                                           |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [synopsisHeading](#synopsisheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                                 | Sets the optional heading preceding the synopsis.                                                                                                                                                                                                                                                                                  |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [synopsisSubcommandLabel](#synopsissubcommandlabel)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                 | Sets the String representing the subcommands in the synopsis.                                                                                                                                                                                                                                                                      |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [synopsisAutoIndentThreshold](#synopsisautoindentthreshold)(double newValue)                                                                                                                                                                                                                                               | Sets the fraction of the usage help [width.width](#width) that is the threshold up to which  the 2nd line and subsequent lines of a multi-line synopsis should be aligned to the end of the command name.                                                                                                                          |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [synopsisIndent](#synopsisindent)(int newValue)                                                                                                                                                                                                                                                                            | Sets the indentation to use on the 2nd line and subsequent lines of a multi-line synopsis  when the length of the synopsis heading and the fully qualified command name exceed the [synopsisAutoIndentThreshold.synopsisAutoIndentThreshold](#synopsisautoindentthreshold) fraction of the [width.width](#width), `-1` by default. |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [abbreviateSynopsis](#abbreviatesynopsis)(boolean newValue)                                                                                                                                                                                                                                                                | Sets whether the synopsis line(s) should show an abbreviated synopsis without detailed option names.                                                                                                                                                                                                                               |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [customSynopsis](#customsynopsis)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] customSynopsis)                                                                                                                                                                           | Sets the optional custom synopsis lines to use instead of the auto-generated synopsis.                                                                                                                                                                                                                                             |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [descriptionHeading](#descriptionheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                           | Sets the heading preceding the description section.                                                                                                                                                                                                                                                                                |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [description](#description)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] description)                                                                                                                                                                                    | Sets the optional text lines to use as the description of the help message, displayed between the synopsis and the  options list.                                                                                                                                                                                                  |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [parameterListHeading](#parameterlistheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                       | Sets the optional heading preceding the parameter list.                                                                                                                                                                                                                                                                            |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [optionListHeading](#optionlistheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                             | Sets the heading preceding the options list.                                                                                                                                                                                                                                                                                       |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [sortOptions](#sortoptions)(boolean newValue)                                                                                                                                                                                                                                                                              | Sets whether the options list in the usage help message should be sorted alphabetically.                                                                                                                                                                                                                                           |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [sortSynopsis](#sortsynopsis)(boolean newValue)                                                                                                                                                                                                                                                                            | Sets whether the options in the synopsis should be sorted alphabetically.                                                                                                                                                                                                                                                          |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [requiredOptionMarker](#requiredoptionmarker)(char newValue)                                                                                                                                                                                                                                                               | Sets the character used to prefix required options in the options list.                                                                                                                                                                                                                                                            |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [showDefaultValues](#showdefaultvalues)(boolean newValue)                                                                                                                                                                                                                                                                  | Sets whether the options list in the usage help message should show default values for all non-boolean options.                                                                                                                                                                                                                    |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [showAtFileInUsageHelp](#showatfileinusagehelp)(boolean newValue)                                                                                                                                                                                                                                                          | Sets whether to show a `[@<filename>...]` entry in the synopsis and parameter list of the usage help message.                                                                                                                                                                                                                      |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [showEndOfOptionsDelimiterInUsageHelp](#showendofoptionsdelimiterinusagehelp)(boolean newValue)                                                                                                                                                                                                                            | Sets whether to show a `[--]` (End of Options) entry in the synopsis and options list of the usage help message.                                                                                                                                                                                                                   |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [hidden](#hidden)(boolean value)                                                                                                                                                                                                                                                                                           | Set the hidden flag on this command to control whether to show or hide it in the help usage text of the parent command.                                                                                                                                                                                                            |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [commandListHeading](#commandlistheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                           | Sets the optional heading preceding the subcommand list.                                                                                                                                                                                                                                                                           |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [exitCodeListHeading](#exitcodelistheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                         | Sets the optional heading preceding the exit codes section, may contain `"%n"` line separators.                                                                                                                                                                                                                                    |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [exitCodeList](#exitcodelist)([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> newValue) | Sets the values to be displayed in the exit codes section: keys are exit codes, values are descriptions.                                                                                                                                                                                                                           |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [footerHeading](#footerheading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                                                                                     | Sets the optional heading preceding the footer section.                                                                                                                                                                                                                                                                            |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [footer](#footer)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] footer)                                                                                                                                                                                                   | Sets the optional footer text lines displayed at the bottom of the help message.                                                                                                                                                                                                                                                   |
| public [Messages](CommandLine.Model.Messages.md)                                                                                                                                                                                                                                                 | [messages](#messages)()                                                                                                                                                                                                                                                                                                    | Returns the Messages for this usage help message specification, or `null`.                                                                                                                                                                                                                                                         |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [messages](#messages)([Messages](CommandLine.Model.Messages.md) msgs)                                                                                                                                                                                                                                                      | Sets the Messages for this usageMessage specification, and returns this UsageMessageSpec.                                                                                                                                                                                                                                          |
| public boolean                                                                                                                                                                                                                                                                                   | [adjustLineBreaksForWideCJKCharacters](#adjustlinebreaksforwidecjkcharacters)()                                                                                                                                                                                                                                            | Returns whether line breaks should take wide Chinese, Japanese and Korean characters into account for line-breaking purposes.                                                                                                                                                                                                      |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                                                                 | [adjustLineBreaksForWideCJKCharacters](#adjustlinebreaksforwidecjkcharacters)(boolean adjustForWideChars)                                                                                                                                                                                                                  | Sets whether line breaks should take wide Chinese, Japanese and Korean characters into account, and returns this UsageMessageSpec.                                                                                                                                                                                                 |



## Field Details

### DEFAULT_USAGE_WIDTH

<span style="font-family: monospace; font-size: 80%;">public static final int __DEFAULT_USAGE_WIDTH__</span>

Constant holding the default usage message width: .


---

### SECTION_KEY_AT_FILE_PARAMETER

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_AT_FILE_PARAMETER__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the @-file parameter list section.The default renderer for this section calls Help#atFileParameterList().


---

### SECTION_KEY_COMMAND_LIST

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_COMMAND_LIST__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Subcommand List section.The default renderer for this section calls Help#commandList().


---

### SECTION_KEY_COMMAND_LIST_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_COMMAND_LIST_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Subcommand List Heading section.The default renderer for this section calls [Help.commandListHeading](#commandlistheading).


---

### SECTION_KEY_DESCRIPTION

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_DESCRIPTION__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Description section.The default renderer for this section calls [Help.description](#description).


---

### SECTION_KEY_DESCRIPTION_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_DESCRIPTION_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Description Heading section.The default renderer for this section calls [Help.descriptionHeading](#descriptionheading).


---

### SECTION_KEY_END_OF_OPTIONS

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_END_OF_OPTIONS__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the `--` End of Options list section.The default renderer for this section calls Help#endOfOptionsList().


---

### SECTION_KEY_EXIT_CODE_LIST

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_EXIT_CODE_LIST__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Exit Code List section.The default renderer for this section calls [Help.exitCodeList](#exitcodelist).


---

### SECTION_KEY_EXIT_CODE_LIST_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_EXIT_CODE_LIST_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Exit Code List Heading section.The default renderer for this section calls [Help.exitCodeListHeading](#exitcodelistheading).


---

### SECTION_KEY_FOOTER

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_FOOTER__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Footer section.The default renderer for this section calls [Help.footer](#footer).


---

### SECTION_KEY_FOOTER_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_FOOTER_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Footer Heading section.The default renderer for this section calls [Help.footerHeading](#footerheading).


---

### SECTION_KEY_HEADER

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_HEADER__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Header section.The default renderer for this section calls [Help.header](#header).


---

### SECTION_KEY_HEADER_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_HEADER_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Header Heading section.The default renderer for this section calls [Help.headerHeading](#headerheading).


---

### SECTION_KEY_OPTION_LIST

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_OPTION_LIST__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Option List section.The default renderer for this section calls Help#optionList().


---

### SECTION_KEY_OPTION_LIST_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_OPTION_LIST_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Option List Heading section.The default renderer for this section calls [Help.optionListHeading](#optionlistheading).


---

### SECTION_KEY_PARAMETER_LIST

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_PARAMETER_LIST__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Parameter List section.The default renderer for this section calls Help#parameterList().


---

### SECTION_KEY_PARAMETER_LIST_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_PARAMETER_LIST_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Parameter List Heading section.The default renderer for this section calls [Help.parameterListHeading](#parameterlistheading).


---

### SECTION_KEY_SYNOPSIS

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_SYNOPSIS__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Synopsis section.The default renderer for this section calls Help#synopsis(int).


---

### SECTION_KEY_SYNOPSIS_HEADING

<span style="font-family: monospace; font-size: 80%;">public static final String __SECTION_KEY_SYNOPSIS_HEADING__</span>

[sectionKeys.sectionKeys](#sectionkeys) to [sectionMap.sectionMap](#sectionmap) the [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md) for the Synopsis Heading section.The default renderer for this section calls [Help.synopsisHeading](#synopsisheading).


---


## Method Details

### width

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __width__(int newValue)</span>

Sets the maximum usage help message width to the specified value.Longer values are wrapped.

**Parameters:**

`newValue` - the new maximum usage help message width. Must be 55 or greater.

**Returns:**

this `UsageMessageSpec` for method chaining


---

### longOptionsMaxWidth

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __longOptionsMaxWidth__(int newValue)</span>

Sets the maximum usage help long options column max width to the specified value.This value controls the maximum width of the long options column: any positional parameter labels or long options that are longer than the specified value will overflow into the description column, and cause the description to be displayed on the next line.

**Parameters:**

`newValue` - the new maximum usage help long options column max width. Must be 20 or greater, otherwise the new value will be ignored.

**Returns:**

this `UsageMessageSpec` for method chaining

**Since:**

4.2


---

### width

<span style="font-family: monospace; font-size: 80%;">public int __width__()</span>

Returns the maximum usage help message width.Derived from system property `"picocli.usage.width"`
 if set, otherwise returns the value set via the [width.width](#width) method, or if not set, the default width.

**Returns:**

the maximum usage help message width. Never returns less than 55.


---

### longOptionsMaxWidth

<span style="font-family: monospace; font-size: 80%;">public int __longOptionsMaxWidth__()</span>

Returns the maximum usage help long options column max width to the specified value.This value controls the maximum width of the long options column: any positional parameter labels or long options that are longer than the specified value will overflow into the description column, and cause the description to be displayed on the next line.

**Returns:**

the new maximum usage help long options column max width. Always 20 or greater.

**Since:**

4.2


---

### autoWidth

<span style="font-family: monospace; font-size: 80%;">public boolean __autoWidth__()</span>

Returns whether picocli should attempt to detect the terminal size and adjust the usage help message width
 to take the full terminal width.End users may enable this by setting system property `"picocli.usage.width"` to `AUTO`,
 and may disable this by setting this system property to a [width.width](#width).
 This feature requires Java 7 or greater. The default is `false`.

**Since:**

4.0

**See Also:**


[usageHelpAutoWidth](null.md)



---

### autoWidth

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __autoWidth__(boolean detectTerminalSize)</span>

Sets whether picocli should attempt to detect the terminal size and adjust the usage help message width
 to take the full terminal width.The default is `false`.

**Parameters:**

`detectTerminalSize` - whether picocli should attempt to detect the terminal size

**Since:**

4.0

**See Also:**


[usageHelpAutoWidth](null.md)



---

### sectionKeys

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __sectionKeys__()</span>

Returns the section keys in the order that the usage help message should render the sections.This ordering may be modified with the [sectionKeys.sectionKeys](#sectionkeys). The default keys are (in order):

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
  UsageMessageSpec#SECTION_KEY_END_OF_OPTIONS
  UsageMessageSpec#SECTION_KEY_COMMAND_LIST_HEADING
  UsageMessageSpec#SECTION_KEY_COMMAND_LIST
  UsageMessageSpec#SECTION_KEY_EXIT_CODE_LIST_HEADING
  UsageMessageSpec#SECTION_KEY_EXIT_CODE_LIST
  UsageMessageSpec#SECTION_KEY_FOOTER_HEADING
  UsageMessageSpec#SECTION_KEY_FOOTER


**Since:**

3.9


---

### sectionKeys

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __sectionKeys__([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> keys)</span>

Sets the section keys in the order that the usage help message should render the sections.

**Since:**

3.9

**See Also:**


[sectionKeys](#sectionkeys)



---

### sectionMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)> __sectionMap__()</span>

Returns the map of section keys and renderers used to construct the usage help message.The usage help message can be customized by adding, replacing and removing section renderers from this map.
Sections can be reordered with the [sectionKeys.sectionKeys](#sectionkeys).
Sections that are either not in this map or not in the list returned by [sectionKeys.sectionKeys](#sectionkeys) are omitted.

**Since:**

3.9

**See Also:**


[sectionKeys](#sectionkeys)



---

### sectionMap

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __sectionMap__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IHelpSectionRenderer](CommandLine.IHelpSectionRenderer.md)> map)</span>

Sets the map of section keys and renderers used to construct the usage help message to a copy of the specified map.

**Parameters:**

`map` - the mapping of section keys to their renderers, must be non-`null`.

**Returns:**

this UsageMessageSpec for method chaining

**Since:**

3.9

**See Also:**


[sectionKeys](#sectionkeys)


[setHelpSectionMap](null.md)



---

### helpFactory

<span style="font-family: monospace; font-size: 80%;">public [IHelpFactory](CommandLine.IHelpFactory.md) __helpFactory__()</span>

Returns the `IHelpFactory` that is used to construct the usage help message.

**Since:**

3.9

**See Also:**


[setHelpFactory](null.md)



---

### helpFactory

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __helpFactory__([IHelpFactory](CommandLine.IHelpFactory.md) helpFactory)</span>

Sets a new `IHelpFactory` to customize the usage help message.

**Parameters:**

`helpFactory` - the new help factory. Must be non-`null`.

**Returns:**

this `UsageMessageSpec` object, to allow method chaining


---

### headerHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __headerHeading__()</span>

Returns the optional heading preceding the header section.Initialized from [Command.headerHeading](#headerheading), or `""` (empty string).


---

### header

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __header__()</span>

Returns the optional header lines displayed at the top of the help message.For subcommands, the first header line is
 displayed in the list of commands. Values are initialized from [Command.header](#header)
 if the `Command` annotation is present, otherwise this is an empty array and the help message has no
 header. Applications may programmatically set this field to create a custom help message.


---

### synopsisHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsisHeading__()</span>

Returns the optional heading preceding the synopsis.Initialized from [Command.synopsisHeading](#synopsisheading), `"Usage: "` by default.


---

### synopsisSubcommandLabel

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsisSubcommandLabel__()</span>

Returns the String representing the subcommands in the synopsis.Initialized from [Command.synopsisSubcommandLabel](#synopsissubcommandlabel), `"[COMMANDS]"` by default.

**Since:**

4.0


---

### synopsisAutoIndentThreshold

<span style="font-family: monospace; font-size: 80%;">public double __synopsisAutoIndentThreshold__()</span>

Returns the fraction of the usage help [width.width](#width) that is the threshold up to which
 the 2nd line and subsequent lines of a multi-line synopsis should be aligned to the end of the command name.The default value of this attribute is `0.5`.
 If the length of the synopsis heading plus the length of the fully qualified command name exceeds this fraction of the width,
 the 2nd and subsequent rows of a multi-line synopsis will be aligned to the [synopsisIndent.synopsisIndent](#synopsisindent) instead of the end of the command name.

**Since:**

4.0


---

### synopsisIndent

<span style="font-family: monospace; font-size: 80%;">public int __synopsisIndent__()</span>

Returns the indentation to use on the 2nd line and subsequent lines of a multi-line synopsis
 when the length of the synopsis heading and the fully qualified command name exceed the [width.width](#width) times the [synopsisAutoIndentThreshold.synopsisAutoIndentThreshold](#synopsisautoindentthreshold), `-1` by default.A negative value for this option means that the 2nd line and subsequent lines are aligned to the synopsis heading length.
 A positive value means the exact number of spaces to indent for the 2nd line and subsequent lines of the synopsis.

**Since:**

4.0


---

### abbreviateSynopsis

<span style="font-family: monospace; font-size: 80%;">public boolean __abbreviateSynopsis__()</span>

Returns whether the synopsis line(s) should show an abbreviated synopsis without detailed option names.


---

### customSynopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __customSynopsis__()</span>

Returns the optional custom synopsis lines to use instead of the auto-generated synopsis.Initialized from [Command.customSynopsis](#customsynopsis) if the `Command` annotation is present,
 otherwise this is an empty array and the synopsis is generated.
 Applications may programmatically set this field to create a custom help message.


---

### descriptionHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __descriptionHeading__()</span>

Returns the optional heading preceding the description section.Initialized from [Command.descriptionHeading](#descriptionheading), or null.


---

### description

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __description__()</span>

Returns the optional text lines to use as the description of the help message, displayed between the synopsis and the
 options list.Initialized from [Command.description](#description) if the `Command` annotation is present,
 otherwise this is an empty array and the help message has no description.
 Applications may programmatically set this field to create a custom help message.


---

### parameterListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __parameterListHeading__()</span>

Returns the optional heading preceding the parameter list.Initialized from [Command.parameterListHeading](#parameterlistheading), or null.


---

### optionListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __optionListHeading__()</span>

Returns the optional heading preceding the options list.Initialized from [Command.optionListHeading](#optionlistheading), or null.


---

### sortOptions

<span style="font-family: monospace; font-size: 80%;">public boolean __sortOptions__()</span>

Returns whether the options list in the usage help message should be sorted alphabetically.


---

### sortSynopsis

<span style="font-family: monospace; font-size: 80%;">public boolean __sortSynopsis__()</span>

Returns whether the options in the synopsis should be sorted alphabetically.

**Since:**

4.7.8-SNAPSHOT


---

### requiredOptionMarker

<span style="font-family: monospace; font-size: 80%;">public char __requiredOptionMarker__()</span>

Returns the character used to prefix required options in the options list.


---

### showDefaultValues

<span style="font-family: monospace; font-size: 80%;">public boolean __showDefaultValues__()</span>

Returns whether the options list in the usage help message should show default values for all non-boolean options.


---

### showAtFileInUsageHelp

<span style="font-family: monospace; font-size: 80%;">public boolean __showAtFileInUsageHelp__()</span>

Sets whether to show a `[@<filename>...]` entry in the synopsis and parameter list of the usage help message.(The entry is not shown if expanding parameter files is disabled.)

**Since:**

4.2

**See Also:**


[showAtFileInUsageHelp](#showatfileinusagehelp)



---

### showEndOfOptionsDelimiterInUsageHelp

<span style="font-family: monospace; font-size: 80%;">public boolean __showEndOfOptionsDelimiterInUsageHelp__()</span>

Sets whether to show a `[--]` (End of Options) entry in the synopsis and options list of the usage help message.

**Since:**

4.3

**See Also:**


[showEndOfOptionsDelimiterInUsageHelp](#showendofoptionsdelimiterinusagehelp)



---

### hidden

<span style="font-family: monospace; font-size: 80%;">public boolean __hidden__()</span>

Returns whether this command should be hidden from the usage help message of the parent command.

**Returns:**

`true` if this command should not appear in the usage help message of the parent command


---

### commandListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __commandListHeading__()</span>

Returns the optional heading preceding the subcommand list.Initialized from [Command.commandListHeading](#commandlistheading). `"Commands:%n"` by default.


---

### exitCodeListHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __exitCodeListHeading__()</span>

Returns the optional heading preceding the exit codes section, may contain `"%n"` line separators.`""` (empty string) by default.


---

### exitCodeList

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __exitCodeList__()</span>

Returns an unmodifiable map with values to be displayed in the exit codes section: keys are exit codes, values are descriptions.Descriptions may contain `"%n"` line separators.
 Callers may be interested in the [UsageMessageSpec.keyValuesMap](#keyvaluesmap) method for creating a map from a list of `"key:value"` Strings.
 

This may be configured in a resource bundle by listing up multiple `"key:value"` pairs. For example:
 
 usage.exitCodeList.0 = 0:Successful program execution.
 usage.exitCodeList.1 = 64:Invalid input: an unknown option or invalid parameter was specified.
 usage.exitCodeList.2 = 70:Execution exception: an exception occurred while executing the business logic.
 

**Returns:**

an unmodifiable map with values to be displayed in the exit codes section, or an empty map if no exit codes are [exitCodeList.exitCodeList](#exitcodelist).

**Since:**

4.0

**See Also:**


[keyValuesMap](#keyvaluesmap)



---

### keyValuesMap

<span style="font-family: monospace; font-size: 80%;">public static [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __keyValuesMap__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] entries)</span>

Creates and returns a `Map` that contains an entry for each specified String that is in `"key:value"` format.

**Parameters:**

`entries` - the strings to process; values that are not in `"key:value"` format are ignored

**Returns:**

a `Map` with an entry for each line, preserving the input order

**Since:**

4.0


---

### footerHeading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __footerHeading__()</span>

Returns the optional heading preceding the footer section.Initialized from [Command.footerHeading](#footerheading), or `""` (empty string).


---

### footer

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __footer__()</span>

Returns the optional footer text lines displayed at the bottom of the help message.Initialized from
 [Command.footer](#footer) if the `Command` annotation is present, otherwise this is an empty array and
 the help message has no footer.
 Applications may programmatically set this field to create a custom help message.


---

### headerHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __headerHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) headerHeading)</span>

Sets the heading preceding the header section.Initialized from [Command.headerHeading](#headerheading), or null.

**Returns:**

this UsageMessageSpec for method chaining


---

### header

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __header__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] header)</span>

Sets the optional header lines displayed at the top of the help message.For subcommands, the first header line is
 displayed in the list of commands.

**Returns:**

this UsageMessageSpec for method chaining


---

### synopsisHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __synopsisHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the optional heading preceding the synopsis.

**Returns:**

this UsageMessageSpec for method chaining


---

### synopsisSubcommandLabel

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __synopsisSubcommandLabel__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the String representing the subcommands in the synopsis.

**Returns:**

this UsageMessageSpec for method chaining

**Since:**

4.0


---

### synopsisAutoIndentThreshold

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __synopsisAutoIndentThreshold__(double newValue)</span>

Sets the fraction of the usage help [width.width](#width) that is the threshold up to which
 the 2nd line and subsequent lines of a multi-line synopsis should be aligned to the end of the command name.The default value of this attribute is `0.5`.
 If the length of the synopsis heading plus the length of the fully qualified command name exceeds this fraction of the width,
 the 2nd and subsequent rows of a multi-line synopsis will be aligned to the [synopsisIndent.synopsisIndent](#synopsisindent) instead of the end of the command name.

**Parameters:**

`newValue` - the new threshold value. Must be a value between 0.0 and 0.9, inclusive

**Returns:**

this UsageMessageSpec for method chaining

**Since:**

4.0


---

### synopsisIndent

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __synopsisIndent__(int newValue)</span>

Sets the indentation to use on the 2nd line and subsequent lines of a multi-line synopsis
 when the length of the synopsis heading and the fully qualified command name exceed the [synopsisAutoIndentThreshold.synopsisAutoIndentThreshold](#synopsisautoindentthreshold) fraction of the [width.width](#width), `-1` by default.A negative value for this option means that the 2nd line and subsequent lines are aligned to the synopsis heading length.
 A positive value means the exact number of spaces to indent for the 2nd line and subsequent lines of the synopsis.

**Returns:**

this UsageMessageSpec for method chaining

**Since:**

4.0


---

### abbreviateSynopsis

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __abbreviateSynopsis__(boolean newValue)</span>

Sets whether the synopsis line(s) should show an abbreviated synopsis without detailed option names.

**Returns:**

this UsageMessageSpec for method chaining


---

### customSynopsis

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __customSynopsis__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] customSynopsis)</span>

Sets the optional custom synopsis lines to use instead of the auto-generated synopsis.

**Returns:**

this UsageMessageSpec for method chaining


---

### descriptionHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __descriptionHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the heading preceding the description section.

**Returns:**

this UsageMessageSpec for method chaining


---

### description

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __description__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] description)</span>

Sets the optional text lines to use as the description of the help message, displayed between the synopsis and the
 options list.

**Returns:**

this UsageMessageSpec for method chaining


---

### parameterListHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __parameterListHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the optional heading preceding the parameter list.

**Returns:**

this UsageMessageSpec for method chaining


---

### optionListHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __optionListHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the heading preceding the options list.

**Returns:**

this UsageMessageSpec for method chaining


---

### sortOptions

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __sortOptions__(boolean newValue)</span>

Sets whether the options list in the usage help message should be sorted alphabetically.

**Returns:**

this UsageMessageSpec for method chaining


---

### sortSynopsis

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __sortSynopsis__(boolean newValue)</span>

Sets whether the options in the synopsis should be sorted alphabetically.

**Returns:**

this UsageMessageSpec for method chaining

**Since:**

4.7.8-SNAPSHOT


---

### requiredOptionMarker

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __requiredOptionMarker__(char newValue)</span>

Sets the character used to prefix required options in the options list.

**Returns:**

this UsageMessageSpec for method chaining


---

### showDefaultValues

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __showDefaultValues__(boolean newValue)</span>

Sets whether the options list in the usage help message should show default values for all non-boolean options.

**Returns:**

this UsageMessageSpec for method chaining


---

### showAtFileInUsageHelp

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __showAtFileInUsageHelp__(boolean newValue)</span>

Sets whether to show a `[@<filename>...]` entry in the synopsis and parameter list of the usage help message.(The entry is not shown if expanding parameter files is disabled.)

**Returns:**

this UsageMessageSpec for method chaining

**Since:**

4.2

**See Also:**


[showAtFileInUsageHelp](#showatfileinusagehelp)



---

### showEndOfOptionsDelimiterInUsageHelp

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __showEndOfOptionsDelimiterInUsageHelp__(boolean newValue)</span>

Sets whether to show a `[--]` (End of Options) entry in the synopsis and options list of the usage help message.

**Returns:**

this UsageMessageSpec for method chaining

**Since:**

4.3

**See Also:**


[showEndOfOptionsDelimiterInUsageHelp](#showendofoptionsdelimiterinusagehelp)



---

### hidden

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __hidden__(boolean value)</span>

Set the hidden flag on this command to control whether to show or hide it in the help usage text of the parent command.

**Parameters:**

`value` - enable or disable the hidden flag

**Returns:**

this UsageMessageSpec for method chaining

**See Also:**


[hidden](#hidden)



---

### commandListHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __commandListHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the optional heading preceding the subcommand list.

**Returns:**

this UsageMessageSpec for method chaining


---

### exitCodeListHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __exitCodeListHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the optional heading preceding the exit codes section, may contain `"%n"` line separators.`""` (empty string) by default.

**Since:**

4.0


---

### exitCodeList

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __exitCodeList__([Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> newValue)</span>

Sets the values to be displayed in the exit codes section: keys are exit codes, values are descriptions.Descriptions may contain `"%n"` line separators.
 

This may be configured in a resource bundle by listing up multiple `"key:value"` pairs. For example:
 
 usage.exitCodeList.0 = 0:Successful program execution.
 usage.exitCodeList.1 = 64:Invalid input: an unknown option or invalid parameter was specified.
 usage.exitCodeList.2 = 70:Execution exception: an exception occurred while executing the business logic.
 

**Parameters:**

`newValue` - a map with values to be displayed in the exit codes section

**Since:**

4.0

**See Also:**


[keyValuesMap](#keyvaluesmap)



---

### footerHeading

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __footerHeading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the optional heading preceding the footer section.

**Returns:**

this UsageMessageSpec for method chaining


---

### footer

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __footer__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] footer)</span>

Sets the optional footer text lines displayed at the bottom of the help message.

**Returns:**

this UsageMessageSpec for method chaining


---

### messages

<span style="font-family: monospace; font-size: 80%;">public [Messages](CommandLine.Model.Messages.md) __messages__()</span>

Returns the Messages for this usage help message specification, or `null`.

**Returns:**

the Messages object that encapsulates this command's resource bundle

**Since:**

3.6


---

### messages

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __messages__([Messages](CommandLine.Model.Messages.md) msgs)</span>

Sets the Messages for this usageMessage specification, and returns this UsageMessageSpec.

**Parameters:**

`msgs` - the new Messages value that encapsulates this command's resource bundle, may be `null`

**Since:**

3.6


---

### adjustLineBreaksForWideCJKCharacters

<span style="font-family: monospace; font-size: 80%;">public boolean __adjustLineBreaksForWideCJKCharacters__()</span>

Returns whether line breaks should take wide Chinese, Japanese and Korean characters into account for line-breaking purposes.

**Returns:**

true if wide Chinese, Japanese and Korean characters are counted as double the size of other characters for line-breaking purposes

**Since:**

4.0


---

### adjustLineBreaksForWideCJKCharacters

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __adjustLineBreaksForWideCJKCharacters__(boolean adjustForWideChars)</span>

Sets whether line breaks should take wide Chinese, Japanese and Korean characters into account, and returns this UsageMessageSpec.

**Parameters:**

`adjustForWideChars` - if true, wide Chinese, Japanese and Korean characters are counted as double the size of other characters for line-breaking purposes

**Since:**

4.0


---

