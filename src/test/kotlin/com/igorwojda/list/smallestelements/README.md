# Smallest Elements

## Instructions

Implement a function that takes a list of integers and an integer `count` as input parameters. The purpose of the 
function is to find the smallest `count` numbers from the provided list.

If the size of the list is less than or equal to 'count', the function should return the original list. 

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
smallestElements(listOf(5, 1, 3), 2) // [3, 1]

smallestElements(listOf(5, 1, 3), 3) // [5, 1, 3]
```

## Hints

<details>
<summary>Hint 1</summary>
Use `PriorityQueue` to store the smallest elements.
</details>
