Package [io.github.qishr.cascara.common.util](index.md)

# Class OptionSpec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.CommandLine.Model.ArgSpec](CommandLine.Model.ArgSpec.md)<br/>
                io.github.qishr.cascara.common.util.CommandLine.Model.OptionSpec<br/>
<br/>
All Implemented Interfaces:<br/>
    [IOrdered](CommandLine.Model.IOrdered.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __OptionSpec__<br/>extends [ArgSpec](CommandLine.Model.ArgSpec.md)
</span>

The `OptionSpec` class models aspects of a named option of a [CommandSpec](CommandLine.Model.CommandSpec.md), including whether
 it is required or optional, the option parameters supported (or required) by the option,
 and attributes for the usage help message describing the option.


 An option has one or more names. The option is matched when the parser encounters one of the option names in the command line arguments.
 Depending on the option's #arity(),
 the parser may expect it to have option parameters. The parser will call #setValue(Object) on
 the matched option for each of the option parameters encountered.
 


 For multi-value options, the `type` may be an array, a `Collection` or a `Map`. In this case
 the parser will get the data structure by calling #getValue() and modify the contents of this data structure.
 (In the case of arrays, the array is replaced with a new instance with additional elements.)
 


 Before calling the setter, picocli converts the option parameter value from a String to the option parameter's type.
 
 
   If a option-specific #converters() is configured, this will be used for type conversion.
   If the option's type is a `Map`, the map may have different types for its keys and its values, so
   #converters() should provide two converters: one for the map keys and one for the map values.
   Otherwise, the option's #type() is used to look up a converter in the list of
   registered converters.
   For multi-value options,
   the `type` may be an array, or a `Collection` or a `Map`. In that case the elements are converted
   based on the option's #auxiliaryTypes(). The auxiliaryType is used to look up
   the converter(s) to use to convert the individual parameter values.
   Maps may have different types for its keys and its values, so #auxiliaryTypes()
   should provide two types: one for the map keys and one for the map values.
 
 


 `OptionSpec` objects are used by the picocli command line interpreter and help message generator.
 Picocli can construct an `OptionSpec` automatically from fields and methods with [Option](CommandLine.Option.md)
 annotations. Alternatively an `OptionSpec` can be constructed programmatically.
 


 When an `OptionSpec` is created from an [Option](CommandLine.Option.md) -annotated field or method, it is "bound"
 to that field or method: this field is set (or the method is invoked) when the option is matched and
 #setValue(Object) is called.
 Programmatically constructed `OptionSpec` instances will remember the value passed to the
 #setValue(Object) method so it can be retrieved with the #getValue() method.
 This behaviour can be customized by installing a custom [IGetter](CommandLine.Model.IGetter.md) and [ISetter](CommandLine.Model.ISetter.md) on the `OptionSpec`.
 


## Nested Class Summary

| Modifier and Type | Class                                                                                                               | Description                                                  |
|-------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Model.OptionSpec.Builder](CommandLine.Model.OptionSpec.Builder.md) | Builder responsible for creating valid `OptionSpec` objects. |



## Field Summary

| Modifier and Type          | Field                                             | Description |
|----------------------------|---------------------------------------------------|-------------|
| public static final String | [DEFAULT_FALLBACK_VALUE](#default_fallback_value) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                            | Method                                                                                                                                                                                                                       | Description                                                                                                                                                                                                       |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [Builder](CommandLine.Model.OptionSpec.Builder.md)                                                                                                                                             | [builder](#builder)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] names) |                                                                                                                                                                                                                   |
| public static [Builder](CommandLine.Model.OptionSpec.Builder.md)                                                                                                                                             | [builder](#builder)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] names)                                                                                                    |                                                                                                                                                                                                                   |
| public static [Builder](CommandLine.Model.OptionSpec.Builder.md)                                                                                                                                             | [builder](#builder)([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) source, [IFactory](CommandLine.IFactory.md) factory)                                                                                         |                                                                                                                                                                                                                   |
| public static [Builder](CommandLine.Model.OptionSpec.Builder.md)                                                                                                                                             | [builder](#builder)([OptionSpec](CommandLine.Model.OptionSpec.md) original)                                                                                                                                                  | Returns a Builder initialized from the specified `OptionSpec`.                                                                                                                                                    |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                                                                                                                                    | [toBuilder](#tobuilder)()                                                                                                                                                                                                    | Returns a new Builder initialized with the attributes from this `OptionSpec`.                                                                                                                                     |
| public boolean                                                                                                                                                                                               | [isOption](#isoption)()                                                                                                                                                                                                      |                                                                                                                                                                                                                   |
| public boolean                                                                                                                                                                                               | [isPositional](#ispositional)()                                                                                                                                                                                              |                                                                                                                                                                                                                   |
| protected boolean                                                                                                                                                                                            | [internalShowDefaultValue](#internalshowdefaultvalue)(boolean usageMessageShowDefaults)                                                                                                                                      |                                                                                                                                                                                                                   |
| protected [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getAdditionalDescriptionKeys](#getadditionaldescriptionkeys)()                                                                                                                                                              | Returns the additional lookup keys for finding description lines in the resource bundle for this option.                                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                                                                                                        | [names](#names)()                                                                                                                                                                                                            | Returns one or more option names.                                                                                                                                                                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                          | [longestName](#longestname)()                                                                                                                                                                                                | Returns the longest [names.names](#names).                                                                                                                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                          | [shortestName](#shortestname)()                                                                                                                                                                                              | Returns the shortest [names.names](#names).                                                                                                                                                                       |
| public int                                                                                                                                                                                                   | [order](#order)()                                                                                                                                                                                                            | Returns the position in the options list in the usage help message at which this option should be shown.                                                                                                          |
| public boolean                                                                                                                                                                                               | [help](#help)()                                                                                                                                                                                                              | Returns whether this option disables validation of the other arguments.                                                                                                                                           |
| public boolean                                                                                                                                                                                               | [usageHelp](#usagehelp)()                                                                                                                                                                                                    | Returns whether this option allows the user to request usage help.                                                                                                                                                |
| public boolean                                                                                                                                                                                               | [versionHelp](#versionhelp)()                                                                                                                                                                                                | Returns whether this option allows the user to request version information.                                                                                                                                       |
| public boolean                                                                                                                                                                                               | [negatable](#negatable)()                                                                                                                                                                                                    | Returns whether a negative version for this boolean option is automatically added.                                                                                                                                |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                                          | [fallbackValue](#fallbackvalue)()                                                                                                                                                                                            | Returns the fallback value for this option: the value that is assigned for options with an optional parameter  (for example, `arity = "0..1"`) if the option was specified on the command line without parameter. |
| public boolean                                                                                                                                                                                               | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)                                                                                                          |                                                                                                                                                                                                                   |
| public int                                                                                                                                                                                                   | [hashCode](#hashcode)()                                                                                                                                                                                                      |                                                                                                                                                                                                                   |


### Methods inherited from [ArgSpec](CommandLine.Model.ArgSpec.md)

preprocessor, auxiliaryTypes, interactive, renderedDescription, messages, required, splitRegexSynopsisLabel, hidden, description, hideParamSyntax, stringValues, resetOriginalStringValues, echo, initialValue, descriptionKey, converters, inherited, completionCandidates, toString, command, isMultiValue, equalsImpl, root, group, getter, setter, originalStringValues, typeInfo, setValue, resetStringValues, typedValues, prompt, arity, parameterConsumer, showDefaultValue, defaultValueString, getValue, originallyRequired, splitRegex, setValue, mapFallbackValue, defaultValue, scopeType, type, userObject, messages, hashCodeImpl, scope, isValueGettable, hasInitialValue, defaultValueString, paramLabel


## Field Details

### DEFAULT_FALLBACK_VALUE

<span style="font-family: monospace; font-size: 80%;">public static final String __DEFAULT_FALLBACK_VALUE__</span>




---


## Method Details

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.OptionSpec.Builder.md) __builder__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] names)</span>




---

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.OptionSpec.Builder.md) __builder__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] names)</span>




---

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.OptionSpec.Builder.md) __builder__([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) source, [IFactory](CommandLine.IFactory.md) factory)</span>




---

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.OptionSpec.Builder.md) __builder__([OptionSpec](CommandLine.Model.OptionSpec.md) original)</span>

Returns a Builder initialized from the specified `OptionSpec`.

**Since:**

4.0


---

### toBuilder

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __toBuilder__()</span>

Returns a new Builder initialized with the attributes from this `OptionSpec`.Calling `build` immediately will return a copy of this `OptionSpec`.

**Returns:**

a builder that can create a copy of this spec


---

### isOption

<span style="font-family: monospace; font-size: 80%;">public boolean __isOption__()</span>



**Overrides:**

[ArgSpec](../cascara.common/util/CommandLine.Model.ArgSpec.md#isoption)


---

### isPositional

<span style="font-family: monospace; font-size: 80%;">public boolean __isPositional__()</span>



**Overrides:**

[ArgSpec](../cascara.common/util/CommandLine.Model.ArgSpec.md#ispositional)


---

### internalShowDefaultValue

<span style="font-family: monospace; font-size: 80%;">protected boolean __internalShowDefaultValue__(boolean usageMessageShowDefaults)</span>




---

### getAdditionalDescriptionKeys

<span style="font-family: monospace; font-size: 80%;">protected [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getAdditionalDescriptionKeys__()</span>

Returns the additional lookup keys for finding description lines in the resource bundle for this option.

**Returns:**

option names (after variable interpolation), without leading hyphens, slashes and other non-Java identifier characters.

**Overrides:**

[ArgSpec](../cascara.common/util/CommandLine.Model.ArgSpec.md#getadditionaldescriptionkeys)

**Since:**

4.0


---

### names

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __names__()</span>

Returns one or more option names.The returned array will contain at least one option name.

**See Also:**


[names](#names)



---

### longestName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __longestName__()</span>

Returns the longest [names.names](#names).


---

### shortestName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __shortestName__()</span>

Returns the shortest [names.names](#names).

**Since:**

3.8


---

### order

<span style="font-family: monospace; font-size: 80%;">public int __order__()</span>

Returns the position in the options list in the usage help message at which this option should be shown.Options with a lower number are shown before options with a higher number.
 This attribute is only honored if UsageMessageSpec#sortOptions() is `false` for this command.

**Specified By:**

[IOrdered](CommandLine.Model.IOrdered.md)

**Since:**

3.9

**See Also:**


[order](#order)



---

### help

<span style="font-family: monospace; font-size: 80%;">public boolean __help__()</span>

Returns whether this option disables validation of the other arguments.



!!! note "Deprecation"
    Use [usageHelp.usageHelp](#usagehelp) and [versionHelp.versionHelp](#versionhelp) instead.

**See Also:**


[help](#help)



---

### usageHelp

<span style="font-family: monospace; font-size: 80%;">public boolean __usageHelp__()</span>

Returns whether this option allows the user to request usage help.

**See Also:**


[usageHelp](#usagehelp)



---

### versionHelp

<span style="font-family: monospace; font-size: 80%;">public boolean __versionHelp__()</span>

Returns whether this option allows the user to request version information.

**See Also:**


[versionHelp](#versionhelp)



---

### negatable

<span style="font-family: monospace; font-size: 80%;">public boolean __negatable__()</span>

Returns whether a negative version for this boolean option is automatically added.The form of the negative name is determined by the [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md).

**Since:**

4.0

**See Also:**


[negatable](#negatable)



---

### fallbackValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __fallbackValue__()</span>

Returns the fallback value for this option: the value that is assigned for options with an optional parameter
 (for example, `arity = "0..1"`) if the option was specified on the command line without parameter.

If the special value #NULL_VALUE is set, this method returns `null`.

**Since:**

4.0

**See Also:**


[fallbackValue](#fallbackvalue)


[defaultValue](null.md)



---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)</span>




---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>




---

