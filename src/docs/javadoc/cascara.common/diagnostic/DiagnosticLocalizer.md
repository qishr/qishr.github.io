Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Interface DiagnosticLocalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.DiagnosticLocalizer<br/>
<br/>
All Known Implementing Classes:<br/>
    [ObservableLocalizer](../../cascara.ui/language/ObservableLocalizer.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __DiagnosticLocalizer__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                 | Description                                                                  |
|------------------------------------------------------------------------------------------------------------------|---------------------------------------|------------------------------------------------------------------------------|
| public static final DiagnosticLocalizer                                                                          | [DEFAULT](#default)                   | A default fail-safe implementation that falls back to standard MessageFormat |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FORMATTING_ERROR](#formatting_error) |                                                                              |



## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                   | Description                                                                              |
|--------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [format](#format)([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Formats the code with dynamic arguments using the environment's current language bundle. |



## Field Details

### DEFAULT

<span style="font-family: monospace; font-size: 80%;">public static final DiagnosticLocalizer __DEFAULT__</span>

A default fail-safe implementation that falls back to standard MessageFormat


---

### FORMATTING_ERROR

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FORMATTING_ERROR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### format

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([DiagnosticCode](code/DiagnosticCode.md) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Formats the code with dynamic arguments using the environment's current language bundle.


---

