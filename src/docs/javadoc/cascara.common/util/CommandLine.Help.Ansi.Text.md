Package [io.github.qishr.cascara.common.util](index.md)

# Class Text
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.Ansi.Text<br/>
<br/>
All Implemented Interfaces:<br/>
    [Cloneable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Cloneable.html)


----

<span style="font-family: monospace; font-size: 80%;">public class __Text__</span>

Encapsulates rich text with styles and colors.Text objects may be constructed with Strings containing
 markup like `@|bg(red),white,underline some text|@`, and this class converts the markup to ANSI
 escape codes.
 


 Internally keeps both an enriched and a plain text representation to allow layout components to calculate
 text width while remaining unaware of the embedded ANSI escape codes.


## Constructor Summary

| Constructor                                                                                                                                                          | Description                                                                                                         |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| Text(int maxLength)                                                                                                                                                  | Constructs a Text with the specified max length (for use in a TextTable Column).                                    |
| Text(int maxLength, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme)                                                                                      | Constructs a Text with the specified max length (for use in a TextTable Column).                                    |
| Text([Text](CommandLine.Help.Ansi.Text.md) other)                                                                                                                    | Copy constructor.                                                                                                   |
| Text([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) input)                                                             | Constructs a Text with the specified String, which may contain markup like `@|bg(red),white,underline some text|@`. |
| Text([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) input, [ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme) | Constructs a Text with the specified String (which may contain markup), and ColorScheme.                            |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description                                                                                                                                           |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) | [clone](#clone)()                                                                                                      |                                                                                                                                                       |
| public [Text](CommandLine.Help.Ansi.Text.md)[]                                                      | [splitLines](#splitlines)()                                                                                            |                                                                                                                                                       |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [substring](#substring)(int start)                                                                                     | Returns a new `Text` instance that is a substring of this Text.                                                                                       |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [substring](#substring)(int start, int end)                                                                            | Returns a new `Text` instance that is a substring of this Text.                                                                                       |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [append](#append)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string) |                                                                                                                                                       |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [append](#append)([Text](CommandLine.Help.Ansi.Text.md) text)                                                          |                                                                                                                                                       |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [concat](#concat)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string) | Returns a copy of this `Text` instance with the specified text concatenated to the end.                                                               |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                        | [concat](#concat)([Text](CommandLine.Help.Ansi.Text.md) other)                                                         | Returns a copy of this `Text` instance with the specified text concatenated to the end.                                                               |
| public void                                                                                         | [getStyledChars](#getstyledchars)(int from, int length, [Text](CommandLine.Help.Ansi.Text.md) destination, int offset) | Copies the specified substring of this Text into the specified destination, preserving the markup.                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [plainString](#plainstring)()                                                                                          | Returns the plain text without any formatting.                                                                                                        |
| public boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)    |                                                                                                                                                       |
| public int                                                                                          | [hashCode](#hashcode)()                                                                                                |                                                                                                                                                       |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                | Returns a String representation of the text with ANSI escape codes embedded, unless ANSI is   not enabled}, in which case the plain text is returned. |
| public int                                                                                          | [getCJKAdjustedLength](#getcjkadjustedlength)()                                                                        | Returns the number of columns this Text will occupy on the console, adjusted for wide CJK characters.                                                 |
| public int                                                                                          | [getCJKAdjustedLength](#getcjkadjustedlength)(int fromPosition, int charCount)                                         | Returns the number of columns that the specified portion of this Text will occupy on the console, adjusted for wide CJK characters.                   |



## Method Details

### clone

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) __clone__()</span>




---

### splitLines

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md)[] __splitLines__()</span>




---

### substring

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __substring__(int start)</span>

Returns a new `Text` instance that is a substring of this Text.Does not modify this instance!

**Parameters:**

`start` - index in the plain text where to start the substring

**Returns:**

a new Text instance that is a substring of this Text


---

### substring

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __substring__(int start, int end)</span>

Returns a new `Text` instance that is a substring of this Text.Does not modify this instance!

**Parameters:**

`start` - index in the plain text where to start the substring

`end` - index in the plain text where to end the substring

**Returns:**

a new Text instance that is a substring of this Text


---

### append

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __append__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)</span>





!!! note "Deprecation"
    use [concat.concat](#concat) instead


---

### append

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __append__([Text](CommandLine.Help.Ansi.Text.md) text)</span>





!!! note "Deprecation"
    use [concat.concat](#concat) instead


---

### concat

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __concat__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)</span>

Returns a copy of this `Text` instance with the specified text concatenated to the end.Does not modify this instance!

**Parameters:**

`string` - the text to concatenate to the end of this Text

**Returns:**

a new Text instance

**Since:**

3.0


---

### concat

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __concat__([Text](CommandLine.Help.Ansi.Text.md) other)</span>

Returns a copy of this `Text` instance with the specified text concatenated to the end.Does not modify this instance!

**Parameters:**

`other` - the text to concatenate to the end of this Text

**Returns:**

a new Text instance

**Since:**

3.0


---

### getStyledChars

<span style="font-family: monospace; font-size: 80%;">public void __getStyledChars__(int from, int length, [Text](CommandLine.Help.Ansi.Text.md) destination, int offset)</span>

Copies the specified substring of this Text into the specified destination, preserving the markup.

**Parameters:**

`from` - start of the substring

`length` - length of the substring

`destination` - destination Text to modify

`offset` - indentation (padding)


---

### plainString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __plainString__()</span>

Returns the plain text without any formatting.

**Returns:**

the plain text without any formatting


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) obj)</span>




---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns a String representation of the text with ANSI escape codes embedded, unless ANSI is
  not enabled}, in which case the plain text is returned.

**Returns:**

a String representation of the text with ANSI escape codes embedded (if enabled)


---

### getCJKAdjustedLength

<span style="font-family: monospace; font-size: 80%;">public int __getCJKAdjustedLength__()</span>

Returns the number of columns this Text will occupy on the console, adjusted for wide CJK characters.

**Returns:**

the number of columns this Text will occupy on the console, adjusted for wide CJK characters

**Since:**

4.0


---

### getCJKAdjustedLength

<span style="font-family: monospace; font-size: 80%;">public int __getCJKAdjustedLength__(int fromPosition, int charCount)</span>

Returns the number of columns that the specified portion of this Text will occupy on the console, adjusted for wide CJK characters.

**Parameters:**

`fromPosition` - the position to start counting

`charCount` - the number of characters in this Text to consider

**Returns:**

the number of columns that the specified portion of this Text will occupy on the console, adjusted for wide CJK characters

**Since:**

4.0


---

