# LRU Cache

## Instructions

Design a data structure that follows the constraints of a 
[Least Recently Used (LRU) cache](https://en.wikipedia.org/wiki/Cache_replacement_policies#LRU).

Implement the `LRUCache` class:

`LRUCache` (int capacity) Initialize the LRU cache with positive size `capacity` and two methods:
- `get(key: Int)` - return the value of the key if the key exists, otherwise return null.
- `put(key: Int, value: String)` - update the value of the key if the key exists, otherwise, add the key-value pair 
to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
- `remove(key: Int)` - remove the key from the cache if the key exists.
- `clear` - clears the cache.

The overall run time complexity of each methods should be `O(1)`.

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
lruCache.get(1) shouldBeEqualTo null
lruCache.get(2) shouldBeEqualTo 20
lruCache.get(3) shouldBeEqualTo 30
```
