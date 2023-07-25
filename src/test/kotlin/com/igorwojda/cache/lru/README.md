# LRU Cache

## Instructions

Design a data structure that enables the storage and retrieval of items via a key, subject to a specified capacity
limit. In cases where the addition of new items exceeds this capacity, ensure that space is made available through
removing the item that was least recently accessed or used.

The overall run time complexity of each method should be `O(1)`.

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
val lruCache = LRUCache(3)
lruCache.size shouldBeEqualTo 0
```

```kotlin
val lruCache = LRUCache(2)
lruCache.put(1, 10)
lruCache.put(2, 20)
lruCache.put(3, 30)

lruCache.size shouldBeEqualTo 2
lruCache.get(1) shouldBeEqualTo null // value removed due to capacity limit
lruCache.get(2) shouldBeEqualTo 20
lruCache.get(3) shouldBeEqualTo 30
```
