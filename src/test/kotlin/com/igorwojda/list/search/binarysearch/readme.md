# Binary search

## Instructions

Given list of **sorted** elements and a element return index of that element in the list or `-1` if element was not
found. Use
[binary search](https://www.youtube.com/watch?v=T2sFYY-fT5o) algorithm.

[challenge](challenge.kt) | [solution](solution.kt)

## Algorithm
We ignore half of the elements after each loop.

- Compare element with the middle element.
- If element matches with middle element, we return the middle element index.
- Else If element is greater than the mid element, then element can only lie in right half sub-list after the mid
  element. So we deal only with right half.
- Else (x is smaller) deal only with the left half.

## Examples

Example 1

Search for `C` in `[A, B, C, D, E, F, G, H, I, J, K, L, M, O, P]`

```kotlin

[A, B, C, D, E, F, G, H, I, J, K, L, M, O, P] // (left = A, middle = H, right = P)
[A, B, C, D, E, F, G, H, I, J, K, L, M, O, P] // (left = A, middle = D, right = G)
[A, B, C, D, E, F, G, H, I, J, K, L, M, O, P] // (left = A, middle = C, right = F)
```

Example 2

```kotlin
binarySearch(listOf('A', 'B', 'C'), 'A') // 0

binarySearch(listOf('A', 'B', 'C'), 'B') // 1

binarySearch(listOf('A', 'B', 'C'), 'H') // -1
```
