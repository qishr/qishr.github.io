Package [io.github.qishr.cascara.common.semver](index.md)

# Class SemVer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.semver.SemVer<br/>
<br/>
All Implemented Interfaces:<br/>
    [Comparable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Comparable.html)<[SemVer](SemVer.md)>


----

<span style="font-family: monospace; font-size: 80%;">public class __SemVer__</span>

Semver is a tool that provides useful methods to manipulate versions that follow the "semantic versioning" specification
(see http://semver.org)


## Constructor Summary

| Constructor                                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| SemVer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value)                                          |             |
| SemVer([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) value, [SemVerType](SemVer.SemVerType.md) type) |             |



## Method Summary

| Modifier and Type                                                                                     | Method                                                                                                                                                  | Description                                                                          |
|-------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| public boolean                                                                                        | [satisfies](#satisfies)([Requirement](Requirement.md) requirement)                                                                                      | Check if the version satisfies a requirement                                         |
| public boolean                                                                                        | [satisfies](#satisfies)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)                       | Check if the version satisfies a requirement                                         |
| public boolean                                                                                        | [isGreaterThan](#isgreaterthan)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)                   |                                                                                      |
| public boolean                                                                                        | [isGreaterThan](#isgreaterthan)([SemVer](SemVer.md) version)                                                                                            | Checks if the version is greater than another version                                |
| public boolean                                                                                        | [isGreaterThanOrEqualTo](#isgreaterthanorequalto)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version) |                                                                                      |
| public boolean                                                                                        | [isGreaterThanOrEqualTo](#isgreaterthanorequalto)([SemVer](SemVer.md) version)                                                                          | Checks if the version is greater than or equal to another version                    |
| public boolean                                                                                        | [isLowerThan](#islowerthan)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)                       |                                                                                      |
| public boolean                                                                                        | [isLowerThan](#islowerthan)([SemVer](SemVer.md) version)                                                                                                | Checks if the version is lower than another version                                  |
| public boolean                                                                                        | [isLowerThanOrEqualTo](#islowerthanorequalto)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)     |                                                                                      |
| public boolean                                                                                        | [isLowerThanOrEqualTo](#islowerthanorequalto)([SemVer](SemVer.md) version)                                                                              | Checks if the version is lower than or equal to another version                      |
| public boolean                                                                                        | [isEquivalentTo](#isequivalentto)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)                 |                                                                                      |
| public boolean                                                                                        | [isEquivalentTo](#isequivalentto)([SemVer](SemVer.md) version)                                                                                          | Checks if the version equals another version, without taking the build into account. |
| public boolean                                                                                        | [isEqualTo](#isequalto)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)                           |                                                                                      |
| public boolean                                                                                        | [isEqualTo](#isequalto)([SemVer](SemVer.md) version)                                                                                                    | Checks if the version equals another version                                         |
| public boolean                                                                                        | [isStable](#isstable)()                                                                                                                                 | Determines if the current version is stable or not.                                  |
| public [VersionDiff](SemVer.VersionDiff.md)                                                           | [diff](#diff)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)                                     |                                                                                      |
| public [VersionDiff](SemVer.VersionDiff.md)                                                           | [diff](#diff)([SemVer](SemVer.md) version)                                                                                                              | Returns the greatest difference between 2 versions.                                  |
| public [SemVer](SemVer.md)                                                                            | [toStrict](#tostrict)()                                                                                                                                 |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withIncMajor](#withincmajor)()                                                                                                                         |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withIncMajor](#withincmajor)(int increment)                                                                                                            |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withIncMinor](#withincminor)()                                                                                                                         |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withIncMinor](#withincminor)(int increment)                                                                                                            |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withIncPatch](#withincpatch)()                                                                                                                         |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withIncPatch](#withincpatch)(int increment)                                                                                                            |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withClearedSuffix](#withclearedsuffix)()                                                                                                               |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withClearedBuild](#withclearedbuild)()                                                                                                                 |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withClearedSuffixAndBuild](#withclearedsuffixandbuild)()                                                                                               |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withSuffix](#withsuffix)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) suffix)                          |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [withBuild](#withbuild)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) build)                             |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [nextMajor](#nextmajor)()                                                                                                                               |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [nextMinor](#nextminor)()                                                                                                                               |                                                                                      |
| public [SemVer](SemVer.md)                                                                            | [nextPatch](#nextpatch)()                                                                                                                               |                                                                                      |
| public boolean                                                                                        | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                       |                                                                                      |
| public int                                                                                            | [hashCode](#hashcode)()                                                                                                                                 |                                                                                      |
| public int                                                                                            | [compareTo](#compareto)([SemVer](SemVer.md) version)                                                                                                    |                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [toString](#tostring)()                                                                                                                                 |                                                                                      |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getOriginalValue](#getoriginalvalue)()                                                                                                                 | Get the original value as a string                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getValue](#getvalue)()                                                                                                                                 | Returns the version as a String                                                      |
| public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) | [getMajor](#getmajor)()                                                                                                                                 | Returns the major part of the version.                                               |
| public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) | [getMinor](#getminor)()                                                                                                                                 | Returns the minor part of the version.                                               |
| public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) | [getPatch](#getpatch)()                                                                                                                                 | Returns the patch part of the version.                                               |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] | [getSuffixTokens](#getsuffixtokens)()                                                                                                                   | Returns the suffix of the version.                                                   |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)   | [getBuild](#getbuild)()                                                                                                                                 | Returns the build of the version.                                                    |
| public [SemVerType](SemVer.SemVerType.md)                                                             | [getType](#gettype)()                                                                                                                                   |                                                                                      |



## Method Details

### satisfies

<span style="font-family: monospace; font-size: 80%;">public boolean __satisfies__([Requirement](Requirement.md) requirement)</span>

Check if the version satisfies a requirement

**Parameters:**

`requirement` - the requirement

**Returns:**

true if the version satisfies the requirement


---

### satisfies

<span style="font-family: monospace; font-size: 80%;">public boolean __satisfies__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) requirement)</span>

Check if the version satisfies a requirement

**Parameters:**

`requirement` - the requirement

**Returns:**

true if the version satisfies the requirement


---

### isGreaterThan

<span style="font-family: monospace; font-size: 80%;">public boolean __isGreaterThan__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is greater than the provided version

**See Also:**


[isGreaterThan](#isgreaterthan)



---

### isGreaterThan

<span style="font-family: monospace; font-size: 80%;">public boolean __isGreaterThan__([SemVer](SemVer.md) version)</span>

Checks if the version is greater than another version

**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is greater than the provided version


---

### isGreaterThanOrEqualTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isGreaterThanOrEqualTo__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is greater than or equal to the provided version

**See Also:**


[isGreaterThanOrEqualTo](#isgreaterthanorequalto)



---

### isGreaterThanOrEqualTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isGreaterThanOrEqualTo__([SemVer](SemVer.md) version)</span>

Checks if the version is greater than or equal to another version

**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is greater than or equal to the provided version


---

### isLowerThan

<span style="font-family: monospace; font-size: 80%;">public boolean __isLowerThan__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is lower than the provided version

**See Also:**


[isLowerThan](#islowerthan)



---

### isLowerThan

<span style="font-family: monospace; font-size: 80%;">public boolean __isLowerThan__([SemVer](SemVer.md) version)</span>

Checks if the version is lower than another version

**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is lower than the provided version


---

### isLowerThanOrEqualTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isLowerThanOrEqualTo__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is lower than or equal to the provided version

**See Also:**


[isLowerThanOrEqualTo](#islowerthanorequalto)



---

### isLowerThanOrEqualTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isLowerThanOrEqualTo__([SemVer](SemVer.md) version)</span>

Checks if the version is lower than or equal to another version

**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version is lower than or equal to the provided version


---

### isEquivalentTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isEquivalentTo__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version equals the provided version (build excluded)

**See Also:**


[isEquivalentTo](#isequivalentto)



---

### isEquivalentTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isEquivalentTo__([SemVer](SemVer.md) version)</span>

Checks if the version equals another version, without taking the build into account.

**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version equals the provided version (build excluded)


---

### isEqualTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isEqualTo__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version equals the provided version

**See Also:**


[isEqualTo](#isequalto)



---

### isEqualTo

<span style="font-family: monospace; font-size: 80%;">public boolean __isEqualTo__([SemVer](SemVer.md) version)</span>

Checks if the version equals another version

**Parameters:**

`version` - the version to compare

**Returns:**

true if the current version equals the provided version


---

### isStable

<span style="font-family: monospace; font-size: 80%;">public boolean __isStable__()</span>

Determines if the current version is stable or not.Stable version have a major version number strictly positive and no suffix tokens.

**Returns:**

true if the current version is stable


---

### diff

<span style="font-family: monospace; font-size: 80%;">public [VersionDiff](SemVer.VersionDiff.md) __diff__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) version)</span>



**Parameters:**

`version` - the version to compare

**Returns:**

the greatest difference

**See Also:**


[diff](#diff)



---

### diff

<span style="font-family: monospace; font-size: 80%;">public [VersionDiff](SemVer.VersionDiff.md) __diff__([SemVer](SemVer.md) version)</span>

Returns the greatest difference between 2 versions.For example, if the current version is "1.2.3" and compared version is "1.3.0", the biggest difference
is the 'MINOR' number.

**Parameters:**

`version` - the version to compare

**Returns:**

the greatest difference


---

### toStrict

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __toStrict__()</span>




---

### withIncMajor

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withIncMajor__()</span>




---

### withIncMajor

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withIncMajor__(int increment)</span>




---

### withIncMinor

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withIncMinor__()</span>




---

### withIncMinor

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withIncMinor__(int increment)</span>




---

### withIncPatch

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withIncPatch__()</span>




---

### withIncPatch

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withIncPatch__(int increment)</span>




---

### withClearedSuffix

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withClearedSuffix__()</span>




---

### withClearedBuild

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withClearedBuild__()</span>




---

### withClearedSuffixAndBuild

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withClearedSuffixAndBuild__()</span>




---

### withSuffix

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withSuffix__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) suffix)</span>




---

### withBuild

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __withBuild__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) build)</span>




---

### nextMajor

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __nextMajor__()</span>




---

### nextMinor

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __nextMinor__()</span>




---

### nextPatch

<span style="font-family: monospace; font-size: 80%;">public [SemVer](SemVer.md) __nextPatch__()</span>




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

### compareTo

<span style="font-family: monospace; font-size: 80%;">public int __compareTo__([SemVer](SemVer.md) version)</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__()</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#tostring)


---

### getOriginalValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOriginalValue__()</span>

Get the original value as a string

**Returns:**

the original string passed in the constructor


---

### getValue

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getValue__()</span>

Returns the version as a String

**Returns:**

the version as a String


---

### getMajor

<span style="font-family: monospace; font-size: 80%;">public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __getMajor__()</span>

Returns the major part of the version.Example: for "1.2.3" = 1

**Returns:**

the major part of the version


---

### getMinor

<span style="font-family: monospace; font-size: 80%;">public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __getMinor__()</span>

Returns the minor part of the version.Example: for "1.2.3" = 2

**Returns:**

the minor part of the version


---

### getPatch

<span style="font-family: monospace; font-size: 80%;">public [Integer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Integer.html) __getPatch__()</span>

Returns the patch part of the version.Example: for "1.2.3" = 3

**Returns:**

the patch part of the version


---

### getSuffixTokens

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] __getSuffixTokens__()</span>

Returns the suffix of the version.Example: for "1.2.3-beta.4+sha98450956" = {"beta", "4"}

**Returns:**

the suffix of the version


---

### getBuild

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getBuild__()</span>

Returns the build of the version.Example: for "1.2.3-beta.4+sha98450956" = "sha98450956"

**Returns:**

the build of the version


---

### getType

<span style="font-family: monospace; font-size: 80%;">public [SemVerType](SemVer.SemVerType.md) __getType__()</span>




---

