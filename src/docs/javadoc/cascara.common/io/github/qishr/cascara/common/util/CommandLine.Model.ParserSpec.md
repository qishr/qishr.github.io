Package [io.github.qishr.cascara.common.util](index.md)

# Class ParserSpec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.ParserSpec<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __ParserSpec__</span>

Models parser configuration specification.


## Constructor Summary

| Constructor  | Description |
|--------------|-------------|
| ParserSpec() |             |



## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                                                        | Description                                                                                                                                                                  |
|------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [separator](#separator)()                                                                                                                                     | Returns the String to use as the separator between options and option parameters.                                                                                            |
| public boolean                                                                                             | [stopAtUnmatched](#stopatunmatched)()                                                                                                                         |                                                                                                                                                                              |
| public boolean                                                                                             | [stopAtPositional](#stopatpositional)()                                                                                                                       |                                                                                                                                                                              |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [endOfOptionsDelimiter](#endofoptionsdelimiter)()                                                                                                             |                                                                                                                                                                              |
| public boolean                                                                                             | [toggleBooleanFlags](#togglebooleanflags)()                                                                                                                   |                                                                                                                                                                              |
| public boolean                                                                                             | [overwrittenOptionsAllowed](#overwrittenoptionsallowed)()                                                                                                     |                                                                                                                                                                              |
| public boolean                                                                                             | [unmatchedArgumentsAllowed](#unmatchedargumentsallowed)()                                                                                                     |                                                                                                                                                                              |
| public boolean                                                                                             | [abbreviatedSubcommandsAllowed](#abbreviatedsubcommandsallowed)()                                                                                             |                                                                                                                                                                              |
| public boolean                                                                                             | [abbreviatedOptionsAllowed](#abbreviatedoptionsallowed)()                                                                                                     |                                                                                                                                                                              |
| public boolean                                                                                             | [expandAtFiles](#expandatfiles)()                                                                                                                             |                                                                                                                                                                              |
| public [Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html)  | [atFileCommentChar](#atfilecommentchar)()                                                                                                                     |                                                                                                                                                                              |
| public boolean                                                                                             | [useSimplifiedAtFiles](#usesimplifiedatfiles)()                                                                                                               |                                                                                                                                                                              |
| public boolean                                                                                             | [posixClusteredShortOptionsAllowed](#posixclusteredshortoptionsallowed)()                                                                                     |                                                                                                                                                                              |
| public boolean                                                                                             | [caseInsensitiveEnumValuesAllowed](#caseinsensitiveenumvaluesallowed)()                                                                                       |                                                                                                                                                                              |
| public boolean                                                                                             | [trimQuotes](#trimquotes)()                                                                                                                                   |                                                                                                                                                                              |
| public boolean                                                                                             | [splitQuotedStrings](#splitquotedstrings)()                                                                                                                   |                                                                                                                                                                              |
| public boolean                                                                                             | [unmatchedOptionsArePositionalParams](#unmatchedoptionsarepositionalparams)()                                                                                 |                                                                                                                                                                              |
| public boolean                                                                                             | [unmatchedOptionsAllowedAsOptionParameters](#unmatchedoptionsallowedasoptionparameters)()                                                                     |                                                                                                                                                                              |
| public boolean                                                                                             | [allowSubcommandsAsOptionParameters](#allowsubcommandsasoptionparameters)()                                                                                   |                                                                                                                                                                              |
| public boolean                                                                                             | [allowOptionsAsOptionParameters](#allowoptionsasoptionparameters)()                                                                                           |                                                                                                                                                                              |
| public boolean                                                                                             | [limitSplit](#limitsplit)()                                                                                                                                   | Returns true if arguments should be split first before any further processing and the number of  parts resulting from the split is limited to the max arity of the argument. |
| public boolean                                                                                             | [aritySatisfiedByAttachedOptionParam](#aritysatisfiedbyattachedoptionparam)()                                                                                 | Returns true if options with attached arguments should not consume subsequent arguments and should not validate arity.                                                       |
| public boolean                                                                                             | [collectErrors](#collecterrors)()                                                                                                                             | Returns true if exceptions during parsing should be collected instead of thrown.                                                                                             |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [separator](#separator)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)                               | Sets the String to use as the separator between options and option parameters.                                                                                               |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [stopAtUnmatched](#stopatunmatched)(boolean stopAtUnmatched)                                                                                                  |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [stopAtPositional](#stopatpositional)(boolean stopAtPositional)                                                                                               |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [endOfOptionsDelimiter](#endofoptionsdelimiter)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) delimiter)       |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [toggleBooleanFlags](#togglebooleanflags)(boolean toggleBooleanFlags)                                                                                         |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [overwrittenOptionsAllowed](#overwrittenoptionsallowed)(boolean overwrittenOptionsAllowed)                                                                    |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [unmatchedArgumentsAllowed](#unmatchedargumentsallowed)(boolean unmatchedArgumentsAllowed)                                                                    |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [abbreviatedSubcommandsAllowed](#abbreviatedsubcommandsallowed)(boolean abbreviatedSubcommandsAllowed)                                                        |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [abbreviatedOptionsAllowed](#abbreviatedoptionsallowed)(boolean abbreviatedOptionsAllowed)                                                                    |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [expandAtFiles](#expandatfiles)(boolean expandAtFiles)                                                                                                        |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [atFileCommentChar](#atfilecommentchar)([Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html) atFileCommentChar) |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [useSimplifiedAtFiles](#usesimplifiedatfiles)(boolean useSimplifiedAtFiles)                                                                                   |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [posixClusteredShortOptionsAllowed](#posixclusteredshortoptionsallowed)(boolean posixClusteredShortOptionsAllowed)                                            |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [caseInsensitiveEnumValuesAllowed](#caseinsensitiveenumvaluesallowed)(boolean caseInsensitiveEnumValuesAllowed)                                               |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [trimQuotes](#trimquotes)(boolean trimQuotes)                                                                                                                 |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [splitQuotedStrings](#splitquotedstrings)(boolean splitQuotedStrings)                                                                                         |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [unmatchedOptionsAllowedAsOptionParameters](#unmatchedoptionsallowedasoptionparameters)(boolean unmatchedOptionsAllowedAsOptionParameters)                    |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [unmatchedOptionsArePositionalParams](#unmatchedoptionsarepositionalparams)(boolean unmatchedOptionsArePositionalParams)                                      |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [allowSubcommandsAsOptionParameters](#allowsubcommandsasoptionparameters)(boolean allowSubcommandsAsOptionParameters)                                         |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [allowOptionsAsOptionParameters](#allowoptionsasoptionparameters)(boolean allowOptionsAsOptionParameters)                                                     |                                                                                                                                                                              |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [collectErrors](#collecterrors)(boolean collectErrors)                                                                                                        | Sets whether exceptions during parsing should be collected instead of thrown.                                                                                                |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [aritySatisfiedByAttachedOptionParam](#aritysatisfiedbyattachedoptionparam)(boolean newValue)                                                                 | Returns true if options with attached arguments should not consume subsequent arguments and should not validate arity.                                                       |
| public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) | [limitSplit](#limitsplit)(boolean limitSplit)                                                                                                                 | Sets whether arguments should be split first before any further processing.                                                                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [toString](#tostring)()                                                                                                                                       |                                                                                                                                                                              |



## Method Details

### separator

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __separator__()</span>

Returns the String to use as the separator between options and option parameters.`"="` by default,
 initialized from Command.separator if defined.


---

### stopAtUnmatched

<span style="font-family: monospace; font-size: 80%;">public boolean __stopAtUnmatched__()</span>



**See Also:**


isStopAtUnmatched



---

### stopAtPositional

<span style="font-family: monospace; font-size: 80%;">public boolean __stopAtPositional__()</span>



**See Also:**


isStopAtPositional



---

### endOfOptionsDelimiter

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __endOfOptionsDelimiter__()</span>



**Since:**

3.5

**See Also:**


getEndOfOptionsDelimiter



---

### toggleBooleanFlags

<span style="font-family: monospace; font-size: 80%;">public boolean __toggleBooleanFlags__()</span>



**See Also:**


isToggleBooleanFlags



---

### overwrittenOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __overwrittenOptionsAllowed__()</span>



**See Also:**


isOverwrittenOptionsAllowed



---

### unmatchedArgumentsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __unmatchedArgumentsAllowed__()</span>



**See Also:**


isUnmatchedArgumentsAllowed



---

### abbreviatedSubcommandsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __abbreviatedSubcommandsAllowed__()</span>



**See Also:**


isAbbreviatedSubcommandsAllowed



---

### abbreviatedOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __abbreviatedOptionsAllowed__()</span>



**See Also:**


isAbbreviatedOptionsAllowed



---

### expandAtFiles

<span style="font-family: monospace; font-size: 80%;">public boolean __expandAtFiles__()</span>



**See Also:**


isExpandAtFiles



---

### atFileCommentChar

<span style="font-family: monospace; font-size: 80%;">public [Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html) __atFileCommentChar__()</span>



**Since:**

3.5

**See Also:**


getAtFileCommentChar



---

### useSimplifiedAtFiles

<span style="font-family: monospace; font-size: 80%;">public boolean __useSimplifiedAtFiles__()</span>



**Since:**

3.9

**See Also:**


isUseSimplifiedAtFiles



---

### posixClusteredShortOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __posixClusteredShortOptionsAllowed__()</span>



**See Also:**


isPosixClusteredShortOptionsAllowed



---

### caseInsensitiveEnumValuesAllowed

<span style="font-family: monospace; font-size: 80%;">public boolean __caseInsensitiveEnumValuesAllowed__()</span>



**Since:**

3.4

**See Also:**


isCaseInsensitiveEnumValuesAllowed



---

### trimQuotes

<span style="font-family: monospace; font-size: 80%;">public boolean __trimQuotes__()</span>



**Since:**

3.7

**See Also:**


isTrimQuotes



---

### splitQuotedStrings

<span style="font-family: monospace; font-size: 80%;">public boolean __splitQuotedStrings__()</span>



**Since:**

3.7

**See Also:**


isSplitQuotedStrings



---

### unmatchedOptionsArePositionalParams

<span style="font-family: monospace; font-size: 80%;">public boolean __unmatchedOptionsArePositionalParams__()</span>



**See Also:**


isUnmatchedOptionsArePositionalParams



---

### unmatchedOptionsAllowedAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public boolean __unmatchedOptionsAllowedAsOptionParameters__()</span>



**Since:**

4.4

**See Also:**


isUnmatchedOptionsAllowedAsOptionParameters



---

### allowSubcommandsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public boolean __allowSubcommandsAsOptionParameters__()</span>



**Since:**

4.7.8-SNAPSHOT

**See Also:**


isAllowSubcommandsAsOptionParameters



---

### allowOptionsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public boolean __allowOptionsAsOptionParameters__()</span>



**Since:**

4.7.8-SNAPSHOT

**See Also:**


isAllowOptionsAsOptionParameters



---

### limitSplit

<span style="font-family: monospace; font-size: 80%;">public boolean __limitSplit__()</span>

Returns true if arguments should be split first before any further processing and the number of
 parts resulting from the split is limited to the max arity of the argument.


---

### aritySatisfiedByAttachedOptionParam

<span style="font-family: monospace; font-size: 80%;">public boolean __aritySatisfiedByAttachedOptionParam__()</span>

Returns true if options with attached arguments should not consume subsequent arguments and should not validate arity.The default is `false`.


---

### collectErrors

<span style="font-family: monospace; font-size: 80%;">public boolean __collectErrors__()</span>

Returns true if exceptions during parsing should be collected instead of thrown.Multiple errors may be encountered during parsing. These can be obtained from ParseResult#errors().

**Since:**

3.2


---

### separator

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __separator__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) separator)</span>

Sets the String to use as the separator between options and option parameters.

**Returns:**

this ParserSpec for method chaining


---

### stopAtUnmatched

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __stopAtUnmatched__(boolean stopAtUnmatched)</span>



**See Also:**


setStopAtUnmatched



---

### stopAtPositional

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __stopAtPositional__(boolean stopAtPositional)</span>



**See Also:**


setStopAtPositional



---

### endOfOptionsDelimiter

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __endOfOptionsDelimiter__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) delimiter)</span>



**Since:**

3.5

**See Also:**


setEndOfOptionsDelimiter



---

### toggleBooleanFlags

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __toggleBooleanFlags__(boolean toggleBooleanFlags)</span>



**See Also:**


setToggleBooleanFlags



---

### overwrittenOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __overwrittenOptionsAllowed__(boolean overwrittenOptionsAllowed)</span>



**See Also:**


setOverwrittenOptionsAllowed



---

### unmatchedArgumentsAllowed

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __unmatchedArgumentsAllowed__(boolean unmatchedArgumentsAllowed)</span>



**See Also:**


setUnmatchedArgumentsAllowed



---

### abbreviatedSubcommandsAllowed

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __abbreviatedSubcommandsAllowed__(boolean abbreviatedSubcommandsAllowed)</span>



**See Also:**


setAbbreviatedSubcommandsAllowed



---

### abbreviatedOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __abbreviatedOptionsAllowed__(boolean abbreviatedOptionsAllowed)</span>



**See Also:**


setAbbreviatedOptionsAllowed



---

### expandAtFiles

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __expandAtFiles__(boolean expandAtFiles)</span>



**See Also:**


setExpandAtFiles



---

### atFileCommentChar

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __atFileCommentChar__([Character](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Character.html) atFileCommentChar)</span>



**Since:**

3.5

**See Also:**


setAtFileCommentChar



---

### useSimplifiedAtFiles

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __useSimplifiedAtFiles__(boolean useSimplifiedAtFiles)</span>



**Since:**

3.9

**See Also:**


setUseSimplifiedAtFiles



---

### posixClusteredShortOptionsAllowed

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __posixClusteredShortOptionsAllowed__(boolean posixClusteredShortOptionsAllowed)</span>



**See Also:**


setPosixClusteredShortOptionsAllowed



---

### caseInsensitiveEnumValuesAllowed

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __caseInsensitiveEnumValuesAllowed__(boolean caseInsensitiveEnumValuesAllowed)</span>



**Since:**

3.4

**See Also:**


setCaseInsensitiveEnumValuesAllowed



---

### trimQuotes

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __trimQuotes__(boolean trimQuotes)</span>



**Since:**

3.7

**See Also:**


setTrimQuotes



---

### splitQuotedStrings

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __splitQuotedStrings__(boolean splitQuotedStrings)</span>



**Since:**

3.7

**See Also:**


setSplitQuotedStrings



---

### unmatchedOptionsAllowedAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __unmatchedOptionsAllowedAsOptionParameters__(boolean unmatchedOptionsAllowedAsOptionParameters)</span>



**Since:**

4.4

**See Also:**


setUnmatchedOptionsAllowedAsOptionParameters



---

### unmatchedOptionsArePositionalParams

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __unmatchedOptionsArePositionalParams__(boolean unmatchedOptionsArePositionalParams)</span>



**See Also:**


setUnmatchedOptionsArePositionalParams



---

### allowSubcommandsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __allowSubcommandsAsOptionParameters__(boolean allowSubcommandsAsOptionParameters)</span>



**Since:**

4.7.8-SNAPSHOT

**See Also:**


setAllowSubcommandsAsOptionParameters



---

### allowOptionsAsOptionParameters

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __allowOptionsAsOptionParameters__(boolean allowOptionsAsOptionParameters)</span>



**Since:**

4.7.8-SNAPSHOT

**See Also:**


setAllowOptionsAsOptionParameters



---

### collectErrors

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __collectErrors__(boolean collectErrors)</span>

Sets whether exceptions during parsing should be collected instead of thrown.Multiple errors may be encountered during parsing. These can be obtained from ParseResult#errors().

**Since:**

3.2


---

### aritySatisfiedByAttachedOptionParam

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __aritySatisfiedByAttachedOptionParam__(boolean newValue)</span>

Returns true if options with attached arguments should not consume subsequent arguments and should not validate arity.The default is `false`.


---

### limitSplit

<span style="font-family: monospace; font-size: 80%;">public [ParserSpec](../../../../../../io/github/qishr/cascara/common/util/CommandLine.Model.ParserSpec.md) __limitSplit__(boolean limitSplit)</span>

Sets whether arguments should be split first before any further processing.If true, the original argument will only be split into as many parts as allowed by max arity.


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

