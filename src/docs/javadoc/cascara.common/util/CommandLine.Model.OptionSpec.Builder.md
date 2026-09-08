Package [io.github.qishr.cascara.common.util](index.md)

# Class Builder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ArgSpec.Builder<[io.github.qishr.cascara.common.util.CommandLine.Model.OptionSpec.Builder](CommandLine.Model.OptionSpec.Builder.md)><br/>
                io.github.qishr.cascara.common.util.CommandLine.Model.OptionSpec.Builder<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model.OptionSpec](CommandLine.Model.OptionSpec.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Builder__<br/>extends Builder<[Builder](CommandLine.Model.OptionSpec.Builder.md)>
</span>

Builder responsible for creating valid `OptionSpec` objects.


## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                                      | Description                                                                                                                                                                                              |
|-------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [OptionSpec](CommandLine.Model.OptionSpec.md)                                                  | [build](#build)()                                                                                                                           | Returns a valid `OptionSpec` instance.                                                                                                                                                                   |
| protected [Builder](CommandLine.Model.OptionSpec.Builder.md)                                          | [self](#self)()                                                                                                                             | Returns this builder.                                                                                                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] | [names](#names)()                                                                                                                           | Returns one or more option names.                                                                                                                                                                        |
| public boolean                                                                                        | [help](#help)()                                                                                                                             | Returns whether this option disables validation of the other arguments.                                                                                                                                  |
| public boolean                                                                                        | [usageHelp](#usagehelp)()                                                                                                                   | Returns whether this option allows the user to request usage help.                                                                                                                                       |
| public boolean                                                                                        | [versionHelp](#versionhelp)()                                                                                                               | Returns whether this option allows the user to request version information.                                                                                                                              |
| public boolean                                                                                        | [negatable](#negatable)()                                                                                                                   | Returns whether a negative version for this boolean option is automatically added.                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [fallbackValue](#fallbackvalue)()                                                                                                           | Returns the fallback value for this option: the value that is assigned for options with an optional  parameter if the option was specified on the command line without parameter.                        |
| public int                                                                                            | [order](#order)()                                                                                                                           | Returns the position in the options list in the usage help message at which this option should be shown.                                                                                                 |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                             | [names](#names)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] names)                       | Replaces the option names with the specified values.                                                                                                                                                     |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                             | [help](#help)(boolean help)                                                                                                                 | Sets whether this option disables validation of the other arguments, and returns this builder.                                                                                                           |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                             | [usageHelp](#usagehelp)(boolean usageHelp)                                                                                                  | Sets whether this option allows the user to request usage help, and returns this builder.                                                                                                                |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                             | [versionHelp](#versionhelp)(boolean versionHelp)                                                                                            | Sets whether this option allows the user to request version information, and returns this builder.                                                                                                       |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                             | [negatable](#negatable)(boolean negatable)                                                                                                  | Sets whether a negative version for this boolean option is automatically added, and returns this builder.                                                                                                |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                             | [fallbackValue](#fallbackvalue)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fallbackValue) | Sets the fallback value for this option: the value that is assigned for options with an optional  parameter if the option was specified on the command line without parameter, and returns this builder. |
| public [Builder](CommandLine.Model.OptionSpec.Builder.md)                                             | [order](#order)(int order)                                                                                                                  | Sets the position in the options list in the usage help message at which this option should be shown, and returns this builder.                                                                          |



## Method Details

### build

<span style="font-family: monospace; font-size: 80%;">public [OptionSpec](CommandLine.Model.OptionSpec.md) __build__()</span>

Returns a valid `OptionSpec` instance.


---

### self

<span style="font-family: monospace; font-size: 80%;">protected [Builder](CommandLine.Model.OptionSpec.Builder.md) __self__()</span>

Returns this builder.


---

### names

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __names__()</span>

Returns one or more option names.At least one option name is required.

**See Also:**


[names](#names)



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

Returns the fallback value for this option: the value that is assigned for options with an optional
 parameter if the option was specified on the command line without parameter.

**Since:**

4.0

**See Also:**


[fallbackValue](#fallbackvalue)



---

### order

<span style="font-family: monospace; font-size: 80%;">public int __order__()</span>

Returns the position in the options list in the usage help message at which this option should be shown.Options with a lower number are shown before options with a higher number.
 This attribute is only honored if UsageMessageSpec#sortOptions() is `false` for this command.

**Since:**

3.9

**See Also:**


[order](#order)



---

### names

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __names__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] names)</span>

Replaces the option names with the specified values.At least one option name is required, and returns this builder.

**Returns:**

this builder instance to provide a fluent interface


---

### help

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __help__(boolean help)</span>

Sets whether this option disables validation of the other arguments, and returns this builder.


---

### usageHelp

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __usageHelp__(boolean usageHelp)</span>

Sets whether this option allows the user to request usage help, and returns this builder.


---

### versionHelp

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __versionHelp__(boolean versionHelp)</span>

Sets whether this option allows the user to request version information, and returns this builder.


---

### negatable

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __negatable__(boolean negatable)</span>

Sets whether a negative version for this boolean option is automatically added, and returns this builder.

**Since:**

4.0


---

### fallbackValue

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __fallbackValue__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) fallbackValue)</span>

Sets the fallback value for this option: the value that is assigned for options with an optional
 parameter if the option was specified on the command line without parameter, and returns this builder.

**Since:**

4.0

**See Also:**


[fallbackValue](#fallbackvalue)



---

### order

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.Model.OptionSpec.Builder.md) __order__(int order)</span>

Sets the position in the options list in the usage help message at which this option should be shown, and returns this builder.

**Since:**

3.9


---

