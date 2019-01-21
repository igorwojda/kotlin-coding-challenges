# Linear search

## Instructions

Given list of strings and a string return index of th value in the list or `-1` if value was not found. 

[Puzzle](LinearSearch.kt) | [Solution](LinearSearchSolution.kt)

## Limitations

Don't use any Kotlin build-in methods that are directly returning index of element like `indexOf` / `lastIndexOf` /
`indexOfFirst` / `indexOfLast`, etc.

## Examples

```
getIndex(listOf("A", "B", "C"), "A") // 0

getIndex(listOf("A", "B", "C"), "B") // 1

getIndex(listOf("A", "B", "C"), "D") // -1
```
