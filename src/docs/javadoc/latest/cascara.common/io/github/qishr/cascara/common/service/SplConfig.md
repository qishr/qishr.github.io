Package [io.github.qishr.cascara.common.service](index.md)

# Class SplConfig
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.util.Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)<br/>
                io.github.qishr.cascara.common.service.SplConfig<br/>
<br/>

----

<span style="font-family: monospace; font-size: 80%;">public final class __SplConfig__<br/>extends [Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)
</span>


## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| SplConfig() |             |



## Method Summary

| Modifier and Type                                                                                   | Method                                                                                                                                                  | Description |
|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public static [SplConfig](../../../../../../io/github/qishr/cascara/common/service/SplConfig.md)    | [get](#get)()                                                                                                                                           |             |
| public static [SplConfig](../../../../../../io/github/qishr/cascara/common/service/SplConfig.md)    | [get](#get)([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) stream)                                |             |
| public boolean                                                                                      | [isDiscoveryEnabled](#isdiscoveryenabled)()                                                                                                             |             |
| public boolean                                                                                      | [bootErrorsToConsole](#booterrorstoconsole)()                                                                                                           |             |
| public boolean                                                                                      | [bootInfoToConsole](#bootinfotoconsole)()                                                                                                               |             |
| public boolean                                                                                      | [isVerifyEnabled](#isverifyenabled)()                                                                                                                   |             |
| public boolean                                                                                      | [policyCheckExpiry](#policycheckexpiry)()                                                                                                               |             |
| public boolean                                                                                      | [policyRequireSigned](#policyrequiresigned)()                                                                                                           |             |
| public boolean                                                                                      | [policyRequireSignedClasses](#policyrequiresignedclasses)()                                                                                             |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) | [getPreferredProvider](#getpreferredprovider)([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) serviceName) |             |
| public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html)       | [getPreferredProviders](#getpreferredproviders)()                                                                                                       |             |


### Methods inherited from [Config](../../../../../../io/github/qishr/cascara/common/util/Config.md)

ensureInitialized, get, get, get, getAllSettings, getPropertiesPath, getAppliedSettings, init, setFileSystem, getNamespace


## Method Details

### get

<span style="font-family: monospace; font-size: 80%;">public static [SplConfig](../../../../../../io/github/qishr/cascara/common/service/SplConfig.md) __get__()</span>




---

### get

<span style="font-family: monospace; font-size: 80%;">public static [SplConfig](../../../../../../io/github/qishr/cascara/common/service/SplConfig.md) __get__([InputStream](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/InputStream.html) stream)</span>




---

### isDiscoveryEnabled

<span style="font-family: monospace; font-size: 80%;">public boolean __isDiscoveryEnabled__()</span>




---

### bootErrorsToConsole

<span style="font-family: monospace; font-size: 80%;">public boolean __bootErrorsToConsole__()</span>




---

### bootInfoToConsole

<span style="font-family: monospace; font-size: 80%;">public boolean __bootInfoToConsole__()</span>




---

### isVerifyEnabled

<span style="font-family: monospace; font-size: 80%;">public boolean __isVerifyEnabled__()</span>




---

### policyCheckExpiry

<span style="font-family: monospace; font-size: 80%;">public boolean __policyCheckExpiry__()</span>




---

### policyRequireSigned

<span style="font-family: monospace; font-size: 80%;">public boolean __policyRequireSigned__()</span>




---

### policyRequireSignedClasses

<span style="font-family: monospace; font-size: 80%;">public boolean __policyRequireSignedClasses__()</span>




---

### getPreferredProvider

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getPreferredProvider__([String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) serviceName)</span>




---

### getPreferredProviders

<span style="font-family: monospace; font-size: 80%;">public [Map](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html) __getPreferredProviders__()</span>




---

