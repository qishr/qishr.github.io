# CT Language Reference

## Overview

A CT source file consists of a list of statements. Every statement ends with a semicolon. Comments can be included in the source by prefixing the comment text with `//`.

### Declaring variables

A variable declaration statement begins with the variable's [type](types.md) followed by the variable's name, and then an optional assignment.

Variable names must start with either an alphabetic character or an underscore, and can contain:

- alphabetic characters
- numbers
- underscores
- dashes

Example variable declaration:
```
Color green = #00FF00;
```

### Assigning Values to Variables

Values can be assigned to variables using the assignment operator (`=`). The value being assigned can be one of:

- A hex color value
- A String
- Another variable
- A collection
- A member of a collection
- A method call

Example of assigning a value to a variable:

```
green = rgba(0,255,0,1);
```

