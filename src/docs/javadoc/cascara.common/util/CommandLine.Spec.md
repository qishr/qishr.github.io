Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface Spec
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Spec<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD,METHOD)<br/>
public static @interface __Spec__</span>

Fields annotated with `@Spec` will be initialized with the `CommandSpec` for the command the field is part of.Example usage:

class InjectSpecExample implements Runnable {
    Spec CommandSpec commandSpec;
    //...
    public void run() {
        // do something with the injected objects
    }
}



## Method Summary

| Modifier and Type                                    | Method            | Description                                                                                                                                                                       |
|------------------------------------------------------|-------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public abstract [Target](CommandLine.Spec.Target.md) | [value](#value)() | Whether to inject the `CommandSpec` of this command (the default) or the `CommandSpec`  of the "mixee" command that receives the options and other command elements defined here. |



## Method Details

### value

<span style="font-family: monospace; font-size: 80%;">public abstract [Target](CommandLine.Spec.Target.md) __value__()</span>

Whether to inject the `CommandSpec` of this command (the default) or the `CommandSpec`
 of the "mixee" command that receives the options and other command elements defined here.

**Since:**

4.3.0

**See Also:**


[Mixin](CommandLine.Mixin.md)



---

