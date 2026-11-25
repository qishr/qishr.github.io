Package [io.github.qishr.cascara.ui.language](index.md)

# Interface OldLocalizer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.language.OldLocalizer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public interface __OldLocalizer__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                                                                                                       | Description                                                                              |
|--------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [format](#format)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) | Formats the code with dynamic arguments using the environment's current language bundle. |
| public abstract boolean                                                                                      | [registerTranslations](#registertranslations)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) yamlStream)                                                               |                                                                                          |



## Method Details

### format

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __format__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) code, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details)</span>

Formats the code with dynamic arguments using the environment's current language bundle.


---

### registerTranslations

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __registerTranslations__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) yamlStream)</span>




---

