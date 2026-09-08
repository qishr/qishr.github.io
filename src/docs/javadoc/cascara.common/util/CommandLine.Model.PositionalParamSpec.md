Package [io.github.qishr.cascara.common.util](index.md)

# Class PositionalParamSpec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.CommandLine.Model.ArgSpec](CommandLine.Model.ArgSpec.md)<br/>
                io.github.qishr.cascara.common.util.CommandLine.Model.PositionalParamSpec<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __PositionalParamSpec__<br/>extends [ArgSpec](CommandLine.Model.ArgSpec.md)
</span>

The `PositionalParamSpec` class models aspects of a positional parameter of a [CommandSpec](CommandLine.Model.CommandSpec.md), including whether
 it is required or optional, and attributes for the usage help message describing the positional parameter.


 Positional parameters have an [index](#index) (or a range of indices). A positional parameter is matched when the parser
 encounters a command line argument at that index. Named options and their parameters do not change the index counter,
 so the command line can contain a mixture of positional parameters and named options.
 


 Depending on the positional parameter's #arity(), the parser may consume multiple command line
 arguments starting from the current index. The parser will call #setValue(Object) on
 the `PositionalParamSpec` for each of the parameters encountered.
 For multi-value positional parameters, the `type` may be an array, a `Collection` or a `Map`. In this case
 the parser will get the data structure by calling #getValue() and modify the contents of this data structure.
 (In the case of arrays, the array is replaced with a new instance with additional elements.)
 


 Before calling the setter, picocli converts the positional parameter value from a String to the parameter's type.
 
 
   If a positional parameter-specific #converters() is configured, this will be used for type conversion.
   If the positional parameter's type is a `Map`, the map may have different types for its keys and its values, so
   #converters() should provide two converters: one for the map keys and one for the map values.
   Otherwise, the positional parameter's #type() is used to look up a converter in the list of
   registered converters. For multi-value positional parameters,
   the `type` may be an array, or a `Collection` or a `Map`. In that case the elements are converted
   based on the positional parameter's #auxiliaryTypes(). The auxiliaryType is used to look up
   the converter(s) to use to convert the individual parameter values.
   Maps may have different types for its keys and its values, so #auxiliaryTypes()
   should provide two types: one for the map keys and one for the map values.
 
 


 `PositionalParamSpec` objects are used by the picocli command line interpreter and help message generator.
 Picocli can construct a `PositionalParamSpec` automatically from fields and methods with [Parameters](CommandLine.Parameters.md)
 annotations. Alternatively a `PositionalParamSpec` can be constructed programmatically.
 


 When a `PositionalParamSpec` is created from a [Parameters](CommandLine.Parameters.md) -annotated field or method,
 it is "bound" to that field or method: this field is set (or the method is invoked) when the position is matched
 and #setValue(Object) is called.
 Programmatically constructed `PositionalParamSpec` instances will remember the value passed to the
 #setValue(Object) method so it can be retrieved with the #getValue() method.
 This behaviour can be customized by installing a custom [IGetter](CommandLine.Model.IGetter.md) and [ISetter](CommandLine.Model.ISetter.md) on the `PositionalParamSpec`.
 


## Nested Class Summary

| Modifier and Type | Class                                                                                                                                 | Description                                                           |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Model.PositionalParamSpec.Builder](CommandLine.Model.PositionalParamSpec.Builder.md) | Builder responsible for creating valid `PositionalParamSpec` objects. |



## Method Summary

| Modifier and Type                                                                                                                                                                                            | Method                                                                                                                               | Description                                                                                                               |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| public static [Builder](CommandLine.Model.PositionalParamSpec.Builder.md)                                                                                                                                    | [builder](#builder)()                                                                                                                |                                                                                                                           |
| public static [Builder](CommandLine.Model.PositionalParamSpec.Builder.md)                                                                                                                                    | [builder](#builder)([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) original)                                        | Returns a Builder initialized from the specified `PositionalSpec`.                                                        |
| public static [Builder](CommandLine.Model.PositionalParamSpec.Builder.md)                                                                                                                                    | [builder](#builder)([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) source, [IFactory](CommandLine.IFactory.md) factory) |                                                                                                                           |
| public [Builder](CommandLine.Model.PositionalParamSpec.Builder.md)                                                                                                                                           | [toBuilder](#tobuilder)()                                                                                                            | Returns a new Builder initialized with the attributes from this `PositionalParamSpec`.                                    |
| public boolean                                                                                                                                                                                               | [isOption](#isoption)()                                                                                                              |                                                                                                                           |
| public boolean                                                                                                                                                                                               | [isPositional](#ispositional)()                                                                                                      |                                                                                                                           |
| protected [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getAdditionalDescriptionKeys](#getadditionaldescriptionkeys)()                                                                      | Returns the additional lookup keys for finding description lines in the resource bundle for this positional parameter.    |
| public [Range](CommandLine.Range.md)                                                                                                                                                                         | [index](#index)()                                                                                                                    | Returns an index or range specifying which of the command line arguments should be assigned to this positional parameter. |
| public int                                                                                                                                                                                                   | [hashCode](#hashcode)()                                                                                                              |                                                                                                                           |
| public boolean                                                                                                                                                                                               | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)                  |                                                                                                                           |


### Methods inherited from [ArgSpec](CommandLine.Model.ArgSpec.md)

preprocessor, auxiliaryTypes, interactive, renderedDescription, messages, required, splitRegexSynopsisLabel, internalShowDefaultValue, hidden, description, hideParamSyntax, stringValues, resetOriginalStringValues, echo, initialValue, descriptionKey, converters, inherited, completionCandidates, toString, command, isMultiValue, equalsImpl, root, group, getter, setter, originalStringValues, typeInfo, setValue, resetStringValues, typedValues, prompt, arity, parameterConsumer, showDefaultValue, defaultValueString, getValue, originallyRequired, splitRegex, setValue, mapFallbackValue, defaultValue, scopeType, type, userObject, messages, hashCodeImpl, scope, isValueGettable, hasInitialValue, defaultValueString, paramLabel


## Method Details

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.PositionalParamSpec.Builder.md) __builder__()</span>




---

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.PositionalParamSpec.Builder.md) __builder__([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) original)</span>

Returns a Builder initialized from the specified `PositionalSpec`.

**Since:**

4.0


---

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.PositionalParamSpec.Builder.md) __builder__([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) source, [IFactory](CommandLine.IFactory.md) factory)</span>




---

### toBuilder

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.PositionalParamSpec.Builder.md) __toBuilder__()</span>

Returns a new Builder initialized with the attributes from this `PositionalParamSpec`.Calling `build` immediately will return a copy of this `PositionalParamSpec`.

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

### getAdditionalDescriptionKeys

<span style="font-family: monospace; font-size: 80%;">protected [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getAdditionalDescriptionKeys__()</span>

Returns the additional lookup keys for finding description lines in the resource bundle for this positional parameter.

**Returns:**

a collection with the following single value: `paramLabel() + "[" + index() + "]"`.

**Overrides:**

[ArgSpec](../cascara.common/util/CommandLine.Model.ArgSpec.md#getadditionaldescriptionkeys)

**Since:**

4.0


---

### index

<span style="font-family: monospace; font-size: 80%;">public [Range](CommandLine.Range.md) __index__()</span>

Returns an index or range specifying which of the command line arguments should be assigned to this positional parameter.

**See Also:**


[index](#index)



---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)</span>




---

