Package [io.github.qishr.cascara.common.util](index.md)

# Class Range
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Range<br/>
<br/>
All Implemented Interfaces:<br/>
    [Comparable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Comparable.html)<[Range](CommandLine.Range.md)>

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Range__</span>

Describes the number of parameters required and accepted by an option or a positional parameter.


## Field Summary

| Modifier and Type    | Field                     | Description |
|----------------------|---------------------------|-------------|
| public final boolean | [isVariable](#isvariable) |             |
| public final int     | [max](#max)               |             |
| public final int     | [min](#min)               |             |



## Constructor Summary

| Constructor                                                                                                                                                                | Description                                                  |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| Range(int min, int max, boolean variable, boolean unspecified, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) originalValue) | Constructs a new Range object with the specified parameters. |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                      | Description                                                                                                                                                                                                                                                                                                                                  |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [Range](CommandLine.Range.md)                                                         | [optionArity](#optionarity)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)       | Returns a new `Range` based on the Option#arity() annotation on the specified field,  or the field type's default arity if no arity was specified.                                                                                                                                                                                           |
| public static [Range](CommandLine.Range.md)                                                         | [parameterArity](#parameterarity)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field) | Returns a new `Range` based on the Parameters#arity() annotation on the specified field,  or the field type's default arity if no arity was specified.                                                                                                                                                                                       |
| public static [Range](CommandLine.Range.md)                                                         | [parameterIndex](#parameterindex)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field) | Returns a new `Range` based on the Parameters#index() annotation on the specified field.                                                                                                                                                                                                                                                     |
| public static [Range](CommandLine.Range.md)                                                         | [defaultArity](#defaultarity)([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)     | Returns the default arity `Range`: for interactive options/positional parameters,  this is 0; for [Option](CommandLine.Option.md) this is effectively "0..1" for booleans and 1 for  other types, for [Parameters](CommandLine.Parameters.md) booleans have arity 1, arrays or Collections have  arity "0..*", and other types have arity 1. |
| public static [Range](CommandLine.Range.md)                                                         | [defaultArity](#defaultarity)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type)           | Returns the default arity `Range` for [Option](CommandLine.Option.md): booleans have arity 0, other types have arity 1.                                                                                                                                                                                                                      |
| public static [Range](CommandLine.Range.md)                                                         | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) range)                     | Leniently parses the specified String as a `Range` value and return the result.                                                                                                                                                                                                                                                              |
| public [Range](CommandLine.Range.md)                                                                | [min](#min)(int newMin)                                                                                                                     | Returns a new Range object with the `min` value replaced by the specified value.                                                                                                                                                                                                                                                             |
| public [Range](CommandLine.Range.md)                                                                | [max](#max)(int newMax)                                                                                                                     | Returns a new Range object with the `max` value replaced by the specified value.                                                                                                                                                                                                                                                             |
| public [Range](CommandLine.Range.md)                                                                | [unspecified](#unspecified)(boolean unspecified)                                                                                            | Returns a new Range object with the `isUnspecified` value replaced by the specified value.                                                                                                                                                                                                                                                   |
| public boolean                                                                                      | [isUnspecified](#isunspecified)()                                                                                                           | Returns `true` if this Range is a default value, `false` if the user specified this value.                                                                                                                                                                                                                                                   |
| public boolean                                                                                      | [isUnresolved](#isunresolved)()                                                                                                             | Returns `true` if this range contains a relative index like `"1+"`, or variables that have not been expanded yet,  `false` if this Range does not contain any variables or relative indices.                                                                                                                                                 |
| public boolean                                                                                      | [isRelative](#isrelative)()                                                                                                                 | Returns `true` if this Range contains a relative index like `"1+"`, or  `false` if this Range does not contain any relative indices.                                                                                                                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [originalValue](#originalvalue)()                                                                                                           | Returns the original String value that this range was constructed with.                                                                                                                                                                                                                                                                      |
| public int                                                                                          | [min](#min)()                                                                                                                               | Returns the lower bound of this range (inclusive).                                                                                                                                                                                                                                                                                           |
| public int                                                                                          | [max](#max)()                                                                                                                               | Returns the upper bound of this range (inclusive), or `Integer.MAX_VALUE` if this range has [isVariable.isVariable](#isvariable).                                                                                                                                                                                                            |
| public boolean                                                                                      | [isVariable](#isvariable)()                                                                                                                 | Returns `true` if this range has no fixed upper bound.                                                                                                                                                                                                                                                                                       |
| public boolean                                                                                      | [contains](#contains)(int value)                                                                                                            | Returns `true` if this Range includes the specified value, `false` otherwise.                                                                                                                                                                                                                                                                |
| public boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) object)                      |                                                                                                                                                                                                                                                                                                                                              |
| public int                                                                                          | [hashCode](#hashcode)()                                                                                                                     |                                                                                                                                                                                                                                                                                                                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                                     |                                                                                                                                                                                                                                                                                                                                              |
| public int                                                                                          | [compareTo](#compareto)([Range](CommandLine.Range.md) other)                                                                                |                                                                                                                                                                                                                                                                                                                                              |



## Field Details

### isVariable

<span style="font-family: monospace; font-size: 80%;">public final boolean __isVariable__</span>





!!! note "Deprecation"
    use [isVariable.isVariable](#isvariable) instead


---

### max

<span style="font-family: monospace; font-size: 80%;">public final int __max__</span>





!!! note "Deprecation"
    use [max.max](#max) instead


---

### min

<span style="font-family: monospace; font-size: 80%;">public final int __min__</span>





!!! note "Deprecation"
    use [min.min](#min) instead


---


## Method Details

### optionArity

<span style="font-family: monospace; font-size: 80%;">public static [Range](CommandLine.Range.md) __optionArity__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)</span>

Returns a new `Range` based on the Option#arity() annotation on the specified field,
 or the field type's default arity if no arity was specified.

**Parameters:**

`field` - the field whose Option annotation to inspect

**Returns:**

a new `Range` based on the Option arity annotation on the specified field


---

### parameterArity

<span style="font-family: monospace; font-size: 80%;">public static [Range](CommandLine.Range.md) __parameterArity__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)</span>

Returns a new `Range` based on the Parameters#arity() annotation on the specified field,
 or the field type's default arity if no arity was specified.

**Parameters:**

`field` - the field whose Parameters annotation to inspect

**Returns:**

a new `Range` based on the Parameters arity annotation on the specified field


---

### parameterIndex

<span style="font-family: monospace; font-size: 80%;">public static [Range](CommandLine.Range.md) __parameterIndex__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)</span>

Returns a new `Range` based on the Parameters#index() annotation on the specified field.

**Parameters:**

`field` - the field whose Parameters annotation to inspect

**Returns:**

a new `Range` based on the Parameters index annotation on the specified field


---

### defaultArity

<span style="font-family: monospace; font-size: 80%;">public static [Range](CommandLine.Range.md) __defaultArity__([Field](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Field.html) field)</span>

Returns the default arity `Range`: for interactive options/positional parameters,
 this is 0; for [Option](CommandLine.Option.md) this is effectively "0..1" for booleans and 1 for
 other types, for [Parameters](CommandLine.Parameters.md) booleans have arity 1, arrays or Collections have
 arity "0..*", and other types have arity 1.

Implementation Notes
 

The returned `Range` for boolean options has an effective arity of "0..1".
 This is implemented by returning a `Range` with arity "0",
 and its `unspecified` property set to `true`.
 This implementation may change in the future.

**Parameters:**

`field` - the field whose default arity to return

**Returns:**

a new `Range` indicating the default arity of the specified field

**Since:**

2.0


---

### defaultArity

<span style="font-family: monospace; font-size: 80%;">public static [Range](CommandLine.Range.md) __defaultArity__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<?> type)</span>

Returns the default arity `Range` for [Option](CommandLine.Option.md): booleans have arity 0, other types have arity 1.



!!! note "Deprecation"
    use [defaultArity.defaultArity](#defaultarity) instead

**Parameters:**

`type` - the type whose default arity to return

**Returns:**

a new `Range` indicating the default arity of the specified type


---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [Range](CommandLine.Range.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) range)</span>

Leniently parses the specified String as a `Range` value and return the result.A range string can
 be a fixed integer value or a range of the form `MIN_VALUE + ".." + MAX_VALUE`. If the
 `MIN_VALUE` string is not numeric, the minimum is zero. If the `MAX_VALUE` is not numeric, the
 range is taken to be variable and the maximum is `Integer.MAX_VALUE`.

**Parameters:**

`range` - the value range string to parse

**Returns:**

a new `Range` value


---

### min

<span style="font-family: monospace; font-size: 80%;">public [Range](CommandLine.Range.md) __min__(int newMin)</span>

Returns a new Range object with the `min` value replaced by the specified value.The `max` of the returned Range is guaranteed not to be less than the new `min` value.

**Parameters:**

`newMin` - the `min` value of the returned Range object

**Returns:**

a new Range object with the specified `min` value


---

### max

<span style="font-family: monospace; font-size: 80%;">public [Range](CommandLine.Range.md) __max__(int newMax)</span>

Returns a new Range object with the `max` value replaced by the specified value.The `min` of the returned Range is guaranteed not to be greater than the new `max` value.

**Parameters:**

`newMax` - the `max` value of the returned Range object

**Returns:**

a new Range object with the specified `max` value


---

### unspecified

<span style="font-family: monospace; font-size: 80%;">public [Range](CommandLine.Range.md) __unspecified__(boolean unspecified)</span>

Returns a new Range object with the `isUnspecified` value replaced by the specified value.

**Parameters:**

`unspecified` - the `unspecified` value of the returned Range object

**Returns:**

a new Range object with the specified `unspecified` value


---

### isUnspecified

<span style="font-family: monospace; font-size: 80%;">public boolean __isUnspecified__()</span>

Returns `true` if this Range is a default value, `false` if the user specified this value.

**Since:**

4.0


---

### isUnresolved

<span style="font-family: monospace; font-size: 80%;">public boolean __isUnresolved__()</span>

Returns `true` if this range contains a relative index like `"1+"`, or variables that have not been expanded yet,
 `false` if this Range does not contain any variables or relative indices.

**Since:**

4.0


---

### isRelative

<span style="font-family: monospace; font-size: 80%;">public boolean __isRelative__()</span>

Returns `true` if this Range contains a relative index like `"1+"`, or
 `false` if this Range does not contain any relative indices.

**Since:**

4.3


---

### originalValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __originalValue__()</span>

Returns the original String value that this range was constructed with.

**Since:**

4.3


---

### min

<span style="font-family: monospace; font-size: 80%;">public int __min__()</span>

Returns the lower bound of this range (inclusive).

**Since:**

4.0


---

### max

<span style="font-family: monospace; font-size: 80%;">public int __max__()</span>

Returns the upper bound of this range (inclusive), or `Integer.MAX_VALUE` if this range has [isVariable.isVariable](#isvariable).

**Since:**

4.0


---

### isVariable

<span style="font-family: monospace; font-size: 80%;">public boolean __isVariable__()</span>

Returns `true` if this range has no fixed upper bound.

**Since:**

4.0


---

### contains

<span style="font-family: monospace; font-size: 80%;">public boolean __contains__(int value)</span>

Returns `true` if this Range includes the specified value, `false` otherwise.

**Parameters:**

`value` - the value to check

**Returns:**

`true` if the specified value is not less than the minimum and not greater than the maximum of this Range


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) object)</span>




---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

### compareTo

<span style="font-family: monospace; font-size: 80%;">public int __compareTo__([Range](CommandLine.Range.md) other)</span>




---

