# Generate all pairs

## Instructions

Given positive Int `n` implement a function which returns a list of containing pairs with all combinations of numbers
from `0` to `n`. Use Kotlin [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/) class.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

Example 1

```kotlin
getAllPairs(0) // [Pair(0, 0)]
```

Example 2

```kotlin
getAllPairs(1) // [Pair(0, 0), Pair(0, 1), Pair(1, 0), Pair(1, 1)]
```

Example 3

```kotlin
getAllPairs(2) // [Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 0), Pair(1, 1), Pair(1, 2), Pair(2, 0), Pair(2, 1), Pair(2, 2)]
```
