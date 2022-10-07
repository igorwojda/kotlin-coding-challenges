# Quick sort

## Instructions

Sort list of numbers from lowest number to greatest number using
[quick sort](https://en.wikipedia.org/wiki/Quicksort).

Algorithm: 
- Pick first element as pivot (pivot can be also last, random element but we explicitly always pick first element)
- Partition elements - start traversing from the leftmost element and if a smaller element is found, swap current
  element with `list[i]`. Keep track of index of smaller to elements at index (`pivotIndex`).
- Swap pivot with element at `pivotIndex`
- Recursively repeat the process for left partition (element on the left side of pivot) and right partition (element on
  the right side of the pivot)

[challenge](challenge.kt) | [solution](solution.kt)
