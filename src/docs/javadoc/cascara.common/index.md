# Module cascara.common




=== "Exports"

    | Package                                                                    | Description                                                                |
    |----------------------------------------------------------------------------|----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.data](data/index.md)                       |                                                                            |
    | [io.github.qishr.cascara.common.data.reference](data/reference/index.md)   | A reference implementation of the data API                                 |
    | [io.github.qishr.cascara.common.diagnostic](diagnostic/index.md)           |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.code](diagnostic/code/index.md) |                                                                            |
    | [io.github.qishr.cascara.common.lang.annotation](lang/annotation/index.md) |                                                                            |
    | [io.github.qishr.cascara.common.lang.ast](lang/ast/index.md)               |                                                                            |
    | [io.github.qishr.cascara.common.lang.streaming](lang/streaming/index.md)   |                                                                            |
    | [io.github.qishr.cascara.common.lang.exception](lang/exception/index.md)   |                                                                            |
    | [io.github.qishr.cascara.common.lang.processor](lang/processor/index.md)   |                                                                            |
    | [io.github.qishr.cascara.common.lang.reference](lang/reference/index.md)   | A reference implementation of the AST API                                  |
    | [io.github.qishr.cascara.common.lang.semantic](lang/semantic/index.md)     |                                                                            |
    | [io.github.qishr.cascara.common.lang.token](lang/token/index.md)           |                                                                            |
    | [io.github.qishr.cascara.common.lang.type](lang/type/index.md)             | Language-agnostic Primitive type and TypeDescriptor utilities.             |
    | [io.github.qishr.cascara.common.lang.util](lang/util/index.md)             | Language-agnostic lexing, parsing, emitting, serializing, and schema APIs. |
    | [io.github.qishr.cascara.common.semver](semver/index.md)                   |                                                                            |
    | [io.github.qishr.cascara.common.service](service/index.md)                 | Cascara Service Provider Layer                                             |
    | [io.github.qishr.cascara.common.util](util/index.md)                       |                                                                            |


=== "Requires"

    | Module                                                                                        | Description |
    |-----------------------------------------------------------------------------------------------|-------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |             |
    |                                                                                               |             |


=== "Opens"

    | Package                                              | Description |
    |------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.util](util/index.md) |             |


=== "Uses"

    | Interface                                                                            | Description |
    |--------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](service/ServiceProvider.md) |             |



=== "Provides"

    | Interface                                                                                  | Implementations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
    |--------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.lang.type.ScalarDescriptor](lang/type/ScalarDescriptor.md) | [io.github.qishr.cascara.common.lang.type.ByteArrayDescriptor](lang/type/ByteArrayDescriptor), [io.github.qishr.cascara.common.lang.type.InstantTypeDescriptor](lang/type/InstantTypeDescriptor), [io.github.qishr.cascara.common.lang.type.DateTimeTypeDescriptor](lang/type/DateTimeTypeDescriptor), [io.github.qishr.cascara.common.lang.type.PathTypeDescriptor](lang/type/PathTypeDescriptor), [io.github.qishr.cascara.common.lang.type.UriTypeDescriptor](lang/type/UriTypeDescriptor), [io.github.qishr.cascara.common.lang.type.UuidTypeDescriptor](lang/type/UuidTypeDescriptor) |


