Package [io.github.qishr.cascara.common.util](index.md)

# Class UseDefaultConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.UseDefaultConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [ITypeConverter](CommandLine.ITypeConverter.md)<[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)>

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final class __UseDefaultConverter__</span>

Converter that can be used to signal to picocli that it should use the default converter.This can be useful with maps:

  class App {
      Option(names = "-D", converter = {UseDefaultConverter.class, GenericValueConverter.class})
      MapString, GenericValue? values;
 }


The [convert](#convert) method of this class always throws an UnsupportedOperationException.


## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| UseDefaultConverter() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                  | Description                                  |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [convert](#convert)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) | Always throws UnsupportedOperationException. |



## Method Details

### convert

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __convert__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>

Always throws UnsupportedOperationException.

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)

**Specified By:**

[ITypeConverter](CommandLine.ITypeConverter.md)


---

