# Selection sort

## Instructions

[Puzzle files](.)

Sort list of numbers from lowest number to greatest number using [selection sort](https://en.wikipedia.org/wiki/Selection_sort).

Algorithm: Sort an list by repeatedly finding the minimum element (ascending order) from unsorted part and putting it at the beginning of
the list.

## Examples

Example 1

Sort `[5, 1, 4, 2, 8]`

Find the minimum element in sublist 1...4 and place it at index 0
```
[5, 1, 4, 2, 8] -> [1, 5, 4, 2, 8] Swap since 1 < 5
```

Find the minimum element in sublist 2...4 and place it at index 1
```
[1, 5, 4, 2, 8] -> [1, 2, 4, 5, 8] Swap since 2 < 4
```

Find the minimum element in sublist 3...4 and place it at index 2
```
[1, 2, 4, 5, 8] -> [1, 2, 4, 5, 8] No swap since 5 < 8
```
