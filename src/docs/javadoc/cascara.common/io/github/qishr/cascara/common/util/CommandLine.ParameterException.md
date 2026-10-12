Package [io.github.qishr.cascara.common.util](index.md)

# Class ParameterException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.util.CommandLine.PicocliException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.PicocliException.md)<br/>
                                        io.github.qishr.cascara.common.util.CommandLine.ParameterException<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)

Direct Known Subtypes:<br/>
    [MissingParameterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.MissingParameterException.md), [MutuallyExclusiveArgsException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.MutuallyExclusiveArgsException.md), [UnmatchedArgumentException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.UnmatchedArgumentException.md), [MaxValuesExceededException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.MaxValuesExceededException.md), [OverwrittenOptionException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.OverwrittenOptionException.md), [MissingTypeConverterException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.MissingTypeConverterException.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __ParameterException__<br/>extends [PicocliException](../../../../../../io/github/qishr/cascara/common/util/CommandLine.PicocliException.md)
</span>

Exception indicating something went wrong while parsing command line options.


## Field Summary

| Modifier and Type           | Field                       | Description |
|-----------------------------|-----------------------------|-------------|
| protected final CommandLine | [commandLine](#commandline) |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Description                                                                           |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|
| ParameterException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)                                                                                                                                                                                                                                                                                                                  | Constructs a new ParameterException with the specified CommandLine and error message. |
| ParameterException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)                                                                                                                                                                                                            | Constructs a new ParameterException with the specified CommandLine and error message. |
| ParameterException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t, [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) argSpec, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) | Constructs a new ParameterException with the specified CommandLine and error message. |
| ParameterException([CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) argSpec, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                                                                                                       | Constructs a new ParameterException with the specified CommandLine and error message. |



## Method Summary

| Modifier and Type                                                                                    | Method                              | Description                                                                            |
|------------------------------------------------------------------------------------------------------|-------------------------------------|----------------------------------------------------------------------------------------|
| public [CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md)           | [getCommandLine](#getcommandline)() | Returns the `CommandLine` object for the (sub)command whose input could not be parsed. |
| public [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) | [getArgSpec](#getargspec)()         | Returns the `ArgSpec` object for the (sub)command whose input could not be parsed.     |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)  | [getValue](#getvalue)()             | Returns the `String` value for the (sub)command whose input could not be parsed.       |



## Field Details

### commandLine

<span style="font-family: monospace; font-size: 80%;">protected final CommandLine __commandLine__</span>




---


## Method Details

### getCommandLine

<span style="font-family: monospace; font-size: 80%;">public [CommandLine](../../../../../../io/github/qishr/cascara/common/util/CommandLine.md) __getCommandLine__()</span>

Returns the `CommandLine` object for the (sub)command whose input could not be parsed.

**Returns:**

the `CommandLine` object for the (sub)command where parsing failed.

**Since:**

2.0


---

### getArgSpec

<span style="font-family: monospace; font-size: 80%;">public [ArgSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ArgSpec.md) __getArgSpec__()</span>

Returns the `ArgSpec` object for the (sub)command whose input could not be parsed.

**Returns:**

the `ArgSpec` object for the (sub)command where parsing failed.

**Since:**

3.2


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getValue__()</span>

Returns the `String` value for the (sub)command whose input could not be parsed.

**Returns:**

the `String` value for the (sub)command where parsing failed.

**Since:**

3.2


---

