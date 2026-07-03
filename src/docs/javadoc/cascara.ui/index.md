# Module cascara.ui




=== "Exports"

    | Package                                                                  | Description |
    |--------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.ui.api](api/index.md)                           |             |
    | [io.github.qishr.cascara.ui.api.data](api/data/index.md)                 |             |
    | [io.github.qishr.cascara.ui.option](option/index.md)                     |             |
    | [io.github.qishr.cascara.ui.api.render](api/render/index.md)             |             |
    | [io.github.qishr.cascara.ui.color](color/index.md)                       |             |
    | [io.github.qishr.cascara.ui.control](control/index.md)                   |             |
    | [io.github.qishr.cascara.ui.data](data/index.md)                         |             |
    | [io.github.qishr.cascara.ui.form](form/index.md)                         |             |
    | [io.github.qishr.cascara.ui.language](language/index.md)                 |             |
    | [io.github.qishr.cascara.ui.language.binding](language/binding/index.md) |             |
    | [io.github.qishr.cascara.ui.menu](menu/index.md)                         |             |
    | [io.github.qishr.cascara.ui.render](render/index.md)                     |             |
    | [io.github.qishr.cascara.ui.render.control](render/control/index.md)     |             |
    | [io.github.qishr.cascara.ui.render.standard](render/standard/index.md)   |             |
    | [io.github.qishr.cascara.ui.schema](schema/index.md)                     |             |
    | [io.github.qishr.cascara.ui.theme](theme/index.md)                       |             |
    | [io.github.qishr.cascara.ui.style](style/index.md)                       |             |
    | [io.github.qishr.cascara.ui.style.custom](style/custom/index.md)         |             |
    | [io.github.qishr.cascara.ui.style.standard](style/standard/index.md)     |             |
    | [io.github.qishr.cascara.ui.vsix](vsix/index.md)                         |             |
    | [io.github.qishr.cascara.ui.widget](widget/index.md)                     |             |
    | [io.github.qishr.cascara.ui.window](window/index.md)                     |             |


=== "Requires"

    | Module                                                                                        | Description |
    |-----------------------------------------------------------------------------------------------|-------------|
    | [java.base](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html) |             |
    | [cascara.common](../cascara.common/index.md)                                                  |             |
    | [cascara.common.io](../cascara.common.io/index.md)                                            |             |
    | [cascara.lang.json](../cascara.lang.json/index.md)                                            |             |
    | [cascara.lang.xml](../cascara.lang.xml/index.md)                                              |             |
    | [cascara.lang.yaml](../cascara.lang.yaml/index.md)                                            |             |
    | [cascara.schema](../cascara.schema/index.md)                                                  |             |
    | [javafx.base](../javafx.baseindex.md)                                                         |             |
    | [javafx.controls](../javafx.controlsindex.md)                                                 |             |
    | [javafx.graphics](../javafx.graphicsindex.md)                                                 |             |


=== "Opens"

    | Package                                                              | Description |
    |----------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.ui.color](color/index.md)                   |             |
    | [io.github.qishr.cascara.ui.control](control/index.md)               |             |
    | [io.github.qishr.cascara.ui.render](render/index.md)                 |             |
    | [io.github.qishr.cascara.ui.style](style/index.md)                   |             |
    | [io.github.qishr.cascara.ui.style.custom](style/custom/index.md)     |             |
    | io.github.qishr.cascara.ui.style.part                                |             |
    | [io.github.qishr.cascara.ui.style.standard](style/standard/index.md) |             |
    | [io.github.qishr.cascara.ui.theme](theme/index.md)                   |             |
    | [io.github.qishr.cascara.ui.window](window/index.md)                 |             |
    | [io.github.qishr.cascara.ui.language](language/index.md)             |             |
    | [io.github.qishr.cascara.ui.data](data/index.md)                     |             |
    | [io.github.qishr.cascara.ui.menu](menu/index.md)                     |             |


=== "Uses"

    | Interface                                                                                              | Description |
    |--------------------------------------------------------------------------------------------------------|-------------|
    | [io.github.qishr.cascara.common.service.ServiceProvider](../cascara.common/service/ServiceProvider.md) |             |
    | [io.github.qishr.cascara.ui.api.OptionListEditor](api/OptionListEditor.md)                             |             |
    | [io.github.qishr.cascara.ui.api.render.ArrayEditorRenderer](api/render/ArrayEditorRenderer.md)         |             |
    | [io.github.qishr.cascara.ui.api.render.ScalarEditorRenderer](api/render/ScalarEditorRenderer.md)       |             |
    | [io.github.qishr.cascara.ui.api.render.ScalarRenderer](api/render/ScalarRenderer.md)                   |             |
    | [io.github.qishr.cascara.ui.menu.SystemMenusService](menu/SystemMenusService.md)                       |             |
    | [io.github.qishr.cascara.ui.option.OptionProvider](option/OptionProvider.md)                           |             |



=== "Provides"

    | Interface                                                                                        | Implementations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
    |--------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    | [io.github.qishr.cascara.ui.api.render.ArrayEditorRenderer](api/render/ArrayEditorRenderer.md)   | [io.github.qishr.cascara.ui.render.control.TableRenderer](render/control/TableRenderer), [io.github.qishr.cascara.ui.render.control.TagChooserRenderer](render/control/TagChooserRenderer)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
    | [io.github.qishr.cascara.ui.api.render.ScalarEditorRenderer](api/render/ScalarEditorRenderer.md) | [io.github.qishr.cascara.ui.render.standard.StandardBooleanEditorRenderer](render/standard/StandardBooleanEditorRenderer), [io.github.qishr.cascara.ui.render.standard.StandardIntegerEditorRenderer](render/standard/StandardIntegerEditorRenderer), [io.github.qishr.cascara.ui.render.standard.StandardNumberEditorRenderer](render/standard/StandardNumberEditorRenderer), [io.github.qishr.cascara.ui.render.standard.StandardStringEditorRenderer](render/standard/StandardStringEditorRenderer), [io.github.qishr.cascara.ui.render.control.ColorChooserRenderer](render/control/ColorChooserRenderer), [io.github.qishr.cascara.ui.render.control.DateChooserRenderer](render/control/DateChooserRenderer), [io.github.qishr.cascara.ui.render.control.FileChooserRenderer](render/control/FileChooserRenderer), [io.github.qishr.cascara.ui.render.control.OptionChooserRenderer](render/control/OptionChooserRenderer)      |
    | [io.github.qishr.cascara.ui.api.render.ScalarRenderer](api/render/ScalarRenderer.md)             | [io.github.qishr.cascara.ui.render.standard.StandardBooleanRenderer](render/standard/StandardBooleanRenderer), [io.github.qishr.cascara.ui.render.standard.StandardIntegerRenderer](render/standard/StandardIntegerRenderer), [io.github.qishr.cascara.ui.render.standard.StandardNumberRenderer](render/standard/StandardNumberRenderer), [io.github.qishr.cascara.ui.render.standard.StandardStringRenderer](render/standard/StandardStringRenderer), [io.github.qishr.cascara.ui.render.control.DiagnosticRenderer](render/control/DiagnosticRenderer), [io.github.qishr.cascara.ui.render.control.SingleLineCellRenderer](render/control/SingleLineCellRenderer), [io.github.qishr.cascara.ui.render.control.TagRenderer](render/control/TagRenderer), [io.github.qishr.cascara.ui.render.control.TimeRenderer](render/control/TimeRenderer), [io.github.qishr.cascara.ui.render.control.UriRenderer](render/control/UriRenderer) |
    | [io.github.qishr.cascara.ui.option.OptionProvider](option/OptionProvider.md)                     | [io.github.qishr.cascara.ui.language.LanguageOptionProvider](language/LanguageOptionProvider), [io.github.qishr.cascara.ui.theme.ThemeOptionProvider](theme/ThemeOptionProvider), [io.github.qishr.cascara.ui.theme.VariationOptionProvider](theme/VariationOptionProvider)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |


