# Merge sort

## Instructions

Sort list of numbers from lowest number to greatest number using [merge sort](https://en.wikipedia.org/wiki/Merge_sort).

Algorithm:
1. Find middle point
2. Split unsorted list into two lists (using middle point)
3. Split lists until each list has single element (a list containing one element is considered sorted)
4. Merge sub-lists to produce new sorted sub-lists until there is only one sub-list remaining. This will be the sorted
   list.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

Sort `[5, 1, 4, 2]`

```kotlin
          [5, 1, 4, 2] Split
       [5, 1]      [4, 2] Split
     [5]    [1]   [4]    [2] All lists are sorted
       [1, 5]        [2,4] Merge
          [1, 2, 4, 5] Merge
```




