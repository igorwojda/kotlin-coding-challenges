# LRU Cache

## Instructions

Design a data structure that enables the storage and retrieval of items via a key, subject to a specified capacity
limit. In cases where the addition of new items exceeds this capacity, ensure that space is made available through
removing the item that was least recently accessed or used.

The overall run time complexity of each method should be `O(1)`.

[Challenge](Challenge.kt) | [Solution](Solution.kt) | [Tests](Tests.kt)

## Examples

```kotlin
val cache = LRUCache(3)
cache.size shouldBeEqualTo 0
```

```kotlin
val cache = LRUCache(2)
cache.put(1, 10)
cache.put(2, 20)
cache.put(3, 30)

cache.size shouldBeEqualTo 2
cache.get(1) shouldBeEqualTo null // value removed due to capacity limit
cache.get(2) shouldBeEqualTo 20
cache.get(3) shouldBeEqualTo 30
```
