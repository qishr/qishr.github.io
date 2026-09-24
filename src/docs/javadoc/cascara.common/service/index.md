
# Package io.github.qishr.cascara.common.service


Cascara Service Provider Layer (SPL)Method names

Methods in the [ServiceProviderLayer](ServiceProviderLayer.md) and [ServiceProviderRoot](ServiceProviderRoot.md) interfaces
are split into categories:

**Find in All Layers**

The *find* methods return a service provider or list of providers from the
SPL hierarchy.
They start at the layer they're called from, search all layers up to the root layer,
then search branch layers. The first matching provider is returned.

- `ServiceMetadata findProvider(Class<? extends ServiceProvider> serviceType)`
- `ServiceMetadata findProvider(Class<? extends ServiceProvider> serviceType, Predicate<ServiceMetadata> capabilityPredicate)`
- `Set<Class<ServiceProvider>> findServiceTypes()`
- `Set<ServiceMetadata> findServices()`
- `List<ServiceMetadata> findAllProviders(Class<? extends ServiceProvider> serviceType)`
- `List<ServiceMetadata> findAllProviders(Class<? extends ServiceProvider> serviceType, Predicate<ServiceMetadata> capabilityPredicate)`

**Get from Specific Layer**

The *get* methods return a service provider or list of service providers from the current layer.

- `ServiceMetadata getProvider(String providerName)`
- `Collection<ServiceMetadata> getProviders()`
- `Collection<ServiceMetadata> getProvidersByFqcn()`
- `List<ServiceMetadata> getProviders(Class<? extends ServiceProvider> serviceType)`
- `List<ServiceMetadata> getProviders(Class<? extends ServiceProvider> serviceType, Predicate<ServiceMetadata> capabilityPredicate)`

- `boolean hasProvider(String name)`

**Layer metadata, hierarchy, creation and deletion**

**Provider Registration in Specific Layer**

**Load**

These static methods return an instance of a serive provider.

- `<T> loadProvider(Class<T> serviceType, ServiceMetadata metadata)`
- `<T> loadDefault(Class<T> serviceType)`

**Instantiate**

A convenience method for instantiating provider classes.

- `instantiateProvider(Class<T> providerClass)`

=== "All Classes and Interfaces"

    | Class                                                               | Description |
    |---------------------------------------------------------------------|-------------|
    | [AbstractServiceProviderFactory](AbstractServiceProviderFactory.md) |             |
    | [CapabilityQueries](CapabilityQueries.md)                           |             |
    | [ContentTypeProvider](ContentTypeProvider.md)                       |             |
    | [ServiceDiagnosticCode](ServiceDiagnosticCode.md)                   |             |
    | [ServiceException](ServiceException.md)                             |             |
    | [ServiceMetadata](ServiceMetadata.md)                               |             |
    | [ServiceProvider](ServiceProvider.md)                               |             |
    | [ServiceProviderFactory](ServiceProviderFactory.md)                 |             |
    | [ServiceProviderLayer](ServiceProviderLayer.md)                     |             |
    | [ServiceProviderRoot](ServiceProviderRoot.md)                       |             |


=== "Interfaces"

    | Class                                           | Description |
    |-------------------------------------------------|-------------|
    | [ContentTypeProvider](ContentTypeProvider.md)   |             |
    | [ServiceProvider](ServiceProvider.md)           |             |
    | [ServiceProviderLayer](ServiceProviderLayer.md) |             |
    | [ServiceProviderRoot](ServiceProviderRoot.md)   |             |


=== "Classes"

    | Class                                                               | Description |
    |---------------------------------------------------------------------|-------------|
    | [AbstractServiceProviderFactory](AbstractServiceProviderFactory.md) |             |
    | [CapabilityQueries](CapabilityQueries.md)                           |             |
    | [ServiceException](ServiceException.md)                             |             |
    | [ServiceMetadata](ServiceMetadata.md)                               |             |
    | [ServiceProviderFactory](ServiceProviderFactory.md)                 |             |


=== "Enum Classes"

    | Class                                             | Description |
    |---------------------------------------------------|-------------|
    | [ServiceDiagnosticCode](ServiceDiagnosticCode.md) |             |


