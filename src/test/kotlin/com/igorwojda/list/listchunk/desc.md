# List chunking

## Instructions

Given a list and chunk size, divide the list into multiple sub lists where each sub-list is of length of chunk size.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]

chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]

chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]

chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]

chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
```

