# Binary Search Tree (insert)

## Instructions

Having binary node (`data`, `left`, `right`) we need to implement two methods
[binary search tree](https://en.wikipedia.org/wiki/Binary_search_tree) methods:
- `insert` - accepts an argument `data`, then create an insert a new node at the
appropriate location in the tree.
- `contains` - accepts a `data` argument and return the `true` if node with given value already exists in the tree, otherwise returns `false`

Requirements that are always true for any given node in `Binary Search Tree`:
- parent node value is always greater then value of the left node and less than value of the right node
- left node value is always less then the value of parent node
- right node value is always greater than parent node value

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

Example 1

```kotlin
val tree = Node(1)
tree.insert(4)
tree.insert(2)

// Result
//
//    1
//   / \
//  2   4
```

Example 2

```kotlin
val tree = Node(1)
tree.insert(4)
tree.insert(2)
tree.contains(4) // true
tree.contains(99) // false
```

