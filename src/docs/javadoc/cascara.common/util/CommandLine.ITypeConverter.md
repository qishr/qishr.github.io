Package [io.github.qishr.cascara.common.util](index.md)

# Interface ITypeConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ITypeConverter<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)

All Known Implementing Classes:<br/>
    [UseDefaultConverter](CommandLine.UseDefaultConverter.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __ITypeConverter__</span>




When parsing command line arguments and initializing
fields annotated with [Option](CommandLine.Option.md) or [Parameters](CommandLine.Parameters.md),
String values can be converted to any type for which a `ITypeConverter` is registered.


This interface defines the contract for classes that know how to convert a String into some domain object.
Custom converters can be registered with the #registerConverter(Class, ITypeConverter) method.



Java 8 lambdas make it easy to register custom type converters:


commandLine.registerConverter(java.nio.file.Path.class, s - java.nio.file.Paths.get(s));
commandLine.registerConverter(java.time.Duration.class, s - java.time.Duration.parse(s));



Built-in type converters are pre-registered for the following java 1.5 types:


  all primitive types
  all primitive wrapper types: Boolean, Byte, Character, Double, Float, Integer, Long, Short
  any enum
  java.io.File
  java.math.BigDecimal
  java.math.BigInteger
  java.net.InetAddress
  java.net.URI
  java.net.URL
  java.nio.charset.Charset
  java.sql.Time
  java.util.Date
  java.util.UUID
  java.util.regex.Pattern
  StringBuilder
  CharSequence
  String



## Method Summary

| Modifier and Type | Method                                                                                                                  | Description                                                               |
|-------------------|-------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| public abstract K | [convert](#convert)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value) | Converts the specified command line argument value to some domain object. |



## Method Details

### convert

<span style="font-family: monospace; font-size: 80%;">public abstract K __convert__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)</span>

Converts the specified command line argument value to some domain object.

**Parameters:**

`value` - the command line argument String value

**Returns:**

the resulting domain object

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

