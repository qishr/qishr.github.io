Package [io.github.qishr.cascara.common.util](index.md)

# Class PropertiesDefaultProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.PropertiesDefaultProvider<br/>
<br/>
All Implemented Interfaces:<br/>
    [IDefaultValueProvider](CommandLine.IDefaultValueProvider.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __PropertiesDefaultProvider__</span>

[IDefaultValueProvider](CommandLine.IDefaultValueProvider.md) implementation that loads default values for command line
options and positional parameters from a properties file or `Properties` object.Location
By default, this implementation tries to find a properties file named
`".<YOURCOMMAND>.properties"` in the user home directory, where `"<YOURCOMMAND>"` is the name of the command.
If a command has aliases in addition to its name,
these aliases are also used to try to find the properties file. For example:

Command(name = "git", defaultValueProvider = PropertiesDefaultProvider.class)
class Git { }



The above will try to load default values from `new File(System.getProperty("user.home"), ".git.properties")`.




The location of the properties file can also be controlled with system property `"picocli.defaults.<YOURCOMMAND>.path"`,
in which case the value of the property must be the path to the file containing the default values.




The location of the properties file may also be specified programmatically. For example:


CommandLine cmd = new CommandLine(new MyCommand());
File defaultsFile = new File("path/to/config/mycommand.properties");
cmd.setDefaultValueProvider(new PropertiesDefaultProvider(defaultsFile));
cmd.execute(args);

Format



For options, the key is either the descriptionKey,
or the option's longest name.



For positional parameters, the key is either the
descriptionKey,
or the positional parameter's param label.



End users may not know what the `descriptionKey` of your options and positional parameters are, so be sure
to document that with your application.

Subcommands



The default values for options and positional parameters of subcommands can be included in the
properties file for the top-level command, so that end users need to maintain only a single file.
This can be achieved by prefixing the key with the command's qualified name.
For example, to give the ``git commit`` command's `--cleanup` option a
default value of `strip`, define a key of `git.commit.cleanup` and assign
it a default value.

# /home/remko/.git.properties
git.commit.cleanup = strip



## Constructor Summary

| Constructor                                                                                                                                | Description                                                                                 |
|--------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| PropertiesDefaultProvider()                                                                                                                | Default constructor, used when this default value provider is specified in the annotations: |
| PropertiesDefaultProvider([Properties](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Properties.html) properties) | This constructor loads default values from the specified properties object.                 |
| PropertiesDefaultProvider([File](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/File.html) file)                     | This constructor loads default values from the specified properties file.                   |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                         | Description |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [defaultValue](#defaultvalue)([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                        |             |



## Method Details

### defaultValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __defaultValue__([ArgSpec](CommandLine.Model.ArgSpec.md) argSpec)</span>



**Throws:**

[Exception](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Exception.html)

**Specified By:**

[IDefaultValueProvider](CommandLine.IDefaultValueProvider.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

