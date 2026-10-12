# Module cascara.schema




=== "Exports"

    | Package                                                          | Description                                                                  |
    |------------------------------------------------------------------|------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.schema.annotation](annotation/index.md) |                                                                              |
    | [io.github.qishr.cascara.schema.diagnostic](diagnostic/index.md) |                                                                              |
    | [io.github.qishr.cascara.schema.structure](structure/index.md)   |                                                                              |
    | [io.github.qishr.cascara.schema.constraint](constraint/index.md) | Constraints are applied to members variables in classes.                     |
    | [io.github.qishr.cascara.schema.rule](rule/index.md)             | Rules are created by the Schema Compiler when a rule keyword is encountered. |
    | [io.github.qishr.cascara.schema.util](util/index.md)             |                                                                              |


=== "Requires"

    | Module                                                                                        | Description |
    |-----------------------------------------------------------------------------------------------|-------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |             |
    | [cascara.common](../cascara.common/index.md)                                                  |             |
    | [cascara.common.io](../cascara.common.io/index.md)                                            |             |
    | [cascara.lang.json](../cascara.lang.json/index.md)                                            |             |


=== "Opens"

    | Package                                              | Description |
    |------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.schema.util](util/index.md) |             |


=== "Uses"

    | Interface                                                                                              | Description |
    |--------------------------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/service/ServiceProvider.md) |             |



=== "Provides"

    | Interface                                                                                              | Implementations                                                                                         |
    |--------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/service/ServiceProvider.md) | [io.github.qishr.cascara.schema.util.CascaraSchemaResourceProvider](util/CascaraSchemaResourceProvider) |


