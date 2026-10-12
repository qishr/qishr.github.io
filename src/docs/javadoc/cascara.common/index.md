# Module cascara.common




=== "Exports"

    | Package                                                                              | Description                                                                |
    |--------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.annotation](annotation/index.md)                     |                                                                            |
    | [io.github.qishr.cascara.common.color](color/index.md)                               |                                                                            |
    | [io.github.qishr.cascara.common.data](data/index.md)                                 |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic](diagnostic/index.md)                     |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.exception](diagnostic/exception/index.md) |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.format](diagnostic/format/index.md)       |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.log](diagnostic/log/index.md)             |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.message](diagnostic/message/index.md)     |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.report](diagnostic/report/index.md)       |                                                                            |
    | [io.github.qishr.cascara.common.exec](exec/index.md)                                 |                                                                            |
    | [io.github.qishr.cascara.common.exec.ipc](exec/ipc/index.md)                         |                                                                            |
    | [io.github.qishr.cascara.common.filewatcher](filewatcher/index.md)                   |                                                                            |
    | [io.github.qishr.cascara.common.lang.plain](lang/plain/index.md)                     | A intermediate implementation of the AST API                               |
    | [io.github.qishr.cascara.common.lang.ast](lang/ast/index.md)                         |                                                                            |
    | [io.github.qishr.cascara.common.lang.streaming](lang/streaming/index.md)             |                                                                            |
    | [io.github.qishr.cascara.common.lang.diagnostic](lang/diagnostic/index.md)           |                                                                            |
    | [io.github.qishr.cascara.common.lang.processor](lang/processor/index.md)             |                                                                            |
    | [io.github.qishr.cascara.common.lang.semantic](lang/semantic/index.md)               |                                                                            |
    | [io.github.qishr.cascara.common.lang.token](lang/token/index.md)                     |                                                                            |
    | [io.github.qishr.cascara.common.lang.type](lang/type/index.md)                       | Language-agnostic Primitive type and TypeDescriptor utilities.             |
    | [io.github.qishr.cascara.common.lang.util](lang/util/index.md)                       | Language-agnostic lexing, parsing, emitting, serializing, and schema APIs. |
    | [io.github.qishr.cascara.common.property](property/index.md)                         |                                                                            |
    | [io.github.qishr.cascara.common.semver](semver/index.md)                             |                                                                            |
    | [io.github.qishr.cascara.common.service](service/index.md)                           | Cascara Service Provider Layer (SPL)                                       |
    | [io.github.qishr.cascara.common.trackable](trackable/index.md)                       |                                                                            |
    | [io.github.qishr.cascara.common.trackable.property](trackable/property/index.md)     |                                                                            |
    | [io.github.qishr.cascara.common.trackable.tracker](trackable/tracker/index.md)       |                                                                            |
    | [io.github.qishr.cascara.common.util](util/index.md)                                 |                                                                            |


=== "Requires"

    | Module                                                                                                    | Description |
    |-----------------------------------------------------------------------------------------------------------|-------------|
    | [java.management](https://docs.oracle.com/en/java/javase/24/docs/api/java.management/module-summary.html) |             |
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html)             |             |
    | [jdk.unsupported](https://docs.oracle.com/en/java/javase/24/docs/api/jdk.unsupported/module-summary.html) |             |


=== "Opens"

    | Package                                                                  | Description                                  |
    |--------------------------------------------------------------------------|----------------------------------------------|
    | [io.github.qishr.cascara.common.data](data/index.md)                     |                                              |
    | [io.github.qishr.cascara.common.diagnostic](diagnostic/index.md)         |                                              |
    | [io.github.qishr.cascara.common.lang.plain](lang/plain/index.md)         | A intermediate implementation of the AST API |
    | [io.github.qishr.cascara.common.lang.processor](lang/processor/index.md) |                                              |
    | [io.github.qishr.cascara.common.property](property/index.md)             |                                              |
    | [io.github.qishr.cascara.common.trackable](trackable/index.md)           |                                              |
    | [io.github.qishr.cascara.common.util](util/index.md)                     |                                              |


=== "Uses"

    | Interface                                                                            | Description |
    |--------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](service/ServiceProvider.md) |             |



=== "Provides"

    | Interface                                                                            | Implementations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
    |--------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](service/ServiceProvider.md) | [io.github.qishr.cascara.common.lang.type.ByteArrayDescriptor](lang/type/ByteArrayDescriptor), [io.github.qishr.cascara.common.lang.type.InstantDescriptor](lang/type/InstantDescriptor), [io.github.qishr.cascara.common.lang.type.ZonedDateTimeDescriptor](lang/type/ZonedDateTimeDescriptor), [io.github.qishr.cascara.common.lang.type.LocalDateTimeDescriptor](lang/type/LocalDateTimeDescriptor), [io.github.qishr.cascara.common.lang.type.PathDescriptor](lang/type/PathDescriptor), [io.github.qishr.cascara.common.lang.type.UriDescriptor](lang/type/UriDescriptor), [io.github.qishr.cascara.common.lang.type.UuidDescriptor](lang/type/UuidDescriptor), [io.github.qishr.cascara.common.lang.util.SourceStringBuffer](lang/util/SourceStringBuffer), [io.github.qishr.cascara.common.lang.util.SourceInputStreamBuffer](lang/util/SourceInputStreamBuffer) |


