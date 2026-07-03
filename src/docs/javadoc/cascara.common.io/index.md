# Module cascara.common.io




=== "Exports"

    | Package                                                                  | Description |
    |--------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.content](content/index.md)               |             |
    | [io.github.qishr.cascara.common.content.type](content/type/index.md)     |             |
    | [io.github.qishr.cascara.common.io](io/index.md)                         |             |
    | [io.github.qishr.cascara.common.io.filewatcher](io/filewatcher/index.md) |             |
    | [io.github.qishr.cascara.common.io.provider](io/provider/index.md)       |             |


=== "Requires"

    | Module                                                                                                | Description |
    |-------------------------------------------------------------------------------------------------------|-------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html)         |             |
    | [java.net.http](https://docs.oracle.com/en/java/javase/24/docs/api/java.net.http/module-summary.html) |             |
    | [cascara.common](../cascara.common/index.md)                                                          |             |
    | [cascara.lang.yaml](../cascara.lang.yaml/index.md)                                                    |             |


=== "Opens"

    | Package                                                    | Description |
    |------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.content](content/index.md) |             |


=== "Uses"

    | Interface                                                                                              | Description |
    |--------------------------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/service/ServiceProvider.md) |             |



=== "Provides"

    | Interface                                                                                      | Implementations                                                                                                                                                                                                                                                                                                                                                                                                        |
    |------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.common.io.provider.ResourceProvider](io/provider/ResourceProvider.md) | [io.github.qishr.cascara.common.io.provider.CascaraResourceProvider](io/provider/CascaraResourceProvider), [io.github.qishr.cascara.common.io.provider.FileResourceProvider](io/provider/FileResourceProvider), [io.github.qishr.cascara.common.io.provider.HttpResourceProvider](io/provider/HttpResourceProvider), [io.github.qishr.cascara.common.io.provider.ResResourceProvider](io/provider/ResResourceProvider) |


