Package [io.github.qishr.cascara.common.util](index.md)

# Class ArgGroupSpec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ArgGroupSpec<br/>
<br/>
All Implemented Interfaces:<br/>
    [IOrdered](CommandLine.Model.IOrdered.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __ArgGroupSpec__</span>

The `ArgGroupSpec` class models a [ArgGroup](CommandLine.ArgGroup.md) of arguments (options, positional parameters or a mixture of the two).


## Nested Class Summary

| Modifier and Type | Class                                                                                                                   | Description                                                    |
|-------------------|-------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Model.ArgGroupSpec.Builder](CommandLine.Model.ArgGroupSpec.Builder.md) | Builder responsible for creating valid `ArgGroupSpec` objects. |



## Method Summary

| Modifier and Type                                                                                                                                                | Method                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                                                                        |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                               | [builder](#builder)()                                                                                                                                                                                                                         | Returns a new [Builder](CommandLine.RegexTransformer.Builder.md).                                                                                                                                                                                                                                  |
| public static [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                               | [builder](#builder)([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) annotatedElement)                                                                                                                                             | Returns a new [Builder](CommandLine.RegexTransformer.Builder.md) associated with the specified annotated element.                                                                                                                                                                                  |
| public boolean                                                                                                                                                   | [exclusive](#exclusive)()                                                                                                                                                                                                                     | Returns whether this is a mutually exclusive group; `true` by default.                                                                                                                                                                                                                             |
| public [Range](CommandLine.Range.md)                                                                                                                             | [multiplicity](#multiplicity)()                                                                                                                                                                                                               | Returns the multiplicity of this group: how many occurrences it may have on the command line; `"0..1"` (optional) by default.                                                                                                                                                                      |
| public boolean                                                                                                                                                   | [validate](#validate)()                                                                                                                                                                                                                       | Returns whether picocli should validate the rules of this group:  for a mutually exclusive group this means that no more than one arguments in the group is specified on the command line;  for a co-occurring group this means that all arguments in the group are specified on the command line. |
| public int                                                                                                                                                       | [order](#order)()                                                                                                                                                                                                                             | Returns the position in the options list in the usage help message at which this group should be shown.                                                                                                                                                                                            |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                              | [heading](#heading)()                                                                                                                                                                                                                         | Returns the heading of this group (may be `null`), used when generating the usage documentation.                                                                                                                                                                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                              | [headingKey](#headingkey)()                                                                                                                                                                                                                   | Returns the heading key of this group (may be `null`), used to get the heading from a resource bundle.                                                                                                                                                                                             |
| public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)                                                                                                         | [parentGroup](#parentgroup)()                                                                                                                                                                                                                 | Returns the parent group that this group is part of, or `null` if this group is not part of a composite.                                                                                                                                                                                           |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)>               | [subgroups](#subgroups)()                                                                                                                                                                                                                     | Return the subgroups that this group is composed of; may be empty but not `null`.                                                                                                                                                                                                                  |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)>     | [specElements](#specelements)()                                                                                                                                                                                                               | Returns the list of program elements annotated with `{@literal @}Spec` configured for this group.                                                                                                                                                                                                  |
| public boolean                                                                                                                                                   | [isSubgroupOf](#issubgroupof)([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)                                                                                                                                                        | Returns `true` if this group is a subgroup (or a nested sub-subgroup, to any level of depth) of the specified group, `false` otherwise.                                                                                                                                                            |
| public [ITypeInfo](CommandLine.Model.ITypeInfo.md)                                                                                                               | [typeInfo](#typeinfo)()                                                                                                                                                                                                                       | Returns the type info for the annotated program element associated with this group.                                                                                                                                                                                                                |
| public [IGetter](CommandLine.Model.IGetter.md)                                                                                                                   | [getter](#getter)()                                                                                                                                                                                                                           | Returns the [IGetter](CommandLine.Model.IGetter.md) that is responsible for supplying the value of the annotated program element associated with this group.                                                                                                                                       |
| public [ISetter](CommandLine.Model.ISetter.md)                                                                                                                   | [setter](#setter)()                                                                                                                                                                                                                           | Returns the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of the annotated program element associated with this group.                                                                                                                                       |
| public [IScope](CommandLine.Model.IScope.md)                                                                                                                     | [scope](#scope)()                                                                                                                                                                                                                             | Returns the [IScope](CommandLine.Model.IScope.md) that determines where the setter sets the value (or the getter gets the value) of the annotated program element associated with this group.                                                                                                      |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)>                           | [args](#args)()                                                                                                                                                                                                                               | Returns the options and positional parameters in this group; may be empty but not `null`.                                                                                                                                                                                                          |
| public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)>                           | [requiredArgs](#requiredargs)()                                                                                                                                                                                                               | Returns the required options and positional parameters in this group; may be empty but not `null`.                                                                                                                                                                                                 |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> | [positionalParameters](#positionalparameters)()                                                                                                                                                                                               | Returns the list of positional parameters configured for this group.                                                                                                                                                                                                                               |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                   | [options](#options)()                                                                                                                                                                                                                         | Returns the list of options configured for this group.                                                                                                                                                                                                                                             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)>                   | [allOptionsNested](#alloptionsnested)()                                                                                                                                                                                                       | Returns all options configured for this group and all subgroups.                                                                                                                                                                                                                                   |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> | [allPositionalParametersNested](#allpositionalparametersnested)()                                                                                                                                                                             | Returns all positional parameters configured for this group and all subgroups.                                                                                                                                                                                                                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                              | [synopsis](#synopsis)()                                                                                                                                                                                                                       | Returns the synopsis of this group.                                                                                                                                                                                                                                                                |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                                                                     | [synopsisText](#synopsistext)([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> outparam_groupArgs) | Returns the synopsis of this group.                                                                                                                                                                                                                                                                |
| public [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md)                                                                                            | [createLabelRenderer](#createlabelrenderer)([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec)                                                                                                                                      |                                                                                                                                                                                                                                                                                                    |
| public [Messages](CommandLine.Model.Messages.md)                                                                                                                 | [messages](#messages)()                                                                                                                                                                                                                       | Returns the Messages for this argument group specification, or `null`.                                                                                                                                                                                                                             |
| public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)                                                                                                         | [messages](#messages)([Messages](CommandLine.Model.Messages.md) msgs)                                                                                                                                                                         | Sets the Messages for this ArgGroupSpec, and returns this ArgGroupSpec.                                                                                                                                                                                                                            |
| public boolean                                                                                                                                                   | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)                                                                                                                           |                                                                                                                                                                                                                                                                                                    |
| public int                                                                                                                                                       | [hashCode](#hashcode)()                                                                                                                                                                                                                       |                                                                                                                                                                                                                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                              | [toString](#tostring)()                                                                                                                                                                                                                       |                                                                                                                                                                                                                                                                                                    |



## Method Details

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __builder__()</span>

Returns a new [Builder](CommandLine.RegexTransformer.Builder.md).

**Returns:**

a new ArgGroupSpec.Builder instance


---

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __builder__([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) annotatedElement)</span>

Returns a new [Builder](CommandLine.RegexTransformer.Builder.md) associated with the specified annotated element.

**Parameters:**

`annotatedElement` - the annotated element containing `@Option` and `@Parameters`

**Returns:**

a new ArgGroupSpec.Builder instance


---

### exclusive

<span style="font-family: monospace; font-size: 80%;">public boolean __exclusive__()</span>

Returns whether this is a mutually exclusive group; `true` by default.If `false`, this is a co-occurring group. Ignored if [validate.validate](#validate) is `false`.

**See Also:**


[exclusive](#exclusive)



---

### multiplicity

<span style="font-family: monospace; font-size: 80%;">public [Range](CommandLine.Range.md) __multiplicity__()</span>

Returns the multiplicity of this group: how many occurrences it may have on the command line; `"0..1"` (optional) by default.A group can be made required by specifying a multiplicity of `"1"`. For a group of mutually exclusive arguments,
 being required means that one of the arguments in the group must appear on the command line, or a MissingParameterException is thrown.
 For a group of co-occurring arguments, being required means that all arguments in the group must appear on the command line.
 Ignored if [validate.validate](#validate) is `false`.

**See Also:**


[multiplicity](#multiplicity)



---

### validate

<span style="font-family: monospace; font-size: 80%;">public boolean __validate__()</span>

Returns whether picocli should validate the rules of this group:
 for a mutually exclusive group this means that no more than one arguments in the group is specified on the command line;
 for a co-occurring group this means that all arguments in the group are specified on the command line.`true` by default.

**See Also:**


[validate](#validate)



---

### order

<span style="font-family: monospace; font-size: 80%;">public int __order__()</span>

Returns the position in the options list in the usage help message at which this group should be shown.Groups with a lower number are shown before groups with a higher number.
 This attribute is only honored for groups that have a [heading.heading](#heading) (or a [headingKey.headingKey](#headingkey) with a non-`null` resource bundle value).

**Specified By:**

[IOrdered](CommandLine.Model.IOrdered.md)


---

### heading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __heading__()</span>

Returns the heading of this group (may be `null`), used when generating the usage documentation.

**See Also:**


[heading](#heading)



---

### headingKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __headingKey__()</span>

Returns the heading key of this group (may be `null`), used to get the heading from a resource bundle.

**See Also:**


[headingKey](#headingkey)



---

### parentGroup

<span style="font-family: monospace; font-size: 80%;">public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) __parentGroup__()</span>

Returns the parent group that this group is part of, or `null` if this group is not part of a composite.


---

### subgroups

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)> __subgroups__()</span>

Return the subgroups that this group is composed of; may be empty but not `null`.

**Returns:**

immutable list of subgroups that this group is composed of.


---

### specElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)> __specElements__()</span>

Returns the list of program elements annotated with `{@literal @}Spec` configured for this group.

**Since:**

4.6


---

### isSubgroupOf

<span style="font-family: monospace; font-size: 80%;">public boolean __isSubgroupOf__([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)</span>

Returns `true` if this group is a subgroup (or a nested sub-subgroup, to any level of depth)
of the specified group, `false` otherwise.

**Parameters:**

`group` - the group to check if it contains this group

**Returns:**

`true` if this group is a subgroup or a nested sub-subgroup of the specified group


---

### typeInfo

<span style="font-family: monospace; font-size: 80%;">public [ITypeInfo](CommandLine.Model.ITypeInfo.md) __typeInfo__()</span>

Returns the type info for the annotated program element associated with this group.

**Returns:**

type information that does not require `Class` objects and be constructed both at runtime and compile time


---

### getter

<span style="font-family: monospace; font-size: 80%;">public [IGetter](CommandLine.Model.IGetter.md) __getter__()</span>

Returns the [IGetter](CommandLine.Model.IGetter.md) that is responsible for supplying the value of the annotated program element associated with this group.


---

### setter

<span style="font-family: monospace; font-size: 80%;">public [ISetter](CommandLine.Model.ISetter.md) __setter__()</span>

Returns the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of the annotated program element associated with this group.


---

### scope

<span style="font-family: monospace; font-size: 80%;">public [IScope](CommandLine.Model.IScope.md) __scope__()</span>

Returns the [IScope](CommandLine.Model.IScope.md) that determines where the setter sets the value (or the getter gets the value) of the annotated program element associated with this group.


---

### args

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> __args__()</span>

Returns the options and positional parameters in this group; may be empty but not `null`.


---

### requiredArgs

<span style="font-family: monospace; font-size: 80%;">public [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> __requiredArgs__()</span>

Returns the required options and positional parameters in this group; may be empty but not `null`.


---

### positionalParameters

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> __positionalParameters__()</span>

Returns the list of positional parameters configured for this group.

**Returns:**

an immutable list of positional parameters in this group.


---

### options

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __options__()</span>

Returns the list of options configured for this group.

**Returns:**

an immutable list of options in this group.


---

### allOptionsNested

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[OptionSpec](CommandLine.Model.OptionSpec.md)> __allOptionsNested__()</span>

Returns all options configured for this group and all subgroups.

**Returns:**

an immutable list of all options in this group and its subgroups.

**Since:**

4.4


---

### allPositionalParametersNested

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md)> __allPositionalParametersNested__()</span>

Returns all positional parameters configured for this group and all subgroups.

**Returns:**

an immutable list of all positional parameters in this group and its subgroups.

**Since:**

4.4


---

### synopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __synopsis__()</span>

Returns the synopsis of this group.


---

### synopsisText

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __synopsisText__([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [Set](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Set.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> outparam_groupArgs)</span>

Returns the synopsis of this group.

**Parameters:**

`colorScheme` - the color scheme to use for options and positional parameters in this group and subgroups

`outparam_groupArgs` - all options and positional parameters in the groups this method generates a synopsis for;
                          these options and positional parameters should be excluded from appearing elsewhere in the synopsis

**Returns:**

the synopsis Text


---

### createLabelRenderer

<span style="font-family: monospace; font-size: 80%;">public [IParamLabelRenderer](CommandLine.Help.IParamLabelRenderer.md) __createLabelRenderer__([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec)</span>




---

### messages

<span style="font-family: monospace; font-size: 80%;">public [Messages](CommandLine.Model.Messages.md) __messages__()</span>

Returns the Messages for this argument group specification, or `null`.


---

### messages

<span style="font-family: monospace; font-size: 80%;">public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) __messages__([Messages](CommandLine.Model.Messages.md) msgs)</span>

Sets the Messages for this ArgGroupSpec, and returns this ArgGroupSpec.

**Parameters:**

`msgs` - the new Messages value, may be `null`

**See Also:**


[resourceBundle](null.md)


[headingKey](#headingkey)



---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

