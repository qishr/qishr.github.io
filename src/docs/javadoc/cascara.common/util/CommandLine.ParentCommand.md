Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface ParentCommand
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.ParentCommand<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD)<br/>
public static @interface __ParentCommand__</span>




Fields annotated with `@ParentCommand` will be initialized with the parent command of the current subcommand.If the current command does not have a parent command, this annotation has no effect.



Parent commands often define options that apply to all the subcommands.
This annotation offers a convenient way to inject a reference to the parent command into a subcommand, so the
subcommand can access its parent options. For example:

Command(name = "top", subcommands = Sub.class)
class Top implements Runnable {

    Option(names = {"-d", "--directory"}, description = "this option applies to all subcommands")
    File baseDirectory;

    public void run() { System.out.println("Hello from top"); }
}

Command(name = "sub")
class Sub implements Runnable {

    ParentCommand
    private Top parent;

    public void run() {
        System.out.println("Subcommand: parent command 'directory' is " + parent.baseDirectory);
    }
}


