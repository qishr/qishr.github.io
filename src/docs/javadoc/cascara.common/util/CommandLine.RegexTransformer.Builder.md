Package [io.github.qishr.cascara.common.util](index.md)

# Class Builder
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.RegexTransformer.Builder<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.RegexTransformer](CommandLine.RegexTransformer.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __Builder__</span>

Builder for creating `RegexTransformer` objects.


## Constructor Summary

| Constructor                                                      | Description                                                                         |
|------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| Builder()                                                        | Constructs an empty builder.                                                        |
| Builder([RegexTransformer](CommandLine.RegexTransformer.md) old) | Constructs a builder populated with the values from the specified RegexTransformer. |



## Method Summary

| Modifier and Type                                          | Method                                                                                                                                                                                                                                                                                                                                                            | Description                                                                                            |
|------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| public [Builder](CommandLine.RegexTransformer.Builder.md)  | [addPattern](#addpattern)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) regex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) negativeReplacement, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) synopsisReplacement) | Adds the specified negative replacement and synopsis replacement for the specified regular expression. |
| public [Builder](CommandLine.RegexTransformer.Builder.md)  | [removePattern](#removepattern)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) regex)                                                                                                                                                                                                                               | Removes the negative replacement and synopsis replacement for the specified regular expression.        |
| public [RegexTransformer](CommandLine.RegexTransformer.md) | [build](#build)()                                                                                                                                                                                                                                                                                                                                                 |                                                                                                        |



## Method Details

### addPattern

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.RegexTransformer.Builder.md) __addPattern__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) regex, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) negativeReplacement, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) synopsisReplacement)</span>

Adds the specified negative replacement and synopsis replacement for the specified regular expression.For example, to add negative forms for short options:

  Regular expressions for adding negative forms for short options
  
    Regex
    Negative Replacement
    Synopsis Replacement
    Comment
  
  
    ^-(\w)$
    +$1
    (+|-)$1
    Converts -v to +v
  
  
    ^\+(\w)$
    -$1
    (+|-)$1
    Converts -v to +v
  


**Parameters:**

`regex` - regular expression to match an option name

`negativeReplacement` - the replacement to use to generate a negative name when the option name matches

`synopsisReplacement` - the replacement to use to generate a documentation string when the option name matches

**Returns:**

this `RegexTransformer` for method chaining


---

### removePattern

<span style="font-family: monospace; font-size: 80%;">public [Builder](CommandLine.RegexTransformer.Builder.md) __removePattern__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) regex)</span>

Removes the negative replacement and synopsis replacement for the specified regular expression.

**Parameters:**

`regex` - regular expression to remove

**Returns:**

this `RegexTransformer` for method chaining


---

### build

<span style="font-family: monospace; font-size: 80%;">public [RegexTransformer](CommandLine.RegexTransformer.md) __build__()</span>




---

