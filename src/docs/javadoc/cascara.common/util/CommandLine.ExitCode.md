Package [io.github.qishr.cascara.common.util](index.md)

# Class ExitCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ExitCode<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final class __ExitCode__</span>

Defines some exit codes used by picocli as default return values from the #execute(String...)
and #executeHelpRequest(ParseResult) methods.

Commands can override these defaults with annotations (e.g. `@Command(exitCodeOnInvalidInput = 64, exitCodeOnExecutionException = 70)`
or programmatically (e.g. CommandSpec#exitCodeOnInvalidInput(int)).


Additionally, there are several mechanisms for commands to return custom exit codes.
See the javadoc of the #execute(String...) method for details.
Standard Exit Codes


There are a few conventions, but there is no
standard. The specific set of codes returned is unique to the program that sets it.
Typically an exit code of zero indicates success, any non-zero exit code indicates failure. For reference, here are a few conventions:

  Wikipedia page on Exit Status
  Bash exit codes
  FreeBSD exit codes
  Windows exit codes

Valid Ranges


Note that *nix shells may restrict exit codes to the 0-255 range, DOS seems to allow larger numbers.
See this StackOverflow question.


## Field Summary

| Modifier and Type       | Field                 | Description                                                                                                                                                                                                                |
|-------------------------|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static final int | [OK](#ok)             | Return value from the #execute(String...) and  #executeHelpRequest(ParseResult) methods signifying successful termination.                                                                                                 |
| public static final int | [SOFTWARE](#software) | Return value from the #execute(String...) method signifying internal software error: an exception occurred when invoking the Runnable, Callable or Method user object of a command.                                        |
| public static final int | [USAGE](#usage)       | Return value from the #execute(String...) method signifying command line usage error: user input for the command was incorrect, e.g., the wrong number of arguments, a bad flag, a bad syntax in a parameter, or whatever. |



## Field Details

### OK

<span style="font-family: monospace; font-size: 80%;">public static final int __OK__</span>

Return value from the #execute(String...) and
 #executeHelpRequest(ParseResult) methods signifying successful termination.

The value of this constant is .


---

### SOFTWARE

<span style="font-family: monospace; font-size: 80%;">public static final int __SOFTWARE__</span>

Return value from the #execute(String...) method signifying internal software error: an exception occurred when invoking the Runnable, Callable or Method user object of a command.

The value of this constant is .


---

### USAGE

<span style="font-family: monospace; font-size: 80%;">public static final int __USAGE__</span>

Return value from the #execute(String...) method signifying command line usage error: user input for the command was incorrect, e.g., the wrong number of arguments, a bad flag, a bad syntax in a parameter, or whatever.

The value of this constant is .


---

