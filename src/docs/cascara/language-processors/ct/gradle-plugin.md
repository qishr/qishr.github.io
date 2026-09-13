# CT Gradle Plugin

The CT Gradle plugin (`io.github.qishr.cascara-gradle-plugins.ct`) provides first-class support for compiling `.ct` files as part of standard Gradle build routines.

## Configuration Example

Configure formats and themes declaratively in `build.gradle`:

```groovy
plugins {
    id 'io.github.qishr.cascara-gradle-plugins.ct' version '0.1.0'
}
```

```groovy
    --8<-- "build-ct.gradle"
```

The plugin dynamically generates task providers for each target format and theme (e.g., compileCtVscodeRetroAmberOnBrightBeige) and binds them to the aggregate compilation lifecycle.

## Gradle Commands

Build and install locally:

Compile all configured CT themes across formats:

```bash
./gradlew compileAllCt
```

Build the entire project including theme compilation:

```bash
./gradlew build
```