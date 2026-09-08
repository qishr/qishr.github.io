Package [io.github.qishr.cascara.common.util](index.md)

# Class UnmatchedArgumentException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)<br/>
                [java.lang.Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)<br/>
                        [java.lang.RuntimeException](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/RuntimeException.html)<br/>
                                [io.github.qishr.cascara.common.util.CommandLine.PicocliException](CommandLine.PicocliException.md)<br/>
                                        [io.github.qishr.cascara.common.util.CommandLine.ParameterException](CommandLine.ParameterException.md)<br/>
                                                io.github.qishr.cascara.common.util.CommandLine.UnmatchedArgumentException<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __UnmatchedArgumentException__<br/>extends [ParameterException](CommandLine.ParameterException.md)
</span>

Exception indicating that a command line argument could not be mapped to any of the fields annotated with
 [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md).


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                                               | Description |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| UnmatchedArgumentException([CommandLine](CommandLine.md) commandLine, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg)                                                                                                                                                                                                   |             |
| UnmatchedArgumentException([CommandLine](CommandLine.md) commandLine, [Stack](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Stack.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> args)                                                                                                      |             |
| UnmatchedArgumentException([CommandLine](CommandLine.md) commandLine, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> args)                                                                                                        |             |
| UnmatchedArgumentException([CommandLine](CommandLine.md) commandLine, [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> args, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) extraMsg) |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                                                                                                         | Description                                                                                                               |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| public static boolean                                                                                                                                                                         | [printSuggestions](#printsuggestions)([ParameterException](CommandLine.ParameterException.md) ex, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)    | Returns `true` and prints suggested solutions to the specified stream if such solutions exist, otherwise returns `false`. |
| public static boolean                                                                                                                                                                         | [printSuggestions](#printsuggestions)([ParameterException](CommandLine.ParameterException.md) ex, [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer) | Returns `true` and prints suggested solutions to the specified writer if such solutions exist, otherwise returns `false`. |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getUnmatched](#getunmatched)()                                                                                                                                                                                | Returns the unmatched command line arguments.                                                                             |
| public boolean                                                                                                                                                                                | [isUnknownOption](#isunknownoption)()                                                                                                                                                                          | Returns `true` if the first unmatched command line arguments resembles an option, `false` otherwise.                      |
| public boolean                                                                                                                                                                                | [printSuggestions](#printsuggestions)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)                                                                | Returns `true` and prints suggested solutions to the specified stream if such solutions exist, otherwise returns `false`. |
| public boolean                                                                                                                                                                                | [printSuggestions](#printsuggestions)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer)                                                             | Returns `true` and prints suggested solutions to the specified stream if such solutions exist, otherwise returns `false`. |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getSuggestions](#getsuggestions)()                                                                                                                                                                            | Returns suggested solutions if such solutions exist, otherwise returns an empty list.                                     |


### Methods inherited from [ParameterException](CommandLine.ParameterException.md)

getArgSpec, getValue, getCommandLine


## Method Details

### printSuggestions

<span style="font-family: monospace; font-size: 80%;">public static boolean __printSuggestions__([ParameterException](CommandLine.ParameterException.md) ex, [PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)</span>

Returns `true` and prints suggested solutions to the specified stream if such solutions exist, otherwise returns `false`.

**Since:**

3.3.0


---

### printSuggestions

<span style="font-family: monospace; font-size: 80%;">public static boolean __printSuggestions__([ParameterException](CommandLine.ParameterException.md) ex, [PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer)</span>

Returns `true` and prints suggested solutions to the specified writer if such solutions exist, otherwise returns `false`.

**Since:**

4.0


---

### getUnmatched

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getUnmatched__()</span>

Returns the unmatched command line arguments.

**Since:**

3.3.0


---

### isUnknownOption

<span style="font-family: monospace; font-size: 80%;">public boolean __isUnknownOption__()</span>

Returns `true` if the first unmatched command line arguments resembles an option, `false` otherwise.

**Since:**

3.3.0


---

### printSuggestions

<span style="font-family: monospace; font-size: 80%;">public boolean __printSuggestions__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) out)</span>

Returns `true` and prints suggested solutions to the specified stream if such solutions exist, otherwise returns `false`.

**Since:**

3.3.0


---

### printSuggestions

<span style="font-family: monospace; font-size: 80%;">public boolean __printSuggestions__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer)</span>

Returns `true` and prints suggested solutions to the specified stream if such solutions exist, otherwise returns `false`.

**Since:**

4.0


---

### getSuggestions

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getSuggestions__()</span>

Returns suggested solutions if such solutions exist, otherwise returns an empty list.

**Since:**

3.3.0


---

