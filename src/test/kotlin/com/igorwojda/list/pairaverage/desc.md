# Find the pair with average

## Instructions

Given sorted list of integers and target average implement a function which determine if there is a pair of values in
the list where their average equals target average.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
hasAverage(listOf(), 1.0) // false

hasAverage(listOf(3, 4, 7, 9), 6.5) // true

hasAverage(listOf(3, 4, 7, 9), 3.0) // false

hasAverage(listOf(3, 5, 9, 7, 11, 14), 8.0) // true
```

## Hints

<details>
<summary>Hint 1</summary>
Use double pointer
</details>
