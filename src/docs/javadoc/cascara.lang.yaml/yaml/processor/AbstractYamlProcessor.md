Package [io.github.qishr.cascara.lang.yaml.processor](index.md)

# Class AbstractYamlProcessor
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.lang.yaml.processor.AbstractYamlProcessor<br/>
<br/>
All Implemented Interfaces:<br/>
    [Processor](../../../cascara.common/lang/processor/Processor.md)

Direct Known Subtypes:<br/>
    [YamlEmitter](YamlEmitter.md), [YamlPushParser](YamlPushParser.md), [YamlPullParser](YamlPullParser.md), [YamlConverter](YamlConverter.md), [YamlTokenizer](YamlTokenizer.md), [YamlAstParser](YamlAstParser.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractYamlProcessor__</span>


## Field Summary

| Modifier and Type     | Field                 | Description |
|-----------------------|-----------------------|-------------|
| protected YamlOptions | [options](#options)   |             |
| protected Reporter    | [reporter](#reporter) |             |



## Constructor Summary

| Constructor             | Description |
|-------------------------|-------------|
| AbstractYamlProcessor() |             |



## Method Summary

| Modifier and Type                                                 | Method                                                                                                        | Description                                                              |
|-------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| protected abstract P                                              | [self](#self)()                                                                                               |                                                                          |
| public [Properties](../../../cascara.common/util/Properties.md)   | [getServiceProperties](#getserviceproperties)()                                                               |                                                                          |
| public [ContentType](../../../cascara.common/util/ContentType.md) | [getContentType](#getcontenttype)()                                                                           |                                                                          |
| public P                                                          | [setReporter](#setreporter)([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)              | Sets the reporter for communicating warnings or errors.                  |
| public P                                                          | [setOptions](#setoptions)([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options) | Sets the language-specific options (e.g., indentation, Unicode support). |
| public [YamlOptions](../YamlOptions.md)                           | [getOptions](#getoptions)()                                                                                   |                                                                          |
| public [Reporter](../../../cascara.common/diagnostic/Reporter.md) | [getReporter](#getreporter)()                                                                                 |                                                                          |



## Field Details

### options

<span style="font-family: monospace; font-size: 80%;">protected YamlOptions __options__</span>




---

### reporter

<span style="font-family: monospace; font-size: 80%;">protected Reporter __reporter__</span>




---


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected abstract P __self__()</span>




---

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public [Properties](../../../cascara.common/util/Properties.md) __getServiceProperties__()</span>




---

### getContentType

<span style="font-family: monospace; font-size: 80%;">public [ContentType](../../../cascara.common/util/ContentType.md) __getContentType__()</span>




---

### setReporter

<span style="font-family: monospace; font-size: 80%;">public P __setReporter__([Reporter](../../../cascara.common/diagnostic/Reporter.md) reporter)</span>

Sets the reporter for communicating warnings or errors.

**Specified By:**

[Processor](../../../cascara.common/lang/processor/Processor.md)


---

### setOptions

<span style="font-family: monospace; font-size: 80%;">public P __setOptions__([LanguageOptions](../../../cascara.common/lang/util/LanguageOptions.md)<?> options)</span>

Sets the language-specific options (e.g., indentation, Unicode support).

**Specified By:**

[Processor](../../../cascara.common/lang/processor/Processor.md)


---

### getOptions

<span style="font-family: monospace; font-size: 80%;">public [YamlOptions](../YamlOptions.md) __getOptions__()</span>




---

### getReporter

<span style="font-family: monospace; font-size: 80%;">public [Reporter](../../../cascara.common/diagnostic/Reporter.md) __getReporter__()</span>




---

