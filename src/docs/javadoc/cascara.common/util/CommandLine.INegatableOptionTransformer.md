Package [io.github.qishr.cascara.common.util](index.md)

# Interface INegatableOptionTransformer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.INegatableOptionTransformer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [RegexTransformer](CommandLine.RegexTransformer.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __INegatableOptionTransformer__</span>

Determines the option name transformation of negatable boolean options.Making an option negatable has two aspects:
 
   the negative form recognized by the parser while parsing the command line
   the documentation string showing both the positive and the negative form in the usage help message
 


 Additionally, this transformer controls which names of a negatable option are actually negatable:
 for example, by default short options like `-v` do not have a negative form, even if the same option's
 long form, `--verbose`, may have a negative form, `--no-verbose`.
 


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                      | Description                                                                                                             |
|--------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [makeNegative](#makenegative)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd) | Returns the negative form of the specified option name for the parser to recognize when parsing command line arguments. |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [makeSynopsis](#makesynopsis)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd) | Returns the documentation string to show in the synopsis and usage help message for the specified option.               |



## Method Details

### makeNegative

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __makeNegative__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd)</span>

Returns the negative form of the specified option name for the parser to recognize when parsing command line arguments.

**Parameters:**

`optionName` - the option name to create a negative form for, for example `--force`

`cmd` - the command that the option is part of

**Returns:**

the negative form of the specified option name, for example `--no-force`


---

### makeSynopsis

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __makeSynopsis__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd)</span>

Returns the documentation string to show in the synopsis and usage help message for the specified option.The returned value should be concise and clearly suggest that both the positive and the negative form are valid option names

**Parameters:**

`optionName` - the option name to create a documentation string for, for example `--force`, or `-XX:+<option>`

`cmd` - the command that the option is part of

**Returns:**

the documentation string for the negatable option, for example `--[no-]force`, or `-XX:(+|-)<option>`


---

