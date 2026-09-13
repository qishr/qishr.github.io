# Color Transformation Language

*Pairing the science of color with the art of code*

## CT Module

The CT DSLis a domain-specific language designed for authoring, transforming, and compiling color schemes across arbitrary target formats. It supports:

* **Dynamic Color Transformations**

  Programmatic color manipulation including HSV/HSBA lerping, brightness/saturation scaling, and RGBA blending.

* **Static Function Imports**

  Import static methods from custom Java classes to use as transform functions in CT.

* **Resource and File Imports**

  Module structures using standard file paths and embedded resource schemes like `res://ghostty.ct` via `cascara-common-io`.

* **Format-Agnostic Outputs**

  Target definition parsing to emit theme configurations for VS Code, Ghostty, iTerm2, and other application formats from a single source pipeline.


## Gradle Commands

Build and install locally:

```bash
./gradlew build nativeCompile publishToMavenLocal
```

Run CLI runner directly with -V (version):

```bash
./gradlew :ct-command:run
```

## License

[MIT](https://github.com/qishr/cascara-lang-ct/blob/main/LICENSE)

