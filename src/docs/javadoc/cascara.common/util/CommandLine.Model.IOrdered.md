Package [io.github.qishr.cascara.common.util](index.md)

# Interface IOrdered
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.IOrdered<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)

All Known Implementing Classes:<br/>
    [OptionSpec](CommandLine.Model.OptionSpec.md), [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IOrdered__</span>

Interface for sorting [OptionSpec](CommandLine.Model.OptionSpec.md) and [ArgGroupSpec](CommandLine.Model.ArgGroupSpec.md) together.


## Method Summary

| Modifier and Type   | Method            | Description                                                                                               |
|---------------------|-------------------|-----------------------------------------------------------------------------------------------------------|
| public abstract int | [order](#order)() | Returns the position in the options list in the usage help message at which this element should be shown. |



## Method Details

### order

<span style="font-family: monospace; font-size: 80%;">public abstract int __order__()</span>

Returns the position in the options list in the usage help message at which this element should be shown.Elements with a lower number are shown before elements with a higher number.
 For options, this attribute is only honored if UsageMessageSpec#sortOptions() is `false` for this command.
 For argument groups, this attribute is only honored for groups that have a ArgGroup#heading() (or a ArgGroup#headingKey() with a non-`null` value).


---

