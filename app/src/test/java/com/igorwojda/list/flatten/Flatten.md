# Puzzle name

## Nice to solve before

## Instructions

Given list containing items (integer, lists, sub-lists) implement **recursive** function which returns list with all
values flattened.

[Puzzle](Flatten.kt) | [Solution](FlattenSolution.kt)

Example 1

```
flatten(listOf(1)) // 1

flatten(listOf(1), listOf(listOf(2))) // 1, 2

flatten(listOf(1), listOf(listOf(2), listOf(listOf(3)))) // 1, 2, 3
```

## Hints

<details>
<summary>Hint 1</summary>
Use helper recursive function.
</details>