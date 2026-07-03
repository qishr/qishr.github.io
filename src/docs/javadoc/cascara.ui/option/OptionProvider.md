Package [io.github.qishr.cascara.ui.option](index.md)

# Interface OptionProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.option.OptionProvider<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../cascara.common/service/ServiceProvider.md)

All Known Implementing Classes:<br/>
    [AbstractOptionProvider](AbstractOptionProvider.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __OptionProvider__</span>


## Method Summary

| Modifier and Type                                                                                                             | Method                                                                                                                                                                 | Description |
|-------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public abstract void                                                                                                          | [initialize](#initialize)()                                                                                                                                            |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [getName](#getname)()                                                                                                                                                  |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [getContentType](#getcontenttype)()                                                                                                                                    |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [getSchemaType](#getschematype)()                                                                                                                                      |             |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                  | [getSchemaFormat](#getschemaformat)()                                                                                                                                  |             |
| public abstract [ScalarRenderer](../api/render/ScalarRenderer.md)                                                             | [getRenderer](#getrenderer)()                                                                                                                                          |             |
| public abstract [Option](Option.md)                                                                                           | [getActiveOption](#getactiveoption)(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter) |             |
| public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](Option.md)> | [getOptions](#getoptions)(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)           |             |
| public abstract void                                                                                                          | [addListener](#addlistener)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener)                                 |             |
| public abstract void                                                                                                          | [removeListener](#removelistener)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener)                           |             |



## Method Details

### initialize

<span style="font-family: monospace; font-size: 80%;">public abstract void __initialize__()</span>



**Throws:**

[LocalizableRuntimeException](../../cascara.common/diagnostic/LocalizableRuntimeException.md)


---

### getName

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getName__()</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getContentType__()</span>




---

### getSchemaType

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaType__()</span>




---

### getSchemaFormat

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getSchemaFormat__()</span>




---

### getRenderer

<span style="font-family: monospace; font-size: 80%;">public abstract [ScalarRenderer](../api/render/ScalarRenderer.md) __getRenderer__()</span>




---

### getActiveOption

<span style="font-family: monospace; font-size: 80%;">public abstract [Option](Option.md) __getActiveOption__(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

### getOptions

<span style="font-family: monospace; font-size: 80%;">public abstract [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Option](Option.md)> __getOptions__(java.util.Map contextData, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) parameter)</span>




---

### addListener

<span style="font-family: monospace; font-size: 80%;">public abstract void __addListener__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener)</span>




---

### removeListener

<span style="font-family: monospace; font-size: 80%;">public abstract void __removeListener__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) listener)</span>




---

