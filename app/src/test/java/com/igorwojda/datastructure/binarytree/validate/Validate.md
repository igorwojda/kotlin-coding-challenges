# Binary Search Tree (Validate)

## Nice to solve before
[Binary search tree](../insert/Insert.md)

## Instructions

[Puzzle files](.)

Given a node, validate the binary search tree, ensuring that every node's left hand child is less than the parent node's value, and that
every node's right hand child is greater than the parent

Example 1

```
val tree = Node(2)
tree.insert(10)
isValidSearchBinaryTree(tree) // true
```

## Hints

<details>
<summary>Hint 1</summary>
We should use recursion
</details>

<summary>Hint 2</summary>
We should also pass `min` and `max` to `isValidSearchBinaryTree` method
</details>
