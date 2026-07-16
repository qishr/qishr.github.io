# Module cascara.lang.yaml




=== "Exports"

    | Package                                                             | Description                                                                 |
    |---------------------------------------------------------------------|-----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.lang.yaml.annotation](annotation/index.md) |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.ast](ast/index.md)               | The types used to store structure and documentation information of the API. |
    | [io.github.qishr.cascara.lang.yaml.exception](exception/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.processor](processor/index.md)   |                                                                             |
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
    | [io.github.qishr.cascara.lang.yaml.annotation](annotation/index.md) |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.ast](ast/index.md)               | The types used to store structure and documentation information of the API. |
    | [io.github.qishr.cascara.lang.yaml.exception](exception/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.processor](processor/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.token](token/index.md)           |                                                                             |



=== "Provides"

    | Interface                                                                                                      | Implementations                                                                      |
    |----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.lang.processor.AstConverter](../cascara.common/lang/processor/AstConverter.md) | [io.github.qishr.cascara.lang.yaml.processor.YamlConverter](processor/YamlConverter) |
    | [io.github.qishr.cascara.common.lang.processor.Emitter](../cascara.common/lang/processor/Emitter.md)           | [io.github.qishr.cascara.lang.yaml.processor.YamlEmitter](processor/YamlEmitter)     |
    | [io.github.qishr.cascara.common.lang.processor.AstParser](../cascara.common/lang/processor/AstParser.md)       | [io.github.qishr.cascara.lang.yaml.processor.YamlAstParser](processor/YamlAstParser) |
    | [io.github.qishr.cascara.common.lang.processor.Tokenizer](../cascara.common/lang/processor/Tokenizer.md)       | [io.github.qishr.cascara.lang.yaml.processor.YamlTokenizer](processor/YamlTokenizer) |


