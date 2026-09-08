Package [io.github.qishr.cascara.common.util](index.md)

# Interface IModelTransformer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IModelTransformer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IModelTransformer__</span>

Provides a way to modify how the command model is built.This is useful for applications that need to modify the model dynamically depending on the runtime environment.



Commands may configure a model transformer using the
Command#modelTransformer() annotation attribute, or via the
CommandSpec#modelTransformer(IModelTransformer) programmatic API.



Model transformers are invoked only once, after the full command hierarchy is constructed.


## Method Summary

| Modifier and Type                                               | Method                                                                               | Description                                                                   |
|-----------------------------------------------------------------|--------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| public abstract [CommandSpec](CommandLine.Model.CommandSpec.md) | [transform](#transform)([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec) | Given an original CommandSpec, return the object that should be used instead. |



## Method Details

### transform

<span style="font-family: monospace; font-size: 80%;">public abstract [CommandSpec](CommandLine.Model.CommandSpec.md) __transform__([CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec)</span>

Given an original CommandSpec, return the object that should be used
instead.Implementors may modify the specified CommandSpec and return it,
or create a full or partial copy of the specified CommandSpec, and return
that, or even return a completely new CommandSpec.



Implementors are free to add or remove options, positional parameters,
subcommands or modify the command in any other way.



This method is called once, after the full command hierarchy is
constructed, and before any command line arguments are parsed.


**Returns:**

the CommandSpec to use instead of the specified one


---

