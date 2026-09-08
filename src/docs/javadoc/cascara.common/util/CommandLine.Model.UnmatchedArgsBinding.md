Package [io.github.qishr.cascara.common.util](index.md)

# Class UnmatchedArgsBinding
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.UnmatchedArgsBinding<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static class __UnmatchedArgsBinding__</span>

This class allows applications to specify a custom binding that will be invoked for unmatched arguments.A binding can be created with a `ISetter` that consumes the unmatched arguments `String[]`, or with a
 `IGetter` that produces a `Collection<String>` that the unmatched arguments can be added to.


## Method Summary

| Modifier and Type                                                               | Method                                                                                                      | Description                                                                                                                      |
|---------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| public static [UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) | [forStringArrayConsumer](#forstringarrayconsumer)([ISetter](CommandLine.Model.ISetter.md) setter)           | Creates a `UnmatchedArgsBinding` for a setter that consumes `String[]` objects.                                                  |
| public static [UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) | [forStringCollectionSupplier](#forstringcollectionsupplier)([IGetter](CommandLine.Model.IGetter.md) getter) | Creates a `UnmatchedArgsBinding` for a getter that produces a `Collection<String>` that the unmatched arguments can be added to. |
| public [IGetter](CommandLine.Model.IGetter.md)                                  | [getter](#getter)()                                                                                         | Returns the getter responsible for producing a `Collection` that the unmatched arguments can be added to.                        |
| public [ISetter](CommandLine.Model.ISetter.md)                                  | [setter](#setter)()                                                                                         | Returns the setter responsible for consuming the unmatched arguments.                                                            |



## Method Details

### forStringArrayConsumer

<span style="font-family: monospace; font-size: 80%;">public static [UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) __forStringArrayConsumer__([ISetter](CommandLine.Model.ISetter.md) setter)</span>

Creates a `UnmatchedArgsBinding` for a setter that consumes `String[]` objects.

**Parameters:**

`setter` - consumes the String[] array with unmatched arguments.


---

### forStringCollectionSupplier

<span style="font-family: monospace; font-size: 80%;">public static [UnmatchedArgsBinding](CommandLine.Model.UnmatchedArgsBinding.md) __forStringCollectionSupplier__([IGetter](CommandLine.Model.IGetter.md) getter)</span>

Creates a `UnmatchedArgsBinding` for a getter that produces a `Collection<String>` that the unmatched arguments can be added to.

**Parameters:**

`getter` - supplies a `Collection<String>` that the unmatched arguments can be added to.


---

### getter

<span style="font-family: monospace; font-size: 80%;">public [IGetter](CommandLine.Model.IGetter.md) __getter__()</span>

Returns the getter responsible for producing a `Collection` that the unmatched arguments can be added to.


---

### setter

<span style="font-family: monospace; font-size: 80%;">public [ISetter](CommandLine.Model.ISetter.md) __setter__()</span>

Returns the setter responsible for consuming the unmatched arguments.


---

