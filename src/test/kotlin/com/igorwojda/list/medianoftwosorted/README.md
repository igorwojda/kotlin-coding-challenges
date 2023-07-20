# MMedia

## Instructions

Given two sorted lists `list1` and `list2` of integers return the median of the two sorted lists.

The overall run time complexity should be `O(log (m+n))`.

[Challenge](Challenge.kt) | [Solution](Solution.kt)

## Examples

```kotlin
medianOfSortedLists(listOf(1, 3), listOf(2)) // 2.0 (merged list = [1, 2, 3] and median is 2)

medianOfSortedLists(listOf(1, 2), listOf(3, 4)) // 2.5 (merged list = [1, 2, 3, 4] and median is (2 + 3) / 2 = 2.5)

medianOfSortedLists(listOf(1, 5, 7), listOf(2)) // 3.5 (merged list = [1, 2, 5, 7] and median is (2 + 5) / 2 = 3.5)
```
