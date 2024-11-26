# Any callback

## Nice to solve before

- [Count down](../../integer/countdown/README.md)
- [Get odd](../../integer/getodd/README.md)

## Instructions

Given list of integers and callback implement a **recursive** function which returns `true` if simple value in the list
passed to callback returns `true`, otherwise return `false`.

[Challenge](Challenge.kt) | [Solution](Solution.kt) | [Tests](Tests.kt)

## Examples

Example 1

```kotlin
val callback:((Int) -> Boolean) = { it > 3 }
anyCallback(listOf(1, 2, 3, 4), callback) shouldBeEqualTo true
```

Example 2

```kotlin
val callback:((Int) -> Boolean) = { it > 3 }
anyCallback(listOf(1, 2, 3), callback) shouldBeEqualTo false
```

