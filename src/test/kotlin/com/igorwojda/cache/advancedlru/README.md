# Advanced LRU Cache

## Nice to solve before

- [LRU Cache](../lru/README.md)

## Instructions

Design a data structure that enables the storage and retrieval of items via a key, subject to a specified capacity 
limit. In cases where the addition of new items exceeds this capacity, ensure that space is made available through the 
following sequence of operations:

- Firstly, discard items that have exceeded their validity period (`expiryTime` > `getSystemTimeForExpiry()`).
- If there are no items past their validity, identify the items with the lowest priority rating and from these, remove 
the item that was least recently accessed or used.

To simplify expiry logic testing use provided `getSystemTime()` method (instead of `System.currentTimeMillis()`) that 
will return fixed system time in milliseconds.

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
val cache = AdvancedLRUCache(2)
cache.put("A", 1, 5, 5000)
cache.get("A") // 1
```

```kotlin
val cache = AdvancedLRUCache(2)
cache.put("A", 1, 1, 3000)
cache.put("B", 2, 3, 4000)
cache.put("C", 3, 4, 5000)


cache.get("A") // null - "A" was evicted due to lower priority.
cache.get("B") // 2
cache.get("C") // 3
```

```kotlin
val cache = AdvancedLRUCache(2)
cache.put("A", 1, 1, 500)
cache.put("B", 2, 3, 700)

cache.get("A") // null - "A" was evicted due to expiry. 
cache.get("B") // null - "B" was evicted due to expiry.
```
