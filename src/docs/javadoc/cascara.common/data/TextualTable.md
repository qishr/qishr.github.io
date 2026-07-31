Package [io.github.qishr.cascara.common.data](index.md)

# Class TextualTable
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.data.TextualTable<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __TextualTable__</span>

A utility class for creating text-based tables.This class allows adding columns with headings and rows with data.
It automatically calculates column widths to align the table content.


## Constructor Summary

| Constructor    | Description                |
|----------------|----------------------------|
| TextualTable() | Constructs an empty Table. |



## Method Summary

| Modifier and Type                      | Method                                                                                                                           | Description                                                                  |
|----------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| public void                            | [setShowHeaders](#setshowheaders)(boolean v)                                                                                     |                                                                              |
| public void                            | [setStyle](#setstyle)([Style](TextualTable.Style.md) style)                                                                      |                                                                              |
| public [TextualTable](TextualTable.md) | [addColumn](#addcolumn)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) heading)    | Adds a column with the specified heading to the table.                       |
| public [TextualTable](TextualTable.md) | [addRow](#addrow)([TabularData](TabularData.md) row)                                                                             |                                                                              |
| public [TextualTable](TextualTable.md) | [addRow](#addrow)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] valueStrings)   | Adds a row of data to the table.                                             |
| public void                            | [render](#render)([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer)             | Renders the table as text without any indentation.                           |
| public void                            | [render](#render)([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer, int indent) | Renders the table as text with a given indentation level (number of spaces). |



## Method Details

### setShowHeaders

<span style="font-family: monospace; font-size: 80%;">public void __setShowHeaders__(boolean v)</span>




---

### setStyle

<span style="font-family: monospace; font-size: 80%;">public void __setStyle__([Style](TextualTable.Style.md) style)</span>




---

### addColumn

<span style="font-family: monospace; font-size: 80%;">public [TextualTable](TextualTable.md) __addColumn__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) heading)</span>

Adds a column with the specified heading to the table.

**Parameters:**

`heading` - String to be used as the column heading.

**Returns:**

The table (this) to allow method chaining.


---

### addRow

<span style="font-family: monospace; font-size: 80%;">public [TextualTable](TextualTable.md) __addRow__([TabularData](TabularData.md) row)</span>




---

### addRow

<span style="font-family: monospace; font-size: 80%;">public [TextualTable](TextualTable.md) __addRow__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] valueStrings)</span>

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


---

### render

<span style="font-family: monospace; font-size: 80%;">public void __render__([Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html) writer, int indent)</span>

Renders the table as text with a given indentation level (number of spaces).

**Parameters:**

`writer` - The Writer to output text to.

`indent` - The number of spaces to indent each line.


---

