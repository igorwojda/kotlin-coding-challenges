# Binary Tree (validate)

## Nice to solve before

[Binary search tree](../insert/Insert.md)

## Instructions

Given a node, validate the binary search tree, ensuring that every node's left hand child is less than the parent node's value, and that
every node's right hand child is greater than the parent

Requirements that are always true for any given node in `Binary Search Tree`:
- parent node value is always
  greater then value of *all* nodes in the left subtree  
  and less than value of *all* nodes in the right subtree
- left node value is also a valid  BST
- right node value is also a valid BST

[challenge](challenge.kt) | [solution](solution.kt)

## Examples

```kotlin
val tree = Node(2)
tree.insert(10)
isValidSearchBinaryTree(tree) // true
```

## Hints

<details>
<summary>Hint 1</summary>
Use recursion
</details>

<summary>Hint 2</summary>
<details>
Pass `min` and `max` to `isValidSearchBinaryTree` method
</details>
