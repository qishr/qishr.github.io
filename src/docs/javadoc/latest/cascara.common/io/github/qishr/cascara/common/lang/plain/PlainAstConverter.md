Package [io.github.qishr.cascara.common.lang.plain](index.md)

# Class PlainAstConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.plain.PlainAstConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md)<[PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __PlainAstConverter__</span>


## Constructor Summary

| Constructor         | Description |
|---------------------|-------------|
| PlainAstConverter() |             |



## Method Summary

| Modifier and Type                                                                                               | Method                                                                                                                                    | Description |
|-----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)                 | [fromAst](#fromast)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)                               |             |
| public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md)                 | [toPlainAst](#toplainast)([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) yaml)                  |             |
| public [PlainAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainAstConverter.md) | [setReporter](#setreporter)([Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)       |             |
| public [PlainAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainAstConverter.md) | [setOptions](#setoptions)([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options) |             |
| public [ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md)                   | [getContentType](#getcontenttype)()                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)             | [toString](#tostring)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)                             |             |



## Method Details

### fromAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) __fromAst__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

### toPlainAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) __toPlainAst__([PlainNode](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainNode.md) yaml)</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [PlainAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainAstConverter.md) __setReporter__([Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [PlainAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/plain/PlainAstConverter.md) __setOptions__([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) __getContentType__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

