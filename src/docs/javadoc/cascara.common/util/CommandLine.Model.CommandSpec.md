Package [io.github.qishr.cascara.common.util](index.md)

# Class CommandSpec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.CommandSpec<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __CommandSpec__</span>

The `CommandSpec` class models a command specification, including the options, positional parameters and subcommands
 supported by the command, as well as attributes for the version help message and the usage help message of the command.


 Picocli views a command line application as a hierarchy of commands: there is a top-level command (usually the Java
 class with the `main` method) with optionally a set of command line options, positional parameters and subcommands.
 Subcommands themselves can have options, positional parameters and nested sub-subcommands to any level of depth.
 


 The object model has a corresponding hierarchy of `CommandSpec` objects, each with a set of [OptionSpec](CommandLine.Model.OptionSpec.md),
 [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) and [CommandLine](CommandLine.md) associated with it.
 This object model is used by the picocli command line interpreter and help message generator.
 

Picocli can construct a `CommandSpec` automatically from classes with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and
 [Parameters](CommandLine.Parameters.md) annotations. Alternatively a `CommandSpec` can be constructed programmatically.
 


## Field Summary

| Modifier and Type          | Field                                         | Description                                                          |
|----------------------------|-----------------------------------------------|----------------------------------------------------------------------|
| public static final String | [DEFAULT_COMMAND_NAME](#default_command_name) | Constant String holding the default program name: `"<main class>" `. |



## Method Summary

| Modifier and Type                                                                                                                                                                                                                                        | Method                                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                                                                                                                                                                 |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                            | [create](#create)()                                                                                                                                                                                                                                           | Creates and returns a new `CommandSpec` without any associated user object.                                                                                                                                                                                                                                                                                                                 |
| public static [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                            | [wrapWithoutInspection](#wrapwithoutinspection)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject)                                                                                                      | Creates and returns a new `CommandSpec` with the specified associated user object.                                                                                                                                                                                                                                                                                                          |
| public static [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                            | [wrapWithoutInspection](#wrapwithoutinspection)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject, [IFactory](CommandLine.IFactory.md) factory)                                                         | Creates and returns a new `CommandSpec` with the specified associated user object.                                                                                                                                                                                                                                                                                                          |
| public static [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                            | [forAnnotatedObject](#forannotatedobject)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject)                                                                                                            | Creates and returns a new `CommandSpec` initialized from the specified associated user object.                                                                                                                                                                                                                                                                                              |
| public static [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                            | [forAnnotatedObject](#forannotatedobject)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject, [IFactory](CommandLine.IFactory.md) factory)                                                               | Creates and returns a new `CommandSpec` initialized from the specified associated user object.                                                                                                                                                                                                                                                                                              |
| public static [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                            | [forAnnotatedObjectLenient](#forannotatedobjectlenient)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject)                                                                                              | Creates and returns a new `CommandSpec` initialized from the specified associated user object.                                                                                                                                                                                                                                                                                              |
| public static [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                            | [forAnnotatedObjectLenient](#forannotatedobjectlenient)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject, [IFactory](CommandLine.IFactory.md) factory)                                                 | Creates and returns a new `CommandSpec` initialized from the specified associated user object.                                                                                                                                                                                                                                                                                              |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                                                      | [userObject](#userobject)()                                                                                                                                                                                                                                   | Returns the user object associated with this command.                                                                                                                                                                                                                                                                                                                                       |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                     | [commandLine](#commandline)()                                                                                                                                                                                                                                 | Returns the CommandLine constructed with this `CommandSpec` model.                                                                                                                                                                                                                                                                                                                          |
| protected [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                | [commandLine](#commandline)([CommandLine](CommandLine.md) commandLine)                                                                                                                                                                                        | Sets the CommandLine constructed with this `CommandSpec` model.                                                                                                                                                                                                                                                                                                                             |
| public [ParserSpec](CommandLine.Model.ParserSpec.md)                                                                                                                                                                                                     | [parser](#parser)()                                                                                                                                                                                                                                           | Returns the parser specification for this command.                                                                                                                                                                                                                                                                                                                                          |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [parser](#parser)([ParserSpec](CommandLine.Model.ParserSpec.md) settings)                                                                                                                                                                                     | Initializes the parser specification for this command from the specified settings and returns this commandSpec.                                                                                                                                                                                                                                                                             |
| public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md)                                                                                                                                                                                         | [usageMessage](#usagemessage)()                                                                                                                                                                                                                               | Returns the usage help message specification for this command.                                                                                                                                                                                                                                                                                                                              |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [usageMessage](#usagemessage)([UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) settings)                                                                                                                                                             | Initializes the usageMessage specification for this command from the specified settings and returns this commandSpec.                                                                                                                                                                                                                                                                       |
| public boolean                                                                                                                                                                                                                                           | [subcommandsCaseInsensitive](#subcommandscaseinsensitive)()                                                                                                                                                                                                   | Returns whether the subcommands are case-insensitive.                                                                                                                                                                                                                                                                                                                                       |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [subcommandsCaseInsensitive](#subcommandscaseinsensitive)(boolean caseInsensitiveSubcommands)                                                                                                                                                                 | Sets the case-insensitivity of subcommands.                                                                                                                                                                                                                                                                                                                                                 |
| public boolean                                                                                                                                                                                                                                           | [optionsCaseInsensitive](#optionscaseinsensitive)()                                                                                                                                                                                                           | Returns whether the options are case-insensitive.                                                                                                                                                                                                                                                                                                                                           |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [optionsCaseInsensitive](#optionscaseinsensitive)(boolean caseInsensitiveOptions)                                                                                                                                                                             | Sets the case-insensitivity of options.                                                                                                                                                                                                                                                                                                                                                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                      | [resourceBundleBaseName](#resourcebundlebasename)()                                                                                                                                                                                                           | Returns the resource bundle base name for this command.                                                                                                                                                                                                                                                                                                                                     |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [resourceBundleBaseName](#resourcebundlebasename)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourceBundleBaseName)                                                                                        | Initializes the resource bundle for this command: sets the UsageMessageSpec#messages(CommandLine.Model.Messages) to  a [Messages](CommandLine.Model.Messages.md) object created from this command spec and the specified bundle, and then sets the  ArgSpec#messages(CommandLine.Model.Messages) of all options and positional parameters in this command  to the same `Messages` instance. |
| public [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html)                                                                                                                                      | [resourceBundle](#resourcebundle)()                                                                                                                                                                                                                           | Returns the resource bundle for this command.                                                                                                                                                                                                                                                                                                                                               |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [resourceBundle](#resourcebundle)([ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) bundle)                                                                                                        | Initializes the resource bundle for this command: sets the UsageMessageSpec#messages(CommandLine.Model.Messages) to  a [Messages](CommandLine.Model.Messages.md) object created from this command spec and the specified bundle, and then sets the  ArgSpec#messages(CommandLine.Model.Messages) of all options and positional parameters in this command  to the same `Messages` instance. |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandLine](CommandLine.md)>                               | [subcommands](#subcommands)()                                                                                                                                                                                                                                 | Returns a read-only view of the subcommand map.                                                                                                                                                                                                                                                                                                                                             |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addSubcommand](#addsubcommand)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandSpec](CommandLine.Model.CommandSpec.md) subcommand)                                                                | Adds the specified subcommand with the specified name.                                                                                                                                                                                                                                                                                                                                      |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addSubcommand](#addsubcommand)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandLine](CommandLine.md) subCommandLine)                                                                              | Adds the specified subcommand with the specified name.                                                                                                                                                                                                                                                                                                                                      |
| public [CommandLine](CommandLine.md)                                                                                                                                                                                                                     | [removeSubcommand](#removesubcommand)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                      | Removes the subcommand with the specified name or alias from this CommandSpec and returns the `CommandLine` instance that was associated with the specified name, or `null` of the specified name was not associated with a subcommand.                                                                                                                                                     |
| public boolean                                                                                                                                                                                                                                           | [isAddMethodSubcommands](#isaddmethodsubcommands)()                                                                                                                                                                                                           | Returns whether method commands should be added as subcommands.                                                                                                                                                                                                                                                                                                                             |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [setAddMethodSubcommands](#setaddmethodsubcommands)([Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) addMethodSubcommands)                                                                                      | Sets whether method commands should be added as subcommands.                                                                                                                                                                                                                                                                                                                                |
| public boolean                                                                                                                                                                                                                                           | [interpolateVariables](#interpolatevariables)()                                                                                                                                                                                                               | Returns whether variables should be interpolated in String values.                                                                                                                                                                                                                                                                                                                          |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [interpolateVariables](#interpolatevariables)([Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) interpolate)                                                                                                     | Sets whether variables should be interpolated in String values.                                                                                                                                                                                                                                                                                                                             |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addMethodSubcommands](#addmethodsubcommands)()                                                                                                                                                                                                               | Reflects on the class of the [userObject.userObject](#userobject) and registers any command methods  (class methods annotated with `@Command`) as subcommands.                                                                                                                                                                                                                              |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addMethodSubcommands](#addmethodsubcommands)([IFactory](CommandLine.IFactory.md) factory)                                                                                                                                                                    | Reflects on the class of the [userObject.userObject](#userobject) and registers any command methods  (class methods annotated with `@Command`) as subcommands.                                                                                                                                                                                                                              |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [parent](#parent)()                                                                                                                                                                                                                                           | Returns the parent command of this subcommand, or `null` if this is a top-level command.                                                                                                                                                                                                                                                                                                    |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [root](#root)()                                                                                                                                                                                                                                               | Returns the root command: the top-level command of the hierarchy, never `null`.                                                                                                                                                                                                                                                                                                             |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [parent](#parent)([CommandSpec](CommandLine.Model.CommandSpec.md) parent)                                                                                                                                                                                     | Sets the parent command of this subcommand.                                                                                                                                                                                                                                                                                                                                                 |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [add](#add)([ArgSpec](CommandLine.Model.ArgSpec.md) arg)                                                                                                                                                                                                      | Adds the specified option spec or positional parameter spec to the list of configured arguments to expect.                                                                                                                                                                                                                                                                                  |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addOption](#addoption)([OptionSpec](CommandLine.Model.OptionSpec.md) option)                                                                                                                                                                                 | Adds the specified option spec to the list of configured arguments to expect.                                                                                                                                                                                                                                                                                                               |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addPositional](#addpositional)([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) positional)                                                                                                                                                   | Adds the specified positional parameter spec to the list of configured arguments to expect.                                                                                                                                                                                                                                                                                                 |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [remove](#remove)([ArgSpec](CommandLine.Model.ArgSpec.md) arg)                                                                                                                                                                                                | (INCUBATING) Removes the specified option spec or positional parameter spec from the list of configured arguments to expect.                                                                                                                                                                                                                                                                |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addArgGroup](#addarggroup)([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)                                                                                                                                                                          | Adds the specified [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) to the groups in this command.                                                                                                                                                                                                                                                                                         |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addMixin](#addmixin)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandSpec](CommandLine.Model.CommandSpec.md) mixin, [IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) annotatedElement) | Adds the specified mixin `CommandSpec` object to the map of mixins for this command.                                                                                                                                                                                                                                                                                                        |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addMixin](#addmixin)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandSpec](CommandLine.Model.CommandSpec.md) mixin)                                                                               | Adds the specified mixin `CommandSpec` object to the map of mixins for this command.                                                                                                                                                                                                                                                                                                        |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addUnmatchedArgsBinding](#addunmatchedargsbinding)([UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) spec)                                                                                                                                   | Adds the specified `UnmatchedArgsBinding` to the list of model objects to capture unmatched arguments for this command.                                                                                                                                                                                                                                                                     |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addSpecElement](#addspecelement)([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) spec)                                                                                                                                                           | Adds the specified `{@literal @}Spec`-annotated program element to the list of elements for this command.                                                                                                                                                                                                                                                                                   |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [addParentCommandElement](#addparentcommandelement)([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) spec)                                                                                                                                         | Adds the specified `{@literal @}ParentCommand`-annotated program element to the list of elements for this command.                                                                                                                                                                                                                                                                          |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandSpec](CommandLine.Model.CommandSpec.md)>             | [mixins](#mixins)()                                                                                                                                                                                                                                           | Returns a map of the mixin names to mixin `CommandSpec` objects configured for this command.                                                                                                                                                                                                                                                                                                |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)> | [mixinAnnotatedElements](#mixinannotatedelements)()                                                                                                                                                                                                           | Returns a map of the mixin names to mixin `IAnnotatedElement` objects for this command.                                                                                                                                                                                                                                                                                                     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                                                                                                           | [options](#options)()                                                                                                                                                                                                                                         | Returns the list of options configured for this command.                                                                                                                                                                                                                                                                                                                                    |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)>                                                                                         | [positionalParameters](#positionalparameters)()                                                                                                                                                                                                               | Returns the list of positional parameters configured for this command.                                                                                                                                                                                                                                                                                                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)>                                                                                                       | [argGroups](#arggroups)()                                                                                                                                                                                                                                     | Returns the [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) in this command.                                                                                                                                                                                                                                                                                                              |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [OptionSpec](CommandLine.Model.OptionSpec.md)>               | [optionsMap](#optionsmap)()                                                                                                                                                                                                                                   | Returns a map of the option names to option spec objects configured for this command.                                                                                                                                                                                                                                                                                                       |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [OptionSpec](CommandLine.Model.OptionSpec.md)>               | [negatedOptionsMap](#negatedoptionsmap)()                                                                                                                                                                                                                     | Returns a map of the negated option names to option spec objects configured for this command.                                                                                                                                                                                                                                                                                               |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html), [OptionSpec](CommandLine.Model.OptionSpec.md)>         | [posixOptionsMap](#posixoptionsmap)()                                                                                                                                                                                                                         | Returns a map of the short (single character) option names to option spec objects configured for this command.                                                                                                                                                                                                                                                                              |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)>                                                                                                                 | [requiredArgs](#requiredargs)()                                                                                                                                                                                                                               | Returns the list of required options and positional parameters configured for this command.                                                                                                                                                                                                                                                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md)>                                                                                       | [unmatchedArgsBindings](#unmatchedargsbindings)()                                                                                                                                                                                                             | Returns the list of [UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) configured for this command;  each `UnmatchedArgsBinding` captures the arguments that could not be matched to any options or positional parameters.                                                                                                                                                   |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)>                                                                                             | [specElements](#specelements)()                                                                                                                                                                                                                               | Returns the list of program elements annotated with `{@literal @}Spec` configured for this command.                                                                                                                                                                                                                                                                                         |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)>                                                                                             | [parentCommandElements](#parentcommandelements)()                                                                                                                                                                                                             | Returns the list of program elements annotated with `{@literal @}ParentCommand` configured for this command.                                                                                                                                                                                                                                                                                |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                      | [name](#name)()                                                                                                                                                                                                                                               | Returns name of this command.                                                                                                                                                                                                                                                                                                                                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                                                    | [aliases](#aliases)()                                                                                                                                                                                                                                         | Returns the alias command names of this subcommand.                                                                                                                                                                                                                                                                                                                                         |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                                                              | [names](#names)()                                                                                                                                                                                                                                             | Returns all names of this command, including [name.name](#name) and [aliases.aliases](#aliases).                                                                                                                                                                                                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)>                                                                                                                 | [args](#args)()                                                                                                                                                                                                                                               | Returns the list of all options and positional parameters configured for this command.                                                                                                                                                                                                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                      | [qualifiedName](#qualifiedname)()                                                                                                                                                                                                                             | Returns the String to use as the program name in the synopsis line of the help message:  this command's [name.name](#name), preceded by the qualified name of the parent command, if any, separated by a space.                                                                                                                                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                      | [qualifiedName](#qualifiedname)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)                                                                                                                       | Returns this command's fully qualified name, which is its [name.name](#name), preceded by the qualified name of the parent command, if this command has a parent command.                                                                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                                                    | [version](#version)()                                                                                                                                                                                                                                         | Returns version information for this command, to print to the console when the user specifies an  option to request version help.                                                                                                                                                                                                                                                           |
| public [IVersionProvider](CommandLine.IVersionProvider.md)                                                                                                                                                                                               | [versionProvider](#versionprovider)()                                                                                                                                                                                                                         | Returns the version provider for this command, to generate the [version.version](#version) strings.                                                                                                                                                                                                                                                                                         |
| public boolean                                                                                                                                                                                                                                           | [helpCommand](#helpcommand)()                                                                                                                                                                                                                                 | Returns whether this subcommand is a help command, and required options and positional  parameters of the parent command should not be validated.                                                                                                                                                                                                                                           |
| public int                                                                                                                                                                                                                                               | [exitCodeOnSuccess](#exitcodeonsuccess)()                                                                                                                                                                                                                     | Returns exit code for successful termination.                                                                                                                                                                                                                                                                                                                                               |
| public int                                                                                                                                                                                                                                               | [exitCodeOnUsageHelp](#exitcodeonusagehelp)()                                                                                                                                                                                                                 | Returns exit code for successful termination after printing usage help on user request.                                                                                                                                                                                                                                                                                                     |
| public int                                                                                                                                                                                                                                               | [exitCodeOnVersionHelp](#exitcodeonversionhelp)()                                                                                                                                                                                                             | Returns exit code for successful termination after printing version help on user request.                                                                                                                                                                                                                                                                                                   |
| public int                                                                                                                                                                                                                                               | [exitCodeOnInvalidInput](#exitcodeoninvalidinput)()                                                                                                                                                                                                           | Returns exit code for command line usage error.                                                                                                                                                                                                                                                                                                                                             |
| public int                                                                                                                                                                                                                                               | [exitCodeOnExecutionException](#exitcodeonexecutionexception)()                                                                                                                                                                                               | Returns exit code signifying that an exception occurred when invoking the Runnable, Callable or Method user object of a command.                                                                                                                                                                                                                                                            |
| public [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md)                                                                                                                                                                         | [negatableOptionTransformer](#negatableoptiontransformer)()                                                                                                                                                                                                   | Returns the `INegatableOptionTransformer` used to create the negative form of negatable options.                                                                                                                                                                                                                                                                                            |
| public boolean                                                                                                                                                                                                                                           | [mixinStandardHelpOptions](#mixinstandardhelpoptions)()                                                                                                                                                                                                       | Returns `true` if the standard help options have been mixed in with this command, `false` otherwise.                                                                                                                                                                                                                                                                                        |
| public boolean                                                                                                                                                                                                                                           | [subcommandsRepeatable](#subcommandsrepeatable)()                                                                                                                                                                                                             | Returns whether the subcommands of this command are repeatable, that is, whether such subcommands can  occur multiple times and may be followed by sibling commands instead of just child commands.                                                                                                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                                                      | [toString](#tostring)()                                                                                                                                                                                                                                       | Returns a string representation of this command, used in error messages and trace messages.                                                                                                                                                                                                                                                                                                 |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [name](#name)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                              | Sets the String to use as the program name in the synopsis line of the help message.                                                                                                                                                                                                                                                                                                        |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [aliases](#aliases)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] aliases)                                                                                                                                   | Sets the alternative names by which this subcommand is recognized on the command line.                                                                                                                                                                                                                                                                                                      |
| public [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md)                                                                                                                                                                                     | [defaultValueProvider](#defaultvalueprovider)()                                                                                                                                                                                                               | Returns the default value provider for this command.                                                                                                                                                                                                                                                                                                                                        |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [defaultValueProvider](#defaultvalueprovider)([IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) defaultValueProvider)                                                                                                                             | Sets default value provider for this command.                                                                                                                                                                                                                                                                                                                                               |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [version](#version)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] version)                                                                                                                                   | Sets version information literals for this command, to print to the console when the user specifies an  option to request version help.                                                                                                                                                                                                                                                     |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [versionProvider](#versionprovider)([IVersionProvider](CommandLine.IVersionProvider.md) versionProvider)                                                                                                                                                      | Sets version provider for this command, to generate the [version.version](#version) strings.                                                                                                                                                                                                                                                                                                |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [helpCommand](#helpcommand)(boolean newValue)                                                                                                                                                                                                                 | Sets whether this is a help command and required parameter checking should be suspended.                                                                                                                                                                                                                                                                                                    |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [exitCodeOnSuccess](#exitcodeonsuccess)(int newValue)                                                                                                                                                                                                         | Sets exit code for successful termination.                                                                                                                                                                                                                                                                                                                                                  |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [exitCodeOnUsageHelp](#exitcodeonusagehelp)(int newValue)                                                                                                                                                                                                     | Sets exit code for successful termination after printing usage help on user request.                                                                                                                                                                                                                                                                                                        |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [exitCodeOnVersionHelp](#exitcodeonversionhelp)(int newValue)                                                                                                                                                                                                 | Sets exit code for successful termination after printing version help on user request.                                                                                                                                                                                                                                                                                                      |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [exitCodeOnInvalidInput](#exitcodeoninvalidinput)(int newValue)                                                                                                                                                                                               | Sets exit code for command line usage error.                                                                                                                                                                                                                                                                                                                                                |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [exitCodeOnExecutionException](#exitcodeonexecutionexception)(int newValue)                                                                                                                                                                                   | Sets exit code signifying that an exception occurred when invoking the Runnable, Callable or Method user object of a command.                                                                                                                                                                                                                                                               |
| public boolean                                                                                                                                                                                                                                           | [inherited](#inherited)()                                                                                                                                                                                                                                     | Returns whether this command is inherited from a parent command.                                                                                                                                                                                                                                                                                                                            |
| public [ScopeType](CommandLine.ScopeType.md)                                                                                                                                                                                                             | [scopeType](#scopetype)()                                                                                                                                                                                                                                     | Returns the scope of this argument; is it local, or inherited (it applies to this command as well as all sub- and sub-subcommands).                                                                                                                                                                                                                                                         |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [scopeType](#scopetype)([ScopeType](CommandLine.ScopeType.md) scopeType)                                                                                                                                                                                      | Sets the scope of where this argument applies: only this command, or also all sub (and sub-sub) commands, and returns this builder.                                                                                                                                                                                                                                                         |
| public [IModelTransformer](CommandLine.IModelTransformer.md)                                                                                                                                                                                             | [modelTransformer](#modeltransformer)()                                                                                                                                                                                                                       | Returns the model transformer for this CommandSpec instance.                                                                                                                                                                                                                                                                                                                                |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [modelTransformer](#modeltransformer)([IModelTransformer](CommandLine.IModelTransformer.md) modelTransformer)                                                                                                                                                 | Sets the model transformer for this CommandSpec instance.                                                                                                                                                                                                                                                                                                                                   |
| public [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)                                                                                                                                                                                   | [preprocessor](#preprocessor)()                                                                                                                                                                                                                               | Returns the preprocessor for this CommandSpec instance.                                                                                                                                                                                                                                                                                                                                     |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [preprocessor](#preprocessor)([IParameterPreprocessor](CommandLine.IParameterPreprocessor.md) preprocessor)                                                                                                                                                   | Sets the preprocessor for this CommandSpec instance.                                                                                                                                                                                                                                                                                                                                        |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [negatableOptionTransformer](#negatableoptiontransformer)([INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) newValue)                                                                                                                 | Sets the `INegatableOptionTransformer` used to create the negative form of negatable options.                                                                                                                                                                                                                                                                                               |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [mixinStandardHelpOptions](#mixinstandardhelpoptions)(boolean newValue)                                                                                                                                                                                       | Sets whether the standard help options should be mixed in with this command.                                                                                                                                                                                                                                                                                                                |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [subcommandsRepeatable](#subcommandsrepeatable)(boolean subcommandsRepeatable)                                                                                                                                                                                | Sets whether the subcommands of this command are repeatable, that is, whether such subcommands can  occur multiple times and may be followed by sibling commands instead of just child commands.                                                                                                                                                                                            |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                                                   | [withToString](#withtostring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)                                                                                                                          | Sets the string representation of this command, used in error messages and trace messages.                                                                                                                                                                                                                                                                                                  |
| public void                                                                                                                                                                                                                                              | [updateCommandAttributes](#updatecommandattributes)([Command](CommandLine.Command.md) cmd, [IFactory](CommandLine.IFactory.md) factory)                                                                                                                       | Updates the following attributes from the specified `@Command` annotation: aliases, ParserSpec#separator(), command name, version, help command, version provider, default provider and [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md).                                                                                                                                          |
| public [OptionSpec](CommandLine.Model.OptionSpec.md)                                                                                                                                                                                                     | [findOption](#findoption)(char shortName)                                                                                                                                                                                                                     | Returns the option with the specified short name, or `null` if no option with that name is defined for this command.                                                                                                                                                                                                                                                                        |
| public [OptionSpec](CommandLine.Model.OptionSpec.md)                                                                                                                                                                                                     | [findOption](#findoption)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)                                                                                                                                  | Returns the option with the specified name, or `null` if no option with that name is defined for this command.                                                                                                                                                                                                                                                                              |



## Field Details

### DEFAULT_COMMAND_NAME

<span style="font-family: monospace; font-size: 80%;">public static final String __DEFAULT_COMMAND_NAME__</span>

Constant String holding the default program name: `"<main class>" `.


---


## Method Details

### create

<span style="font-family: monospace; font-size: 80%;">public static [CommandSpec](CommandLine.Model.CommandSpec.md) __create__()</span>

Creates and returns a new `CommandSpec` without any associated user object.


---

### wrapWithoutInspection

<span style="font-family: monospace; font-size: 80%;">public static [CommandSpec](CommandLine.Model.CommandSpec.md) __wrapWithoutInspection__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject)</span>

Creates and returns a new `CommandSpec` with the specified associated user object.The specified user object is not inspected for annotations.

**Parameters:**

`userObject` - the associated user object. May be any object, may be `null`.


---

### wrapWithoutInspection

<span style="font-family: monospace; font-size: 80%;">public static [CommandSpec](CommandLine.Model.CommandSpec.md) __wrapWithoutInspection__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject, [IFactory](CommandLine.IFactory.md) factory)</span>

Creates and returns a new `CommandSpec` with the specified associated user object.The specified user object is not inspected for annotations.

**Parameters:**

`userObject` - the associated user object. May be any object, may be `null`.

`factory` - the factory used to create instances of [Command.subcommands](#subcommands), converters, etc., that are registered declaratively with annotation attributes

**Since:**

4.2


---

### forAnnotatedObject

<span style="font-family: monospace; font-size: 80%;">public static [CommandSpec](CommandLine.Model.CommandSpec.md) __forAnnotatedObject__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject)</span>

Creates and returns a new `CommandSpec` initialized from the specified associated user object.The specified
 user object must have at least one [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md) annotation.

**Parameters:**

`userObject` - the user object annotated with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and/or [Parameters](CommandLine.Parameters.md) annotations.


---

### forAnnotatedObject

<span style="font-family: monospace; font-size: 80%;">public static [CommandSpec](CommandLine.Model.CommandSpec.md) __forAnnotatedObject__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject, [IFactory](CommandLine.IFactory.md) factory)</span>

Creates and returns a new `CommandSpec` initialized from the specified associated user object.The specified
 user object must have at least one [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md) annotation.

**Parameters:**

`userObject` - the user object annotated with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and/or [Parameters](CommandLine.Parameters.md) annotations.

`factory` - the factory used to create instances of [Command.subcommands](#subcommands), converters, etc., that are registered declaratively with annotation attributes


---

### forAnnotatedObjectLenient

<span style="font-family: monospace; font-size: 80%;">public static [CommandSpec](CommandLine.Model.CommandSpec.md) __forAnnotatedObjectLenient__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject)</span>

Creates and returns a new `CommandSpec` initialized from the specified associated user object.If the specified
 user object has no [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md) annotations, an empty `CommandSpec` is returned.

**Parameters:**

`userObject` - the user object annotated with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and/or [Parameters](CommandLine.Parameters.md) annotations.


---

### forAnnotatedObjectLenient

<span style="font-family: monospace; font-size: 80%;">public static [CommandSpec](CommandLine.Model.CommandSpec.md) __forAnnotatedObjectLenient__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) userObject, [IFactory](CommandLine.IFactory.md) factory)</span>

Creates and returns a new `CommandSpec` initialized from the specified associated user object.If the specified
 user object has no [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md) annotations, an empty `CommandSpec` is returned.

**Parameters:**

`userObject` - the user object annotated with [Command](CommandLine.Command.md), [Option](CommandLine.Option.md) and/or [Parameters](CommandLine.Parameters.md) annotations.

`factory` - the factory used to create instances of [Command.subcommands](#subcommands), converters, etc., that are registered declaratively with annotation attributes


---

### userObject

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __userObject__()</span>

Returns the user object associated with this command.

**See Also:**


[getCommand](null.md)



---

### commandLine

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __commandLine__()</span>

Returns the CommandLine constructed with this `CommandSpec` model.


---

### commandLine

<span style="font-family: monospace; font-size: 80%;">protected [CommandSpec](CommandLine.Model.CommandSpec.md) __commandLine__([CommandLine](CommandLine.md) commandLine)</span>

Sets the CommandLine constructed with this `CommandSpec` model.


---

### parser

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](CommandLine.Model.ParserSpec.md) __parser__()</span>

Returns the parser specification for this command.


---

### parser

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __parser__([ParserSpec](CommandLine.Model.ParserSpec.md) settings)</span>

Initializes the parser specification for this command from the specified settings and returns this commandSpec.


---

### usageMessage

<span style="font-family: monospace; font-size: 80%;">public [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) __usageMessage__()</span>

Returns the usage help message specification for this command.


---

### usageMessage

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __usageMessage__([UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md) settings)</span>

Initializes the usageMessage specification for this command from the specified settings and returns this commandSpec.


---

### subcommandsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public boolean __subcommandsCaseInsensitive__()</span>

Returns whether the subcommands are case-insensitive.

**Since:**

4.3


---

### subcommandsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __subcommandsCaseInsensitive__(boolean caseInsensitiveSubcommands)</span>

Sets the case-insensitivity of subcommands.

**Since:**

4.3


---

### optionsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public boolean __optionsCaseInsensitive__()</span>

Returns whether the options are case-insensitive.

**Since:**

4.3


---

### optionsCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __optionsCaseInsensitive__(boolean caseInsensitiveOptions)</span>

Sets the case-insensitivity of options.Note that changing case sensitivity will also change the case sensitivity of negatable options:
 any custom [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) that was previously installed will be replaced by the case-insensitive
 version of the default transformer. To ensure your custom transformer is used, install it last, after changing case sensitivity.

**Since:**

4.3


---

### resourceBundleBaseName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __resourceBundleBaseName__()</span>

Returns the resource bundle base name for this command.

**Returns:**

the resource bundle base name from the 

**Since:**

4.0


---

### resourceBundleBaseName

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __resourceBundleBaseName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) resourceBundleBaseName)</span>

Initializes the resource bundle for this command: sets the UsageMessageSpec#messages(CommandLine.Model.Messages) to
 a [Messages](CommandLine.Model.Messages.md) object created from this command spec and the specified bundle, and then sets the
 ArgSpec#messages(CommandLine.Model.Messages) of all options and positional parameters in this command
 to the same `Messages` instance.Subcommands are not modified.
 

This method is preferable to [resourceBundle.resourceBundle](#resourcebundle) for pre-Java 8

**Parameters:**

`resourceBundleBaseName` - the base name of the ResourceBundle to set, may be `null`

**Returns:**

this commandSpec

**Since:**

4.0

**See Also:**


[addSubcommand](#addsubcommand)



---

### resourceBundle

<span style="font-family: monospace; font-size: 80%;">public [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) __resourceBundle__()</span>

Returns the resource bundle for this command.

**Returns:**

the resource bundle from the 

**Since:**

3.6


---

### resourceBundle

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __resourceBundle__([ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) bundle)</span>

Initializes the resource bundle for this command: sets the UsageMessageSpec#messages(CommandLine.Model.Messages) to
 a [Messages](CommandLine.Model.Messages.md) object created from this command spec and the specified bundle, and then sets the
 ArgSpec#messages(CommandLine.Model.Messages) of all options and positional parameters in this command
 to the same `Messages` instance.Subcommands are not modified.

**Parameters:**

`bundle` - the ResourceBundle to set, may be `null`

**Returns:**

this commandSpec

**Since:**

3.6

**See Also:**


[addSubcommand](#addsubcommand)



---

### subcommands

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandLine](CommandLine.md)> __subcommands__()</span>

Returns a read-only view of the subcommand map.


---

### addSubcommand

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addSubcommand__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandSpec](CommandLine.Model.CommandSpec.md) subcommand)</span>

Adds the specified subcommand with the specified name.If the specified subcommand does not have a ResourceBundle set, it is initialized to the ResourceBundle of this command spec.

**Parameters:**

`name` - subcommand name - the preferred subcommand name to register the subcommand under.
             If `null`, the [CommandSpec.name](#name) of the specified subcommand is used;
             if this is also `null`, the first [CommandSpec.aliases](#aliases) is used.
             When this String is encountered in the command line arguments, the subcommand is invoked.

`subcommand` - describes the subcommand to envoke when the name is encountered on the command line

**Returns:**

this `CommandSpec` object for method chaining


---

### addSubcommand

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addSubcommand__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandLine](CommandLine.md) subCommandLine)</span>

Adds the specified subcommand with the specified name.If the specified subcommand does not have a ResourceBundle set, it is initialized to the ResourceBundle of this command spec.

**Parameters:**

`name` - subcommand name - the preferred subcommand name to register the subcommand under.
             If `null`, the name of the specified subcommand is used;
             if this is also `null`, the first [CommandSpec.aliases](#aliases) is used.
             When this String is encountered in the command line arguments, the subcommand is invoked.

`subCommandLine` - the subcommand to envoke when the name is encountered on the command line

**Returns:**

this `CommandSpec` object for method chaining


---

### removeSubcommand

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](CommandLine.md) __removeSubcommand__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Removes the subcommand with the specified name or alias from this CommandSpec and
returns the `CommandLine` instance that was associated with the specified name,
or `null` of the specified name was not associated with a subcommand.

**Parameters:**

`name` - name or alias of the subcommand to remove; may be
     #isAbbreviatedSubcommandsAllowed() or #isSubcommandsCaseInsensitive()

**Returns:**

the removed `CommandLine` instance or `null`

**Since:**

4.6


---

### isAddMethodSubcommands

<span style="font-family: monospace; font-size: 80%;">public boolean __isAddMethodSubcommands__()</span>

Returns whether method commands should be added as subcommands.True by default. Used by the annotation processor.

**Since:**

4.0


---

### setAddMethodSubcommands

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __setAddMethodSubcommands__([Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) addMethodSubcommands)</span>

Sets whether method commands should be added as subcommands.True by default. Used by the annotation processor.

**Since:**

4.0


---

### interpolateVariables

<span style="font-family: monospace; font-size: 80%;">public boolean __interpolateVariables__()</span>

Returns whether variables should be interpolated in String values.True by default.

**Since:**

4.0


---

### interpolateVariables

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __interpolateVariables__([Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html) interpolate)</span>

Sets whether variables should be interpolated in String values.True by default.

**Since:**

4.0


---

### addMethodSubcommands

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addMethodSubcommands__()</span>

Reflects on the class of the [userObject.userObject](#userobject) and registers any command methods
 (class methods annotated with `@Command`) as subcommands.

**Returns:**

this [CommandSpec](CommandLine.Model.CommandSpec.md) object for method chaining

**Since:**

3.6.0

**See Also:**


[addMethodSubcommands](#addmethodsubcommands)


[addSubcommand](#addsubcommand)



---

### addMethodSubcommands

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addMethodSubcommands__([IFactory](CommandLine.IFactory.md) factory)</span>

Reflects on the class of the [userObject.userObject](#userobject) and registers any command methods
 (class methods annotated with `@Command`) as subcommands.

**Parameters:**

`factory` - the factory used to create instances of subcommands, converters, etc., that are registered declaratively with annotation attributes

**Returns:**

this [CommandSpec](CommandLine.Model.CommandSpec.md) object for method chaining

**Since:**

3.7.0

**See Also:**


[addSubcommand](#addsubcommand)



---

### parent

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __parent__()</span>

Returns the parent command of this subcommand, or `null` if this is a top-level command.


---

### root

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __root__()</span>

Returns the root command: the top-level command of the hierarchy, never `null`.

**Since:**

4.3


---

### parent

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __parent__([CommandSpec](CommandLine.Model.CommandSpec.md) parent)</span>

Sets the parent command of this subcommand.

**Returns:**

this CommandSpec for method chaining


---

### add

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __add__([ArgSpec](CommandLine.Model.ArgSpec.md) arg)</span>

Adds the specified option spec or positional parameter spec to the list of configured arguments to expect.

**Parameters:**

`arg` - the option spec or positional parameter spec to add

**Returns:**

this CommandSpec for method chaining


---

### addOption

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addOption__([OptionSpec](CommandLine.Model.OptionSpec.md) option)</span>

Adds the specified option spec to the list of configured arguments to expect.The option's  may now return Strings from this
 CommandSpec's messages.
 The option parameter's  may
 now return Strings from this CommandSpec's [CommandSpec.defaultValueProvider](#defaultvalueprovider) IDefaultValueProvider}.

**Parameters:**

`option` - the option spec to add

**Returns:**

this CommandSpec for method chaining


---

### addPositional

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addPositional__([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) positional)</span>

Adds the specified positional parameter spec to the list of configured arguments to expect.The positional parameter's  may
 now return Strings from this CommandSpec's messages.
 The positional parameter's  may
 now return Strings from this CommandSpec's [CommandSpec.defaultValueProvider](#defaultvalueprovider) IDefaultValueProvider}.

**Parameters:**

`positional` - the positional parameter spec to add

**Returns:**

this CommandSpec for method chaining


---

### remove

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __remove__([ArgSpec](CommandLine.Model.ArgSpec.md) arg)</span>

(INCUBATING) Removes the specified option spec or positional parameter spec from the list of configured arguments to expect.

**Parameters:**

`arg` - the option spec or positional parameter spec to remove

**Returns:**

this CommandSpec for method chaining

**Since:**

4.0


---

### addArgGroup

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addArgGroup__([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)</span>

Adds the specified [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) to the groups in this command.

**Parameters:**

`group` - the group spec to add

**Returns:**

this CommandSpec for method chaining

**Since:**

4.0


---

### addMixin

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addMixin__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandSpec](CommandLine.Model.CommandSpec.md) mixin, [IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) annotatedElement)</span>

Adds the specified mixin `CommandSpec` object to the map of mixins for this command.

**Parameters:**

`name` - the name that can be used to later retrieve the mixin

`mixin` - the mixin whose options and positional parameters and other attributes to add to this command

`annotatedElement` - the `Mixin`-annotated program element

**Returns:**

this CommandSpec for method chaining

**Since:**

4.1

**See Also:**


[mixinAnnotatedElements](#mixinannotatedelements)



---

### addMixin

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addMixin__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [CommandSpec](CommandLine.Model.CommandSpec.md) mixin)</span>

Adds the specified mixin `CommandSpec` object to the map of mixins for this command.

**Parameters:**

`name` - the name that can be used to later retrieve the mixin

`mixin` - the mixin whose options and positional parameters and other attributes to add to this command

**Returns:**

this CommandSpec for method chaining


---

### addUnmatchedArgsBinding

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addUnmatchedArgsBinding__([UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) spec)</span>

Adds the specified `UnmatchedArgsBinding` to the list of model objects to capture unmatched arguments for this command.

**Parameters:**

`spec` - the unmatched arguments binding to capture unmatched arguments

**Returns:**

this CommandSpec for method chaining


---

### addSpecElement

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addSpecElement__([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) spec)</span>

Adds the specified `{@literal @}Spec`-annotated program element to the list of elements for this command.

**Returns:**

this CommandSpec for method chaining

**Since:**

4.0


---

### addParentCommandElement

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __addParentCommandElement__([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) spec)</span>

Adds the specified `{@literal @}ParentCommand`-annotated program element to the list of elements for this command.

**Returns:**

this CommandSpec for method chaining

**Since:**

4.0


---

### mixins

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [CommandSpec](CommandLine.Model.CommandSpec.md)> __mixins__()</span>

Returns a map of the mixin names to mixin `CommandSpec` objects configured for this command.

**Returns:**

an immutable map of mixins added to this command.


---

### mixinAnnotatedElements

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)> __mixinAnnotatedElements__()</span>

Returns a map of the mixin names to mixin `IAnnotatedElement` objects for this command.

**Returns:**

an immutable map of `Mixin`-annotated elements added to this command.

**Since:**

4.1

**See Also:**


[addMixin](#addmixin)



---

### options

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __options__()</span>

Returns the list of options configured for this command.

**Returns:**

an immutable list of options that this command recognizes.


---

### positionalParameters

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> __positionalParameters__()</span>

Returns the list of positional parameters configured for this command.

**Returns:**

an immutable list of positional parameters that this command recognizes.


---

### argGroups

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)> __argGroups__()</span>

Returns the [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) in this command.

**Returns:**

an immutable list of groups of options and positional parameters in this command

**Since:**

4.0


---

### optionsMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [OptionSpec](CommandLine.Model.OptionSpec.md)> __optionsMap__()</span>

Returns a map of the option names to option spec objects configured for this command.

**Returns:**

an immutable map of options that this command recognizes.


---

### negatedOptionsMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html), [OptionSpec](CommandLine.Model.OptionSpec.md)> __negatedOptionsMap__()</span>

Returns a map of the negated option names to option spec objects configured for this command.

**Returns:**

an immutable map of negatable options that this command recognizes.

**Since:**

4.0


---

### posixOptionsMap

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)<[Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html), [OptionSpec](CommandLine.Model.OptionSpec.md)> __posixOptionsMap__()</span>

Returns a map of the short (single character) option names to option spec objects configured for this command.

**Returns:**

an immutable map of options that this command recognizes.


---

### requiredArgs

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> __requiredArgs__()</span>

Returns the list of required options and positional parameters configured for this command.This does not include options and positional parameters that are part of a [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md).

**Returns:**

an immutable list of the required options and positional parameters for this command.


---

### unmatchedArgsBindings

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md)> __unmatchedArgsBindings__()</span>

Returns the list of [UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) configured for this command;
 each `UnmatchedArgsBinding` captures the arguments that could not be matched to any options or positional parameters.


---

### specElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)> __specElements__()</span>

Returns the list of program elements annotated with `{@literal @}Spec` configured for this command.

**Since:**

4.0


---

### parentCommandElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)> __parentCommandElements__()</span>

Returns the list of program elements annotated with `{@literal @}ParentCommand` configured for this command.

**Since:**

4.0


---

### name

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __name__()</span>

Returns name of this command.Used in the synopsis line of the help message.
 #DEFAULT_COMMAND_NAME by default, initialized from [Command.name](#name) if defined.

**See Also:**


[qualifiedName](#qualifiedname)



---

### aliases

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __aliases__()</span>

Returns the alias command names of this subcommand.

**Since:**

3.1


---

### names

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __names__()</span>

Returns all names of this command, including [name.name](#name) and [aliases.aliases](#aliases).

**Since:**

3.9


---

### args

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> __args__()</span>

Returns the list of all options and positional parameters configured for this command.

**Returns:**

an immutable list of all options and positional parameters for this command.


---

### qualifiedName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __qualifiedName__()</span>

Returns the String to use as the program name in the synopsis line of the help message:
 this command's [name.name](#name), preceded by the qualified name of the parent command, if any, separated by a space.

**Returns:**

#DEFAULT_COMMAND_NAME by default, initialized from [Command.name](#name) and the parent command if defined.

**Since:**

3.0.1


---

### qualifiedName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __qualifiedName__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)</span>

Returns this command's fully qualified name, which is its [name.name](#name), preceded by the qualified name of the parent command, if this command has a parent command.

**Parameters:**

`separator` - the string to put between the names of the commands in the hierarchy

**Returns:**

#DEFAULT_COMMAND_NAME by default, initialized from [Command.name](#name) and the parent command if any.

**Since:**

3.6


---

### version

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __version__()</span>

Returns version information for this command, to print to the console when the user specifies an
 option to request version help.This is not part of the usage help message.

**Returns:**

the version strings generated by the [versionProvider.versionProvider](#versionprovider) if one is set, otherwise the [version.version](#version)


---

### versionProvider

<span style="font-family: monospace; font-size: 80%;">public [IVersionProvider](CommandLine.IVersionProvider.md) __versionProvider__()</span>

Returns the version provider for this command, to generate the [version.version](#version) strings.

**Returns:**

the version provider or `null` if the version strings should be returned from the [version.version](#version).


---

### helpCommand

<span style="font-family: monospace; font-size: 80%;">public boolean __helpCommand__()</span>

Returns whether this subcommand is a help command, and required options and positional
 parameters of the parent command should not be validated.

**Returns:**

`true` if this subcommand is a help command and picocli should not check for missing required
      options and positional parameters on the parent command

**See Also:**


[helpCommand](#helpcommand)



---

### exitCodeOnSuccess

<span style="font-family: monospace; font-size: 80%;">public int __exitCodeOnSuccess__()</span>

Returns exit code for successful termination. by default, may be set programmatically or via the [Command.exitCodeOnSuccess](#exitcodeonsuccess) annotation.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnUsageHelp

<span style="font-family: monospace; font-size: 80%;">public int __exitCodeOnUsageHelp__()</span>

Returns exit code for successful termination after printing usage help on user request. by default, may be set programmatically or via the [Command.exitCodeOnVersionHelp](#exitcodeonversionhelp) annotation.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnVersionHelp

<span style="font-family: monospace; font-size: 80%;">public int __exitCodeOnVersionHelp__()</span>

Returns exit code for successful termination after printing version help on user request. by default, may be set programmatically or via the [Command.exitCodeOnUsageHelp](#exitcodeonusagehelp) annotation.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnInvalidInput

<span style="font-family: monospace; font-size: 80%;">public int __exitCodeOnInvalidInput__()</span>

Returns exit code for command line usage error. by default, may be set programmatically or via the [Command.exitCodeOnInvalidInput](#exitcodeoninvalidinput) annotation.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnExecutionException

<span style="font-family: monospace; font-size: 80%;">public int __exitCodeOnExecutionException__()</span>

Returns exit code signifying that an exception occurred when invoking the Runnable, Callable or Method user object of a command. by default, may be set programmatically or via the [Command.exitCodeOnExecutionException](#exitcodeonexecutionexception) annotation.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### negatableOptionTransformer

<span style="font-family: monospace; font-size: 80%;">public [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) __negatableOptionTransformer__()</span>

Returns the `INegatableOptionTransformer` used to create the negative form of negatable options.

**Since:**

4.0

**See Also:**


[negatable](null.md)



---

### mixinStandardHelpOptions

<span style="font-family: monospace; font-size: 80%;">public boolean __mixinStandardHelpOptions__()</span>

Returns `true` if the standard help options have been mixed in with this command, `false` otherwise.


---

### subcommandsRepeatable

<span style="font-family: monospace; font-size: 80%;">public boolean __subcommandsRepeatable__()</span>

Returns whether the subcommands of this command are repeatable, that is, whether such subcommands can
 occur multiple times and may be followed by sibling commands instead of just child commands.

**Since:**

4.2

**See Also:**


[subcommandsRepeatable](#subcommandsrepeatable)



---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns a string representation of this command, used in error messages and trace messages.


---

### name

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __name__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Sets the String to use as the program name in the synopsis line of the help message.

**Returns:**

this CommandSpec for method chaining


---

### aliases

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __aliases__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] aliases)</span>

Sets the alternative names by which this subcommand is recognized on the command line.

**Returns:**

this CommandSpec for method chaining

**Since:**

3.1


---

### defaultValueProvider

<span style="font-family: monospace; font-size: 80%;">public [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) __defaultValueProvider__()</span>

Returns the default value provider for this command.

**Returns:**

the default value provider or `null`

**Since:**

3.6


---

### defaultValueProvider

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __defaultValueProvider__([IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) defaultValueProvider)</span>

Sets default value provider for this command.

**Parameters:**

`defaultValueProvider` - the default value provider to use, or `null`.

**Returns:**

this CommandSpec for method chaining

**Since:**

3.6


---

### version

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __version__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] version)</span>

Sets version information literals for this command, to print to the console when the user specifies an
 option to request version help.Only used if no [versionProvider.versionProvider](#versionprovider) is set.

**Returns:**

this CommandSpec for method chaining


---

### versionProvider

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __versionProvider__([IVersionProvider](CommandLine.IVersionProvider.md) versionProvider)</span>

Sets version provider for this command, to generate the [version.version](#version) strings.

**Parameters:**

`versionProvider` - the version provider to use to generate the version strings, or `null` if the [version.version](#version) should be used.

**Returns:**

this CommandSpec for method chaining


---

### helpCommand

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __helpCommand__(boolean newValue)</span>

Sets whether this is a help command and required parameter checking should be suspended.

**Returns:**

this CommandSpec for method chaining

**See Also:**


[helpCommand](#helpcommand)



---

### exitCodeOnSuccess

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __exitCodeOnSuccess__(int newValue)</span>

Sets exit code for successful termination. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnUsageHelp

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __exitCodeOnUsageHelp__(int newValue)</span>

Sets exit code for successful termination after printing usage help on user request. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnVersionHelp

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __exitCodeOnVersionHelp__(int newValue)</span>

Sets exit code for successful termination after printing version help on user request. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnInvalidInput

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __exitCodeOnInvalidInput__(int newValue)</span>

Sets exit code for command line usage error. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### exitCodeOnExecutionException

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __exitCodeOnExecutionException__(int newValue)</span>

Sets exit code signifying that an exception occurred when invoking the Runnable, Callable or Method user object of a command. by default.

**Since:**

4.0

**See Also:**


[execute](null.md)



---

### inherited

<span style="font-family: monospace; font-size: 80%;">public boolean __inherited__()</span>

Returns whether this command is inherited from a parent command.

**Since:**

4.6

**See Also:**


[scope](null.md)



---

### scopeType

<span style="font-family: monospace; font-size: 80%;">public [ScopeType](CommandLine.ScopeType.md) __scopeType__()</span>

Returns the scope of this argument; is it local, or inherited (it applies to this command as well as all sub- and sub-subcommands).

**Returns:**

whether this argument applies to all descendent subcommands of the command where it is defined

**Since:**

4.6


---

### scopeType

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __scopeType__([ScopeType](CommandLine.ScopeType.md) scopeType)</span>

Sets the scope of where this argument applies: only this command, or also all sub (and sub-sub) commands, and returns this builder.

**Since:**

4.6


---

### modelTransformer

<span style="font-family: monospace; font-size: 80%;">public [IModelTransformer](CommandLine.IModelTransformer.md) __modelTransformer__()</span>

Returns the model transformer for this CommandSpec instance.

**Since:**

4.6


---

### modelTransformer

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __modelTransformer__([IModelTransformer](CommandLine.IModelTransformer.md) modelTransformer)</span>

Sets the model transformer for this CommandSpec instance.

**Since:**

4.6


---

### preprocessor

<span style="font-family: monospace; font-size: 80%;">public [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md) __preprocessor__()</span>

Returns the preprocessor for this CommandSpec instance.

**Since:**

4.6


---

### preprocessor

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __preprocessor__([IParameterPreprocessor](CommandLine.IParameterPreprocessor.md) preprocessor)</span>

Sets the preprocessor for this CommandSpec instance.

**Since:**

4.6


---

### negatableOptionTransformer

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __negatableOptionTransformer__([INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) newValue)</span>

Sets the `INegatableOptionTransformer` used to create the negative form of negatable options.Note that [CommandSpec.optionsCaseInsensitive](#optionscaseinsensitive) will also change the case sensitivity of negatable options:
 any custom [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md) that was previously installed will be replaced by the case-insensitive
 version of the default transformer. To ensure your custom transformer is used, install it last, after changing case sensitivity.

**Since:**

4.0

**See Also:**


[negatable](null.md)



---

### mixinStandardHelpOptions

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __mixinStandardHelpOptions__(boolean newValue)</span>

Sets whether the standard help options should be mixed in with this command.

**Returns:**

this CommandSpec for method chaining

**See Also:**


[mixinStandardHelpOptions](#mixinstandardhelpoptions)



---

### subcommandsRepeatable

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __subcommandsRepeatable__(boolean subcommandsRepeatable)</span>

Sets whether the subcommands of this command are repeatable, that is, whether such subcommands can
 occur multiple times and may be followed by sibling commands instead of just child commands.

**Since:**

4.2

**See Also:**


[subcommandsRepeatable](#subcommandsrepeatable)



---

### withToString

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __withToString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the string representation of this command, used in error messages and trace messages.

**Parameters:**

`newValue` - the string representation

**Returns:**

this CommandSpec for method chaining


---

### updateCommandAttributes

<span style="font-family: monospace; font-size: 80%;">public void __updateCommandAttributes__([Command](CommandLine.Command.md) cmd, [IFactory](CommandLine.IFactory.md) factory)</span>

Updates the following attributes from the specified `@Command` annotation:
aliases, ParserSpec#separator(), command name, version, help command,
version provider, default provider and [UsageMessageSpec](CommandLine.Model.UsageMessageSpec.md).

**Parameters:**

`cmd` - the `@Command` annotation to get attribute values from

`factory` - factory used to instantiate classes

**Since:**

3.7


---

### findOption

<span style="font-family: monospace; font-size: 80%;">public [OptionSpec](CommandLine.Model.OptionSpec.md) __findOption__(char shortName)</span>

Returns the option with the specified short name, or `null` if no option with that name is defined for this command.


---

### findOption

<span style="font-family: monospace; font-size: 80%;">public [OptionSpec](CommandLine.Model.OptionSpec.md) __findOption__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>

Returns the option with the specified name, or `null` if no option with that name is defined for this command.

**Parameters:**

`name` - used to search the options. May include option name prefix characters or not.


---

