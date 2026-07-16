# Cascara YAML

Cascara YAML is a strict, streaming‑capable YAML processor built for language tooling, configuration systems, and environments where predictable structure and reliable diagnostics matter. It implements the full YAML pipeline on top of Cascara’s AST model, including tokenization, parsing, event streaming, serialization, and generic‑aware deserialization.

Cascara YAML does not wrap SnakeYAML or any external library. It provides its own tokenizer, parser, AST, emitter, and serializer. This gives Cascara YAML complete control over indentation rules, scalar forms, sequence and mapping structure, whitespace, anchors, and error reporting. The processor is designed for systems that need deterministic behavior rather than permissive parsing.

The YAML tokenizer is streaming‑oriented and supports lookahead, backup, and token‑window tracking. The parser produces a stable AST that reflects YAML’s structural model without collapsing nodes prematurely. The emitter generates canonical YAML output with optional formatting controls. The serializer converts between AST and JVM objects using Cascara’s reflection model, annotation system, and type descriptors.

Cascara YAML supports full generic deserialization. Collections, maps, nested generics, wildcards, and type variables are resolved at runtime without reflection hacks. Custom type descriptors and scalar descriptors integrate cleanly with the serializer, allowing domain‑specific types to participate in the same pipeline as standard JVM types.

Cascara YAML is designed for environments where correctness, clarity, and architectural consistency matter. It is not a drop‑in replacement for permissive YAML libraries; it is a language‑tooling‑grade processor built for systems that require strict mode behavior, predictable structure, and full control over the YAML pipeline.


[Performance Comparison](performance-comparison.md)

[YAML Specification](https://yaml.org/spec/)
