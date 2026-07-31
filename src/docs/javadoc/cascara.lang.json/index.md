# Module cascara.lang.json




=== "Exports"

    | Package                                                           | Description |
    |-------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.lang.json.ast](ast/index.md)             |             |
    | [io.github.qishr.cascara.lang.json.processor](processor/index.md) |             |
    | [io.github.qishr.cascara.lang.json.streaming](streaming/index.md) |             |
    | [io.github.qishr.cascara.lang.json.token](token/index.md)         |             |
    | [io.github.qishr.cascara.lang.json.util](util/index.md)           |             |


=== "Requires"

    | Module                                                                                        | Description |
    |-----------------------------------------------------------------------------------------------|-------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |             |
    | [cascara.common](../cascara.common/index.md)                                                  |             |
    |                                                                                               |             |


=== "Opens"

    | Package                                                           | Description |
    |-------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.lang.json.processor](processor/index.md) |             |



=== "Provides"

    | Interface                                                                                              | Implementations                                                                                                                                                                                                                                                                                                                                                                                                                            |
    |--------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/service/ServiceProvider.md) | [io.github.qishr.cascara.lang.json.processor.JsonConverter](processor/JsonConverter), [io.github.qishr.cascara.lang.json.processor.JsonEmitter](processor/JsonEmitter), [io.github.qishr.cascara.lang.json.processor.JsonAstParser](processor/JsonAstParser), [io.github.qishr.cascara.lang.json.processor.JsonTokenizer](processor/JsonTokenizer), [io.github.qishr.cascara.lang.json.processor.JsonSerializer](processor/JsonSerializer) |


