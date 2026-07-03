Package [io.github.qishr.cascara.ui.style](index.md)

# Class ControlStyle
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.style.ControlStyle<br/>
<br/>
Direct Known Subtypes:<br/>
    [PartStyle](PartStyle.md), [FormStyle](custom/FormStyle.md), [CodeAreaStyle](custom/CodeAreaStyle.md), [ColorTransformerStyle](custom/ColorTransformerStyle.md), [DiagnosticIconStyle](custom/DiagnosticIconStyle.md), [ActivityBarStyle](custom/ActivityBarStyle.md), [TitleBarStyle](custom/TitleBarStyle.md), [DocumentTabHeaderStyle](custom/DocumentTabHeaderStyle.md), [CustomStyle](custom/CustomStyle.md), [BadgeStyle](custom/BadgeStyle.md), [MarkdownStyle](custom/MarkdownStyle.md), [ColorPaletteStyle](custom/ColorPaletteStyle.md), [ToastStyle](custom/ToastStyle.md), [SvgIconStyle](custom/SvgIconStyle.md), [SideBarStyle](custom/SideBarStyle.md), [TagChooserStyle](custom/TagChooserStyle.md), [RadioButtonStyle](standard/RadioButtonStyle.md), [DatePickerStyle](standard/DatePickerStyle.md), [HyperlinkStyle](standard/HyperlinkStyle.md), [TreeViewStyle](standard/TreeViewStyle.md), [TextStyle](standard/TextStyle.md), [SliderStyle](standard/SliderStyle.md), [ListViewStyle](standard/ListViewStyle.md), [DialogStyle](standard/DialogStyle.md), [GridPaneStyle](standard/GridPaneStyle.md), [ButtonStyle](standard/ButtonStyle.md), [SceneStyle](standard/SceneStyle.md), [AccordionStyle](standard/AccordionStyle.md), [MenuStyle](standard/MenuStyle.md), [ScrollPaneStyle](standard/ScrollPaneStyle.md), [ToolTipStyle](standard/ToolTipStyle.md), [ArrowStyle](standard/ArrowStyle.md), [ChoiceBoxStyle](standard/ChoiceBoxStyle.md), [SplitMenuButtonStyle](standard/SplitMenuButtonStyle.md), [ScrollBarStyle](standard/ScrollBarStyle.md), [ChartStyle](standard/ChartStyle.md), [TextInputStyle](standard/TextInputStyle.md), [ColorPickerStyle](standard/ColorPickerStyle.md), [SeparatorStyle](standard/SeparatorStyle.md), [TreeTableViewStyle](standard/TreeTableViewStyle.md), [SpinnerStyle](standard/SpinnerStyle.md), [ToolBarStyle](standard/ToolBarStyle.md), [TabPaneStyle](standard/TabPaneStyle.md), [ProgressBarStyle](standard/ProgressBarStyle.md), [MenuButtonStyle](standard/MenuButtonStyle.md), [ProgressIndicatorStyle](standard/ProgressIndicatorStyle.md), [CheckBoxStyle](standard/CheckBoxStyle.md), [TitledPaneStyle](standard/TitledPaneStyle.md), [ComboBoxStyle](standard/ComboBoxStyle.md), [TableViewStyle](standard/TableViewStyle.md), [SplitPaneStyle](standard/SplitPaneStyle.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __ControlStyle__</span>


## Field Summary

| Modifier and Type                                                                                                   | Field                                                     | Description |
|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------|-------------|
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [BASELINE_LEFT](#baseline_left)                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [BOLD](#bold)                                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [BOLDER](#bolder)                                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CENTER](#center)                                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CENTER_LEFT](#center_left)                               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CENTER_RIGHT](#center_right)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [COLLAPSE](#collapse)                                     |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CURSOR_DEFAULT](#cursor_default)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CURSOR_HAND](#cursor_hand)                               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CURSOR_TEXT](#cursor_text)                               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [CURSOR_WAIT](#cursor_wait)                               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FALSE](#false)                                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_ALIGNMENT](#fx_alignment)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BACKGROUND_COLOR](#fx_background_color)               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BACKGROUND_INSETS](#fx_background_insets)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BACKGROUND_RADIUS](#fx_background_radius)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BORDER_COLOR](#fx_border_color)                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BORDER_INSETS](#fx_border_insets)                     |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BORDER_RADIUS](#fx_border_radius)                     |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BORDER_STYLE](#fx_border_style)                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BORDER_WIDTH](#fx_border_width)                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_BOUNDS_TYPE](#fx_bounds_type)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_CELL_FOCUS_INNER_BORDER](#fx_cell_focus_inner_border) |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_CELL_SIZE](#fx_cell_size)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_CONTENT_DISPLAY](#fx_content_display)                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_CURSOR](#fx_cursor)                                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_DURATION](#fx_duration)                               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_EFFECT](#fx_effect)                                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_FILL](#fx_fill)                                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_FOCUS_TRAVERSABLE](#fx_focus_traversable)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_FONT_FAMILY](#fx_font_family)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_FONT_SIZE](#fx_font_size)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_FONT_SMOOTHING_TYPE](#fx_font_smoothing_type)         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_FONT_STYLE](#fx_font_style)                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_FONT_WEIGHT](#fx_font_weight)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_HIGHLIGHT_FILL](#fx_highlight_fill)                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_HIGHLIGHT_TEXT_FILL](#fx_highlight_text_fill)         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_LABEL_PADDING](#fx_label_padding)                     |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_LINE_SPACING](#fx_line_spacing)                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_MANAGED](#fx_managed)                                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_MAX_HEIGHT](#fx_max_height)                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_MAX_WIDTH](#fx_max_width)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_MINOR_TICK_LENGTH](#fx_minor_tick_length)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_MIN_HEIGHT](#fx_min_height)                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_MIN_WIDTH](#fx_min_width)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_OPACITY](#fx_opacity)                                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_PADDING](#fx_padding)                                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_PREF_HEIGHT](#fx_pref_height)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_PREF_WIDTH](#fx_pref_width)                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_PROGRESS_COLOR](#fx_progress_color)                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_PROMPT_TEXT_FILL](#fx_prompt_text_fill)               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_REGION_BACKGROUND](#fx_region_background)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_ROTATE](#fx_rotate)                                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_SCALE_SHAPE](#fx_scale_shape)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_SCALE_Y](#fx_scale_y)                                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_SEPARATOR_STROKE](#fx_separator_stroke)               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_SHAPE](#fx_shape)                                     |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_SIZE](#fx_size)                                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_SKIN](#fx_skin)                                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_SPACING](#fx_spacing)                                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_STROKE](#fx_stroke)                                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_STROKE_WIDTH](#fx_stroke_width)                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TABLE_CELL_BORDER_COLOR](#fx_table_cell_border_color) |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TAB_MAX_HEIGHT](#fx_tab_max_height)                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TAB_MIN_HEIGHT](#fx_tab_min_height)                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TEXT_BOX_BORDER](#fx_text_box_border)                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TEXT_FILL](#fx_text_fill)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TEXT_WRAP](#fx_text_wrap)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TICK_LABEL_FILL](#fx_tick_label_fill)                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TICK_LENGTH](#fx_tick_length)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TRANSLATE_X](#fx_translate_x)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_TRANSLATE_Y](#fx_translate_y)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [FX_UNDERLINE](#fx_underline)                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ITALIC](#italic)                                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [LEFT](#left)                                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [LIGHTER](#lighter)                                       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [NONE](#none)                                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [NORMAL](#normal)                                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [NULL](#null)                                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [RIGHT_BUTTON_VISIBLE](#right_button_visible)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [RTFX_UNDERLINE_COLOR](#rtfx_underline_color)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [RTFX_UNDERLINE_DASH_ARRAY](#rtfx_underline_dash_array)   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [RTFX_UNDERLINE_WIDTH](#rtfx_underline_width)             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SHAPE_ARROW_DOWN](#shape_arrow_down)                     |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SHOW_VALUE_ON_INTERACTION](#show_value_on_interaction)   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SHRINK_ANIMATE_ON_PRESS](#shrink_animate_on_press)       |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [SOLID](#solid)                                           |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [TEXT_TRANSFORM](#text_transform)                         |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [TRANSPARENT](#transparent)                               |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [TRUE](#true)                                             |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [UPPERCASE](#uppercase)                                   |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [VISIBILITY](#visibility)                                 |             |
| protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [ZERO](#zero)                                             |             |
| protected List<String>                                                                                              | [rules](#rules)                                           |             |



## Constructor Summary

| Constructor    | Description |
|----------------|-------------|
| ControlStyle() |             |



## Method Summary

| Modifier and Type                                                                                                                                                                             | Method                                                                                                                                                                                                                                                                                                                                                                                                          | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> | [getRules](#getrules)()                                                                                                                                                                                                                                                                                                                                                                                         |             |
| protected void                                                                                                                                                                                | [defineRule](#definerule)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) rule)                                                                                                                                                                                                                                                                                    |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [color](#color)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorId)                                                                                                                                                                                                                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [mapped](#mapped)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) color)                                                                                                                                                                                                                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [color](#color)()                                                                                                                                                                                                                                                                                                                                                                                               |             |
| protected [StyleRuleBuilder](StyleRuleBuilder.md)                                                                                                                                             | [newRule](#newrule)()                                                                                                                                                                                                                                                                                                                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [selector](#selector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)                                                                                                                                                                                                                                                                                           |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [classSelector](#classselector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)                                                                                                                                                                                                                                                                                 |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [childSelector](#childselector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)                                                                                                                                                                                                                                                                                 |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [pseudoSelector](#pseudoselector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)                                                                                                                                                                                                                                                                               |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [px](#px)(int n)                                                                                                                                                                                                                                                                                                                                                                                                |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [em](#em)(double n)                                                                                                                                                                                                                                                                                                                                                                                             |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [degrees](#degrees)(double n)                                                                                                                                                                                                                                                                                                                                                                                   |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [sides](#sides)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) t, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) r, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) b, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) l) |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [sides](#sides)(int t, int r, int b, int l)                                                                                                                                                                                                                                                                                                                                                                     |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [values](#values)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values)                                                                                                                                                                                                                                                                                        |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [literal](#literal)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) expression)                                                                                                                                                                                                                                                                                    |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [shape](#shape)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) expression)                                                                                                                                                                                                                                                                                        |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [derive](#derive)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) cssColor, int precentage)                                                                                                                                                                                                                                                                        |             |
| protected void                                                                                                                                                                                | [incorporateRules](#incorporaterules)([PartStyle](PartStyle.md) partStyle)                                                                                                                                                                                                                                                                                                                                      |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                                                        | [dropshadow](#dropshadow)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) cssColor)                                                                                                                                                                                                                                                                                |             |
| public void                                                                                                                                                                                   | [applyTo](#applyto)([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) node)                                                                                                                                                                                                                                                                       |             |
| public void                                                                                                                                                                                   | [applyTo](#applyto)([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) node)                                                                                                                                                                                                                                                                     |             |



## Field Details

### BASELINE_LEFT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __BASELINE_LEFT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### BOLD

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __BOLD__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### BOLDER

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __BOLDER__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### CENTER

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CENTER__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### CENTER_LEFT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CENTER_LEFT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### CENTER_RIGHT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CENTER_RIGHT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### COLLAPSE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __COLLAPSE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### CURSOR_DEFAULT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CURSOR_DEFAULT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### CURSOR_HAND

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CURSOR_HAND__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### CURSOR_TEXT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CURSOR_TEXT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### CURSOR_WAIT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __CURSOR_WAIT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FALSE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FALSE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_ALIGNMENT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_ALIGNMENT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BACKGROUND_COLOR

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BACKGROUND_COLOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BACKGROUND_INSETS

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BACKGROUND_INSETS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BACKGROUND_RADIUS

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BACKGROUND_RADIUS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BORDER_COLOR

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BORDER_COLOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BORDER_INSETS

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BORDER_INSETS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BORDER_RADIUS

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BORDER_RADIUS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BORDER_STYLE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BORDER_STYLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BORDER_WIDTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BORDER_WIDTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_BOUNDS_TYPE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_BOUNDS_TYPE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_CELL_FOCUS_INNER_BORDER

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_CELL_FOCUS_INNER_BORDER__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_CELL_SIZE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_CELL_SIZE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_CONTENT_DISPLAY

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_CONTENT_DISPLAY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_CURSOR

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_CURSOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_DURATION

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_DURATION__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_EFFECT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_EFFECT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_FILL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_FILL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_FOCUS_TRAVERSABLE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_FOCUS_TRAVERSABLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_FONT_FAMILY

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_FONT_FAMILY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_FONT_SIZE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_FONT_SIZE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_FONT_SMOOTHING_TYPE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_FONT_SMOOTHING_TYPE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_FONT_STYLE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_FONT_STYLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_FONT_WEIGHT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_FONT_WEIGHT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_HIGHLIGHT_FILL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_HIGHLIGHT_FILL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_HIGHLIGHT_TEXT_FILL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_HIGHLIGHT_TEXT_FILL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_LABEL_PADDING

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_LABEL_PADDING__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_LINE_SPACING

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_LINE_SPACING__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_MANAGED

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_MANAGED__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_MAX_HEIGHT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_MAX_HEIGHT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_MAX_WIDTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_MAX_WIDTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_MINOR_TICK_LENGTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_MINOR_TICK_LENGTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_MIN_HEIGHT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_MIN_HEIGHT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_MIN_WIDTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_MIN_WIDTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_OPACITY

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_OPACITY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_PADDING

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_PADDING__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_PREF_HEIGHT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_PREF_HEIGHT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_PREF_WIDTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_PREF_WIDTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_PROGRESS_COLOR

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_PROGRESS_COLOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_PROMPT_TEXT_FILL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_PROMPT_TEXT_FILL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_REGION_BACKGROUND

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_REGION_BACKGROUND__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_ROTATE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_ROTATE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_SCALE_SHAPE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_SCALE_SHAPE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_SCALE_Y

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_SCALE_Y__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_SEPARATOR_STROKE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_SEPARATOR_STROKE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_SHAPE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_SHAPE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_SIZE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_SIZE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_SKIN

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_SKIN__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_SPACING

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_SPACING__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_STROKE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_STROKE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_STROKE_WIDTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_STROKE_WIDTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TABLE_CELL_BORDER_COLOR

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TABLE_CELL_BORDER_COLOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TAB_MAX_HEIGHT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TAB_MAX_HEIGHT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TAB_MIN_HEIGHT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TAB_MIN_HEIGHT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TEXT_BOX_BORDER

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TEXT_BOX_BORDER__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TEXT_FILL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TEXT_FILL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TEXT_WRAP

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TEXT_WRAP__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TICK_LABEL_FILL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TICK_LABEL_FILL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TICK_LENGTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TICK_LENGTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TRANSLATE_X

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TRANSLATE_X__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_TRANSLATE_Y

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_TRANSLATE_Y__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### FX_UNDERLINE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __FX_UNDERLINE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### ITALIC

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ITALIC__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### LEFT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __LEFT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### LIGHTER

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __LIGHTER__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### NONE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __NONE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### NORMAL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __NORMAL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### NULL

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __NULL__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### RIGHT_BUTTON_VISIBLE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __RIGHT_BUTTON_VISIBLE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### RTFX_UNDERLINE_COLOR

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __RTFX_UNDERLINE_COLOR__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### RTFX_UNDERLINE_DASH_ARRAY

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __RTFX_UNDERLINE_DASH_ARRAY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### RTFX_UNDERLINE_WIDTH

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __RTFX_UNDERLINE_WIDTH__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### SHAPE_ARROW_DOWN

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SHAPE_ARROW_DOWN__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### SHOW_VALUE_ON_INTERACTION

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SHOW_VALUE_ON_INTERACTION__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### SHRINK_ANIMATE_ON_PRESS

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SHRINK_ANIMATE_ON_PRESS__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### SOLID

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __SOLID__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### TEXT_TRANSFORM

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __TEXT_TRANSFORM__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### TRANSPARENT

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __TRANSPARENT__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### TRUE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __TRUE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### UPPERCASE

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __UPPERCASE__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### VISIBILITY

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __VISIBILITY__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### ZERO

<span style="font-family: monospace; font-size: 80%;">protected static final [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __ZERO__</span>



**See Also:**


[Constant Field Values](../../../../../../constant-values.md)



---

### rules

<span style="font-family: monospace; font-size: 80%;">protected List<String> __rules__</span>




---


## Method Details

### getRules

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<[String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)> __getRules__()</span>




---

### defineRule

<span style="font-family: monospace; font-size: 80%;">protected void __defineRule__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) rule)</span>




---

### color

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __color__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) colorId)</span>




---

### mapped

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __mapped__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) color)</span>




---

### color

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __color__()</span>




---

### newRule

<span style="font-family: monospace; font-size: 80%;">protected [StyleRuleBuilder](StyleRuleBuilder.md) __newRule__()</span>




---

### selector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __selector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### classSelector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __classSelector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### childSelector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __childSelector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### pseudoSelector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __pseudoSelector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>




---

### px

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __px__(int n)</span>




---

### em

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __em__(double n)</span>




---

### degrees

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __degrees__(double n)</span>




---

### sides

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __sides__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) t, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) r, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) b, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) l)</span>




---

### sides

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __sides__(int t, int r, int b, int l)</span>




---

### values

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __values__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)[] values)</span>




---

### literal

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __literal__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) expression)</span>




---

### shape

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __shape__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) expression)</span>




---

### derive

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __derive__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) cssColor, int precentage)</span>




---

### incorporateRules

<span style="font-family: monospace; font-size: 80%;">protected void __incorporateRules__([PartStyle](PartStyle.md) partStyle)</span>




---

### dropshadow

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __dropshadow__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) cssColor)</span>




---

### applyTo

<span style="font-family: monospace; font-size: 80%;">public void __applyTo__([Scene](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Scene.html) node)</span>




---

### applyTo

<span style="font-family: monospace; font-size: 80%;">public void __applyTo__([Parent](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.graphics/javafx/scene/Parent.html) node)</span>




---

