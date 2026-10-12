Package [io.github.qishr.cascara.ui.language.binding](index.md)

# Class LocalizationBinding
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.language.binding.LocalizationBinding<br/>
<br/>
Direct Known Subtypes:<br/>
    [PropertyLocalizationBinding](../../../../../../../io/github/qishr/cascara/ui/language/binding/PropertyLocalizationBinding.md), [FieldLabelLocalizationBinding](../../../../../../../io/github/qishr/cascara/ui/language/binding/FieldLabelLocalizationBinding.md), [LabeledLocalizationBinding](../../../../../../../io/github/qishr/cascara/ui/language/binding/LabeledLocalizationBinding.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __LocalizationBinding__</span>


## Field Summary

| Modifier and Type              | Field                       | Description |
|--------------------------------|-----------------------------|-------------|
| protected Object[]             | [args](#args)               |             |
| protected String               | [defaultText](#defaulttext) |             |
| protected String               | [key](#key)                 |             |
| protected InvalidationListener | [listener](#listener)       |             |
| protected ObservableLocalizer  | [localizer](#localizer)     |             |



## Constructor Summary

| Constructor                                                                                                                                                                                                                                                                                                                                  | Description |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| LocalizationBinding()                                                                                                                                                                                                                                                                                                                        |             |
| LocalizationBinding([ObservableLocalizer](../../../../../../../io/github/qishr/cascara/ui/language/ObservableLocalizer.md) localizer, [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) key, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] args) |             |



## Method Summary

| Modifier and Type                                                                                                                 | Method                                                                                                                         | Description |
|-----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected abstract [LocalizationBinding](../../../../../../../io/github/qishr/cascara/ui/language/binding/LocalizationBinding.md) | [self](#self)()                                                                                                                |             |
| protected void                                                                                                                    | [startListening](#startlistening)()                                                                                            |             |
| public [LocalizationBinding](../../../../../../../io/github/qishr/cascara/ui/language/binding/LocalizationBinding.md)             | [withDefault](#withdefault)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text) |             |



## Field Details

### args

<span style="font-family: monospace; font-size: 80%;">protected Object[] __args__</span>




---

### defaultText

<span style="font-family: monospace; font-size: 80%;">protected String __defaultText__</span>




---

### key

<span style="font-family: monospace; font-size: 80%;">protected String __key__</span>




---

### listener

<span style="font-family: monospace; font-size: 80%;">protected InvalidationListener __listener__</span>




---

### localizer

<span style="font-family: monospace; font-size: 80%;">protected ObservableLocalizer __localizer__</span>




---


## Method Details

### self

<span style="font-family: monospace; font-size: 80%;">protected abstract [LocalizationBinding](../../../../../../../io/github/qishr/cascara/ui/language/binding/LocalizationBinding.md) __self__()</span>




---

### startListening

<span style="font-family: monospace; font-size: 80%;">protected void __startListening__()</span>




---

### withDefault

<span style="font-family: monospace; font-size: 80%;">public [LocalizationBinding](../../../../../../../io/github/qishr/cascara/ui/language/binding/LocalizationBinding.md) __withDefault__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) text)</span>




---

