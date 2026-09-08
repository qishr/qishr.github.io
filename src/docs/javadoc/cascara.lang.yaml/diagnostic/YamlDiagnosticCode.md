Package [io.github.qishr.cascara.lang.yaml.diagnostic](index.md)

# Enum YamlDiagnosticCode
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [java.lang.Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[io.github.qishr.cascara.lang.yaml.diagnostic.YamlDiagnosticCode](YamlDiagnosticCode.md)><br/>
                io.github.qishr.cascara.lang.yaml.diagnostic.YamlDiagnosticCode<br/>
<br/>
All Implemented Interfaces:<br/>
    [DiagnosticCode](../cascara.common/code/DiagnosticCode.md)


----

<span style="font-family: monospace; font-size: 80%;">public final enum __YamlDiagnosticCode__<br/>extends [Enum](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Enum.html)<[YamlDiagnosticCode](YamlDiagnosticCode.md)>
</span>


##Enum Constants

| Enum Constant                                                                   | Description |
|---------------------------------------------------------------------------------|-------------|
| [ERROR](#error)                                                                 |             |
| [TABS_NOT_ALLOWED_AS_INDENTATION](#tabs_not_allowed_as_indentation)             |             |
| [INVALID_ESCAPE](#invalid_escape)                                               |             |
| [EXPECTED_COMMA_OR_CLOSE_BRACE](#expected_comma_or_close_brace)                 |             |
| [EXPECTED_SCALAR](#expected_scalar)                                             |             |
| [EXPECTED_MAP_KEY](#expected_map_key)                                           |             |
| [EXPECTED_OPEN_BRACE_FLOW_MAP](#expected_open_brace_flow_map)                   |             |
| [EXPECTED_CLOSE_BRACKET](#expected_close_bracket)                               |             |
| [EXPECTED_OPEN_BRACKET](#expected_open_bracket)                                 |             |
| [EXPECTED_COLON_MAP_KEY](#expected_colon_map_key)                               |             |
| [EXPECTED_COLON_FLOW_MAP](#expected_colon_flow_map)                             |             |
| [EXPECTED_CLOSE_SINGLE_QUOTE](#expected_close_single_quote)                     |             |
| [EXPECTED_CLOSE_DOUBLE_QUOTE](#expected_close_double_quote)                     |             |
| [UNEXPECTED_TOKEN](#unexpected_token)                                           |             |
| [UNEXPECTED_CLOSE_BRACKET](#unexpected_close_bracket)                           |             |
| [UNEXPECTED_CLOSE_BRACE](#unexpected_close_brace)                               |             |
| [BLOCK_SCALAR_HEADER_EXTRA](#block_scalar_header_extra)                         |             |
| [INCONSISTENT_INDENTATION](#inconsistent_indentation)                           |             |
| [EXPECTED_INDENTATION_BLOCK_SCALAR](#expected_indentation_block_scalar)         |             |
| [EXPECTED_DEDENT_BLOCK_COMMENT](#expected_dedent_block_comment)                 |             |
| [UNEXPECTED_EMPTY_LEXEME](#unexpected_empty_lexeme)                             |             |
| [UNEXPECTED_END_OF_BUFFER](#unexpected_end_of_buffer)                           |             |
| [DEPTH_LIMIT](#depth_limit)                                                     |             |
| [DUPLICATE_KEY](#duplicate_key)                                                 |             |
| [UNKNOWN_DIRECTIVE](#unknown_directive)                                         |             |
| [EXPECTED_INDENT](#expected_indent)                                             |             |
| [EXPECTED_DEDENT](#expected_dedent)                                             |             |
| [TOO_MANY_ANCHORS](#too_many_anchors)                                           |             |
| [TOO_MANY_TAGS](#too_many_tags)                                                 |             |
| [MISSING_DIRECTIVES_END_INDICATOR](#missing_directives_end_indicator)           |             |
| [IMPLICIT_KEY_SINGLE_LINE](#implicit_key_single_line)                           |             |
| [BLOCK_COLLECTION_SAME_LINE_AS_MARKER](#block_collection_same_line_as_marker)   |             |
| [MAPPING_KEY_COLUMN](#mapping_key_column)                                       |             |
| [BLOCK_COLLECTION_INSIDE_FLOW](#block_collection_inside_flow)                   |             |
| [TOO_MANY_PARTS](#too_many_parts)                                               |             |
| [UNSUPPORTED_VERSION](#unsupported_version)                                     |             |
| [CANNOT_RESOLVE_TAG](#cannot_resolve_tag)                                       |             |
| [EXPLICIT_INDENTATION_INDICATOR_NEEDED](#explicit_indentation_indicator_needed) |             |
| [DUPICATE_YAML_DIRECTIVE](#dupicate_yaml_directive)                             |             |
| [ALIAS_MUST_NOT_SPECIFY_PROPERTIES](#alias_must_not_specify_properties)         |             |
| [COMMENT_NOT_SEPARATED](#comment_not_separated)                                 |             |
| [MALFORMED_TAG](#malformed_tag)                                                 |             |
| [MISSING_NEWLINE_BLOCK_SEQ_PROPS](#missing_newline_block_seq_props)             |             |
| [BLOCK_SCALAR_COLLECTION_INDENT](#block_scalar_collection_indent)               |             |
| [FLOW_SEQUENCE_BLOCK_COLLECTION_INDENT](#flow_sequence_block_collection_indent) |             |
| [FLOW_MAP_BLOCK_INDENT](#flow_map_block_indent)                                 |             |
| [BLOCK_COLLECTION_IN_FLOW_COLLECTION](#block_collection_in_flow_collection)     |             |
| [NESTED_MAPPING_IN_COMPACT_MAPPING](#nested_mapping_in_compact_mapping)         |             |
| [BLOCK_SEQ_IND_SAME_LINE](#block_seq_ind_same_line)                             |             |
| [UNEXPECTED_COMMA_IN_FLOW_SEQ](#unexpected_comma_in_flow_seq)                   |             |
| [IMPLICIT_KEY_SEQ_SAME_LINE](#implicit_key_seq_same_line)                       |             |
| [UNEXPECTED_NODE_TYPE](#unexpected_node_type)                                   |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                 | Description |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [YamlDiagnosticCode](YamlDiagnosticCode.md)[]                                         | [values](#values)()                                                                                                    |             |
| public static [YamlDiagnosticCode](YamlDiagnosticCode.md)                                           | [valueOf](#valueof)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name) |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getCode](#getcode)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getMessage](#getmessage)()                                                                                            |             |



## Enum Constant Details

### ERROR

public static final  ERROR




---

### TABS_NOT_ALLOWED_AS_INDENTATION

public static final  TABS_NOT_ALLOWED_AS_INDENTATION




---

### INVALID_ESCAPE

public static final  INVALID_ESCAPE




---

### EXPECTED_COMMA_OR_CLOSE_BRACE

public static final  EXPECTED_COMMA_OR_CLOSE_BRACE




---

### EXPECTED_SCALAR

public static final  EXPECTED_SCALAR




---

### EXPECTED_MAP_KEY

public static final  EXPECTED_MAP_KEY




---

### EXPECTED_OPEN_BRACE_FLOW_MAP

public static final  EXPECTED_OPEN_BRACE_FLOW_MAP




---

### EXPECTED_CLOSE_BRACKET

public static final  EXPECTED_CLOSE_BRACKET




---

### EXPECTED_OPEN_BRACKET

public static final  EXPECTED_OPEN_BRACKET




---

### EXPECTED_COLON_MAP_KEY

public static final  EXPECTED_COLON_MAP_KEY




---

### EXPECTED_COLON_FLOW_MAP

public static final  EXPECTED_COLON_FLOW_MAP




---

### EXPECTED_CLOSE_SINGLE_QUOTE

public static final  EXPECTED_CLOSE_SINGLE_QUOTE




---

### EXPECTED_CLOSE_DOUBLE_QUOTE

public static final  EXPECTED_CLOSE_DOUBLE_QUOTE




---

### UNEXPECTED_TOKEN

public static final  UNEXPECTED_TOKEN




---

### UNEXPECTED_CLOSE_BRACKET

public static final  UNEXPECTED_CLOSE_BRACKET




---

### UNEXPECTED_CLOSE_BRACE

public static final  UNEXPECTED_CLOSE_BRACE




---

### BLOCK_SCALAR_HEADER_EXTRA

public static final  BLOCK_SCALAR_HEADER_EXTRA




---

### INCONSISTENT_INDENTATION

public static final  INCONSISTENT_INDENTATION




---

### EXPECTED_INDENTATION_BLOCK_SCALAR

public static final  EXPECTED_INDENTATION_BLOCK_SCALAR




---

### EXPECTED_DEDENT_BLOCK_COMMENT

public static final  EXPECTED_DEDENT_BLOCK_COMMENT




---

### UNEXPECTED_EMPTY_LEXEME

public static final  UNEXPECTED_EMPTY_LEXEME




---

### UNEXPECTED_END_OF_BUFFER

public static final  UNEXPECTED_END_OF_BUFFER




---

### DEPTH_LIMIT

public static final  DEPTH_LIMIT




---

### DUPLICATE_KEY

public static final  DUPLICATE_KEY




---

### UNKNOWN_DIRECTIVE

public static final  UNKNOWN_DIRECTIVE




---

### EXPECTED_INDENT

public static final  EXPECTED_INDENT




---

### EXPECTED_DEDENT

public static final  EXPECTED_DEDENT




---

### TOO_MANY_ANCHORS

public static final  TOO_MANY_ANCHORS




---

### TOO_MANY_TAGS

public static final  TOO_MANY_TAGS




---

### MISSING_DIRECTIVES_END_INDICATOR

public static final  MISSING_DIRECTIVES_END_INDICATOR




---

### IMPLICIT_KEY_SINGLE_LINE

public static final  IMPLICIT_KEY_SINGLE_LINE




---

### BLOCK_COLLECTION_SAME_LINE_AS_MARKER

public static final  BLOCK_COLLECTION_SAME_LINE_AS_MARKER




---

### MAPPING_KEY_COLUMN

public static final  MAPPING_KEY_COLUMN




---

### BLOCK_COLLECTION_INSIDE_FLOW

public static final  BLOCK_COLLECTION_INSIDE_FLOW




---

### TOO_MANY_PARTS

public static final  TOO_MANY_PARTS




---

### UNSUPPORTED_VERSION

public static final  UNSUPPORTED_VERSION




---

### CANNOT_RESOLVE_TAG

public static final  CANNOT_RESOLVE_TAG




---

### EXPLICIT_INDENTATION_INDICATOR_NEEDED

public static final  EXPLICIT_INDENTATION_INDICATOR_NEEDED




---

### DUPICATE_YAML_DIRECTIVE

public static final  DUPICATE_YAML_DIRECTIVE




---

### ALIAS_MUST_NOT_SPECIFY_PROPERTIES

public static final  ALIAS_MUST_NOT_SPECIFY_PROPERTIES




---

### COMMENT_NOT_SEPARATED

public static final  COMMENT_NOT_SEPARATED




---

### MALFORMED_TAG

public static final  MALFORMED_TAG




---

### MISSING_NEWLINE_BLOCK_SEQ_PROPS

public static final  MISSING_NEWLINE_BLOCK_SEQ_PROPS




---

### BLOCK_SCALAR_COLLECTION_INDENT

public static final  BLOCK_SCALAR_COLLECTION_INDENT




---

### FLOW_SEQUENCE_BLOCK_COLLECTION_INDENT

public static final  FLOW_SEQUENCE_BLOCK_COLLECTION_INDENT




---

### FLOW_MAP_BLOCK_INDENT

public static final  FLOW_MAP_BLOCK_INDENT




---

### BLOCK_COLLECTION_IN_FLOW_COLLECTION

public static final  BLOCK_COLLECTION_IN_FLOW_COLLECTION




---

### NESTED_MAPPING_IN_COMPACT_MAPPING

public static final  NESTED_MAPPING_IN_COMPACT_MAPPING




---

### BLOCK_SEQ_IND_SAME_LINE

public static final  BLOCK_SEQ_IND_SAME_LINE




---

### UNEXPECTED_COMMA_IN_FLOW_SEQ

public static final  UNEXPECTED_COMMA_IN_FLOW_SEQ




---

### IMPLICIT_KEY_SEQ_SAME_LINE

public static final  IMPLICIT_KEY_SEQ_SAME_LINE




---

### UNEXPECTED_NODE_TYPE

public static final  UNEXPECTED_NODE_TYPE




---


## Method Details

### values

<span style="font-family: monospace; font-size: 80%;">public static [YamlDiagnosticCode](YamlDiagnosticCode.md)[] __values__()</span>




---

### valueOf

<span style="font-family: monospace; font-size: 80%;">public static [YamlDiagnosticCode](YamlDiagnosticCode.md) __valueOf__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) name)</span>




---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[DiagnosticCode](../cascara.common/code/DiagnosticCode.md)


---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getMessage__()</span>



**Specified By:**

[DiagnosticCode](../cascara.common/code/DiagnosticCode.md)


---

