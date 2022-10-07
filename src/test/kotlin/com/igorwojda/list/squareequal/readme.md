# Square equals

## Instructions

Given two lists of integers implement a function which returns `true` if every value in the first list has it's
corresponding value squared in the second list. The frequency of values must be the same eg. if there are two values in
first list, two exactly two squared values must exist in second list.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
squareEquals(listOf(2), listOf(4)) // true

squareEquals(listOf(1, 2, 3), listOf(9, 1, 4)) // true

squareEquals(listOf(1, 2, 3), listOf(9, 1, 7)) // false (does not have square of 3)

squareEquals(listOf(1, 2, 3), listOf(9, 1)) // false (does not have square of 2)

squareEquals(listOf(1, 2, 1), listOf(4, 1, 4)) // false (frequency must be the same)
```

## Hints

<details>
<summary>Hint 1</summary>
Use frequency counter.
</details>
