# Module cascara.common




=== "Exports"

    | Package                                                                                                             | Description                                                                |
    |---------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.annotation](io/github/qishr/cascara/common/annotation/index.md)                     |                                                                            |
    | [io.github.qishr.cascara.common.color](io/github/qishr/cascara/common/color/index.md)                               |                                                                            |
    | [io.github.qishr.cascara.common.data](io/github/qishr/cascara/common/data/index.md)                                 |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic](io/github/qishr/cascara/common/diagnostic/index.md)                     |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.exception](io/github/qishr/cascara/common/diagnostic/exception/index.md) |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.format](io/github/qishr/cascara/common/diagnostic/format/index.md)       |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.log](io/github/qishr/cascara/common/diagnostic/log/index.md)             |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.message](io/github/qishr/cascara/common/diagnostic/message/index.md)     |                                                                            |
    | [io.github.qishr.cascara.common.diagnostic.report](io/github/qishr/cascara/common/diagnostic/report/index.md)       |                                                                            |
    | [io.github.qishr.cascara.common.exec](io/github/qishr/cascara/common/exec/index.md)                                 |                                                                            |
    | [io.github.qishr.cascara.common.exec.ipc](io/github/qishr/cascara/common/exec/ipc/index.md)                         |                                                                            |
    | [io.github.qishr.cascara.common.filewatcher](io/github/qishr/cascara/common/filewatcher/index.md)                   |                                                                            |
    | [io.github.qishr.cascara.common.lang.plain](io/github/qishr/cascara/common/lang/plain/index.md)                     | A intermediate implementation of the AST API                               |
    | [io.github.qishr.cascara.common.lang.ast](io/github/qishr/cascara/common/lang/ast/index.md)                         |                                                                            |
    | [io.github.qishr.cascara.common.lang.streaming](io/github/qishr/cascara/common/lang/streaming/index.md)             |                                                                            |
    | [io.github.qishr.cascara.common.lang.diagnostic](io/github/qishr/cascara/common/lang/diagnostic/index.md)           |                                                                            |
    | [io.github.qishr.cascara.common.lang.processor](io/github/qishr/cascara/common/lang/processor/index.md)             |                                                                            |
    | [io.github.qishr.cascara.common.lang.semantic](io/github/qishr/cascara/common/lang/semantic/index.md)               |                                                                            |
    | [io.github.qishr.cascara.common.lang.token](io/github/qishr/cascara/common/lang/token/index.md)                     |                                                                            |
    | [io.github.qishr.cascara.common.lang.type](io/github/qishr/cascara/common/lang/type/index.md)                       | Language-agnostic Primitive type and TypeDescriptor utilities.             |
    | [io.github.qishr.cascara.common.lang.util](io/github/qishr/cascara/common/lang/util/index.md)                       | Language-agnostic lexing, parsing, emitting, serializing, and schema APIs. |
    | [io.github.qishr.cascara.common.property](io/github/qishr/cascara/common/property/index.md)                         |                                                                            |
    | [io.github.qishr.cascara.common.semver](io/github/qishr/cascara/common/semver/index.md)                             |                                                                            |
    | [io.github.qishr.cascara.common.service](io/github/qishr/cascara/common/service/index.md)                           | Cascara Service Provider Layer (SPL)                                       |
    | [io.github.qishr.cascara.common.trackable](io/github/qishr/cascara/common/trackable/index.md)                       |                                                                            |
    | [io.github.qishr.cascara.common.trackable.property](io/github/qishr/cascara/common/trackable/property/index.md)     |                                                                            |
    | [io.github.qishr.cascara.common.trackable.tracker](io/github/qishr/cascara/common/trackable/tracker/index.md)       |                                                                            |
    | [io.github.qishr.cascara.common.util](io/github/qishr/cascara/common/util/index.md)                                 |                                                                            |


=== "Requires"

    | Module                                                                                                    | Description |
    |-----------------------------------------------------------------------------------------------------------|-------------|
    | [java.management](https://docs.oracle.com/en/java/javase/24/docs/api/java.management/module-summary.html) |             |
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html)             |             |
    | [jdk.unsupported](https://docs.oracle.com/en/java/javase/24/docs/api/jdk.unsupported/module-summary.html) |             |


=== "Opens"

    | Package                                                                                                 | Description                                  |
    |---------------------------------------------------------------------------------------------------------|----------------------------------------------|
    | [io.github.qishr.cascara.common.data](io/github/qishr/cascara/common/data/index.md)                     |                                              |
    | [io.github.qishr.cascara.common.diagnostic](io/github/qishr/cascara/common/diagnostic/index.md)         |                                              |
    | [io.github.qishr.cascara.common.lang.plain](io/github/qishr/cascara/common/lang/plain/index.md)         | A intermediate implementation of the AST API |
    | [io.github.qishr.cascara.common.lang.processor](io/github/qishr/cascara/common/lang/processor/index.md) |                                              |
    | [io.github.qishr.cascara.common.property](io/github/qishr/cascara/common/property/index.md)             |                                              |
    | [io.github.qishr.cascara.common.trackable](io/github/qishr/cascara/common/trackable/index.md)           |                                              |
    | [io.github.qishr.cascara.common.util](io/github/qishr/cascara/common/util/index.md)                     |                                              |


=== "Uses"

    | Interface                                                                                                           | Description |
    |---------------------------------------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](io/github/qishr/cascara/common/service/ServiceProvider.md) |             |



=== "Provides"

    | Interface                                                                                                           | Implementations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
    |---------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](io/github/qishr/cascara/common/service/ServiceProvider.md) | [io.github.qishr.cascara.common.lang.type.ByteArrayDescriptor](io/github/qishr/cascara/common/lang/type/ByteArrayDescriptor.md), [io.github.qishr.cascara.common.lang.type.InstantDescriptor](io/github/qishr/cascara/common/lang/type/InstantDescriptor.md), [io.github.qishr.cascara.common.lang.type.ZonedDateTimeDescriptor](io/github/qishr/cascara/common/lang/type/ZonedDateTimeDescriptor.md), [io.github.qishr.cascara.common.lang.type.LocalDateTimeDescriptor](io/github/qishr/cascara/common/lang/type/LocalDateTimeDescriptor.md), [io.github.qishr.cascara.common.lang.type.PathDescriptor](io/github/qishr/cascara/common/lang/type/PathDescriptor.md), [io.github.qishr.cascara.common.lang.type.UriDescriptor](io/github/qishr/cascara/common/lang/type/UriDescriptor.md), [io.github.qishr.cascara.common.lang.type.UuidDescriptor](io/github/qishr/cascara/common/lang/type/UuidDescriptor.md), [io.github.qishr.cascara.common.lang.util.SourceStringBuffer](io/github/qishr/cascara/common/lang/util/SourceStringBuffer.md), [io.github.qishr.cascara.common.lang.util.SourceInputStreamBuffer](io/github/qishr/cascara/common/lang/util/SourceInputStreamBuffer.md) |


