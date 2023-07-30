# Advanced LRU Cache

## Nice to solve before

- [LRU Cache](../lru/README.md)

## Instructions

Design a data structure that enables the storage and retrieval of items via a key, subject to a specified capacity 
limit. In cases where the addition of new items exceeds this capacity, ensure that space is made available through the 
following sequence of operations:

- Firstly, discard items that have exceeded their validity period (`expiryTime` > `getSystemTimeForExpiry()`).
- If there are no items past their validity, identify the items with the earliest expiry time, and from those the items with the lowest priority rating, and from these remove 
the item that was least recently accessed or used.

To simplify expiry logic testing use the provided `Clock` to determine the current time in milliseconds using `clock.millis()`.

[Challenge](Challenge.kt) | [Solution](Solution.kt) | [Tests](Tests.kt)

## Examples

```kotlin
val cache = AdvancedLRUCache(2)
cache.put("A", 1, 5, Duration.ofMinutes(15))
cache.get("A") // 1
```

```kotlin
val cache = AdvancedLRUCache(2, Clock.fixed(...))  // testing clock, fixed at a moment in time
cache.put("A", 1, 5, Duration.ofMinutes(15))
cache.put("B", 2, 1, Duration.ofMinutes(15))
cache.put("C", 3, 10, Duration.ofMinutes(15))


cache.get("A") // 1
cache.get("B") // null - "B" was evicted due to lower priority.
cache.get("C") // 3
```

```kotlin
val cache = AdvancedLRUCache(100)
cache.put("A", 1, 1, Duration.ofMillis(1))
cache.put("B", 2, 1, Duration.ofMillis(1))

sleep(100)

cache.get("A") // null - "A" was evicted due to expiry. 
cache.get("B") // null - "B" was evicted due to expiry.
```
