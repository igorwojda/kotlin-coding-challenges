# Puzzle name

## Nice to solve before

## Instructions

[Puzzle files](.)

Having binary node (`data`, `left`, `right`) we need to implement two methods
[binary search tree](https://en.wikipedia.org/wiki/Binary_search_tree) methods:
* Implement the `insert` method for the `Node` class. Insert should accept an argument `data`, then create an insert a new node at the
appropriate location in the tree.
* Implement the `contains` method for the `Node` class. Contains should accept a `data` argument and
return the `Node` in the tree with the same value.

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

