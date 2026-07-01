Package [io.github.qishr.cascara.common.semver](index.md)

# Class Requirement
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.semver.Requirement<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __Requirement__</span>

A requirement will provide an easy way to check if a version is satisfying.There are 2 types of requirements:
- Strict: checks if a version is equivalent to another
- NPM: follows the rules of NPM


## Field Summary

| Modifier and Type                   | Field           | Description |
|-------------------------------------|-----------------|-------------|
| protected final RequirementOperator | [op](#op)       |             |
| protected final Range               | [range](#range) |             |
| protected final Requirement         | [req1](#req1)   |             |
| protected final Requirement         | [req2](#req2)   |             |



## Constructor Summary

| Constructor                                                                                                                                                                | Description           |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------|
| Requirement([Range](Range.md) range, [Requirement](Requirement.md) req1, [RequirementOperator](Requirement.RequirementOperator.md) op, [Requirement](Requirement.md) req2) | Builds a requirement. |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                                                                                                                                                                 | Description                                                                                        |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| public static [Requirement](Requirement.md)                                                         | [build](#build)([SemVer](SemVer.md) requirement)                                                                                                                                                                                                                                                       | Builds a requirement (will test that the version is equivalent to the requirement)                 |
| public static [Requirement](Requirement.md)                                                         | [buildStrict](#buildstrict)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)                                                                                                                                                                  | Builds a strict requirement (will test that the version is equivalent to the requirement)          |
| public static [Requirement](Requirement.md)                                                         | [buildLoose](#buildloose)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)                                                                                                                                                                    | Builds a loose requirement (will test that the version is equivalent to the requirement)           |
| public static [Requirement](Requirement.md)                                                         | [buildNPM](#buildnpm)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)                                                                                                                                                                        | Builds a requirement following the rules of NPM.                                                   |
| public static [Requirement](Requirement.md)                                                         | [buildCocoapods](#buildcocoapods)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)                                                                                                                                                            | Builds a requirement following the rules of Cocoapods.                                             |
| public static [Requirement](Requirement.md)                                                         | [buildIvy](#buildivy)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)                                                                                                                                                                        | Builds a requirement following the rules of Ivy.                                                   |
| protected static [Requirement](Requirement.md)                                                      | [tildeRequirement](#tilderequirement)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version, [SemVerType](SemVer.SemVerType.md) type)                                                                                                                   | Allows patch-level changes if a minor version is specified on the comparator.                      |
| protected static [Requirement](Requirement.md)                                                      | [caretRequirement](#caretrequirement)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version, [SemVerType](SemVer.SemVerType.md) type)                                                                                                                   | Allows changes that do not modify the left-most non-zero digit in the [major, minor, patch] tuple. |
| protected static [Requirement](Requirement.md)                                                      | [hyphenRequirement](#hyphenrequirement)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lowerVersion, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) upperVersion, [SemVerType](SemVer.SemVerType.md) type) | Creates a requirement that satisfies "x1.y1.z1 - x2.y2.z2".                                        |
| public boolean                                                                                      | [isSatisfiedBy](#issatisfiedby)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)                                                                                                                                                                  |                                                                                                    |
| public boolean                                                                                      | [isSatisfiedBy](#issatisfiedby)([SemVer](SemVer.md) version)                                                                                                                                                                                                                                           | Checks if the requirement is satisfied by a version.                                               |
| public boolean                                                                                      | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                                                                                                                                                                      |                                                                                                    |
| public int                                                                                          | [hashCode](#hashcode)()                                                                                                                                                                                                                                                                                |                                                                                                    |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [toString](#tostring)()                                                                                                                                                                                                                                                                                |                                                                                                    |



## Field Details

### op

<span style="font-family: monospace; font-size: 80%;">protected final RequirementOperator __op__</span>




---

### range

<span style="font-family: monospace; font-size: 80%;">protected final Range __range__</span>




---

### req1

<span style="font-family: monospace; font-size: 80%;">protected final Requirement __req1__</span>




---

### req2

<span style="font-family: monospace; font-size: 80%;">protected final Requirement __req2__</span>




---


## Method Details

### build

<span style="font-family: monospace; font-size: 80%;">public static [Requirement](Requirement.md) __build__([SemVer](SemVer.md) requirement)</span>

Builds a requirement (will test that the version is equivalent to the requirement)

**Parameters:**

`requirement` - the version of the requirement

**Returns:**

the generated requirement


---

### buildStrict

<span style="font-family: monospace; font-size: 80%;">public static [Requirement](Requirement.md) __buildStrict__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)</span>

Builds a strict requirement (will test that the version is equivalent to the requirement)

**Parameters:**

`requirement` - the version of the requirement

**Returns:**

the generated requirement


---

### buildLoose

<span style="font-family: monospace; font-size: 80%;">public static [Requirement](Requirement.md) __buildLoose__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)</span>

Builds a loose requirement (will test that the version is equivalent to the requirement)

**Parameters:**

`requirement` - the version of the requirement

**Returns:**

the generated requirement


---

### buildNPM

<span style="font-family: monospace; font-size: 80%;">public static [Requirement](Requirement.md) __buildNPM__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)</span>

Builds a requirement following the rules of NPM.

**Parameters:**

`requirement` - the requirement as a string

**Returns:**

the generated requirement


---

### buildCocoapods

<span style="font-family: monospace; font-size: 80%;">public static [Requirement](Requirement.md) __buildCocoapods__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)</span>

Builds a requirement following the rules of Cocoapods.

**Parameters:**

`requirement` - the requirement as a string

**Returns:**

the generated requirement


---

### buildIvy

<span style="font-family: monospace; font-size: 80%;">public static [Requirement](Requirement.md) __buildIvy__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)</span>

Builds a requirement following the rules of Ivy.

**Parameters:**

`requirement` - the requirement as a string

**Returns:**

the generated requirement


---

### tildeRequirement

<span style="font-family: monospace; font-size: 80%;">protected static [Requirement](Requirement.md) __tildeRequirement__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version, [SemVerType](SemVer.SemVerType.md) type)</span>

Allows patch-level changes if a minor version is specified on the comparator.Allows minor-level changes if not.

**Parameters:**

`version` - the version of the requirement

`type` - the version system used for this requirement

**Returns:**

the generated requirement


---

### caretRequirement

<span style="font-family: monospace; font-size: 80%;">protected static [Requirement](Requirement.md) __caretRequirement__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version, [SemVerType](SemVer.SemVerType.md) type)</span>

Allows changes that do not modify the left-most non-zero digit in the [major, minor, patch] tuple.

**Parameters:**

`version` - the version of the requirement

`type` - the version system used for this requirement

**Returns:**

the generated requirement


---

### hyphenRequirement

<span style="font-family: monospace; font-size: 80%;">protected static [Requirement](Requirement.md) __hyphenRequirement__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) lowerVersion, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) upperVersion, [SemVerType](SemVer.SemVerType.md) type)</span>

Creates a requirement that satisfies "x1.y1.z1 - x2.y2.z2".

**Parameters:**

`lowerVersion` - the version of the lower bound of the requirement

`upperVersion` - the version of the upper bound of the requirement

`type` - the version system used for this requirement

**Returns:**

the generated requirement


---

### isSatisfiedBy

<span style="font-family: monospace; font-size: 80%;">public boolean __isSatisfiedBy__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version that will be checked

**Returns:**

true if the version satisfies the requirement

**See Also:**


[isSatisfiedBy](#issatisfiedby)



---

### isSatisfiedBy

<span style="font-family: monospace; font-size: 80%;">public boolean __isSatisfiedBy__([SemVer](SemVer.md) version)</span>

Checks if the requirement is satisfied by a version.

**Parameters:**

`version` - the version that will be checked

**Returns:**

true if the version satisfies the requirement


---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

