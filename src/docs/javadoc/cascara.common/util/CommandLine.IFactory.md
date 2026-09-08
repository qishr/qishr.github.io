Package [io.github.qishr.cascara.common.util](index.md)

# Interface IFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IFactory<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IFactory__</span>

Factory for instantiating classes that are registered declaratively with annotation attributes, like
Command#subcommands(), Option#converter(), Parameters#converter() and Command#versionProvider().The factory is also used to instantiate the `Collection` or `Map` implementation class for multi-value
options and positional parameters with an abstract type, like `List<String>`.


You may provide a custom implementation of this interface.
For example, a custom factory implementation could delegate to a dependency injection container that provides the requested instance.


Custom factory implementations should always fall back to the default factory if instantiation failed. For example:


class MyFactory implements IFactory {
    private final ApplicationContext applicationContext = getAppContext();

    public T T create(ClassT cls) throws Exception {
        try {
            applicationContext.getBean(cls);
        } catch (Exception ex) {
            CommandLine.defaultFactory().create(cls);
        }
    }
}



Tip: custom factory implementations that have resources that need to be closed when done should consider
implementing `java.lang.AutoCloseable` or `java.io.Closeable`. This allows applications to use
the following idiom for configuring picocli before running their application:

public static void main(String[] args) {
    int exitCode = 0;
    try (MyFactory factory = createMyFactory()) {
        exitCode = new CommandLine(MyClass.class, factory)
                .setXxx(x) // configure the picocli parser...
                .execute(args);
    }
    System.exit(exitCode);
}



## Method Summary

| Modifier and Type | Method                                                                                                               | Description                                 |
|-------------------|----------------------------------------------------------------------------------------------------------------------|---------------------------------------------|
| public abstract K | [create](#create)([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<K> cls) | Returns an instance of the specified class. |



## Method Details

### create

<span style="font-family: monospace; font-size: 80%;">public abstract K __create__([Class](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Class.html)<K> cls)</span>

Returns an instance of the specified class.

**Parameters:**

`cls` - the class of the object to return

**Returns:**

the instance

**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)


---

