# Largest Elements

Implement a function that takes a list of integers and an integer `count` as input parameters. The purpose of the
function is to find the largest `count` numbers from the provided list.

If the size of the list is less than or equal to 'count', the function should return the original list.

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

Example 1

```kotlin
val list = listOf(5, 1, 3)
largestElements(list, 2) shouldBeEqualTo listOf(3, 5)
```

Example 2

```kotlin
val list = listOf(5, 1, 3)
largestElements(list, 3) shouldBeEqualTo listOf(5, 1, 3)
```

## Hints

<details>
<summary>Hint 1</summary>
Use `PriorityQueue` to store the largest elements.
</details>
