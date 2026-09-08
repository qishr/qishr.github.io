# Module cascara.lang.yaml




=== "Exports"

    | Package                                                             | Description                                                                 |
    |---------------------------------------------------------------------|-----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.lang.yaml.ast](ast/index.md)               | The types used to store structure and documentation information of the API. |
    | [io.github.qishr.cascara.lang.yaml.diagnostic](diagnostic/index.md) |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.processor](processor/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.streaming](streaming/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.token](token/index.md)           |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.util](util/index.md)             |                                                                             |


=== "Requires"

    | Module                                                                                        | Description |
    |-----------------------------------------------------------------------------------------------|-------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |             |
    | [cascara.common](../cascara.common/index.md)                                                  |             |


=== "Opens"

    | Package                                                             | Description                                                                 |
    |---------------------------------------------------------------------|-----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.lang.yaml.ast](ast/index.md)               | The types used to store structure and documentation information of the API. |
    | [io.github.qishr.cascara.lang.yaml.diagnostic](diagnostic/index.md) |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.processor](processor/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.token](token/index.md)           |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.util](util/index.md)             |                                                                             |



=== "Provides"

    | Interface                                                                                              | Implementations                                                                                                                                                                                                                                                  |
    |--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/service/ServiceProvider.md) | [io.github.qishr.cascara.lang.yaml.processor.YamlConverter](processor/YamlConverter), [io.github.qishr.cascara.lang.yaml.processor.YamlAstParser](processor/YamlAstParser), [io.github.qishr.cascara.lang.yaml.processor.YamlTokenizer](processor/YamlTokenizer) |


