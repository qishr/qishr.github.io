Package [io.github.qishr.cascara.ui.option](index.md)

# Class SimpleStringOption
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.option.AbstractOption](AbstractOption.md)<br/>
                io.github.qishr.cascara.ui.option.SimpleStringOption<br/>
<br/>
All Implemented Interfaces:<br/>
    [StringOption](StringOption.md)

Direct Known Subtypes:<br/>
    [LanguageOption](../language/LanguageOption.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __SimpleStringOption__<br/>extends [AbstractOption](AbstractOption.md)
</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                         | Description |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| SimpleStringOption([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)                                                                                                              |             |
| SimpleStringOption([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) id, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) translationKey) |             |



## Method Summary

| Modifier and Type                                                                                                                                         | Method                                                                                                                             | Description |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                       | [getOptionText](#getoptiontext)()                                                                                                  |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                                                       | [getOptionTranslationKey](#getoptiontranslationkey)()                                                                              |             |
| public void                                                                                                                                               | [setOptionText](#setoptiontext)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |
| public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) | [optionTextProperty](#optiontextproperty)()                                                                                        |             |


### Methods inherited from [AbstractOption](AbstractOption.md)

equals, getOptionId, hashCode


## Method Details

### getOptionText

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOptionText__()</span>



**Specified By:**

[StringOption](StringOption.md)


---

### getOptionTranslationKey

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getOptionTranslationKey__()</span>




---

### setOptionText

<span style="font-family: monospace; font-size: 80%;">public void __setOptionText__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

### optionTextProperty

<span style="font-family: monospace; font-size: 80%;">public [SimpleStringProperty](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/property/SimpleStringProperty.html) __optionTextProperty__()</span>




---

