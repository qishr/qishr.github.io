# Cascara Language Processors Collection

The Cascara language processors collection is a set of modules that provide:

- [Tokenizers](#tokenizers)
- [Parsers](#parsers)
- [Emitters](#emitters)
- [Serializers](#serializers)
- [Converters](#converters)

Currently supported languages are:

- [JSON](json/)
- [XML](xml/)
- [YAML](yaml/)

## Gradle

*Cascara Language Processors* and *Cascara Common* are available in the [Maven Central](https://mvnrepository.com/artifact/io.github.qishr) repository.

To use them in a Gradle project, add the following dependencies:

```groovy
--8<-- "build-lang.gradle"
```

## Examples

The examples shown here are available in the [cascara-docs-examples-lang](https://github.com/qishr/cascara-docs-examples-lang) Github repository.

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

#### Pull Parser

[javadoc](https://qishr.github.io/javadoc/cascara.common/lang/processor/PullParser)

=== "YAML"
    ```java
    --8<-- "examples/yaml/SimplePullParse.java"
    ```

#### Push Parser

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

