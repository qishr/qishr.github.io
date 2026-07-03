Package [io.github.qishr.cascara.common.lang.util](index.md)

# Class JsonPointer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.util.JsonPointer<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.lang.annotation.Experimental<br/>
public class __JsonPointer__</span>

A JSON Pointer is a simple query language defined for JSON documents by
RFC 6901.In a nutshell, JSONPointer allows the user to navigate into a JSON document
using strings, and retrieve targeted objects, like a simple form of XPATH.
Path segments are separated by the '/' char, which signifies the root of
the document when it appears as the first char of the string. Array
elements are navigated using ordinals, counting from 0. JSONPointer strings
may be extended to any arbitrary number of segments. If the navigation
is successful, the matched item is returned. A matched item may be a
JSONObject, a JSONArray, or a JSON value. If the JSONPointer string building
fails, an appropriate exception is thrown. If the navigation fails to find
a match, a JSONPointerException is thrown.


## Nested Class Summary

| Modifier and Type | Class                                                                                  | Description                                                                                         |
|-------------------|----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| public static     | [io.github.qishr.cascara.common.lang.util.JsonPointer.Builder](JsonPointer.Builder.md) | This class allows the user to build a JSONPointer in steps, using exactly one segment in each step. |



## Constructor Summary

| Constructor                                                                                                                                                                                                   | Description                                                                       |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------|
| JsonPointer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) pointer)                                                                                             | Pre-parses and initializes a new `JSONPointer` instance.                          |
| JsonPointer([List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> refTokens) | Constructs a new JSONPointer instance with the provided list of reference tokens. |



## Method Summary

| Modifier and Type                                                                                   | Method                                                         | Description                                                                                           |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| public static [Builder](JsonPointer.Builder.md)                                                     | [builder](#builder)()                                          | Static factory method for [Builder](JsonPointer.Builder.md).                                          |
| public [AstNode](../ast/AstNode.md)                                                                 | [queryFrom](#queryfrom)([AstNode](../ast/AstNode.md) document) | Evaluates this JSON Pointer on the given `document`.                                                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                        | Returns a string representing the JSONPointer path value using string representation                  |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toURIFragment](#tourifragment)()                              | Returns a string representing the JSONPointer path value using URI fragment identifier representation |



## Method Details

### builder

<span style="font-family: monospace; font-size: 80%;">public static [Builder](JsonPointer.Builder.md) __builder__()</span>

Static factory method for [Builder](JsonPointer.Builder.md).Example usage:

JSONPointer pointer = JSONPointer.builder()
      .append("obj")
      .append("other~key").append("another/key")
      .append("\"")
      .append(0)
      .build();


**Returns:**

a builder instance which can be used to construct a `JSONPointer` instance by chained
 Builder#append(String) calls.


---

### queryFrom

<span style="font-family: monospace; font-size: 80%;">public [AstNode](../ast/AstNode.md) __queryFrom__([AstNode](../ast/AstNode.md) document)</span>

Evaluates this JSON Pointer on the given `document`.The `document`
is usually a JSONObject or a JSONArray instance, but the empty
JSON Pointer (`""`) can be evaluated on any JSON values and in such case the
returned value will be `document` itself.

**Parameters:**

`document` - the JSON document which should be the subject of querying.

**Returns:**

the result of the evaluation

**Throws:**

[JsonPointerException](../exception/JsonPointerException.md)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>

Returns a string representing the JSONPointer path value using string
representation

**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### toURIFragment

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toURIFragment__()</span>

Returns a string representing the JSONPointer path value using URI
fragment identifier representation

**Returns:**

a uri fragment string


---

