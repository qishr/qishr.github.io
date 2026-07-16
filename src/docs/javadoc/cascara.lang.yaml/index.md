# Module cascara.lang.yaml




=== "Exports"

    | Package                                                                  | Description                                                                 |
    |--------------------------------------------------------------------------|-----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.lang.yaml](yaml/index.md)                       |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.annotation](yaml/annotation/index.md) |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.ast](yaml/ast/index.md)               | The types used to store structure and documentation information of the API. |
    | [io.github.qishr.cascara.lang.yaml.exception](yaml/exception/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.processor](yaml/processor/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.token](yaml/token/index.md)           |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.util](yaml/util/index.md)             |                                                                             |


=== "Requires"

    | Module                                                                                        | Description |
    |-----------------------------------------------------------------------------------------------|-------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |             |
    | [cascara.common](../cascara.common/index.md)                                                  |             |


=== "Opens"

    | Package                                                                  | Description                                                                 |
    |--------------------------------------------------------------------------|-----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.lang.yaml.annotation](yaml/annotation/index.md) |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.ast](yaml/ast/index.md)               | The types used to store structure and documentation information of the API. |
    | [io.github.qishr.cascara.lang.yaml.exception](yaml/exception/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.processor](yaml/processor/index.md)   |                                                                             |
    | [io.github.qishr.cascara.lang.yaml.token](yaml/token/index.md)           |                                                                             |



=== "Provides"

    | Interface                                                                                                      | Implementations                                                                           |
    |----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.lang.processor.AstConverter](../cascara.common/lang/processor/AstConverter.md) | [io.github.qishr.cascara.lang.yaml.processor.YamlConverter](yaml/processor/YamlConverter) |
    | [io.github.qishr.cascara.common.lang.processor.Emitter](../cascara.common/lang/processor/Emitter.md)           | [io.github.qishr.cascara.lang.yaml.processor.YamlEmitter](yaml/processor/YamlEmitter)     |
    | [io.github.qishr.cascara.common.lang.processor.AstParser](../cascara.common/lang/processor/AstParser.md)       | [io.github.qishr.cascara.lang.yaml.processor.YamlAstParser](yaml/processor/YamlAstParser) |
    | [io.github.qishr.cascara.common.lang.processor.Tokenizer](../cascara.common/lang/processor/Tokenizer.md)       | [io.github.qishr.cascara.lang.yaml.processor.YamlTokenizer](yaml/processor/YamlTokenizer) |


