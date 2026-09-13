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

- A [literal value](#literal-values)
- A [method call](#method-calls)
- A member of a collection
- Another variable

Example of assigning a value to a variable:

```
green = rgba(0,255,0,1);
```

### Literal Values

#### Literal RGBA hex colors

Example:
```
#00FF00
```

#### Literal strings

String literals are any text enclosed in double quotes.
A double quote character can be included in a string by escaping it with a backslash.

Example:
```
"a string"
```

#### Literal collections

Collections start with `{` and end with `}`.

Example:
```
{
    name = "value";
    color = #00FF00;
}
```

#### Literal templates

Templates start with `{{{` and end with `}}}`

Example:
```
{{{
"name": %value%
}}}
```

### Method Calls

The return value of static methods defined in Java classes can be assigned to a variable.
The method must be [imported](keywords.md#import) before it can be called.

Example:

```
rgba(0,255,0,1)
```