Package [io.github.qishr.cascara.common.util](index.md)

# Annotation Interface Unmatched
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.util.CommandLine.Unmatched<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)

Enclosing Class:<br/>
    [io.github.qishr.cascara.common.util.CommandLine](CommandLine.md)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(FIELD)<br/>
public static @interface __Unmatched__</span>

Fields annotated with `@Unmatched` will be initialized with the list of unmatched command line arguments, if any.If this annotation is found, picocli automatically sets unmatchedArgumentsAllowed to `true`.

