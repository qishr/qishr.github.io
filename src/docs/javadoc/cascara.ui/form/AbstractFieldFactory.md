Package [io.github.qishr.cascara.ui.form](index.md)

# Class AbstractFieldFactory
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.ui.form.AbstractFieldFactory<br/>
<br/>
Direct Known Subtypes:<br/>
    [ObjectFieldFactory](ObjectFieldFactory.md)


----

<span style="font-family: monospace; font-size: 80%;">public abstract class __AbstractFieldFactory__</span>


## Field Summary

| Modifier and Type                 | Field                                     | Description |
|-----------------------------------|-------------------------------------------|-------------|
| protected DataProvider            | [dataProvider](#dataprovider)             |             |
| protected boolean                 | [isUpdatingControl](#isupdatingcontrol)   |             |
| protected boolean                 | [isUpdatingProperty](#isupdatingproperty) |             |
| protected Consumer<Boolean>       | [onChangeFieldValue](#onchangefieldvalue) |             |
| protected Runnable                | [onRefreshForm](#onrefreshform)           |             |
| protected final RendererAllocator | [rendererAllocator](#rendererallocator)   |             |
| protected final RendererFactory   | [rendererFactory](#rendererfactory)       |             |
| protected URI                     | [uri](#uri)                               |             |



## Constructor Summary

| Constructor                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------|-------------|
| AbstractFieldFactory([ServiceProviderLayer](../../cascara.common/service/ServiceProviderLayer.md) spl) |             |



## Method Summary

| Modifier and Type                                                                            | Method                                                                                                                                                                                                                                                             | Description |
|----------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) | [getUri](#geturi)()                                                                                                                                                                                                                                                |             |
| public void                                                                                  | [setUri](#seturi)([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)                                                                                                                                                       |             |
| public void                                                                                  | [setDataProvider](#setdataprovider)([DataProvider](../api/data/DataProvider.md) dataProvider)                                                                                                                                                                      |             |
| public void                                                                                  | [setOnChangeFieldValue](#setonchangefieldvalue)([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> handler) |             |
| public void                                                                                  | [setOnRefreshForm](#setonrefreshform)([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)                                                                                                                    |             |
| protected [ViewAndControl](ViewAndControl.md)                                                | [createControl](#createcontrol)([FieldMetadata](FieldMetadata.md) meta, [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html) data)                                                                |             |
| protected void                                                                               | [notifyDocumentChanged](#notifydocumentchanged)(boolean urgent)                                                                                                                                                                                                    |             |



## Field Details

### dataProvider

<span style="font-family: monospace; font-size: 80%;">protected DataProvider __dataProvider__</span>




---

### isUpdatingControl

<span style="font-family: monospace; font-size: 80%;">protected boolean __isUpdatingControl__</span>




---

### isUpdatingProperty

<span style="font-family: monospace; font-size: 80%;">protected boolean __isUpdatingProperty__</span>




---

### onChangeFieldValue

<span style="font-family: monospace; font-size: 80%;">protected Consumer<Boolean> __onChangeFieldValue__</span>




---

### onRefreshForm

<span style="font-family: monospace; font-size: 80%;">protected Runnable __onRefreshForm__</span>




---

### rendererAllocator

<span style="font-family: monospace; font-size: 80%;">protected final RendererAllocator __rendererAllocator__</span>




---

### rendererFactory

<span style="font-family: monospace; font-size: 80%;">protected final RendererFactory __rendererFactory__</span>




---

### uri

<span style="font-family: monospace; font-size: 80%;">protected URI __uri__</span>




---


## Method Details

### getUri

<span style="font-family: monospace; font-size: 80%;">public [URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) __getUri__()</span>




---

### setUri

<span style="font-family: monospace; font-size: 80%;">public void __setUri__([URI](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/net/URI.html) uri)</span>




---

### setDataProvider

<span style="font-family: monospace; font-size: 80%;">public void __setDataProvider__([DataProvider](../api/data/DataProvider.md) dataProvider)</span>




---

### setOnChangeFieldValue

<span style="font-family: monospace; font-size: 80%;">public void __setOnChangeFieldValue__([Consumer](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html)<[Boolean](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Boolean.html)> handler)</span>




---

### setOnRefreshForm

<span style="font-family: monospace; font-size: 80%;">public void __setOnRefreshForm__([Runnable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html) handler)</span>




---

### createControl

<span style="font-family: monospace; font-size: 80%;">protected [ViewAndControl](ViewAndControl.md) __createControl__([FieldMetadata](FieldMetadata.md) meta, [Observable](https://docs.oracle.com/en/java/java-components/javafx/25/docs/javafx.base/javafx/beans/Observable.html) data)</span>




---

### notifyDocumentChanged

<span style="font-family: monospace; font-size: 80%;">protected void __notifyDocumentChanged__(boolean urgent)</span>




---

