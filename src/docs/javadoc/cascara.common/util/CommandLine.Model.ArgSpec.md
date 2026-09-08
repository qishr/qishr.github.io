Package [io.github.qishr.cascara.common.util](index.md)

# Class ArgSpec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ArgSpec<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)

Direct Known Subtypes:<br/>
    [OptionSpec](CommandLine.Model.OptionSpec.md), [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)


----

<span style="font-family: monospace; font-size: 80%;">public static abstract class __ArgSpec__</span>

Models the shared attributes of [OptionSpec](CommandLine.Model.OptionSpec.md) and [PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md).


## Field Summary

| Modifier and Type                 | Field                                       | Description |
|-----------------------------------|---------------------------------------------|-------------|
| protected final IAnnotatedElement | [annotatedElement](#annotatedelement)       |             |
| protected String                  | [toString](#tostring)                       |             |
| protected final ITypeInfo         | [typeInfo](#typeinfo)                       |             |
| protected boolean                 | [valueIsDefaultValue](#valueisdefaultvalue) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                                     | Method                                                                               | Description                                                                                                                                                                                                                                                                                                             |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public boolean                                                                                                                                                                                                        | [originallyRequired](#originallyrequired)()                                          | Returns the original value of the option's required attribute, regardless of whether the option is used in an exclusive group or not.                                                                                                                                                                                   |
| public boolean                                                                                                                                                                                                        | [required](#required)()                                                              | Returns whether this is a required option or positional parameter without a default value.                                                                                                                                                                                                                              |
| public boolean                                                                                                                                                                                                        | [interactive](#interactive)()                                                        | Returns whether this option will prompt the user to enter a value on the command line.                                                                                                                                                                                                                                  |
| public boolean                                                                                                                                                                                                        | [echo](#echo)()                                                                      | Returns whether the user input is echoed to the console or not for an interactive option or positional parameter when asking for user input.                                                                                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [prompt](#prompt)()                                                                  | Returns the text displayed to the end user for an interactive option or positional parameter when asking for user input.                                                                                                                                                                                                |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                 | [description](#description)()                                                        | Returns the description of this option or positional parameter, after all variables have been rendered,  including the `${DEFAULT-VALUE}` and `${COMPLETION-CANDIDATES}` variables.                                                                                                                                     |
| protected abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getAdditionalDescriptionKeys](#getadditionaldescriptionkeys)()                      | Subclasses should override to return a collection of additional description keys that may be used to find  description text for this option or positional parameter in the resource bundle.                                                                                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [descriptionKey](#descriptionkey)()                                                  | Returns the description key of this arg spec, used to get the description from a resource bundle.                                                                                                                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                                 | [renderedDescription](#rendereddescription)()                                        |                                                                                                                                                                                                                                                                                                                         |
| public [Range](CommandLine.Range.md)                                                                                                                                                                                  | [arity](#arity)()                                                                    | Returns how many arguments this option or positional parameter requires.                                                                                                                                                                                                                                                |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [paramLabel](#paramlabel)()                                                          | Returns the name of the option or positional parameter used in the usage help message.                                                                                                                                                                                                                                  |
| public boolean                                                                                                                                                                                                        | [hideParamSyntax](#hideparamsyntax)()                                                | Returns whether usage syntax decorations around the [paramLabel.paramLabel](#paramlabel) should be suppressed.                                                                                                                                                                                                          |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[]                                                                                                                | [auxiliaryTypes](#auxiliarytypes)()                                                  | Returns auxiliary type information used when the [type.type](#type) is a generic type like  `Collection`, `Map` or `Optional`; returns the concrete type when [type.type](#type)  is an abstract class, otherwise, returns the same as [type.type](#type).                                                              |
| public [ITypeConverter](CommandLine.ITypeConverter.md)<?>[]                                                                                                                                                           | [converters](#converters)()                                                          | Returns one or more CommandLine.ITypeConverter to use to convert the command line  argument into a strongly typed value (or key-value pair for map fields).                                                                                                                                                             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [splitRegex](#splitregex)()                                                          | Returns a regular expression to split option parameter values or `""` if the value should not be split.                                                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [splitRegexSynopsisLabel](#splitregexsynopsislabel)()                                | Returns a regular expression to split option parameter for usage information.                                                                                                                                                                                                                                           |
| public boolean                                                                                                                                                                                                        | [hidden](#hidden)()                                                                  | Returns whether this option should be excluded from the usage message.                                                                                                                                                                                                                                                  |
| public boolean                                                                                                                                                                                                        | [inherited](#inherited)()                                                            | Returns whether this option is inherited from a parent command.                                                                                                                                                                                                                                                         |
| public [ArgSpec](CommandLine.Model.ArgSpec.md)                                                                                                                                                                        | [root](#root)()                                                                      | Returns the root option or positional parameter (on the parent command), if this option or positional parameter was inherited;  or `null` if it was not.                                                                                                                                                                |
| public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>                                                                                                                  | [type](#type)()                                                                      | Returns the type to convert the option or positional parameter to before [setValue.setValue](#setvalue) the value.                                                                                                                                                                                                      |
| public [ITypeInfo](CommandLine.Model.ITypeInfo.md)                                                                                                                                                                    | [typeInfo](#typeinfo)()                                                              | Returns the `ITypeInfo` that can be used both at compile time (by annotation processors) and at runtime.                                                                                                                                                                                                                |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                   | [userObject](#userobject)()                                                          | Returns the user object associated with this option or positional parameters.                                                                                                                                                                                                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [mapFallbackValue](#mapfallbackvalue)()                                              | Returns the fallback value for this Map option or positional parameter: the value that is put into the Map when only the  key is specified for the option or positional parameter, like `-Dkey` instead of `-Dkey=value`.                                                                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [defaultValue](#defaultvalue)()                                                      | Returns the default value to assign if this option or positional parameter was not specified on the command line, before splitting and type conversion.                                                                                                                                                                 |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)                                                                                                                   | [initialValue](#initialvalue)()                                                      | Returns the initial value of this option or positional parameter: the value that, if [hasInitialValue.hasInitialValue](#hasinitialvalue) is true,  the option will be reset to before parsing (regardless of whether a default value exists),  to clear values that would otherwise remain from parsing previous input. |
| public boolean                                                                                                                                                                                                        | [hasInitialValue](#hasinitialvalue)()                                                | Determines whether the option or positional parameter will be reset to the [initialValue.initialValue](#initialvalue)  before parsing new input.                                                                                                                                                                        |
| public [Visibility](CommandLine.Help.Visibility.md)                                                                                                                                                                   | [showDefaultValue](#showdefaultvalue)()                                              | Returns whether this option or positional parameter's default value should be shown in the usage help.                                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [defaultValueString](#defaultvaluestring)()                                          | Returns the default value String for the purpose of displaying it in the description, without interpolating variables.                                                                                                                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [defaultValueString](#defaultvaluestring)(boolean interpolateVariables)              | Returns the default value String displayed in the description; interpolating variables if specified.                                                                                                                                                                                                                    |
| public [Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                 | [completionCandidates](#completioncandidates)()                                      | Returns the explicitly set completion candidates for this option or positional parameter, valid enum  constant names, or `null` if this option or positional parameter does not have any completion  candidates and its type is not an enum.                                                                            |
| public [IParameterConsumer](CommandLine.IParameterConsumer.md)                                                                                                                                                        | [parameterConsumer](#parameterconsumer)()                                            | Returns a custom `IParameterConsumer` to temporarily suspend picocli's parsing logic  and process one or more command line arguments in a custom manner, or `null`.                                                                                                                                                     |
| public [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)                                                                                                                                                | [preprocessor](#preprocessor)()                                                      | Returns a custom `IParameterPreprocessor` to either replace or complement picocli's parsing logic  for the parameter(s) of this option or position.                                                                                                                                                                     |
| public [IGetter](CommandLine.Model.IGetter.md)                                                                                                                                                                        | [getter](#getter)()                                                                  | Returns the [IGetter](CommandLine.Model.IGetter.md) that is responsible for supplying the value of this argument.                                                                                                                                                                                                       |
| public [ISetter](CommandLine.Model.ISetter.md)                                                                                                                                                                        | [setter](#setter)()                                                                  | Returns the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of this argument.                                                                                                                                                                                                       |
| public [IScope](CommandLine.Model.IScope.md)                                                                                                                                                                          | [scope](#scope)()                                                                    | Returns the binding [IScope](CommandLine.Model.IScope.md) that determines on which object to set the value (or from which object to get the value) of this argument.                                                                                                                                                    |
| public [ScopeType](CommandLine.ScopeType.md)                                                                                                                                                                          | [scopeType](#scopetype)()                                                            | Returns the scope of this argument; is it local, or inherited (it applies to this command as well as all sub- and sub-subcommands).                                                                                                                                                                                     |
| public boolean                                                                                                                                                                                                        | [isValueGettable](#isvaluegettable)()                                                | Check whether the [getValue.getValue](#getvalue) method is able to get an actual value from the current [getter.getter](#getter).                                                                                                                                                                                       |
| public T                                                                                                                                                                                                              | [getValue](#getvalue)()                                                              | Returns the current value of this argument.                                                                                                                                                                                                                                                                             |
| public T                                                                                                                                                                                                              | [setValue](#setvalue)(T newValue)                                                    | Sets the value of this argument to the specified value and returns the previous value.                                                                                                                                                                                                                                  |
| public T                                                                                                                                                                                                              | [setValue](#setvalue)(T newValue, [CommandLine](CommandLine.md) commandLine)         | Sets the value of this argument to the specified value and returns the previous value.                                                                                                                                                                                                                                  |
| public boolean                                                                                                                                                                                                        | [isMultiValue](#ismultivalue)()                                                      | Returns `true` if this argument's [type.type](#type) is an array, a `Collection` or a `Map`, `false` otherwise.                                                                                                                                                                                                         |
| public abstract boolean                                                                                                                                                                                               | [isOption](#isoption)()                                                              | Returns `true` if this argument is a named option, `false` otherwise.                                                                                                                                                                                                                                                   |
| public abstract boolean                                                                                                                                                                                               | [isPositional](#ispositional)()                                                      | Returns `true` if this argument is a positional parameter, `false` otherwise.                                                                                                                                                                                                                                           |
| public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)                                                                                                                                                              | [group](#group)()                                                                    | Returns the groups this option or positional parameter belongs to, or `null` if this option is not part of a group.                                                                                                                                                                                                     |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                                                                                                                | [command](#command)()                                                                | Returns the command this option or positional parameter belongs to.                                                                                                                                                                                                                                                     |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                         | [stringValues](#stringvalues)()                                                      | Returns the untyped command line arguments matched by this option or positional parameter spec.                                                                                                                                                                                                                         |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>                         | [typedValues](#typedvalues)()                                                        | Returns the typed command line arguments matched by this option or positional parameter spec.                                                                                                                                                                                                                           |
| protected void                                                                                                                                                                                                        | [resetStringValues](#resetstringvalues)()                                            | Sets the `stringValues` to a new list instance.                                                                                                                                                                                                                                                                         |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                         | [originalStringValues](#originalstringvalues)()                                      | Returns the original command line arguments matched by this option or positional parameter spec.                                                                                                                                                                                                                        |
| protected void                                                                                                                                                                                                        | [resetOriginalStringValues](#resetoriginalstringvalues)()                            | Sets the `originalStringValues` to a new list instance.                                                                                                                                                                                                                                                                 |
| protected boolean                                                                                                                                                                                                     | [internalShowDefaultValue](#internalshowdefaultvalue)(boolean usageHelpShowDefaults) | Returns whether the default for this option or positional parameter should be shown, potentially overriding the specified global setting.                                                                                                                                                                               |
| public [Messages](CommandLine.Model.Messages.md)                                                                                                                                                                      | [messages](#messages)()                                                              | Returns the Messages for this arg specification, or `null`.                                                                                                                                                                                                                                                             |
| public [ArgSpec](CommandLine.Model.ArgSpec.md)                                                                                                                                                                        | [messages](#messages)([Messages](CommandLine.Model.Messages.md) msgs)                | Sets the Messages for this ArgSpec, and returns this ArgSpec.                                                                                                                                                                                                                                                           |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                                   | [toString](#tostring)()                                                              | Returns a string respresentation of this option or positional parameter.                                                                                                                                                                                                                                                |
| protected boolean                                                                                                                                                                                                     | [equalsImpl](#equalsimpl)([ArgSpec](CommandLine.Model.ArgSpec.md) other)             |                                                                                                                                                                                                                                                                                                                         |
| protected int                                                                                                                                                                                                         | [hashCodeImpl](#hashcodeimpl)()                                                      |                                                                                                                                                                                                                                                                                                                         |



## Field Details

### annotatedElement

<span style="font-family: monospace; font-size: 80%;">protected final IAnnotatedElement __annotatedElement__</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">protected String __toString__</span>




---

### typeInfo

<span style="font-family: monospace; font-size: 80%;">protected final ITypeInfo __typeInfo__</span>




---

### valueIsDefaultValue

<span style="font-family: monospace; font-size: 80%;">protected boolean __valueIsDefaultValue__</span>




---


## Method Details

### originallyRequired

<span style="font-family: monospace; font-size: 80%;">public boolean __originallyRequired__()</span>

Returns the original value of the option's required attribute, regardless of whether the option is used in an exclusive group or not.

**Since:**

4.7.8-SNAPSHOT

**See Also:**


[required](#required)



---

### required

<span style="font-family: monospace; font-size: 80%;">public boolean __required__()</span>

Returns whether this is a required option or positional parameter without a default value.If this argument is part of a [ArgGroup](CommandLine.ArgGroup.md), this method returns whether this argument is required within the group (so it is not necessarily a required argument for the command).

**See Also:**


[required](#required)



---

### interactive

<span style="font-family: monospace; font-size: 80%;">public boolean __interactive__()</span>

Returns whether this option will prompt the user to enter a value on the command line.

**See Also:**


[interactive](#interactive)


[interactive](#interactive)



---

### echo

<span style="font-family: monospace; font-size: 80%;">public boolean __echo__()</span>

Returns whether the user input is echoed to the console or not for an interactive option or positional parameter when asking for user input.

**Since:**

4.6

**See Also:**


[echo](#echo)


[echo](#echo)



---

### prompt

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __prompt__()</span>

Returns the text displayed to the end user for an interactive option or positional parameter when asking for user input.

**Since:**

4.6

**See Also:**


[prompt](#prompt)


[prompt](#prompt)



---

### description

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __description__()</span>

Returns the description of this option or positional parameter, after all variables have been rendered,
 including the `${DEFAULT-VALUE}` and `${COMPLETION-CANDIDATES}` variables.Use CommandSpec#interpolateVariables(Boolean) to switch off variable expansion if needed.
 


 If a resource bundle has been [ArgSpec.messages](#messages), this method will first try to find a value in the resource bundle:
 If the resource bundle has no entry for the `fully qualified commandName + "." + descriptionKey` or for the unqualified `descriptionKey`,
 an attempt is made to find the option or positional parameter description using any of the
 [getAdditionalDescriptionKeys.getAdditionalDescriptionKeys](#getadditionaldescriptionkeys), first with the `fully qualified commandName + "."` prefix, then without.
 

**See Also:**


[qualifiedName](null.md)


[getAdditionalDescriptionKeys](#getadditionaldescriptionkeys)


[description](#description)


[description](#description)



---

### getAdditionalDescriptionKeys

<span style="font-family: monospace; font-size: 80%;">protected abstract [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getAdditionalDescriptionKeys__()</span>

Subclasses should override to return a collection of additional description keys that may be used to find
 description text for this option or positional parameter in the resource bundle.

**Since:**

4.0

**See Also:**


[getAdditionalDescriptionKeys](#getadditionaldescriptionkeys)


[getAdditionalDescriptionKeys](#getadditionaldescriptionkeys)



---

### descriptionKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __descriptionKey__()</span>

Returns the description key of this arg spec, used to get the description from a resource bundle.

**Since:**

3.6

**See Also:**


[descriptionKey](#descriptionkey)


[descriptionKey](#descriptionkey)



---

### renderedDescription

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __renderedDescription__()</span>





!!! note "Deprecation"
    Use [description.description](#description) instead


---

### arity

<span style="font-family: monospace; font-size: 80%;">public [Range](CommandLine.Range.md) __arity__()</span>

Returns how many arguments this option or positional parameter requires.

**See Also:**


[arity](#arity)



---

### paramLabel

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __paramLabel__()</span>

Returns the name of the option or positional parameter used in the usage help message.

**See Also:**


[paramLabel](#paramlabel)


[paramLabel](#paramlabel)



---

### hideParamSyntax

<span style="font-family: monospace; font-size: 80%;">public boolean __hideParamSyntax__()</span>

Returns whether usage syntax decorations around the [paramLabel.paramLabel](#paramlabel) should be suppressed.The default is `false`: by default, the paramLabel is surrounded with `'['` and `']'` characters
 if the value is optional and followed by ellipses ("...") when multiple values can be specified.

**Since:**

3.6.0


---

### auxiliaryTypes

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[] __auxiliaryTypes__()</span>

Returns auxiliary type information used when the [type.type](#type) is a generic type like
 `Collection`, `Map` or `Optional`; returns the concrete type when [type.type](#type)
 is an abstract class, otherwise, returns the same as [type.type](#type).

**See Also:**


[type](#type)



---

### converters

<span style="font-family: monospace; font-size: 80%;">public [ITypeConverter](CommandLine.ITypeConverter.md)<?>[] __converters__()</span>

Returns one or more CommandLine.ITypeConverter to use to convert the command line
 argument into a strongly typed value (or key-value pair for map fields).This is useful when a particular
 option or positional parameter should use a custom conversion that is different from the normal conversion for the arg spec's type.

**See Also:**


[converter](null.md)



---

### splitRegex

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __splitRegex__()</span>

Returns a regular expression to split option parameter values or `""` if the value should not be split.

**See Also:**


[split](null.md)



---

### splitRegexSynopsisLabel

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __splitRegexSynopsisLabel__()</span>

Returns a regular expression to split option parameter for usage information.

**Since:**

4.3

**See Also:**


[splitSynopsisLabel](null.md)



---

### hidden

<span style="font-family: monospace; font-size: 80%;">public boolean __hidden__()</span>

Returns whether this option should be excluded from the usage message.

**See Also:**


[hidden](#hidden)



---

### inherited

<span style="font-family: monospace; font-size: 80%;">public boolean __inherited__()</span>

Returns whether this option is inherited from a parent command.

**Since:**

4.3.0

**See Also:**


[scope](#scope)



---

### root

<span style="font-family: monospace; font-size: 80%;">public [ArgSpec](CommandLine.Model.ArgSpec.md) __root__()</span>

Returns the root option or positional parameter (on the parent command), if this option or positional parameter was inherited;
 or `null` if it was not.

**Since:**

4.6.0

**See Also:**


[scope](#scope)



---

### type

<span style="font-family: monospace; font-size: 80%;">public [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> __type__()</span>

Returns the type to convert the option or positional parameter to before [setValue.setValue](#setvalue) the value.This may be a container type like `List`, `Map`, or `Optional`,
 in which case the type or types of the elements are returned by [auxiliaryTypes.auxiliaryTypes](#auxiliarytypes).


---

### typeInfo

<span style="font-family: monospace; font-size: 80%;">public [ITypeInfo](CommandLine.Model.ITypeInfo.md) __typeInfo__()</span>

Returns the `ITypeInfo` that can be used both at compile time (by annotation processors) and at runtime.

**Since:**

4.0


---

### userObject

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __userObject__()</span>

Returns the user object associated with this option or positional parameters.

**Returns:**

may return the annotated program element, or some other useful object

**Since:**

4.0


---

### mapFallbackValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __mapFallbackValue__()</span>

Returns the fallback value for this Map option or positional parameter: the value that is put into the Map when only the
 key is specified for the option or positional parameter, like `-Dkey` instead of `-Dkey=value`.

If no `mapFallbackValue` is set, key-only Map parameters like `-Dkey`
 are considered invalid user input and cause a [ParameterException](CommandLine.ParameterException.md) to be thrown.
 

By default, this method returns a special "__unspecified__" value indicating that no `mapFallbackValue` was set.

**Since:**

4.6

**See Also:**


[mapFallbackValue](#mapfallbackvalue)


[mapFallbackValue](#mapfallbackvalue)



---

### defaultValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __defaultValue__()</span>

Returns the default value to assign if this option or positional parameter was not specified on the command line, before splitting and type conversion.This method returns the programmatically set value; this may differ from the default value that is actually used:
 if this ArgSpec is part of a CommandSpec with a [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md), picocli will first try to obtain
 the default value from the default value provider, and this method is only called if the default provider is
 `null` or returned a `null` value.

**Returns:**

the programmatically set default value of this option/positional parameter,
      returning `null` means this option or positional parameter does not have a default

**See Also:**


[defaultValueProvider](null.md)


[fallbackValue](null.md)



---

### initialValue

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __initialValue__()</span>

Returns the initial value of this option or positional parameter: the value that, if [hasInitialValue.hasInitialValue](#hasinitialvalue) is true,
 the option will be reset to before parsing (regardless of whether a default value exists),
 to clear values that would otherwise remain from parsing previous input.


---

### hasInitialValue

<span style="font-family: monospace; font-size: 80%;">public boolean __hasInitialValue__()</span>

Determines whether the option or positional parameter will be reset to the [initialValue.initialValue](#initialvalue)
 before parsing new input.


---

### showDefaultValue

<span style="font-family: monospace; font-size: 80%;">public [Visibility](CommandLine.Help.Visibility.md) __showDefaultValue__()</span>

Returns whether this option or positional parameter's default value should be shown in the usage help.


---

### defaultValueString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __defaultValueString__()</span>

Returns the default value String for the purpose of displaying it in the description, without interpolating variables.

**See Also:**


[defaultValueString](#defaultvaluestring)



---

### defaultValueString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __defaultValueString__(boolean interpolateVariables)</span>

Returns the default value String displayed in the description; interpolating variables if specified.If this ArgSpec is part of a
 CommandSpec with a [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md), this method will first try to obtain
 the default value from the default value provider; if the provider is `null` or if it
 returns a `null` value, then next any value set to [ArgSpec.defaultValue](#defaultvalue)
 is returned, and if this is also `null`, finally the [ArgSpec.initialValue](#initialvalue) is returned.

**Parameters:**

`interpolateVariables` - whether to interpolate variables in the `defaultValue` attribute of this ArgSpec

**Since:**

4.0

**See Also:**


[defaultValueProvider](null.md)


[defaultValue](#defaultvalue)



---

### completionCandidates

<span style="font-family: monospace; font-size: 80%;">public [Iterable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __completionCandidates__()</span>

Returns the explicitly set completion candidates for this option or positional parameter, valid enum
 constant names, or `null` if this option or positional parameter does not have any completion
 candidates and its type is not an enum.

**Returns:**

the completion candidates for this option or positional parameter, valid enum constant names,
 or `null`

**Since:**

3.2


---

### parameterConsumer

<span style="font-family: monospace; font-size: 80%;">public [IParameterConsumer](CommandLine.IParameterConsumer.md) __parameterConsumer__()</span>

Returns a custom `IParameterConsumer` to temporarily suspend picocli's parsing logic
 and process one or more command line arguments in a custom manner, or `null`.An example of when this may be useful is when passing arguments through to another program.

**Since:**

4.0


---

### preprocessor

<span style="font-family: monospace; font-size: 80%;">public [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md) __preprocessor__()</span>

Returns a custom `IParameterPreprocessor` to either replace or complement picocli's parsing logic
 for the parameter(s) of this option or position.

**Since:**

4.6


---

### getter

<span style="font-family: monospace; font-size: 80%;">public [IGetter](CommandLine.Model.IGetter.md) __getter__()</span>

Returns the [IGetter](CommandLine.Model.IGetter.md) that is responsible for supplying the value of this argument.


---

### setter

<span style="font-family: monospace; font-size: 80%;">public [ISetter](CommandLine.Model.ISetter.md) __setter__()</span>

Returns the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of this argument.


---

### scope

<span style="font-family: monospace; font-size: 80%;">public [IScope](CommandLine.Model.IScope.md) __scope__()</span>

Returns the binding [IScope](CommandLine.Model.IScope.md) that determines on which object to set the value (or from which object to get the value) of this argument.


---

### scopeType

<span style="font-family: monospace; font-size: 80%;">public [ScopeType](CommandLine.ScopeType.md) __scopeType__()</span>

Returns the scope of this argument; is it local, or inherited (it applies to this command as well as all sub- and sub-subcommands).

**Returns:**

whether this argument applies to all descendent subcommands of the command where it is defined

**Since:**

4.3


---

### isValueGettable

<span style="font-family: monospace; font-size: 80%;">public boolean __isValueGettable__()</span>

Check whether the [getValue.getValue](#getvalue) method is able to get an actual value from the current [getter.getter](#getter).

**Since:**

4.7


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public T __getValue__()</span>

Returns the current value of this argument.Delegates to the current [getter.getter](#getter).

**Throws:**

[PicocliException](CommandLine.PicocliException.md)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public T __setValue__(T newValue)</span>

Sets the value of this argument to the specified value and returns the previous value.Delegates to the current [setter.setter](#setter).

**Throws:**

[PicocliException](CommandLine.PicocliException.md)


---

### setValue

<span style="font-family: monospace; font-size: 80%;">public T __setValue__(T newValue, [CommandLine](CommandLine.md) commandLine)</span>

Sets the value of this argument to the specified value and returns the previous value.Delegates to the current [setter.setter](#setter).



!!! note "Deprecation"
    use [setValue.setValue](#setvalue) instead. This was a design mistake.

**Throws:**

[PicocliException](CommandLine.PicocliException.md)

**Since:**

3.5


---

### isMultiValue

<span style="font-family: monospace; font-size: 80%;">public boolean __isMultiValue__()</span>

Returns `true` if this argument's [type.type](#type) is an array, a `Collection` or a `Map`, `false` otherwise.


---

### isOption

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isOption__()</span>

Returns `true` if this argument is a named option, `false` otherwise.


---

### isPositional

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __isPositional__()</span>

Returns `true` if this argument is a positional parameter, `false` otherwise.


---

### group

<span style="font-family: monospace; font-size: 80%;">public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) __group__()</span>

Returns the groups this option or positional parameter belongs to, or `null` if this option is not part of a group.

**Since:**

4.0


---

### command

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __command__()</span>

Returns the command this option or positional parameter belongs to.

Beware that it is possible to programmatically add an option or positional parameter to more than one command model.
 (This will not happen in models that are auto-generated from annotations). In that case this method will only return
 the one it was added to last.
 

If the option or positional parameter has not yet been attached to a command, `null` will be returned.

**Since:**

4.1


---

### stringValues

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __stringValues__()</span>

Returns the untyped command line arguments matched by this option or positional parameter spec.

**Returns:**

the matched arguments after [splitRegex.splitRegex](#splitregex), but before type conversion.
      For map properties, `"key=value"` values are split into the key and the value part.


---

### typedValues

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)> __typedValues__()</span>

Returns the typed command line arguments matched by this option or positional parameter spec.

**Returns:**

the matched arguments after [splitRegex.splitRegex](#splitregex) and type conversion.
      For map properties, `"key=value"` values are split into the key and the value part.


---

### resetStringValues

<span style="font-family: monospace; font-size: 80%;">protected void __resetStringValues__()</span>

Sets the `stringValues` to a new list instance.


---

### originalStringValues

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __originalStringValues__()</span>

Returns the original command line arguments matched by this option or positional parameter spec.

**Returns:**

the matched arguments as found on the command line: empty Strings for options without value, the
      values have not been [splitRegex.splitRegex](#splitregex), and for map properties values may look like `"key=value"`


---

### resetOriginalStringValues

<span style="font-family: monospace; font-size: 80%;">protected void __resetOriginalStringValues__()</span>

Sets the `originalStringValues` to a new list instance.


---

### internalShowDefaultValue

<span style="font-family: monospace; font-size: 80%;">protected boolean __internalShowDefaultValue__(boolean usageHelpShowDefaults)</span>

Returns whether the default for this option or positional parameter should be shown, potentially overriding the specified global setting.

**Parameters:**

`usageHelpShowDefaults` - whether the command's UsageMessageSpec is configured to show default values.


---

### messages

<span style="font-family: monospace; font-size: 80%;">public [Messages](CommandLine.Model.Messages.md) __messages__()</span>

Returns the Messages for this arg specification, or `null`.

**Since:**

3.6


---

### messages

<span style="font-family: monospace; font-size: 80%;">public [ArgSpec](CommandLine.Model.ArgSpec.md) __messages__([Messages](CommandLine.Model.Messages.md) msgs)</span>

Sets the Messages for this ArgSpec, and returns this ArgSpec.

**Parameters:**

`msgs` - the new Messages value, may be `null`

**Since:**

3.6

**See Also:**


[resourceBundle](null.md)


[description](#description)


[description](#description)



---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns a string respresentation of this option or positional parameter.


---

### equalsImpl

<span style="font-family: monospace; font-size: 80%;">protected boolean __equalsImpl__([ArgSpec](CommandLine.Model.ArgSpec.md) other)</span>




---

### hashCodeImpl

<span style="font-family: monospace; font-size: 80%;">protected int __hashCodeImpl__()</span>




---

