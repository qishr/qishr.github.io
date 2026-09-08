Package [io.github.qishr.cascara.common.util](index.md)

# Interface IExitCodeExceptionMapper
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.IExitCodeExceptionMapper<br/>
<br/>
Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">public static interface __IExitCodeExceptionMapper__</span>

Interface that provides the appropriate exit code that will be returned from the #execute(String...)
 method for an exception that occurred during parsing or while invoking the command's Runnable, Callable, or Method.

Example usage:
 
 Command
 class FailingCommand implements CallableVoid {
     public Void call() throws IOException {
         throw new IOException("error");
     }
 }
 IExitCodeExceptionMapper mapper = new IExitCodeExceptionMapper() {
     public int getExitCode(Throwable t) {
         if (t instanceof IOException  "error".equals(t.getMessage())) {
             return 123;
         }
         return 987;
     }
 }

 CommandLine cmd = new CommandLine(new FailingCommand());
 cmd.setExitCodeExceptionMapper(mapper);
 int exitCode = cmd.execute(args);
 assert exitCode == 123;
 System.exit(exitCode);
 


## Method Summary

| Modifier and Type   | Method                                                                                                                                    | Description                                                                        |
|---------------------|-------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| public abstract int | [getExitCode](#getexitcode)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) exception) | Returns the exit code that should be returned from the #execute(String...) method. |



## Method Details

### getExitCode

<span style="font-family: monospace; font-size: 80%;">public abstract int __getExitCode__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) exception)</span>

Returns the exit code that should be returned from the #execute(String...) method.

**Parameters:**

`exception` - the exception that occurred during parsing or while invoking the command's Runnable, Callable, or Method.

**Returns:**

the exit code


---

