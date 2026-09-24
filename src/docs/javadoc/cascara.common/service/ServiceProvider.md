Package [io.github.qishr.cascara.common.service](index.md)

# Interface ServiceProvider
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.service.ServiceProvider<br/>
<br/>
All Known Implementing Classes:<br/>
    [Processor](../lang/processor/Processor.md), [TypeDescriptor](../lang/type/TypeDescriptor.md), [SourceBuffer](../lang/util/SourceBuffer.md), [ContentTypeResolver](../util/ContentTypeResolver.md), [ResourceProvider](../../cascara.common.io/io/provider/ResourceProvider.md), [SyntaxHighlighter](../../cascara.ui/api/SyntaxHighlighter.md), [OptionProvider](../../cascara.ui/option/OptionProvider.md), [Renderer](../../cascara.ui/api/render/Renderer.md), [SystemMenusService](../../cascara.ui/menu/SystemMenusService.md)


----

<span style="font-family: monospace; font-size: 80%;">public interface __ServiceProvider__</span>


## Field Summary

| Modifier and Type              | Field                                 | Description |
|--------------------------------|---------------------------------------|-------------|
| public static final Properties | [EMPTY_PROPERTIES](#empty_properties) |             |



## Method Summary

| Modifier and Type                                      | Method                                          | Description |
|--------------------------------------------------------|-------------------------------------------------|-------------|
| public default [Properties](../property/Properties.md) | [getServiceProperties](#getserviceproperties)() |             |



## Field Details

### EMPTY_PROPERTIES

<span style="font-family: monospace; font-size: 80%;">public static final Properties __EMPTY_PROPERTIES__</span>




---


## Method Details

### getServiceProperties

<span style="font-family: monospace; font-size: 80%;">public default [Properties](../property/Properties.md) __getServiceProperties__()</span>




---

