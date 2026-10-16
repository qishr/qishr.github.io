# Module cascara.schema


JSON Schema compatible schema validator, resolver, generator, compiler, decompiler, and store.

=== "Exports"

    | Package                                                                                         | Description                                                                  |
    |-------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.schema.annotation](io/github/qishr/cascara/schema/annotation/index.md) |                                                                              |
    | [io.github.qishr.cascara.schema.diagnostic](io/github/qishr/cascara/schema/diagnostic/index.md) |                                                                              |
    | [io.github.qishr.cascara.schema.structure](io/github/qishr/cascara/schema/structure/index.md)   |                                                                              |
    | [io.github.qishr.cascara.schema.constraint](io/github/qishr/cascara/schema/constraint/index.md) | Constraints are applied to members variables in classes.                     |
    | [io.github.qishr.cascara.schema.rule](io/github/qishr/cascara/schema/rule/index.md)             | Rules are created by the Schema Compiler when a rule keyword is encountered. |
    | [io.github.qishr.cascara.schema.util](io/github/qishr/cascara/schema/util/index.md)             |                                                                              |


=== "Requires"

    | Module                                                                                        | Description                                                 |
    |-----------------------------------------------------------------------------------------------|-------------------------------------------------------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |                                                             |
    | [cascara.common](../cascara.common/index.md)                                                  | Cascara common APIs and utilities.                          |
    | [cascara.common.io](../cascara.common.io/index.md)                                            | Cascara common IO and content type utilities                |
    | [cascara.lang.json](../cascara.lang.json/index.md)                                            | Cascara JSON parsers, tokenizer, serializer, and converter. |


=== "Opens"

    | Package                                                                             | Description |
    |-------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.schema.util](io/github/qishr/cascara/schema/util/index.md) |             |


=== "Uses"

    | Interface                                                                                                                             | Description |
    |---------------------------------------------------------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/io/github/qishr/cascara/common/service/ServiceProvider.md) |             |



=== "Provides"

    | Interface                                                                                                                             | Implementations                                                                                                                           |
    |---------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/io/github/qishr/cascara/common/service/ServiceProvider.md) | [io.github.qishr.cascara.schema.util.CascaraSchemaResourceProvider](io/github/qishr/cascara/schema/util/CascaraSchemaResourceProvider.md) |


