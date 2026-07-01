---
template: home.html
hide:
  - navigation
  - toc
---

Cascara is a Java platform for building desktop applications that work with structured data — designed from the ground up as a cohesive whole, rather than a collection of loosely connected libraries.

At its foundation are full-pipeline language processors for YAML, JSON, and XML. Each one is implemented from scratch, with a stream-centric architecture that keeps cold-start overhead low and throughput high — even on complex, anchor-heavy documents. Above that sits a rich schema layer that handles validation, type analysis, and schema compilation, with localization support for JSON Schemas and compatibility with standards like OpenAPI.

Holding it all together is a service architecture built on the Java Platform Module System, supporting runtime loading and unloading of modules, layered security, and fine-grained capability-based service discovery. Finding the right provider for a job is as simple as:

```java
layer.findProvider(serviceType, capabilityPredicate);
```

The UI layer is a JavaFX framework with a theming engine that loads VS Code `.vsix` themes, giving applications access to a rich ecosystem of community-created themes without any extra work. Schema-driven form rendering means that UI controls can be generated directly from your data model, and observable bindings keep everything in sync.

Internationalization is a first-class concern throughout. Languages and themes can be switched at runtime without restarting — menus, drop-down lists, translated enum values, and locale-aware formatting all update live. RTL languages are fully supported, with automatic layout mirroring, as you would expect from a platform built for the world rather than just one corner of it.

---

Continue reading...

- [Theme Engine](cascara/ui/theme-engine/)
- Renderer
- [Language Processors Collection](cascara/language-processors/)
- [Localizable Menus](cascara/ui/localizable-menus)
- [Service Provider Layer](cascara/service-provider-layer/)
- Language-Agnostic JSON Schema
- [Schema-Driven Controls](cascara/ui/schema-driven-controls)
