Package [io.github.qishr.cascara.common.util](index.md)

# Class TextTable
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Help.TextTable<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Help](CommandLine.Help.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __TextTable__</span>



Responsible for spacing out [Text](CommandLine.Help.Ansi.Text.md) values according to the [Column](CommandLine.Help.Column.md) definitions the table was
created with.Columns have a width, indentation, and an overflow policy that decides what to do if a value is
longer than the column's width.


## Nested Class Summary

| Modifier and Type | Class                                                                                                     | Description                                            |
|-------------------|-----------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.util.CommandLine.Help.TextTable.Cell](CommandLine.Help.TextTable.Cell.md) | Helper class to index positions in a `Help.TextTable`. |



## Field Summary

| Modifier and Type          | Field                                     | Description                                                     |
|----------------------------|-------------------------------------------|-----------------------------------------------------------------|
| protected final List<Text> | [columnValues](#columnvalues)             | The `char[]` slots of the `TextTable` to copy text values into. |
| public int                 | [indentWrappedLines](#indentwrappedlines) | By default, indent wrapped lines by 2 spaces.                   |



## Constructor Summary

| Constructor                                                                                                           | Description |
|-----------------------------------------------------------------------------------------------------------------------|-------------|
| TextTable([Ansi](CommandLine.Help.Ansi.md) ansi, [Column](CommandLine.Help.Column.md)[] columns)                      |             |
| TextTable([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [Column](CommandLine.Help.Column.md)[] columns) |             |



## Method Summary

| Modifier and Type                                                                                                 | Method                                                                                                                                              | Description                                                                                                                                                                                                                                                                                                                                                                                                                 |
|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public static [TextTable](CommandLine.Help.TextTable.md)                                                          | [forDefaultColumns](#fordefaultcolumns)([Ansi](CommandLine.Help.Ansi.md) ansi, int usageHelpWidth)                                                  | Constructs a TextTable with five columns as follows:    required option/parameter marker (width: 2, indent: 0, TRUNCATE on overflow)  short option name (width: 2, indent: 0, TRUNCATE on overflow)  comma separator (width: 1, indent: 0, TRUNCATE on overflow)  long option name(s) (width: 24, indent: 1, SPAN multiple columns on overflow)  description line(s) (width: 51, indent: 1, WRAP to next row on overflow)   |
| public static [TextTable](CommandLine.Help.TextTable.md)                                                          | [forDefaultColumns](#fordefaultcolumns)([Ansi](CommandLine.Help.Ansi.md) ansi, int longOptionsColumnWidth, int usageHelpWidth)                      | Constructs a TextTable with five columns as follows:    required option/parameter marker (width: 2, indent: 0, TRUNCATE on overflow)  short option name (width: 2, indent: 0, TRUNCATE on overflow)  comma separator (width: 1, indent: 0, TRUNCATE on overflow)  long option name(s) (width: 24, indent: 1, SPAN multiple columns on overflow)  description line(s) (width: 51, indent: 1, WRAP to next row on overflow)   |
| public static [TextTable](CommandLine.Help.TextTable.md)                                                          | [forDefaultColumns](#fordefaultcolumns)([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, int longOptionsColumnWidth, int usageHelpWidth) | Constructs a TextTable with five columns as follows:    required option/parameter marker (width: 2, indent: 0, TRUNCATE on overflow)  short option name (width: 2, indent: 0, TRUNCATE on overflow)  comma separator (width: 1, indent: 0, TRUNCATE on overflow)  long option name(s) (width: 24, indent: 1, SPAN multiple columns on overflow)  description line(s) (width: 51, indent: 1, WRAP to next row on overflow)   |
| public static [TextTable](CommandLine.Help.TextTable.md)                                                          | [forColumnWidths](#forcolumnwidths)([Ansi](CommandLine.Help.Ansi.md) ansi, int[] columnWidths)                                                      | Constructs a new TextTable with columns with the specified width, all SPANning  multiple columns on  overflow except the last column which WRAPS to the next row.                                                                                                                                                                                                                                                           |
| public static [TextTable](CommandLine.Help.TextTable.md)                                                          | [forColumnWidths](#forcolumnwidths)([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, int[] columnWidths)                                 | Constructs a new TextTable with columns with the specified width, all SPANning  multiple columns on  overflow except the last column which WRAPS to the next row.                                                                                                                                                                                                                                                           |
| public static [TextTable](CommandLine.Help.TextTable.md)                                                          | [forColumns](#forcolumns)([Ansi](CommandLine.Help.Ansi.md) ansi, [Column](CommandLine.Help.Column.md)[] columns)                                    | Constructs a `TextTable` with the specified columns.                                                                                                                                                                                                                                                                                                                                                                        |
| public static [TextTable](CommandLine.Help.TextTable.md)                                                          | [forColumns](#forcolumns)([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [Column](CommandLine.Help.Column.md)[] columns)               | Constructs a `TextTable` with the specified columns.                                                                                                                                                                                                                                                                                                                                                                        |
| public boolean                                                                                                    | [isAdjustLineBreaksForWideCJKCharacters](#isadjustlinebreaksforwidecjkcharacters)()                                                                 |                                                                                                                                                                                                                                                                                                                                                                                                                             |
| public [TextTable](CommandLine.Help.TextTable.md)                                                                 | [setAdjustLineBreaksForWideCJKCharacters](#setadjustlinebreaksforwidecjkcharacters)(boolean adjustLineBreaksForWideCJKCharacters)                   |                                                                                                                                                                                                                                                                                                                                                                                                                             |
| public [Column](CommandLine.Help.Column.md)[]                                                                     | [columns](#columns)()                                                                                                                               | The column definitions of this table.                                                                                                                                                                                                                                                                                                                                                                                       |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                      | [textAt](#textat)(int row, int col)                                                                                                                 | Returns the `Text` slot at the specified row and column to write a text value into.                                                                                                                                                                                                                                                                                                                                         |
| public [Text](CommandLine.Help.Ansi.Text.md)                                                                      | [cellAt](#cellat)(int row, int col)                                                                                                                 | Returns the `Text` slot at the specified row and column to write a text value into.                                                                                                                                                                                                                                                                                                                                         |
| public int                                                                                                        | [rowCount](#rowcount)()                                                                                                                             | Returns the current number of rows of this `TextTable`.                                                                                                                                                                                                                                                                                                                                                                     |
| public void                                                                                                       | [addEmptyRow](#addemptyrow)()                                                                                                                       | Adds the required `char[]` slots for a new row to the #columnValues field.                                                                                                                                                                                                                                                                                                                                                  |
| public void                                                                                                       | [addRowValues](#addrowvalues)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values)                | Delegates to [addRowValues.addRowValues](#addrowvalues), after ensuring  that multi-line values are layed out in the correct row and column.                                                                                                                                                                                                                                                                                |
| public void                                                                                                       | [addRowValues](#addrowvalues)([Text](CommandLine.Help.Ansi.Text.md)[] values)                                                                       | Adds a new [TextTable.addEmptyRow](#addemptyrow), then calls [TextTable.putValue](#putvalue) for each of the specified values, adding more empty rows if the return value indicates that the value spanned multiple columns or was wrapped to multiple rows.                                                                                                                                                                |
| public [Cell](CommandLine.Help.TextTable.Cell.md)                                                                 | [putValue](#putvalue)(int row, int col, [Text](CommandLine.Help.Ansi.Text.md) value)                                                                | Writes the specified value into the cell at the specified row and column and returns the last row and column written to.                                                                                                                                                                                                                                                                                                    |
| public [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) | [toString](#tostring)([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) text)              | Copies the text representation that we built up from the options into the specified StringBuilder.                                                                                                                                                                                                                                                                                                                          |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)               | [toString](#tostring)()                                                                                                                             |                                                                                                                                                                                                                                                                                                                                                                                                                             |



## Field Details

### columnValues

<span style="font-family: monospace; font-size: 80%;">protected final List<Text> __columnValues__</span>

The `char[]` slots of the `TextTable` to copy text values into.


---

### indentWrappedLines

<span style="font-family: monospace; font-size: 80%;">public int __indentWrappedLines__</span>

By default, indent wrapped lines by 2 spaces.


---


## Method Details

### forDefaultColumns

<span style="font-family: monospace; font-size: 80%;">public static [TextTable](CommandLine.Help.TextTable.md) __forDefaultColumns__([Ansi](CommandLine.Help.Ansi.md) ansi, int usageHelpWidth)</span>

Constructs a TextTable with five columns as follows:
 
 required option/parameter marker (width: 2, indent: 0, TRUNCATE on overflow)
 short option name (width: 2, indent: 0, TRUNCATE on overflow)
 comma separator (width: 1, indent: 0, TRUNCATE on overflow)
 long option name(s) (width: 24, indent: 1, SPAN multiple columns on overflow)
 description line(s) (width: 51, indent: 1, WRAP to next row on overflow)
 



!!! note "Deprecation"
    use [forDefaultColumns.forDefaultColumns](#fordefaultcolumns) instead

**Parameters:**

`ansi` - whether to emit ANSI escape codes or not

`usageHelpWidth` - the total width of the columns combined


---

### forDefaultColumns

<span style="font-family: monospace; font-size: 80%;">public static [TextTable](CommandLine.Help.TextTable.md) __forDefaultColumns__([Ansi](CommandLine.Help.Ansi.md) ansi, int longOptionsColumnWidth, int usageHelpWidth)</span>

Constructs a TextTable with five columns as follows:
 
 required option/parameter marker (width: 2, indent: 0, TRUNCATE on overflow)
 short option name (width: 2, indent: 0, TRUNCATE on overflow)
 comma separator (width: 1, indent: 0, TRUNCATE on overflow)
 long option name(s) (width: 24, indent: 1, SPAN multiple columns on overflow)
 description line(s) (width: 51, indent: 1, WRAP to next row on overflow)
 



!!! note "Deprecation"
    use [forDefaultColumns.forDefaultColumns](#fordefaultcolumns) instead

**Parameters:**

`ansi` - whether to emit ANSI escape codes or not

`longOptionsColumnWidth` - the width of the long options column

`usageHelpWidth` - the total width of the columns combined


---

### forDefaultColumns

<span style="font-family: monospace; font-size: 80%;">public static [TextTable](CommandLine.Help.TextTable.md) __forDefaultColumns__([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, int longOptionsColumnWidth, int usageHelpWidth)</span>

Constructs a TextTable with five columns as follows:
 
 required option/parameter marker (width: 2, indent: 0, TRUNCATE on overflow)
 short option name (width: 2, indent: 0, TRUNCATE on overflow)
 comma separator (width: 1, indent: 0, TRUNCATE on overflow)
 long option name(s) (width: 24, indent: 1, SPAN multiple columns on overflow)
 description line(s) (width: 51, indent: 1, WRAP to next row on overflow)
 

**Parameters:**

`colorScheme` - the styles and ANSI mode to use for embedded markup

`longOptionsColumnWidth` - the width of the long options column

`usageHelpWidth` - the total width of the columns combined

**Since:**

4.2


---

### forColumnWidths

<span style="font-family: monospace; font-size: 80%;">public static [TextTable](CommandLine.Help.TextTable.md) __forColumnWidths__([Ansi](CommandLine.Help.Ansi.md) ansi, int[] columnWidths)</span>

Constructs a new TextTable with columns with the specified width, all SPANning  multiple columns on
 overflow except the last column which WRAPS to the next row.



!!! note "Deprecation"
    use [forColumns.forColumns](#forcolumns) instead

**Parameters:**

`ansi` - whether to emit ANSI escape codes or not

`columnWidths` - the width of each table column (all columns have zero indent)


---

### forColumnWidths

<span style="font-family: monospace; font-size: 80%;">public static [TextTable](CommandLine.Help.TextTable.md) __forColumnWidths__([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, int[] columnWidths)</span>

Constructs a new TextTable with columns with the specified width, all SPANning  multiple columns on
 overflow except the last column which WRAPS to the next row.

**Parameters:**

`colorScheme` - the styles and ANSI mode to use for embedded markup

`columnWidths` - the width of each table column (all columns have zero indent)

**Since:**

4.2


---

### forColumns

<span style="font-family: monospace; font-size: 80%;">public static [TextTable](CommandLine.Help.TextTable.md) __forColumns__([Ansi](CommandLine.Help.Ansi.md) ansi, [Column](CommandLine.Help.Column.md)[] columns)</span>

Constructs a `TextTable` with the specified columns.



!!! note "Deprecation"
    use [forColumns.forColumns](#forcolumns) instead

**Parameters:**

`ansi` - whether to emit ANSI escape codes or not

`columns` - columns to construct this TextTable with


---

### forColumns

<span style="font-family: monospace; font-size: 80%;">public static [TextTable](CommandLine.Help.TextTable.md) __forColumns__([ColorScheme](CommandLine.Help.ColorScheme.md) colorScheme, [Column](CommandLine.Help.Column.md)[] columns)</span>

Constructs a `TextTable` with the specified columns.

**Parameters:**

`colorScheme` - the styles and ANSI mode to use for embedded markup

`columns` - columns to construct this TextTable with

**Since:**

4.2


---

### isAdjustLineBreaksForWideCJKCharacters

<span style="font-family: monospace; font-size: 80%;">public boolean __isAdjustLineBreaksForWideCJKCharacters__()</span>



**Since:**

4.0

**See Also:**


[adjustLineBreaksForWideCJKCharacters](null.md)



---

### setAdjustLineBreaksForWideCJKCharacters

<span style="font-family: monospace; font-size: 80%;">public [TextTable](CommandLine.Help.TextTable.md) __setAdjustLineBreaksForWideCJKCharacters__(boolean adjustLineBreaksForWideCJKCharacters)</span>



**Since:**

4.0

**See Also:**


[adjustLineBreaksForWideCJKCharacters](null.md)



---

### columns

<span style="font-family: monospace; font-size: 80%;">public [Column](CommandLine.Help.Column.md)[] __columns__()</span>

The column definitions of this table.


---

### textAt

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __textAt__(int row, int col)</span>

Returns the `Text` slot at the specified row and column to write a text value into.

**Parameters:**

`row` - the row of the cell whose Text to return

`col` - the column of the cell whose Text to return

**Returns:**

the Text object at the specified row and column

**Since:**

2.0


---

### cellAt

<span style="font-family: monospace; font-size: 80%;">public [Text](CommandLine.Help.Ansi.Text.md) __cellAt__(int row, int col)</span>

Returns the `Text` slot at the specified row and column to write a text value into.



!!! note "Deprecation"
    use [textAt.textAt](#textat) instead

**Parameters:**

`row` - the row of the cell whose Text to return

`col` - the column of the cell whose Text to return

**Returns:**

the Text object at the specified row and column


---

### rowCount

<span style="font-family: monospace; font-size: 80%;">public int __rowCount__()</span>

Returns the current number of rows of this `TextTable`.

**Returns:**

the current number of rows in this TextTable


---

### addEmptyRow

<span style="font-family: monospace; font-size: 80%;">public void __addEmptyRow__()</span>

Adds the required `char[]` slots for a new row to the #columnValues field.


---

### addRowValues

<span style="font-family: monospace; font-size: 80%;">public void __addRowValues__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values)</span>

Delegates to [addRowValues.addRowValues](#addrowvalues), after ensuring
 that multi-line values are layed out in the correct row and column.

**Parameters:**

`values` - the text values to display in each column of the current row


---

### addRowValues

<span style="font-family: monospace; font-size: 80%;">public void __addRowValues__([Text](CommandLine.Help.Ansi.Text.md)[] values)</span>

Adds a new [TextTable.addEmptyRow](#addemptyrow), then calls [TextTable.putValue](#putvalue) for each of the specified values, adding more empty rows
if the return value indicates that the value spanned multiple columns or was wrapped to multiple rows.

**Parameters:**

`values` - the values to write into a new row in this TextTable


---

### putValue

<span style="font-family: monospace; font-size: 80%;">public [Cell](CommandLine.Help.TextTable.Cell.md) __putValue__(int row, int col, [Text](CommandLine.Help.Ansi.Text.md) value)</span>

Writes the specified value into the cell at the specified row and column and returns the last row and
column written to.Depending on the Column's Column#overflow policy, the value may span
multiple columns or wrap to multiple rows when larger than the column width.

**Parameters:**

`row` - the target row in the table

`col` - the target column in the table to write to

`value` - the value to write

**Returns:**

a Cell indicating the position in the table that was last written to (since 2.0)

**Since:**

2.0 (previous versions returned a `java.awt.Point` object)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) __toString__([StringBuilder](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/StringBuilder.html) text)</span>

Copies the text representation that we built up from the options into the specified StringBuilder.

**Parameters:**

`text` - the StringBuilder to write into

**Returns:**

the specified StringBuilder object (to allow method chaining and a more fluid API)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>




---

