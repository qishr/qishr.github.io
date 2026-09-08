Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface ArgGroup
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ArgGroup<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD,METHOD,PARAMETER)<br/>
public static @interface __ArgGroup__</span>

A `Command` may define one or more `ArgGroups`: a group of options, positional parameters or a mixture of the two.Groups can be used to:
 
     define mutually exclusive arguments. By default, options and positional parameters
     in a group are mutually exclusive. This can be controlled with the [exclusive](#exclusive) attribute.
     Picocli will throw a [MutuallyExclusiveArgsException](CommandLine.MutuallyExclusiveArgsException.md) if the command line contains multiple arguments that are mutually exclusive.
     define a set of arguments that must co-occur. Set [exclusive](#exclusive)
     to define a group of options and positional parameters that must always be specified together.
     Picocli will throw a [MissingParameterException](CommandLine.MissingParameterException.md) if not all the options and positional parameters in a co-occurring group are specified together.
     create an option section in the usage help message.
     To be shown in the usage help message, a group needs to have a [heading](#heading) (which may come from a [headingKey](#headingkey)).
     Groups without a heading are only used for validation.
     Set [validate](#validate) for groups whose purpose is only to customize the usage help message.
     define composite repeating argument groups. Groups may contain other groups to create composite groups.
 
 

Groups may be optional (`multiplicity = "0..1"`), required (`multiplicity = "1"`), or repeating groups (`multiplicity = "0..*"` or `multiplicity = "1..*"`).
 For a group of mutually exclusive arguments, making the group required means that one of the arguments in the group must appear on the command line, or a [MissingParameterException](CommandLine.MissingParameterException.md) is thrown.
 For a group of co-occurring arguments, all arguments in the group must appear on the command line.
 
 

Groups can be composed for validation purposes:
 
 When the parent group is mutually exclusive, only one of the subgroups may be present.
 When the parent group is a co-occurring group, all subgroups must be present.
 When the parent group is required, at least one subgroup must be present.
 
 


 Below is an example of an `ArgGroup` defining a set of dependent options that must occur together.
 All options are required within the group, while the group itself is optional:
 
 public class DependentOptions {
     ArgGroup(exclusive = false, multiplicity = "0..1")
     Dependent group;

     static class Dependent {
         Option(names = "-a", required = true) int a;
         Option(names = "-b", required = true) int b;
         Option(names = "-c", required = true) int c;
     }
 }


## Method Summary

| Modifier and Type                                                                                            | Method                          | Description                                                                                                |
|--------------------------------------------------------------------------------------------------------------|---------------------------------|------------------------------------------------------------------------------------------------------------|
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [heading](#heading)()           | The heading of this group, used when generating the usage documentation.                                   |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [headingKey](#headingkey)()     | ResourceBundle key for this group's usage help message section heading.                                    |
| public abstract boolean                                                                                      | [exclusive](#exclusive)()       | Determines whether this is a mutually exclusive group; `true` by default.                                  |
| public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [multiplicity](#multiplicity)() | Determines how often this group can be specified on the command line; `"0..1"` (optional) by default.      |
| public abstract boolean                                                                                      | [validate](#validate)()         | Determines whether picocli should validate the rules of this group (`true` by default).                    |
| public abstract int                                                                                          | [order](#order)()               | Determines the position in the options list in the usage help message at which this group should be shown. |



## Method Details

### heading

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __heading__()</span>

The heading of this group, used when generating the usage documentation.When neither a [heading.heading](#heading) nor a [headingKey.headingKey](#headingkey) are specified,
 this group is used for validation only and does not change the usage help message.


---

### headingKey

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __headingKey__()</span>

ResourceBundle key for this group's usage help message section heading.When neither a [heading.heading](#heading) nor a [headingKey.headingKey](#headingkey) are specified,
 this group is used for validation only and does not change the usage help message.


---

### exclusive

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __exclusive__()</span>

Determines whether this is a mutually exclusive group; `true` by default.If `false`, this is a co-occurring group. Ignored if [validate.validate](#validate) is `false`.


---

### multiplicity

<span style="font-family: monospace; font-size: 80%;">public abstract [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __multiplicity__()</span>

Determines how often this group can be specified on the command line; `"0..1"` (optional) by default.For a group of mutually exclusive arguments, making the group required `multiplicity = "1"` means that
 one of the arguments in the group must appear on the command line, or a MissingParameterException is thrown.
 For a group of co-occurring arguments, making the group required means that all arguments in the group must appear on the command line.
 Ignored if [validate.validate](#validate) is `false`.


---

### validate

<span style="font-family: monospace; font-size: 80%;">public abstract boolean __validate__()</span>

Determines whether picocli should validate the rules of this group (`true` by default).For a mutually exclusive group validation means verifying that no more than one elements of the group is specified on the command line;
 for a co-occurring group validation means verifying that all elements of the group are specified on the command line.
 Set [validate.validate](#validate) for groups whose purpose is only to customize the usage help message.

**See Also:**


[multiplicity](#multiplicity)


[heading](#heading)



---

### order

<span style="font-family: monospace; font-size: 80%;">public abstract int __order__()</span>

Determines the position in the options list in the usage help message at which this group should be shown.Groups with a lower number are shown before groups with a higher number.
 This attribute is only honored for groups that have a [heading.heading](#heading) (or a [headingKey.headingKey](#headingkey) with a non-`null` resource bundle value).


---

