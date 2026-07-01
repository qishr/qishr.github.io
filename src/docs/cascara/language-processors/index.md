# Cascara Language Processors Collection

The Cascara language processors collection is a set of modules that provide [high performance](/cascara/language-processors/yaml/performance-comparison/) and [extensible](/cascara/language-processors/extensible-design/type-descriptors/) language tools.

The collection is currently under development, with YAML being the most mature implementation.

|                                                     | YAML             | JSON                | XML                 |
| --------------------------------------------------- | ---------------- | ------------------- | ------------------- |
| **[Tokenizer](#tokenizers)**                        | :material-check: | :material-check:    | :material-check:    |
| **[AST Parser](#ast-parser)**                       | :material-check: | :material-check:    | :octicons-tools-24: |
| **[Streaming Push Parser](#streaming-push-parser)** | :material-check: | :octicons-tools-24: |                     |
| **[Streaming Pull Parser](#streaming-pull-parser)** | :material-check: | :octicons-tools-24: |                     |
| **[Emitter](#emitters)**                            | :material-check: | :material-check:    |                     |
| **[Serializer](#serializers)**                      | :material-check: | :material-check:    |                     |
| **[Converter](#converters)**                        | :material-check: | :material-check:    |                     |

*Cascara Language Processors* and *Cascara Common* are available in the [Maven Central](https://mvnrepository.com/artifact/io.github.qishr) repository.

For installation, see [Getting Started](/cascara/getting-started/).

## Examples

The examples shown here are available in the [cascara-docs-examples](https://github.com/qishr/cascara-docs-examples) Github repository under `examples/lang`.

### Tokenizers

[javadoc](https://qishr.github.io/javadoc/cascara.common/lang/processor/Tokenizer)

=== "JSON"
    ```java
    --8<-- "examples/json/SimpleTokenize.java"
    ```
=== "XML"
    ```java
    --8<-- "examples/xml/SimpleTokenize.java"
    ```
=== "YAML"
    ```java
    --8<-- "examples/yaml/SimpleTokenize.java"
    ```

### Parsers

#### AST Parser

[javadoc](https://qishr.github.io/javadoc/cascara.common/lang/processor/AstParser)

=== "Factory"
    ```java
    --8<-- "examples/factory/SimpleAstParse.java"
    ```
=== "JSON"
    ```java
    --8<-- "examples/json/SimpleAstParse.java"
    ```
=== "YAML"
    ```java
    --8<-- "examples/yaml/SimpleAstParse.java"
    ```

#### Streaming Pull Parser

[javadoc](https://qishr.github.io/javadoc/cascara.common/lang/processor/PullParser)

=== "YAML"
    ```java
    --8<-- "examples/yaml/SimplePullParse.java"
    ```

#### Streaming Push Parser

[javadoc](https://qishr.github.io/javadoc/cascara.common/lang/processor/PushParser)

=== "YAML"
    ```java
    --8<-- "examples/yaml/SimplePushParse.java"
    ```

### Serializers

[javadoc](https://qishr.github.io/javadoc/cascara.common/lang/processor/Serializer)

=== "JSON"
    ```java
    --8<-- "examples/json/SimpleSerialize.java"
    ```
=== "YAML"
    ```java
    --8<-- "examples/yaml/SimpleSerialize.java"
    ```

### Emitters

*Examples coming shortly*

### Converters

*Examples coming shortly*

## Comparison with Jackson

| **Cascara**                                                                                                                                                                       | **Jackson**                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| [Type Descriptors & Type Serializers](extensible-design/type-descriptors.md)                                                                                                      | [Third-party datatype modules](https://github.com/FasterXML/jackson#third-party-datatype-modules) |
| [Cascara Annotations](https://qishr.github.io/javadoc/cascara.common/lang/annotation/)                                                                                            | [Jackson Core: Annotations](https://github.com/FasterXML/jackson-annotations/wiki)                |
| [Cascara Serializers](https://qishr.github.io/javadoc/cascara.common/lang/processor/Serializer/)                                                                                  | [Jackson Core: Databind](https://github.com/FasterXML/jackson-databind/wiki)                      |
| [PushParser](https://qishr.github.io/javadoc/cascara.common/lang/processor/PushParser/) & [PullParser](https://qishr.github.io/javadoc/cascara.common/lang/processor/PullParser/) | [Streaming](https://github.com/FasterXML/jackson-core/wiki)                                       |
