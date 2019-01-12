# Merge sort

## Instructions

[Puzzle files](.)

Sort list of numbers from lowest number to greatest number using [merge sort](https://en.wikipedia.org/wiki/Merge_sort).

Algorithm:
1. Find middle point
2. Split unsorted list into two lists (using middle point)
3. Split lists until each list has single element (a list containing one element is considered sorted)
4. Merge sublists to produce new sorted sublists until there is only one sublist remaining. This will be the sorted list.


## Examples

Example 1

Sort `[5, 1, 4, 2]`

```
          [5, 1, 4, 2] Split
       [5, 1]      [4, 2] Split
     [5]    [1]   [4]    [2] All lists are sorted
       [1, 5]        [2,4] Merge
          [1, 5, 2, 4] Merge
    
```




