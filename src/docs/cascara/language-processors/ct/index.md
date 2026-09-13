# Color Transformation Language

*Pairing the science of color with the art of code*

The CT DSLis a domain-specific language designed for authoring, transforming, and compiling color schemes across arbitrary target formats.

For a fully working example, see cascara-retro-theme's [source code](https://github.com/sandydunlop/cascara-retro-theme/tree/master/src/main/ct).


CT supports:

* **Dynamic Color Transformations**

  Programmatic color manipulation including HSV/HSBA lerping, brightness/saturation scaling, and RGBA blending.

* **Static Function Imports**

  Import static methods from custom Java classes to use as transform functions in CT.

* **Resource and File Imports**

  Module structures using standard file paths and embedded resource schemes like `res://ghostty.ct` via `cascara-common-io`.

* **Format-Agnostic Outputs**

  Target definition parsing to emit theme configurations for VS Code, Ghostty, iTerm2, and other application formats from a single source pipeline.

## Using CT

### Gradle

```groovy
dependencies {
    implementation "io.github.qishr:cascara-common:1.1.13"
    implementation "io.github.qishr:cascara-lang-ct:0.10.0"
}
```

### Building from Source

The source code is on [Github](https://github.com/qishr/cascara-lang-ct).

Once you've cloned the repository, run the following command to build CT:

```bash
./gradlew build nativeCompile publishToMavenLocal
```

This will bukld the CT module, publish it to your local maven repository, and build the ct command. The command will be placed in `ct-command/build/native/nativeCompile/ct`.

Running the command with `-h` or `--help` will cause it to display its usage information:

```bash
./ct-command/build/native/nativeCompile/ct --help
Usage: ct [-hV]
Executes a CT script, sending output to STDOUT or a specified file.
  -h, --help      Show this help message and exit.
  -V, --version   Print version information and exit.
```


## License

[MIT](https://github.com/qishr/cascara-lang-ct/blob/main/LICENSE)

