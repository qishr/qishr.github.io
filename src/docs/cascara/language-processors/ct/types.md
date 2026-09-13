# CT Types

- Color
- Format
- Palette
- Properties
- String
- Template

## Color

## Format

`Format` is a type of collection that specifies how output is produced.

There are 2 recognized entries in a `Format` collection:

- `template`
- `suffix`

Example `Format` declaration:

```
Format ghostty = {
    template = "ghostty-template";
    suffix = ".conf";
};
```

!!! note
    There are three built-in `Format`s, bundled in `ct`'s resources:

    - `ghostty`
    - `iterm2`
    - `vscode`

    You can use them by including them like this:

    ```
    include "res://ghostty.tc";
    ```