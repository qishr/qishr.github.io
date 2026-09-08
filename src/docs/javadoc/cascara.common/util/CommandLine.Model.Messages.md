Package [io.github.qishr.cascara.common.util](index.md)

# Class Messages
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.Messages<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Messages__</span>

Utility class for getting resource bundle strings.Enhances the standard ResourceBundle
 with support for String arrays and qualified keys: keys that may or may not be prefixed with the fully qualified command name.
 

Example properties resource bundle:
 # Usage Help Message Sections
 # ---------------------------
 # Numbered resource keys can be used to create multi-line sections.
 usage.headerHeading = This is my app. There are other apps like it but this one is mine.%n
 usage.header   = header first line
 usage.header.0 = header second line
 usage.descriptionHeading = Description:%n
 usage.description.0 = first line
 usage.description.1 = second line
 usage.description.2 = third line
 usage.synopsisHeading = Usage:u0020
 # Leading whitespace is removed by default. Start with u0020 to keep the leading whitespace.
 usage.customSynopsis.0 =      Usage: ln [OPTION]... [-T] TARGET LINK_NAME   (1st form)
 usage.customSynopsis.1 = u0020 or:  ln [OPTION]... TARGET                  (2nd form)
 usage.customSynopsis.2 = u0020 or:  ln [OPTION]... TARGET... DIRECTORY     (3rd form)
 # Headings can contain the %n character to create multi-line values.
 usage.parameterListHeading = %nPositional parameters:%n
 usage.optionListHeading = %nOptions:%n
 usage.commandListHeading = %nCommands:%n
 usage.footerHeading = Powered by picocli%n
 usage.footer = footer

 # Option Descriptions
 # -------------------
 # Use numbered keys to create multi-line descriptions.
 help = Show this help message and exit.
 version = Print version information and exit.
 
 

Resources for multiple commands can be specified in a single ResourceBundle. Keys and their value can be
 shared by multiple commands (so you don't need to repeat them for every command), but keys can be prefixed with
 `fully qualified command name + "."` to specify different values for different commands.
 The most specific key wins. For example: 
 
 jfrog.rt.usage.header = Artifactory commands
 jfrog.rt.config.usage.header = Configure Artifactory details.
 jfrog.rt.upload.usage.header = Upload files.

 jfrog.bt.usage.header = Bintray commands
 jfrog.bt.config.usage.header = Configure Bintray details.
 jfrog.bt.upload.usage.header = Upload files.

 # shared between all commands
 usage.footerHeading = Environment Variables:
 usage.footer.0 = footer line 0
 usage.footer.1 = footer line 1
 


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                            | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Messages([CommandSpec](CommandLine.Model.CommandSpec.md) spec, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) baseName)                                                                                                                  |             |
| Messages([CommandSpec](CommandLine.Model.CommandSpec.md) spec, [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) rb)                                                                                                        |             |
| Messages([CommandSpec](CommandLine.Model.CommandSpec.md) spec, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) baseName, [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) rb) |             |



## Method Summary

| Modifier and Type                                                                                                          | Method                                                                                                                                                                                                                                            | Description                                                                                                                     |
|----------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|
| public [Messages](CommandLine.Model.Messages.md)                                                                           | [parent](#parent)()                                                                                                                                                                                                                               |                                                                                                                                 |
| public static final void                                                                                                   | [setLoadBundles](#setloadbundles)(boolean loadBundles)                                                                                                                                                                                            | During annotation processing, resource bundles may not be available on the classpath and thereby cause failures.                |
| public static [Messages](CommandLine.Model.Messages.md)                                                                    | [copy](#copy)([CommandSpec](CommandLine.Model.CommandSpec.md) spec, [Messages](CommandLine.Model.Messages.md) original)                                                                                                                           | Returns a copy of the specified Messages object with the CommandSpec replaced by the specified one.                             |
| public static boolean                                                                                                      | [empty](#empty)([Messages](CommandLine.Model.Messages.md) messages)                                                                                                                                                                               | Returns `true` if the specified `Messages` is `null`, has a `null ResourceBundle`, or has a `null parent Messages`.             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                        | [getString](#getstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)              | Returns the String value found in the resource bundle for the specified key, or the specified default value if not found.       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[]                      | [getStringArray](#getstringarray)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] defaultValues) | Returns the String array value found in the resource bundle for the specified key, or the specified default value if not found. |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                 | [resourceBundleBaseName](#resourcebundlebasename)([Messages](CommandLine.Model.Messages.md) messages)                                                                                                                                             | Returns the ResourceBundle of the specified Messages object or `null` if the specified Messages object is `null`.               |
| public static [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) | [resourceBundle](#resourcebundle)([Messages](CommandLine.Model.Messages.md) messages)                                                                                                                                                             | Returns the ResourceBundle of the specified Messages object or `null` if the specified Messages object is `null`.               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                        | [resourceBundleBaseName](#resourcebundlebasename)()                                                                                                                                                                                               | Returns the base name of the ResourceBundle of this object or `null`.                                                           |
| public [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html)        | [resourceBundle](#resourcebundle)()                                                                                                                                                                                                               | Returns the ResourceBundle of this object or `null`.                                                                            |
| public [CommandSpec](CommandLine.Model.CommandSpec.md)                                                                     | [commandSpec](#commandspec)()                                                                                                                                                                                                                     | Returns the CommandSpec of this object, never `null`.                                                                           |



## Method Details

### parent

<span style="font-family: monospace; font-size: 80%;">public [Messages](CommandLine.Model.Messages.md) __parent__()</span>




---

### setLoadBundles

<span style="font-family: monospace; font-size: 80%;">public static final void __setLoadBundles__(boolean loadBundles)</span>

During annotation processing, resource bundles may not be available on the
classpath and thereby cause failures.This method allows for disabling
loading of resource bundles during annotation processing, preventing such
errors.

**Parameters:**

`loadBundles` - true if bundles should be loaded (default), false if bundles should not be loaded

**Since:**

4.7.8-SNAPSHOT


---

### copy

<span style="font-family: monospace; font-size: 80%;">public static [Messages](CommandLine.Model.Messages.md) __copy__([CommandSpec](CommandLine.Model.CommandSpec.md) spec, [Messages](CommandLine.Model.Messages.md) original)</span>

Returns a copy of the specified Messages object with the CommandSpec replaced by the specified one.

**Parameters:**

`spec` - the CommandSpec of the returned Messages

`original` - the Messages object whose ResourceBundle to reference

**Returns:**

a Messages object with the specified CommandSpec and the ResourceBundle of the specified Messages object


---

### empty

<span style="font-family: monospace; font-size: 80%;">public static boolean __empty__([Messages](CommandLine.Model.Messages.md) messages)</span>

Returns `true` if the specified `Messages` is `null`, has a `null ResourceBundle`, or has a `null parent Messages`.


---

### getString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) defaultValue)</span>

Returns the String value found in the resource bundle for the specified key, or the specified default value if not found.

**Parameters:**

`key` - unqualified resource bundle key. This method will first try to find a value by qualifying the key with the command's fully qualified name,
             and if not found, it will try with the unqualified key.

`defaultValue` - value to return if the resource bundle is null or empty, or if no value was found by the qualified or unqualified key

**Returns:**

the String value found in the resource bundle for the specified key, or the specified default value


---

### getStringArray

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __getStringArray__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] defaultValues)</span>

Returns the String array value found in the resource bundle for the specified key, or the specified default value if not found.Multi-line strings can be specified in the resource bundle with `key.0`, `key.1`, `key.2`, etc.

**Parameters:**

`key` - unqualified resource bundle key. This method will first try to find a value by qualifying the key with the command's fully qualified name,
            and if not found, it will try with the unqualified key.

`defaultValues` - value to return if the resource bundle is null or empty, or if no value was found by the qualified or unqualified key

**Returns:**

the String array value found in the resource bundle for the specified key, or the specified default value


---

### resourceBundleBaseName

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __resourceBundleBaseName__([Messages](CommandLine.Model.Messages.md) messages)</span>

Returns the ResourceBundle of the specified Messages object or `null` if the specified Messages object is `null`.

**Since:**

4.0


---

### resourceBundle

<span style="font-family: monospace; font-size: 80%;">public static [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) __resourceBundle__([Messages](CommandLine.Model.Messages.md) messages)</span>

Returns the ResourceBundle of the specified Messages object or `null` if the specified Messages object is `null`.


---

### resourceBundleBaseName

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __resourceBundleBaseName__()</span>

Returns the base name of the ResourceBundle of this object or `null`.

**Since:**

4.0


---

### resourceBundle

<span style="font-family: monospace; font-size: 80%;">public [ResourceBundle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ResourceBundle.html) __resourceBundle__()</span>

Returns the ResourceBundle of this object or `null`.


---

### commandSpec

<span style="font-family: monospace; font-size: 80%;">public [CommandSpec](CommandLine.Model.CommandSpec.md) __commandSpec__()</span>

Returns the CommandSpec of this object, never `null`.


---

