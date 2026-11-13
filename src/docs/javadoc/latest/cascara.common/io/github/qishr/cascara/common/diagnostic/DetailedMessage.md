Package [io.github.qishr.cascara.common.diagnostic](index.md)

# Class DetailedMessage
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        io.github.qishr.cascara.common.diagnostic.DetailedMessage<br/>
<br/>
All Implemented Interfaces:<br/>
    [LocalizableMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)


----

<span style="font-family: monospace; font-size: 80%;">public class __DetailedMessage__</span>


## Constructor Summary

| Constructor                                                                                                                                                                                                                                      | Description |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| DetailedMessage([LocalizableMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) message, [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] details) |             |



## Method Summary

| Modifier and Type                                                                                                      | Method                                                                                                                              | Description |
|------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                    | [name](#name)()                                                                                                                     |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                    | [getCode](#getcode)()                                                                                                               |             |
| public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html)                    | [getFormat](#getformat)()                                                                                                           |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]                  | [getDetails](#getdetails)()                                                                                                         |             |
| public [LocalizableMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) | [getMessage](#getmessage)()                                                                                                         |             |
| public static [DetailedMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/DetailedMessage.md)        | [forException](#forexception)([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t) |             |



## Method Details

### name

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __name__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)


---

### getCode

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getCode__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)


---

### getFormat

<span style="font-family: monospace; font-size: 80%;">public [String](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html) __getFormat__()</span>



**Specified By:**

[LocalizableMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md)


---

### getDetails

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __getDetails__()</span>




---

### getMessage

<span style="font-family: monospace; font-size: 80%;">public [LocalizableMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/message/LocalizableMessage.md) __getMessage__()</span>




---

### forException

<span style="font-family: monospace; font-size: 80%;">public static [DetailedMessage](../../../../../../io/github/qishr/cascara/common/diagnostic/DetailedMessage.md) __forException__([Throwable](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Throwable.html) t)</span>




---

