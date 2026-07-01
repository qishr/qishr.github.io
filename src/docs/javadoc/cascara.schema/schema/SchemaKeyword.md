Package [io.github.qishr.cascara.schema](index.md)

# Enum SchemaKeyword
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.schema.SchemaKeyword](SchemaKeyword.md)><br/>
                io.github.qishr.cascara.schema.SchemaKeyword<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final enum __SchemaKeyword__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[SchemaKeyword](SchemaKeyword.md)>
</span>


##Enum Constants

| Enum Constant                                     | Description |
|---------------------------------------------------|-------------|
| [ID](#id)                                         |             |
| [SCHEMA](#schema)                                 |             |
| [ANCHOR](#anchor)                                 |             |
| [DYNAMIC_REF](#dynamic_ref)                       |             |
| [DYNAMIC_ANCHOR](#dynamic_anchor)                 |             |
| [VOCABULARY](#vocabulary)                         |             |
| [DEFS](#defs)                                     |             |
| [DEFINITIONS](#definitions)                       |             |
| [REF](#ref)                                       |             |
| [ALL_OF](#all_of)                                 |             |
| [ANY_OF](#any_of)                                 |             |
| [ONE_OF](#one_of)                                 |             |
| [NOT](#not)                                       |             |
| [IF](#if)                                         |             |
| [THEN](#then)                                     |             |
| [ELSE](#else)                                     |             |
| [DEPENDENT_SCHEMAS](#dependent_schemas)           |             |
| [DEPENDENT_REQUIRED](#dependent_required)         |             |
| [PROPERTIES](#properties)                         |             |
| [PATTERN_PROPERTIES](#pattern_properties)         |             |
| [ADDITIONAL_PROPERTIES](#additional_properties)   |             |
| [UNEVALUATED_PROPERTIES](#unevaluated_properties) |             |
| [REQUIRED](#required)                             |             |
| [PROPERTY_NAMES](#property_names)                 |             |
| [MIN_PROPERTIES](#min_properties)                 |             |
| [MAX_PROPERTIES](#max_properties)                 |             |
| [ITEMS](#items)                                   |             |
| [PREFIX_ITEMS](#prefix_items)                     |             |
| [UNEVALUATED_ITEMS](#unevaluated_items)           |             |
| [CONTAINS](#contains)                             |             |
| [MIN_CONTAINS](#min_contains)                     |             |
| [MAX_CONTAINS](#max_contains)                     |             |
| [MIN_ITEMS](#min_items)                           |             |
| [MAX_ITEMS](#max_items)                           |             |
| [UNIQUE_ITEMS](#unique_items)                     |             |
| [TYPE](#type)                                     |             |
| [ENUM](#enum)                                     |             |
| [CONST](#const)                                   |             |
| [MULTIPLE_OF](#multiple_of)                       |             |
| [MAXIMUM](#maximum)                               |             |
| [EXCLUSIVE_MAXIMUM](#exclusive_maximum)           |             |
| [MINIMUM](#minimum)                               |             |
| [EXCLUSIVE_MINIMUM](#exclusive_minimum)           |             |
| [MAX_LENGTH](#max_length)                         |             |
| [MIN_LENGTH](#min_length)                         |             |
| [PATTERN](#pattern)                               |             |
| [TITLE](#title)                                   |             |
| [DESCRIPTION](#description)                       |             |
| [DEFAULT](#default)                               |             |
| [DEPRECATED](#deprecated)                         |             |
| [READ_ONLY](#read_only)                           |             |
| [WRITE_ONLY](#write_only)                         |             |
| [FORMAT](#format)                                 |             |
| [CONTENT_MEDIA_TYPE](#content_media_type)         |             |
| [CONTENT_ENCODING](#content_encoding)             |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                    | Description                          |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
| public static [SchemaKeyword](SchemaKeyword.md)[]                                                                                                                                             | [values](#values)()                                                                                                       |                                      |
| public static [SchemaKeyword](SchemaKeyword.md)                                                                                                                                               | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)    |                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [asString](#asstring)()                                                                                                   | Returns the JSON Schema keyword name |
| public [SchemaType](SchemaType.md)                                                                                                                                                            | [type](#type)()                                                                                                           |                                      |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [suggestions](#suggestions)()                                                                                             |                                      |
| public boolean                                                                                                                                                                                | [hasSuggestions](#hassuggestions)()                                                                                       |                                      |
| public static [SchemaKeyword](SchemaKeyword.md)                                                                                                                                               | [fromString](#fromstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s) |                                      |
| public static boolean                                                                                                                                                                         | [exists](#exists)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)         |                                      |
| public static [SchemaKeyword](SchemaKeyword.md)                                                                                                                                               | [get](#get)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)               |                                      |



## Enum Constant Details

### ID

public static final  ID




---

### SCHEMA

public static final  SCHEMA




---

### ANCHOR

public static final  ANCHOR




---

### DYNAMIC_REF

public static final  DYNAMIC_REF




---

### DYNAMIC_ANCHOR

public static final  DYNAMIC_ANCHOR




---

### VOCABULARY

public static final  VOCABULARY




---

### DEFS

public static final  DEFS




---

### DEFINITIONS

public static final  DEFINITIONS




---

### REF

public static final  REF




---

### ALL_OF

public static final  ALL_OF




---

### ANY_OF

public static final  ANY_OF




---

### ONE_OF

public static final  ONE_OF




---

### NOT

public static final  NOT




---

### IF

public static final  IF




---

### THEN

public static final  THEN




---

### ELSE

public static final  ELSE




---

### DEPENDENT_SCHEMAS

public static final  DEPENDENT_SCHEMAS




---

### DEPENDENT_REQUIRED

public static final  DEPENDENT_REQUIRED




---

### PROPERTIES

public static final  PROPERTIES




---

### PATTERN_PROPERTIES

public static final  PATTERN_PROPERTIES




---

### ADDITIONAL_PROPERTIES

public static final  ADDITIONAL_PROPERTIES




---

### UNEVALUATED_PROPERTIES

public static final  UNEVALUATED_PROPERTIES




---

### REQUIRED

public static final  REQUIRED




---

### PROPERTY_NAMES

public static final  PROPERTY_NAMES




---

### MIN_PROPERTIES

public static final  MIN_PROPERTIES




---

### MAX_PROPERTIES

public static final  MAX_PROPERTIES




---

### ITEMS

public static final  ITEMS




---

### PREFIX_ITEMS

public static final  PREFIX_ITEMS




---

### UNEVALUATED_ITEMS

public static final  UNEVALUATED_ITEMS




---

### CONTAINS

public static final  CONTAINS




---

### MIN_CONTAINS

public static final  MIN_CONTAINS




---

### MAX_CONTAINS

public static final  MAX_CONTAINS




---

### MIN_ITEMS

public static final  MIN_ITEMS




---

### MAX_ITEMS

public static final  MAX_ITEMS




---

### UNIQUE_ITEMS

public static final  UNIQUE_ITEMS




---

### TYPE

public static final  TYPE




---

### ENUM

public static final  ENUM




---

### CONST

public static final  CONST




---

### MULTIPLE_OF

public static final  MULTIPLE_OF




---

### MAXIMUM

public static final  MAXIMUM




---

### EXCLUSIVE_MAXIMUM

public static final  EXCLUSIVE_MAXIMUM




---

### MINIMUM

public static final  MINIMUM




---

### EXCLUSIVE_MINIMUM

public static final  EXCLUSIVE_MINIMUM




---

### MAX_LENGTH

public static final  MAX_LENGTH




---

### MIN_LENGTH

public static final  MIN_LENGTH




---

### PATTERN

public static final  PATTERN




---

### TITLE

public static final  TITLE




---

### DESCRIPTION

public static final  DESCRIPTION




---

### DEFAULT

public static final  DEFAULT




---

### DEPRECATED

public static final  DEPRECATED




---

### READ_ONLY

public static final  READ_ONLY




---

### WRITE_ONLY

public static final  WRITE_ONLY




---

### FORMAT

public static final  FORMAT




---

### CONTENT_MEDIA_TYPE

public static final  CONTENT_MEDIA_TYPE




---

### CONTENT_ENCODING

public static final  CONTENT_ENCODING




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [SchemaKeyword](SchemaKeyword.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [SchemaKeyword](SchemaKeyword.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### asString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __asString__()</span>

Returns the JSON Schema keyword name


---

### type

<span style="font-family: monospace; font-size: 80%;">public [SchemaType](SchemaType.md) __type__()</span>




---

### suggestions

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __suggestions__()</span>




---

### hasSuggestions

<span style="font-family: monospace; font-size: 80%;">public boolean __hasSuggestions__()</span>




---

### fromString

<span style="font-family: monospace; font-size: 80%;">public static [SchemaKeyword](SchemaKeyword.md) __fromString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### exists

<span style="font-family: monospace; font-size: 80%;">public static boolean __exists__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public static [SchemaKeyword](SchemaKeyword.md) __get__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

