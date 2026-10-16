Package [io.github.qishr.cascara.common.service](index.md)

# Interface ServiceProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.ServiceProvider<br/>
<br/>
All Known Implementing Classes:<br/>
    [ConsoleLogger](../../../../../../io/github/qishr/cascara/common/diagnostic/log/ConsoleLogger.md), [Processor](../../../../../../io/github/qishr/cascara/common/lang/processor/Processor.md), [SourceBuffer](../../../../../../io/github/qishr/cascara/common/lang/util/SourceBuffer.md), [TypeDescriptor](../../../../../../io/github/qishr/cascara/common/type/TypeDescriptor.md), [ContentTypeResolver](../../../../../../io/github/qishr/cascara/common/util/ContentTypeResolver.md), [ResourceProvider](../../../../../../../cascara.common.io/io/github/qishr/cascara/common/io/provider/ResourceProvider.md), [SchemaResolver](../../../../../../../cascara.schema/io/github/qishr/cascara/schema/util/SchemaResolver.md), [SyntaxHighlighter](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/api/SyntaxHighlighter.md), [OptionProvider](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/option/OptionProvider.md), [Renderer](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/api/render/Renderer.md), [SystemMenusService](../../../../../../../cascara.ui/io/github/qishr/cascara/ui/menu/SystemMenusService.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ServiceProvider__</span>


## Field Summary

| Modifier and Type              | Field                                 | Description |
|--------------------------------|---------------------------------------|-------------|
| public static final Properties | [EMPTY_PROPERTIES](#empty_properties) |             |



## Method Summary

| Modifier and Type                                                                                    | Method                                          | Description |
|------------------------------------------------------------------------------------------------------|-------------------------------------------------|-------------|
| public default [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) | [getServiceProperties](#getserviceproperties)() |             |



## Field Details

### EMPTY_PROPERTIES

<span style="font-family: monospace; font-size: 80%;">public static final Properties __EMPTY_PROPERTIES__</span>




---


## Method Details

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public default [Properties](../../../../../../io/github/qishr/cascara/common/property/Properties.md) __getServiceProperties__()</span>




---

