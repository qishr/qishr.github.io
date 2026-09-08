Package [io.github.qishr.cascara.common.util](index.md)

# Class StringUtils
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.StringUtils<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __StringUtils__</span>


## Field Summary

| Modifier and Type                                                                                                | Field                                                       | Description |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|-------------|
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ELLIPSIS](#ellipsis)                                       |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FILLED_UP_POINTING_TRIANGLE](#filled_up_pointing_triangle) |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_BACKSPACE](#visible_backspace)                     |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_BELL](#visible_bell)                               |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_CR](#visible_cr)                                   |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_DELETE](#visible_delete)                           |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_ESCAPE](#visible_escape)                           |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_LF](#visible_lf)                                   |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_NULL](#visible_null)                               |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_SPACE](#visible_space)                             |             |
| public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBLE_TAB](#visible_tab)                                 |             |



## Constructor Summary

| Constructor   | Description |
|---------------|-------------|
| StringUtils() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                                    | Method                                                                                                                                                                                                                                       | Description |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [unescapeUnicode](#unescapeunicode)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)                                                                                                          |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [unescapeHex](#unescapehex)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)                                                                                                                  |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [debugString](#debugstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string, int pos)                                                                                                    |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [debugString](#debugstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)                                                                                                             |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [debugString](#debugstring)(int limit, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)                                                                                                  |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [debugString](#debugstring)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, int pos) |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [visibleChar](#visiblechar)(int c)                                                                                                                                                                                                           |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [toKebabCase](#tokebabcase)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) camelCase)                                                                                                          |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [toPascalCase](#topascalcase)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kebabCase)                                                                                                        |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [toCamelCase](#tocamelcase)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kebabCase)                                                                                                          |             |
| public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> | [parseNumberList](#parsenumberlist)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) numbers)                                                                                                    |             |
| public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                           | [fromDouble](#fromdouble)(double d, int fractionalPartLen)                                                                                                                                                                                   |             |



## Field Details

### ELLIPSIS

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ELLIPSIS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FILLED_UP_POINTING_TRIANGLE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FILLED_UP_POINTING_TRIANGLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_BACKSPACE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_BACKSPACE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_BELL

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_BELL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_CR

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_CR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_DELETE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_DELETE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_ESCAPE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_ESCAPE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_LF

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_LF__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_NULL

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_NULL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_SPACE

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_SPACE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBLE_TAB

<span style="font-family: monospace; font-size: 80%;">public static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBLE_TAB__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---


## Method Details

### unescapeUnicode

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __unescapeUnicode__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### unescapeHex

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __unescapeHex__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### debugString

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __debugString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string, int pos)</span>




---

### debugString

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __debugString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)</span>




---

### debugString

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __debugString__(int limit, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string)</span>




---

### debugString

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __debugString__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) string, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name, int pos)</span>




---

### visibleChar

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __visibleChar__(int c)</span>




---

### toKebabCase

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toKebabCase__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) camelCase)</span>




---

### toPascalCase

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toPascalCase__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kebabCase)</span>




---

### toCamelCase

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toCamelCase__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) kebabCase)</span>




---

### parseNumberList

<span style="font-family: monospace; font-size: 80%;">public static [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[Number](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Number.html)> __parseNumberList__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) numbers)</span>




---

### fromDouble

<span style="font-family: monospace; font-size: 80%;">public static [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __fromDouble__(double d, int fractionalPartLen)</span>




---

