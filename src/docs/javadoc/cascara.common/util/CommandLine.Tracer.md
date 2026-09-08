Package [io.github.qishr.cascara.common.util](index.md)

# Class Tracer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Tracer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final class __Tracer__</span>

Utility class for printing internal debug statements.


## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                   | Description                                                                                                 |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| public [TraceLevel](CommandLine.TraceLevel.md)                                                      | [getLevel](#getlevel)()                                                                                                                                                                                                  | Returns the trace level that needs to be matched or exceeded for internal tracing statements to be printed. |
| public void                                                                                         | [setLevel](#setlevel)([TraceLevel](CommandLine.TraceLevel.md) level)                                                                                                                                                     | Sets the trace level that needs to be matched or exceeded for internal tracing statements to be printed.    |
| public boolean                                                                                      | [isDebug](#isdebug)()                                                                                                                                                                                                    | Returns whether the current trace level is DEBUG (the highest).                                             |
| public boolean                                                                                      | [isInfo](#isinfo)()                                                                                                                                                                                                      | Returns whether the current trace level is INFO or higher.                                                  |
| public boolean                                                                                      | [isWarn](#iswarn)()                                                                                                                                                                                                      | Returns whether the current trace level is WARN or higher.                                                  |
| public boolean                                                                                      | [isOff](#isoff)()                                                                                                                                                                                                        | Returns whether the current trace level is OFF (the lowest).                                                |
| public void                                                                                         | [warn](#warn)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)   | Prints the specified message if the current trace level is WARN or higher.                                  |
| public void                                                                                         | [info](#info)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)   | Prints the specified message if the current trace level is INFO or higher.                                  |
| public void                                                                                         | [debug](#debug)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params) | Prints the specified message if the current trace level is DEBUG or higher.                                 |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                                                                                                                  |                                                                                                             |



## Method Details

### getLevel

<span style="font-family: monospace; font-size: 80%;">public [TraceLevel](CommandLine.TraceLevel.md) __getLevel__()</span>

Returns the trace level that needs to be matched or exceeded for internal tracing statements to be printed.The initial trace level is WARN, unless system property `"picocli.trace"` is set to another valid `TraceLevel` value.

**Returns:**

the trace level that needs to be matched or exceeded for tracing statements to be printed


---

### setLevel

<span style="font-family: monospace; font-size: 80%;">public void __setLevel__([TraceLevel](CommandLine.TraceLevel.md) level)</span>

Sets the trace level that needs to be matched or exceeded for internal tracing statements to be printed.The initial trace level is WARN, unless system property `"picocli.trace"` is set to another valid `TraceLevel` value.

**Parameters:**

`level` - the trace level that needs to be matched or exceeded for tracing statements to be printed


---

### isDebug

<span style="font-family: monospace; font-size: 80%;">public boolean __isDebug__()</span>

Returns whether the current trace level is DEBUG (the highest).


---

### isInfo

<span style="font-family: monospace; font-size: 80%;">public boolean __isInfo__()</span>

Returns whether the current trace level is INFO or higher.


---

### isWarn

<span style="font-family: monospace; font-size: 80%;">public boolean __isWarn__()</span>

Returns whether the current trace level is WARN or higher.


---

### isOff

<span style="font-family: monospace; font-size: 80%;">public boolean __isOff__()</span>

Returns whether the current trace level is OFF (the lowest).


---

### warn

<span style="font-family: monospace; font-size: 80%;">public void __warn__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Prints the specified message if the current trace level is WARN or higher.

**Parameters:**

`msg` - the message to print; may use String#format(String, Object...) syntax

`params` - Arguments referenced by the format specifiers in the format string. If there are more arguments than format specifiers, the extra arguments are ignored. The number of arguments is variable and may be zero.

**See Also:**


[Formatter](null.md)



---

### info

<span style="font-family: monospace; font-size: 80%;">public void __info__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Prints the specified message if the current trace level is INFO or higher.

**Parameters:**

`msg` - the message to print; may use String#format(String, Object...) syntax

`params` - Arguments referenced by the format specifiers in the format string. If there are more arguments than format specifiers, the extra arguments are ignored. The number of arguments is variable and may be zero.

**See Also:**


[Formatter](null.md)



---

### debug

<span style="font-family: monospace; font-size: 80%;">public void __debug__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) msg, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] params)</span>

Prints the specified message if the current trace level is DEBUG or higher.

**Parameters:**

`msg` - the message to print; may use String#format(String, Object...) syntax

`params` - Arguments referenced by the format specifiers in the format string. If there are more arguments than format specifiers, the extra arguments are ignored. The number of arguments is variable and may be zero.

**See Also:**


[Formatter](null.md)



---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

