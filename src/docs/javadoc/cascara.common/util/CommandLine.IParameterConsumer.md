Package [io.github.qishr.cascara.common.util](index.md)

# Interface IParameterConsumer
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IParameterConsumer<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IParameterConsumer__</span>

Options or positional parameters can be assigned a `IParameterConsumer` that implements
custom logic to process the parameters for this option or this position.When an option or positional parameter with a custom `IParameterConsumer` is matched on the
command line, picocli's internal parser is temporarily suspended, and this object becomes
responsible for consuming and processing as many command line arguments as needed.


This may be useful when passing through parameters to another command.


Example usage:

Command(name = "find")
class Find {
    Option(names = "-exec", parameterConsumer = Find.ExecParameterConsumer.class)
    ListString list = new ArrayListString();

    static class ExecParameterConsumer implements IParameterConsumer {
        public void consumeParameters(StackString args, ArgSpec argSpec, CommandSpec commandSpec) {
            ListString list = argSpec.getValue();
            while (!args.isEmpty()) {
                String arg = args.pop();
                list.add(arg);

                // `find -exec` semantics: stop processing after a ';' or '+' argument
                if (";".equals(arg) || "+".equals(arg)) {
                    break;
                }
            }
        }
    }
}


If this interface does not meet your requirements, you may have a look at the more powerful
and flexible [IParameterPreprocessor](CommandLine.IParameterPreprocessor.md) interface introduced with picocli 4.6.


## Method Summary

| Modifier and Type    | Method                                                                                                                                                                                                                                                                                                                                               | Description                                                                                                 |
|----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| public abstract void | [consumeParameters](#consumeparameters)([Stack](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Stack.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> args, [ArgSpec](CommandLine.Model.ArgSpec.md) argSpec, [CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec) | Consumes as many of the specified command line arguments as needed by popping them off the specified Stack. |



## Method Details

### consumeParameters

<span style="font-family: monospace; font-size: 80%;">public abstract void __consumeParameters__([Stack](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Stack.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> args, [ArgSpec](CommandLine.Model.ArgSpec.md) argSpec, [CommandSpec](CommandLine.Model.CommandSpec.md) commandSpec)</span>

Consumes as many of the specified command line arguments as needed by popping them off
the specified Stack.Implementors are free to ignore the arity
of the option or positional parameter, they are free to consume arguments that would
normally be matched as other options of the command, and they are free to consume
arguments that would normally be matched as an end-of-options delimiter.


Implementors are responsible for saving the consumed values;
if the user object of the option or positional parameter is a Collection
or a Map, a common approach would be to obtain the current instance via the
ArgSpec#getValue(), and add to this instance. If the user object is an
array, the implementation would need to create a new array that contains the
old values as well as the newly consumed values, and store this array in the
user object via the ArgSpec#setValue(Object).



If the user input is invalid, implementations should throw a [ParameterException](CommandLine.ParameterException.md)
with a message to display to the user.



When this method returns, the picocli parser will process the remaining arguments on the Stack.


**Parameters:**

`args` - the command line arguments

`argSpec` - the option or positional parameter for which to consume command line arguments

`commandSpec` - the command that the option or positional parameter belongs to


---

