Package [io.github.qishr.cascara.common.lang.processor](index.md)

# Interface Processor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.lang.processor.Processor<br/>
<br/>
All Implemented Interfaces:<br/>
    [ServiceProvider](../../service/ServiceProvider.md), [ContentTypeProvider](../../service/ContentTypeProvider.md)

All Known Implementing Classes:<br/>
    [PullParser](PullParser.md), [AstConverter](AstConverter.md), [Tokenizer](Tokenizer.md), [AstParser](AstParser.md), [PushParser](PushParser.md), [Serializer](Serializer.md), [PathEvaluator](PathEvaluator.md), [Emitter](Emitter.md), [AbstractJsonProcessor](../../../cascara.lang.json/json/processor/AbstractJsonProcessor.md), [AbstractXmlProcessor](../../../cascara.lang.xml/processor/AbstractXmlProcessor.md), [AbstractYamlProcessor](../../../cascara.lang.yaml/yaml/processor/AbstractYamlProcessor.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __Processor__</span>


## Method Summary

| Modifier and Type                         | Method                                                                              | Description                                                              |
|-------------------------------------------|-------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| public abstract [Processor](Processor.md) | [setReporter](#setreporter)([Reporter](../../diagnostic/Reporter.md) reporter)      | Sets the reporter for communicating warnings or errors.                  |
| public abstract [Processor](Processor.md) | [setOptions](#setoptions)([LanguageOptions](../util/LanguageOptions.md)<?> options) | Sets the language-specific options (e.g., indentation, Unicode support). |



## Method Details

### setReporter

<span style="font-family: monospace; font-size: 80%;">public abstract [Processor](Processor.md) __setReporter__([Reporter](../../diagnostic/Reporter.md) reporter)</span>

Sets the reporter for communicating warnings or errors.


---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public abstract [Processor](Processor.md) __setOptions__([LanguageOptions](../util/LanguageOptions.md)<?> options)</span>

Sets the language-specific options (e.g., indentation, Unicode support).


---

