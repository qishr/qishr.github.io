Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface Mixin
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Mixin<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD,PARAMETER)<br/>
public static @interface __Mixin__</span>




Fields annotated with `@Mixin` are "expanded" into the current command: [Option](CommandLine.Option.md) and
[Parameters](CommandLine.Parameters.md) in the mixin class are added to the options and positional parameters of this command.A [DuplicateOptionAnnotationsException](CommandLine.DuplicateOptionAnnotationsException.md) is thrown if any of the options in the mixin has the same name as
an option in this command.



The `Mixin` annotation provides a way to reuse common options and parameters without subclassing. For example:

Command(name="HelloWorld")
class HelloWorld implements Runnable {

    // adds the --help and --version options to this command
    Mixin
    private HelpOptions options = new HelpOptions();

    Option(names = {"-u", "--userName"}, required = true, description = "The user name")
    String userName;

    public void run() { System.out.println("Hello, " + userName); }
}

// Common reusable help options.
class HelpOptions {

    Option(names = { "-h", "--help"}, usageHelp = true, description = "Display this help and exit")
    private boolean help;

    Option(names = { "-V", "--version"}, versionHelp = true, description = "Display version info and exit")
    private boolean versionHelp;
}



## Method Summary

| Modifier and Type                                                                                            | Method          | Description                                                                                   |
|--------------------------------------------------------------------------------------------------------------|-----------------|-----------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [name](#name)() | Optionally specify a name that the mixin object can be retrieved with from the `CommandSpec`. |



## Method Details

### name

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __name__()</span>

Optionally specify a name that the mixin object can be retrieved with from the `CommandSpec`.If not specified the name of the annotated field is used.

**Returns:**

a String to register the mixin object with, or an empty String if the name of the annotated field should be used


---

