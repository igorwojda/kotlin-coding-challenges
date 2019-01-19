# Binary Tree (validate)

## Nice to solve before
[Binary search tree](../insert/Insert.md)

## Instructions

Given a node, validate the binary search tree, ensuring that every node's left hand child is less than the parent node's value, and that
every node's right hand child is greater than the parent

Requirements that are always true for any given node in `Binary Search Tree`:
- parent node value is always greater then value of the left node and less than value of the right node
- left node value is always less then the value of parent node
- right node value is always greater than parent node value

[Puzzle](Validate.kt) | [Solution](ValidateSolution.kt)

## Examples

```
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
Pass `min` and `max` to `isValidSearchBinaryTree` method
</details>
