# VSIX Gradle Plugin

The **Cascara VSIX Gradle Plugin** provides a declarative, imperative-free domain DSL to package Visual Studio Code extensions (`.vsix` files) without needing custom script copying, regex manifest stamping, or manual Open Packaging Conventions (`[Content_Types].xml`) overhead.

### Features

- **Declarative DSL**

  Configure package metadata (`publisher`, `engines`, `repository`, etc.) directly inside Gradle.

- **In-Memory Manifest Generation**

  Automatically manages `package.json`, `extension.vsixmanifest`, and `[Content_Types].xml`.

- **Dynamic Theme Indexing**

  Scans compiled themes and injects contributions into `package.json` with correct UI metadata (`vs-light` / `vs-dark`).

- **VS Code Integration**

  Built-in tasks to install, uninstall, and reinstall the generated VSIX directly into Visual Studio Code.


## Example

This example is based on the code in [cascara-retro-theme](https://github.com/sandydunlop/cascara-retro-theme/blob/master/build.gradle).

### Build File

The relevant parts of cascara-retro-theme's `build.gradle` are:

**These lines from the `plugins` block:**

```groovy
plugins {
    id 'base'
    id 'io.github.qishr.cascara-gradle-plugins.vsix' version '0.1.0'
}
```

**The `vsix` block:**

```groovy
vsix {
    name        = "cascara-retro-theme"
    displayName = "Cascara Retro Theme"
    description = "Retro theme pack for Visual Studio Code"
    version     = project.version.toString()
    publisher   = "Cascara"
    icon        = "images/icon.png"

    categories "Themes"

    engines = [
        "vscode": "^1.103.0"
    ]

    repository = [
        "type": "git",
        "url" : "git+https://github.com/sandydunlop/cascara-retro-theme.git"
    ]

    readme      = layout.projectDirectory.file("README.md")
    license     = layout.projectDirectory.file("LICENSE")
    changeLog   = layout.projectDirectory.file("CHANGELOG.md")
    imagesDir   = layout.projectDirectory.dir("src/main/resources/vscode/images")

    // Automatically pulls compiled output from cascara-gradle-plugins.ct
    themes.from(layout.buildDirectory.dir("themes/vscode"))
}
```



| **Property**  | **Type**                     | **Description**                                                   |
| ------------- | ---------------------------- | ----------------------------------------------------------------- |
| `name`        | `String`                     | Technical extension ID in `package.json` / VSIX identity.         |
| `displayName` | `String`                     | Display name shown in the VS Code Marketplace and Extensions tab. |
| `description` | `String`                     | Short summary of the extension.                                   |
| `version`     | `String`                     | Extension semantic version (e.g., `project.version.toString()`).  |
| `publisher`   | `String`                     | Publisher identifier.                                             |
| `icon`        | `String`                     | Relative path to extension icon image inside the package.         |
| `categories`  | `List<String>`               | Marketplace categories (e.g., `categories "Themes"`).             |
| `engines`     | `Map<String, String>`        | Compatibility engine mapping (e.g., `["vscode": "^1.103.0"]`).    |
| `repository`  | `Map<String, String>`        | Repository info (`type`, `url`).                                  |
| `readme`      | `RegularFile`                | Path to `README.md`.                                              |
| `license`     | `RegularFile`                | Path to `LICENSE`.                                                |
| `changeLog`   | `RegularFile`                | Path to `CHANGELOG.md`.                                           |
| `imagesDir`   | `Directory`                  | Source directory for icon and screenshot assets.                  |
| `themes`      | `ConfigurableFileCollection` | Directories or JSON theme files to include in the package.        |

## Tasks

The plugin registers the following tasks under the `vscode` task group:

### `packageVsix`

Builds the `.vsix` archive and places it in `build/distributions/<name>-<version>.vsix`.

```bash
./gradlew packageVsix
```

#### `installVsix`

Installs the generated `.vsix` file into the local VS Code installation using `code --install-extension <path> --force`.

```bash
./gradlew installVsix
```

#### `uninstallVsix`

Uninstalls the extension from local VS Code using `code --uninstall-extension <publisher>.<name>`.

```bash
./gradlew uninstallVsix
```

#### `reinstallVsix`

Performs an `uninstallVsix` followed by an `installVsix` operation.

```bash
./gradlew reinstallVsix
```

### License

[GPL 3](https://github.com/qishr/cascara-format-vsix/blob/main/LICENSE)


