Package [io.github.qishr.cascara.common.trackable](index.md)

# Class TrackableArray
[java.lang.Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)<br/>
        [io.github.qishr.cascara.common.trackable.AbstractTrackable](AbstractTrackable.md)<br/>
                io.github.qishr.cascara.common.trackable.TrackableArray<br/>
<br/>
All Implemented Interfaces:<br/>
    [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<E>, [RandomAccess](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/RandomAccess.html)


----

<span style="font-family: monospace; font-size: 80%;">@io.github.qishr.cascara.common.annotation.Experimental<br/>
public class __TrackableArray__<br/>extends [AbstractTrackable](AbstractTrackable.md)
</span>


## Constructor Summary

| Constructor      | Description |
|------------------|-------------|
| TrackableArray() |             |



## Method Summary

| Modifier and Type                                                                                                  | Method                                                                                                                                            | Description |
|--------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| public void                                                                                                        | [addArrayListener](#addarraylistener)([ArrayTracker](tracker/ArrayTracker.md)<E> l)                                                               |             |
| public void                                                                                                        | [removeArrayListener](#removearraylistener)([ArrayTracker](tracker/ArrayTracker.md)<E> l)                                                         |             |
| public int                                                                                                         | [size](#size)()                                                                                                                                   |             |
| public boolean                                                                                                     | [isEmpty](#isempty)()                                                                                                                             |             |
| public boolean                                                                                                     | [contains](#contains)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                             |             |
| public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[]              | [toArray](#toarray)()                                                                                                                             |             |
| public T[]                                                                                                         | [toArray](#toarray)(T[] a)                                                                                                                        |             |
| public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<E>         | [iterator](#iterator)()                                                                                                                           |             |
| public boolean                                                                                                     | [add](#add)(E e)                                                                                                                                  |             |
| public void                                                                                                        | [add](#add)(int index, E element)                                                                                                                 |             |
| public boolean                                                                                                     | [remove](#remove)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                 |             |
| public E                                                                                                           | [remove](#remove)(int index)                                                                                                                      |             |
| public E                                                                                                           | [set](#set)(int index, E element)                                                                                                                 |             |
| public boolean                                                                                                     | [addAll](#addall)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<? extends E> c)            |             |
| public boolean                                                                                                     | [addAll](#addall)(int index, [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<? extends E> c) |             |
| public void                                                                                                        | [setAll](#setall)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<? extends E> c)            |             |
| public boolean                                                                                                     | [removeAll](#removeall)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<?> c)                |             |
| public boolean                                                                                                     | [retainAll](#retainall)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<?> c)                |             |
| public void                                                                                                        | [clear](#clear)()                                                                                                                                 |             |
| public E                                                                                                           | [get](#get)(int index)                                                                                                                            |             |
| public int                                                                                                         | [indexOf](#indexof)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                               |             |
| public int                                                                                                         | [lastIndexOf](#lastindexof)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                       |             |
| public [ListIterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ListIterator.html)<E> | [listIterator](#listiterator)()                                                                                                                   |             |
| public [ListIterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ListIterator.html)<E> | [listIterator](#listiterator)(int index)                                                                                                          |             |
| public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<E>                 | [subList](#sublist)(int fromIndex, int toIndex)                                                                                                   |             |
| public boolean                                                                                                     | [equals](#equals)([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)                                 |             |
| public int                                                                                                         | [hashCode](#hashcode)()                                                                                                                           |             |
| public boolean                                                                                                     | [containsAll](#containsall)([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<?> c)            |             |


### Methods inherited from [AbstractTrackable](AbstractTrackable.md)

invalidate, removeTracker, addTracker


## Method Details

### addArrayListener

<span style="font-family: monospace; font-size: 80%;">public void __addArrayListener__([ArrayTracker](tracker/ArrayTracker.md)<E> l)</span>




---

### removeArrayListener

<span style="font-family: monospace; font-size: 80%;">public void __removeArrayListener__([ArrayTracker](tracker/ArrayTracker.md)<E> l)</span>




---

### size

<span style="font-family: monospace; font-size: 80%;">public int __size__()</span>



**Specified By:**

[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)


---

### isEmpty

<span style="font-family: monospace; font-size: 80%;">public boolean __isEmpty__()</span>



**Specified By:**

[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)


---

### contains

<span style="font-family: monospace; font-size: 80%;">public boolean __contains__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>




---

### toArray

<span style="font-family: monospace; font-size: 80%;">public [Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html)[] __toArray__()</span>



**Specified By:**

[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)


---

### toArray

<span style="font-family: monospace; font-size: 80%;">public T[] __toArray__(T[] a)</span>




---

### iterator

<span style="font-family: monospace; font-size: 80%;">public [Iterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Iterator.html)<E> __iterator__()</span>



**Specified By:**

[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)


---

### add

<span style="font-family: monospace; font-size: 80%;">public boolean __add__(E e)</span>




---

### add

<span style="font-family: monospace; font-size: 80%;">public void __add__(int index, E element)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public boolean __remove__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>




---

### remove

<span style="font-family: monospace; font-size: 80%;">public E __remove__(int index)</span>




---

### set

<span style="font-family: monospace; font-size: 80%;">public E __set__(int index, E element)</span>




---

### addAll

<span style="font-family: monospace; font-size: 80%;">public boolean __addAll__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<? extends E> c)</span>




---

### addAll

<span style="font-family: monospace; font-size: 80%;">public boolean __addAll__(int index, [Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<? extends E> c)</span>




---

### setAll

<span style="font-family: monospace; font-size: 80%;">public void __setAll__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<? extends E> c)</span>




---

### removeAll

<span style="font-family: monospace; font-size: 80%;">public boolean __removeAll__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<?> c)</span>




---

### retainAll

<span style="font-family: monospace; font-size: 80%;">public boolean __retainAll__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<?> c)</span>




---

### clear

<span style="font-family: monospace; font-size: 80%;">public void __clear__()</span>



**Specified By:**

[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)


---

### get

<span style="font-family: monospace; font-size: 80%;">public E __get__(int index)</span>




---

### indexOf

<span style="font-family: monospace; font-size: 80%;">public int __indexOf__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>




---

### lastIndexOf

<span style="font-family: monospace; font-size: 80%;">public int __lastIndexOf__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>




---

### listIterator

<span style="font-family: monospace; font-size: 80%;">public [ListIterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ListIterator.html)<E> __listIterator__()</span>



**Specified By:**

[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)


---

### listIterator

<span style="font-family: monospace; font-size: 80%;">public [ListIterator](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ListIterator.html)<E> __listIterator__(int index)</span>




---

### subList

<span style="font-family: monospace; font-size: 80%;">public [List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)<E> __subList__(int fromIndex, int toIndex)</span>




---

### equals

<span style="font-family: monospace; font-size: 80%;">public boolean __equals__([Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html) o)</span>



**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#equals)


---

### hashCode

<span style="font-family: monospace; font-size: 80%;">public int __hashCode__()</span>



**Specified By:**

[List](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html)

**Overrides:**

[Object](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Object.html#hashcode)


---

### containsAll

<span style="font-family: monospace; font-size: 80%;">public boolean __containsAll__([Collection](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html)<?> c)</span>




---

