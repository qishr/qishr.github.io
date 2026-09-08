Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface Parameters
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Parameters<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD,METHOD,PARAMETER)<br/>
public static @interface __Parameters__</span>




Fields annotated with `@Parameters` will be initialized with positional parameters.By specifying the
[index](#index) attribute you can pick the exact position or a range of positional parameters to apply. If no
index is specified, the field will get all positional parameters (and so it should be an array or a collection).



In the case of command methods (annotated with `@Command`), method parameters may be annotated with `@Parameters`,
but are are considered positional parameters by default, unless they are annotated with `@Option`.



Command class example:


import static picocli.CommandLine.*;

public class MyCalcParameters {
    Parameters(description = "Any number of input numbers")
    private ListBigDecimal files = new ArrayListBigDecimal();

    Option(names = { "-h", "--help" }, usageHelp = true, description = "Display this help and exit")
    private boolean help;
}



A field cannot be annotated with both `@Parameters` and `@Option` or a `ParameterException`
is thrown.


## Field Summary

| Modifier and Type          | Field                     | Description                                                                       |
|----------------------------|---------------------------|-----------------------------------------------------------------------------------|
| public static final String | [NULL_VALUE](#null_value) | Special value that can be used in some annotation attributes to designate `null`. |



## Method Summary

| Modifier and Type                                                                                                                                                                     | Method                                          | Description                                                                                                                                                                                                              |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [index](#index)()                               | Specify an index ("0", or "1", etc.) to pick which of the command line arguments should be assigned to this  field.                                                                                                      |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                        | [description](#description)()                   | Description of the parameter(s), used when generating the usage documentation.                                                                                                                                           |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [arity](#arity)()                               | Specifies the minimum number of required parameters and the maximum number of accepted parameters.                                                                                                                       |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [paramLabel](#paramlabel)()                     | Specify a `paramLabel` for the parameter to be used in the usage help message.                                                                                                                                           |
| public abstract boolean                                                                                                                                                               | [hideParamSyntax](#hideparamsyntax)()           | Returns whether usage syntax decorations around the [paramLabel.paramLabel](#paramlabel) should be suppressed.                                                                                                           |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[]                                                                       | [type](#type)()                                 |    Optionally specify a `type` to control exactly what Class the positional parameter should be converted to.                                                                                                            |
| public abstract java.lang.Class<? extends io.github.qishr.cascara.common.util.CommandLine.ITypeConverter<?>                                                                           | [converter](#converter)()                       | Optionally specify one or more [ITypeConverter](CommandLine.ITypeConverter.md) classes to use to convert the command line argument into a strongly typed value (or key-value pair for map fields).                       |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [split](#split)()                               | Specify a regular expression to use to split positional parameter values before applying them to the field.                                                                                                              |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [splitSynopsisLabel](#splitsynopsislabel)()     | Specify a string to show the split option parameter values in usage                                                                                                                                                      |
| public abstract boolean                                                                                                                                                               | [hidden](#hidden)()                             | Set `hidden=true` if this parameter should not be included in the usage message.                                                                                                                                         |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [defaultValue](#defaultvalue)()                 | Returns the default value of this positional parameter, before splitting and type conversion.                                                                                                                            |
| public abstract [Visibility](CommandLine.Help.Visibility.md)                                                                                                                          | [showDefaultValue](#showdefaultvalue)()         | Use this attribute to control for a specific positional parameter whether its default value should be shown in the usage  help message.                                                                                  |
| public abstract java.lang.Class<? extends java.lang.Iterable<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)>                            | [completionCandidates](#completioncandidates)() | Use this attribute to specify an `Iterable<String>` class that generates completion candidates for  this positional parameter.                                                                                           |
| public abstract boolean                                                                                                                                                               | [interactive](#interactive)()                   | Set `interactive=true` if this positional parameter will prompt the end user for a value (like a password).                                                                                                              |
| public abstract boolean                                                                                                                                                               | [echo](#echo)()                                 | Use this attribute to control whether user input for an interactive positional parameter is echoed to the console or not.                                                                                                |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [prompt](#prompt)()                             | Use this attribute to customize the text displayed to the end user for an interactive positional parameter when asking for user input.                                                                                   |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [descriptionKey](#descriptionkey)()             | ResourceBundle key for this option.                                                                                                                                                                                      |
| public abstract [ScopeType](CommandLine.ScopeType.md)                                                                                                                                 | [scope](#scope)()                               | Determines on which command(s) this positional parameter exists: on this command only (the default), or  whether this is a "global" parameter that is applied to this command and all subcommands, sub-subcommands, etc. |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterConsumer](CommandLine.IParameterConsumer.md)>         | [parameterConsumer](#parameterconsumer)()       | Optionally specify a custom `IParameterConsumer` to temporarily suspend picocli's parsing logic and process one or more command line arguments in a custom manner.                                                       |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                          | [mapFallbackValue](#mapfallbackvalue)()         | For positional parameters of type Map, setting the `mapFallbackValue` to any value allows end user  to specify key-only parameters for this parameter.                                                                   |
| public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)> | [preprocessor](#preprocessor)()                 | Returns the preprocessor for this positional parameter.                                                                                                                                                                  |



## Field Details

### NULL_VALUE

<span style="font-family: monospace; font-size: 80%;">public static final String __NULL_VALUE__</span>

Special value that can be used in some annotation attributes to designate `null`.


---


## Method Details

### index

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __index__()</span>

Specify an index ("0", or "1", etc.) to pick which of the command line arguments should be assigned to this
 field.For array or Collection fields, you can also specify an index range ("0..3", or "2..*", etc.) to assign
 a subset of the command line arguments to this field. The default is "*", meaning all command line arguments.

**Returns:**

an index or range specifying which of the command line arguments should be assigned to this field


---

### description

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __description__()</span>

Description of the parameter(s), used when generating the usage documentation.Each element of the array is rendered on a separate line.
 

May contain embedded [Formatter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html) like `%n` line separators. Literal percent `'%'` characters must be escaped with another `%`.
 


 The description may contain variables that are rendered when help is requested.
 The string `${DEFAULT-VALUE}` is replaced with the default value of the positional parameter. This is regardless of
 the command's Command#showDefaultValues() setting or the positional parameter's [showDefaultValue.showDefaultValue](#showdefaultvalue) setting.
 The string `${COMPLETION-CANDIDATES}` is replaced with the completion candidates generated by
 [completionCandidates.completionCandidates](#completioncandidates) in the description for this positional parameter.
 Also, embedded `%n` newline markers are converted to actual newlines.
 

**Returns:**

the description of the parameter(s)


---

### arity

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __arity__()</span>

Specifies the minimum number of required parameters and the maximum number of accepted parameters.If a
positive arity is declared, and the user specifies an insufficient number of parameters on the command line,
[MissingParameterException](CommandLine.MissingParameterException.md) is thrown by the #parse(String...) method.


The default depends on the type of the parameter: booleans require no parameters, arrays and Collections
accept zero to any number of parameters, and any other type accepts one parameter.


For single-value parameters, setting `arity = "0..1"` makes a positional parameter optional, while setting `arity = "1"` makes it required.


Required parameters that are part of a [ArgGroup](CommandLine.ArgGroup.md) are required within the group, not required within the command:
the group's multiplicity determines whether the group itself is required or optional.

**Returns:**

the range of minimum and maximum parameters accepted by this command


---

### paramLabel

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __paramLabel__()</span>

Specify a `paramLabel` for the parameter to be used in the usage help message.If omitted,
picocli uses the field name in fish brackets (`'<'` and `'>'`) by default. Example:
class Example {
    Parameters(paramLabel="FILE", description="path of the input FILE(s)")
    private File[] inputFiles;
}


By default, the above gives a usage help message like the following:
Usage: main class [FILE...]
[FILE...]       path of the input FILE(s)


**Returns:**

name of the positional parameter used in the usage help message


---

### hideParamSyntax

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hideParamSyntax__()</span>

Returns whether usage syntax decorations around the [paramLabel.paramLabel](#paramlabel) should be suppressed.The default is `false`: by default, the paramLabel is surrounded with `'['` and `']'` characters
 if the value is optional and followed by ellipses ("...") when multiple values can be specified.

**Since:**

3.6.0


---

### type

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?>[] __type__()</span>




Optionally specify a `type` to control exactly what Class the positional parameter should be converted
to.This may be useful when the field type is an interface or an abstract class. For example, a field can
be declared to have type `java.lang.Number`, and annotating `@Parameters(type=Short.class)`
ensures that the positional parameter value is converted to a `Short` before setting the field value.



For array fields whose component type is an interface or abstract class, specify the concrete component type.
For example, a field with type `Number[]` may be annotated with `@Parameters(type=Short.class)`
to ensure that positional parameter values are converted to `Short` before adding an element to the array.



Picocli will use the [ITypeConverter](CommandLine.ITypeConverter.md) that is
registered for the specified type to convert
the raw String values before modifying the field value.



Prior to 2.0, the `type` attribute was necessary for `Collection` and `Map` fields,
but starting from 2.0 picocli will infer the component type from the generic type's type arguments.
For example, for a field of type `Map<TimeUnit, Long>` picocli will know the positional parameter
should be split up in key=value pairs, where the key should be converted to a `java.util.concurrent.TimeUnit`
enum value, and the value should be converted to a `Long`. No `@Parameters(type=...)` type attribute
is required for this. For generic types with wildcards, picocli will take the specified upper or lower bound
as the Class to convert to, unless the `@Parameters` annotation specifies an explicit `type` attribute.



If the field type is a raw collection or a raw map, and you want it to contain other values than Strings,
or if the generic type's type arguments are interfaces or abstract classes, you may
specify a `type` attribute to control the Class that the positional parameter should be converted to.

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

Specify a regular expression to use to split positional parameter values before applying them to the field.All elements resulting from the split are added to the array or Collection. Previously ignored for single-value fields,
from picocli 4.0 a `split` regex can only be specified on multi-value options and positional parameters.

**Returns:**

a regular expression to split operand values or `""` if the value should not be split

**See Also:**


[split](#split)



---

### splitSynopsisLabel

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __splitSynopsisLabel__()</span>

Specify a string to show the split option parameter values in usage

**Since:**

4.3


---

### hidden

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __hidden__()</span>

Set `hidden=true` if this parameter should not be included in the usage message.

**Returns:**

whether this parameter should be excluded from the usage message


---

### defaultValue

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __defaultValue__()</span>

Returns the default value of this positional parameter, before splitting and type conversion.

To get a `null` default value, omit specifying a default value or use the special value Parameters#NULL_VALUE -
 for positional parameters of type `Optional<T>` that will result in the `Optional.empty()`
 value being assigned when the positional parameters is not specified on the command line.

**Returns:**

a String that (after type conversion) will be used as the value for this positional parameter if no value was specified on the command line

**Since:**

3.2


---

### showDefaultValue

<span style="font-family: monospace; font-size: 80%;">public abstract [Visibility](CommandLine.Help.Visibility.md) __showDefaultValue__()</span>

Use this attribute to control for a specific positional parameter whether its default value should be shown in the usage
 help message.If not specified, the default value is only shown when the Command#showDefaultValues()
 is set `true` on the command. Use this attribute to specify whether the default value
 for this specific positional parameter should always be shown or never be shown, regardless of the command setting.
 

Note that picocli 3.2 allows [description.description](#description) by specifying the variable
 `${DEFAULT-VALUE}` anywhere in the description that ignores this setting.

**Returns:**

whether this positional parameter's default value should be shown in the usage help message


---

### completionCandidates

<span style="font-family: monospace; font-size: 80%;">public abstract java.lang.Class<? extends java.lang.Iterable<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __completionCandidates__()</span>

Use this attribute to specify an `Iterable<String>` class that generates completion candidates for
 this positional parameter.For map fields, completion candidates should be in `key=value` form.
 


 Completion candidates are used in bash completion scripts generated by the `picocli.AutoComplete` class.
 Unfortunately, `picocli.AutoComplete` is not very good yet at generating completions for positional parameters.
 

**Returns:**

a class whose instances can iterate over the completion candidates for this positional parameter

**Since:**

3.2

**See Also:**


[IFactory](null.md)



---

### interactive

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __interactive__()</span>

Set `interactive=true` if this positional parameter will prompt the end user for a value (like a password).Only supported for single-value positional parameters (not arrays, collections or maps).
When running on Java 6 or greater and [Option.echo](#echo) (the default),
this will use the Console#readPassword() API to get a value without echoing input to the console,
otherwise it will simply read a value from `System.in`.

**Returns:**

whether this positional parameter prompts the end user for a value to be entered on the command line

**Since:**

3.5


---

### echo

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __echo__()</span>

Use this attribute to control whether user input for an interactive positional parameter is echoed to the console or not.If `echo = true`, the user input is echoed to the console.
 This attribute is ignored when `interactive = false` (the default).

**Returns:**

whether the user input for an interactive positional parameter should be echoed to the console or not

**Since:**

4.6

**See Also:**


[echo](#echo)



---

### prompt

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __prompt__()</span>

Use this attribute to customize the text displayed to the end user for an interactive positional parameter when asking for user input.When omitted, the displayed text is derived from the positional parameter's
 position (index) and the first description line.
 This attribute is ignored when `interactive = false` (the default).

**Returns:**

the text to display to the end user for an interactive positional parameter when asking for user input

**Since:**

4.6

**See Also:**


[prompt](#prompt)



---

### descriptionKey

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __descriptionKey__()</span>

ResourceBundle key for this option.If not specified, (and a ResourceBundle exists for this command) an attempt
 is made to find the positional parameter description using `paramLabel() + "[" + index() + "]"` as key.

**Since:**

3.6

**See Also:**


[description](#description)



---

### scope

<span style="font-family: monospace; font-size: 80%;">public abstract [ScopeType](CommandLine.ScopeType.md) __scope__()</span>

Determines on which command(s) this positional parameter exists: on this command only (the default), or
 whether this is a "global" parameter that is applied to this command and all subcommands, sub-subcommands, etc.

**Since:**

4.3


---

### parameterConsumer

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterConsumer](CommandLine.IParameterConsumer.md)> __parameterConsumer__()</span>

Optionally specify a custom `IParameterConsumer` to temporarily suspend picocli's parsing logic
and process one or more command line arguments in a custom manner.

**Since:**

4.0


---

### mapFallbackValue

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __mapFallbackValue__()</span>

For positional parameters of type Map, setting the `mapFallbackValue` to any value allows end user
 to specify key-only parameters for this parameter.For example, `key` instead of `key=value`.
 

The value specified in this annotation is the value that is put into the Map for the user-specified key.
 Use the special value Parameters#NULL_VALUE to specify `null` -
 for maps of type `Map<K, Optional<V>>` that will result in `Optional.empty()`
 values in the map when only the key is specified.
 

If no `mapFallbackValue` is set, key-only Map parameters like `-Dkey`
 are considered invalid user input and cause a [ParameterException](CommandLine.ParameterException.md) to be thrown.

**Since:**

4.6

**See Also:**


[mapFallbackValue](#mapfallbackvalue)



---

### preprocessor

<span style="font-family: monospace; font-size: 80%;">public abstract [Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<? extends [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)> __preprocessor__()</span>

Returns the preprocessor for this positional parameter.

**Since:**

4.6

**See Also:**


[IParameterPreprocessor](CommandLine.IParameterPreprocessor.md)



---

