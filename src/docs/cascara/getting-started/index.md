# Getting Started with Cascara

*Cascara* is available in the [Maven Central](https://mvnrepository.com/artifact/io.github.qishr) repository.

The source code can be found on [GitHub](https://github.com/qishr/).

*Cascara* is open source, and is licensed under the Apache 2.0 terms.

## Cascara Core

*Cascara Core* is the set of *Cascara* modules that do not have an GUI requirements.

To use *Cascara Core* in a your project, add the following dependencies:

=== "Gradle"
    ```groovy
    --8<-- "build-lang.gradle"
    ```
=== "Maven"
    ```xml
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-common</artifactId>
        <version>1.1.4</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-common-io</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-lang-json</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-lang-xml</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-lang-yaml</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-schema</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    ```

## Cascara UI

*Cascara UI* can be used in projects that use JavaFX.

To use *Cascara UI* in a your project, add the following dependencies:

=== "Gradle"
    ```groovy
    --8<-- "build-ui.gradle"
    ```
=== "Maven"
    ```xml
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-common</artifactId>
        <version>1.1.4</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-common-io</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-lang-json</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-lang-xml</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-lang-yaml</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-schema</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.github.qishr</groupId>
        <artifactId>cascara-ui</artifactId>
        <version>0.4.0</version>
        <scope>runtime</scope>
    </dependency>
    ```