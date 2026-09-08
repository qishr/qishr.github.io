Package [io.github.qishr.cascara.common.util](index.md)

# Enum Style
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.common.util.CommandLine.Help.Ansi.Style](CommandLine.Help.Ansi.Style.md)><br/>
                io.github.qishr.cascara.common.util.CommandLine.Help.Ansi.Style<br/>
<br/>
All Implemented Interfaces:<br/>
    [IStyle](CommandLine.Help.Ansi.IStyle.md)


----

<span style="font-family: monospace; font-size: 80%;">public static final enum __Style__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[Style](CommandLine.Help.Ansi.Style.md)>
</span>

A set of pre-defined ANSI escape code styles and colors, and a set of convenience methods for parsing
text with embedded markup style names, as well as convenience methods for converting
styles to strings with embedded escape codes.


##Enum Constants

| Enum Constant             | Description |
|---------------------------|-------------|
| [reset](#reset)           |             |
| [bold](#bold)             |             |
| [faint](#faint)           |             |
| [italic](#italic)         |             |
| [underline](#underline)   |             |
| [blink](#blink)           |             |
| [reverse](#reverse)       |             |
| [fg_black](#fg_black)     |             |
| [fg_red](#fg_red)         |             |
| [fg_green](#fg_green)     |             |
| [fg_yellow](#fg_yellow)   |             |
| [fg_blue](#fg_blue)       |             |
| [fg_magenta](#fg_magenta) |             |
| [fg_cyan](#fg_cyan)       |             |
| [fg_white](#fg_white)     |             |
| [bg_black](#bg_black)     |             |
| [bg_red](#bg_red)         |             |
| [bg_green](#bg_green)     |             |
| [bg_yellow](#bg_yellow)   |             |
| [bg_blue](#bg_blue)       |             |
| [bg_magenta](#bg_magenta) |             |
| [bg_cyan](#bg_cyan)       |             |
| [bg_white](#bg_white)     |             |



## Method Summary

| Modifier and Type                                                                                          | Method                                                                                                                            | Description                                                                                             |
|------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| public static [Style](CommandLine.Help.Ansi.Style.md)[]                                                    | [values](#values)()                                                                                                               |                                                                                                         |
| public static [Style](CommandLine.Help.Ansi.Style.md)                                                      | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)            |                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [on](#on)()                                                                                                                       |                                                                                                         |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)        | [off](#off)()                                                                                                                     |                                                                                                         |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [on](#on)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                     | Returns the concatenated ANSI escape codes for turning all specified styles on.                         |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [off](#off)([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)                                                                   | Returns the concatenated ANSI escape codes for turning all specified styles off.                        |
| public static [IStyle](CommandLine.Help.Ansi.IStyle.md)                                                    | [fg](#fg)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) str)                       | Parses the specified style markup and returns the associated style.                                     |
| public static [IStyle](CommandLine.Help.Ansi.IStyle.md)                                                    | [bg](#bg)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) str)                       | Parses the specified style markup and returns the associated style.                                     |
| public static [IStyle](CommandLine.Help.Ansi.IStyle.md)[]                                                  | [parse](#parse)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commaSeparatedCodes) | Parses the specified comma-separated sequence of style descriptors and returns the associated   styles. |



## Enum Constant Details

### reset

public static final  reset




---

### bold

public static final  bold




---

### faint

public static final  faint




---

### italic

public static final  italic




---

### underline

public static final  underline




---

### blink

public static final  blink




---

### reverse

public static final  reverse




---

### fg_black

public static final  fg_black




---

### fg_red

public static final  fg_red




---

### fg_green

public static final  fg_green




---

### fg_yellow

public static final  fg_yellow




---

### fg_blue

public static final  fg_blue




---

### fg_magenta

public static final  fg_magenta




---

### fg_cyan

public static final  fg_cyan




---

### fg_white

public static final  fg_white




---

### bg_black

public static final  bg_black




---

### bg_red

public static final  bg_red




---

### bg_green

public static final  bg_green




---

### bg_yellow

public static final  bg_yellow




---

### bg_blue

public static final  bg_blue




---

### bg_magenta

public static final  bg_magenta




---

### bg_cyan

public static final  bg_cyan




---

### bg_white

public static final  bg_white




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [Style](CommandLine.Help.Ansi.Style.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [Style](CommandLine.Help.Ansi.Style.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### on

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __on__()</span>



**Specified By:**

[IStyle](CommandLine.Help.Ansi.IStyle.md)


---

### off

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __off__()</span>



**Specified By:**

[IStyle](CommandLine.Help.Ansi.IStyle.md)


---

### on

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __on__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Returns the concatenated ANSI escape codes for turning all specified styles on.

**Parameters:**

`styles` - the styles to generate ANSI escape codes for

**Returns:**

the concatenated ANSI escape codes for turning all specified styles on


---

### off

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __off__([IStyle](CommandLine.Help.Ansi.IStyle.md)[] styles)</span>

Returns the concatenated ANSI escape codes for turning all specified styles off.

**Parameters:**

`styles` - the styles to generate ANSI escape codes for

**Returns:**

the concatenated ANSI escape codes for turning all specified styles off


---

### fg

<span style="font-family: monospace; font-size: 80%;">public static [IStyle](CommandLine.Help.Ansi.IStyle.md) __fg__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) str)</span>

Parses the specified style markup and returns the associated style.The markup may be one of the Style enum value names, or it may be one of the Style enum value
  names when `"fg_"` is prepended, or it may be one of the indexed colors in the 256 color palette.

**Parameters:**

`str` - the case-insensitive style markup to convert, e.g. `"blue"` or `"fg_blue"`,
          or `"46"` (indexed color) or `"0;5;0"` (RGB components of an indexed color)

**Returns:**

the IStyle for the specified converter


---

### bg

<span style="font-family: monospace; font-size: 80%;">public static [IStyle](CommandLine.Help.Ansi.IStyle.md) __bg__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) str)</span>

Parses the specified style markup and returns the associated style.The markup may be one of the Style enum value names, or it may be one of the Style enum value
  names when `"bg_"` is prepended, or it may be one of the indexed colors in the 256 color palette.

**Parameters:**

`str` - the case-insensitive style markup to convert, e.g. `"blue"` or `"bg_blue"`,
          or `"46"` (indexed color) or `"0;5;0"` (RGB components of an indexed color)

**Returns:**

the IStyle for the specified converter


---

### parse

<span style="font-family: monospace; font-size: 80%;">public static [IStyle](CommandLine.Help.Ansi.IStyle.md)[] __parse__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) commaSeparatedCodes)</span>

Parses the specified comma-separated sequence of style descriptors and returns the associated
  styles.For each markup, strings starting with `"bg("` are delegated to
  [bg.bg](#bg), others are delegated to [fg.fg](#fg).

**Parameters:**

`commaSeparatedCodes` - one or more descriptors, e.g. `"bg(blue),underline,red"`

**Returns:**

an array with all styles for the specified descriptors


---

