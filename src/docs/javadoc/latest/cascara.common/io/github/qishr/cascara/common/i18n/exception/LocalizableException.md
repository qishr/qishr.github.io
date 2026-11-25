Package [io.github.qishr.cascara.common.i18n.exception](index.md)

# Interface LocalizableException
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.i18n.exception.LocalizableException<br/>
<br/>
All Known Implementing Classes:<br/>
    [LocalizableIllegalStateException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableIllegalStateException.md), [LocalizableIOException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableIOException.md), [LocalizableSecurityException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableSecurityException.md), [LocalizableClassCastException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableClassCastException.md), [LocalizableRuntimeException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableRuntimeException.md), [LocalizableClassNotFoundException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableClassNotFoundException.md), [LocalizableUnsupportedOperationException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableUnsupportedOperationException.md), [LocalizableInstantiationException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableInstantiationException.md), [LocalizableIllegalArgumentException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/LocalizableIllegalArgumentException.md), [AbstractLocalizableException](../../../../../../../io/github/qishr/cascara/common/i18n/exception/AbstractLocalizableException.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __LocalizableException__</span>


## Method Summary

| Modifier and Type                                                                                                                    | Method                                                                                                                                           | Description                                                                                               |
|--------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| public abstract [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md)                 | [getLocalizableMessage](#getlocalizablemessage)()                                                                                                | Returns a localizable message for the error.                                                              |
| public abstract [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                       | [getDetails](#getdetails)()                                                                                                                      | Returns the details, if any, to be used in formatting the error message.                                  |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                         | [getLocalizedMessage](#getlocalizedmessage)()                                                                                                    | Returns a localized, formatted error message.                                                             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                         | [getMessage](#getmessage)()                                                                                                                      | Returns a formatted error message, only localized if `cascara.lang.localize-exceptions` is set to` true`. |
| public abstract [Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html)                   | [getCause](#getcause)()                                                                                                                          |                                                                                                           |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                         | [toString](#tostring)()                                                                                                                          |                                                                                                           |
| public abstract void                                                                                                                 | [printStackTrace](#printstacktrace)()                                                                                                            |                                                                                                           |
| public abstract void                                                                                                                 | [printStackTrace](#printstacktrace)([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) stream) |                                                                                                           |
| public abstract void                                                                                                                 | [printStackTrace](#printstacktrace)([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer) |                                                                                                           |
| public abstract [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] | [getStackTrace](#getstacktrace)()                                                                                                                |                                                                                                           |



## Method Details

### getLocalizableMessage

<span style="font-family: monospace; font-size: 80%;">public abstract [LocalizableMessage](../../../../../../../io/github/qishr/cascara/common/i18n/LocalizableMessage.md) __getLocalizableMessage__()</span>

Returns a localizable message for the error.


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

Returns a formatted error message, only localized if `cascara.lang.localize-exceptions` is set to` true`.


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

<span style="font-family: monospace; font-size: 80%;">public abstract void __printStackTrace__([PrintStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintStream.html) stream)</span>




---

### printStackTrace

<span style="font-family: monospace; font-size: 80%;">public abstract void __printStackTrace__([PrintWriter](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/PrintWriter.html) writer)</span>




---

### getStackTrace

<span style="font-family: monospace; font-size: 80%;">public abstract [StackTraceElement](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StackTraceElement.html)[] __getStackTrace__()</span>




---

