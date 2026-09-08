Package [io.github.qishr.cascara.common.util](index.md)

# Interface IExitCodeGenerator
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IExitCodeGenerator<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IExitCodeGenerator__</span>

`@Command`-annotated classes can implement this interface to specify an exit code that will be returned
 from the #execute(String...) method when the command is successfully invoked.

Example usage:
 
 Command
 class MyCommand implements Runnable, IExitCodeGenerator {
     public void run() { System.out.println("Hello"); }
     public int getExitCode() { return 123; }
 }
 CommandLine cmd = new CommandLine(new MyCommand());
 int exitCode = cmd.execute(args);
 assert exitCode == 123;
 System.exit(exitCode);
 


## Method Summary

| Modifier and Type   | Method                        | Description                                                                        |
|---------------------|-------------------------------|------------------------------------------------------------------------------------|
| public abstract int | [getExitCode](#getexitcode)() | Returns the exit code that should be returned from the #execute(String...) method. |



## Method Details

### getExitCode

<span style="font-family: monospace; font-size: 80%;">public abstract int __getExitCode__()</span>

Returns the exit code that should be returned from the #execute(String...) method.

**Returns:**

the exit code


---

