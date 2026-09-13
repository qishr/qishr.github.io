# Color Transformation Language

*Pairing the science of color with the art of code*

The CT DSLis a domain-specific language designed for authoring, transforming, and compiling color schemes across arbitrary target formats.

For a fully working example, see cascara-retro-theme's [CT source code](https://github.com/sandydunlop/cascara-retro-theme/tree/master/src/main/ct).

CT supports:

* **Dynamic Color Transformations**

  Programmatic color manipulation including HSV/HSBA lerping, brightness/saturation scaling, and RGBA blending.

* **Static Function Imports**

  Import static methods from custom Java classes to use as transform functions in CT.

* **Resource and File Imports**

  Module structures using standard file paths and embedded resource schemes like `res://ghostty.ct` via `cascara-common-io`.

* **Format-Agnostic Outputs**

  Target definition parsing to emit theme configurations for VS Code, Ghostty, iTerm2, and other application formats from a single source pipeline.



## License

[MIT](https://github.com/qishr/cascara-lang-ct/blob/main/LICENSE)

