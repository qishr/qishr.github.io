Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class NoOpReportWriter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.io.Writer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Writer.html)<br/>
                [io.github.qishr.cascara.common.diagnostic.ReportWriter](ReportWriter.md)<br/>
                        io.github.qishr.cascara.common.diagnostic.NoOpReportWriter<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public class __NoOpReportWriter__<br/>extends [ReportWriter](ReportWriter.md)
</span>


## Method Summary

| Modifier and Type | Method                                                                                                                        | Description |
|-------------------|-------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void       | [write](#write)(int indent, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) str) |             |
| public void       | [write](#write)(char[] cbuf, int off, int len)                                                                                |             |
| public void       | [flush](#flush)()                                                                                                             |             |
| public void       | [close](#close)()                                                                                                             |             |



## Method Details

### write

<span style="font-family: monospace; font-size: 80%;">public void __write__(int indent, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) str)</span>




---

### write

<span style="font-family: monospace; font-size: 80%;">public void __write__(char[] cbuf, int off, int len)</span>



**Overrides:**

[ReportWriter](../cascara.common/diagnostic/ReportWriter.md#write)


---

### flush

<span style="font-family: monospace; font-size: 80%;">public void __flush__()</span>



**Overrides:**

[ReportWriter](../cascara.common/diagnostic/ReportWriter.md#flush)


---

### close

<span style="font-family: monospace; font-size: 80%;">public void __close__()</span>



**Overrides:**

[ReportWriter](../cascara.common/diagnostic/ReportWriter.md#close)


---

