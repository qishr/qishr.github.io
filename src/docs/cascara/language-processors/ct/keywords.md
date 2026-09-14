# CT Keywords

- [import](#import)
- [include](#include)
- [insert](#insert)
- [iterate](#iterate)
- [separator](#separator)

## import

Imports static Java methods for use in CT source code.

Example:

```
import io.github.qishr.cascara.lang.ct.util.ColorTransform.rgba;
```

## include

The `include` keyword is similar to `#include` in C - the file being included is essentially treated as if its contents appeared inline in the the file including it.

Any [URI schemes](https://qishr.github.io/javadoc/cascara.common/util/UriScheme/) supportted by Cascara may be used to specify the file being included.

Example:

```
include "res://ghosty.tc";
```

## insert

## iterate

## separator

