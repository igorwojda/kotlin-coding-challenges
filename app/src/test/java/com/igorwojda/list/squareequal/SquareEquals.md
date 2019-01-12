# List square compare

## Instructions

[Puzzle files](.)

Write a function, which accepts two lists of `Int`. The function should return `true` if every value in the first list has it's
corresponding value squared in the second list. The frequency of values must be the same.

## Examples

Example 1

```
squareEquals(listOf(2), listOf(4)) // true

squareEquals(listOf(1, 2, 3), listOf(9, 1, 4)) //true

squareEquals(listOf(1, 2, 3), listOf(9, 1, 7)) //false (does not have square of 3)

squareEquals(listOf(1, 2, 3), listOf(9, 1)) //false (does not have square of 2)

squareEquals(listOf(1, 2, 1), listOf(4, 1, 4)) //false (frequency must be the same)
```
