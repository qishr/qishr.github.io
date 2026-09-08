Package [io.github.qishr.cascara.common.util](index.md)

# Class Builder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ParseResult.Builder<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.ParseResult](CommandLine.ParseResult.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Builder__</span>

Builds immutable `ParseResult` instances.


## Method Summary

| Modifier and Type                                    | Method                                                                                                                                                                                                                                         | Description                                                                                                                                  |
|------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| public [ParseResult](CommandLine.ParseResult.md)     | [build](#build)()                                                                                                                                                                                                                              | Creates and returns a new `ParseResult` instance for this builder's configuration.                                                           |
| public [Builder](CommandLine.ParseResult.Builder.md) | [add](#add)([ArgSpec](CommandLine.Model.ArgSpec.md) arg, int position)                                                                                                                                                                         | Adds the specified `OptionSpec` or `PositionalParamSpec` to the list of options and parameters  that were matched on the command line.       |
| public [Builder](CommandLine.ParseResult.Builder.md) | [addOption](#addoption)([OptionSpec](CommandLine.Model.OptionSpec.md) option)                                                                                                                                                                  | Adds the specified `OptionSpec` to the list of options that were matched on the command line.                                                |
| public [Builder](CommandLine.ParseResult.Builder.md) | [addPositionalParam](#addpositionalparam)([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) positionalParam, int position)                                                                                                       | Adds the specified `PositionalParamSpec` to the list of parameters that were matched on the command line.                                    |
| public [Builder](CommandLine.ParseResult.Builder.md) | [addUnmatched](#addunmatched)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) arg)                                                                                                                | Adds the specified command line argument to the list of unmatched command line arguments.                                                    |
| public [Builder](CommandLine.ParseResult.Builder.md) | [addUnmatched](#addunmatched)([Stack](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Stack.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> args)                   | Adds all elements of the specified command line arguments stack to the list of unmatched command line arguments.                             |
| public [Builder](CommandLine.ParseResult.Builder.md) | [subcommand](#subcommand)([ParseResult](CommandLine.ParseResult.md) subcommand)                                                                                                                                                                | Sets the specified `ParseResult` for a subcommand that was matched on the command line.                                                      |
| public [Builder](CommandLine.ParseResult.Builder.md) | [originalArgs](#originalargs)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] originalArgs)                                                                                                     | Sets the specified original command line arguments that were passed to the CommandLine#parseArgs(String...) method, before @-file expansion. |
| public [Builder](CommandLine.ParseResult.Builder.md) | [expandedArgs](#expandedargs)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> expandedArgs) | Sets the specified command line arguments after @-files were expanded;  these are the arguments that were actually parsed.                   |
| public void                                          | [addError](#adderror)([PicocliException](CommandLine.PicocliException.md) ex)                                                                                                                                                                  |                                                                                                                                              |



## Method Details

### build

<span style="font-family: monospace; font-size: 80%;">public [ParseResult](CommandLine.ParseResult.md) __build__()</span>

Creates and returns a new `ParseResult` instance for this builder's configuration.


---

### add

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __add__([ArgSpec](CommandLine.Model.ArgSpec.md) arg, int position)</span>

Adds the specified `OptionSpec` or `PositionalParamSpec` to the list of options and parameters
 that were matched on the command line.

**Parameters:**

`arg` - the matched `OptionSpec` or `PositionalParamSpec`

`position` - the command line position at which the  `PositionalParamSpec` was matched. Ignored for `OptionSpec`s.

**Returns:**

this builder for method chaining


---

### addOption

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __addOption__([OptionSpec](CommandLine.Model.OptionSpec.md) option)</span>

Adds the specified `OptionSpec` to the list of options that were matched on the command line.


---

### addPositionalParam

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __addPositionalParam__([PositionalParamSpec](CommandLine.Model.PositionalParamSpec.md) positionalParam, int position)</span>

Adds the specified `PositionalParamSpec` to the list of parameters that were matched on the command line.

**Parameters:**

`positionalParam` - the matched `PositionalParamSpec`

`position` - the command line position at which the  `PositionalParamSpec` was matched.

**Returns:**

this builder for method chaining


---

### addUnmatched

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __addUnmatched__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) arg)</span>

Adds the specified command line argument to the list of unmatched command line arguments.


---

### addUnmatched

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __addUnmatched__([Stack](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Stack.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> args)</span>

Adds all elements of the specified command line arguments stack to the list of unmatched command line arguments.


---

### subcommand

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __subcommand__([ParseResult](CommandLine.ParseResult.md) subcommand)</span>

Sets the specified `ParseResult` for a subcommand that was matched on the command line.


---

### originalArgs

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __originalArgs__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] originalArgs)</span>

Sets the specified original command line arguments that were passed to the CommandLine#parseArgs(String...) method, before @-file expansion.

**See Also:**


[expandedArgs](#expandedargs)


[originalArgs](#originalargs)



---

### expandedArgs

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.ParseResult.Builder.md) __expandedArgs__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> expandedArgs)</span>

Sets the specified command line arguments after @-files were expanded;
 these are the arguments that were actually parsed.

**Since:**

4.4

**See Also:**


[originalArgs](#originalargs)


[expandedArgs](#expandedargs)



---

### addError

<span style="font-family: monospace; font-size: 80%;">public void __addError__([PicocliException](CommandLine.PicocliException.md) ex)</span>




---

