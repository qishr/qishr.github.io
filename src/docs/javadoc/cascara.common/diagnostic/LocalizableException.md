Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Interface LocalizableException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.LocalizableException<br/>
<br/>
All Known Implementing Classes:<br/>
    [LocalizableIOException](LocalizableIOException.md), [LocalizableRuntimeException](LocalizableRuntimeException.md), [AbstractLocalizableException](AbstractLocalizableException.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __LocalizableException__</span>


## Method Summary

| Modifier and Type                                                                                                                    | Method                                                                                                                                      | Description                                                              |
|--------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| public abstract [DiagnosticCode](code/DiagnosticCode.md)                                                                             | [getCode](#getcode)()                                                                                                                       | Returns a diagnostic error code for the error message.                   |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                       | [getDetails](#getdetails)()                                                                                                                 | Returns the details, if any, to be used in formatting the error message. |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                         | [getLocalizedMessage](#getlocalizedmessage)()                                                                                               | Returns a localized, formatted error message.                            |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                         | [getMessage](#getmessage)()                                                                                                                 | Returns a localized, formatted error message.                            |
| public abstract [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)                   | [getCause](#getcause)()                                                                                                                     |                                                                          |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                         | [toString](#tostring)()                                                                                                                     |                                                                          |
| public abstract void                                                                                                                 | [printStackTrace](#printstacktrace)()                                                                                                       |                                                                          |
| public abstract void                                                                                                                 | [printStackTrace](#printstacktrace)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) s) |                                                                          |
| public abstract void                                                                                                                 | [printStackTrace](#printstacktrace)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) s) |                                                                          |
| public abstract [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] | [getStackTrace](#getstacktrace)()                                                                                                           |                                                                          |



## Method Details

### getCode

<span style="font-family: monospace; font-size: 80%;">public abstract [DiagnosticCode](code/DiagnosticCode.md) __getCode__()</span>

Returns a diagnostic error code for the error message.


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>

Returns the details, if any, to be used in formatting the error message.


---

### getLocalizedMessage

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getLocalizedMessage__()</span>

Returns a localized, formatted error message.


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>

Returns a localized, formatted error message.


---

### getCause

<span style="font-family: monospace; font-size: 80%;">public abstract [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) __getCause__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

### printStackTrace

<span style="font-family: monospace; font-size: 80%;">public abstract void __printStackTrace__()</span>




---

### printStackTrace

<span style="font-family: monospace; font-size: 80%;">public abstract void __printStackTrace__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) s)</span>




---

### printStackTrace

<span style="font-family: monospace; font-size: 80%;">public abstract void __printStackTrace__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) s)</span>




---

### getStackTrace

<span style="font-family: monospace; font-size: 80%;">public abstract [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] __getStackTrace__()</span>




---

