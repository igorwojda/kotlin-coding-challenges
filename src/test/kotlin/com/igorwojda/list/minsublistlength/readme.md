# Min sub-list length

## Instructions

Given list of positive integers and positive integer `n` implement a function which finds minimum length of sub-list
where sum all elements is equal or greater than `n`

You can use helper `min` function to deal with Kotlin nullability.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
minSubListLength(listOf(1, 3, 4), 5) // 2 (smallest sub-list [3, 4])

minSubListLength(listOf(1, 2, 11, 5, 9, 4, 6), 22) // 3 (smallest sub-list [11, 5, 9])

minSubListLength(listOf(1, 20, 11, 5, 9, 4, 6), 200) // 0 (non of the integers sums up to 200)
```

## Hints

<details>
<summary>Hint 1</summary>
Use sliding window
</details>
