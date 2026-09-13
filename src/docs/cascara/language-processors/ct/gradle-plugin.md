# CT Gradle Plugin

The CT Gradle plugin (`io.github.qishr.cascara-gradle-plugins.ct`) provides first-class support for compiling `.ct` files as part of standard Gradle build routines.

## Configuration Example

This example is based on the code in [cascara-retro-theme](https://github.com/sandydunlop/cascara-retro-theme/blob/master/build.gradle).

### build.gradle

The relevant parts of cascara-retro-theme's `build.gradle` are:

**Thesee lines from the `plugins` block:**

```groovy
plugins {
    id 'base'
    id 'io.github.qishr.cascara-gradle-plugins.ct' version '0.1.0'
}
```

**The `ct` block:**

```groovy
--8<-- "build-ct.gradle"
```

In this example, `ghostty`, `iterm2`, and `vscode` are **formats**, while `retroAmber`, `retroGreen`, `retroAmberOnBrightBeige`, etc are **configurations**. The names of the **formats** must match the name of a [`Format` declaration](types.md#format) in the source set.

The name of each **format** will be used as an output directory name under `build/themes`.

Each **configuration** specifies options which will be passed as arguments to the `ct` compiler. In this example, we only use the `entry` options which specifies the "main" `.ct` file for the configuration. Other options include:

- `output`: speicifies a file name to override the default output file name
- `verbose`: set to *true* or *false* to enable or disable verbose output

### Source Sets

`ct` has a source set, similar to Java. The default source set path is: `src/main/ct`.
Any arrangement of `.ct` source files can exist within the source set. For each **configuration** under a **format** in the `ct` Gradle block, an `entry` is specified. This `entry` must be the exact relative path to a `.ct` source file within the source set.

See [language reference](language-reference.md) for information on how to write `.ct` source files.

### Compiling

To compile the CT files into the specified theme formats, simply run:

```bash
./gradle build
```

The plugin dynamically generates task providers for each format and configuration and binds them to the aggregate compilation lifecycle. The following files are produced:

```
build
└── themes
    ├── ghostty
    │   ├── retro-amber.conf
    │   └── retro-green.conf
    ├── iterm2
    │   ├── retro-amber.itermcolors
    │   └── retro-green.itermcolors
    └── vscode
        ├── retro-amber-on-bright-beige.json
        ├── retro-amber-on-dull-beige.json
        ├── retro-amber-on-heavy-metal.json
        ├── retro-green-on-bright-beige.json
        ├── retro-green-on-dull-beige.json
        └── retro-green-on-heavy-metal.json
```
