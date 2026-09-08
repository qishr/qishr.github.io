Package [io.github.qishr.cascara.common.util](index.md)

# Interface IScope
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Model.IScope<br/>
<br/>
All Implemented Interfaces:<br/>
    [IGetter](CommandLine.Model.IGetter.md), [ISetter](CommandLine.Model.ISetter.md)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine.Model](CommandLine.Model.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IScope__</span>

The scope of a getter/setter binding is the context where the current value should be gotten from or set to.Usually, this is an instance of the enclosing element. For a field, the scope is the object whose field value to get/set.
 For a method binding, it is the object on which the method should be invoked.
 

The getter and setter of the scope allow you to change the object onto which the option and positional parameter getters and setters should be applied.

