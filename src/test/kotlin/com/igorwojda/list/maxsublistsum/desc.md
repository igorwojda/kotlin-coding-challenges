# Max sub-list sum

## Instructions


Given `list` of integers and integer `n` implement a function which calculates the maximum sum of `n` consecutive
elements in the `list` (sum of `n` digits next to another that have the largest sum). 

You can use helper `max` function to deal with Kotlin nullability.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
maxSubListSum(listOf<Int>(), 3) // null

maxSubListSum(listOf(4, 2, 7), 2) // 9

maxSubListSum(listOf(4, 2, 7, 5, 8, 9, 5, 1), 3) // 22
```

## Hints

<details>
<summary>Hint 1</summary>
Use sliding window
</details>