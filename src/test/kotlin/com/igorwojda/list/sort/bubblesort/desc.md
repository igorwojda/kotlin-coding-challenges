# Bubble sort

## Instructions

Sort list of numbers from lowest number to greatest number using
[bubble sort](https://en.wikipedia.org/wiki/Bubble_sort).

## Algorithm

Starting from the beginning of the list, compare every adjacent pair, swap their position if they are not in the right
order (the latter one is smaller than the former one). After each iteration, one less element (the last one)
is needed to be compared until there are no more elements left to be compared.

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

Sort `[5, 1, 4, 2, 8]`

**First Pass**
 ```kotlin
[5, 1, 4, 2, 8] -> [1, 5, 4, 2, 8] Compares the first two elements, and swap since 5 > 1
[1, 5, 4, 2, 8] -> [1, 4, 5, 2, 8] Swap since 5 > 4 
[1, 4, 5, 2, 8] -> [1, 4, 2, 5, 8] Swap since 5 > 2 
[1, 4, 2, 5, 8] -> [1, 4, 2, 5, 8] Now, since these elements are already in order (8 > 5), algorithm does not swap them
```

**Second Pass**
```kotlin
[1, 4, 2, 5, 8] -> [1, 4, 2, 5, 8] 
[1, 4, 2, 5, 8] -> [1, 2, 4, 5, 8] Swap since 4 > 2 
[1, 2, 4, 5, 8] -> [1, 2, 4, 5, 8] 
[1, 2, 4, 5, 8] -> [1, 2, 4, 5, 8]
```

Now, the list is already sorted, but the algorithm does not know if it is completed. The algorithm needs one whole pass
without any swap to know it is sorted

**Third Pass**
```kotlin
[1, 2, 4, 5, 8] -> [1, 2, 4, 5, 8] 
[1, 2, 4, 5, 8] -> [1, 2, 4, 5, 8] 
[1, 2, 4, 5, 8] -> [1, 2, 4, 5, 8] 
[1, 2, 4, 5, 8] -> [1, 2, 4, 5, 8]
```

