Package [io.github.qishr.cascara.common.lang.generic](index.md)

# Class GenericAstConverter
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.generic.GenericAstConverter<br/>
<br/>
All Implemented Interfaces:<br/>
    [AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md)<[GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)>


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __GenericAstConverter__</span>


## Constructor Summary

| Constructor           | Description |
|-----------------------|-------------|
| GenericAstConverter() |             |



## Method Summary

| Modifier and Type                                                                                                     | Method                                                                                                                                    | Description |
|-----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)           | [fromAst](#fromast)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)                               |             |
| public [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md)           | [toGenericAst](#togenericast)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node)                    |             |
| public [GenericAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstConverter.md) | [setReporter](#setreporter)([Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)       |             |
| public [GenericAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstConverter.md) | [setOptions](#setoptions)([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options) |             |
| public [ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md)                         | [getContentType](#getcontenttype)()                                                                                                       |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                   | [toString](#tostring)([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)                             |             |



## Method Details

### fromAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md) __fromAst__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

### toGenericAst

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Nullable<br/>
public [GenericAstNode](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstNode.md) __toGenericAst__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) node)</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public [GenericAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstConverter.md) __setReporter__([Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>




---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public [GenericAstConverter](../../../../../../../io/github/qishr/cascara/common/lang/generic/GenericAstConverter.md) __setOptions__([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../../../../../io/github/qishr/cascara/common/util/ContentType.md) __getContentType__()</span>




---

### toString

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __toString__([AstNode](../../../../../../../io/github/qishr/cascara/common/lang/ast/AstNode.md) ast)</span>



**Specified By:**

[AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md)


---

