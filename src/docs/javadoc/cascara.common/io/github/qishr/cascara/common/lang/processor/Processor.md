Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface Processor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.Processor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../../../../../../io/github/qishr/cascara/common/service/ServiceProvider.md), [ContentTypeProvider](../../../../../../../io/github/qishr/cascara/common/service/ContentTypeProvider.md)

All Known Implementing Classes:<br/>
    [PullParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PullParser.md), [AstConverter](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstConverter.md), [Tokenizer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Tokenizer.md), [AstParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/AstParser.md), [PushParser](../../../../../../../io/github/qishr/cascara/common/lang/processor/PushParser.md), [Serializer](../../../../../../../io/github/qishr/cascara/common/lang/processor/Serializer.md), [PathEvaluator](../../../../../../../io/github/qishr/cascara/common/lang/processor/PathEvaluator.md), [Emitter](../../../../../../../io/github/qishr/cascara/common/lang/processor/Emitter.md), [AbstractXmlProcessor](../../../../../../../../cascara.lang.xml/io/github/qishr/cascara/lang/xml/processor/AbstractXmlProcessor.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Processor__</span>


## Method Summary

| Modifier and Type                                                                                            | Method                                                                                                                                    | Description                                                              |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| public abstract [Processor](../../../../../../../io/github/qishr/cascara/common/lang/processor/Processor.md) | [setReporter](#setreporter)([Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)       | Sets the reporter for communicating warnings or errors.                  |
| public abstract [Processor](../../../../../../../io/github/qishr/cascara/common/lang/processor/Processor.md) | [setOptions](#setoptions)([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options) | Sets the language-specific options (e.g., indentation, Unicode support). |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public abstract [Processor](../../../../../../../io/github/qishr/cascara/common/lang/processor/Processor.md) __setReporter__([Reporter](../../../../../../../io/github/qishr/cascara/common/diagnostic/report/Reporter.md) reporter)</span>

Sets the reporter for communicating warnings or errors.


---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public abstract [Processor](../../../../../../../io/github/qishr/cascara/common/lang/processor/Processor.md) __setOptions__([LanguageOptions](../../../../../../../io/github/qishr/cascara/common/lang/util/LanguageOptions.md)<?> options)</span>

Sets the language-specific options (e.g., indentation, Unicode support).


---

