Package [io.github.qishr.cascara.common.util](index.md)

# Class Builder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ArgGroupSpec.Builder<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model.ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Builder__</span>

Builder responsible for creating valid `ArgGroupSpec` objects.


## Method Summary

| Modifier and Type                                                                                                                                            | Method                                                                                                                               | Description                                                                                                                                                                                                                                                                                        |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [updateArgGroupAttributes](#updatearggroupattributes)([ArgGroup](CommandLine.ArgGroup.md) group)                                     | Updates this builder from the specified annotation values.                                                                                                                                                                                                                                         |
| public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)                                                                                                     | [build](#build)()                                                                                                                    | Returns a valid `ArgGroupSpec` instance.                                                                                                                                                                                                                                                           |
| public boolean                                                                                                                                               | [exclusive](#exclusive)()                                                                                                            | Returns whether this is a mutually exclusive group; `true` by default.                                                                                                                                                                                                                             |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [exclusive](#exclusive)(boolean newValue)                                                                                            | Sets whether this is a mutually exclusive group; `true` by default.                                                                                                                                                                                                                                |
| public [Range](CommandLine.Range.md)                                                                                                                         | [multiplicity](#multiplicity)()                                                                                                      | Returns the multiplicity of this group: how many occurrences it may have on the command line; `"0..1"` (optional) by default.                                                                                                                                                                      |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [multiplicity](#multiplicity)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue) | Sets the multiplicity of this group: how many occurrences it may have on the command line; `"0..1"` (optional) by default.                                                                                                                                                                         |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [multiplicity](#multiplicity)([Range](CommandLine.Range.md) newValue)                                                                | Sets the multiplicity of this group: how many occurrences it may have on the command line; `"0..1"` (optional) by default.                                                                                                                                                                         |
| public boolean                                                                                                                                               | [validate](#validate)()                                                                                                              | Returns whether picocli should validate the rules of this group:  for a mutually exclusive group this means that no more than one arguments in the group is specified on the command line;  for a co-occurring group this means that all arguments in the group are specified on the command line. |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [validate](#validate)(boolean newValue)                                                                                              | Sets whether picocli should validate the rules of this group:  for a mutually exclusive group this means that no more than one arguments in the group is specified on the command line;  for a co-occurring group this means that all arguments in the group are specified on the command line.    |
| public int                                                                                                                                                   | [order](#order)()                                                                                                                    | Returns the position in the options list in the usage help message at which this group should be shown.                                                                                                                                                                                            |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [order](#order)(int order)                                                                                                           | Sets the position in the options list in the usage help message at which this group should be shown, and returns this builder.                                                                                                                                                                     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                          | [heading](#heading)()                                                                                                                | Returns the heading of this group, used when generating the usage documentation.                                                                                                                                                                                                                   |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [heading](#heading)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)           | Sets the heading of this group (may be `null`), used when generating the usage documentation.                                                                                                                                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                          | [headingKey](#headingkey)()                                                                                                          | Returns the heading key of this group, used to get the heading from a resource bundle.                                                                                                                                                                                                             |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [headingKey](#headingkey)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)     | Sets the heading key of this group, used to get the heading from a resource bundle.                                                                                                                                                                                                                |
| public [ITypeInfo](CommandLine.Model.ITypeInfo.md)                                                                                                           | [typeInfo](#typeinfo)()                                                                                                              | Returns the type info for the annotated program element associated with this group.                                                                                                                                                                                                                |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [typeInfo](#typeinfo)([ITypeInfo](CommandLine.Model.ITypeInfo.md) newValue)                                                          | Sets the type info for the annotated program element associated with this group, and returns this builder.                                                                                                                                                                                         |
| public [IGetter](CommandLine.Model.IGetter.md)                                                                                                               | [getter](#getter)()                                                                                                                  | Returns the [IGetter](CommandLine.Model.IGetter.md) that is responsible for supplying the value of the annotated program element associated with this group.                                                                                                                                       |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [getter](#getter)([IGetter](CommandLine.Model.IGetter.md) getter)                                                                    | Sets the [IGetter](CommandLine.Model.IGetter.md) that is responsible for getting the value of the annotated program element associated with this group, and returns this builder.                                                                                                                  |
| public [ISetter](CommandLine.Model.ISetter.md)                                                                                                               | [setter](#setter)()                                                                                                                  | Returns the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of the annotated program element associated with this group.                                                                                                                                       |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [setter](#setter)([ISetter](CommandLine.Model.ISetter.md) setter)                                                                    | Sets the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of the annotated program element associated with this group, and returns this builder.                                                                                                                |
| public [IScope](CommandLine.Model.IScope.md)                                                                                                                 | [scope](#scope)()                                                                                                                    | Returns the [IScope](CommandLine.Model.IScope.md) that determines where the setter sets the value (or the getter gets the value) of the annotated program element associated with this group.                                                                                                      |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [scope](#scope)([IScope](CommandLine.Model.IScope.md) scope)                                                                         | Sets the [IScope](CommandLine.Model.IScope.md) that targets where the setter sets the value of the annotated program element associated with this group, and returns this builder.                                                                                                                 |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [addArg](#addarg)([ArgSpec](CommandLine.Model.ArgSpec.md) arg)                                                                       | Adds the specified argument to the list of options and positional parameters that depend on this group.                                                                                                                                                                                            |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)>                     | [args](#args)()                                                                                                                      | Returns the list of options and positional parameters that depend on this group.                                                                                                                                                                                                                   |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [addSubgroup](#addsubgroup)([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)                                                 | Adds the specified group to the list of subgroups that this group is composed of.                                                                                                                                                                                                                  |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)>           | [subgroups](#subgroups)()                                                                                                            | Returns the list of subgroups that this group is composed of.                                                                                                                                                                                                                                      |
| public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md)                                                                                                  | [addSpecElement](#addspecelement)([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) element)                               | Adds the specified `{@literal @}Spec` annotated program element to the list of spec elements for this group.                                                                                                                                                                                       |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)> | [specElements](#specelements)()                                                                                                      | Returns the list of program elements annotated with `{@literal @}Spec` configured for this group.                                                                                                                                                                                                  |



## Method Details

### updateArgGroupAttributes

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __updateArgGroupAttributes__([ArgGroup](CommandLine.ArgGroup.md) group)</span>

Updates this builder from the specified annotation values.

**Parameters:**

`group` - annotation values

**Returns:**

this builder for method chaining


---

### build

<span style="font-family: monospace; font-size: 80%;">public [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) __build__()</span>

Returns a valid `ArgGroupSpec` instance.


---

### exclusive

<span style="font-family: monospace; font-size: 80%;">public boolean __exclusive__()</span>

Returns whether this is a mutually exclusive group; `true` by default.If `false`, this is a co-occurring group. Ignored if [validate.validate](#validate) is `false`.

**See Also:**


[exclusive](#exclusive)



---

### exclusive

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __exclusive__(boolean newValue)</span>

Sets whether this is a mutually exclusive group; `true` by default.If `false`, this is a co-occurring group. Ignored if [validate.validate](#validate) is `false`.

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

### multiplicity

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __multiplicity__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the multiplicity of this group: how many occurrences it may have on the command line; `"0..1"` (optional) by default.A group can be made required by specifying a multiplicity of `"1"`. For a group of mutually exclusive arguments,
 being required means that one of the arguments in the group must appear on the command line, or a MissingParameterException is thrown.
 For a group of co-occurring arguments, being required means that all arguments in the group must appear on the command line.
 Ignored if [validate.validate](#validate) is `false`.

**See Also:**


[multiplicity](#multiplicity)



---

### multiplicity

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __multiplicity__([Range](CommandLine.Range.md) newValue)</span>

Sets the multiplicity of this group: how many occurrences it may have on the command line; `"0..1"` (optional) by default.A group can be made required by specifying a multiplicity of `"1"`. For a group of mutually exclusive arguments,
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

### validate

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __validate__(boolean newValue)</span>

Sets whether picocli should validate the rules of this group:
 for a mutually exclusive group this means that no more than one arguments in the group is specified on the command line;
 for a co-occurring group this means that all arguments in the group are specified on the command line.`true` by default.

**See Also:**


[validate](#validate)



---

### order

<span style="font-family: monospace; font-size: 80%;">public int __order__()</span>

Returns the position in the options list in the usage help message at which this group should be shown.Groups with a lower number are shown before groups with a higher number.
 This attribute is only honored for groups that have a [heading.heading](#heading) (or a [headingKey.headingKey](#headingkey) with a non-`null` resource bundle value).


---

### order

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __order__(int order)</span>

Sets the position in the options list in the usage help message at which this group should be shown, and returns this builder.


---

### heading

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __heading__()</span>

Returns the heading of this group, used when generating the usage documentation.

**See Also:**


[heading](#heading)



---

### heading

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __heading__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the heading of this group (may be `null`), used when generating the usage documentation.

**See Also:**


[heading](#heading)



---

### headingKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __headingKey__()</span>

Returns the heading key of this group, used to get the heading from a resource bundle.

**See Also:**


[headingKey](#headingkey)



---

### headingKey

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __headingKey__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) newValue)</span>

Sets the heading key of this group, used to get the heading from a resource bundle.

**See Also:**


[headingKey](#headingkey)



---

### typeInfo

<span style="font-family: monospace; font-size: 80%;">public [ITypeInfo](CommandLine.Model.ITypeInfo.md) __typeInfo__()</span>

Returns the type info for the annotated program element associated with this group.

**Returns:**

type information that does not require `Class` objects and be constructed both at runtime and compile time


---

### typeInfo

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __typeInfo__([ITypeInfo](CommandLine.Model.ITypeInfo.md) newValue)</span>

Sets the type info for the annotated program element associated with this group, and returns this builder.

**Parameters:**

`newValue` - type information that does not require `Class` objects and be constructed both at runtime and compile time


---

### getter

<span style="font-family: monospace; font-size: 80%;">public [IGetter](CommandLine.Model.IGetter.md) __getter__()</span>

Returns the [IGetter](CommandLine.Model.IGetter.md) that is responsible for supplying the value of the annotated program element associated with this group.


---

### getter

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __getter__([IGetter](CommandLine.Model.IGetter.md) getter)</span>

Sets the [IGetter](CommandLine.Model.IGetter.md) that is responsible for getting the value of the annotated program element associated with this group, and returns this builder.


---

### setter

<span style="font-family: monospace; font-size: 80%;">public [ISetter](CommandLine.Model.ISetter.md) __setter__()</span>

Returns the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of the annotated program element associated with this group.


---

### setter

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __setter__([ISetter](CommandLine.Model.ISetter.md) setter)</span>

Sets the [ISetter](CommandLine.Model.ISetter.md) that is responsible for modifying the value of the annotated program element associated with this group, and returns this builder.


---

### scope

<span style="font-family: monospace; font-size: 80%;">public [IScope](CommandLine.Model.IScope.md) __scope__()</span>

Returns the [IScope](CommandLine.Model.IScope.md) that determines where the setter sets the value (or the getter gets the value) of the annotated program element associated with this group.


---

### scope

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __scope__([IScope](CommandLine.Model.IScope.md) scope)</span>

Sets the [IScope](CommandLine.Model.IScope.md) that targets where the setter sets the value of the annotated program element associated with this group, and returns this builder.


---

### addArg

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __addArg__([ArgSpec](CommandLine.Model.ArgSpec.md) arg)</span>

Adds the specified argument to the list of options and positional parameters that depend on this group.


---

### args

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgSpec](CommandLine.Model.ArgSpec.md)> __args__()</span>

Returns the list of options and positional parameters that depend on this group.


---

### addSubgroup

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __addSubgroup__([ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) group)</span>

Adds the specified group to the list of subgroups that this group is composed of.


---

### subgroups

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)> __subgroups__()</span>

Returns the list of subgroups that this group is composed of.


---

### addSpecElement

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.ArgGroupSpec.Builder.md) __addSpecElement__([IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md) element)</span>

Adds the specified `{@literal @}Spec` annotated program element to the list of spec elements for this group.

**Since:**

4.6


---

### specElements

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[IAnnotatedElement](CommandLine.Model.IAnnotatedElement.md)> __specElements__()</span>

Returns the list of program elements annotated with `{@literal @}Spec` configured for this group.

**Since:**

4.6


---

