# Building Cascara from Source

## Prequisites

- Gradle 9.0 or later is required.
- For the core Cascara modules, JDK 21+ or later is required.
- For **cascara-ui**, JDK 25 and JavaFX are required.




## Gradle Plugins

These Gradle plugins are required by every Cascara module.

### Shared Conventions

`io.github.qishr.cascara-conventions`

Shared conventions for both library and app building.

- Configures JDK version
- Compiler arguments
- Assigning archive name
- JAR manifest configuration
- Populating `build/modulepath`
- Test logging
- Jacoco coverage reporting

### Publishing Conventions

`io.github.qishr.cascara.publish`

Shared conventions for locally publishing Cascara modules.

- Publishing to Maven Local
- Signing
- Configuring POM




## Build Order

### Core Modules

1. **cascara-common**
    - the integration-test subproject depends on cascara-test-common-junit and cascara-logging-log4j
2. **cascara-test-common-junit** (depends on cascara-common)
3. **cascara-logging-log4j** (depends on cascara-common)
4. **cascara-lang-json** (depends on cascara-common)
5. **cascara-lang-yaml** (depends on cascara-common)
6. **cascara-common-io** (depends on cascara-common, cascara-lang-yaml)
    - the integration-test subproject depends on cascara-test-common-junit and cascara-logging-log4j
7. **cascara-schema** (depends on cascara-common, cascara-common-io, cascara-lang-json)
    - the integration-test subproject depends on cascara-test-common-junit and cascara-logging-log4j

### Additional Modules

1. **cascara-lang-xml** (depends on cascara-common)
2. **cascara-format-vsix** (depends on core modules, plus cascara-lang-xml)
3. **cascara-lang-ct** (depends on cascara-common, cascara-common-io, cascara-format-vsix)
4. **cascara-ui** (depends on core modules, plus cascara-lang-xml, cascara-format-vsix)

## Obtaining the Source Code

```bash
git clone https://github.com/qishr/cascara-common.git
git clone https://github.com/qishr/cascara-common-io.git
git clone https://github.com/qishr/cascara-format-vsix.git
git clone https://github.com/qishr/cascara-lang-json.git
git clone https://github.com/qishr/cascara-lang-yaml.git
git clone https://github.com/qishr/cascara-lang-xml.git
git clone https://github.com/qishr/cascara-lang-ct.git
git clone https://github.com/qishr/cascara-logging-log4j.git
git clone https://github.com/qishr/cascara-schema.git
git clone https://github.com/qishr/cascara-test-common-junit.git
git clone https://github.com/qishr/cascara-ui.git
```

## Compiling

This script builds the modules in the correct order:

```bash
#!/bin/zsh

cd cascara-common
./gradlew :cascara-common:build :cascara-common:publishToMavenLocal -x javadoc -x testClasspath -x testJarClasspath -x test || exit 1
cd ..

CASCARA_MODULES=(
"cascara-lang-json"
"cascara-lang-xml"
"cascara-lang-yaml"
"cascara-common-io"
"cascara-schema"
"cascara-format-vsix"
"cascara-lang-ct"
"cascara-ui"
"cascara-logging-log4j"
"cascara-test-common-junit"
)

for mod in "${CASCARA_MODULES[@]}"; do
  cd $mod
  ./gradlew build publishToMavenLocal -x test -x javadoc || exit 1
  cd ..
done
```