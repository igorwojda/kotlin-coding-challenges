# Max binary heap

## Instructions

Implement [Max binary heap](https://en.wikipedia.org/wiki/Heap_(data_structure)). In the `Max Binary Heap` each node may
have from `0` to `2` children. Parent nodes are always larger than child nodes, in other words all children are always
smaller than a parents. Heap always have to be filled from "left side" meaning that we can add children to new level
only if current level is full (each parent from previous level have two children).

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
// ----------Heap------------
//
//           9
//         /   \
//        7     6
//       / \   /
//      3   2 4
//
// --------------------------

val heap = MaxBinaryHeap<Int>()
heap.add(9)
heap.add(7)
heap.add(6)
heap.add(3)
heap.add(2)
heap.add(4)
```
