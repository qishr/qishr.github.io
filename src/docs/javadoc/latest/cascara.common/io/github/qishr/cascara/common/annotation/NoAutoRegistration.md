Package [io.github.qishr.cascara.common.annotation](index.md)

# Annotation Interface NoAutoRegistration
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.annotation.NoAutoRegistration<br/>
<br/>
All Implemented Interfaces:<br/>
    [Annotation](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/annotation/Annotation.html)


----

<span style="font-family: monospace; font-size: 80%;">@java.lang.annotation.Documented<br/>
@java.lang.annotation.Retention(RUNTIME)<br/>
@java.lang.annotation.Target(TYPE)<br/>
public @interface __NoAutoRegistration__</span>

Prevents SPL from automatically registering this service provider class during
automatic classpath/modulepath boot scans.Classes tagged with this annotation must be registered manually via
`SPL.getRoot().registerClass(...)` or direct serializer registration.

