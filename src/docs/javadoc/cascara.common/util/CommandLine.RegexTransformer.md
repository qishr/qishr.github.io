Package [io.github.qishr.cascara.common.util](index.md)

# Class RegexTransformer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.RegexTransformer<br/>
<br/>
All Implemented Interfaces:<br/>
    [INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __RegexTransformer__</span>

A regular expression-based option name transformation for negatable options.

A common way to negate GNU *nix long options is to prefix them with `"no-"`, so
 for a `--force` option the negative version would be `--no-force`.
 Java has the `-XX:[+|-]` JVM options, where
 "Boolean options are turned on with `-XX:+<option>` and turned off with `-XX:-<option>`".
 These are the negative forms [createDefault](#createdefault) by this class.
 


 See the picocli.CommandLine.RegexTransformer.Builder for an example of customizing this to create negative forms for short options.
 


## Nested Class Summary

| Modifier and Type | Class                                                                                                               | Description                                      |
|-------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.RegexTransformer.Builder](CommandLine.RegexTransformer.Builder.md) | Builder for creating `RegexTransformer` objects. |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                      | Description                                                            |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| public static [RegexTransformer](CommandLine.RegexTransformer.md)                                   | [createDefault](#createdefault)()                                                                                                                                                           | Returns the `RegexTransformer` used by default for negatable options.  |
| public static [RegexTransformer](CommandLine.RegexTransformer.md)                                   | [createCaseInsensitive](#createcaseinsensitive)()                                                                                                                                           | Returns the `RegexTransformer` for case-insensitive negatable options. |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [makeNegative](#makenegative)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd) |                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [makeSynopsis](#makesynopsis)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd) |                                                                        |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                                                                                     |                                                                        |



## Method Details

### createDefault

<span style="font-family: monospace; font-size: 80%;">public static [RegexTransformer](CommandLine.RegexTransformer.md) __createDefault__()</span>

Returns the `RegexTransformer` used by default for negatable options.
  The regular expressions used by default for negatable options
  
    Regex
    Negative Replacement
    Synopsis Replacement
    Comment
  
  
    ^--no-(\w(-|\w)*)$
    --$1
    --[no-]$1
    Converts --no-force to --force
  
  
    ^--(\w(-|\w)*)$
    --no-$1
    --[no-]$1
    Converts --force to --no-force
  
  
    ^(-|--)(\w*:)\+(\w(-|\w)*)$
    $1$2-$3
    $1$2(+|-)$3
    Converts -XX:+Inline to -XX:-Inline
  
  
    ^(-|--)(\w*:)\-(\w(-|\w)*)$
    $1$2+$3
    $1$2(+|-)$3
    Converts -XX:-Inline to -XX:+Inline
  



---

### createCaseInsensitive

<span style="font-family: monospace; font-size: 80%;">public static [RegexTransformer](CommandLine.RegexTransformer.md) __createCaseInsensitive__()</span>

Returns the `RegexTransformer` for case-insensitive negatable options.
  The regular expressions for case-insensitive negatable options
  
    Regex
    Negative Replacement
    Synopsis Replacement
    Comment
  
  
    ^--((?i)no)-(\w(-|\w)*)$
    --$2
    --[$1-]$2
    Converts --no-force to --force
         and --NO-force to --force
  
  
    ^--(\w(-|\w)*)$
    --no-$1
    --[no-]$1
    Converts --force to --no-force
  
  
    ^(-|--)(\w*:)\+(\w(-|\w)*)$
    $1$2-$3
    $1$2(+|-)$3
    Converts -XX:+Inline to -XX:-Inline
  
  
    ^(-|--)(\w*:)\-(\w(-|\w)*)$
    $1$2+$3
    $1$2(+|-)$3
    Converts -XX:-Inline to -XX:+Inline
  



---

### makeNegative

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __makeNegative__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd)</span>



**Specified By:**

[INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md)


---

### makeSynopsis

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __makeSynopsis__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) optionName, [CommandSpec](CommandLine.Model.CommandSpec.md) cmd)</span>



**Specified By:**

[INegatableOptionTransformer](CommandLine.INegatableOptionTransformer.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

