# Module cascara.lang.json


Cascara JSON parsers, tokenizer, serializer, and converter.

=== "Exports"

    | Package                                                                                               | Description |
    |-------------------------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.lang.json.ast](io/github/qishr/cascara/lang/json/ast/index.md)               |             |
    | [io.github.qishr.cascara.lang.json.diagnostic](io/github/qishr/cascara/lang/json/diagnostic/index.md) |             |
    | [io.github.qishr.cascara.lang.json.processor](io/github/qishr/cascara/lang/json/processor/index.md)   |             |
    | [io.github.qishr.cascara.lang.json.streaming](io/github/qishr/cascara/lang/json/streaming/index.md)   |             |
    | [io.github.qishr.cascara.lang.json.token](io/github/qishr/cascara/lang/json/token/index.md)           |             |
    | [io.github.qishr.cascara.lang.json.util](io/github/qishr/cascara/lang/json/util/index.md)             |             |


=== "Requires"

    | Module                                                                                        | Description                        |
    |-----------------------------------------------------------------------------------------------|------------------------------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |                                    |
    | [cascara.common](../cascara.common/index.md)                                                  | Cascara common APIs and utilities. |


=== "Opens"

    | Package                                                                                             | Description |
    |-----------------------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.lang.json.processor](io/github/qishr/cascara/lang/json/processor/index.md) |             |



=== "Provides"

    | Interface                                                                                                                             | Implementations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
    |---------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/io/github/qishr/cascara/common/service/ServiceProvider.md) | [io.github.qishr.cascara.lang.json.processor.JsonConverter](io/github/qishr/cascara/lang/json/processor/JsonConverter.md), [io.github.qishr.cascara.lang.json.processor.JsonEmitter](io/github/qishr/cascara/lang/json/processor/JsonEmitter.md), [io.github.qishr.cascara.lang.json.processor.JsonAstParser](io/github/qishr/cascara/lang/json/processor/JsonAstParser.md), [io.github.qishr.cascara.lang.json.processor.JsonTokenizer](io/github/qishr/cascara/lang/json/processor/JsonTokenizer.md), [io.github.qishr.cascara.lang.json.processor.JsonSerializer](io/github/qishr/cascara/lang/json/processor/JsonSerializer.md) |


