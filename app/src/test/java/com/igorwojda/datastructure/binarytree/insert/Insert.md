# Binary Search Tree (Insert)

## Instructions

[Puzzle files](.)

Having binary node (`data`, `left`, `right`) we need to implement two methods
[binary search tree](https://en.wikipedia.org/wiki/Binary_search_tree) methods:
* `insert` - accepts an argument `data`, then create an insert a new node at the
appropriate location in the tree.
* `contains` - accepts a `data` argument and return the `true` if node with given value already exists in the tree, otherwise returns `false`

## Examples

Example 1

```
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

```
val tree = Node(1)
tree.insert(4)
tree.insert(2)
tree.contains(4) // true
tree.contains(99) // false
```

