Package [io.github.qishr.cascara.ui.style](index.md)

# Class PartStyle
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.ui.style.ControlStyle](ControlStyle.md)<br/>
                io.github.qishr.cascara.ui.style.PartStyle<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public abstract class __PartStyle__<br/>extends [ControlStyle](ControlStyle.md)
</span>


## Field Summary

| Modifier and Type | Field                         | Description |
|-------------------|-------------------------------|-------------|
| protected String  | [controlClass](#controlclass) |             |



## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| PartStyle() |             |



## Method Summary

| Modifier and Type                                                                                      | Method                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|-------------|
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [selector](#selector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)             |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [classSelector](#classselector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)   |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [childSelector](#childselector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)   |             |
| protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [pseudoSelector](#pseudoselector)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s) |             |


### Methods inherited from [ControlStyle](ControlStyle.md)

applyTo, defineRule, newRule, sides, applyTo, incorporateRules, color, literal, mapped, derive, values, degrees, shape, em, sides, color, getRules, px, dropshadow


## Field Details

### controlClass

<span style="font-family: monospace; font-size: 80%;">protected String __controlClass__</span>




---


## Method Details

### selector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __selector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>



**Overrides:**

[ControlStyle](../cascara.ui/style/ControlStyle.md#selector)


---

### classSelector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __classSelector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>



**Overrides:**

[ControlStyle](../cascara.ui/style/ControlStyle.md#classselector)


---

### childSelector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __childSelector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>



**Overrides:**

[ControlStyle](../cascara.ui/style/ControlStyle.md#childselector)


---

### pseudoSelector

<span style="font-family: monospace; font-size: 80%;">protected [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __pseudoSelector__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) s)</span>



**Overrides:**

[ControlStyle](../cascara.ui/style/ControlStyle.md#pseudoselector)


---

