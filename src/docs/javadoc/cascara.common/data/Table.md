Package [io.github.qishr.cascara.common.data](index.md)

# Class Table
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.data.Table<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Table__</span>

A utility class for creating tables .This class allows adding columns with headings and rows with data.
It automatically calculates column widths to align the table content.


## Constructor Summary

| Constructor | Description                |
|-------------|----------------------------|
| Table()     | Constructs an empty Table. |



## Method Summary

| Modifier and Type        | Method                                                                                                                           | Description                                                                  |
|--------------------------|----------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| public void              | [setShowBorder](#setshowborder)(boolean v)                                                                                       |                                                                              |
| public void              | [setShowHeaders](#setshowheaders)(boolean v)                                                                                     |                                                                              |
| public [Table](Table.md) | [addColumn](#addcolumn)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) heading)    | Adds a column with the specified heading to the table.                       |
| public [Table](Table.md) | [addRow](#addrow)([TableData](TableData.md) row)                                                                                 |                                                                              |
| public [Table](Table.md) | [addRow](#addrow)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] valueStrings)   | Adds a row of data to the table.                                             |
| public void              | [render](#render)([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)             | Renders the table as text without any indentation.                           |
| public void              | [render](#render)([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer, int indent) | Renders the table as text with a given indentation level (number of spaces). |



## Method Details

### setShowBorder

<span style="font-family: monospace; font-size: 80%;">public void __setShowBorder__(boolean v)</span>




---

### setShowHeaders

<span style="font-family: monospace; font-size: 80%;">public void __setShowHeaders__(boolean v)</span>




---

### addColumn

<span style="font-family: monospace; font-size: 80%;">public [Table](Table.md) __addColumn__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) heading)</span>

Adds a column with the specified heading to the table.

**Parameters:**

`heading` - String to be used as the column heading.

**Returns:**

The table (this) to allow method chaining.


---

### addRow

<span style="font-family: monospace; font-size: 80%;">public [Table](Table.md) __addRow__([TableData](TableData.md) row)</span>




---

### addRow

<span style="font-family: monospace; font-size: 80%;">public [Table](Table.md) __addRow__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] valueStrings)</span>

Adds a row of data to the table.The number of values should match or be less than the number of columns.

**Parameters:**

`valueStrings` - One or more strings representing the data for this row.

**Returns:**

The table (this) to allow method chaining.


---

### render

<span style="font-family: monospace; font-size: 80%;">public void __render__([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)</span>

Renders the table as text without any indentation.

**Parameters:**

`writer` - The Writer to output text to.

**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

### render

<span style="font-family: monospace; font-size: 80%;">public void __render__([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer, int indent)</span>

Renders the table as text with a given indentation level (number of spaces).

**Parameters:**

`writer` - The Writer to output text to.

`indent` - The number of spaces to indent each line.

**Throws:**

[LocalizableIOException](../diagnostic/LocalizableIOException.md)


---

